package Z3;

import android.net.Uri;

/* loaded from: classes.dex */
public class p implements k {

    /* renamed from: a, reason: collision with root package name */
    private static p f12416a;

    protected p() {
    }

    public static synchronized p f() {
        p pVar;
        synchronized (p.class) {
            try {
                if (f12416a == null) {
                    f12416a = new p();
                }
                pVar = f12416a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    @Override // Z3.k
    public V2.d a(m4.b bVar, Uri uri, Object obj) {
        return new V2.i(e(uri).toString());
    }

    @Override // Z3.k
    public V2.d b(m4.b bVar, Object obj) {
        V2.d dVar;
        String str;
        m4.d k10 = bVar.k();
        if (k10 != null) {
            V2.d b10 = k10.b();
            str = k10.getClass().getName();
            dVar = b10;
        } else {
            dVar = null;
            str = null;
        }
        C1325b c1325b = new C1325b(e(bVar.u()).toString(), bVar.q(), bVar.s(), bVar.g(), dVar, str);
        c1325b.d(obj);
        return c1325b;
    }

    @Override // Z3.k
    public V2.d c(m4.b bVar, Object obj) {
        return a(bVar, bVar.u(), obj);
    }

    @Override // Z3.k
    public V2.d d(m4.b bVar, Object obj) {
        C1325b c1325b = new C1325b(e(bVar.u()).toString(), bVar.q(), bVar.s(), bVar.g(), null, null);
        c1325b.d(obj);
        return c1325b;
    }

    protected Uri e(Uri uri) {
        return uri;
    }
}
