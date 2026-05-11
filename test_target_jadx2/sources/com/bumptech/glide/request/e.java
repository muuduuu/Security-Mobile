package com.bumptech.glide.request;

/* loaded from: classes.dex */
public interface e {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        a(boolean z10) {
            this.isComplete = z10;
        }

        boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean canNotifyCleared(d dVar);

    boolean canNotifyStatusChanged(d dVar);

    boolean canSetImage(d dVar);

    e getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(d dVar);

    void onRequestSuccess(d dVar);
}
