package Mc;

import Kc.InterfaceC0943o;
import Kc.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rd.h;
import xc.C5142C;

/* loaded from: classes3.dex */
public class r extends AbstractC0984j implements P {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f6336h = {C5142C.k(new xc.u(C5142C.b(r.class), "fragments", "getFragments()Ljava/util/List;")), C5142C.k(new xc.u(C5142C.b(r.class), "empty", "getEmpty()Z"))};

    /* renamed from: c, reason: collision with root package name */
    private final x f6337c;

    /* renamed from: d, reason: collision with root package name */
    private final id.c f6338d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.i f6339e;

    /* renamed from: f, reason: collision with root package name */
    private final xd.i f6340f;

    /* renamed from: g, reason: collision with root package name */
    private final rd.h f6341g;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Kc.N.b(r.this.C0().Z0(), r.this.e()));
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return Kc.N.c(r.this.C0().Z0(), r.this.e());
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rd.h invoke() {
            if (r.this.isEmpty()) {
                return h.b.f40647b;
            }
            List O10 = r.this.O();
            ArrayList arrayList = new ArrayList(CollectionsKt.u(O10, 10));
            Iterator it = O10.iterator();
            while (it.hasNext()) {
                arrayList.add(((Kc.K) it.next()).w());
            }
            List x02 = CollectionsKt.x0(arrayList, new H(r.this.C0(), r.this.e()));
            return rd.b.f40600d.a("package view scope for " + r.this.e() + " in " + r.this.C0().getName(), x02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x module, id.c fqName, xd.n storageManager) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), fqName.h());
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f6337c = module;
        this.f6338d = fqName;
        this.f6339e = storageManager.d(new b());
        this.f6340f = storageManager.d(new a());
        this.f6341g = new rd.g(storageManager, new c());
    }

    @Override // Kc.InterfaceC0941m
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public P b() {
        if (e().d()) {
            return null;
        }
        x C02 = C0();
        id.c e10 = e().e();
        Intrinsics.checkNotNullExpressionValue(e10, "parent(...)");
        return C02.p0(e10);
    }

    protected final boolean N0() {
        return ((Boolean) xd.m.a(this.f6340f, this, f6336h[1])).booleanValue();
    }

    @Override // Kc.P
    public List O() {
        return (List) xd.m.a(this.f6339e, this, f6336h[0]);
    }

    @Override // Kc.P
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public x C0() {
        return this.f6337c;
    }

    @Override // Kc.P
    public id.c e() {
        return this.f6338d;
    }

    public boolean equals(Object obj) {
        P p10 = obj instanceof P ? (P) obj : null;
        return p10 != null && Intrinsics.b(e(), p10.e()) && Intrinsics.b(C0(), p10.C0());
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.c(this, obj);
    }

    public int hashCode() {
        return (C0().hashCode() * 31) + e().hashCode();
    }

    @Override // Kc.P
    public boolean isEmpty() {
        return N0();
    }

    @Override // Kc.P
    public rd.h w() {
        return this.f6341g;
    }
}
