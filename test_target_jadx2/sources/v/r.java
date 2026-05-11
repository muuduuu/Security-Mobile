package V;

import V.B0;
import V.C1244g;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.util.Objects;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public abstract class r {

    public static abstract class a {
        a() {
        }

        public abstract r a();

        public a b(InterfaceC5159a interfaceC5159a) {
            B0.a f10 = c().f();
            interfaceC5159a.accept(f10);
            f(f10.a());
            return this;
        }

        abstract B0 c();

        public abstract a d(AbstractC1236a abstractC1236a);

        public abstract a e(int i10);

        public abstract a f(B0 b02);
    }

    r() {
    }

    public static a a() {
        return new C1244g.b().e(-1).d(AbstractC1236a.a().a()).f(B0.a().a());
    }

    public static String e(int i10) {
        return i10 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    public static int f(int i10) {
        return Objects.equals(e(i10), "audio/mp4a-latm") ? 2 : -1;
    }

    static int g(int i10) {
        return i10 != 1 ? 0 : 1;
    }

    public static String h(int i10) {
        return i10 != 1 ? HVFrameRecorder.MIME : "video/x-vnd.on2.vp8";
    }

    public abstract AbstractC1236a b();

    public abstract int c();

    public abstract B0 d();

    public abstract a i();
}
