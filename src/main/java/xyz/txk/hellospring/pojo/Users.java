package xyz.txk.hellospring.pojo;

public class Users {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user=" + user +
                '}';
    }
}
