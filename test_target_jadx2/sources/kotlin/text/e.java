package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Intrinsics.g(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
