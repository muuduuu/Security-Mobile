package expo.modules.kotlin.exception;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/exception/InvalidArgsNumberException;", "Lexpo/modules/kotlin/exception/CodedException;", "received", BuildConfig.FLAVOR, "expected", "required", "(III)V", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvalidArgsNumberException extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InvalidArgsNumberException(int i10, int i11, int i12) {
        super(r4, null, 2, null);
        String str;
        if (i12 < i11) {
            str = "Received " + i10 + " arguments, but " + i11 + " was expected and at least " + i12 + " is required";
        } else {
            str = "Received " + i10 + " arguments, but " + i11 + " was expected";
        }
    }
}
