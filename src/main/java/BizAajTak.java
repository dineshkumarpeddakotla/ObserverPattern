public class BizAajTak implements IObserver{

    @Override
    public void onUpdate(News news) {
        System.out.println("Today BizAajTak News: " + news.news);
    }

    @Override
    public NewsType getNewsType() {
        return NewsType.BIZ;
    }
}
