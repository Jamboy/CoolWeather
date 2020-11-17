package com.example.coolweather.util;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @Description:
 * @author: Kivia
 * @date: 2020年11月10日 10:18
 * @Modify 2020年11月10日 10:18
 * @Modified by:
 * @Modified remark:
 */
public class HttpUtil {
    /**
     * 发起http请求
     * @param address
     * @param callback
     */

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }

}
