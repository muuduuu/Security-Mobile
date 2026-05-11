package r7;

import V6.AbstractC1286q;

/* loaded from: classes2.dex */
public final class M5 {

    /* renamed from: a, reason: collision with root package name */
    private final K5 f39522a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f39523b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f39524c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f39525d;

    /* synthetic */ M5(J5 j52, L5 l52) {
        K5 k52;
        Integer num;
        k52 = j52.f39463a;
        this.f39522a = k52;
        num = j52.f39464b;
        this.f39523b = num;
        this.f39524c = null;
        this.f39525d = null;
    }

    public final K5 a() {
        return this.f39522a;
    }

    public final Integer b() {
        return this.f39523b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M5)) {
            return false;
        }
        M5 m52 = (M5) obj;
        return AbstractC1286q.a(this.f39522a, m52.f39522a) && AbstractC1286q.a(this.f39523b, m52.f39523b) && AbstractC1286q.a(null, null) && AbstractC1286q.a(null, null);
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f39522a, this.f39523b, null, null);
    }
}
