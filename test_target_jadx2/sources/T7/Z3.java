package t7;

import V6.AbstractC1286q;

/* loaded from: classes2.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    private final X3 f42800a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f42801b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f42802c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f42803d;

    /* synthetic */ Z3(W3 w32, Y3 y32) {
        X3 x32;
        Integer num;
        x32 = w32.f42758a;
        this.f42800a = x32;
        num = w32.f42759b;
        this.f42801b = num;
        this.f42802c = null;
        this.f42803d = null;
    }

    public final X3 a() {
        return this.f42800a;
    }

    public final Integer b() {
        return this.f42801b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z3)) {
            return false;
        }
        Z3 z32 = (Z3) obj;
        return AbstractC1286q.a(this.f42800a, z32.f42800a) && AbstractC1286q.a(this.f42801b, z32.f42801b) && AbstractC1286q.a(null, null) && AbstractC1286q.a(null, null);
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f42800a, this.f42801b, null, null);
    }
}
