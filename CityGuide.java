import javax.swing.*;

public class CityGuide {

    public static void main(String[] args) {
        new LoginUI();
    }
}

// Login UI
class LoginUI {
    JFrame frame;
    JButton adminButton, userButton;

    LoginUI() {
        frame = new JFrame("Karur City Shops - Login");

        adminButton = new JButton("Admin Login");
        userButton = new JButton("User Login");

        adminButton.setBounds(100, 50, 150, 40);
        userButton.setBounds(100, 120, 150, 40);

        adminButton.addActionListener(e -> {
            frame.dispose();
            new AdminLogin();
        });

        userButton.addActionListener(e -> {
            frame.dispose();
            new UserInterface();
        });

        frame.add(adminButton);
        frame.add(userButton);

        frame.setLayout(null);
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// Admin Login UI
class AdminLogin {
    JFrame frame;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    AdminLogin() {
        frame = new JFrame("Admin Login");

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        usernameLabel.setBounds(50, 30, 100, 30);
        usernameField.setBounds(150, 30, 150, 30);
        passwordLabel.setBounds(50, 80, 100, 30);
        passwordField.setBounds(150, 80, 150, 30);
        loginButton.setBounds(150, 130, 100, 30);

        loginButton.addActionListener(e -> {
            frame.dispose();
            new AdminDashboard();
        });

        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        frame.setLayout(null);
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// Admin Dashboard
class AdminDashboard {
    JFrame frame;
    JTextField shopNameField, shopTypeField, locationField, openTimeField, closeTimeField;
    JButton addShopButton;

    AdminDashboard() {
        frame = new JFrame("Admin Dashboard");

        JLabel shopNameLabel = new JLabel("Shop Name:");
        JLabel shopTypeLabel = new JLabel("Shop Type:");
        JLabel locationLabel = new JLabel("Location:");
        JLabel openTimeLabel = new JLabel("Open Time:");
        JLabel closeTimeLabel = new JLabel("Close Time:");

        shopNameField = new JTextField();
        shopTypeField = new JTextField();
        locationField = new JTextField();
        openTimeField = new JTextField();
        closeTimeField = new JTextField();
        addShopButton = new JButton("Add Shop");

        shopNameLabel.setBounds(30, 30, 100, 30);
        shopTypeLabel.setBounds(30, 80, 100, 30);
        locationLabel.setBounds(30, 130, 100, 30);
        openTimeLabel.setBounds(30, 180, 100, 30);
        closeTimeLabel.setBounds(30, 230, 100, 30);

        shopNameField.setBounds(150, 30, 200, 30);
        shopTypeField.setBounds(150, 80, 200, 30);
        locationField.setBounds(150, 130, 200, 30);
        openTimeField.setBounds(150, 180, 200, 30);
        closeTimeField.setBounds(150, 230, 200, 30);
        addShopButton.setBounds(150, 280, 100, 30);

        frame.add(shopNameLabel);
        frame.add(shopTypeLabel);
        frame.add(locationLabel);
        frame.add(openTimeLabel);
        frame.add(closeTimeLabel);
        frame.add(shopNameField);
        frame.add(shopTypeField);
        frame.add(locationField);
        frame.add(openTimeField);
        frame.add(closeTimeField);
        frame.add(addShopButton);

        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// User Interface
class UserInterface {
    JFrame frame;

    UserInterface() {
        frame = new JFrame("Karur City Shops");
        String[] columns = {"Name", "Type", "Location", "Open Time", "Close Time", "Rating"};
        String[][] data = {
                {"SuperMart", "Grocery", "Main Street", "08:00 AM", "08:00 PM", "Not Rated"},
                {"TechZone", "Electronics", "Park Avenue", "10:00 AM", "08:00 PM", "Not Rated"},
                {"Coffee Corner", "Cafe", "Downtown", "07:00 AM", "07:00 PM", "Not Rated"},
                {"Glamour Boutique", "Clothing", "Highway Road", "09:00 AM", "09:00 PM", "Not Rated"},
                {"Book Nook", "Books", "River Road", "09:00 AM", "06:00 PM", "Not Rated"},
                {"Music Mania", "Music", "Elm Street", "09:00 AM", "08:00 PM", "Not Rated"},
        };

        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}