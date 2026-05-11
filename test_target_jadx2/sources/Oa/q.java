package Oa;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String uri) {
        super("No readable files with the uri '" + uri + "'. Please use other uri", null, 2, null);
        Intrinsics.checkNotNullParameter(uri, "uri");
    }
}
