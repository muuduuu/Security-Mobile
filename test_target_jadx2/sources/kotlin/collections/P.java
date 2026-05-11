package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import mc.C3672h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class P {
    public static Set a(Set builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((C3672h) builder).e();
    }

    public static Set b() {
        return new C3672h();
    }

    public static Set c(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
        return singleton;
    }
}
