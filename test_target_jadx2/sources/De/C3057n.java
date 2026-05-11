package de;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: de.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3057n {

    /* renamed from: c, reason: collision with root package name */
    public static final a f32079c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f32080a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f32081b = new int[10];

    /* renamed from: de.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final int a(int i10) {
        return this.f32081b[i10];
    }

    public final int b() {
        if ((this.f32080a & 2) != 0) {
            return this.f32081b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f32080a & 128) != 0) {
            return this.f32081b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f32080a & 16) != 0) {
            return this.f32081b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i10) {
        return (this.f32080a & 32) != 0 ? this.f32081b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f32080a) != 0;
    }

    public final void g(C3057n other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
        }
    }

    public final C3057n h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f32081b;
            if (i10 < iArr.length) {
                this.f32080a = (1 << i10) | this.f32080a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f32080a);
    }
}
