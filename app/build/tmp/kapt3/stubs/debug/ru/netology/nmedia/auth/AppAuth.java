package ru.netology.nmedia.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lru/netology/nmedia/auth/AppAuth;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_authStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lru/netology/nmedia/auth/AuthState;", "authStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getAuthStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "idKey", "", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "tokenKey", "getApiService", "Lru/netology/nmedia/api/ApiService;", "removeAuth", "", "sendPushToken", "token", "setAuth", "id", "", "AppAuthEntryPoint", "app_debug"})
@javax.inject.Singleton()
public final class AppAuth {
    private final android.content.Context context = null;
    private final android.content.SharedPreferences prefs = null;
    private final java.lang.String idKey = "id";
    private final java.lang.String tokenKey = "token";
    private final kotlinx.coroutines.flow.MutableStateFlow<ru.netology.nmedia.auth.AuthState> _authStateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<ru.netology.nmedia.auth.AuthState> authStateFlow = null;
    
    @javax.inject.Inject()
    public AppAuth(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<ru.netology.nmedia.auth.AuthState> getAuthStateFlow() {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void setAuth(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void removeAuth() {
    }
    
    public final void sendPushToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    private final ru.netology.nmedia.api.ApiService getApiService(android.content.Context context) {
        return null;
    }
    
    @dagger.hilt.EntryPoint()
    @dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lru/netology/nmedia/auth/AppAuth$AppAuthEntryPoint;", "", "apiService", "Lru/netology/nmedia/api/ApiService;", "app_debug"})
    public static abstract interface AppAuthEntryPoint {
        
        @org.jetbrains.annotations.NotNull()
        public abstract ru.netology.nmedia.api.ApiService apiService();
    }
}