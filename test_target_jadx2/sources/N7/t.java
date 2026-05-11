package n7;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class t {
    public static String a(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(b(objArr[i10]));
            i11 = indexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i10 < length) {
            String str2 = " [";
            while (i10 < objArr.length) {
                sb2.append(str2);
                sb2.append(b(objArr[i10]));
                i10++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    private static String b(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb2.append(name);
            sb2.append("@");
            sb2.append(hexString);
            String sb3 = sb2.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb3), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 8 + name2.length() + 1);
            sb4.append("<");
            sb4.append(sb3);
            sb4.append(" threw ");
            sb4.append(name2);
            sb4.append(">");
            return sb4.toString();
        }
    }
}
