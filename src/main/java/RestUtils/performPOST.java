package RestUtils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class performPOST {


    public static Response postCall(String url, String payload, HashMap<String, String> headres){

                Response response= RestAssured.given().log().all()
                .baseUri(url)
                .headers(headres)
                .contentType(ContentType.JSON)
                .body(payload)
                .post()
                .then().log().all().extract().response();
        return  response;
    }
    public static Response postCall(String url, Map<String,String> payload, HashMap<String, String> headres){

                Response response= RestAssured.given().log().all()
                .baseUri(url)
                .headers(headres)
                .contentType(ContentType.JSON)
                .body(payload)
                .post()
                .then().log().all().extract().response();
        return  response;
    }
}
