package OnlineStore;

import CommonUtils.JSONUtils;
import RestUtils.performPOST;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class addNewProduct {
    @Test
    public void createNewProduct() throws IOException {

        Map<String,String> data= JSONUtils.returnMapFromJSONFile("Resources\\QA\\QAData");
        String endpoint=data.get("QAEndpoint");
        String url="https://fakestoreapi.com/products";
        String payload=Payload.returnPayloadAsString("78690","onlineStore","120","This is a online store","Men","image.img");
        Map<String,String> payload2=Payload.returnPayloadAsMap("78697","onlineStore","120","This is a online store","Men","image.img");
        Response res=performPOST.postCall(endpoint,payload2,new HashMap<>());
        Assert.assertEquals(res.statusCode(),200);

    }

}
