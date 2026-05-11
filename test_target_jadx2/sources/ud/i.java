package ud;

import Hc.j;
import Kc.InterfaceC0933e;
import Kc.K;
import Kc.L;
import Kc.N;
import Kc.a0;
import dd.C3026c;
import dd.C3043t;
import fd.AbstractC3165a;
import fd.h;
import id.C3367b;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wd.C5072d;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final b f43670c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Set f43671d = O.c(C3367b.m(j.a.f3937d.l()));

    /* renamed from: a, reason: collision with root package name */
    private final k f43672a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f43673b;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C3367b f43674a;

        /* renamed from: b, reason: collision with root package name */
        private final C4889g f43675b;

        public a(C3367b classId, C4889g c4889g) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f43674a = classId;
            this.f43675b = c4889g;
        }

        public final C4889g a() {
            return this.f43675b;
        }

        public final C3367b b() {
            return this.f43674a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.b(this.f43674a, ((a) obj).f43674a);
        }

        public int hashCode() {
            return this.f43674a.hashCode();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return i.f43671d;
        }

        private b() {
        }
    }

    static final class c extends xc.m implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0933e invoke(a key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return i.this.c(key);
        }
    }

    public i(k components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f43672a = components;
        this.f43673b = components.u().i(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0933e c(a aVar) {
        Object obj;
        m a10;
        C3367b b10 = aVar.b();
        Iterator it = this.f43672a.l().iterator();
        while (it.hasNext()) {
            InterfaceC0933e a11 = ((Lc.b) it.next()).a(b10);
            if (a11 != null) {
                return a11;
            }
        }
        if (f43671d.contains(b10)) {
            return null;
        }
        C4889g a12 = aVar.a();
        if (a12 == null && (a12 = this.f43672a.e().a(b10)) == null) {
            return null;
        }
        fd.c a13 = a12.a();
        C3026c b11 = a12.b();
        AbstractC3165a c10 = a12.c();
        a0 d10 = a12.d();
        C3367b g10 = b10.g();
        if (g10 != null) {
            InterfaceC0933e e10 = e(this, g10, null, 2, null);
            C5072d c5072d = e10 instanceof C5072d ? (C5072d) e10 : null;
            if (c5072d == null) {
                return null;
            }
            id.f j10 = b10.j();
            Intrinsics.checkNotNullExpressionValue(j10, "getShortClassName(...)");
            if (!c5072d.p1(j10)) {
                return null;
            }
            a10 = c5072d.i1();
        } else {
            L s10 = this.f43672a.s();
            id.c h10 = b10.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getPackageFqName(...)");
            Iterator it2 = N.c(s10, h10).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                K k10 = (K) obj;
                if (!(k10 instanceof o)) {
                    break;
                }
                id.f j11 = b10.j();
                Intrinsics.checkNotNullExpressionValue(j11, "getShortClassName(...)");
                if (((o) k10).T0(j11)) {
                    break;
                }
            }
            K k11 = (K) obj;
            if (k11 == null) {
                return null;
            }
            k kVar = this.f43672a;
            C3043t f12 = b11.f1();
            Intrinsics.checkNotNullExpressionValue(f12, "getTypeTable(...)");
            fd.g gVar = new fd.g(f12);
            h.a aVar2 = fd.h.f33043b;
            dd.w h12 = b11.h1();
            Intrinsics.checkNotNullExpressionValue(h12, "getVersionRequirementTable(...)");
            a10 = kVar.a(k11, a13, gVar, aVar2.a(h12), c10, null);
        }
        return new C5072d(a10, b11, a13, c10, d10);
    }

    public static /* synthetic */ InterfaceC0933e e(i iVar, C3367b c3367b, C4889g c4889g, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c4889g = null;
        }
        return iVar.d(c3367b, c4889g);
    }

    public final InterfaceC0933e d(C3367b classId, C4889g c4889g) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return (InterfaceC0933e) this.f43673b.invoke(new a(classId, c4889g));
    }
}
