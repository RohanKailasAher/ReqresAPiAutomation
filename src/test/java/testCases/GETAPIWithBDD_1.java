package testCases;

import baseTest.BaseURI;
import endpoints.Endpoints;
import validations.ApiValidations;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GETAPIWithBDD_1 extends BaseURI {
    ApiValidations validate = new ApiValidations();

    @Test
    public void getuser() {

        //RestAssured.baseURI = "https://reqres.in/";

        Response response = given()
                .when()
                .get(Endpoints.endPointURLs.GET_USER_END_URL)
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

        validate.testValidation(response.statusCode(), 200);

        System.out.println(response.header("Connection"));
        System.out.println(response.contentType());

        //To print all the headers
        Headers header = response.headers();
        for(Header h:header) {
            System.out.println(h);
        }


    }
}
