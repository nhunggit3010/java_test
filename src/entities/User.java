package entities;

public class User<username> {
    private static int autoId;
    private int id;
    private  String username;
    private String password;
    private String email;
    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9_.+-]{3,16}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]+$";
    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9_.+-]{7,15}$";

    public User(String username, String password, String email) {
        this.id = ++autoId;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public User( String username, String password) {
        this.id = ++autoId;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public static String getUsernamePattern() {
//        return USERNAME_PATTERN;
//    }

    public static String getEmailPattern() {
        return EMAIL_PATTERN;
    }

    public static String getPasswordPattern() {
        return PASSWORD_PATTERN;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
