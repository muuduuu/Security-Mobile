package Jd;

import java.util.concurrent.CancellationException;

/* renamed from: Jd.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0892k0 {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
