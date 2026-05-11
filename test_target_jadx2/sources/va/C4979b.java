package va;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: va.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4979b extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4979b(String url) {
        super("Could not get the image from given url: '" + url + "'", null, 2, null);
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
