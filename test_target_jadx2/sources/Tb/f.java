package Tb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, String key, String keychain, Throwable th) {
        super("Could not encrypt the value for key '" + key + "' under keychain '" + keychain + "'. Caused by: " + (str == null ? "unknown" : str), th);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(keychain, "keychain");
    }
}
