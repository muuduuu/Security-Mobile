package Sc;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Sc.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1158h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final id.c c(id.c cVar, String str) {
        id.c c10 = cVar.c(id.f.o(str));
        Intrinsics.checkNotNullExpressionValue(c10, "child(...)");
        return c10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final id.c d(id.d dVar, String str) {
        id.c l10 = dVar.c(id.f.o(str)).l();
        Intrinsics.checkNotNullExpressionValue(l10, "toSafe(...)");
        return l10;
    }
}
