package hd;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import rc.AbstractC4299c;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f34055a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final String f34056b = CollectionsKt.l0(CollectionsKt.m('k', 'o', 't', 'l', 'i', 'n'), BuildConfig.FLAVOR, null, null, 0, null, null, 62, null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f34057c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List m10 = CollectionsKt.m("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int c10 = AbstractC4299c.c(0, m10.size() - 1, 2);
        if (c10 >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f34056b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) m10.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), m10.get(i11));
                linkedHashMap.put(str + '/' + ((String) m10.get(i10)) + "Array", '[' + ((String) m10.get(i11)));
                if (i10 == c10) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f34056b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt.m("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt.m("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f34056b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, "Function" + i12, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt.m("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f34056b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f34057c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map map, String str, String str2) {
        map.put(f34056b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = (String) f34057c.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + StringsKt.y(classId, '.', '$', false, 4, null) + ';';
    }
}
