package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;


//Map<String, String> reconstructedUtilMap = Arrays.stream(utilMapString.split(","))
//            .map(s -> s.split("="))
//            .collect(Collectors.toMap(s -> s[0], s -> s[1]));
public class ReadText {
    private static String filePath = "src/test/resources/testData/RegistrantData.txt";

    public static Map<String,Object> readRegistrantInfoBySsnToMap(String ssn) {

        Map<String, Object> registrantMap = new HashMap<String,Object>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line,expectedSsn = "";
            do {
                sb.append(System.lineSeparator());
                line = br.readLine();
                expectedSsn = line.substring((line.indexOf("ssn=") + 4), (line.indexOf("ssn=") + 4 + 11));
            }while (!expectedSsn.equals(ssn)&&line!=null);
            line = line.substring(11,line.length()-2);
            registrantMap = Arrays.stream(line.split(","))
                    .map(t -> t.split("="))
                    .collect(Collectors.toMap(t -> t[0], t -> t[1]));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return registrantMap;
    }

    public static Map<String,String> readAllRegistrant() {

        Map<String, String> registrantMap = new LinkedHashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = "";
            while (line!=null) {
                sb.append(System.lineSeparator());
                line = br.readLine();
                registrantMap.put(line.substring(line.indexOf(", firstName=")+12,line.indexOf(", lastName"))+" "
                        +line.substring(line.indexOf(", lastName=")+11,line.indexOf(", login="))
                        ,line.substring(10,line.length()-1));
            }

        } catch (NullPointerException e) {

        }catch(Exception e){
            e.printStackTrace();
        }
        return registrantMap;
    }
}
