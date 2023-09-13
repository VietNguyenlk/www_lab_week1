package vn.edu.iuh.fit.models;

public class Account {
    private int id;
    private String fullName;
    private int passWord;
    private String email;
    private int phone;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
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

    public Account(int id, String fullName, int passWord, String email, int phone, int status) {
        this.id = id;
        this.fullName = fullName;
        this.passWord = passWord;
        this.email = email;
        this.phone = phone;
        this.status = status;
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