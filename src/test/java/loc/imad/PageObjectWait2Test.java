//package loc.imad;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.Logger;
//
//import static java.lang.invoke.MethodHandles.lookup;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.slf4j.LoggerFactory.getLogger;
//
//public class PageObjectWait2Test {
//    static final Logger log = getLogger(lookup().lookupClass());
//    private static WebDriver driver;
//    private String URL = "http://html_drafts.loc";
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
//        driver.get(URL);
////        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[2]")));
//        assertEquals(element.getText().toLowerCase(), "hello World".toLowerCase());
//    }
//
//}
