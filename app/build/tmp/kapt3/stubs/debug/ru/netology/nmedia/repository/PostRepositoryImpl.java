package ru.netology.nmedia.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0019\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J#\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lru/netology/nmedia/repository/PostRepositoryImpl;", "Lru/netology/nmedia/repository/PostRepository;", "postDao", "Lru/netology/nmedia/dao/PostDao;", "apiService", "Lru/netology/nmedia/api/ApiService;", "(Lru/netology/nmedia/dao/PostDao;Lru/netology/nmedia/api/ApiService;)V", "data", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lru/netology/nmedia/dto/Post;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "getAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewerCount", "", "id", "", "likeById", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeById", "save", "post", "upload", "Lru/netology/nmedia/dto/MediaUpload;", "(Lru/netology/nmedia/dto/Post;Lru/netology/nmedia/dto/MediaUpload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/netology/nmedia/dto/Media;", "(Lru/netology/nmedia/dto/MediaUpload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class PostRepositoryImpl implements ru.netology.nmedia.repository.PostRepository {
    private final ru.netology.nmedia.dao.PostDao postDao = null;
    private final ru.netology.nmedia.api.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<ru.netology.nmedia.dto.Post>> data = null;
    
    @javax.inject.Inject()
    public PostRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.dao.PostDao postDao, @org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.api.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<ru.netology.nmedia.dto.Post>> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.Integer> getNewerCount(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object save(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.dto.Post post, @org.jetbrains.annotations.Nullable()
    ru.netology.nmedia.dto.MediaUpload upload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object likeById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object upload(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.dto.MediaUpload upload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.netology.nmedia.dto.Media> continuation) {
        return null;
    }
}