package me.walkonly.mylib.util;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
    private static final String TAG = "JsonUtil";

//    public static final int TYPE_JSONObject = 1;
//    public static final int TYPE_JSONArray = 2;

    public static <T> T fromJson(String responseStr, Class<T> classOfT) {
        if (responseStr == null || TextUtils.isEmpty(responseStr))
            throw new IllegalArgumentException("responseStr = " + responseStr);
        if (classOfT == null)
            throw new IllegalArgumentException("classOfT == null");

        Gson gson = new Gson();
        T retObj = gson.fromJson(responseStr, classOfT); // 解析json
        Log.e(TAG, "fromJson(): retObj = " + retObj);
        return retObj;
    }

    public static <T> T fromJson(JSONObject response, Class<T> classOfT) {
        if (response == null || TextUtils.isEmpty(response.toString()))
            throw new IllegalArgumentException("response = " + response);
        if (classOfT == null)
            throw new IllegalArgumentException("classOfT == null");

        return fromJson(response.toString(), classOfT);
    }

    public static <T> List<T> fromJsonArray(JSONArray jsonArray, Class<T> classOfT) {
        if (jsonArray == null || TextUtils.isEmpty(jsonArray.toString()))
            throw new IllegalArgumentException("jsonArray 无数据");
        if (jsonArray.length() == 0) // 搜索的结果可能是空：{"result":0,"list":[]}
            return null;

        List<T> list = new ArrayList<T>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObj = jsonArray.optJSONObject(i);
            T obj = fromJson(jsonObj, classOfT);
            list.add(obj);
        }

        return list;
    }

}
