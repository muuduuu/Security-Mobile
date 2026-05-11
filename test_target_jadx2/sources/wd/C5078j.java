package wd;

import Kc.AbstractC0948u;
import Kc.D;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0941m;
import Kc.U;
import Kc.a0;
import Mc.C;
import dd.C3037n;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wd.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5078j extends C implements InterfaceC5070b {

    /* renamed from: C, reason: collision with root package name */
    private final C3037n f44557C;

    /* renamed from: D, reason: collision with root package name */
    private final fd.c f44558D;

    /* renamed from: E, reason: collision with root package name */
    private final fd.g f44559E;

    /* renamed from: F, reason: collision with root package name */
    private final fd.h f44560F;

    /* renamed from: G, reason: collision with root package name */
    private final InterfaceC5074f f44561G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5078j(InterfaceC0941m containingDeclaration, U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, D modality, AbstractC0948u visibility, boolean z10, id.f name, InterfaceC0930b.a kind, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, C3037n proto, fd.c nameResolver, fd.g typeTable, fd.h versionRequirementTable, InterfaceC5074f interfaceC5074f) {
        super(containingDeclaration, u10, annotations, modality, visibility, z10, name, kind, a0.f5560a, z11, z12, z15, false, z13, z14);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.f44557C = proto;
        this.f44558D = nameResolver;
        this.f44559E = typeTable;
        this.f44560F = versionRequirementTable;
        this.f44561G = interfaceC5074f;
    }

    @Override // wd.InterfaceC5075g
    public fd.g Y() {
        return this.f44559E;
    }

    @Override // Mc.C
    protected C Y0(InterfaceC0941m newOwner, D newModality, AbstractC0948u newVisibility, U u10, InterfaceC0930b.a kind, id.f newName, a0 source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newModality, "newModality");
        Intrinsics.checkNotNullParameter(newVisibility, "newVisibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(source, "source");
        return new C5078j(newOwner, u10, i(), newModality, newVisibility, q0(), newName, kind, y0(), G(), q(), T(), R(), K(), e0(), Y(), p1(), i0());
    }

    @Override // wd.InterfaceC5075g
    public fd.c e0() {
        return this.f44558D;
    }

    @Override // wd.InterfaceC5075g
    public InterfaceC5074f i0() {
        return this.f44561G;
    }

    @Override // wd.InterfaceC5075g
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C3037n K() {
        return this.f44557C;
    }

    public fd.h p1() {
        return this.f44560F;
    }

    @Override // Mc.C, Kc.C
    public boolean q() {
        Boolean d10 = fd.b.f32998E.d(K().X());
        Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
        return d10.booleanValue();
    }
}
