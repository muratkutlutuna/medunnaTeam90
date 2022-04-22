package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//    "firstName":"Georg",
//    "lastName":"Rots",
//    "ssn":"600-16-5009",
//    "email":"gregoicasdkens@gmail.com",
//    "phone":"1231234004",
//    "startDate":"20220606",
//    "status":"UNAPPROVED",
//    "endDate":"20220707"
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentAdminStaff {
    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private String phone;
    private String startDate;



}
