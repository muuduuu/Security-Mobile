package lc;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.Intrinsics;
import rc.AbstractC4298b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3623b {
    public static void a(Throwable th, Throwable exception) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th != exception) {
            AbstractC4298b.f40599a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
