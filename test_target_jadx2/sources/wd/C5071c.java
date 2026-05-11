package wd;

import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.a0;
import Mc.C0980f;
import dd.C3027d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wd.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5071c extends C0980f implements InterfaceC5070b {

    /* renamed from: F, reason: collision with root package name */
    private final C3027d f44449F;

    /* renamed from: G, reason: collision with root package name */
    private final fd.c f44450G;

    /* renamed from: H, reason: collision with root package name */
    private final fd.g f44451H;

    /* renamed from: I, reason: collision with root package name */
    private final fd.h f44452I;

    /* renamed from: J, reason: collision with root package name */
    private final InterfaceC5074f f44453J;

    public /* synthetic */ C5071c(InterfaceC0933e interfaceC0933e, InterfaceC0940l interfaceC0940l, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, InterfaceC0930b.a aVar, C3027d c3027d, fd.c cVar, fd.g gVar2, fd.h hVar, InterfaceC5074f interfaceC5074f, a0 a0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0933e, interfaceC0940l, gVar, z10, aVar, c3027d, cVar, gVar2, hVar, interfaceC5074f, (i10 & 1024) != 0 ? null : a0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mc.C0980f
    /* renamed from: B1, reason: merged with bridge method [inline-methods] */
    public C5071c U0(InterfaceC0941m newOwner, InterfaceC0952y interfaceC0952y, InterfaceC0930b.a kind, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, a0 source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        C5071c c5071c = new C5071c((InterfaceC0933e) newOwner, (InterfaceC0940l) interfaceC0952y, annotations, this.f6249E, kind, K(), e0(), Y(), D1(), i0(), source);
        c5071c.h1(Z0());
        return c5071c;
    }

    @Override // wd.InterfaceC5075g
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public C3027d K() {
        return this.f44449F;
    }

    public fd.h D1() {
        return this.f44452I;
    }

    @Override // Mc.p, Kc.InterfaceC0952y
    public boolean U() {
        return false;
    }

    @Override // wd.InterfaceC5075g
    public fd.g Y() {
        return this.f44451H;
    }

    @Override // wd.InterfaceC5075g
    public fd.c e0() {
        return this.f44450G;
    }

    @Override // wd.InterfaceC5075g
    public InterfaceC5074f i0() {
        return this.f44453J;
    }

    @Override // Mc.p, Kc.InterfaceC0952y
    public boolean p() {
        return false;
    }

    @Override // Mc.p, Kc.C
    public boolean q() {
        return false;
    }

    @Override // Mc.p, Kc.InterfaceC0952y
    public boolean z() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5071c(InterfaceC0933e containingDeclaration, InterfaceC0940l interfaceC0940l, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, boolean z10, InterfaceC0930b.a kind, C3027d proto, fd.c nameResolver, fd.g typeTable, fd.h versionRequirementTable, InterfaceC5074f interfaceC5074f, a0 a0Var) {
        super(containingDeclaration, interfaceC0940l, annotations, z10, kind, a0Var == null ? a0.f5560a : a0Var);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.f44449F = proto;
        this.f44450G = nameResolver;
        this.f44451H = typeTable;
        this.f44452I = versionRequirementTable;
        this.f44453J = interfaceC5074f;
    }
}
