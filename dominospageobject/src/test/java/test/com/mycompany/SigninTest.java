/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.dominospageobject.SigninPage;
import com.mycompany.dominospageobject.SignoutPage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author swetu
 */


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    

public class SigninTest {
     private static WebDriver driver;
    private String baseUrl;

    public SigninTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
         driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        
    }
    
     @Test
    public void executeSigninPageModule() throws Exception {
        SigninPage signinpage = PageFactory.initElements(driver, SigninPage.class);
        signinpage.signinToFlighApplication();
       
    }
    
     @Test
    public void executeSignoutPage() throws Exception {
        SignoutPage signout = PageFactory.initElements(driver, SignoutPage.class);
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[2]/li[1]/div/button")));
        
//Advisable to use explicit wait to pause the driver.
        signout.signoutPage();
         Thread.sleep(2000);
        driver.close();
    }

    
}
