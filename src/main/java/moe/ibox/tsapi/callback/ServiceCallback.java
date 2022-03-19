package moe.ibox.tsapi.callback;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public abstract class ServiceCallback<T> implements Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.body() == null) {
            onFailure(call, new Throwable("something wrong happened"));
        } else {
            T t = response.body();
            onResponse(t);
        }
    }

    protected abstract void onResponse(T response);

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        t.printStackTrace();
    }
}
