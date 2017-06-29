package pl.krajan.model;

public class ContactData {
    private int id;
    private final String firstname;
    private final String lastname;
    private final String nickname;
    private final String company;
    private final String mobile;
    private final String email;
    private final String address2;
    private String group;



    public ContactData(String firstname, String lastname, String nickname, String company, String mobile, String email, String address2, String group) {
        this.id = Integer.MAX_VALUE;
        this.firstname = firstname;

        this.lastname = lastname;
        this.nickname = nickname;
        this.company = company;
        this.mobile = mobile;
        this.email = email;
        this.address2 = address2;
        this.group = group;
    }
    public ContactData(int id, String firstname, String lastname, String nickname, String company, String mobile, String email, String address2, String group) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.company = company;
        this.mobile = mobile;
        this.email = email;
        this.address2 = address2;
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress2() {
        return address2;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        return lastname != null ? lastname.equals(that.lastname) : that.lastname == null;
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

}
