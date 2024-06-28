package payloads;

import org.json.JSONObject;

import java.util.HashMap;

public class RequestPayloadUsingHashMap {
    public String createUserPayload(String name , String job) {
        HashMap<String, String> data = new HashMap<>();
        data.put("name",name);
        data.put("job",job );

      JSONObject payload = new JSONObject(data);

       return payload.toString();
        //return data;
    }

}