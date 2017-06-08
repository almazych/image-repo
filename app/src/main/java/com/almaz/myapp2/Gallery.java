package com.almaz.myapp2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Gallery {

    @SerializedName("data")
    @Expose
    public List<Datum> data = null;
    @SerializedName("success")
    @Expose
    public String success;
    @SerializedName("status")
    @Expose
    public String status;
}