package Mb;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b {
    public static final void a(Set set, boolean z10, Object obj) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        if (z10) {
            set.add(obj);
        }
    }
}
