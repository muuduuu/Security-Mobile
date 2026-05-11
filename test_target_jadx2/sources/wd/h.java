package Wd;

import java.text.Normalizer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class h {
    public static final String a(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        String normalize = Normalizer.normalize(string, Normalizer.Form.NFC);
        Intrinsics.checkNotNullExpressionValue(normalize, "normalize(...)");
        return normalize;
    }
}
