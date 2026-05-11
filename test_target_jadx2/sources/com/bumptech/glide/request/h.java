package com.bumptech.glide.request;

/* loaded from: classes.dex */
public class h extends a {

    /* renamed from: A, reason: collision with root package name */
    private static h f20383A;

    /* renamed from: B, reason: collision with root package name */
    private static h f20384B;

    public static h n0(Class cls) {
        return (h) new h().i(cls);
    }

    public static h o0(k2.j jVar) {
        return (h) new h().k(jVar);
    }

    public static h p0(i2.f fVar) {
        return (h) new h().f0(fVar);
    }

    public static h q0(boolean z10) {
        if (z10) {
            if (f20383A == null) {
                f20383A = (h) ((h) new h().h0(true)).b();
            }
            return f20383A;
        }
        if (f20384B == null) {
            f20384B = (h) ((h) new h().h0(false)).b();
        }
        return f20384B;
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        return (obj instanceof h) && super.equals(obj);
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return super.hashCode();
    }
}
