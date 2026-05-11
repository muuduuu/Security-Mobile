package ad;

import Kc.InterfaceC0933e;
import Kc.j0;
import Sc.C1154d;
import Sc.EnumC1152b;
import Sc.y;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.q0;
import yd.s0;

/* renamed from: ad.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1389n extends AbstractC1374a {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a f12730a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12731b;

    /* renamed from: c, reason: collision with root package name */
    private final Vc.g f12732c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC1152b f12733d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12734e;

    public /* synthetic */ C1389n(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, Vc.g gVar, EnumC1152b enumC1152b, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, z10, gVar, enumC1152b, (i10 & 16) != 0 ? false : z11);
    }

    @Override // ad.AbstractC1374a
    public boolean A(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return ((AbstractC5197E) iVar).Z0() instanceof C1380g;
    }

    @Override // ad.AbstractC1374a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean h(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, Ad.i iVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return ((cVar instanceof Uc.g) && ((Uc.g) cVar).d()) || ((cVar instanceof Wc.e) && !p() && (((Wc.e) cVar).l() || m() == EnumC1152b.TYPE_PARAMETER_BOUNDS)) || (iVar != null && Hc.g.q0((AbstractC5197E) iVar) && i().m(cVar) && !this.f12732c.a().q().c());
    }

    @Override // ad.AbstractC1374a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C1154d i() {
        return this.f12732c.a().a();
    }

    @Override // ad.AbstractC1374a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public AbstractC5197E q(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return s0.a((AbstractC5197E) iVar);
    }

    @Override // ad.AbstractC1374a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public Ad.q v() {
        return kotlin.reflect.jvm.internal.impl.types.checker.o.f36699a;
    }

    @Override // ad.AbstractC1374a
    public Iterable j(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return ((AbstractC5197E) iVar).i();
    }

    @Override // ad.AbstractC1374a
    public Iterable l() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i10;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f12730a;
        return (aVar == null || (i10 = aVar.i()) == null) ? CollectionsKt.j() : i10;
    }

    @Override // ad.AbstractC1374a
    public EnumC1152b m() {
        return this.f12733d;
    }

    @Override // ad.AbstractC1374a
    public y n() {
        return this.f12732c.b();
    }

    @Override // ad.AbstractC1374a
    public boolean o() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar = this.f12730a;
        return (aVar instanceof j0) && ((j0) aVar).r0() != null;
    }

    @Override // ad.AbstractC1374a
    public boolean p() {
        return this.f12732c.a().q().d();
    }

    @Override // ad.AbstractC1374a
    public id.d s(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        InterfaceC0933e f10 = q0.f((AbstractC5197E) iVar);
        if (f10 != null) {
            return kd.f.m(f10);
        }
        return null;
    }

    @Override // ad.AbstractC1374a
    public boolean u() {
        return this.f12734e;
    }

    @Override // ad.AbstractC1374a
    public boolean w(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return Hc.g.e0((AbstractC5197E) iVar);
    }

    @Override // ad.AbstractC1374a
    public boolean x() {
        return this.f12731b;
    }

    @Override // ad.AbstractC1374a
    public boolean y(Ad.i iVar, Ad.i other) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f12732c.a().k().b((AbstractC5197E) iVar, (AbstractC5197E) other);
    }

    @Override // ad.AbstractC1374a
    public boolean z(Ad.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar instanceof Wc.n;
    }

    public C1389n(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, Vc.g containerContext, EnumC1152b containerApplicabilityType, boolean z11) {
        Intrinsics.checkNotNullParameter(containerContext, "containerContext");
        Intrinsics.checkNotNullParameter(containerApplicabilityType, "containerApplicabilityType");
        this.f12730a = aVar;
        this.f12731b = z10;
        this.f12732c = containerContext;
        this.f12733d = containerApplicabilityType;
        this.f12734e = z11;
    }
}
