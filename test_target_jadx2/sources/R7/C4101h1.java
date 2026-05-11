package r7;

import V6.AbstractC1286q;

/* renamed from: r7.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4101h1 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC4076e6 f40038a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f40039b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f40040c;

    /* renamed from: d, reason: collision with root package name */
    private final M5 f40041d;

    /* renamed from: e, reason: collision with root package name */
    private final C4058c8 f40042e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC4140l0 f40043f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC4140l0 f40044g;

    /* synthetic */ C4101h1(C4081f1 c4081f1, AbstractC4091g1 abstractC4091g1) {
        EnumC4076e6 enumC4076e6;
        Boolean bool;
        C4058c8 c4058c8;
        AbstractC4140l0 abstractC4140l0;
        AbstractC4140l0 abstractC4140l02;
        enumC4076e6 = c4081f1.f39995a;
        this.f40038a = enumC4076e6;
        this.f40039b = null;
        bool = c4081f1.f39996b;
        this.f40040c = bool;
        this.f40041d = null;
        c4058c8 = c4081f1.f39997c;
        this.f40042e = c4058c8;
        abstractC4140l0 = c4081f1.f39998d;
        this.f40043f = abstractC4140l0;
        abstractC4140l02 = c4081f1.f39999e;
        this.f40044g = abstractC4140l02;
    }

    public final AbstractC4140l0 a() {
        return this.f40043f;
    }

    public final AbstractC4140l0 b() {
        return this.f40044g;
    }

    public final EnumC4076e6 c() {
        return this.f40038a;
    }

    public final C4058c8 d() {
        return this.f40042e;
    }

    public final Boolean e() {
        return this.f40040c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4101h1)) {
            return false;
        }
        C4101h1 c4101h1 = (C4101h1) obj;
        return AbstractC1286q.a(this.f40038a, c4101h1.f40038a) && AbstractC1286q.a(null, null) && AbstractC1286q.a(this.f40040c, c4101h1.f40040c) && AbstractC1286q.a(null, null) && AbstractC1286q.a(this.f40042e, c4101h1.f40042e) && AbstractC1286q.a(this.f40043f, c4101h1.f40043f) && AbstractC1286q.a(this.f40044g, c4101h1.f40044g);
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f40038a, null, this.f40040c, null, this.f40042e, this.f40043f, this.f40044g);
    }
}
