package Q5;

import D5.w;
import v5.I;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final D5.j f8193a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.core.n f8194b;

    /* renamed from: c, reason: collision with root package name */
    public final I f8195c;

    /* renamed from: d, reason: collision with root package name */
    public final D5.o f8196d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8197e;

    protected i(D5.j jVar, com.fasterxml.jackson.core.n nVar, I i10, D5.o oVar, boolean z10) {
        this.f8193a = jVar;
        this.f8194b = nVar;
        this.f8195c = i10;
        this.f8196d = oVar;
        this.f8197e = z10;
    }

    public static i a(D5.j jVar, w wVar, I i10, boolean z10) {
        String c10 = wVar == null ? null : wVar.c();
        return new i(jVar, c10 != null ? new y5.h(c10) : null, i10, null, z10);
    }

    public i b(boolean z10) {
        return z10 == this.f8197e ? this : new i(this.f8193a, this.f8194b, this.f8195c, this.f8196d, z10);
    }

    public i c(D5.o oVar) {
        return new i(this.f8193a, this.f8194b, this.f8195c, oVar, this.f8197e);
    }
}
