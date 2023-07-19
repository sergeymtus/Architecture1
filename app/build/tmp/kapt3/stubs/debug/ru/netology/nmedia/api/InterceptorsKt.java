package ru.netology.nmedia.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"authInterceptor", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "auth", "Lru/netology/nmedia/auth/AppAuth;", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "app_debug"})
public final class InterceptorsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.logging.HttpLoggingInterceptor loggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.jvm.functions.Function1<okhttp3.Interceptor.Chain, okhttp3.Response> authInterceptor(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.auth.AppAuth auth) {
        return null;
    }
}