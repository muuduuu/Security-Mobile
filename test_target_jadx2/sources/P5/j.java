package P5;

import D5.A;
import D5.B;
import D5.o;
import D5.w;
import D5.z;
import K5.AbstractC0921b;
import Q5.t;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import v5.I;

/* loaded from: classes2.dex */
public abstract class j extends B implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    protected transient Map f7505o;

    /* renamed from: p, reason: collision with root package name */
    protected transient ArrayList f7506p;

    /* renamed from: q, reason: collision with root package name */
    protected transient com.fasterxml.jackson.core.f f7507q;

    public static final class a extends j {
        public a() {
        }

        @Override // P5.j
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public a n0(z zVar, q qVar) {
            return new a(this, zVar, qVar);
        }

        protected a(B b10, z zVar, q qVar) {
            super(b10, zVar, qVar);
        }
    }

    protected j() {
    }

    private final void j0(com.fasterxml.jackson.core.f fVar, Object obj, D5.o oVar) {
        try {
            oVar.f(obj, fVar, this);
        } catch (Exception e10) {
            throw m0(fVar, e10);
        }
    }

    private final void k0(com.fasterxml.jackson.core.f fVar, Object obj, D5.o oVar, w wVar) {
        try {
            fVar.U1();
            fVar.i0(wVar.h(this.f1221a));
            oVar.f(obj, fVar, this);
            fVar.N();
        } catch (Exception e10) {
            throw m0(fVar, e10);
        }
    }

    private IOException m0(com.fasterxml.jackson.core.f fVar, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String m10 = T5.f.m(exc);
        if (m10 == null) {
            m10 = "[no message for " + exc.getClass().getName() + "]";
        }
        return new D5.l(fVar, m10, exc);
    }

    @Override // D5.B
    public t C(Object obj, I i10) {
        I i11;
        Map map = this.f7505o;
        if (map == null) {
            this.f7505o = i0();
        } else {
            t tVar = (t) map.get(obj);
            if (tVar != null) {
                return tVar;
            }
        }
        ArrayList arrayList = this.f7506p;
        if (arrayList == null) {
            this.f7506p = new ArrayList(8);
        } else {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                i11 = (I) this.f7506p.get(i12);
                if (i11.a(i10)) {
                    break;
                }
            }
        }
        i11 = null;
        if (i11 == null) {
            i11 = i10.d(this);
            this.f7506p.add(i11);
        }
        t tVar2 = new t(i11);
        this.f7505o.put(obj, tVar2);
        return tVar2;
    }

    @Override // D5.B
    public com.fasterxml.jackson.core.f Q() {
        return this.f7507q;
    }

    @Override // D5.B
    public Object W(K5.s sVar, Class cls) {
        if (cls == null) {
            return null;
        }
        this.f1221a.u();
        return T5.f.k(cls, this.f1221a.b());
    }

    @Override // D5.B
    public boolean X(Object obj) {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Throwable th) {
            b0(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), th.getClass().getName(), T5.f.m(th)), th);
            return false;
        }
    }

    @Override // D5.B
    public D5.o g0(AbstractC0921b abstractC0921b, Object obj) {
        D5.o oVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof D5.o) {
            oVar = (D5.o) obj;
        } else {
            if (!(obj instanceof Class)) {
                i(abstractC0921b.e(), "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == o.a.class || T5.f.F(cls)) {
                return null;
            }
            if (!D5.o.class.isAssignableFrom(cls)) {
                i(abstractC0921b.e(), "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
            }
            this.f1221a.u();
            oVar = (D5.o) T5.f.k(cls, this.f1221a.b());
        }
        return p(oVar);
    }

    protected Map i0() {
        return Z(A.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
    }

    protected void l0(com.fasterxml.jackson.core.f fVar) {
        try {
            M().f(null, fVar, this);
        } catch (Exception e10) {
            throw m0(fVar, e10);
        }
    }

    public abstract j n0(z zVar, q qVar);

    public void o0(com.fasterxml.jackson.core.f fVar, Object obj) {
        this.f7507q = fVar;
        if (obj == null) {
            l0(fVar);
            return;
        }
        Class<?> cls = obj.getClass();
        D5.o F10 = F(cls, true, null);
        w Q10 = this.f1221a.Q();
        if (Q10 == null) {
            if (this.f1221a.Z(A.WRAP_ROOT_VALUE)) {
                k0(fVar, obj, F10, this.f1221a.I(cls));
                return;
            }
        } else if (!Q10.g()) {
            k0(fVar, obj, F10, Q10);
            return;
        }
        j0(fVar, obj, F10);
    }

    protected j(B b10, z zVar, q qVar) {
        super(b10, zVar, qVar);
    }
}
