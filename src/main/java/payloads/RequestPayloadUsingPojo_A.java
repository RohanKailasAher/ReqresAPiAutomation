package payloads;

import org.json.JSONObject;

public class RequestPayloadUsingPojo_A {

    public String createUserPayload(String name, String job) {
        // Create an instance of RequestPayloadUsingPojo
        RequestPayloadUsingPojo data = new RequestPayloadUsingPojo();

        // Set values for the object
        data.setName(name);
        data.setJob(job);

        JSONObject payload = new JSONObject(data);
        return payload.toString();
    }
}
