package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class LoginPage {

    private WebDriver driver;

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMsg = By.xpath("//h3[@data-test='error']");
    public By pageTitle = By.xpath("//*[@data-test='title']");
    public By fromJourneyField = By.xpath("//input[@id='fromCity']");
    public By fromSearchField = By.xpath("//input[@placeholder='From']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(user);

        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);

        driver.findElement(loginBtn).click();
    }

    public String getErrorMessage() {
        try {
            return driver.findElement(pageTitle).getText();
        } catch (Exception e) {
            return driver.findElement(errorMsg).getText();
        }
    }

    public void selectFromJourney () {
        driver.findElement(fromJourneyField).click();
        driver.findElement(fromSearchField).sendKeys("Pune");
    }

    public void pickFutureDate (){

    }
}
