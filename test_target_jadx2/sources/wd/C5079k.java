package wd;

import Kc.InterfaceC0930b;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.Z;
import Kc.a0;
import Mc.G;
import Mc.p;
import dd.C3032i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wd.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5079k extends G implements InterfaceC5070b {

    /* renamed from: E, reason: collision with root package name */
    private final C3032i f44562E;

    /* renamed from: F, reason: collision with root package name */
    private final fd.c f44563F;

    /* renamed from: G, reason: collision with root package name */
    private final fd.g f44564G;

    /* renamed from: H, reason: collision with root package name */
    private final fd.h f44565H;

    /* renamed from: I, reason: collision with root package name */
    private final InterfaceC5074f f44566I;

    public /* synthetic */ C5079k(InterfaceC0941m interfaceC0941m, Z z10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, InterfaceC0930b.a aVar, C3032i c3032i, fd.c cVar, fd.g gVar2, fd.h hVar, InterfaceC5074f interfaceC5074f, a0 a0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0941m, z10, gVar, fVar, aVar, c3032i, cVar, gVar2, hVar, interfaceC5074f, (i10 & 1024) != 0 ? null : a0Var);
    }

    @Override // Mc.G, Mc.p
    protected p U0(InterfaceC0941m newOwner, InterfaceC0952y interfaceC0952y, InterfaceC0930b.a kind, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, a0 source) {
        id.f fVar2;
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        Z z10 = (Z) interfaceC0952y;
        if (fVar == null) {
            id.f name = getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        C5079k c5079k = new C5079k(newOwner, z10, annotations, fVar2, kind, K(), e0(), Y(), z1(), i0(), source);
        c5079k.h1(Z0());
        return c5079k;
    }

    @Override // wd.InterfaceC5075g
    public fd.g Y() {
        return this.f44564G;
    }

    @Override // wd.InterfaceC5075g
    public fd.c e0() {
        return this.f44563F;
    }

    @Override // wd.InterfaceC5075g
    public InterfaceC5074f i0() {
        return this.f44566I;
    }

    @Override // wd.InterfaceC5075g
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public C3032i K() {
        return this.f44562E;
    }

    public fd.h z1() {
        return this.f44565H;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5079k(InterfaceC0941m containingDeclaration, Z z10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, id.f name, InterfaceC0930b.a kind, C3032i proto, fd.c nameResolver, fd.g typeTable, fd.h versionRequirementTable, InterfaceC5074f interfaceC5074f, a0 a0Var) {
        super(containingDeclaration, z10, annotations, name, kind, a0Var == null ? a0.f5560a : a0Var);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.f44562E = proto;
        this.f44563F = nameResolver;
        this.f44564G = typeTable;
        this.f44565H = versionRequirementTable;
        this.f44566I = interfaceC5074f;
    }
}
