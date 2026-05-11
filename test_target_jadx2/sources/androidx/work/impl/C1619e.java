package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.work.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1619e implements x1.w {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f18325a = androidx.core.os.h.a(Looper.getMainLooper());

    @Override // x1.w
    public void a(long j10, Runnable runnable) {
        this.f18325a.postDelayed(runnable, j10);
    }

    @Override // x1.w
    public void b(Runnable runnable) {
        this.f18325a.removeCallbacks(runnable);
    }
}
