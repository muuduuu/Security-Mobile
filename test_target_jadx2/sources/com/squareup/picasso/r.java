package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum r {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    final int index;

    r(int i10) {
        this.index = i10;
    }

    public static boolean isOfflineOnly(int i10) {
        return (i10 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
