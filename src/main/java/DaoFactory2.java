public class DaoFactory2 {
    private static Users usersDao;

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new ListUserDao();
        }
        return usersDao;
    }
}
