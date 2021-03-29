import java.util.ArrayList;
import java.util.List;

public class ListUserDao implements Users {
    private List<User> users;

    public List<User> all() {
        if (users == null) {
            users = generateUsers();
        }
        return users;
    }

    private List<User> generateUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(
                1,
                "kuwan.barnes",
                "kuwan.barne@gmail.com",
                "kuwan",
                "barnes"
        ));

        return users;
    }
}
