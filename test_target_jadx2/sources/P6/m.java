package p6;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import q6.C3923a;

/* loaded from: classes2.dex */
public abstract class m {

    static class a extends IOException {
        a() {
            super("WebP Format error");
        }
    }

    public static boolean a(Reader reader) {
        C3923a c3923a = reader instanceof C3923a ? (C3923a) reader : new C3923a(reader);
        try {
        } catch (IOException e10) {
            if (!(e10 instanceof a)) {
                e10.printStackTrace();
            }
        }
        if (!c3923a.f("RIFF")) {
            return false;
        }
        c3923a.skip(4L);
        if (!c3923a.f("WEBP")) {
            return false;
        }
        while (c3923a.available() > 0) {
            e c10 = c(c3923a);
            if (c10 instanceof k) {
                return ((k) c10).e();
            }
        }
        return false;
    }

    public static List b(C3923a c3923a) {
        if (!c3923a.f("RIFF")) {
            throw new a();
        }
        c3923a.skip(4L);
        if (!c3923a.f("WEBP")) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (c3923a.available() > 0) {
            arrayList.add(c(c3923a));
        }
        return arrayList;
    }

    static e c(C3923a c3923a) {
        int position = c3923a.position();
        int b10 = c3923a.b();
        int e10 = c3923a.e();
        e kVar = k.f38354g == b10 ? new k() : C3798b.f38327f == b10 ? new C3798b() : C3799c.f38330m == b10 ? new C3799c() : C3797a.f38326d == b10 ? new C3797a() : i.f38352d == b10 ? new i() : j.f38353d == b10 ? new j() : g.f38351d == b10 ? new g() : n.f38366d == b10 ? new n() : f.f38350d == b10 ? new f() : new e();
        kVar.f38347a = b10;
        kVar.f38348b = e10;
        kVar.f38349c = position;
        kVar.c(c3923a);
        return kVar;
    }
}
