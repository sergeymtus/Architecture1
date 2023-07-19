package ru.netology.nmedia.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0019\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J#\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lru/netology/nmedia/repository/PostRepository;", "", "data", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lru/netology/nmedia/dto/Post;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "getAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewerCount", "", "id", "", "likeById", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeById", "save", "post", "upload", "Lru/netology/nmedia/dto/MediaUpload;", "(Lru/netology/nmedia/dto/Post;Lru/netology/nmedia/dto/MediaUpload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/netology/nmedia/dto/Media;", "(Lru/netology/nmedia/dto/MediaUpload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PostRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<ru.netology.nmedia.dto.Post>> getData();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getNewerCount(long id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.dto.Post post, @org.jetbrains.annotations.Nullable()
    ru.netology.nmedia.dto.MediaUpload upload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object likeById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object upload(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.dto.MediaUpload upload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.netology.nmedia.dto.Media> continuation);
}