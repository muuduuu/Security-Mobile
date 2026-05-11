package com.webengage.sdk.android.utils.http;

/* loaded from: classes2.dex */
public class CachePolicy {
    public static final int GET_DATA_FROM_CACHE_FIRST_ELSE_DOWNLOAD_AND_CACHE = 6;
    public static final int GET_DATA_FROM_CACHE_ONLY = 4;
    public static final int GET_DATA_FROM_NETWORK_FIRST_ELSE_FROM_CACHE = 1;
    public static final int GET_DATA_FROM_NETWORK_ONLY_NO_CACHING = 3;
    public static final int GET_VALIDATED_DATA_FROM_CACHE_FIRST_ELSE_DOWNLOAD_AND_CACHE = 2;
    public static final int GET_VALIDATED_DATA_FROM_CACHE_FIRST_ELSE_DOWNLOAD_AND_CACHE_RETURNS_NULL_IF_OFFLINE_AND_DATA_EXPIRED = 5;
}
