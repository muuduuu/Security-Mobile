package b3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1647b {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f18541a = Logger.getLogger(AbstractC1647b.class.getName());

    public static void a(Closeable closeable, boolean z10) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            if (!z10) {
                throw e10;
            }
            f18541a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e10);
        }
    }

    public static void b(InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
