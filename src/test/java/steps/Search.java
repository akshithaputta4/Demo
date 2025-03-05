package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import java.lang.*;

public class Search {

    WebDriver driver;

    @Given("I open the URL")
    public void openUrl()  {
        driver=new ChromeDriver();
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        driver.manage().window().maximize();
        System.out.println("Page Title captured: " + driver.getTitle());
    }

    @When("I pass the string {string}")
    public void enterString(String product) {
        WebElement e = driver.findElement(By.id("woocommerce-product-search-field-0"));
        e.sendKeys(product);
        e.submit();
    }

    @Then("The  current URL should contain {string}")
    public void validateProduct(String product) {
        if (driver.getCurrentUrl().contains(product)) {
            System.out.println("Test Passed: URL contains " + product);
        } else {
            System.out.println("Test Failed: URL does not contain " + product);
        }
        driver.quit();
    }

    @Given("I open the {string}")
    public void iOpenThe(String arg0) {

    }

    @Then("The current URL should contain {string}")
    public void theCurrentURLShouldContain(String arg0) {
    }
}
