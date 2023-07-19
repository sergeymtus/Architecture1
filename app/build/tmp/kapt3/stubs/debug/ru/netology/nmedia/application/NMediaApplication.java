package ru.netology.nmedia.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lru/netology/nmedia/application/NMediaApplication;", "Landroid/app/Application;", "()V", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "auth", "Lru/netology/nmedia/auth/AppAuth;", "getAuth", "()Lru/netology/nmedia/auth/AppAuth;", "setAuth", "(Lru/netology/nmedia/auth/AppAuth;)V", "onCreate", "", "setupAuth", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class NMediaApplication extends android.app.Application {
    private final kotlinx.coroutines.CoroutineScope appScope = null;
    @javax.inject.Inject()
    public ru.netology.nmedia.auth.AppAuth auth;
    
    public NMediaApplication() {
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
    
    private final void setupAuth() {
    }
}