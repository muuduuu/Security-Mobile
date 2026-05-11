package I0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Md.s f4200a;

    public l() {
        H h10 = H.f4020b;
        Intrinsics.e(h10, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f4200a = Md.y.a(h10);
    }

    public final D a() {
        return (D) this.f4200a.getValue();
    }

    public final Md.e b() {
        return this.f4200a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6.a() > r2.a()) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D c(D newState) {
        Object value;
        D d10;
        Intrinsics.checkNotNullParameter(newState, "newState");
        Md.s sVar = this.f4200a;
        do {
            value = sVar.getValue();
            d10 = (D) value;
            if (!(d10 instanceof x ? true : Intrinsics.b(d10, H.f4020b))) {
                if (!(d10 instanceof C0840f)) {
                    if (!(d10 instanceof r)) {
                        throw new lc.m();
                    }
                }
            }
            d10 = newState;
        } while (!sVar.a(value, d10));
        return d10;
    }
}
