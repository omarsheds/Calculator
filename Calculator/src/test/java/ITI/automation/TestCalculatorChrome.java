package ITI.automation;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.example.Calculator.sub;


public class TestCalculatorChrome {


    @BeforeMethod
    public void Setup(){


        System.out.println("Setup is successful");

    }




//    @Test
//    @Parameters({"firstInteger","secondInteger","URL"})
//    public static void testSub(String firstInteger, String y,String z){
//        System.out.println("URL is  "+z);
//        System.out.println("X is equal "+ firstInteger);
//        System.out.println("Y is equal "+y);
//        Assert.assertEquals(sub(2,3),-1,"Wrong addition");
//        System.out.println("Sub function is executed");
//
//    }
    /*
    @Test(dataProvider = "numbers")
    public static void testAdd(double X , double Y , double Z )
    {


        Assert.assertEquals(add(X,Y),Z,"Wrong addition");
        System.out.println("Add function is executed");


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
