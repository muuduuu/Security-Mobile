package pe;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes3.dex */
public interface Z extends Closeable, Flushable {
    c0 A();

    void N0(C3877e c3877e, long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
