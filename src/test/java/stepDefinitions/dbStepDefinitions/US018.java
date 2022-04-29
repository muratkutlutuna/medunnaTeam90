package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.junit.Test;
import utilities.DBUtils;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utilities.DatabaseUtility.getColumnData;

public class US018 {

    @Test
    public void test() {


        String url = "jdbc:postgresql://medunna.com:5432/medunna_db";
        String username = "medunnadb_user";
        String password = "Medunnadb_@129";

        DatabaseUtility.createConnection();

        String query = "select * from physician";
        System.out.println(DatabaseUtility.getColumnNames(query) + "\n");

        System.out.println("=====================ID LIST==================");
        List<Object> idList = getColumnData(query, "id");
        System.out.println(idList + "\n");
        String fileName1 = "src/test/resources/testData/PhyisicianId.txt";
        //WriteToTxt.savePhysicianIds(fileName1, idList);


        List<Object> actualPhysicianIDs = ReadTxt.returnPhysicianIDsList(fileName1);
        List<Object> expectedPhysicianIDs = new ArrayList<>();
        expectedPhysicianIDs.add(42991);

        Assert.assertTrue("IDLER UYUSMUYOR", actualPhysicianIDs.containsAll(expectedPhysicianIDs));


        System.out.println("=====================PHYSiCiAN LIST==================");
        List<Object> nameList = getColumnData(query, "first_name");
        System.out.println(nameList + "\n");
        String fileName2 = "src/test/resources/testData/PhyisicianName.txt";
        //  WriteToTxt.savePhysicianName(fileName2, nameList);


        List<String> actualPhysicianNames = ReadTxt.returnPhysicianName(fileName2);
        List<String> expectedPhysicianNames = new ArrayList<>();
        expectedPhysicianIDs.add("Cemile");

        Assert.assertTrue("iSiMLER UYUSMUYOR", actualPhysicianNames.containsAll(expectedPhysicianNames));


    }

    Map<String, Object> registrantMap = new HashMap<String, Object>();

    @Given("MKT user creates a connection with db")
    public void mkt_user_creates_a_connection_with_db() {
        DBUtils.createConnection();
    }

    @Given("MKT user sends the query to db and gets the user data with ssn number {string}")
    public void mkt_user_sends_the_query_to_db_and_gets_the_user_data_with_ssn_number(String ssn) {
        String query = "select * from jhi_user where ssn=\'" + ssn + "\'";
        registrantMap.putAll(DBUtils.getRowMap(query));
        System.out.println("registrantMap = " + registrantMap);
    }
}



