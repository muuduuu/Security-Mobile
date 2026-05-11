package androidx.camera.core.impl;

import A.C0696f0;
import A.C0716t;
import A.u0;
import android.os.SystemClock;
import androidx.camera.core.impl.Q;

/* loaded from: classes.dex */
public final class J implements u0.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f14415a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14416b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14417c;

    /* renamed from: d, reason: collision with root package name */
    private final Throwable f14418d;

    public J(long j10, int i10, Throwable th) {
        this.f14417c = SystemClock.elapsedRealtime() - j10;
        this.f14416b = i10;
        if (th instanceof Q.b) {
            this.f14415a = 2;
            this.f14418d = th;
            return;
        }
        if (!(th instanceof C0696f0)) {
            this.f14415a = 0;
            this.f14418d = th;
            return;
        }
        Throwable cause = th.getCause();
        th = cause != null ? cause : th;
        this.f14418d = th;
        if (th instanceof C0716t) {
            this.f14415a = 2;
        } else if (th instanceof IllegalArgumentException) {
            this.f14415a = 1;
        } else {
            this.f14415a = 0;
        }
    }

    @Override // A.u0.b
    public int c() {
        return this.f14415a;
    }

    @Override // A.u0.b
    public Throwable d() {
        return this.f14418d;
    }

    @Override // A.u0.b
    public long e() {
        return this.f14417c;
    }
}
