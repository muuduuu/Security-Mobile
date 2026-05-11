package d6;

import com.github.penfeizhou.animation.io.Reader;
import e6.C3087a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class d {

    static class a extends IOException {
        a() {
            super("APNG Format error");
        }
    }

    public static boolean a(Reader reader) {
        C3087a c3087a = reader instanceof C3087a ? (C3087a) reader : new C3087a(reader);
        try {
            if (!c3087a.a("\u0089PNG") || !c3087a.a("\r\n\u001a\n")) {
                throw new a();
            }
            while (c3087a.available() > 0) {
                if (c(c3087a) instanceof C2993a) {
                    return true;
                }
            }
            return false;
        } catch (IOException e10) {
            if (e10 instanceof a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public static List b(C3087a c3087a) {
        if (!c3087a.a("\u0089PNG") || !c3087a.a("\r\n\u001a\n")) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (c3087a.available() > 0) {
            arrayList.add(c(c3087a));
        }
        return arrayList;
    }

    private static e c(C3087a c3087a) {
        int position = c3087a.position();
        int c10 = c3087a.c();
        int b10 = c3087a.b();
        e c2993a = b10 == C2993a.f31234g ? new C2993a() : b10 == f.f31257n ? new f() : b10 == g.f31267f ? new g() : b10 == h.f31269e ? new h() : b10 == i.f31270e ? new i() : b10 == j.f31271h ? new j() : new e();
        c2993a.f31256d = position;
        c2993a.f31254b = b10;
        c2993a.f31253a = c10;
        c2993a.c(c3087a);
        c2993a.f31255c = c3087a.c();
        return c2993a;
    }
}
