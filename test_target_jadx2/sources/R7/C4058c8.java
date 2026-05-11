package r7;

import V6.AbstractC1286q;

/* renamed from: r7.c8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4058c8 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4140l0 f39951a;

    /* synthetic */ C4058c8(C4038a8 c4038a8, AbstractC4048b8 abstractC4048b8) {
        AbstractC4140l0 abstractC4140l0;
        abstractC4140l0 = c4038a8.f39908a;
        this.f39951a = abstractC4140l0;
    }

    public final AbstractC4140l0 a() {
        return this.f39951a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4058c8) {
            return AbstractC1286q.a(this.f39951a, ((C4058c8) obj).f39951a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f39951a);
    }
}
