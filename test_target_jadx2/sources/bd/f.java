package bd;

import Kc.G;
import Kc.J;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public static final C1678e a(G module, J notFoundClasses, xd.n storageManager, r kotlinClassFinder, hd.e jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        C1678e c1678e = new C1678e(module, notFoundClasses, storageManager, kotlinClassFinder);
        c1678e.N(jvmMetadataVersion);
        return c1678e;
    }
}
