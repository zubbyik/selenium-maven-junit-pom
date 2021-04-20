//package loc.imad;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.slf4j.Logger;
//
//import static java.lang.invoke.MethodHandles.lookup;
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.slf4j.LoggerFactory.getLogger;
//public class PageObjectModelOneTest {
//
//    static final Logger log = getLogger(lookup().lookupClass());
//    private static WebDriver driver;
//    @BeforeAll
//    public static void setupClass(){
//
//        WebDriverManager.chromedriver().setup();
//
//    }
//
//    @BeforeEach
//    public void setupTest(){
//        ChromeOptions options = new ChromeOptions();
//        //options.addArguments("--headless");
//        driver = new ChromeDriver(options);
//    }
//
//    @AfterAll
//    static void tearDown(){
//        if(driver != null){
//            driver.quit();
//        }
//    }
//
//    @Test
//    public void test(){
//        long a = 10L;
//        String url = "http://192.168.43.227";
//        driver.get(url);
//        String title = driver.getTitle().toLowerCase();
//        log.debug("The title of the {} is {} ", url, title);
//        assertThat(title, containsString("OrangeHRM".toLowerCase()));
//        driver.findElement(By.id("txtUsername")).sendKeys("admin");
//        driver.findElement(By.id("txtPassword")).sendKeys("!1Winner75");
//        driver.findElement(By.id("btnLogin")).click();
//        driver.navigate().to("http://192.168.43.227/symfony/web/index.php/admin/viewSystemUsers");
//
//    }
//
//
//}
