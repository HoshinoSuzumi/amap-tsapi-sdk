package moe.ibox.tsapi.entities.response;

public class ServiceModified {
    private int sid;
    private String name;

    /**
     * @return Unique ID of the service
     */
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return Service name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
