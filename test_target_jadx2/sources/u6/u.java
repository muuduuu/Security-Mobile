package u6;

import C6.InterfaceC0753d;
import android.content.Context;
import java.io.Closeable;

/* loaded from: classes2.dex */
abstract class u implements Closeable {

    interface a {
        a a(Context context);

        u c();
    }

    u() {
    }

    abstract InterfaceC0753d a();

    abstract t b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }
}
