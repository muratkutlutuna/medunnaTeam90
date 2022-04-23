package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)


public class Test {

  /*  {
        "createdBy": "medunnaadmin",
            "createdDate": "2022-03-16T22:55:47.152296Z",
            "id": 30198,
            "name": "Na111",
            "description": "",
            "price": 50.00,
            "defaultValMin": "66",
            "defaultValMax": "100"
    }
   */
    private String createdBy;
    private String createdDate;
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private String defaultValMin;
    private String defaultValMax;


}
