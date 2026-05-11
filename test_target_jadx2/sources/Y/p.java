package Y;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface p {

    public interface a {
        void a(boolean z10);
    }

    public static class b extends Exception {
        public b(String str) {
            super(str);
        }

        public b(Throwable th) {
            super(th);
        }
    }

    public static abstract class c {
        public static c c(int i10, long j10) {
            return new v(i10, j10);
        }

        public abstract int a();

        public abstract long b();
    }

    void a();

    void b(a aVar, Executor executor);

    c read(ByteBuffer byteBuffer);

    void start();

    void stop();
}
