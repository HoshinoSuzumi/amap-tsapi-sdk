# amap-tsapi-sdk

高德开放平台猎鹰组件 WebService 的第三方 SDK (for JVM & Android)

> 什么是猎鹰？
>
> 猎鹰是一套轨迹管理服务，提供移动端SDK和后端API供开发者接入。猎鹰可以满足您追踪车辆等定位设备，其提供的丰富接口和云端服务，可以让开发者基于猎鹰迅速构建一套完全属于自己的精准、高效的轨迹管理系统，应用于车队管理、人员管理等领域。
>
> *摘自 [高德开放平台](https://lbs.amap.com/api/track/summary)*

# 导入

## Gradle

`settings.gradle`

```gradle
dependencyResolutionManagement {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

`dependencies` in `build.gradle`

```dsl
implementation 'com.github.HoshinoSuzumi:amap-tsapi-sdk:0.1.1'
```

# 使用

```java
AmapTrackServiceApi trackServiceApi=new AmapTrackServiceApi("YOUR_WEB_SERVICE_KEY");

        trackServiceApi.serviceAdd("test","test",new ServiceCallback<BaseResponse<ServiceCreated>>(){
@Override
protected void onResponse(BaseResponse<ServiceCreated> serviceCreatedBaseResponse){
        Log.i("TSAPI",String.valueOf(serviceCreatedBaseResponse.getErrcode()));
        Log.i("TSAPI",String.valueOf(serviceCreatedBaseResponse.getErrmsg()));
        }
        });
```

详细请查阅包内 Java Doc

# Roadmap

计划实现的 API

|   接口类目    | 功能        | API                                             | 实现  | 实例方法         |
|:---------:|-----------|-------------------------------------------------|:---:|--------------|
| service管理 | 增加service | https://tsapi.amap.com/v1/track/service/add     |  √  | addService() |
| service管理 | 删除service | https://tsapi.amap.com/v1/track/service/delete  |     |              |
| service管理 | 修改service | https://tsapi.amap.com/v1/track/service/update  |     |              |
|   终端管理    | 增加终端      | https://tsapi.amap.com/v1/track/terminal/add    |     |              |
|   终端管理    | 删除终端      | https://tsapi.amap.com/v1/track/terminal/delete |     |              |
|   终端管理    | 修改终端      | https://tsapi.amap.com/v1/track/terminal/update |     |              |
|   终端管理    | 查询终端      | https://tsapi.amap.com/v1/track/terminal/list   |     |              |

*未出现在表中的 API 将暂时不会考虑加入，欢迎 Pull Request*

> 猎鹰官网的[接口列表](https://lbs.amap.com/api/track/lieying-rumen#api_list)
