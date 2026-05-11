package Kc;

import Dd.l;
import Kc.m0;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import sd.InterfaceC4519g;
import sd.InterfaceC4520h;
import yd.AbstractC5197E;
import yd.AbstractC5218u;

/* renamed from: Kc.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0947t {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0948u f5585a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0948u f5586b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0948u f5587c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0948u f5588d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0948u f5589e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0948u f5590f;

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC0948u f5591g;

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC0948u f5592h;

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC0948u f5593i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set f5594j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map f5595k;

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC0948u f5596l;

    /* renamed from: m, reason: collision with root package name */
    private static final InterfaceC4519g f5597m;

    /* renamed from: n, reason: collision with root package name */
    public static final InterfaceC4519g f5598n;

    /* renamed from: o, reason: collision with root package name */
    public static final InterfaceC4519g f5599o;

    /* renamed from: p, reason: collision with root package name */
    private static final Dd.l f5600p;

    /* renamed from: q, reason: collision with root package name */
    private static final Map f5601q;

    /* renamed from: Kc.t$a */
    static class a implements InterfaceC4519g {
        a() {
        }

        @Override // sd.InterfaceC4519g
        public AbstractC5197E getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: Kc.t$b */
    static class b implements InterfaceC4519g {
        b() {
        }

        @Override // sd.InterfaceC4519g
        public AbstractC5197E getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: Kc.t$c */
    static class c implements InterfaceC4519g {
        c() {
        }

        @Override // sd.InterfaceC4519g
        public AbstractC5197E getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: Kc.t$d */
    static class d extends r {
        d(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(InterfaceC0941m interfaceC0941m) {
            if (interfaceC0941m == null) {
                g(0);
            }
            return kd.f.j(interfaceC0941m) != b0.f5561a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [Kc.m, Kc.q] */
        /* JADX WARN: Type inference failed for: r4v1, types: [Kc.m] */
        /* JADX WARN: Type inference failed for: r4v2, types: [Kc.m] */
        /* JADX WARN: Type inference failed for: r4v4, types: [Kc.m] */
        @Override // Kc.AbstractC0948u
        public boolean e(InterfaceC4519g interfaceC4519g, InterfaceC0945q interfaceC0945q, InterfaceC0941m interfaceC0941m, boolean z10) {
            if (interfaceC0945q == 0) {
                g(1);
            }
            if (interfaceC0941m == null) {
                g(2);
            }
            if (kd.f.J(interfaceC0945q) && h(interfaceC0941m)) {
                return AbstractC0947t.f(interfaceC0945q, interfaceC0941m);
            }
            if (interfaceC0945q instanceof InterfaceC0940l) {
                InterfaceC0937i b10 = ((InterfaceC0940l) interfaceC0945q).b();
                if (z10 && kd.f.G(b10) && kd.f.J(b10) && (interfaceC0941m instanceof InterfaceC0940l) && kd.f.J(interfaceC0941m.b()) && AbstractC0947t.f(interfaceC0945q, interfaceC0941m)) {
                    return true;
                }
            }
            while (interfaceC0945q != 0) {
                interfaceC0945q = interfaceC0945q.b();
                if (((interfaceC0945q instanceof InterfaceC0933e) && !kd.f.x(interfaceC0945q)) || (interfaceC0945q instanceof K)) {
                    break;
                }
            }
            if (interfaceC0945q == 0) {
                return false;
            }
            while (interfaceC0941m != null) {
                if (interfaceC0945q == interfaceC0941m) {
                    return true;
                }
                if (interfaceC0941m instanceof K) {
                    return (interfaceC0945q instanceof K) && interfaceC0945q.e().equals(((K) interfaceC0941m).e()) && kd.f.b(interfaceC0941m, interfaceC0945q);
                }
                interfaceC0941m = interfaceC0941m.b();
            }
            return false;
        }
    }

    /* renamed from: Kc.t$e */
    static class e extends r {
        e(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Kc.AbstractC0948u
        public boolean e(InterfaceC4519g interfaceC4519g, InterfaceC0945q interfaceC0945q, InterfaceC0941m interfaceC0941m, boolean z10) {
            InterfaceC0941m q10;
            if (interfaceC0945q == null) {
                g(0);
            }
            if (interfaceC0941m == null) {
                g(1);
            }
            if (AbstractC0947t.f5585a.e(interfaceC4519g, interfaceC0945q, interfaceC0941m, z10)) {
                if (interfaceC4519g == AbstractC0947t.f5598n) {
                    return true;
                }
                if (interfaceC4519g != AbstractC0947t.f5597m && (q10 = kd.f.q(interfaceC0945q, InterfaceC0933e.class)) != null && (interfaceC4519g instanceof InterfaceC4520h)) {
                    return ((InterfaceC4520h) interfaceC4519g).x().a().equals(q10.a());
                }
            }
            return false;
        }
    }

    /* renamed from: Kc.t$f */
    static class f extends r {
        f(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(InterfaceC4519g interfaceC4519g, InterfaceC0945q interfaceC0945q, InterfaceC0933e interfaceC0933e) {
            if (interfaceC0945q == null) {
                g(2);
            }
            if (interfaceC0933e == null) {
                g(3);
            }
            if (interfaceC4519g == AbstractC0947t.f5599o) {
                return false;
            }
            if (!(interfaceC0945q instanceof InterfaceC0930b) || (interfaceC0945q instanceof InterfaceC0940l) || interfaceC4519g == AbstractC0947t.f5598n) {
                return true;
            }
            if (interfaceC4519g == AbstractC0947t.f5597m || interfaceC4519g == null) {
                return false;
            }
            AbstractC5197E type = interfaceC4519g.getType();
            return kd.f.I(type, interfaceC0933e) || AbstractC5218u.a(type);
        }

        @Override // Kc.AbstractC0948u
        public boolean e(InterfaceC4519g interfaceC4519g, InterfaceC0945q interfaceC0945q, InterfaceC0941m interfaceC0941m, boolean z10) {
            InterfaceC0933e interfaceC0933e;
            if (interfaceC0945q == null) {
                g(0);
            }
            if (interfaceC0941m == null) {
                g(1);
            }
            InterfaceC0933e interfaceC0933e2 = (InterfaceC0933e) kd.f.q(interfaceC0945q, InterfaceC0933e.class);
            InterfaceC0933e interfaceC0933e3 = (InterfaceC0933e) kd.f.r(interfaceC0941m, InterfaceC0933e.class, false);
            if (interfaceC0933e3 == null) {
                return false;
            }
            if (interfaceC0933e2 != null && kd.f.x(interfaceC0933e2) && (interfaceC0933e = (InterfaceC0933e) kd.f.q(interfaceC0933e2, InterfaceC0933e.class)) != null && kd.f.H(interfaceC0933e3, interfaceC0933e)) {
                return true;
            }
            InterfaceC0945q M10 = kd.f.M(interfaceC0945q);
            InterfaceC0933e interfaceC0933e4 = (InterfaceC0933e) kd.f.q(M10, InterfaceC0933e.class);
            if (interfaceC0933e4 == null) {
                return false;
            }
            if (kd.f.H(interfaceC0933e3, interfaceC0933e4) && h(interfaceC4519g, M10, interfaceC0933e3)) {
                return true;
            }
            return e(interfaceC4519g, interfaceC0945q, interfaceC0933e3.b(), z10);
        }
    }

    /* renamed from: Kc.t$g */
    static class g extends r {
        g(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
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
            if (kd.f.g(interfaceC0941m).E(kd.f.g(interfaceC0945q))) {
                return AbstractC0947t.f5600p.a(interfaceC0945q, interfaceC0941m);
            }
            return false;
        }
    }

    /* renamed from: Kc.t$h */
    static class h extends r {
        h(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
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
            return true;
        }
    }

    /* renamed from: Kc.t$i */
    static class i extends r {
        i(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
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
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: Kc.t$j */
    static class j extends r {
        j(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
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
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: Kc.t$k */
    static class k extends r {
        k(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
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
            return false;
        }
    }

    /* renamed from: Kc.t$l */
    static class l extends r {
        l(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
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
            return false;
        }
    }

    static {
        d dVar = new d(m0.e.f5577c);
        f5585a = dVar;
        e eVar = new e(m0.f.f5578c);
        f5586b = eVar;
        f fVar = new f(m0.g.f5579c);
        f5587c = fVar;
        g gVar = new g(m0.b.f5574c);
        f5588d = gVar;
        h hVar = new h(m0.h.f5580c);
        f5589e = hVar;
        i iVar = new i(m0.d.f5576c);
        f5590f = iVar;
        j jVar = new j(m0.a.f5573c);
        f5591g = jVar;
        k kVar = new k(m0.c.f5575c);
        f5592h = kVar;
        l lVar = new l(m0.i.f5581c);
        f5593i = lVar;
        f5594j = Collections.unmodifiableSet(kotlin.collections.O.h(dVar, eVar, gVar, iVar));
        HashMap e10 = Gd.a.e(4);
        e10.put(eVar, 0);
        e10.put(dVar, 0);
        e10.put(gVar, 1);
        e10.put(fVar, 1);
        e10.put(hVar, 2);
        f5595k = Collections.unmodifiableMap(e10);
        f5596l = hVar;
        f5597m = new a();
        f5598n = new b();
        f5599o = new c();
        Iterator it = ServiceLoader.load(Dd.l.class, Dd.l.class.getClassLoader()).iterator();
        f5600p = it.hasNext() ? (Dd.l) it.next() : l.a.f1521a;
        f5601q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 16 ? 3 : 2];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case 9:
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    objArr[0] = "visibility";
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i10 == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i10) {
                case 2:
                case 3:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case 4:
                case 5:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case 6:
                case 7:
                    objArr[2] = "inSameFile";
                    break;
                case 8:
                case 9:
                    objArr[2] = "findInvisibleMember";
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    objArr[2] = "isPrivate";
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            String format = String.format(str, objArr);
            if (i10 != 16) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "from";
        if (i10 == 16) {
        }
        switch (i10) {
        }
        String format2 = String.format(str, objArr);
        if (i10 != 16) {
        }
    }

    public static Integer d(AbstractC0948u abstractC0948u, AbstractC0948u abstractC0948u2) {
        if (abstractC0948u == null) {
            a(12);
        }
        if (abstractC0948u2 == null) {
            a(13);
        }
        Integer a10 = abstractC0948u.a(abstractC0948u2);
        if (a10 != null) {
            return a10;
        }
        Integer a11 = abstractC0948u2.a(abstractC0948u);
        if (a11 != null) {
            return Integer.valueOf(-a11.intValue());
        }
        return null;
    }

    public static InterfaceC0945q e(InterfaceC4519g interfaceC4519g, InterfaceC0945q interfaceC0945q, InterfaceC0941m interfaceC0941m, boolean z10) {
        InterfaceC0945q e10;
        if (interfaceC0945q == null) {
            a(8);
        }
        if (interfaceC0941m == null) {
            a(9);
        }
        for (InterfaceC0945q interfaceC0945q2 = (InterfaceC0945q) interfaceC0945q.a(); interfaceC0945q2 != null && interfaceC0945q2.h() != f5590f; interfaceC0945q2 = (InterfaceC0945q) kd.f.q(interfaceC0945q2, InterfaceC0945q.class)) {
            if (!interfaceC0945q2.h().e(interfaceC4519g, interfaceC0945q2, interfaceC0941m, z10)) {
                return interfaceC0945q2;
            }
        }
        if (!(interfaceC0945q instanceof Mc.I) || (e10 = e(interfaceC4519g, ((Mc.I) interfaceC0945q).v0(), interfaceC0941m, z10)) == null) {
            return null;
        }
        return e10;
    }

    public static boolean f(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2) {
        if (interfaceC0941m == null) {
            a(6);
        }
        if (interfaceC0941m2 == null) {
            a(7);
        }
        b0 j10 = kd.f.j(interfaceC0941m2);
        if (j10 != b0.f5561a) {
            return j10.equals(kd.f.j(interfaceC0941m));
        }
        return false;
    }

    public static boolean g(AbstractC0948u abstractC0948u) {
        if (abstractC0948u == null) {
            a(14);
        }
        return abstractC0948u == f5585a || abstractC0948u == f5586b;
    }

    public static boolean h(InterfaceC0945q interfaceC0945q, InterfaceC0941m interfaceC0941m, boolean z10) {
        if (interfaceC0945q == null) {
            a(2);
        }
        if (interfaceC0941m == null) {
            a(3);
        }
        return e(f5598n, interfaceC0945q, interfaceC0941m, z10) == null;
    }

    private static void i(AbstractC0948u abstractC0948u) {
        f5601q.put(abstractC0948u.b(), abstractC0948u);
    }

    public static AbstractC0948u j(n0 n0Var) {
        if (n0Var == null) {
            a(15);
        }
        AbstractC0948u abstractC0948u = (AbstractC0948u) f5601q.get(n0Var);
        if (abstractC0948u != null) {
            return abstractC0948u;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + n0Var);
    }
}
