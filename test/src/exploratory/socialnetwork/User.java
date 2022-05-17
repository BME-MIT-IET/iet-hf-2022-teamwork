package exploratory.socialnetwork;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private String middleName;
    private ArrayList<User> friends;
    private ArrayList<Page> likes;

    public User(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        friends = new ArrayList<>();
        likes = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public ArrayList<Page> getLikes() {
        return likes;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }

    public void setLikes(ArrayList<Page> likes) {
        this.likes = likes;
    }
}
