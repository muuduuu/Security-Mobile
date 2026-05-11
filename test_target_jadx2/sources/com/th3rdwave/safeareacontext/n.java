package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final a f30112a;

    /* renamed from: b, reason: collision with root package name */
    private final o f30113b;

    /* renamed from: c, reason: collision with root package name */
    private final m f30114c;

    public n(a insets, o mode, m edges) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f30112a = insets;
        this.f30113b = mode;
        this.f30114c = edges;
    }

    public final m a() {
        return this.f30114c;
    }

    public final a b() {
        return this.f30112a;
    }

    public final o c() {
        return this.f30113b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.b(this.f30112a, nVar.f30112a) && this.f30113b == nVar.f30113b && Intrinsics.b(this.f30114c, nVar.f30114c);
    }

    public int hashCode() {
        return (((this.f30112a.hashCode() * 31) + this.f30113b.hashCode()) * 31) + this.f30114c.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f30112a + ", mode=" + this.f30113b + ", edges=" + this.f30114c + ")";
    }
}
