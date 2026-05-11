package Wd;

import Td.z;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import rc.AbstractC4299c;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Regex f11578a = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b, reason: collision with root package name */
    private static final Regex f11579b = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final boolean a(z zVar, Object obj) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return (obj instanceof z) && Intrinsics.b(((z) obj).d(), zVar.d());
    }

    public static final int b(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar.d().hashCode();
    }

    public static final String c(z zVar, String name) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        int c10 = AbstractC4299c.c(0, zVar.e().length - 1, 2);
        if (c10 < 0) {
            return null;
        }
        while (!StringsKt.r(zVar.e()[i10], name, true)) {
            if (i10 == c10) {
                return null;
            }
            i10 += 2;
        }
        return zVar.e()[i10 + 1];
    }

    public static final z d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MatchResult C10 = m.C(f11578a, str, 0);
        if (C10 == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String str2 = (String) C10.b().get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) C10.b().get(2)).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int e10 = C10.d().e();
        while (true) {
            int i10 = e10 + 1;
            if (i10 >= str.length()) {
                return new z(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            MatchResult C11 = m.C(f11579b, str, i10);
            if (C11 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Parameter is not formatted correctly: \"");
                String substring = str.substring(i10);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                sb2.append(substring);
                sb2.append("\" for: \"");
                sb2.append(str);
                sb2.append('\"');
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            MatchGroup matchGroup = C11.c().get(1);
            String value = matchGroup != null ? matchGroup.getValue() : null;
            if (value == null) {
                e10 = C11.d().e();
            } else {
                MatchGroup matchGroup2 = C11.c().get(2);
                String value2 = matchGroup2 != null ? matchGroup2.getValue() : null;
                if (value2 == null) {
                    MatchGroup matchGroup3 = C11.c().get(3);
                    Intrinsics.d(matchGroup3);
                    value2 = matchGroup3.getValue();
                } else if (StringsKt.F(value2, "'", false, 2, null) && StringsKt.q(value2, "'", false, 2, null) && value2.length() > 2) {
                    value2 = value2.substring(1, value2.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(value2, "substring(...)");
                }
                arrayList.add(value);
                arrayList.add(value2);
                e10 = C11.d().e();
            }
        }
    }

    public static final z e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return d(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final String f(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar.d();
    }
}
