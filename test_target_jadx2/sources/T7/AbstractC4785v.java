package t7;

/* renamed from: t7.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4785v {
    static int a(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    static void b(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String obj3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj3.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(obj3);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }
}
