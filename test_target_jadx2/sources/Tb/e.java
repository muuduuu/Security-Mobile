package Tb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends CodedException {
    public /* synthetic */ e(String str, String str2, String str3, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String key, String keychain, Throwable th) {
        super("Could not delete the value for key '" + key + "' under keychain '" + keychain + "'. Caused by: " + (str == null ? "unknown" : str), th);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(keychain, "keychain");
    }
}
