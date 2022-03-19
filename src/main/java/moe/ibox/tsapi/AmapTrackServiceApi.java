package moe.ibox.tsapi;

import moe.ibox.tsapi.callback.ServiceCallback;
import moe.ibox.tsapi.entities.request.ServiceAdd;
import moe.ibox.tsapi.entities.response.ServiceCreated;
import moe.ibox.tsapi.entities.response.base.BaseResponse;
import moe.ibox.tsapi.service.ServiceManagement;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AmapTrackServiceApi {
    Retrofit retrofit;

    ServiceManagement serviceManagement;

    public AmapTrackServiceApi() {
        this.retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://tsapi.amap.com/v1/")
                .build();
        serviceManagement = retrofit.create(ServiceManagement.class);
    }

    public void add(String key, String name, String desc, ServiceCallback<BaseResponse<ServiceCreated>> callback) {
        serviceManagement.addService(new ServiceAdd(key, name, desc)).enqueue(callback);
    }
}
