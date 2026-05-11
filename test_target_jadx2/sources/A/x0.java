package A;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public interface x0 extends Closeable {

    public static abstract class a {
        public static a f(Size size, Rect rect, androidx.camera.core.impl.H h10, int i10, boolean z10) {
            return new C0695f(size, rect, h10, i10, z10);
        }

        public abstract androidx.camera.core.impl.H a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    public static abstract class b {
        b() {
        }

        public static b c(int i10, x0 x0Var) {
            return new C0697g(i10, x0Var);
        }

        public abstract int a();

        public abstract x0 b();
    }

    void c0(float[] fArr, float[] fArr2, boolean z10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d0(float[] fArr, float[] fArr2);

    int getFormat();

    Size k();

    Surface v0(Executor executor, InterfaceC5159a interfaceC5159a);
}
