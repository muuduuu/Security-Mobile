package Ld;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class j {
    public static final g a(int i10, a aVar, Function1 function1) {
        g eVar;
        if (i10 == -2) {
            eVar = aVar == a.SUSPEND ? new e(g.f5801P.a(), function1) : new r(1, aVar, function1);
        } else {
            if (i10 == -1) {
                if (aVar == a.SUSPEND) {
                    return new r(1, a.DROP_OLDEST, function1);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i10 != 0) {
                return i10 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new e(i10, function1) : new r(i10, aVar, function1) : new e(Integer.MAX_VALUE, function1);
            }
            eVar = aVar == a.SUSPEND ? new e(0, function1) : new r(1, aVar, function1);
        }
        return eVar;
    }

    public static /* synthetic */ g b(int i10, a aVar, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return a(i10, aVar, function1);
    }
}
