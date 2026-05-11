package t7;

import V6.AbstractC1286q;

/* loaded from: classes2.dex */
public final class V3 {

    /* renamed from: a, reason: collision with root package name */
    private final S3 f42739a;

    /* renamed from: b, reason: collision with root package name */
    private final Q3 f42740b;

    /* renamed from: c, reason: collision with root package name */
    private final T3 f42741c;

    /* renamed from: d, reason: collision with root package name */
    private final R3 f42742d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f42743e;

    /* renamed from: f, reason: collision with root package name */
    private final Float f42744f;

    /* synthetic */ V3(P3 p32, U3 u32) {
        S3 s32;
        Q3 q32;
        T3 t32;
        R3 r32;
        Boolean bool;
        Float f10;
        s32 = p32.f42666a;
        this.f42739a = s32;
        q32 = p32.f42667b;
        this.f42740b = q32;
        t32 = p32.f42668c;
        this.f42741c = t32;
        r32 = p32.f42669d;
        this.f42742d = r32;
        bool = p32.f42670e;
        this.f42743e = bool;
        f10 = p32.f42671f;
        this.f42744f = f10;
    }

    public final Q3 a() {
        return this.f42740b;
    }

    public final R3 b() {
        return this.f42742d;
    }

    public final S3 c() {
        return this.f42739a;
    }

    public final T3 d() {
        return this.f42741c;
    }

    public final Boolean e() {
        return this.f42743e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V3)) {
            return false;
        }
        V3 v32 = (V3) obj;
        return AbstractC1286q.a(this.f42739a, v32.f42739a) && AbstractC1286q.a(this.f42740b, v32.f42740b) && AbstractC1286q.a(this.f42741c, v32.f42741c) && AbstractC1286q.a(this.f42742d, v32.f42742d) && AbstractC1286q.a(this.f42743e, v32.f42743e) && AbstractC1286q.a(this.f42744f, v32.f42744f);
    }

    public final Float f() {
        return this.f42744f;
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f42739a, this.f42740b, this.f42741c, this.f42742d, this.f42743e, this.f42744f);
    }
}
