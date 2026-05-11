package Qa;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
final class a extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String uri) {
        super("File '" + uri + "' doesn't exist", null, 2, null);
        Intrinsics.checkNotNullParameter(uri, "uri");
    }
}
