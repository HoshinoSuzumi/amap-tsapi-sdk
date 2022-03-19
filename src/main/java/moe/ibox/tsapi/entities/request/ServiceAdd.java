package moe.ibox.tsapi.entities.request;

import moe.ibox.tsapi.entities.request.base.BaseRequest;

public class ServiceAdd extends BaseRequest {
    private String name;
    private String desc;

    public ServiceAdd(String key, String name, String desc) {
        super(key);
        this.name = name;
        this.desc = desc;
    }
}
