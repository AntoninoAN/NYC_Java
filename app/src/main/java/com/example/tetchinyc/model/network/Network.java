package com.example.tetchinyc.model.network;

import com.example.tetchinyc.model.network.utils.CONSTANTS;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
    private Network() {
    }

    private static Object lock = new Object();
    private static Network INSTANCE;
    private NYCService SERVICE;

    public static Network getInstance() {
        if (INSTANCE != null) return INSTANCE;

        synchronized (lock) {
            if (INSTANCE != null) return INSTANCE;

            INSTANCE = new Network();

            return INSTANCE;
        }
    }

    public NYCService getSERVICE() {
        if (SERVICE != null)
            return SERVICE;
        else {
            SERVICE = initRetrofit();
        }
        return SERVICE;
    }

    private NYCService initRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(CONSTANTS.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build()
                .create(NYCService.class);
    }
}
