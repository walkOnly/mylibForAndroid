package me.walkonly.myapp.util;

import android.os.Handler;
import android.os.Looper;

public final class AppUtils {

    private static final Handler mHandler = new Handler(Looper.getMainLooper());

    private AppUtils() {
        // no instance
    }

    public static void post(Runnable r) {
        mHandler.post(r);
    }

    public static void postDelayed(Runnable r, long delayTime) {
        mHandler.postDelayed(r, delayTime);
    }

}
