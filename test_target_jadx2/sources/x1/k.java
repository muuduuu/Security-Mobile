package x1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k {
    public abstract j a(String str);

    public final j b(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        j a10 = a(className);
        return a10 == null ? l.a(className) : a10;
    }
}
