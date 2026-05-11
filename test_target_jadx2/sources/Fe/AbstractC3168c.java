package fe;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: fe.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3168c {
    public static final int a(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char charAt = str.charAt(i10);
        return (charAt << 7) + str.charAt(i10 + 1);
    }
}
