package W8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11411a = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f11412a;

        /* renamed from: b, reason: collision with root package name */
        private final A8.b f11413b;

        public a(Class cls, A8.b bVar) {
            this.f11412a = cls;
            this.f11413b = bVar;
        }

        final A8.b a() {
            return this.f11413b;
        }

        final Class b() {
            return this.f11412a;
        }
    }

    public c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            this.f11411a.put(aVar.b(), aVar.a());
        }
    }
}
