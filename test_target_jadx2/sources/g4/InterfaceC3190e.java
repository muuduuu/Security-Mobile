package g4;

import f3.InterfaceC3145d;
import java.io.Closeable;

/* renamed from: g4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3190e extends Closeable, k, InterfaceC3145d, N3.a {
    k G();

    int M();

    boolean Y1();

    n c1();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    int getWidth();

    boolean isClosed();
}
