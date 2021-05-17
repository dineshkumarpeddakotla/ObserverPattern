public class AssamAajTak implements IObserver{

    @Override
    public void onUpdate(News news) {
        System.out.println("Assam Daily News: "+ news.news);
    }

    @Override
    public NewsType getNewsType() {
        return NewsType.ASSAM;
    }
}
