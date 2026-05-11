package com.bumptech.glide.request;

import com.bumptech.glide.request.e;

/* loaded from: classes.dex */
public class ThumbnailRequestCoordinator implements e, d {
    private volatile d full;
    private e.a fullState;
    private boolean isRunningDuringBegin;
    private final e parent;
    private final Object requestLock;
    private volatile d thumb;
    private e.a thumbState;

    public ThumbnailRequestCoordinator(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.fullState = aVar;
        this.thumbState = aVar;
        this.requestLock = obj;
        this.parent = eVar;
    }

    private boolean parentCanNotifyCleared() {
        e eVar = this.parent;
        return eVar == null || eVar.canNotifyCleared(this);
    }

    private boolean parentCanNotifyStatusChanged() {
        e eVar = this.parent;
        return eVar == null || eVar.canNotifyStatusChanged(this);
    }

    private boolean parentCanSetImage() {
        e eVar = this.parent;
        return eVar == null || eVar.canSetImage(this);
    }

    @Override // com.bumptech.glide.request.d
    public void begin() {
        synchronized (this.requestLock) {
            try {
                this.isRunningDuringBegin = true;
                try {
                    if (this.fullState != e.a.SUCCESS) {
                        e.a aVar = this.thumbState;
                        e.a aVar2 = e.a.RUNNING;
                        if (aVar != aVar2) {
                            this.thumbState = aVar2;
                            this.thumb.begin();
                        }
                    }
                    if (this.isRunningDuringBegin) {
                        e.a aVar3 = this.fullState;
                        e.a aVar4 = e.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.fullState = aVar4;
                            this.full.begin();
                        }
                    }
                    this.isRunningDuringBegin = false;
                } catch (Throwable th) {
                    this.isRunningDuringBegin = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean canNotifyCleared(d dVar) {
        boolean z10;
        synchronized (this.requestLock) {
            try {
                z10 = parentCanNotifyCleared() && dVar.equals(this.full) && this.fullState != e.a.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean canNotifyStatusChanged(d dVar) {
        boolean z10;
        synchronized (this.requestLock) {
            try {
                z10 = parentCanNotifyStatusChanged() && dVar.equals(this.full) && !isAnyResourceSet();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean canSetImage(d dVar) {
        boolean z10;
        synchronized (this.requestLock) {
            try {
                z10 = parentCanSetImage() && (dVar.equals(this.full) || this.fullState != e.a.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        synchronized (this.requestLock) {
            this.isRunningDuringBegin = false;
            e.a aVar = e.a.CLEARED;
            this.fullState = aVar;
            this.thumbState = aVar;
            this.thumb.clear();
            this.full.clear();
        }
    }

    @Override // com.bumptech.glide.request.e
    public e getRoot() {
        e root;
        synchronized (this.requestLock) {
            try {
                e eVar = this.parent;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.e, com.bumptech.glide.request.d
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.requestLock) {
            try {
                z10 = this.thumb.isAnyResourceSet() || this.full.isAnyResourceSet();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isCleared() {
        boolean z10;
        synchronized (this.requestLock) {
            z10 = this.fullState == e.a.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.requestLock) {
            z10 = this.fullState == e.a.SUCCESS;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isEquivalentTo(d dVar) {
        if (!(dVar instanceof ThumbnailRequestCoordinator)) {
            return false;
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator = (ThumbnailRequestCoordinator) dVar;
        if (this.full == null) {
            if (thumbnailRequestCoordinator.full != null) {
                return false;
            }
        } else if (!this.full.isEquivalentTo(thumbnailRequestCoordinator.full)) {
            return false;
        }
        if (this.thumb == null) {
            if (thumbnailRequestCoordinator.thumb != null) {
                return false;
            }
        } else if (!this.thumb.isEquivalentTo(thumbnailRequestCoordinator.thumb)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.requestLock) {
            z10 = this.fullState == e.a.RUNNING;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void onRequestFailed(d dVar) {
        synchronized (this.requestLock) {
            try {
                if (!dVar.equals(this.full)) {
                    this.thumbState = e.a.FAILED;
                    return;
                }
                this.fullState = e.a.FAILED;
                e eVar = this.parent;
                if (eVar != null) {
                    eVar.onRequestFailed(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void onRequestSuccess(d dVar) {
        synchronized (this.requestLock) {
            try {
                if (dVar.equals(this.thumb)) {
                    this.thumbState = e.a.SUCCESS;
                    return;
                }
                this.fullState = e.a.SUCCESS;
                e eVar = this.parent;
                if (eVar != null) {
                    eVar.onRequestSuccess(this);
                }
                if (!this.thumbState.isComplete()) {
                    this.thumb.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public void pause() {
        synchronized (this.requestLock) {
            try {
                if (!this.thumbState.isComplete()) {
                    this.thumbState = e.a.PAUSED;
                    this.thumb.pause();
                }
                if (!this.fullState.isComplete()) {
                    this.fullState = e.a.PAUSED;
                    this.full.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setRequests(d dVar, d dVar2) {
        this.full = dVar;
        this.thumb = dVar2;
    }
}
