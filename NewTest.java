package mavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("f Class") ;
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod Class") ;
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod Class") ;
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass Class") ;
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass Class") ;
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest Class") ;
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest Class") ;
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite Class") ;
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite Class") ;
  }

}
