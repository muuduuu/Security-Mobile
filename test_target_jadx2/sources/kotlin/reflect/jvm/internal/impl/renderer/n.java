package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public abstract class n {
    public static final String a(id.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List h10 = dVar.h();
        Intrinsics.checkNotNullExpressionValue(h10, "pathSegments(...)");
        return c(h10);
    }

    public static final String b(id.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (!e(fVar)) {
            String c10 = fVar.c();
            Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
            return c10;
        }
        StringBuilder sb2 = new StringBuilder();
        String c11 = fVar.c();
        Intrinsics.checkNotNullExpressionValue(c11, "asString(...)");
        sb2.append('`' + c11);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String c(List pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            id.f fVar = (id.f) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final String d(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        if (StringsKt.F(lowerRendered, lowerPrefix, false, 2, null) && StringsKt.F(upperRendered, upperPrefix, false, 2, null)) {
            String substring = lowerRendered.substring(lowerPrefix.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String substring2 = upperRendered.substring(upperPrefix.length());
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            String str = foldedPrefix + substring;
            if (Intrinsics.b(substring, substring2)) {
                return str;
            }
            if (f(substring, substring2)) {
                return str + '!';
            }
        }
        return null;
    }

    private static final boolean e(id.f fVar) {
        String c10 = fVar.c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        if (!i.f36669a.contains(c10)) {
            int i10 = 0;
            while (true) {
                if (i10 < c10.length()) {
                    char charAt = c10.charAt(i10);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        break;
                    }
                    i10++;
                } else if (c10.length() != 0 && Character.isJavaIdentifierStart(c10.codePointAt(0))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.b(r7 + '?', r8) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean f(String lower, String upper) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        if (!Intrinsics.b(lower, StringsKt.z(upper, "?", BuildConfig.FLAVOR, false, 4, null))) {
            if (StringsKt.q(upper, "?", false, 2, null)) {
            }
            if (!Intrinsics.b('(' + lower + ")?", upper)) {
                return false;
            }
        }
        return true;
    }
}
