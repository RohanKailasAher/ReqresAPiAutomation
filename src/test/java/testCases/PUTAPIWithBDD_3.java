package testCases;

import baseTest.BaseURI;
import endpoints.Endpoints;
import validations.ApiValidations;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import payloads.RequestPayloadUsingPojo_A;

import static io.restassured.RestAssured.given;

public class PUTAPIWithBDD_3 extends BaseURI {
    // requestPayloadUsingJSON rPayload = new requestPayloadUsingJSON();
    //RequestPayloadUsingHashMap rPayload = new RequestPayloadUsingHashMap();
    RequestPayloadUsingPojo_A rPayload = new RequestPayloadUsingPojo_A();
    ApiValidations validate = new ApiValidations();

    @Test
    public void putUser() {

        //RestAssured.baseURI = "https://reqres.in/";

        Response response =  given()
                .contentType(ContentType.JSON)
                .body(rPayload.createUserPayload("Pam", "Dev"))
                .when()
                .put(Endpoints.endPointURLs.PUT_USER_END_URL)
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        int SC = response.statusCode();
        System.out.println(SC);

        validate.testValidation(SC, 200);


    }

}
