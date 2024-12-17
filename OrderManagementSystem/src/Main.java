import business.UserController;
import core.Database;
import core.Helper;
import entity.User;
import view.DashboardUI;
import view.LoginUI;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws SQLException {
        LoginUI loginUI = new LoginUI();

        //Helper.setTheme();
        //UserController userController = new UserController();
        //User user =userController.findByLogin("obk@asd.com","345");
        //DashboardUI dashboardUI = new DashboardUI(user);
    }
}