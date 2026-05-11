package y5;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final String f45336a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* renamed from: b, reason: collision with root package name */
    static final String f45337b = String.valueOf(Long.MAX_VALUE);

    public static boolean a(String str, boolean z10) {
        String str2 = z10 ? f45336a : f45337b;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            int charAt = str.charAt(i10) - str2.charAt(i10);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(String str) {
        char charAt = str.charAt(0);
        int length = str.length();
        int i10 = 1;
        boolean z10 = charAt == '-';
        if (z10) {
            if (length == 1 || length > 10) {
                return Integer.parseInt(str);
            }
            charAt = str.charAt(1);
            i10 = 2;
        } else if (length > 9) {
            return Integer.parseInt(str);
        }
        if (charAt > '9' || charAt < '0') {
            return Integer.parseInt(str);
        }
        int i11 = charAt - '0';
        if (i10 < length) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 > '9' || charAt2 < '0') {
                return Integer.parseInt(str);
            }
            i11 = (i11 * 10) + (charAt2 - '0');
            if (i12 < length) {
                int i13 = i10 + 2;
                char charAt3 = str.charAt(i12);
                if (charAt3 > '9' || charAt3 < '0') {
                    return Integer.parseInt(str);
                }
                i11 = (i11 * 10) + (charAt3 - '0');
                if (i13 < length) {
                    while (true) {
                        int i14 = i13 + 1;
                        char charAt4 = str.charAt(i13);
                        if (charAt4 > '9' || charAt4 < '0') {
                            break;
                        }
                        i11 = (i11 * 10) + (charAt4 - '0');
                        if (i14 >= length) {
                            break;
                        }
                        i13 = i14;
                    }
                }
            }
        }
        return z10 ? -i11 : i11;
    }

    public static long c(String str) {
        return str.length() <= 9 ? b(str) : Long.parseLong(str);
    }
}
