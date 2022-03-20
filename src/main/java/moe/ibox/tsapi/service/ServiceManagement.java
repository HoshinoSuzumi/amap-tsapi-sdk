package moe.ibox.tsapi.service;

import moe.ibox.tsapi.entities.response.ServiceCreated;
import moe.ibox.tsapi.entities.response.ServiceList;
import moe.ibox.tsapi.entities.response.ServiceModified;
import moe.ibox.tsapi.entities.response.base.BaseResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@SuppressWarnings("rawtypes")
public interface ServiceManagement {
    @FormUrlEncoded
    @POST("service/add")
    Call<BaseResponse<ServiceCreated>> addService(
            @Field("key") String key,
            @Field("name") String name,
            @Field("desc") String description
    );

    @FormUrlEncoded
    @POST("service/delete")
    Call<BaseResponse> deleteService(
            @Field("key") String key,
            @Field("sid") int sid
    );

    @FormUrlEncoded
    @POST("service/update")
    Call<BaseResponse<ServiceModified>> updateService(
            @Field("key") String key,
            @Field("sid") int sid,
            @Field("name") String name,
            @Field("desc") String description
    );

    @FormUrlEncoded
    @POST("service/list")
    Call<BaseResponse<ServiceList>> listService(
            @Field("key") String key
    );
}
