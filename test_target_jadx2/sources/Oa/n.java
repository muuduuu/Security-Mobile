package Oa;

import java.util.regex.Pattern;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7276a = m.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(String str) {
        if (str == null) {
            return null;
        }
        return StringsKt.F(str, "file:///", false, 2, null) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}
