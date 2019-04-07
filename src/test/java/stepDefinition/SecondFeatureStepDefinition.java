package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondFeatureStepDefinition {


        static WebDriver myDriver;

        @Given("^I am a BBC iplayer user$")
        public void i_am_a_BBC_iplayer_user() {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\narma\\IdeaProjects\\MySecondMavenProject\\Chromedriver.exe");
            myDriver = new ChromeDriver();

        }

        @When("^I access BBC iplayer website$")
        public void i_access_BBC_iplayer_website()
        {
            myDriver.get("https://www.bbc.co.uk/iplayer");
        }

        @Then("^I see BBC iplayer Home page$")
        public void i_see_BBC_iplayer_Home_page()
        {
            myDriver.quit();
        }

    }
