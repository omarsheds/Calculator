package ITI.automation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.Calculator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static org.example.Calculator.add;
import static org.example.Calculator.sub;


public class TestCalculator {
WebDriver driver =new EdgeDriver();

    @BeforeMethod
    public void Setup(){
        driver.get("https://www.google.com");
        System.out.println("Setup is successful");

    }




    @Test
    //@Parameters({"firstInteger","secondInteger","URL"})
    public  void testSub(){

        Assert.assertEquals(sub(2,3),-1,"Wrong addition");
        System.out.println("Sub function is executed");

    }

    @Test
    public static void testAdd( )
    {


        Assert.assertEquals(add(3,2),5,"Wrong addition");
        System.out.println("Add function is executed");


    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
/*
    @Test
    public static void testZ(){


        Assert.assertEquals(5,5,"Wrong addition");
        System.out.println("ZZZZ function is executed");

    }


    @AfterMethod
    public void Checkout(){


        System.out.println("Checkout is successful");

    }


    @DataProvider
    public static Object[][] numbers(){

        Object[][] arr = new Object[3][3];

        arr[0][0]=2;        arr[0][1]=2;    arr[0][2]=4;

        arr[1][0]=3;        arr[1][1]=4;    arr[1][2]=7;

        arr[2][0]=3;        arr[2][1]=4;     arr[2][2]=0;

         return arr;
    }*/
}
