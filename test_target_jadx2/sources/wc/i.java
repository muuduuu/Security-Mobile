package Wc;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Sc.p;
import Wc.b;
import Zc.D;
import Zc.u;
import bd.r;
import bd.s;
import bd.t;
import cd.C1750a;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rd.d;

/* loaded from: classes3.dex */
public final class i extends m {

    /* renamed from: n, reason: collision with root package name */
    private final u f11514n;

    /* renamed from: o, reason: collision with root package name */
    private final h f11515o;

    /* renamed from: p, reason: collision with root package name */
    private final xd.j f11516p;

    /* renamed from: q, reason: collision with root package name */
    private final xd.h f11517q;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final id.f f11518a;

        /* renamed from: b, reason: collision with root package name */
        private final Zc.g f11519b;

        public a(id.f name, Zc.g gVar) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f11518a = name;
            this.f11519b = gVar;
        }

        public final Zc.g a() {
            return this.f11519b;
        }

        public final id.f b() {
            return this.f11518a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.b(this.f11518a, ((a) obj).f11518a);
        }

        public int hashCode() {
            return this.f11518a.hashCode();
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC0933e f11520a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC0933e descriptor) {
                super(null);
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                this.f11520a = descriptor;
            }

            public final InterfaceC0933e a() {
                return this.f11520a;
            }
        }

        /* renamed from: Wc.i$b$b, reason: collision with other inner class name */
        public static final class C0216b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0216b f11521a = new C0216b();

            private C0216b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f11522a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Vc.g f11524b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Vc.g gVar) {
            super(1);
            this.f11524b = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0933e invoke(a request) {
            Intrinsics.checkNotNullParameter(request, "request");
            C3367b c3367b = new C3367b(i.this.C().e(), request.b());
            r.a a10 = request.a() != null ? this.f11524b.a().j().a(request.a(), i.this.R()) : this.f11524b.a().j().c(c3367b, i.this.R());
            t a11 = a10 != null ? a10.a() : null;
            C3367b l10 = a11 != null ? a11.l() : null;
            if (l10 != null && (l10.l() || l10.k())) {
                return null;
            }
            b T10 = i.this.T(a11);
            if (T10 instanceof b.a) {
                return ((b.a) T10).a();
            }
            if (T10 instanceof b.c) {
                return null;
            }
            if (!(T10 instanceof b.C0216b)) {
                throw new lc.m();
            }
            Zc.g a12 = request.a();
            if (a12 == null) {
                a12 = this.f11524b.a().d().a(new p.a(c3367b, null, null, 4, null));
            }
            Zc.g gVar = a12;
            if ((gVar != null ? gVar.P() : null) != D.BINARY) {
                id.c e10 = gVar != null ? gVar.e() : null;
                if (e10 == null || e10.d() || !Intrinsics.b(e10.e(), i.this.C().e())) {
                    return null;
                }
                f fVar = new f(this.f11524b, i.this.C(), gVar, null, 8, null);
                this.f11524b.a().e().a(fVar);
                return fVar;
            }
            throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + c3367b + "\nfindKotlinClass(JavaClass) = " + s.a(this.f11524b.a().j(), gVar, i.this.R()) + "\nfindKotlinClass(ClassId) = " + s.b(this.f11524b.a().j(), c3367b, i.this.R()) + '\n');
        }
    }

    static final class d extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Vc.g f11525a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f11526b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Vc.g gVar, i iVar) {
            super(0);
            this.f11525a = gVar;
            this.f11526b = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return this.f11525a.a().d().b(this.f11526b.C().e());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Vc.g c10, u jPackage, h ownerDescriptor) {
        super(c10);
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f11514n = jPackage;
        this.f11515o = ownerDescriptor;
        this.f11516p = c10.e().f(new d(c10, this));
        this.f11517q = c10.e().i(new c(c10));
    }

    private final InterfaceC0933e O(id.f fVar, Zc.g gVar) {
        if (!id.h.f34194a.a(fVar)) {
            return null;
        }
        Set set = (Set) this.f11516p.invoke();
        if (gVar != null || set == null || set.contains(fVar.c())) {
            return (InterfaceC0933e) this.f11517q.invoke(new a(fVar, gVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hd.e R() {
        return Gd.c.a(w().a().b().d().g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b T(t tVar) {
        if (tVar == null) {
            return b.C0216b.f11521a;
        }
        if (tVar.a().c() != C1750a.EnumC0347a.CLASS) {
            return b.c.f11522a;
        }
        InterfaceC0933e l10 = w().a().b().l(tVar);
        return l10 != null ? new b.a(l10) : b.C0216b.f11521a;
    }

    public final InterfaceC0933e P(Zc.g javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        return O(javaClass.getName(), javaClass);
    }

    @Override // rd.i, rd.k
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public InterfaceC0933e f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return O(name, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Wc.j
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public h C() {
        return this.f11515o;
    }

    @Override // Wc.j, rd.i, rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return CollectionsKt.j();
    }

    @Override // Wc.j, rd.i, rd.k
    public Collection g(rd.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        d.a aVar = rd.d.f40606c;
        if (!kindFilter.a(aVar.e() | aVar.c())) {
            return CollectionsKt.j();
        }
        Iterable iterable = (Iterable) v().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC0941m interfaceC0941m = (InterfaceC0941m) obj;
            if (interfaceC0941m instanceof InterfaceC0933e) {
                id.f name = ((InterfaceC0933e) interfaceC0941m).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // Wc.j
    protected Set l(rd.d kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (!kindFilter.a(rd.d.f40606c.e())) {
            return O.d();
        }
        Set set = (Set) this.f11516p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(id.f.o((String) it.next()));
            }
            return hashSet;
        }
        u uVar = this.f11514n;
        if (function1 == null) {
            function1 = Gd.e.a();
        }
        Collection<Zc.g> w10 = uVar.w(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Zc.g gVar : w10) {
            id.f name = gVar.P() == D.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Wc.j
    protected Set n(rd.d kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return O.d();
    }

    @Override // Wc.j
    protected Wc.b p() {
        return b.a.f11436a;
    }

    @Override // Wc.j
    protected void r(Collection result, id.f name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // Wc.j
    protected Set t(rd.d kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return O.d();
    }
}
