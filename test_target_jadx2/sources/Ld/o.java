package Ld;

import Jd.AbstractC0892k0;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
abstract /* synthetic */ class o {
    public static final void a(w wVar, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = AbstractC0892k0.a("Channel was consumed, consumer had failed", th);
            }
        }
        wVar.d(r0);
    }
}
