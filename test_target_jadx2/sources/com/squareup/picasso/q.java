package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum q {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    q(int i10) {
        this.index = i10;
    }

    static boolean shouldReadFromMemoryCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    static boolean shouldWriteToMemoryCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
