package exploratory.socialnetwork;

import java.util.ArrayList;

public class SocialNetwork {
    private ArrayList<User> users;
    private ArrayList<Page> pages;

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public SocialNetwork() {
        this.users = new ArrayList<>();
        this.pages = new ArrayList<>();
    }
}
