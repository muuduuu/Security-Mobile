package ta;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ta.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4825c extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4825c(String url) {
        super("Unable to download asset from url: " + url, null, 2, null);
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
