package com.example.quinnm.socialmap.api.service;

import com.example.quinnm.socialmap.api.model.AddMessage;
import com.example.quinnm.socialmap.api.model.GetMessage;
import com.example.quinnm.socialmap.api.model.Message;
import com.example.quinnm.socialmap.api.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MessageClient {
    @POST("addMsg")
    Call<AddMessage> addMessage (@Body AddMessage addMessage);

    @POST("delMsg")
    Call<Message> deleteMessage(@Body Message message);

    @POST("getMsgs")
    Call<GetMessage> getMessages(@Body GetMessage getMessage);
}
