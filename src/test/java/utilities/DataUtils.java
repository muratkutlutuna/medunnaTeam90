package utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataUtils {
    public static void main(String[] args){
        System.out.println(getDate());
    }

    public static String getDate(){
        LocalDateTime dateObj =LocalDateTime.now();
        DateTimeFormatter formatDate =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return dateObj.format(formatDate);
    }
}
