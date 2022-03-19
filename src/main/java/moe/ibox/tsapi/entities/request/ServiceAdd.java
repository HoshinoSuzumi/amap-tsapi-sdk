package moe.ibox.tsapi.entities.request;

public class ServiceAdd {
    private String key;
    private String name;
    private String desc;

    public ServiceAdd(String key, String name, String desc) {
        this.key = key;
        this.name = name;
        this.desc = desc;
    }
}
