package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class Appointment {

    private String createdBy;
    private String createdDate;
    private Integer id;
    private String startDate;
    private String dateTime;
    private String endDate;
    private String status;
    private String anamnesis;
    private String treatment;
    private String diagnosis;
    private String prescription;
    private String description;
    private Physician physician;
    private Patient patient;
    private Test []ctests;




    //{
    //        "createdBy": "anonymousUser",
    //        "createdDate": "2021-12-21T22:33:06.907662Z",
    //        "id": 3403,
    //        "startDate": "2021-12-22T17:00:00Z",
    //        "endDate": "2021-12-22T18:00:00Z",
    //        "status": "UNAPPROVED",
    //        "anamnesis": null,
    //        "treatment": null,
    //        "diagnosis": null,
    //        "prescription": "",
    //        "description": "cfgvhbjn",
    //        "physician": {
    //            "createdBy": "oscarlebsack",
    //            "createdDate": "2022-03-01T13:26:00.734890Z",
    //            "id": 10501,
    //            "firstName": "Arif",
    //            "lastName": "Canpol",
    //            "birthDate": "1991-01-31T23:00:00Z",
    //            "phone": "5354334312",
    //            "gender": "MALE",
    //            "bloodGroup": "Apositive",
    //            "adress": "",
    //            "description": "",
    //            "user": {
    //                "createdBy": "anonymousUser",
    //                "createdDate": "2022-03-01T13:19:47.400256Z",
    //                "id": 10097,
    //                "login": "arifcanpol135",
    //                "firstName": "Arif",
    //                "lastName": "Canpol",
    //                "email": "canpolska@gmail.co",
    //                "activated": true,
    //                "langKey": "en",
    //                "imageUrl": null,
    //                "resetDate": null,
    //                "ssn": "331-13-1131"
    //            },
    //            "speciality": "ALLERGY_IMMUNOLOGY",
    //            "country": null,
    //            "cstate": null,
    //            "examFee": 200.00,
    //            "image": "",
    //            "imageContentType": null
    //        },
    //        "patient":
    //        },
    //        "ctests": null
    //    },


}

