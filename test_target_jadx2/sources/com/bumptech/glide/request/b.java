package com.bumptech.glide.request;

import com.bumptech.glide.request.e;

/* loaded from: classes.dex */
public final class b implements e, d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20366a;

    /* renamed from: b, reason: collision with root package name */
    private final e f20367b;

    /* renamed from: c, reason: collision with root package name */
    private volatile d f20368c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f20369d;

    /* renamed from: e, reason: collision with root package name */
    private e.a f20370e;

    /* renamed from: f, reason: collision with root package name */
    private e.a f20371f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f20370e = aVar;
        this.f20371f = aVar;
        this.f20366a = obj;
        this.f20367b = eVar;
    }

    private boolean a(d dVar) {
        e.a aVar;
        e.a aVar2 = this.f20370e;
        e.a aVar3 = e.a.FAILED;
        return aVar2 != aVar3 ? dVar.equals(this.f20368c) : dVar.equals(this.f20369d) && ((aVar = this.f20371f) == e.a.SUCCESS || aVar == aVar3);
    }

    private boolean b() {
        e eVar = this.f20367b;
        return eVar == null || eVar.canNotifyCleared(this);
    }

    private boolean c() {
        e eVar = this.f20367b;
        return eVar == null || eVar.canNotifyStatusChanged(this);
    }

    private boolean d() {
        e eVar = this.f20367b;
        return eVar == null || eVar.canSetImage(this);
    }

    @Override // com.bumptech.glide.request.d
    public void begin() {
        synchronized (this.f20366a) {
            try {
                e.a aVar = this.f20370e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f20370e = aVar2;
                    this.f20368c.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean canNotifyCleared(d dVar) {
        boolean z10;
        synchronized (this.f20366a) {
            try {
                z10 = b() && dVar.equals(this.f20368c);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean canNotifyStatusChanged(d dVar) {
        boolean z10;
        synchronized (this.f20366a) {
            try {
                z10 = c() && a(dVar);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean canSetImage(d dVar) {
        boolean d10;
        synchronized (this.f20366a) {
            d10 = d();
        }
        return d10;
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        synchronized (this.f20366a) {
            try {
                e.a aVar = e.a.CLEARED;
                this.f20370e = aVar;
                this.f20368c.clear();
                if (this.f20371f != aVar) {
                    this.f20371f = aVar;
                    this.f20369d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(d dVar, d dVar2) {
        this.f20368c = dVar;
        this.f20369d = dVar2;
    }

    @Override // com.bumptech.glide.request.e
    public e getRoot() {
        e root;
        synchronized (this.f20366a) {
            try {
                e eVar = this.f20367b;
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
        synchronized (this.f20366a) {
            try {
                z10 = this.f20368c.isAnyResourceSet() || this.f20369d.isAnyResourceSet();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f20366a) {
            try {
                e.a aVar = this.f20370e;
                e.a aVar2 = e.a.CLEARED;
                z10 = aVar == aVar2 && this.f20371f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f20366a) {
            try {
                e.a aVar = this.f20370e;
                e.a aVar2 = e.a.SUCCESS;
                z10 = aVar == aVar2 || this.f20371f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isEquivalentTo(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        return this.f20368c.isEquivalentTo(bVar.f20368c) && this.f20369d.isEquivalentTo(bVar.f20369d);
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f20366a) {
            try {
                e.a aVar = this.f20370e;
                e.a aVar2 = e.a.RUNNING;
                z10 = aVar == aVar2 || this.f20371f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void onRequestFailed(d dVar) {
        synchronized (this.f20366a) {
            try {
                if (dVar.equals(this.f20369d)) {
                    this.f20371f = e.a.FAILED;
                    e eVar = this.f20367b;
                    if (eVar != null) {
                        eVar.onRequestFailed(this);
                    }
                    return;
                }
                this.f20370e = e.a.FAILED;
                e.a aVar = this.f20371f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f20371f = aVar2;
                    this.f20369d.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void onRequestSuccess(d dVar) {
        synchronized (this.f20366a) {
            try {
                if (dVar.equals(this.f20368c)) {
                    this.f20370e = e.a.SUCCESS;
                } else if (dVar.equals(this.f20369d)) {
                    this.f20371f = e.a.SUCCESS;
                }
                e eVar = this.f20367b;
                if (eVar != null) {
                    eVar.onRequestSuccess(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public void pause() {
        synchronized (this.f20366a) {
            try {
                e.a aVar = this.f20370e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f20370e = e.a.PAUSED;
                    this.f20368c.pause();
                }
                if (this.f20371f == aVar2) {
                    this.f20371f = e.a.PAUSED;
                    this.f20369d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
