package baseTest;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseURI {
    @BeforeTest
    public void baseURI() {

        RestAssured.baseURI = "https://reqres.in/";
    }
}
