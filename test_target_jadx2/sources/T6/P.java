package T6;

import V6.AbstractC1286q;
import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
final class P {

    /* renamed from: a, reason: collision with root package name */
    private final C1163b f9374a;

    /* renamed from: b, reason: collision with root package name */
    private final C2012d f9375b;

    /* synthetic */ P(C1163b c1163b, C2012d c2012d, O o10) {
        this.f9374a = c1163b;
        this.f9375b = c2012d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof P)) {
            P p10 = (P) obj;
            if (AbstractC1286q.a(this.f9374a, p10.f9374a) && AbstractC1286q.a(this.f9375b, p10.f9375b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f9374a, this.f9375b);
    }

    public final String toString() {
        return AbstractC1286q.c(this).a("key", this.f9374a).a("feature", this.f9375b).toString();
    }
}
