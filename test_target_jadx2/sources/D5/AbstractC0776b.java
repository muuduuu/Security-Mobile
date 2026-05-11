package D5;

import E5.e;
import K5.AbstractC0921b;
import K5.AbstractC0928i;
import K5.C0922c;
import K5.C0926g;
import K5.I;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import v5.InterfaceC4935b;
import v5.InterfaceC4940g;
import v5.InterfaceC4942i;
import v5.InterfaceC4947n;
import v5.p;
import v5.q;
import v5.u;
import v5.z;

/* renamed from: D5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0776b implements Serializable {

    /* renamed from: D5.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0023a f1233a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1234b;

        /* renamed from: D5.b$a$a, reason: collision with other inner class name */
        public enum EnumC0023a {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public a(EnumC0023a enumC0023a, String str) {
            this.f1233a = enumC0023a;
            this.f1234b = str;
        }

        public static a a(String str) {
            return new a(EnumC0023a.BACK_REFERENCE, str);
        }

        public static a c(String str) {
            return new a(EnumC0023a.MANAGED_REFERENCE, str);
        }

        public boolean b() {
            return this.f1233a == EnumC0023a.BACK_REFERENCE;
        }
    }

    public static AbstractC0776b i0() {
        return K5.A.f5287a;
    }

    public InterfaceC4947n.a A(F5.l lVar, AbstractC0921b abstractC0921b) {
        return B(abstractC0921b);
    }

    public InterfaceC4947n.a B(AbstractC0921b abstractC0921b) {
        return InterfaceC4947n.a.f();
    }

    public p.b C(AbstractC0921b abstractC0921b) {
        return p.b.c();
    }

    public q.a D(F5.l lVar, AbstractC0921b abstractC0921b) {
        return q.a.c();
    }

    public Integer E(AbstractC0921b abstractC0921b) {
        return null;
    }

    public M5.f F(F5.l lVar, AbstractC0928i abstractC0928i, j jVar) {
        return null;
    }

    public a G(AbstractC0928i abstractC0928i) {
        return null;
    }

    public w H(F5.l lVar, C0926g c0926g, w wVar) {
        return null;
    }

    public w I(C0922c c0922c) {
        return null;
    }

    public Object J(AbstractC0928i abstractC0928i) {
        return null;
    }

    public Object K(AbstractC0921b abstractC0921b) {
        return null;
    }

    public String[] L(C0922c c0922c) {
        return null;
    }

    public Boolean M(AbstractC0921b abstractC0921b) {
        return null;
    }

    public e.b N(AbstractC0921b abstractC0921b) {
        return null;
    }

    public Object O(AbstractC0921b abstractC0921b) {
        return null;
    }

    public z.a P(AbstractC0921b abstractC0921b) {
        return z.a.c();
    }

    public List Q(AbstractC0921b abstractC0921b) {
        return null;
    }

    public String R(C0922c c0922c) {
        return null;
    }

    public M5.f S(F5.l lVar, C0922c c0922c, j jVar) {
        return null;
    }

    public T5.m T(AbstractC0928i abstractC0928i) {
        return null;
    }

    public Class[] U(AbstractC0921b abstractC0921b) {
        return null;
    }

    public w V(AbstractC0921b abstractC0921b) {
        return null;
    }

    public Boolean W(AbstractC0921b abstractC0921b) {
        if ((abstractC0921b instanceof K5.j) && X((K5.j) abstractC0921b)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public boolean X(K5.j jVar) {
        return false;
    }

    public Boolean Y(AbstractC0921b abstractC0921b) {
        return null;
    }

    public Boolean Z(F5.l lVar, AbstractC0921b abstractC0921b) {
        return null;
    }

    protected Annotation a(AbstractC0921b abstractC0921b, Class cls) {
        return abstractC0921b.b(cls);
    }

    public Boolean a0(AbstractC0921b abstractC0921b) {
        if ((abstractC0921b instanceof K5.j) && b0((K5.j) abstractC0921b)) {
            return Boolean.TRUE;
        }
        return null;
    }

    protected boolean b(AbstractC0921b abstractC0921b, Class cls) {
        return abstractC0921b.f(cls);
    }

    public boolean b0(K5.j jVar) {
        return false;
    }

    protected boolean c(AbstractC0921b abstractC0921b, Class[] clsArr) {
        return abstractC0921b.g(clsArr);
    }

    public boolean c0(AbstractC0921b abstractC0921b) {
        return false;
    }

    public boolean d0(AbstractC0928i abstractC0928i) {
        return false;
    }

    public Boolean e0(AbstractC0928i abstractC0928i) {
        return null;
    }

    public Object f(AbstractC0921b abstractC0921b) {
        return null;
    }

    public boolean f0(Annotation annotation) {
        return false;
    }

    public InterfaceC4940g.a g(F5.l lVar, AbstractC0921b abstractC0921b) {
        if (!c0(abstractC0921b)) {
            return null;
        }
        InterfaceC4940g.a h10 = h(abstractC0921b);
        return h10 == null ? InterfaceC4940g.a.DEFAULT : h10;
    }

    public Boolean g0(C0922c c0922c) {
        return null;
    }

    public InterfaceC4940g.a h(AbstractC0921b abstractC0921b) {
        return null;
    }

    public Boolean h0(AbstractC0928i abstractC0928i) {
        return null;
    }

    public Object j(AbstractC0921b abstractC0921b) {
        return null;
    }

    public InterfaceC4942i.d k(AbstractC0921b abstractC0921b) {
        return InterfaceC4942i.d.b();
    }

    public K5.j k0(F5.l lVar, K5.j jVar, K5.j jVar2) {
        return null;
    }

    public String l(AbstractC0928i abstractC0928i) {
        return null;
    }

    public InterfaceC4935b.a m(AbstractC0928i abstractC0928i) {
        Object n10 = n(abstractC0928i);
        if (n10 != null) {
            return InterfaceC4935b.a.c(n10);
        }
        return null;
    }

    public Object n(AbstractC0928i abstractC0928i) {
        return null;
    }

    public Object o(AbstractC0921b abstractC0921b) {
        return null;
    }

    public Boolean p(AbstractC0921b abstractC0921b) {
        return null;
    }

    public w q(AbstractC0921b abstractC0921b) {
        return null;
    }

    public w r(AbstractC0921b abstractC0921b) {
        return null;
    }

    public Object s(C0922c c0922c) {
        return null;
    }

    public Object t(AbstractC0921b abstractC0921b) {
        return null;
    }

    public K5.B u(AbstractC0921b abstractC0921b) {
        return null;
    }

    public u.a w(AbstractC0921b abstractC0921b) {
        return null;
    }

    public M5.f x(F5.l lVar, AbstractC0928i abstractC0928i, j jVar) {
        return null;
    }

    public String y(AbstractC0921b abstractC0921b) {
        return null;
    }

    public String z(AbstractC0921b abstractC0921b) {
        return null;
    }

    public I e(C0922c c0922c, I i10) {
        return i10;
    }

    public K5.B v(AbstractC0921b abstractC0921b, K5.B b10) {
        return b10;
    }

    public void d(F5.l lVar, C0922c c0922c, List list) {
    }

    public String[] i(Class cls, Enum[] enumArr, String[] strArr) {
        return strArr;
    }

    public j j0(F5.l lVar, AbstractC0921b abstractC0921b, j jVar) {
        return jVar;
    }
}
