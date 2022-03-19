package moe.ibox.tsapi;

import moe.ibox.tsapi.entities.request.ServiceAdd;
import moe.ibox.tsapi.entities.response.ServiceCreated;
import moe.ibox.tsapi.entities.response.base.BaseResponse;
import moe.ibox.tsapi.service.ServiceManagement;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AmapTrackServiceApi {
    Retrofit retrofit;

    ServiceManagement serviceManagement;

    public AmapTrackServiceApi(Retrofit retrofit) {
        this.retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://tsapi.amap.com/v1/")
                .build();
        serviceManagement = retrofit.create(ServiceManagement.class);
    }

    public String say(String what) {
        return "I said " + what;
    }

    public void add() {
        serviceManagement.addService(new ServiceAdd(
                "e355d1aecc8d25b61b933843dfab4395",
                "test",
                "test")
        ).enqueue(new Callback<BaseResponse<ServiceCreated>>() {
            @Override
            public void onResponse(Call<BaseResponse<ServiceCreated>> call, Response<BaseResponse<ServiceCreated>> response) {
                System.out.println(response.toString());
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<BaseResponse<ServiceCreated>> call, Throwable t) {

            }
        });
    }
}
