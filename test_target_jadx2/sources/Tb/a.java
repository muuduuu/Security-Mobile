package Tb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a extends CodedException {
    public /* synthetic */ a(String str, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th);
    }

    public a(String str, Throwable th) {
        super("Could not Authenticate the user: " + (str == null ? "unknown" : str), th);
    }
}
