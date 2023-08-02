package in.stackroute.springrestjpacodingchallenge.domain;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="userid")
    private int userId;
    @Column(name="username")
    private String userName;
    @Column(name="password")
    private int password;

    public User() {
    }

    public User(int userId, String userName, int password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
