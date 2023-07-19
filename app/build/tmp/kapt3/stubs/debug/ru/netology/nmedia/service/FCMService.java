package ru.netology.nmedia.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lru/netology/nmedia/service/FCMService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "auth", "Lru/netology/nmedia/auth/AppAuth;", "getAuth", "()Lru/netology/nmedia/auth/AppAuth;", "setAuth", "(Lru/netology/nmedia/auth/AppAuth;)V", "channelId", "", "content", "gson", "Lcom/google/gson/Gson;", "onCreate", "", "onMessageReceived", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FCMService extends com.google.firebase.messaging.FirebaseMessagingService {
    private final java.lang.String content = "content";
    private final java.lang.String channelId = "remote";
    private final com.google.gson.Gson gson = null;
    @javax.inject.Inject()
    public ru.netology.nmedia.auth.AppAuth auth;
    
    public FCMService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.netology.nmedia.auth.AppAuth getAuth() {
        return null;
    }
    
    public final void setAuth(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.auth.AppAuth p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage message) {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
}