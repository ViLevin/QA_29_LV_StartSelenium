import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWorkTest {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssSelectors() {
        //by tag name
        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement H1_1 = wd.findElement(By.cssSelector("h1"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));


        // by class
        WebElement divContainer = wd.findElement(By.className("container"));
        WebElement divContainer1 = wd.findElement(By.cssSelector(".container")); //.=class

        WebElement divNav = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement divNav1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));//.=class

        WebElement divActive = wd.findElement(By.className("active"));
        WebElement divActive1 = wd.findElement(By.cssSelector(".active"));


        //by id
        WebElement id = wd.findElement(By.id("root"));
        WebElement id1 = wd.findElement(By.cssSelector("#root"));//#=id


        //by attribute =[]
        WebElement element0 = wd.findElement(By.cssSelector("[href = '/home']"));
        System.out.printf("element0: %s\n", element0);

        WebElement element = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement element1 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement element2 = wd.findElement(By.cssSelector("[name = 'password']"));
        WebElement element3 = wd.findElement(By.name("password"));


    }
}
