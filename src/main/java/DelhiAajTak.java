public class DelhiAajTak implements IObserver{
    @Override
    public void onUpdate(News news) {
        System.out.println("Delhi Daily News: "+ news.news);
    }

    @Override
    public NewsType getNewsType() {
        return NewsType.DELHI;
    }
}
