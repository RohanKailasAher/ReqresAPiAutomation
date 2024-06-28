package payloads;

public class requestPayloadUsingJSON {
    public String createUserPayload(String name , String job) {
        return "{\r\n"
                + "    \"name\": \""+name+"\",\r\n"
                + "    \"job\": \""+job+"\"\r\n"
                + "}";
    }
}
