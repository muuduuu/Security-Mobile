package kotlin.io;

import java.io.Closeable;
import lc.AbstractC3622a;

/* loaded from: classes3.dex */
public abstract class c {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC3622a.a(th, th2);
            }
        }
    }
}
