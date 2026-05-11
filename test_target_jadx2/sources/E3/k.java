package e3;

import b3.q;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class k extends OutputStream {
    public abstract h a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            q.a(e10);
        }
    }

    public abstract int size();
}
