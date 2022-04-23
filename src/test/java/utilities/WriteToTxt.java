package utilities;

import pojos.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class WriteToTxt {

//    public static void saveRegistrantData(Registrant registrant, String fileName){
//
//        try {
//
//            FileWriter fileWriter = new FileWriter(fileName, true);
//            //src/resource/feature/testdata/PatientData
//
//            BufferedWriter writer = new BufferedWriter(fileWriter);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void saveRegistrantData(Registrant registrant){

        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("registrantFile"), true);
            //src/resource/feature/testdata/PatientData

            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(registrant.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveMessagesData(Messages messages){

        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("messagesFile"), true);


            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(messages.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveCountriesData(Country country){

        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("countryFile"), true);


            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(country.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void saveRoomData(Room room){

        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("roomFile"), true);
            //src/resource/feature/testdata/RoomData

            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(room.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveAppointData(Appointment appointment){
appointment.getPhysician().setImage(appointment.getPhysician().getImage().substring(0,9));


        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointmentFile"), true);
            //src/resource/feature/testdata/PatientData


            BufferedWriter writer = new BufferedWriter(fileWriter);
          //            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(appointment.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
      public static void saveAppointmentData(Appointment appointment){
appointment.getPhysician().setImage(appointment.getPhysician().getImage().substring(0,9));


        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointmentFile"), true);
            //src/resource/feature/testdata/PatientData


            BufferedWriter writer = new BufferedWriter(fileWriter);
          //            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(appointment.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void saveAppointmentData(AppointmentAdminStaff appointmentCreate){

        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointmentFile"), true);
            //src/resource/feature/testdata/PatientData

            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(appointmentCreate.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveAppointmentData(AppointmentRequest appointmentCreate){

        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointmentFile"), true);
            //src/resource/feature/testdata/PatientData

            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(appointmentCreate.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveRegistrantDataDB(Map registrantMap){

        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("registrantFileDB"), true);
            //src/resource/feature/testdata/PatientData

            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(registrantMap.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

    public static void saveAppointmentDataBase(List<Object> DateIds){

        try{

            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointmentDataBase"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (Object eachDate: DateIds)
                writer.append(eachDate+"\n");


            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }

  /*
    public static void saveRegistrantData(Registrant registrant){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_registrant_data"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(registrant+"\n");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void saveAppointData(Appointment appointment){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment+"\n");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void saveAppointData(Appointments appointment){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment+"\n");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void saveApiAppointmentData(Appointments appointment) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_appointment_data"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment + "\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveAppointmentCreation(AppointmentGet appointmentGet){
        try{
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_creation_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointmentGet+"\n");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void saveTestItemData(TestItem testItem) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_test_itmes_data"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(testItem + "\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveRoomData(String roomNumber, int price, String createdDate){
        try{
            FileWriter fileWriter = new FileWriter("./src/test/resources/testdata/RoomData.txt", false);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append("Room "+roomNumber+"\n");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
     */

}