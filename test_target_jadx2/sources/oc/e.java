package Oc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e {
    public static final Class a(ClassLoader classLoader, String fqName) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
