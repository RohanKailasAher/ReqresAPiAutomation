package testCases;

import baseTest.BaseURI;
import endpoints.Endpoints;
import validations.ApiValidations;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import payloads.RequestPayloadUsingPojo_A;
//import payLoads.requestPayloadUsingJSON;

import static io.restassured.RestAssured.given;

public class POSTAPIWithBDD_2 extends BaseURI {
   // requestPayloadUsingJSON rPayload = new requestPayloadUsingJSON();
    //RequestPayloadUsingHashMap rPayload = new RequestPayloadUsingHashMap();
    RequestPayloadUsingPojo_A rPayload = new RequestPayloadUsingPojo_A();
    ApiValidations validate = new ApiValidations();

    @Test
    public void postuser() {
        //RestAssured.baseURI = "https://reqres.in/";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(rPayload.createUserPayload("Tom","QA"))
                .when()
                .post(Endpoints.endPointURLs.POST_USER_END_URL)
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

        validate.testValidation(response.statusCode(), 201);

        //Verify data using json path
        JsonPath js = response.jsonPath();
        String Title = js.get("name");
        System.out.println(Title);

    }

}
