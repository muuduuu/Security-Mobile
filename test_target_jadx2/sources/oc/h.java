package Oc;

import id.C3367b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(C3367b c3367b) {
        String b10 = c3367b.i().b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        String y10 = StringsKt.y(b10, '.', '$', false, 4, null);
        if (c3367b.h().d()) {
            return y10;
        }
        return c3367b.h() + '.' + y10;
    }
}
