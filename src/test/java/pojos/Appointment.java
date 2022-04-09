package pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Appointment {
    private String FirstName;
    private String LastName;
    private String SSN;
    private String Email;
    private String Phone;
    private String Date;

    public Appointment(){

    }
    public Appointment(String FirstName, String LastName, String SSN, String Email, String Phone, String Date) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.SSN = SSN;
        this.Email = Email;
        this.Phone = Phone;
        this.Date = Date;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", SSN='" + SSN + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
