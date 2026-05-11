package uc;

import lc.AbstractC3622a;

/* renamed from: uc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4881a {
    public static final void a(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                AbstractC3622a.a(th, th2);
            }
        }
    }
}
