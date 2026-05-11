package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class p extends o {
    public static Float j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (i.f36858b.d(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
