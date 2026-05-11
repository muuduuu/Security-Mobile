package K5;

import D5.AbstractC0776b;
import K5.t;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: K5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0923d {

    /* renamed from: i, reason: collision with root package name */
    private static final T5.a f5371i = o.d();

    /* renamed from: j, reason: collision with root package name */
    private static final Class f5372j = Object.class;

    /* renamed from: k, reason: collision with root package name */
    private static final Class f5373k = Enum.class;

    /* renamed from: l, reason: collision with root package name */
    private static final Class f5374l = List.class;

    /* renamed from: m, reason: collision with root package name */
    private static final Class f5375m = Map.class;

    /* renamed from: a, reason: collision with root package name */
    private final F5.l f5376a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0776b f5377b;

    /* renamed from: c, reason: collision with root package name */
    private final t.a f5378c;

    /* renamed from: d, reason: collision with root package name */
    private final S5.n f5379d;

    /* renamed from: e, reason: collision with root package name */
    private final D5.j f5380e;

    /* renamed from: f, reason: collision with root package name */
    private final Class f5381f;

    /* renamed from: g, reason: collision with root package name */
    private final Class f5382g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5383h;

    C0923d(F5.l lVar, D5.j jVar, t.a aVar) {
        this.f5376a = lVar;
        this.f5380e = jVar;
        Class q10 = jVar.q();
        this.f5381f = q10;
        this.f5378c = aVar;
        this.f5379d = jVar.j();
        AbstractC0776b g10 = lVar.C() ? lVar.g() : null;
        this.f5377b = g10;
        this.f5382g = aVar != null ? aVar.a(q10) : null;
        this.f5383h = (g10 == null || (T5.f.H(q10) && jVar.A())) ? false : true;
    }

    private o a(o oVar, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!oVar.f(annotation)) {
                    oVar = oVar.a(annotation);
                    if (this.f5377b.f0(annotation)) {
                        oVar = c(oVar, annotation);
                    }
                }
            }
        }
        return oVar;
    }

    private o b(o oVar, Class cls, Class cls2) {
        if (cls2 != null) {
            oVar = a(oVar, T5.f.n(cls2));
            Iterator it = T5.f.u(cls2, cls, false).iterator();
            while (it.hasNext()) {
                oVar = a(oVar, T5.f.n((Class) it.next()));
            }
        }
        return oVar;
    }

    private o c(o oVar, Annotation annotation) {
        for (Annotation annotation2 : T5.f.n(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !oVar.f(annotation2)) {
                oVar = oVar.a(annotation2);
                if (this.f5377b.f0(annotation2)) {
                    oVar = c(oVar, annotation2);
                }
            }
        }
        return oVar;
    }

    private static void d(D5.j jVar, List list, boolean z10) {
        Class q10 = jVar.q();
        if (z10) {
            if (f(list, q10)) {
                return;
            }
            list.add(jVar);
            if (q10 == f5374l || q10 == f5375m) {
                return;
            }
        }
        Iterator it = jVar.o().iterator();
        while (it.hasNext()) {
            d((D5.j) it.next(), list, true);
        }
    }

    private static void e(D5.j jVar, List list, boolean z10) {
        Class q10 = jVar.q();
        if (q10 == f5372j || q10 == f5373k) {
            return;
        }
        if (z10) {
            if (f(list, q10)) {
                return;
            } else {
                list.add(jVar);
            }
        }
        Iterator it = jVar.o().iterator();
        while (it.hasNext()) {
            d((D5.j) it.next(), list, true);
        }
        D5.j s10 = jVar.s();
        if (s10 != null) {
            e(s10, list, true);
        }
    }

    private static boolean f(List list, Class cls) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((D5.j) list.get(i10)).q() == cls) {
                return true;
            }
        }
        return false;
    }

    static C0922c g(F5.l lVar, Class cls) {
        return new C0922c(cls);
    }

    static C0922c h(Class cls) {
        return new C0922c(cls);
    }

    public static C0922c i(F5.l lVar, D5.j jVar, t.a aVar) {
        return (jVar.y() && o(lVar, jVar.q())) ? g(lVar, jVar.q()) : new C0923d(lVar, jVar, aVar).k();
    }

    private T5.a j(List list) {
        if (this.f5377b == null) {
            return f5371i;
        }
        t.a aVar = this.f5378c;
        boolean z10 = aVar != null && (!(aVar instanceof F) || ((F) aVar).b());
        if (!z10 && !this.f5383h) {
            return f5371i;
        }
        o e10 = o.e();
        Class cls = this.f5382g;
        if (cls != null) {
            e10 = b(e10, this.f5381f, cls);
        }
        if (this.f5383h) {
            e10 = a(e10, T5.f.n(this.f5381f));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            D5.j jVar = (D5.j) it.next();
            if (z10) {
                Class q10 = jVar.q();
                e10 = b(e10, q10, this.f5378c.a(q10));
            }
            if (this.f5383h) {
                e10 = a(e10, T5.f.n(jVar.q()));
            }
        }
        if (z10) {
            e10 = b(e10, Object.class, this.f5378c.a(Object.class));
        }
        return e10.c();
    }

    public static C0922c m(F5.l lVar, Class cls) {
        return n(lVar, cls, lVar);
    }

    public static C0922c n(F5.l lVar, Class cls, t.a aVar) {
        return (cls.isArray() && o(lVar, cls)) ? g(lVar, cls) : new C0923d(lVar, cls, aVar).l();
    }

    private static boolean o(F5.l lVar, Class cls) {
        return lVar == null || lVar.a(cls) == null;
    }

    C0922c k() {
        ArrayList arrayList = new ArrayList(8);
        if (!this.f5380e.x(Object.class)) {
            if (this.f5380e.E()) {
                d(this.f5380e, arrayList, false);
            } else {
                e(this.f5380e, arrayList, false);
            }
        }
        return new C0922c(this.f5380e, this.f5381f, arrayList, this.f5382g, j(arrayList), this.f5379d, this.f5377b, this.f5378c, this.f5376a.z(), this.f5383h);
    }

    C0922c l() {
        List emptyList = Collections.emptyList();
        return new C0922c(null, this.f5381f, emptyList, this.f5382g, j(emptyList), this.f5379d, this.f5377b, this.f5378c, this.f5376a.z(), this.f5383h);
    }

    C0923d(F5.l lVar, Class cls, t.a aVar) {
        this.f5376a = lVar;
        this.f5380e = null;
        this.f5381f = cls;
        this.f5378c = aVar;
        this.f5379d = S5.n.h();
        if (lVar == null) {
            this.f5377b = null;
            this.f5382g = null;
        } else {
            this.f5377b = lVar.C() ? lVar.g() : null;
            this.f5382g = aVar != null ? aVar.a(cls) : null;
        }
        this.f5383h = this.f5377b != null;
    }
}
