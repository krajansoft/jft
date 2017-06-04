package pl.krajan.addressbook;

public class Logownie {
    private final String username;
    private final String password;

    public Logownie(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
