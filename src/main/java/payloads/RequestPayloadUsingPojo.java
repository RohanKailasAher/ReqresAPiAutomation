package payloads;

public class RequestPayloadUsingPojo {
    private String name;
    private String job;


    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }



    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
