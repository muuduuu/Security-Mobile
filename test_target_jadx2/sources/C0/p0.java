package c0;

import android.media.MediaFormat;
import android.util.Size;
import androidx.camera.core.impl.e1;
import c0.C1693d;

/* loaded from: classes.dex */
public abstract class p0 implements InterfaceC1703n {

    public static abstract class a {
        a() {
        }

        public abstract p0 a();

        public abstract a b(int i10);

        public abstract a c(int i10);

        public abstract a d(q0 q0Var);

        public abstract a e(int i10);

        public abstract a f(int i10);

        public abstract a g(e1 e1Var);

        public abstract a h(String str);

        public abstract a i(int i10);

        public abstract a j(Size size);
    }

    p0() {
    }

    public static a d() {
        return new C1693d.b().i(-1).f(1).c(2130708361).d(q0.f19266a);
    }

    @Override // c0.InterfaceC1703n
    public MediaFormat a() {
        Size k10 = k();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(c(), k10.getWidth(), k10.getHeight());
        createVideoFormat.setInteger("color-format", f());
        createVideoFormat.setInteger("bitrate", e());
        createVideoFormat.setInteger("frame-rate", h());
        createVideoFormat.setInteger("i-frame-interval", i());
        if (j() != -1) {
            createVideoFormat.setInteger("profile", j());
        }
        q0 g10 = g();
        if (g10.c() != 0) {
            createVideoFormat.setInteger("color-standard", g10.c());
        }
        if (g10.d() != 0) {
            createVideoFormat.setInteger("color-transfer", g10.d());
        }
        if (g10.b() != 0) {
            createVideoFormat.setInteger("color-range", g10.b());
        }
        return createVideoFormat;
    }

    @Override // c0.InterfaceC1703n
    public abstract e1 b();

    @Override // c0.InterfaceC1703n
    public abstract String c();

    public abstract int e();

    public abstract int f();

    public abstract q0 g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract Size k();
}
