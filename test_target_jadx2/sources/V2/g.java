package V2;

import V2.a;

/* loaded from: classes.dex */
public class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private static g f10788a;

    private g() {
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            try {
                if (f10788a == null) {
                    f10788a = new g();
                }
                gVar = f10788a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // V2.a
    public void a(a.EnumC0200a enumC0200a, Class cls, String str, Throwable th) {
    }
}
