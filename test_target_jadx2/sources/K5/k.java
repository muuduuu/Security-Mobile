package K5;

import D5.AbstractC0776b;
import K5.G;
import K5.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class k extends u {

    /* renamed from: d, reason: collision with root package name */
    private final t.a f5399d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5400e;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public G f5401a;

        /* renamed from: b, reason: collision with root package name */
        public Method f5402b;

        /* renamed from: c, reason: collision with root package name */
        public o f5403c;

        public a(G g10, Method method, o oVar) {
            this.f5401a = g10;
            this.f5402b = method;
            this.f5403c = oVar;
        }

        public j a() {
            Method method = this.f5402b;
            if (method == null) {
                return null;
            }
            return new j(this.f5401a, method, this.f5403c.b(), null);
        }
    }

    k(AbstractC0776b abstractC0776b, t.a aVar, boolean z10) {
        super(abstractC0776b);
        this.f5399d = abstractC0776b == null ? null : aVar;
        this.f5400e = z10;
    }

    private void i(G g10, Class cls, Map map, Class cls2) {
        if (cls2 != null) {
            j(g10, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : T5.f.v(cls)) {
            if (k(method)) {
                y yVar = new y(method);
                a aVar = (a) map.get(yVar);
                if (aVar == null) {
                    map.put(yVar, new a(g10, method, this.f5442a == null ? o.e() : e(method.getDeclaredAnnotations())));
                } else {
                    if (this.f5400e) {
                        aVar.f5403c = f(aVar.f5403c, method.getDeclaredAnnotations());
                    }
                    Method method2 = aVar.f5402b;
                    if (method2 == null) {
                        aVar.f5402b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        aVar.f5402b = method;
                        aVar.f5401a = g10;
                    }
                }
            }
        }
    }

    private static boolean k(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    public static l m(AbstractC0776b abstractC0776b, G g10, t.a aVar, S5.o oVar, D5.j jVar, List list, Class cls, boolean z10) {
        return new k(abstractC0776b, aVar, z10).l(oVar, g10, jVar, list, cls);
    }

    protected void j(G g10, Class cls, Map map, Class cls2) {
        if (this.f5442a == null) {
            return;
        }
        Iterator it = T5.f.t(cls2, cls, true).iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (k(method)) {
                    y yVar = new y(method);
                    a aVar = (a) map.get(yVar);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (aVar == null) {
                        map.put(yVar, new a(g10, null, e(declaredAnnotations)));
                    } else {
                        aVar.f5403c = f(aVar.f5403c, declaredAnnotations);
                    }
                }
            }
        }
    }

    l l(S5.o oVar, G g10, D5.j jVar, List list, Class cls) {
        Class a10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i(g10, jVar.q(), linkedHashMap, cls);
        Iterator it = list.iterator();
        while (true) {
            Class cls2 = null;
            if (!it.hasNext()) {
                break;
            }
            D5.j jVar2 = (D5.j) it.next();
            t.a aVar = this.f5399d;
            if (aVar != null) {
                cls2 = aVar.a(jVar2.q());
            }
            i(new G.a(oVar, jVar2.j()), jVar2.q(), linkedHashMap, cls2);
        }
        t.a aVar2 = this.f5399d;
        if (aVar2 != null && (a10 = aVar2.a(Object.class)) != null) {
            j(g10, jVar.q(), linkedHashMap, a10);
            if (this.f5442a != null && !linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    y yVar = (y) entry.getKey();
                    if ("hashCode".equals(yVar.b()) && yVar.a() == 0) {
                        try {
                            Method declaredMethod = Object.class.getDeclaredMethod(yVar.b(), null);
                            if (declaredMethod != null) {
                                a aVar3 = (a) entry.getValue();
                                aVar3.f5403c = f(aVar3.f5403c, declaredMethod.getDeclaredAnnotations());
                                aVar3.f5402b = declaredMethod;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new l();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            j a11 = ((a) entry2.getValue()).a();
            if (a11 != null) {
                linkedHashMap2.put(entry2.getKey(), a11);
            }
        }
        return new l(linkedHashMap2);
    }
}
