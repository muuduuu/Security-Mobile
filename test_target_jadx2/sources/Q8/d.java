package q8;

import M0.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class d {
    public static final Object a(f fVar, f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object b10 = fVar.b(key);
        return b10 == null ? obj : b10;
    }
}
