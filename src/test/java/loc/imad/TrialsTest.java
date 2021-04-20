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
//import org.openqa.selenium.support.ui.WebDriverWait;
//
////import org.slf4j.Logger;
////import static org.slf4j.LoggerFactory.getLogger;
//
//public class TrialsTest {
//    private static WebDriver driver;
//    private final String URL = "http://laravel-lecture.loc";
//    //static final Logger log = getLogger(lookup().lookupClass());
//    @BeforeAll
//    public static void globalSetup(){
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeEach
//    public void setup(){
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        driver = new ChromeDriver(chromeOptions);
//    }
//
//    @Test
//    void test() throws InterruptedException {
//        driver.get(URL);
//        //driver.navigate().to(URL+"/todo");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        //log.debug(driver.getCurrentUrl());
////        System.out.println("The Original url is " + driver.getCurrentUrl());
////        driver.navigate().back();
////        System.out.println("After going back the new URL is " + driver.getCurrentUrl());
////        driver.navigate().forward();
////        System.out.println("After going forward the url is now " + driver.getCurrentUrl());
////        driver.navigate().refresh();
////        System.out.println("After refreshing the new url is " + driver.getCurrentUrl());
////        System.out.println("The title of the website is " + driver.getTitle());
////        System.out.println("The window handle for the current window is " + driver.getWindowHandle());
//        String originalWindowHandle = driver.getWindowHandle();
//        assert driver.getWindowHandles().size() == 1;
//        driver.findElement(By.linkText("Todo")).click();
//        System.out.println(driver.getTitle());
//        //wait.until(numberOfWindowsToBe(2));
////        for(String windowHandle : driver.getWindowHandles()){
////            System.out.println(windowHandle);
////        }
//       // wait.until(titleIs("Welcome"));
//    }
//
//
//    @AfterAll
//    public static void tearDown(){
//        if(driver != null){
//            driver.quit();
//        }
//    }
//}
