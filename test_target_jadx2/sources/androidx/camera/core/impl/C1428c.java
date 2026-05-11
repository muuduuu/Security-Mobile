package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1428c extends P {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f14538a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f14539b;

    C1428c(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f14538a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f14539b = handler;
    }

    @Override // androidx.camera.core.impl.P
    public Executor b() {
        return this.f14538a;
    }

    @Override // androidx.camera.core.impl.P
    public Handler c() {
        return this.f14539b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return this.f14538a.equals(p10.b()) && this.f14539b.equals(p10.c());
    }

    public int hashCode() {
        return ((this.f14538a.hashCode() ^ 1000003) * 1000003) ^ this.f14539b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f14538a + ", schedulerHandler=" + this.f14539b + "}";
    }
}
