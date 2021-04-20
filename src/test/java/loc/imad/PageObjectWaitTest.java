//package loc.imad;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.Logger;
//
//import static java.lang.invoke.MethodHandles.lookup;
//import static org.slf4j.LoggerFactory.getLogger;
//
//public class PageObjectWaitTest {
//    static final Logger log = getLogger(lookup().lookupClass());
//    private static WebDriver driver;
//
//    @BeforeAll
//    public static void setup(){
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeEach
//    public void beforeStart(){
//        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--headless");
//        driver = new ChromeDriver(options);
//
//    }
//
//    @AfterAll
//    public static void tearDown(){
//        if(driver != null){
//            driver.quit();
//        }
//    }
//
//    @Test
//    public void test() throws InterruptedException {
//        driver.get("https://google.com/ncr");
//        driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
//        // Initialize and wait till the element becomes clickable, wait time is 10 seconds;
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement q = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rso\"]/div[3]/div[1]/div/div/div[1]/a/h3)]")));
//        q.click();
//    }
//
//
//}
