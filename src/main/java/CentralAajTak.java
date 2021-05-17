import java.util.ArrayList;
import java.util.List;

public class CentralAajTak {
    List<IObserver> observerList = new ArrayList<>();

    public void register(IObserver observer) {
        observerList.add(observer);
    }

    public void unregister(IObserver observer) {
        observerList.remove(observer);
    }

    public void update(News news) {
        observerList.forEach(observer -> {
                             if (observer.getNewsType() == news.newsType) observer.onUpdate(news); });
    }
}
