package ud;

import Kc.InterfaceC0941m;
import fd.AbstractC3165a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wd.InterfaceC5074f;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final k f43702a;

    /* renamed from: b, reason: collision with root package name */
    private final fd.c f43703b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0941m f43704c;

    /* renamed from: d, reason: collision with root package name */
    private final fd.g f43705d;

    /* renamed from: e, reason: collision with root package name */
    private final fd.h f43706e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3165a f43707f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC5074f f43708g;

    /* renamed from: h, reason: collision with root package name */
    private final E f43709h;

    /* renamed from: i, reason: collision with root package name */
    private final x f43710i;

    public m(k components, fd.c nameResolver, InterfaceC0941m containingDeclaration, fd.g typeTable, fd.h versionRequirementTable, AbstractC3165a metadataVersion, InterfaceC5074f interfaceC5074f, E e10, List typeParameters) {
        String c10;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        this.f43702a = components;
        this.f43703b = nameResolver;
        this.f43704c = containingDeclaration;
        this.f43705d = typeTable;
        this.f43706e = versionRequirementTable;
        this.f43707f = metadataVersion;
        this.f43708g = interfaceC5074f;
        this.f43709h = new E(this, e10, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (interfaceC5074f == null || (c10 = interfaceC5074f.c()) == null) ? "[container not found]" : c10);
        this.f43710i = new x(this);
    }

    public static /* synthetic */ m b(m mVar, InterfaceC0941m interfaceC0941m, List list, fd.c cVar, fd.g gVar, fd.h hVar, AbstractC3165a abstractC3165a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = mVar.f43703b;
        }
        fd.c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            gVar = mVar.f43705d;
        }
        fd.g gVar2 = gVar;
        if ((i10 & 16) != 0) {
            hVar = mVar.f43706e;
        }
        fd.h hVar2 = hVar;
        if ((i10 & 32) != 0) {
            abstractC3165a = mVar.f43707f;
        }
        return mVar.a(interfaceC0941m, list, cVar2, gVar2, hVar2, abstractC3165a);
    }

    public final m a(InterfaceC0941m descriptor, List typeParameterProtos, fd.c nameResolver, fd.g typeTable, fd.h hVar, AbstractC3165a metadataVersion) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        fd.h versionRequirementTable = hVar;
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        k kVar = this.f43702a;
        if (!fd.i.b(metadataVersion)) {
            versionRequirementTable = this.f43706e;
        }
        return new m(kVar, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, this.f43708g, this.f43709h, typeParameterProtos);
    }

    public final k c() {
        return this.f43702a;
    }

    public final InterfaceC5074f d() {
        return this.f43708g;
    }

    public final InterfaceC0941m e() {
        return this.f43704c;
    }

    public final x f() {
        return this.f43710i;
    }

    public final fd.c g() {
        return this.f43703b;
    }

    public final xd.n h() {
        return this.f43702a.u();
    }

    public final E i() {
        return this.f43709h;
    }

    public final fd.g j() {
        return this.f43705d;
    }

    public final fd.h k() {
        return this.f43706e;
    }
}
