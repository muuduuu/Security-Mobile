package Sc;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0945q;
import Kc.K;
import Kc.n0;
import java.util.HashMap;
import java.util.Map;
import sd.InterfaceC4519g;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0948u f9052a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0948u f9053b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0948u f9054c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f9055d;

    static class a extends Kc.r {
        a(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Kc.AbstractC0948u
        public boolean e(InterfaceC4519g interfaceC4519g, InterfaceC0945q interfaceC0945q, InterfaceC0941m interfaceC0941m, boolean z10) {
            if (interfaceC0945q == null) {
                g(0);
            }
            if (interfaceC0941m == null) {
                g(1);
            }
            return s.d(interfaceC0945q, interfaceC0941m);
        }
    }

    static class b extends Kc.r {
        b(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Kc.AbstractC0948u
        public boolean e(InterfaceC4519g interfaceC4519g, InterfaceC0945q interfaceC0945q, InterfaceC0941m interfaceC0941m, boolean z10) {
            if (interfaceC0945q == null) {
                g(0);
            }
            if (interfaceC0941m == null) {
                g(1);
            }
            return s.e(interfaceC4519g, interfaceC0945q, interfaceC0941m);
        }
    }

    static class c extends Kc.r {
        c(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Kc.AbstractC0948u
        public boolean e(InterfaceC4519g interfaceC4519g, InterfaceC0945q interfaceC0945q, InterfaceC0941m interfaceC0941m, boolean z10) {
            if (interfaceC0945q == null) {
                g(0);
            }
            if (interfaceC0941m == null) {
                g(1);
            }
            return s.e(interfaceC4519g, interfaceC0945q, interfaceC0941m);
        }
    }

    static {
        a aVar = new a(Nc.a.f6740c);
        f9052a = aVar;
        b bVar = new b(Nc.c.f6742c);
        f9053b = bVar;
        c cVar = new c(Nc.b.f6741c);
        f9054c = cVar;
        f9055d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2) {
        if (interfaceC0941m == null) {
            a(2);
        }
        if (interfaceC0941m2 == null) {
            a(3);
        }
        K k10 = (K) kd.f.r(interfaceC0941m, K.class, false);
        K k11 = (K) kd.f.r(interfaceC0941m2, K.class, false);
        return (k11 == null || k10 == null || !k10.e().equals(k11.e())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(InterfaceC4519g interfaceC4519g, InterfaceC0945q interfaceC0945q, InterfaceC0941m interfaceC0941m) {
        if (interfaceC0945q == null) {
            a(0);
        }
        if (interfaceC0941m == null) {
            a(1);
        }
        if (d(kd.f.M(interfaceC0945q), interfaceC0941m)) {
            return true;
        }
        return AbstractC0947t.f5587c.e(interfaceC4519g, interfaceC0945q, interfaceC0941m, false);
    }

    private static void f(AbstractC0948u abstractC0948u) {
        f9055d.put(abstractC0948u.b(), abstractC0948u);
    }

    public static AbstractC0948u g(n0 n0Var) {
        if (n0Var == null) {
            a(4);
        }
        AbstractC0948u abstractC0948u = (AbstractC0948u) f9055d.get(n0Var);
        if (abstractC0948u != null) {
            return abstractC0948u;
        }
        AbstractC0948u j10 = AbstractC0947t.j(n0Var);
        if (j10 == null) {
            a(5);
        }
        return j10;
    }
}
