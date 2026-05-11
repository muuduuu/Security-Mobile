package Ld;

import Ld.k;
import Od.P;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lc.AbstractC3622a;
import xc.C5142C;

/* loaded from: classes3.dex */
public class r extends e {

    /* renamed from: m, reason: collision with root package name */
    private final int f5811m;

    /* renamed from: n, reason: collision with root package name */
    private final a f5812n;

    public r(int i10, a aVar, Function1 function1) {
        super(i10, function1);
        this.f5811m = i10;
        this.f5812n = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C5142C.b(e.class).q() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ Object o1(r rVar, Object obj, kotlin.coroutines.d dVar) {
        P c10;
        Object q12 = rVar.q1(obj, true);
        if (!(q12 instanceof k.a)) {
            return Unit.f36324a;
        }
        k.e(q12);
        Function1 function1 = rVar.f5766b;
        if (function1 == null || (c10 = Od.w.c(function1, obj, null, 2, null)) == null) {
            throw rVar.j0();
        }
        AbstractC3622a.a(c10, rVar.j0());
        throw c10;
    }

    private final Object p1(Object obj, boolean z10) {
        Function1 function1;
        P c10;
        Object B10 = super.B(obj);
        if (k.i(B10) || k.h(B10)) {
            return B10;
        }
        if (!z10 || (function1 = this.f5766b) == null || (c10 = Od.w.c(function1, obj, null, 2, null)) == null) {
            return k.f5805b.c(Unit.f36324a);
        }
        throw c10;
    }

    private final Object q1(Object obj, boolean z10) {
        return this.f5812n == a.DROP_LATEST ? p1(obj, z10) : e1(obj);
    }

    @Override // Ld.e, Ld.x
    public Object B(Object obj) {
        return q1(obj, false);
    }

    @Override // Ld.e, Ld.x
    public Object D(Object obj, kotlin.coroutines.d dVar) {
        return o1(this, obj, dVar);
    }

    @Override // Ld.e
    protected boolean x0() {
        return this.f5812n == a.DROP_OLDEST;
    }
}
