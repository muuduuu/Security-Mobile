package Tc;

import Kc.a0;
import Zc.InterfaceC1328a;
import Zc.InterfaceC1329b;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.k;
import xc.C5142C;
import xc.m;
import xc.u;
import yd.M;

/* loaded from: classes3.dex */
public class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Uc.g {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f9740f = {C5142C.k(new u(C5142C.b(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a, reason: collision with root package name */
    private final id.c f9741a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f9742b;

    /* renamed from: c, reason: collision with root package name */
    private final xd.i f9743c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1329b f9744d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9745e;

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Vc.g f9746a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f9747b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Vc.g gVar, b bVar) {
            super(0);
            this.f9746a = gVar;
            this.f9747b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            M y10 = this.f9746a.d().v().o(this.f9747b.e()).y();
            Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
            return y10;
        }
    }

    public b(Vc.g c10, InterfaceC1328a interfaceC1328a, id.c fqName) {
        a0 NO_SOURCE;
        Collection f10;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f9741a = fqName;
        if (interfaceC1328a == null || (NO_SOURCE = c10.a().t().a(interfaceC1328a)) == null) {
            NO_SOURCE = a0.f5560a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        }
        this.f9742b = NO_SOURCE;
        this.f9743c = c10.e().d(new a(c10, this));
        this.f9744d = (interfaceC1328a == null || (f10 = interfaceC1328a.f()) == null) ? null : (InterfaceC1329b) CollectionsKt.e0(f10);
        boolean z10 = false;
        if (interfaceC1328a != null && interfaceC1328a.d()) {
            z10 = true;
        }
        this.f9745e = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return G.h();
    }

    protected final InterfaceC1329b b() {
        return this.f9744d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public M getType() {
        return (M) xd.m.a(this.f9743c, this, f9740f[0]);
    }

    @Override // Uc.g
    public boolean d() {
        return this.f9745e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public id.c e() {
        return this.f9741a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public a0 j() {
        return this.f9742b;
    }
}
