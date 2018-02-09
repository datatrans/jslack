package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class Channel {

    private String id;
    private String name;
    private Integer created;
    private String creator;
    @SerializedName("is_archived")
    private boolean archived;
    @SerializedName("is_member")
    private boolean member;
    @SerializedName("is_general")
    private boolean general;
    @SerializedName("is_private")
    private boolean privateChannel;
    private String lastRead;
    private Latest latest;
    private Integer unreadCount;
    private Integer unreadCountDisplay;
    private List<String> members;
    private Topic topic;
    private Purpose purpose;
}
