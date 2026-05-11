package vb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class i {
    public static final String a(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (!StringsKt.F(eventName, "on", false, 2, null)) {
            return eventName;
        }
        String substring = eventName.substring(2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return "top" + substring;
    }
}
