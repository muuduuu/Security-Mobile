package expo.modules.kotlin.exception;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: expo.modules.kotlin.exception.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3125c extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC3125c(String message, CodedException cause) {
        super(r0, message + r1 + "→ Caused by: " + ((Object) (r2 == null ? cause : r2)), cause);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
        String code = cause.getCode();
        String lineSeparator = System.lineSeparator();
        String localizedMessage = cause.getLocalizedMessage();
    }
}
