package vn.edu.iuh.fit.models;

public class Account {
    private String id;
    private String fullName;
    private String passWord;
    private String email;
    private int phone;
    private int status;

    public String  getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String  passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Account(String  id, String fullName, String  passWord, String email, int phone, int status) {
        this.id = id;
        this.fullName = fullName;
        this.passWord = passWord;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }

    public Account(String fullName, String passWord) {
        this.fullName = fullName;
        this.passWord = passWord;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", passWord=" + passWord +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", status=" + status +
                '}';
    }
}
