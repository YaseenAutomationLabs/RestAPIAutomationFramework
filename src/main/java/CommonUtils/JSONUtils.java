package CommonUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JSONUtils {

    private static ObjectMapper objectmapper= new ObjectMapper();

    public static Map<String,String> returnMapFromJSONFile(String filePath) throws IOException {
        String completePath=System.getProperty("user.dir")+"/src/test/java/"+filePath+".json";
        Map<String,String> map= new HashMap<>();

        map=objectmapper.readValue(new File(completePath), new TypeReference<>(){});

        return map;

    }


}
