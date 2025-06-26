package OnlineStore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class addNewProduct {
    @Test
    public void createNewProduct(){
        Response response= RestAssured.given().log().all()
                .baseUri("https://fakestoreapi.com/products")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 7,\n" +
                        "  \"title\": \"yaseen\",\n" +
                        "  \"price\": 100,\n" +
                        "  \"description\": \"string\",\n" +
                        "  \"category\": \"string\",\n" +
                        "  \"image\": \"http://example.com\"\n" +
                        "}")
                .post()
                .then().log().all().extract().response();
    Assert.assertEquals(response.statusCode(),200) ;
    }

}
