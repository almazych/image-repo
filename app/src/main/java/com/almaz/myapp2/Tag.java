package com.almaz.myapp2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tag {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("display_name")
    @Expose
    public String displayName;
    @SerializedName("followers")
    @Expose
    public String followers;
    @SerializedName("total_items")
    @Expose
    public String totalItems;
    @SerializedName("following")
    @Expose
    public String following;
    @SerializedName("background_hash")
    @Expose
    public String backgroundHash;
    @SerializedName("background_is_animated")
    @Expose
    public String backgroundIsAnimated;
    @SerializedName("is_promoted")
    @Expose
    public String isPromoted;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("logo_hash")
    @Expose
    public String logoHash;
    @SerializedName("logo_destination_url")
    @Expose
    public String logoDestinationUrl;
    @SerializedName("description_annotations")
    @Expose
    public DescriptionAnnotations descriptionAnnotations;

}