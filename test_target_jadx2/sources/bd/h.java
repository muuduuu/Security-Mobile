package bd;

import Jc.f;
import Kc.G;
import Kc.J;
import Lc.a;
import Lc.c;
import Mc.C0983i;
import bd.z;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qd.C3960b;
import ud.l;
import ud.w;
import zd.C5275a;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19005b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ud.k f19006a;

    public static final class a {

        /* renamed from: bd.h$a$a, reason: collision with other inner class name */
        public static final class C0336a {

            /* renamed from: a, reason: collision with root package name */
            private final h f19007a;

            /* renamed from: b, reason: collision with root package name */
            private final j f19008b;

            public C0336a(h deserializationComponentsForJava, j deserializedDescriptorResolver) {
                Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "deserializationComponentsForJava");
                Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f19007a = deserializationComponentsForJava;
                this.f19008b = deserializedDescriptorResolver;
            }

            public final h a() {
                return this.f19007a;
            }

            public final j b() {
                return this.f19008b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0336a a(r kotlinClassFinder, r jvmBuiltInsKotlinClassFinder, Sc.p javaClassFinder, String moduleName, ud.r errorReporter, Yc.b javaSourceElementFactory) {
            Vc.f b10;
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
            xd.f fVar = new xd.f("DeserializationComponentsForJava.ModuleData");
            Jc.f fVar2 = new Jc.f(fVar, f.a.FROM_DEPENDENCIES);
            id.f r10 = id.f.r('<' + moduleName + '>');
            Intrinsics.checkNotNullExpressionValue(r10, "special(...)");
            Mc.x xVar = new Mc.x(r10, fVar, fVar2, null, null, null, 56, null);
            fVar2.E0(xVar);
            fVar2.J0(xVar, true);
            j jVar = new j();
            Vc.j jVar2 = new Vc.j();
            J j10 = new J(fVar, xVar);
            b10 = i.b(javaClassFinder, xVar, fVar, j10, kotlinClassFinder, jVar, errorReporter, javaSourceElementFactory, jVar2, (r21 & 512) != 0 ? z.a.f19050a : null);
            h a10 = i.a(xVar, fVar, j10, b10, kotlinClassFinder, jVar, errorReporter, hd.e.f34067i);
            jVar.m(a10);
            Tc.g EMPTY = Tc.g.f9761a;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            pd.c cVar = new pd.c(b10, EMPTY);
            jVar2.c(cVar);
            Jc.k kVar = new Jc.k(fVar, jvmBuiltInsKotlinClassFinder, xVar, j10, fVar2.I0(), fVar2.I0(), l.a.f43701a, kotlin.reflect.jvm.internal.impl.types.checker.l.f36692b.a(), new C3960b(fVar, CollectionsKt.j()));
            xVar.h1(xVar);
            xVar.b1(new C0983i(CollectionsKt.m(cVar.a(), kVar), "CompositeProvider@RuntimeModuleData for " + xVar));
            return new C0336a(a10, jVar);
        }

        private a() {
        }
    }

    public h(xd.n storageManager, G moduleDescriptor, ud.l configuration, k classDataFinder, C1678e annotationAndConstantLoader, Vc.f packageFragmentProvider, J notFoundClasses, ud.r errorReporter, Rc.c lookupTracker, ud.j contractDeserializer, kotlin.reflect.jvm.internal.impl.types.checker.l kotlinTypeChecker, C5275a typeAttributeTranslators) {
        Lc.c I02;
        Lc.a I03;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        Hc.g v10 = moduleDescriptor.v();
        Jc.f fVar = v10 instanceof Jc.f ? (Jc.f) v10 : null;
        this.f19006a = new ud.k(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, w.a.f43731a, errorReporter, lookupTracker, l.f19019a, CollectionsKt.j(), notFoundClasses, contractDeserializer, (fVar == null || (I03 = fVar.I0()) == null) ? a.C0116a.f5747a : I03, (fVar == null || (I02 = fVar.I0()) == null) ? c.b.f5749a : I02, hd.i.f34080a.a(), kotlinTypeChecker, new C3960b(storageManager, CollectionsKt.j()), typeAttributeTranslators.a(), ud.u.f43730a);
    }

    public final ud.k a() {
        return this.f19006a;
    }
}
