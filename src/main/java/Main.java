import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");

        DelhiAajTak delhiAajTak = new DelhiAajTak();
        BizAajTak bizAajTak =new BizAajTak();
        AssamAajTak assamAajTak= new AssamAajTak();

        CentralAajTak centralAajTak = new CentralAajTak();

        long start = System.currentTimeMillis();
        TimeUnit.SECONDS.sleep(1);
        centralAajTak.register(delhiAajTak);
        centralAajTak.register(bizAajTak);
        centralAajTak.register(assamAajTak);

        long end = System.currentTimeMillis();
        long executionTime = end - start;
        System.out.println("execution time for register method: "+executionTime + "ms");

        News delhiNews = new News();
        delhiNews.news = "Delhi Air Pollution Reduced";
        delhiNews.newsType = NewsType.DELHI;

        News delhiNews1 = new News();
        delhiNews1.news = "In Delhi Vaccination Started ";
        delhiNews1.newsType = NewsType.DELHI;

        News assamNews = new News();
        assamNews.news = "Assam Flooded by Heavy Rains";
        assamNews.newsType = NewsType.ASSAM;

        News bizzNews = new News();
        bizzNews.news = "Business is Increased";
        bizzNews.newsType = NewsType.BIZ;

        centralAajTak.update(delhiNews);
        centralAajTak.update(assamNews);
        centralAajTak.update(bizzNews);
        centralAajTak.unregister(delhiAajTak);
        centralAajTak.update(delhiNews1);
    }
}
