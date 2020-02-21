package Com.Addweb.Testcase;

import Com.Addweb.Pages.GmailPageObjects;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Addweb.Pages.ContactUs;

import java.io.IOException;

    public class Contact extends BaseCase {

        @Test
            public void Entervalidname()throws InterruptedException,IOException {
            logger=extent.createTest("Check Form submission with Name Blank Field");
            ContactUs enter=new ContactUs(driver,logger);
            enter.EnterData("","Johnnyharpertesting1@gmail.com","9978123516","Testing by QA team");
            driver.quit();
        }

        @Test
        public void EntervalidEmail()throws InterruptedException,IOException {
            logger=extent.createTest("Check Form submission with Invalid Email");
            ContactUs enter=new ContactUs(driver,logger);
            enter.EnterData("Johnny","Johnnyharpertesting1","9978123516","Testing by QA team");
            driver.quit();
         }

        @Test
        public void Entervalidnumber()throws InterruptedException,IOException {
            logger=extent.createTest("Check Form submission with Blank blank Phone number");
            ContactUs enter=new ContactUs(driver,logger);
            enter.EnterData("Johnny","Johnnyharpertesting1@gmail.com","","Testing by QA team");
            driver.quit();
        }

        @Test
         public void Entervaliddata()throws InterruptedException,IOException {
            logger=extent.createTest("Check Form submission with Blank Description");
            ContactUs enter=new ContactUs(driver,logger);
            enter.EnterData("Johnny","Johnnyharpertesting1@gmail.com","9978123516","");
            driver.quit();
        }

        @Test
        public void Checkwithcaptcha() throws IOException, IOException, InterruptedException {
            logger=extent.createTest("Check if form submitted with captcha Error or not");
            ContactUs very=new ContactUs(driver,logger);
            very.Checkcaptchavalidation("johnny harper","johnnyharpertesting2@gmail.com","7854712536","Testing for captcha");
        }

        @Test
        public void Successfulsubmission() throws IOException, IOException, InterruptedException {
          logger=extent.createTest("Check if form submition works properly or not");
          ContactUs very=new ContactUs(driver,logger);
          very.Submittheform("johnny harper","johnnyharpertesting2@gmail.com","7854712536","Testing for captcha");
          driver.quit();
        }

        @Test
        public void Email() throws IOException, IOException, InterruptedException {
            driver.get("https://mail.google.com");
            GmailPageObjects gp= PageFactory.initElements(driver, GmailPageObjects.class);
            gp.enterEmail("krina.addweb@gmail.com");//Replace with your email id
            gp.enterPassword("addweb123");//Replace with your password
            gp.clickEmail("2 new notifications on QA Testing since 2:56 AM (February 21, 2020)");//Replace with email subject you want to click
        }
}

