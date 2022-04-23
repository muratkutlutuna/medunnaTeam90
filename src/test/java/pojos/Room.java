package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class Room {
  /*  {
        "createdBy": "aina",
            "createdDate": "2022-03-21T19:09:28.378528Z",
            "id": null,
            "roomNumber": 14725,
            "roomType": "TWIN",
            "status": true,
            "price": 120.00,
            "description": "with TV"
    }*/

    private String createdBy;
    private String createdDate;
    private Integer id;
    private Integer roomNumber;
    private String roomType;
    private Boolean status;
    private Double price;
    private String description;


}
