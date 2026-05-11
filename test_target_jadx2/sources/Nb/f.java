package Nb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class f extends CodedException {
    public /* synthetic */ f(String str, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, Throwable th) {
        super("An exception occurred when accessing the geocode: " + str + " " + r0, null, 2, null);
        String message;
        String str2 = BuildConfig.FLAVOR;
        str = str == null ? BuildConfig.FLAVOR : str;
        if (th != null && (message = th.getMessage()) != null) {
            str2 = message;
        }
    }
}
