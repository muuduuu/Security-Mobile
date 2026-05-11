package Md;

import Nd.n;

/* loaded from: classes3.dex */
abstract /* synthetic */ class k {
    public static final e a(e eVar, int i10, Ld.a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != Ld.a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = Ld.a.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        Ld.a aVar2 = aVar;
        if (eVar instanceof Nd.n) {
            return n.a.a((Nd.n) eVar, null, i11, aVar2, 1, null);
        }
        return new Nd.h(eVar, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ e b(e eVar, int i10, Ld.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = Ld.a.SUSPEND;
        }
        return g.a(eVar, i10, aVar);
    }

    public static final e c(e eVar) {
        return b(eVar, -1, null, 2, null);
    }
}
