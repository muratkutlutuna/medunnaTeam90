package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.FatihPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.awt.dnd.DragGestureEvent;
import java.util.ArrayList;
import java.util.List;

public class US027 {

    FatihPage fP=new FatihPage();

    @Given("FY Admin navigates to Medunna home page")
    public void fy_admin_navigates_to_medunna_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }
    @Given("FY Admin clicks on human icon")
    public void fy_admin_clicks_on_human_icon() {
        fP.accountmenu.click();
        Driver.wait(2);
    }
    @Given("FY Admin clicks on sign in button under human icon at homepage")
    public void fy_admin_clicks_on_sign_in_button_under_human_icon_at_homepage() {
        fP.homePageSignIn.click();
        Driver.wait(2);
    }
    @Given("FY Admin sends username {string} and password {string} in sign in page")
    public void fy_admin_sends_username_and_password_in_sign_in_page(String username, String password) {
        Driver.waitAndSendText(fP.doctorUserName,username);
        Driver.waitAndSendText(fP.doctorPassword,password);
    }
    @Given("FY Admin clicks on sign in button in sign in page")
    public void fy_admin_clicks_on_sign_in_button_in_sign_in_page() {
        fP.doctorSignInButton.click();
        Driver.wait(2);
    }
    @Then("FY Admin verifies the admin page is displayed")
    public void fy_admin_verifies_the_admin_page_is_displayed() {
        Assert.assertTrue(fP.adminPageAdministrationDropDown.isDisplayed());
    }
    @Then("FY Admin clicks on items and titles dropdown")
    public void fy_admin_clicks_on_items_and_titles_dropdown() {
        fP.adminPageItemsAndTitlesDropDown.click();
        Driver.wait(1);
    }
    @Given("FY Admin clicks on messages button")
    public void fy_admin_clicks_on_messages_button() {
        fP.adminItemsAndTitlesDropdownMessagesButton.click();
        Driver.wait(2);
    }
    @Then("FY Admin verifies the messages page is displayed")
    public void fy_admin_verifies_the_messages_page_is_displayed() {
        Driver.wait(1);
        Assert.assertTrue(fP.messagePageMessagesText.isDisplayed());
        Driver.wait(2);
    }
    @Then("FY Admin verifies all names, emails and messages are displayed")
    public void fy_admin_verifies_all_names_emails_and_messages_are_displayed() {
        int size=fP.allMessagesInfo.size();
        System.out.println("size = " + size);
        List<WebElement> allDataCell= fP.allMessagesInfo;
        List <String> data= new ArrayList<>();
        int cellNum=1;

        List<WebElement>  allRows= Driver.getDriver().findElements(By.xpath("//table//tbody//tr"));


        for (WebElement eachCellData: allRows) {
            data.add(eachCellData.getText());
          System.out.println(cellNum+":" + eachCellData.getText().replace("View\n" +
                  "Edit\n" +
                  "Delete",""));
            cellNum++;
        }


        List<WebElement> idList= fP.messagesIdColumn;
        int idSize= idList.size();
        List<String> arrIdList=new ArrayList<>();
        for (WebElement eachIdCell: idList) {
            arrIdList.add(eachIdCell.getText());
        }
        System.out.println("arrIdList = " + arrIdList);

        List<WebElement> nameList= fP.messagesNameColumn;
        int nameSize= nameList.size();
        List<String> arrNameList=new ArrayList<>();
        for (WebElement eachNameCell: nameList) {
            arrNameList.add(eachNameCell.getText());
        }
        System.out.println("arrNameList = " + arrNameList);

        List<WebElement> emailList= fP.messagesEmailColumn;
        int emailSize= emailList.size();
        List<String> arrEmailList=new ArrayList<>();
        for (WebElement eachEmailCell: emailList) {
            arrEmailList.add(eachEmailCell.getText());
        }
        System.out.println("arrEmailList = " + arrEmailList);

        List<WebElement> subjectList= fP.messagesSubjectColumn;
        int subjectSize= subjectList.size();
        List<String> arrSubjectList=new ArrayList<>();
        for (WebElement eachSubjectCell: subjectList) {
            arrSubjectList.add(eachSubjectCell.getText());
        }
        System.out.println("arrSubjectList = " + arrSubjectList);

        List<WebElement> messageList= fP.messagesMessageColumn;
        int messageSize= messageList.size();
        List<String> arrMessageList=new ArrayList<>();
        for (WebElement eachMessageCell: messageList) {
          arrMessageList.add(eachMessageCell.getText());
        }
        System.out.println("arrMessageList = " + arrMessageList);

        Assert.assertTrue(idSize==nameSize&&nameSize==emailSize&&emailSize==subjectSize&&subjectSize==messageSize);

    }



    @Then("FY Admin clicks on the create a new message button")
    public void fy_admin_clicks_on_the_create_a_new_message_button() {
        Driver.waitAndClick(fP.creatingANewMessage,2);
    }
    @Then("FY Admin verifies the Create or edit a Message page is displayed")
    public void fy_admin_verifies_the_create_or_edit_a_message_page_is_displayed() {
        Assert.assertTrue(fP.createOrEditAMessagePageText.isDisplayed());
    }
    @Then("FY Admin enters name {string} into name text box")
    public void fy_admin_enters_name_into_name_text_box(String name) {
        Driver.waitAndSendText(fP.messageNameTextBox,name);
    }
    @Then("FY Admin enters email {string} into email text box")
    public void fy_admin_enters_email_into_email_text_box(String email) {
        Driver.waitAndSendText(fP.messageEmailTextBox,email);
    }
    @Then("FY Admin enters subject {string} into subject text box")
    public void fy_admin_enters_subject_into_subject_text_box(String subject) {
        Driver.waitAndSendText(fP.messageSubjectTextBox,subject);    }
    @Then("FY Admin enters message {string} into message text box")
    public void fy_admin_enters_message_into_message_text_box(String message) {
        Driver.waitAndSendText(fP.messageMessageTextBox,message);
    }
    @Then("FY Admin clicks on save button in create or edit a message page")
    public void fy_admin_clicks_on_save_button_in_create_or_edit_a_message_page() {
        Driver.waitAndClick(fP.createOrEditAMessagePageSaveButton);
    }
    @Then("FY Admin verifies successfully created message is displayed")
    public void fy_admin_verifies_successfully_created_message_is_displayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.successfullyCreatedANewMessageText.isDisplayed());
    }






    @Then("FY Admin clicks on the edit button in the message page")
    public void fy_admin_clicks_on_the_edit_button_in_the_message_page() {
        Driver.waitAndClick(fP.messagePageFirstEditButton);
    }

    @Then("FY Admin updates the name {string} into name text box")
    public void fy_admin_updates_the_name_into_name_text_box(String name) {
        Driver.wait(2);
        fP.messageNameTextBox.clear();
        Driver.waitAndSendText(fP.messageNameTextBox,name,1);
    }

    @Then("FY Admin updates the email {string} into email text box")
    public void fy_admin_updates_the_email_into_email_text_box(String email) {
        fP.messageEmailTextBox.clear();
        Driver.waitAndSendText(fP.messageEmailTextBox,email,1);
    }

    @Then("FY Admin updates the subject {string} into subject text box")
    public void fy_admin_updates_the_subject_into_subject_text_box(String subject) {
        fP.messageSubjectTextBox.clear();
        Driver.waitAndSendText(fP.messageSubjectTextBox,subject,1);
    }

    @Then("FY Admin updates the message {string} into message text box")
    public void fy_admin_updates_the_message_into_message_text_box(String message) {
        fP.messageMessageTextBox.clear();
        Driver.waitAndSendText(fP.messageMessageTextBox,message,1);
    }

    @Then("FY Admin verifies successfully updated message is displayed")
    public void fy_admin_verifies_successfully_updated_message_is_displayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.succesfullyUpdatedMessageText.isDisplayed());
    }



    @Then("FY Admin verifies failure message is displayed")
    public void fyAdminVerifiesFailureMessageIsDisplayed() {
        Driver.wait(3);
        Assert.assertFalse(fP.succesfullyUpdatedMessageText.isDisplayed());
    }


    @And("FY Admin clicks on the delete button in the message page")
    public void fyAdminClicksOnTheDeleteButtonInTheMessagePage() {
        Driver.waitAndClick(fP.messagePageFirstDeleteButton);
    }

    @Then("FY Admin verifies the delete confirmation toast container is displayed")
    public void fyAdminVerifiesTheDeleteConfirmationToastContainerIsDisplayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.deleteConfirmationToastContainerText.isDisplayed());
    }

    @And("FY Admin clicks the delete button in the toast container")
    public void fyAdminClicksTheDeleteButtonInTheToastContainer() {
        Driver.waitAndClick(fP.deleteConfirmationToastContainerDeleteButton,1);
    }

    @Then("FY Admin verifies successfully deleted message is displayed")
    public void fyAdminVerifiesSuccessfullyDeletedMessageIsDisplayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.succesfullyDeletedMessageText.isDisplayed());
    }

    @Then("FY Admin verifies the warning message under name text box is displayed")
    public void fyAdminVerifiesTheWarningMessageUnderNameTextBoxIsDisplayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.warningMessageUnderNameTextBox.isDisplayed());
    }

    @Then("FY Admin verifies the warning message under email text box is displayed")
    public void fyAdminVerifiesTheWarningMessageUnderEmailTextBoxIsDisplayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.warningMessageUnderEmailTextBox.isDisplayed());
    }

    @Then("FY Admin verifies the warning message under subject text box is displayed")
    public void fyAdminVerifiesTheWarningMessageUnderSubjectTextBoxIsDisplayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.warningMessageUnderSubjectTextBox.isDisplayed());
    }

    @Then("FY Admin verifies the invalid message warning under email text box is displayed")
    public void fyAdminVerifiesTheInvalidMessageWarningUnderEmailTextBoxIsDisplayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.invalidEmailWarningMessageUnderEmailTextBox.isDisplayed());
    }
}
