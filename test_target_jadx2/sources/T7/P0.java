package t7;

import V6.AbstractC1286q;

/* loaded from: classes2.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC4721l4 f42650a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f42651b;

    /* renamed from: c, reason: collision with root package name */
    private final Z3 f42652c;

    /* renamed from: d, reason: collision with root package name */
    private final V3 f42653d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f42654e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f42655f;

    /* synthetic */ P0(N0 n02, O0 o02) {
        EnumC4721l4 enumC4721l4;
        Boolean bool;
        V3 v32;
        Integer num;
        Integer num2;
        enumC4721l4 = n02.f42609a;
        this.f42650a = enumC4721l4;
        bool = n02.f42610b;
        this.f42651b = bool;
        this.f42652c = null;
        v32 = n02.f42611c;
        this.f42653d = v32;
        num = n02.f42612d;
        this.f42654e = num;
        num2 = n02.f42613e;
        this.f42655f = num2;
    }

    public final V3 a() {
        return this.f42653d;
    }

    public final EnumC4721l4 b() {
        return this.f42650a;
    }

    public final Boolean c() {
        return this.f42651b;
    }

    public final Integer d() {
        return this.f42654e;
    }

    public final Integer e() {
        return this.f42655f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return false;
        }
        P0 p02 = (P0) obj;
        return AbstractC1286q.a(this.f42650a, p02.f42650a) && AbstractC1286q.a(this.f42651b, p02.f42651b) && AbstractC1286q.a(null, null) && AbstractC1286q.a(this.f42653d, p02.f42653d) && AbstractC1286q.a(this.f42654e, p02.f42654e) && AbstractC1286q.a(this.f42655f, p02.f42655f);
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f42650a, this.f42651b, null, this.f42653d, this.f42654e, this.f42655f);
    }
}
