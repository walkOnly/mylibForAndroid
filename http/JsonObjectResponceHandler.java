package me.walkonly.lib.http;

import me.walkonly.lib.http.JsonResponceHandler;

public class JsonObjectResponceHandler<T> extends JsonResponceHandler {

    private Class<T> clazz;

    public JsonObjectResponceHandler(Class<T> clazz) {
        this.clazz = clazz;
    }

    // TODO: 需要支持本地测试数据

}
