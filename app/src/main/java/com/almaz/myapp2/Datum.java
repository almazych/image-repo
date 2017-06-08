package com.almaz.myapp2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("datetime")
    @Expose
    public String datetime;
    @SerializedName("cover")
    @Expose
    public String cover;
    @SerializedName("cover_width")
    @Expose
    public String coverWidth;
    @SerializedName("cover_height")
    @Expose
    public String coverHeight;
    @SerializedName("account_url")
    @Expose
    public String accountUrl;
    @SerializedName("account_id")
    @Expose
    public String accountId;
    @SerializedName("privacy")
    @Expose
    public String privacy;
    @SerializedName("layout")
    @Expose
    public String layout;
    @SerializedName("views")
    @Expose
    public String views;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("ups")
    @Expose
    public String ups;
    @SerializedName("downs")
    @Expose
    public String downs;
    @SerializedName("points")
    @Expose
    public String points;
    @SerializedName("score")
    @Expose
    public String score;
    @SerializedName("is_album")
    @Expose
    public String isAlbum;
    @SerializedName("vote")
    @Expose
    public String vote;
    @SerializedName("favorite")
    @Expose
    public String favorite;
    @SerializedName("nsfw")
    @Expose
    public String nsfw;
    @SerializedName("section")
    @Expose
    public String section;
    @SerializedName("comment_count")
    @Expose
    public String commentCount;
    @SerializedName("topic")
    @Expose
    public String topic;
    @SerializedName("topic_id")
    @Expose
    public String topicId;
    @SerializedName("images_count")
    @Expose
    public String imagesCount;
    @SerializedName("in_gallery")
    @Expose
    public String inGallery;
    @SerializedName("is_ad")
    @Expose
    public String isAd;
    @SerializedName("tags")
    @Expose
    public List<Tag> tags = null;
    @SerializedName("ad_type")
    @Expose
    public String adType;
    @SerializedName("ad_url")
    @Expose
    public String adUrl;
    @SerializedName("in_most_viral")
    @Expose
    public String inMostViral;

}
