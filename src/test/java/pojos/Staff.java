package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Staff {

        private String firstName;
        private String lastName;
        private String birthDate;
        private String phone;
        private String gender;
        private String bloodGroup;
        private String adress;
        private String email;
        private String description;

    }


//Login : mehlikast
//First name : Mehlika
//Last name : Staff
//Email : mehlikast@gmail.com
//SSN : 100-20-1902
//Language : English
//Profiles : ROLE_STAFF
