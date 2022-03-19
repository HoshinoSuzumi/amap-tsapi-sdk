package moe.ibox.tsapi.entities.response.base;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {
    private int errcode;
    private String errmsg;
    private String errdetail;
    private T data;

    /**
     * @return Status code
     */
    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    /**
     * @return Status description
     */
    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    /**
     * @return Error detail
     */
    public String getErrdetail() {
        return errdetail;
    }

    public void setErrdetail(String errdetail) {
        this.errdetail = errdetail;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
