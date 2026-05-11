package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class k extends j {

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36859a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return line;
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36860a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f36860a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return this.f36860a + line;
        }
    }

    private static final Function1 b(String str) {
        return str.length() == 0 ? a.f36859a : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!CharsKt.b(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String newIndent) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List g02 = StringsKt.g0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g02) {
            if (!StringsKt.Z((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) CollectionsKt.r0(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * g02.size());
        Function1 b10 = b(newIndent);
        int l10 = CollectionsKt.l(g02);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : g02) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == l10) && StringsKt.Z(str3)) {
                str3 = null;
            } else {
                String T02 = s.T0(str3, intValue);
                if (T02 != null && (str2 = (String) b10.invoke(T02)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        String sb2 = ((StringBuilder) CollectionsKt.j0(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final String e(String str, String newIndent, String marginPrefix) {
        int i10;
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (StringsKt.Z(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List g02 = StringsKt.g0(str);
        int length = str.length() + (newIndent.length() * g02.size());
        Function1 b10 = b(newIndent);
        int l10 = CollectionsKt.l(g02);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : g02) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.t();
            }
            String str3 = (String) obj;
            String str4 = null;
            if ((i11 == 0 || i11 == l10) && StringsKt.Z(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!CharsKt.b(str3.charAt(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = i10;
                    if (StringsKt.E(str3, marginPrefix, i10, false, 4, null)) {
                        int length3 = i14 + marginPrefix.length();
                        Intrinsics.e(str3, "null cannot be cast to non-null type java.lang.String");
                        str4 = str3.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(str4, "substring(...)");
                    }
                }
                if (str4 != null && (str2 = (String) b10.invoke(str4)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i11 = i12;
        }
        String sb2 = ((StringBuilder) CollectionsKt.j0(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static String f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return d(str, BuildConfig.FLAVOR);
    }

    public static final String g(String str, String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return e(str, BuildConfig.FLAVOR, marginPrefix);
    }

    public static /* synthetic */ String h(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
