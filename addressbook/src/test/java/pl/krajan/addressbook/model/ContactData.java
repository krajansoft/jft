package pl.krajan.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String nick;
    private final String mobile;
    private final String email;

    public ContactData(String firstname, String lastname, String nick, String mobile, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nick = nick;
        this.mobile = mobile;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNick() {
        return nick;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}
