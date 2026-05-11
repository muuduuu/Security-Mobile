package K5;

import D5.AbstractC0776b;
import K5.G;
import K5.t;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: K5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0927h extends u {

    /* renamed from: d, reason: collision with root package name */
    private final S5.o f5389d;

    /* renamed from: e, reason: collision with root package name */
    private final t.a f5390e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5391f;

    /* renamed from: K5.h$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final G f5392a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f5393b;

        /* renamed from: c, reason: collision with root package name */
        public o f5394c = o.e();

        public a(G g10, Field field) {
            this.f5392a = g10;
            this.f5393b = field;
        }

        public C0926g a() {
            return new C0926g(this.f5392a, this.f5393b, this.f5394c.b());
        }
    }

    C0927h(AbstractC0776b abstractC0776b, S5.o oVar, t.a aVar, boolean z10) {
        super(abstractC0776b);
        this.f5389d = oVar;
        this.f5390e = abstractC0776b == null ? null : aVar;
        this.f5391f = z10;
    }

    private void i(Class cls, Class cls2, Map map) {
        a aVar;
        Iterator it = T5.f.u(cls, cls2, true).iterator();
        while (it.hasNext()) {
            for (Field field : ((Class) it.next()).getDeclaredFields()) {
                if (k(field) && (aVar = (a) map.get(field.getName())) != null) {
                    aVar.f5394c = d(aVar.f5394c, field.getDeclaredAnnotations());
                }
            }
        }
    }

    private Map j(G g10, D5.j jVar, Map map) {
        t.a aVar;
        Class a10;
        D5.j s10 = jVar.s();
        if (s10 == null) {
            return map;
        }
        Class q10 = jVar.q();
        Map j10 = j(new G.a(this.f5389d, s10.j()), s10, map);
        for (Field field : q10.getDeclaredFields()) {
            if (k(field)) {
                if (j10 == null) {
                    j10 = new LinkedHashMap();
                }
                a aVar2 = new a(g10, field);
                if (this.f5391f) {
                    aVar2.f5394c = d(aVar2.f5394c, field.getDeclaredAnnotations());
                }
                j10.put(field.getName(), aVar2);
            }
        }
        if (j10 != null && (aVar = this.f5390e) != null && (a10 = aVar.a(q10)) != null) {
            i(a10, q10, j10);
        }
        return j10;
    }

    private boolean k(Field field) {
        return (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) ? false : true;
    }

    public static List m(AbstractC0776b abstractC0776b, G g10, t.a aVar, S5.o oVar, D5.j jVar, boolean z10) {
        return new C0927h(abstractC0776b, oVar, aVar, z10).l(g10, jVar);
    }

    List l(G g10, D5.j jVar) {
        Map j10 = j(g10, jVar, null);
        if (j10 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(j10.size());
        Iterator it = j10.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).a());
        }
        return arrayList;
    }
}
