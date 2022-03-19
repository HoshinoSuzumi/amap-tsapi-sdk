package moe.ibox.tsapi.entities.response;

public class Service {
    private int sid;
    private String name;
    private String desc;

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

    /**
     * @return Service description
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
