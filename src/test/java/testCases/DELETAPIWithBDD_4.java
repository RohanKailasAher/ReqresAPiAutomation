package testCases;

import baseTest.BaseURI;
import endpoints.Endpoints;
import validations.ApiValidations;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DELETAPIWithBDD_4 extends BaseURI {
    ApiValidations validate = new ApiValidations();

    @Test
    public void deletuser() {

        //RestAssured.baseURI = "https://reqres.in/";

        Response response = given()
                .when()
                .delete(Endpoints.endPointURLs.DELETE_USER_END_URL)
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
        validate.testValidation(response.statusCode(), 204);
    }
}
