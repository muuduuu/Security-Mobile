package P5;

import D5.A;
import D5.AbstractC0776b;
import D5.B;
import D5.z;
import E5.e;
import K5.AbstractC0921b;
import K5.AbstractC0928i;
import v5.p;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f7508g = Boolean.FALSE;

    /* renamed from: a, reason: collision with root package name */
    protected final z f7509a;

    /* renamed from: b, reason: collision with root package name */
    protected final D5.c f7510b;

    /* renamed from: c, reason: collision with root package name */
    protected final AbstractC0776b f7511c;

    /* renamed from: d, reason: collision with root package name */
    protected Object f7512d;

    /* renamed from: e, reason: collision with root package name */
    protected final p.b f7513e;

    /* renamed from: f, reason: collision with root package name */
    protected final boolean f7514f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7515a;

        static {
            int[] iArr = new int[p.a.values().length];
            f7515a = iArr;
            try {
                iArr[p.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7515a[p.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7515a[p.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7515a[p.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7515a[p.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7515a[p.a.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public l(z zVar, D5.c cVar) {
        this.f7509a = zVar;
        this.f7510b = cVar;
        p.b i10 = p.b.i(cVar.g(p.b.c()), zVar.q(cVar.i(), p.b.c()));
        this.f7513e = p.b.i(zVar.N(), i10);
        this.f7514f = i10.h() == p.a.NON_DEFAULT;
        this.f7511c = zVar.g();
    }

    protected c a(K5.s sVar, AbstractC0928i abstractC0928i, T5.a aVar, D5.j jVar, D5.o oVar, M5.g gVar, D5.j jVar2, boolean z10, Object obj, Class[] clsArr) {
        return new c(sVar, abstractC0928i, aVar, jVar, oVar, gVar, jVar2, z10, obj, clsArr);
    }

    protected Object b(Exception exc, String str, Object obj) {
        Exception exc2 = exc;
        while (exc2.getCause() != null) {
            exc2 = exc2.getCause();
        }
        T5.f.U(exc2);
        T5.f.W(exc2);
        throw new IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
    }

    protected c c(B b10, K5.s sVar, D5.j jVar, D5.o oVar, M5.g gVar, M5.g gVar2, AbstractC0928i abstractC0928i, boolean z10) {
        D5.j jVar2;
        Object a10;
        Object e10;
        boolean z11;
        Object obj;
        try {
            D5.j d10 = d(abstractC0928i, z10, jVar);
            if (gVar2 != null) {
                if (d10 == null) {
                    d10 = jVar;
                }
                if (d10.k() == null) {
                    b10.c0(this.f7510b, sVar, "serialization type " + d10 + " has no content", new Object[0]);
                }
                D5.j O10 = d10.O(gVar2);
                O10.k();
                jVar2 = O10;
            } else {
                jVar2 = d10;
            }
            D5.j jVar3 = jVar2 == null ? jVar : jVar2;
            AbstractC0928i n10 = sVar.n();
            if (n10 == null) {
                return (c) b10.c0(this.f7510b, sVar, "could not determine property type", new Object[0]);
            }
            p.b m10 = this.f7509a.m(jVar3.q(), n10.d(), this.f7513e).m(sVar.c());
            p.a h10 = m10.h();
            if (h10 == p.a.USE_DEFAULTS) {
                h10 = p.a.ALWAYS;
            }
            int i10 = a.f7515a[h10.ordinal()];
            Object obj2 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    if (jVar3.b()) {
                        a10 = c.f7477s;
                    }
                    z11 = true;
                    obj = obj2;
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        r1 = i10 == 5;
                        A a11 = A.WRITE_EMPTY_JSON_ARRAYS;
                        if (jVar3.A() && !this.f7509a.Z(a11)) {
                            a10 = c.f7477s;
                        }
                        z11 = r1;
                        obj = obj2;
                    } else {
                        a10 = b10.W(sVar, m10.g());
                        if (a10 != null) {
                            r1 = b10.X(a10);
                        }
                    }
                    obj = a10;
                    z11 = r1;
                } else {
                    a10 = c.f7477s;
                }
                obj = a10;
                z11 = true;
            } else {
                if (!this.f7514f || (e10 = e()) == null) {
                    obj2 = T5.d.b(jVar3);
                    r1 = true;
                } else {
                    if (b10.Y(D5.q.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        abstractC0928i.h(this.f7509a.D(D5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        obj2 = abstractC0928i.m(e10);
                    } catch (Exception e11) {
                        b(e11, sVar.u(), e10);
                    }
                }
                if (obj2 != null) {
                    if (obj2.getClass().isArray()) {
                        a10 = T5.b.a(obj2);
                        obj = a10;
                        z11 = r1;
                    }
                    z11 = r1;
                    obj = obj2;
                }
                z11 = true;
                obj = obj2;
            }
            Class[] e12 = sVar.e();
            if (e12 == null) {
                e12 = this.f7510b.b();
            }
            c a12 = a(sVar, abstractC0928i, this.f7510b.j(), jVar, oVar, gVar, jVar2, z11, obj, e12);
            Object t10 = this.f7511c.t(abstractC0928i);
            if (t10 != null) {
                a12.g(b10.g0(abstractC0928i, t10));
            }
            T5.m T10 = this.f7511c.T(abstractC0928i);
            return T10 != null ? a12.x(T10) : a12;
        } catch (D5.l e13) {
            return sVar == null ? (c) b10.i(jVar, T5.f.m(e13)) : (c) b10.c0(this.f7510b, sVar, T5.f.m(e13), new Object[0]);
        }
    }

    protected D5.j d(AbstractC0921b abstractC0921b, boolean z10, D5.j jVar) {
        D5.j j02 = this.f7511c.j0(this.f7509a, abstractC0921b, jVar);
        if (j02 != jVar) {
            Class<?> q10 = j02.q();
            Class<?> q11 = jVar.q();
            if (!q10.isAssignableFrom(q11) && !q11.isAssignableFrom(q10)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + abstractC0921b.c() + "': class " + q10.getName() + " not a super-type of (declared) class " + q11.getName());
            }
            jVar = j02;
            z10 = true;
        }
        e.b N10 = this.f7511c.N(abstractC0921b);
        if (N10 != null && N10 != e.b.DEFAULT_TYPING) {
            z10 = N10 == e.b.STATIC;
        }
        if (z10) {
            return jVar.Q();
        }
        return null;
    }

    protected Object e() {
        Object obj = this.f7512d;
        if (obj == null) {
            obj = this.f7510b.o(this.f7509a.b());
            if (obj == null) {
                obj = f7508g;
            }
            this.f7512d = obj;
        }
        if (obj == f7508g) {
            return null;
        }
        return this.f7512d;
    }
}
