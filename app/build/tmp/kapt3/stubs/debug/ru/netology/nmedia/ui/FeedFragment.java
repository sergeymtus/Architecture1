package ru.netology.nmedia.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\""}, d2 = {"Lru/netology/nmedia/ui/FeedFragment;", "Landroidx/fragment/app/Fragment;", "()V", "auth", "Lru/netology/nmedia/auth/AppAuth;", "getAuth", "()Lru/netology/nmedia/auth/AppAuth;", "setAuth", "(Lru/netology/nmedia/auth/AppAuth;)V", "repository", "Lru/netology/nmedia/repository/PostRepository;", "getRepository", "()Lru/netology/nmedia/repository/PostRepository;", "setRepository", "(Lru/netology/nmedia/repository/PostRepository;)V", "viewModel", "Lru/netology/nmedia/viewmodel/PostViewModel;", "getViewModel", "()Lru/netology/nmedia/viewmodel/PostViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelAuth", "Lru/netology/nmedia/viewmodel/AuthViewModel;", "getViewModelAuth", "()Lru/netology/nmedia/viewmodel/AuthViewModel;", "viewModelAuth$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FeedFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public ru.netology.nmedia.repository.PostRepository repository;
    @javax.inject.Inject()
    public ru.netology.nmedia.auth.AppAuth auth;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy viewModelAuth$delegate = null;
    
    public FeedFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.netology.nmedia.repository.PostRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.repository.PostRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.netology.nmedia.auth.AppAuth getAuth() {
        return null;
    }
    
    public final void setAuth(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.auth.AppAuth p0) {
    }
    
    private final ru.netology.nmedia.viewmodel.PostViewModel getViewModel() {
        return null;
    }
    
    private final ru.netology.nmedia.viewmodel.AuthViewModel getViewModelAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
}