package e3;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface h extends Closeable {

    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    byte B(int i10);

    int E(int i10, byte[] bArr, int i11, int i12);

    long L();

    ByteBuffer h();

    boolean isClosed();

    int size();
}
