package exploratory.socialnetwork;

public class Page {
    private String name;
    private int numberOfLikes;
    private PageTopic pageTopic;

    public String getName() {
        return name;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public PageTopic getPageTopic() {
        return pageTopic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public void setPageTopic(PageTopic pageTopic) {
        this.pageTopic = pageTopic;
    }

    public Page(String name, int numberOfLikes, PageTopic pageTopic) {
        this.name = name;
        this.numberOfLikes = numberOfLikes;
        this.pageTopic = pageTopic;
    }
}
