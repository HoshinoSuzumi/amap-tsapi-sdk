package moe.ibox.tsapi.service;

import moe.ibox.tsapi.entities.response.ServiceCreated;
import moe.ibox.tsapi.entities.response.base.BaseResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ServiceManagement {
    @FormUrlEncoded
    @POST("service/add")
    Call<BaseResponse<ServiceCreated>> addService(
            @Field("key") String key,
            @Field("name") String name,
            @Field("desc") String desc
    );
}
