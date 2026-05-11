package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final l f30108a;

    /* renamed from: b, reason: collision with root package name */
    private final l f30109b;

    /* renamed from: c, reason: collision with root package name */
    private final l f30110c;

    /* renamed from: d, reason: collision with root package name */
    private final l f30111d;

    public m(l top, l right, l bottom, l left) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        this.f30108a = top;
        this.f30109b = right;
        this.f30110c = bottom;
        this.f30111d = left;
    }

    public final l a() {
        return this.f30110c;
    }

    public final l b() {
        return this.f30111d;
    }

    public final l c() {
        return this.f30109b;
    }

    public final l d() {
        return this.f30108a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f30108a == mVar.f30108a && this.f30109b == mVar.f30109b && this.f30110c == mVar.f30110c && this.f30111d == mVar.f30111d;
    }

    public int hashCode() {
        return (((((this.f30108a.hashCode() * 31) + this.f30109b.hashCode()) * 31) + this.f30110c.hashCode()) * 31) + this.f30111d.hashCode();
    }

    public String toString() {
        return "SafeAreaViewEdges(top=" + this.f30108a + ", right=" + this.f30109b + ", bottom=" + this.f30110c + ", left=" + this.f30111d + ")";
    }
}
