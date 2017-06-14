package com.almaz.myapp2.model.api;

import android.app.Application;

import com.almaz.myapp2.BuildConfig;
import com.almaz.myapp2.model.ModelImpl;

import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiModule extends Application {
    private static ApiInterface sApiInterface;

    @Override
    public void onCreate() {
        super.onCreate();

        Interceptor loggingInterceptor = new HttpLoggingInterceptor()
                .setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.imgur.com/3/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        sApiInterface = retrofit.create(ApiInterface.class);

        ModelImpl.initInstance();
    }

    public static ApiInterface getApi() {
        return sApiInterface;
    }
}
