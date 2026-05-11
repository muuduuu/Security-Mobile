package bd;

import Kc.G;
import Kc.J;
import Kc.d0;
import Rc.c;
import Sc.C1154d;
import Sc.q;
import Sc.x;
import Tc.f;
import Vc.c;
import ad.C1377d;
import ad.C1387l;
import id.C3367b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import qd.C3960b;
import ud.l;
import yd.C5212n;
import zd.C5275a;

/* loaded from: classes3.dex */
public abstract class i {

    public static final class a implements Sc.u {
        a() {
        }

        @Override // Sc.u
        public List a(C3367b classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            return null;
        }
    }

    public static final h a(G module, xd.n storageManager, J notFoundClasses, Vc.f lazyJavaPackageFragmentProvider, r reflectKotlinClassFinder, j deserializedDescriptorResolver, ud.r errorReporter, hd.e jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        Intrinsics.checkNotNullParameter(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        return new h(storageManager, module, l.a.f43701a, new k(reflectKotlinClassFinder, deserializedDescriptorResolver), f.a(module, notFoundClasses, storageManager, reflectKotlinClassFinder, jvmMetadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, c.a.f8658a, ud.j.f43677a.a(), kotlin.reflect.jvm.internal.impl.types.checker.l.f36692b.a(), new C5275a(CollectionsKt.e(C5212n.f45551a)));
    }

    public static final Vc.f b(Sc.p javaClassFinder, G module, xd.n storageManager, J notFoundClasses, r reflectKotlinClassFinder, j deserializedDescriptorResolver, ud.r errorReporter, Yc.b javaSourceElementFactory, Vc.i singleModuleClassResolver, z packagePartProvider) {
        Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
        Intrinsics.checkNotNullParameter(singleModuleClassResolver, "singleModuleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
        Tc.j DO_NOTHING = Tc.j.f9768a;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        Tc.g EMPTY = Tc.g.f9761a;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        f.a aVar = f.a.f9760a;
        C3960b c3960b = new C3960b(storageManager, CollectionsKt.j());
        d0.a aVar2 = d0.a.f5565a;
        c.a aVar3 = c.a.f8658a;
        Hc.i iVar = new Hc.i(module, notFoundClasses);
        x.b bVar = Sc.x.f9070d;
        C1154d c1154d = new C1154d(bVar.a());
        c.a aVar4 = c.a.f11135a;
        return new Vc.f(new Vc.b(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, aVar, c3960b, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, iVar, c1154d, new C1387l(new C1377d(aVar4)), q.a.f9048a, aVar4, kotlin.reflect.jvm.internal.impl.types.checker.l.f36692b.a(), bVar.a(), new a(), null, 8388608, null));
    }
}
