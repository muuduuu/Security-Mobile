package I8;

import android.content.Context;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.q;

/* loaded from: classes2.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static C3766c b(String str, String str2) {
        return C3766c.l(f.a(str, str2), f.class);
    }

    public static C3766c c(final String str, final a aVar) {
        return C3766c.m(f.class).b(q.j(Context.class)).f(new o8.g() { // from class: I8.g
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                f d10;
                d10 = h.d(str, aVar, interfaceC3767d);
                return d10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, InterfaceC3767d interfaceC3767d) {
        return f.a(str, aVar.a((Context) interfaceC3767d.a(Context.class)));
    }
}
