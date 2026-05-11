package androidx.core.util;

import kotlin.jvm.internal.Intrinsics;
import y0.d;

/* loaded from: classes.dex */
public class Pools$SimplePool implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f16020a;

    /* renamed from: b, reason: collision with root package name */
    private int f16021b;

    public Pools$SimplePool(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f16020a = new Object[i10];
    }

    private final boolean c(Object obj) {
        int i10 = this.f16021b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f16020a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // y0.d
    public boolean a(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f16021b;
        Object[] objArr = this.f16020a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f16021b = i10 + 1;
        return true;
    }

    @Override // y0.d
    public Object b() {
        int i10 = this.f16021b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f16020a[i11];
        Intrinsics.e(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f16020a[i11] = null;
        this.f16021b--;
        return obj;
    }
}
