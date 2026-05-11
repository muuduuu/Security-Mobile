package id;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class e {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34188a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34188a = iArr;
        }
    }

    public static final Object a(c cVar, Map values) {
        Object next;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : values.entrySet()) {
            c cVar2 = (c) entry.getKey();
            if (Intrinsics.b(cVar, cVar2) || b(cVar, cVar2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    public static final boolean b(c cVar, c packageName) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return Intrinsics.b(f(cVar), packageName);
    }

    public static final boolean c(c cVar, c packageName) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Intrinsics.b(cVar, packageName) || packageName.d()) {
            return true;
        }
        String b10 = cVar.b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        String b11 = packageName.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        return d(b10, b11);
    }

    private static final boolean d(String str, String str2) {
        return StringsKt.F(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.BEGINNING;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            int i11 = a.f34188a[kVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(charAt)) {
                    return false;
                }
                kVar = k.MIDDLE;
            } else if (i11 != 3) {
                continue;
            } else if (charAt == '.') {
                kVar = k.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        return kVar != k.AFTER_DOT;
    }

    public static final c f(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    public static final c g(c cVar, c prefix) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!c(cVar, prefix) || prefix.d()) {
            return cVar;
        }
        if (Intrinsics.b(cVar, prefix)) {
            c ROOT = c.f34178c;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            return ROOT;
        }
        String b10 = cVar.b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        String substring = b10.substring(prefix.b().length() + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return new c(substring);
    }
}
