package Gd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d {
    public static final boolean a(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Class<?> cls = th.getClass();
        while (!Intrinsics.b(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        throw e10;
    }
}
