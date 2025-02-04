package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
      //  Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Marina", "Zolotova", (byte) 27);
        userDao.saveUser("Maxim", "Chernov", (byte) 25);
        userDao.saveUser("Elena", "Ivanova", (byte) 31);
        userDao.saveUser("Stepan", "Razin", (byte) 38);

        userDao.removeUserById(2);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
