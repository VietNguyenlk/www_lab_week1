package vn.edu.iuh.fit.models;

import java.util.Date;

public class Logs {
    private String accLogin;
    private Date timeLogin;
    private Date timeLogout;
    private String ghiChu;

    public Logs(String accLogin, Date timeLogin, Date timeLogout, String ghiChu) {
        this.accLogin = accLogin;
        this.timeLogin = timeLogin;
        this.timeLogout = timeLogout;
        this.ghiChu = ghiChu;
    }

    public Logs() {
    }

    public String getAccLogin() {
        return accLogin;
    }

    public void setAccLogin(String accLogin) {
        this.accLogin = accLogin;
    }

    public Date getTimeLogin() {
        return timeLogin;
    }

    public void setTimeLogin(Date timeLogin) {
        this.timeLogin = timeLogin;
    }

    public Date getTimeLogout() {
        return timeLogout;
    }

    public void setTimeLogout(Date timeLogout) {
        this.timeLogout = timeLogout;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "Logs{" +
                "accLogin='" + accLogin + '\'' +
                ", timeLogin=" + timeLogin +
                ", timeLogout=" + timeLogout +
                ", ghiChu='" + ghiChu + '\'' +
                '}';
    }
}
