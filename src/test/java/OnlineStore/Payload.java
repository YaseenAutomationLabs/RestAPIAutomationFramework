package OnlineStore;

import java.util.HashMap;
import java.util.Map;

public class Payload {

    String x="yaseen";
   String xpath="//span[@class='']";


    public static String returnPayloadAsString(String id,String title,String price,String description,String category,String image){
        String payload="";
        return  payload="{\n" +
                "  \""+id+"\": 7,\n" +
                "  \""+title+"\": \"yaseen\",\n" +
                "  \""+price+"\": 100,\n" +
                "  \""+description+"\": \"string\",\n" +
                "  \""+category+"\": \"string\",\n" +
                "  \""+image+"\": \"http://example.com\"\n" +
                "}";

    }
    public static Map<String,String> returnPayloadAsMap(String id,String title,String price,String description,String category,String image){

        Map<String,String> m= new HashMap<>();
        m.put("id",id);
        m.put("title",title);
        m.put("price",price);
        m.put("description",description);
        m.put("category",category);
        m.put("image",image);

        return m;
    }

}
