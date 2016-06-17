package me.walkonly.lib.bean;

import java.util.List;

public class BaseResponceWithArray<T> {
    public int code;
    public String msg;
    public List<T> data;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":\n"
                + "code = " + code + "\n"
                + "msg = " + msg + "\n"
                + "data = " + data;
    }

}
