package moe.ibox.tsapi;

import moe.ibox.tsapi.callback.ServiceCallback;
import moe.ibox.tsapi.entities.response.ServiceCreated;
import moe.ibox.tsapi.entities.response.ServiceList;
import moe.ibox.tsapi.entities.response.ServiceModified;
import moe.ibox.tsapi.entities.response.base.BaseResponse;
import moe.ibox.tsapi.service.ServiceManagement;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings("rawtypes")
public class AmapTrackServiceApi {

    private final String TSAPI_WEB_KEY;

    Retrofit retrofit;

    ServiceManagement serviceManagement;

    /**
     * @param webServiceKEY Web service KEY
     * @param baseUrl       Base url of the server
     */
    public AmapTrackServiceApi(String webServiceKEY, String baseUrl) {
        this.TSAPI_WEB_KEY = webServiceKEY;
        this.retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build();
        serviceManagement = retrofit.create(ServiceManagement.class);
    }

    /**
     * @param webServiceKEY Web service KEY
     */
    public AmapTrackServiceApi(String webServiceKEY) {
        this(webServiceKEY, "https://tsapi.amap.com/v1/track/");
    }

    /** Add service
     * @param name     Service name
     * @param desc     Service description
     * @param callback callback
     */
    public void serviceAdd(String name, String desc, ServiceCallback<BaseResponse<ServiceCreated>> callback) {
        serviceManagement.addService(this.TSAPI_WEB_KEY, name, desc).enqueue(callback);
    }

    /** Delete service
     * @param sid      Service id
     * @param callback callback
     */
    public void serviceDelete(int sid, ServiceCallback<BaseResponse> callback) {
        serviceManagement.deleteService(this.TSAPI_WEB_KEY, sid).enqueue(callback);
    }

    /** Update service info
     * @param sid         Service id
     * @param name        Service name
     * @param description Service description
     * @param callback    callback
     */
    public void serviceUpdate(int sid, String name, String description, ServiceCallback<BaseResponse<ServiceModified>> callback) {
        serviceManagement.updateService(this.TSAPI_WEB_KEY, sid, name, description).enqueue(callback);
    }

    /** Fetch all service
     * @param callback callback
     */
    public void serviceList(ServiceCallback<BaseResponse<ServiceList>> callback) {
        serviceManagement.listService(this.TSAPI_WEB_KEY).enqueue(callback);
    }
}
