package pojos;

public class Appointment_TC005 {
    private String firstname;
    private String lastname;
    private int ssn;
    private String email;
    private int phone;
    private int date;

    public Appointment_TC005() {
    }

    public Appointment_TC005(String firstname, String lastname, int ssn, String email, int phone, int date) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.email = email;
        this.phone = phone;
        this.date = date;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment_TC005{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn=" + ssn +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", date=" + date +
                '}';
    }
}
