package Kc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class N {
    public static final void a(L l10, id.c fqName, Collection packageFragments) {
        Intrinsics.checkNotNullParameter(l10, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        if (l10 instanceof O) {
            ((O) l10).b(fqName, packageFragments);
        } else {
            packageFragments.addAll(l10.c(fqName));
        }
    }

    public static final boolean b(L l10, id.c fqName) {
        Intrinsics.checkNotNullParameter(l10, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return l10 instanceof O ? ((O) l10).a(fqName) : c(l10, fqName).isEmpty();
    }

    public static final List c(L l10, id.c fqName) {
        Intrinsics.checkNotNullParameter(l10, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(l10, fqName, arrayList);
        return arrayList;
    }
}
