package z2;

import i2.k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5248f {

    /* renamed from: a, reason: collision with root package name */
    private final List f45692a = new ArrayList();

    /* renamed from: z2.f$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f45693a;

        /* renamed from: b, reason: collision with root package name */
        final k f45694b;

        a(Class cls, k kVar) {
            this.f45693a = cls;
            this.f45694b = kVar;
        }

        boolean a(Class cls) {
            return this.f45693a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, k kVar) {
        this.f45692a.add(new a(cls, kVar));
    }

    public synchronized k b(Class cls) {
        int size = this.f45692a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f45692a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f45694b;
            }
        }
        return null;
    }
}
