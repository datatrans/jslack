package com.github.seratch.jslack.api.methods.response.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.ResponseMetadata;
import com.github.seratch.jslack.api.model.User;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class UsersListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private List<User> members;
    @SerializedName("response_metadata")
    private ResponseMetadata responseMetadata;
}