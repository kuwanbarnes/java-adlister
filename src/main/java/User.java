public class User {


    private long userId;

    private String userName;

    private String userEmail;

    private String userFirstName;
    private String userLastName;
    public User( long userId, String userName,String userEmail, String userFirstName, String userLastName) {

        this.userId = userId;
        this.userName = userName;
        this.userEmail= userEmail;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
}


