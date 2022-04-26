package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentRequest {
    //"appoSpeciality": "string",
    //  "birthDate": "2022-04-16T12:52:30.875Z",
    //  "email": "addsdsds@gmail.com",
    //  "firstName": "ar",
    //  "gender": "fd",
    //  "lastName": "hgh",
    //  "phone": "5748394343",
    //  "snumber": "322",
    //  "ssn": "384-34-3254",
    //  "startDate": "2022-04-16"
    //

    private String appoSpeciality;
    private String birthDate;
    private String email;
    private String firstName;
    private String gender;
    private String lastName;
    private String phone;
    private String snumber;
    private String ssn;
    private String startDate;

}
