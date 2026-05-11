package ud;

import Kc.InterfaceC0933e;
import Kc.J;
import Kc.K;
import Kc.L;
import Lc.a;
import Lc.c;
import fd.AbstractC3165a;
import id.C3367b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qd.InterfaceC3959a;
import ud.q;
import wd.InterfaceC5074f;
import yd.C5212n;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final xd.n f43680a;

    /* renamed from: b, reason: collision with root package name */
    private final Kc.G f43681b;

    /* renamed from: c, reason: collision with root package name */
    private final l f43682c;

    /* renamed from: d, reason: collision with root package name */
    private final h f43683d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4885c f43684e;

    /* renamed from: f, reason: collision with root package name */
    private final L f43685f;

    /* renamed from: g, reason: collision with root package name */
    private final w f43686g;

    /* renamed from: h, reason: collision with root package name */
    private final r f43687h;

    /* renamed from: i, reason: collision with root package name */
    private final Rc.c f43688i;

    /* renamed from: j, reason: collision with root package name */
    private final s f43689j;

    /* renamed from: k, reason: collision with root package name */
    private final Iterable f43690k;

    /* renamed from: l, reason: collision with root package name */
    private final J f43691l;

    /* renamed from: m, reason: collision with root package name */
    private final j f43692m;

    /* renamed from: n, reason: collision with root package name */
    private final Lc.a f43693n;

    /* renamed from: o, reason: collision with root package name */
    private final Lc.c f43694o;

    /* renamed from: p, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.g f43695p;

    /* renamed from: q, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.l f43696q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3959a f43697r;

    /* renamed from: s, reason: collision with root package name */
    private final List f43698s;

    /* renamed from: t, reason: collision with root package name */
    private final q f43699t;

    /* renamed from: u, reason: collision with root package name */
    private final i f43700u;

    public k(xd.n storageManager, Kc.G moduleDescriptor, l configuration, h classDataFinder, InterfaceC4885c annotationAndConstantLoader, L packageFragmentProvider, w localClassifierTypeSettings, r errorReporter, Rc.c lookupTracker, s flexibleTypeDeserializer, Iterable fictitiousClassDescriptorFactories, J notFoundClasses, j contractDeserializer, Lc.a additionalClassPartsProvider, Lc.c platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.protobuf.g extensionRegistryLite, kotlin.reflect.jvm.internal.impl.types.checker.l kotlinTypeChecker, InterfaceC3959a samConversionResolver, List typeAttributeTranslators, q enumEntriesDeserializationSupport) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(localClassifierTypeSettings, "localClassifierTypeSettings");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        Intrinsics.checkNotNullParameter(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        Intrinsics.checkNotNullParameter(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f43680a = storageManager;
        this.f43681b = moduleDescriptor;
        this.f43682c = configuration;
        this.f43683d = classDataFinder;
        this.f43684e = annotationAndConstantLoader;
        this.f43685f = packageFragmentProvider;
        this.f43686g = localClassifierTypeSettings;
        this.f43687h = errorReporter;
        this.f43688i = lookupTracker;
        this.f43689j = flexibleTypeDeserializer;
        this.f43690k = fictitiousClassDescriptorFactories;
        this.f43691l = notFoundClasses;
        this.f43692m = contractDeserializer;
        this.f43693n = additionalClassPartsProvider;
        this.f43694o = platformDependentDeclarationFilter;
        this.f43695p = extensionRegistryLite;
        this.f43696q = kotlinTypeChecker;
        this.f43697r = samConversionResolver;
        this.f43698s = typeAttributeTranslators;
        this.f43699t = enumEntriesDeserializationSupport;
        this.f43700u = new i(this);
    }

    public final m a(K descriptor, fd.c nameResolver, fd.g typeTable, fd.h versionRequirementTable, AbstractC3165a metadataVersion, InterfaceC5074f interfaceC5074f) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        return new m(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, interfaceC5074f, null, CollectionsKt.j());
    }

    public final InterfaceC0933e b(C3367b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return i.e(this.f43700u, classId, null, 2, null);
    }

    public final Lc.a c() {
        return this.f43693n;
    }

    public final InterfaceC4885c d() {
        return this.f43684e;
    }

    public final h e() {
        return this.f43683d;
    }

    public final i f() {
        return this.f43700u;
    }

    public final l g() {
        return this.f43682c;
    }

    public final j h() {
        return this.f43692m;
    }

    public final q i() {
        return this.f43699t;
    }

    public final r j() {
        return this.f43687h;
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.g k() {
        return this.f43695p;
    }

    public final Iterable l() {
        return this.f43690k;
    }

    public final s m() {
        return this.f43689j;
    }

    public final kotlin.reflect.jvm.internal.impl.types.checker.l n() {
        return this.f43696q;
    }

    public final w o() {
        return this.f43686g;
    }

    public final Rc.c p() {
        return this.f43688i;
    }

    public final Kc.G q() {
        return this.f43681b;
    }

    public final J r() {
        return this.f43691l;
    }

    public final L s() {
        return this.f43685f;
    }

    public final Lc.c t() {
        return this.f43694o;
    }

    public final xd.n u() {
        return this.f43680a;
    }

    public final List v() {
        return this.f43698s;
    }

    public /* synthetic */ k(xd.n nVar, Kc.G g10, l lVar, h hVar, InterfaceC4885c interfaceC4885c, L l10, w wVar, r rVar, Rc.c cVar, s sVar, Iterable iterable, J j10, j jVar, Lc.a aVar, Lc.c cVar2, kotlin.reflect.jvm.internal.impl.protobuf.g gVar, kotlin.reflect.jvm.internal.impl.types.checker.l lVar2, InterfaceC3959a interfaceC3959a, List list, q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, g10, lVar, hVar, interfaceC4885c, l10, wVar, rVar, cVar, sVar, iterable, j10, jVar, (i10 & 8192) != 0 ? a.C0116a.f5747a : aVar, (i10 & 16384) != 0 ? c.a.f5748a : cVar2, gVar, (65536 & i10) != 0 ? kotlin.reflect.jvm.internal.impl.types.checker.l.f36692b.a() : lVar2, interfaceC3959a, (262144 & i10) != 0 ? CollectionsKt.e(C5212n.f45551a) : list, (i10 & 524288) != 0 ? q.a.f43721a : qVar);
    }
}
