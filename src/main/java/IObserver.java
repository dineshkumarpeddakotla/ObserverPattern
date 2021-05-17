public interface IObserver {
    void onUpdate(News news);
    NewsType getNewsType();
}
