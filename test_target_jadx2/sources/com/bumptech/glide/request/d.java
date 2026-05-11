package com.bumptech.glide.request;

/* loaded from: classes.dex */
public interface d {
    void begin();

    void clear();

    boolean isAnyResourceSet();

    boolean isCleared();

    boolean isComplete();

    boolean isEquivalentTo(d dVar);

    boolean isRunning();

    void pause();
}
