package ru.netology.nmedia.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lru/netology/nmedia/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "auth", "Lru/netology/nmedia/auth/AppAuth;", "(Lru/netology/nmedia/auth/AppAuth;)V", "authenticated", "", "getAuthenticated", "()Z", "data", "Landroidx/lifecycle/LiveData;", "Lru/netology/nmedia/auth/AuthState;", "getData", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final ru.netology.nmedia.auth.AppAuth auth = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ru.netology.nmedia.auth.AuthState> data = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.auth.AppAuth auth) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ru.netology.nmedia.auth.AuthState> getData() {
        return null;
    }
    
    public final boolean getAuthenticated() {
        return false;
    }
}