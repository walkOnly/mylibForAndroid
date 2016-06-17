package me.walkonly.lib.bean;

public class BaseResponse<T> {
    public int code;
    public String msg;
    public T data;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":\n"
                + "code = " + code + "\n"
                + "msg = " + msg + "\n"
                + "data = " + data;
    }

}
