package Wd;

import Td.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import lc.t;
import org.conscrypt.BuildConfig;
import rc.AbstractC4299c;
import xc.AbstractC5149b;

/* loaded from: classes3.dex */
public abstract class e {
    private static final String a(char c10) {
        String num = Integer.toString(c10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        if (num.length() >= 2) {
            return num;
        }
        return '0' + num;
    }

    public static final v.a b(v.a aVar, String name, String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        t(name);
        u(value, name);
        d(aVar, name, value);
        return aVar;
    }

    public static final v.a c(v.a aVar, v headers) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            d(aVar, headers.h(i10), headers.v(i10));
        }
        return aVar;
    }

    public static final v.a d(v.a aVar, String name, String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        aVar.h().add(name);
        aVar.h().add(StringsKt.S0(value).toString());
        return aVar;
    }

    public static final v e(v.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new v((String[]) aVar.h().toArray(new String[0]));
    }

    public static final boolean f(v vVar, Object obj) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        return (obj instanceof v) && Arrays.equals(vVar.e(), ((v) obj).e());
    }

    public static final String g(v.a aVar, String name) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int size = aVar.h().size() - 2;
        int c10 = AbstractC4299c.c(size, 0, -2);
        if (c10 > size) {
            return null;
        }
        while (!StringsKt.r(name, (String) aVar.h().get(size), true)) {
            if (size == c10) {
                return null;
            }
            size -= 2;
        }
        return (String) aVar.h().get(size + 1);
    }

    public static final int h(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        return Arrays.hashCode(vVar.e());
    }

    public static final String i(String[] namesAndValues, String name) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = namesAndValues.length - 2;
        int c10 = AbstractC4299c.c(length, 0, -2);
        if (c10 > length) {
            return null;
        }
        while (!StringsKt.r(name, namesAndValues[length], true)) {
            if (length == c10) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public static final v j(String... inputNamesAndValues) {
        Intrinsics.checkNotNullParameter(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i11] = StringsKt.S0(inputNamesAndValues[i11]).toString();
        }
        int c10 = AbstractC4299c.c(0, strArr.length - 1, 2);
        if (c10 >= 0) {
            while (true) {
                String str = strArr[i10];
                String str2 = strArr[i10 + 1];
                t(str);
                u(str2, str);
                if (i10 == c10) {
                    break;
                }
                i10 += 2;
            }
        }
        return new v(strArr);
    }

    public static final Iterator k(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        int size = vVar.size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = t.a(vVar.h(i10), vVar.v(i10));
        }
        return AbstractC5149b.a(pairArr);
    }

    public static final String l(v vVar, int i10) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        String str = (String) AbstractC3574i.G(vVar.e(), i10 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    public static final v.a m(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        v.a aVar = new v.a();
        CollectionsKt.A(aVar.h(), vVar.e());
        return aVar;
    }

    public static final v.a n(v.a aVar, String name) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        while (i10 < aVar.h().size()) {
            if (StringsKt.r(name, (String) aVar.h().get(i10), true)) {
                aVar.h().remove(i10);
                aVar.h().remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
        return aVar;
    }

    public static final v.a o(v.a aVar, String name, String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        t(name);
        u(value, name);
        aVar.i(name);
        d(aVar, name, value);
        return aVar;
    }

    public static final v p(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        String[] strArr = new String[map.size() * 2];
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String obj = StringsKt.S0(str).toString();
            String obj2 = StringsKt.S0(str2).toString();
            t(obj);
            u(obj2, obj);
            strArr[i10] = obj;
            strArr[i10 + 1] = obj2;
            i10 += 2;
        }
        return new v(strArr);
    }

    public static final String q(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String h10 = vVar.h(i10);
            String v10 = vVar.v(i10);
            sb2.append(h10);
            sb2.append(": ");
            if (m.B(h10)) {
                v10 = "██";
            }
            sb2.append(v10);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final String r(v vVar, int i10) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        String str = (String) AbstractC3574i.G(vVar.e(), (i10 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    public static final List s(v vVar, String name) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int size = vVar.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.r(name, vVar.h(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(vVar.v(i10));
            }
        }
        List O02 = arrayList != null ? CollectionsKt.O0(arrayList) : null;
        return O02 == null ? CollectionsKt.j() : O02;
    }

    public static final void t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = name.charAt(i10);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + a(charAt) + " at " + i10 + " in header name: " + name).toString());
            }
        }
    }

    public static final void u(String value, String name) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = value.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = value.charAt(i10);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected char 0x");
                sb2.append(a(charAt));
                sb2.append(" at ");
                sb2.append(i10);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(m.B(name) ? BuildConfig.FLAVOR : ": " + value);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
