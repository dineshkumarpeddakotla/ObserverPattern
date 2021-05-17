public class News {
    NewsType newsType;
    public String news;

    @Override
    public String toString() {
        return "News{" +
                "newsType=" + newsType +
                ", news='" + news + '\'' +
                '}';
    }
}

enum NewsType {
    DELHI, BIZ,ASSAM
}
