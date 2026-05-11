package K5;

import K5.t;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public class r extends t implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f5431a = Object.class;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f5432b = String.class;

    /* renamed from: c, reason: collision with root package name */
    private static final Class f5433c = D5.m.class;

    /* renamed from: d, reason: collision with root package name */
    protected static final q f5434d = q.r(null, S5.l.W(String.class), C0923d.h(String.class));

    /* renamed from: e, reason: collision with root package name */
    protected static final q f5435e;

    /* renamed from: f, reason: collision with root package name */
    protected static final q f5436f;

    /* renamed from: g, reason: collision with root package name */
    protected static final q f5437g;

    /* renamed from: h, reason: collision with root package name */
    protected static final q f5438h;

    static {
        Class cls = Boolean.TYPE;
        f5435e = q.r(null, S5.l.W(cls), C0923d.h(cls));
        Class cls2 = Integer.TYPE;
        f5436f = q.r(null, S5.l.W(cls2), C0923d.h(cls2));
        Class cls3 = Long.TYPE;
        f5437g = q.r(null, S5.l.W(cls3), C0923d.h(cls3));
        f5438h = q.r(null, S5.l.W(Object.class), C0923d.h(Object.class));
    }

    protected q c(F5.l lVar, D5.j jVar) {
        if (e(jVar)) {
            return q.r(lVar, jVar, f(lVar, jVar, lVar));
        }
        return null;
    }

    protected q d(F5.l lVar, D5.j jVar) {
        Class<?> q10 = jVar.q();
        if (q10.isPrimitive()) {
            if (q10 == Integer.TYPE) {
                return f5436f;
            }
            if (q10 == Long.TYPE) {
                return f5437g;
            }
            if (q10 == Boolean.TYPE) {
                return f5435e;
            }
            return null;
        }
        if (!T5.f.H(q10)) {
            if (f5433c.isAssignableFrom(q10)) {
                return q.r(lVar, jVar, C0923d.h(q10));
            }
            return null;
        }
        if (q10 == f5431a) {
            return f5438h;
        }
        if (q10 == f5432b) {
            return f5434d;
        }
        if (q10 == Integer.class) {
            return f5436f;
        }
        if (q10 == Long.class) {
            return f5437g;
        }
        if (q10 == Boolean.class) {
            return f5435e;
        }
        return null;
    }

    protected boolean e(D5.j jVar) {
        if (jVar.A() && !jVar.y()) {
            Class q10 = jVar.q();
            if (T5.f.H(q10) && (Collection.class.isAssignableFrom(q10) || Map.class.isAssignableFrom(q10))) {
                return true;
            }
        }
        return false;
    }

    protected C0922c f(F5.l lVar, D5.j jVar, t.a aVar) {
        return C0923d.i(lVar, jVar, aVar);
    }

    protected C g(F5.l lVar, D5.j jVar, t.a aVar, boolean z10) {
        C0922c f10 = f(lVar, jVar, aVar);
        return h(lVar, f10, jVar, z10, jVar.I() ? lVar.f().b(lVar, f10) : lVar.f().a(lVar, f10));
    }

    protected C h(F5.l lVar, C0922c c0922c, D5.j jVar, boolean z10, AbstractC0920a abstractC0920a) {
        return new C(lVar, z10, jVar, c0922c, abstractC0920a);
    }

    @Override // K5.t
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public q a(F5.l lVar, D5.j jVar, t.a aVar) {
        q d10 = d(lVar, jVar);
        return d10 == null ? q.r(lVar, jVar, f(lVar, jVar, aVar)) : d10;
    }

    @Override // K5.t
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public q b(D5.z zVar, D5.j jVar, t.a aVar) {
        q d10 = d(zVar, jVar);
        if (d10 != null) {
            return d10;
        }
        q c10 = c(zVar, jVar);
        return c10 == null ? q.s(g(zVar, jVar, aVar, true)) : c10;
    }
}
