import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {

        String baseURL = "http://the-internet.herokuapp.com/login";

        //LAUNCH THE CHROME BROWSER
        WebDriver driver = new ChromeDriver();

        //Open the URL into Browser
        driver.get(baseURL);

        driver.manage().window().maximize();

        //Print title of the page
        System.out.println("Title of the page: "+ driver.getTitle());

        //Print the current URL
        System.out.println("Current URL : " +driver.getCurrentUrl());

        //Print the page source
        System.out.println("Pagesource : " + driver.getPageSource());




        //Enter the email address to emailfield
        WebElement emilField = driver.findElement(By.name("username"));
        emilField.sendKeys("Prime");

        //Enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("123456");

        //Find login link element and click on it.
        WebElement loginButton= driver.findElement(By.cssSelector("#login>button"));
        loginButton.click();



        //Print the current URL
        System.out.println("The current URL : " + driver.getCurrentUrl());

        //Refresh the page
        driver.navigate().refresh();

        //Close the browser
        driver.close();
    }
}
