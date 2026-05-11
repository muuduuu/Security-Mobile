package P8;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7589a = a();

    private static int a() {
        return e(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb2.append(charAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean c() {
        return f7589a >= 9;
    }

    private static int d(String str) {
        try {
            String[] split = str.split("[._]", 3);
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static int e(String str) {
        int d10 = d(str);
        if (d10 == -1) {
            d10 = b(str);
        }
        if (d10 == -1) {
            return 6;
        }
        return d10;
    }
}
