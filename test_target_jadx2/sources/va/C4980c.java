package va;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: va.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4980c extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4980c(String aspectRatio) {
        super("Unsupported aspect ratio: '" + aspectRatio + "'", null, 2, null);
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
    }
}
