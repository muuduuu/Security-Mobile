package Mc;

import Kc.G;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.P;
import Mc.A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jd.AbstractC3524a;
import kotlin.Lazy;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends AbstractC0984j implements Kc.G {

    /* renamed from: c, reason: collision with root package name */
    private final xd.n f6358c;

    /* renamed from: d, reason: collision with root package name */
    private final Hc.g f6359d;

    /* renamed from: e, reason: collision with root package name */
    private final id.f f6360e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f6361f;

    /* renamed from: g, reason: collision with root package name */
    private final A f6362g;

    /* renamed from: h, reason: collision with root package name */
    private v f6363h;

    /* renamed from: i, reason: collision with root package name */
    private Kc.L f6364i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6365j;

    /* renamed from: k, reason: collision with root package name */
    private final xd.g f6366k;

    /* renamed from: l, reason: collision with root package name */
    private final Lazy f6367l;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0983i invoke() {
            v vVar = x.this.f6363h;
            x xVar = x.this;
            if (vVar == null) {
                throw new AssertionError("Dependencies of module " + xVar.Y0() + " were not set before querying module content");
            }
            List a10 = vVar.a();
            x.this.X0();
            a10.contains(x.this);
            List list = a10;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((x) it.next()).c1();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Kc.L l10 = ((x) it2.next()).f6364i;
                Intrinsics.d(l10);
                arrayList.add(l10);
            }
            return new C0983i(arrayList, "CompositeProvider@ModuleDescriptor for " + x.this.getName());
        }
    }

    static final class b extends xc.m implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P invoke(id.c fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            A a10 = x.this.f6362g;
            x xVar = x.this;
            return a10.a(xVar, fqName, xVar.f6358c);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(id.f moduleName, xd.n storageManager, Hc.g builtIns, AbstractC3524a abstractC3524a) {
        this(moduleName, storageManager, builtIns, abstractC3524a, null, null, 48, null);
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Y0() {
        String fVar = getName().toString();
        Intrinsics.checkNotNullExpressionValue(fVar, "toString(...)");
        return fVar;
    }

    private final C0983i a1() {
        return (C0983i) this.f6367l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c1() {
        return this.f6364i != null;
    }

    @Override // Kc.G
    public boolean E(Kc.G targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        if (Intrinsics.b(this, targetModule)) {
            return true;
        }
        v vVar = this.f6363h;
        Intrinsics.d(vVar);
        return CollectionsKt.V(vVar.b(), targetModule) || z0().contains(targetModule) || targetModule.z0().contains(this);
    }

    @Override // Kc.G
    public Object E0(Kc.F capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        Object obj = this.f6361f.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public void X0() {
        if (d1()) {
            return;
        }
        Kc.B.a(this);
    }

    public final Kc.L Z0() {
        X0();
        return a1();
    }

    @Override // Kc.InterfaceC0941m
    public InterfaceC0941m b() {
        return G.a.b(this);
    }

    public final void b1(Kc.L providerForModuleContent) {
        Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
        c1();
        this.f6364i = providerForModuleContent;
    }

    public boolean d1() {
        return this.f6365j;
    }

    public final void e1(v dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.f6363h = dependencies;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return G.a.a(this, interfaceC0943o, obj);
    }

    public final void f1(List descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        g1(descriptors, O.d());
    }

    public final void g1(List descriptors, Set friends) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        Intrinsics.checkNotNullParameter(friends, "friends");
        e1(new w(descriptors, friends, CollectionsKt.j(), O.d()));
    }

    public final void h1(x... descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        f1(AbstractC3574i.m0(descriptors));
    }

    @Override // Kc.G
    public P p0(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        X0();
        return (P) this.f6366k.invoke(fqName);
    }

    @Override // Kc.G
    public Collection t(id.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        X0();
        return Z0().t(fqName, nameFilter);
    }

    @Override // Mc.AbstractC0984j
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!d1()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        Kc.L l10 = this.f6364i;
        sb2.append(l10 != null ? l10.getClass().getSimpleName() : null);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // Kc.G
    public Hc.g v() {
        return this.f6359d;
    }

    @Override // Kc.G
    public List z0() {
        v vVar = this.f6363h;
        if (vVar != null) {
            return vVar.c();
        }
        throw new AssertionError("Dependencies of module " + Y0() + " were not set");
    }

    public /* synthetic */ x(id.f fVar, xd.n nVar, Hc.g gVar, AbstractC3524a abstractC3524a, Map map, id.f fVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, nVar, gVar, (i10 & 8) != 0 ? null : abstractC3524a, (i10 & 16) != 0 ? kotlin.collections.G.h() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(id.f moduleName, xd.n storageManager, Hc.g builtIns, AbstractC3524a abstractC3524a, Map capabilities, id.f fVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), moduleName);
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.f6358c = storageManager;
        this.f6359d = builtIns;
        this.f6360e = fVar;
        if (moduleName.p()) {
            this.f6361f = capabilities;
            A a10 = (A) E0(A.f6140a.a());
            this.f6362g = a10 == null ? A.b.f6143b : a10;
            this.f6365j = true;
            this.f6366k = storageManager.h(new b());
            this.f6367l = lc.i.a(new a());
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}
