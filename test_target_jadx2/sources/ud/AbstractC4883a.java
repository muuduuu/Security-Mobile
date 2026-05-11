package ud;

import Kc.K;
import Kc.O;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ud.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4883a implements O {

    /* renamed from: a, reason: collision with root package name */
    private final xd.n f43654a;

    /* renamed from: b, reason: collision with root package name */
    private final v f43655b;

    /* renamed from: c, reason: collision with root package name */
    private final Kc.G f43656c;

    /* renamed from: d, reason: collision with root package name */
    protected k f43657d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.h f43658e;

    /* renamed from: ud.a$a, reason: collision with other inner class name */
    static final class C0627a extends xc.m implements Function1 {
        C0627a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(id.c fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            o d10 = AbstractC4883a.this.d(fqName);
            if (d10 == null) {
                return null;
            }
            d10.U0(AbstractC4883a.this.e());
            return d10;
        }
    }

    public AbstractC4883a(xd.n storageManager, v finder, Kc.G moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        this.f43654a = storageManager;
        this.f43655b = finder;
        this.f43656c = moduleDescriptor;
        this.f43658e = storageManager.i(new C0627a());
    }

    @Override // Kc.O
    public boolean a(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (this.f43658e.t(fqName) ? (K) this.f43658e.invoke(fqName) : d(fqName)) == null;
    }

    @Override // Kc.O
    public void b(id.c fqName, Collection packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        Gd.a.a(packageFragments, this.f43658e.invoke(fqName));
    }

    @Override // Kc.L
    public List c(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return CollectionsKt.n(this.f43658e.invoke(fqName));
    }

    protected abstract o d(id.c cVar);

    protected final k e() {
        k kVar = this.f43657d;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.v("components");
        return null;
    }

    protected final v f() {
        return this.f43655b;
    }

    protected final Kc.G g() {
        return this.f43656c;
    }

    protected final xd.n h() {
        return this.f43654a;
    }

    protected final void i(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f43657d = kVar;
    }

    @Override // Kc.L
    public Collection t(id.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return kotlin.collections.O.d();
    }
}
