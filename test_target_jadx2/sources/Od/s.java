package Od;

import Jd.G0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f7350a;

    /* renamed from: b, reason: collision with root package name */
    public static final G0 f7351b;

    static {
        s sVar = new s();
        f7350a = sVar;
        E.f("kotlinx.coroutines.fast.service.loader", true);
        f7351b = sVar.a();
    }

    private s() {
    }

    private final G0 a() {
        Object next;
        G0 e10;
        try {
            List C10 = kotlin.sequences.j.C(kotlin.sequences.j.c(ServiceLoader.load(r.class, r.class.getClassLoader()).iterator()));
            Iterator it = C10.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c10 = ((r) next).c();
                    do {
                        Object next2 = it.next();
                        int c11 = ((r) next2).c();
                        if (c10 < c11) {
                            next = next2;
                            c10 = c11;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            if (rVar != null && (e10 = t.e(rVar, C10)) != null) {
                return e10;
            }
            t.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            t.b(th, null, 2, null);
            return null;
        }
    }
}
