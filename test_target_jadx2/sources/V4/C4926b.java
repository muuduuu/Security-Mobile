package v4;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4926b implements y0.d {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f43919a;

    /* renamed from: b, reason: collision with root package name */
    private int f43920b;

    public C4926b(int i10) {
        this.f43919a = new Object[i10];
    }

    @Override // y0.d
    public synchronized boolean a(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i10 = this.f43920b;
        Object[] objArr = this.f43919a;
        if (i10 == objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f43920b = i10 + 1;
        return true;
    }

    @Override // y0.d
    public synchronized Object b() {
        int i10 = this.f43920b;
        if (i10 == 0) {
            return null;
        }
        int i11 = i10 - 1;
        this.f43920b = i11;
        Object obj = this.f43919a[i11];
        Intrinsics.e(obj, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        this.f43919a[i11] = null;
        return obj;
    }

    public final synchronized void c() {
        try {
            int i10 = this.f43920b;
            for (int i11 = 0; i11 < i10; i11++) {
                this.f43919a[i11] = null;
            }
            this.f43920b = 0;
        } catch (Throwable th) {
            throw th;
        }
    }
}
