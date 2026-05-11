package we;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f44580a = Pattern.compile("\\s+");

    /* renamed from: b, reason: collision with root package name */
    private static boolean f44581b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f44582c;

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f44583d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f44584e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f44585f;

    /* renamed from: g, reason: collision with root package name */
    private static Object f44586g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f44587h;

    static {
        f44581b = false;
        f44582c = null;
        Pattern compile = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        f44583d = compile;
        f44584e = false;
        f44585f = null;
        f44586g = null;
        f44587h = compile;
        try {
            Class<?> loadClass = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer$Form");
            f44586g = loadClass.getField("NFD").get(null);
            f44585f = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer").getMethod("normalize", CharSequence.class, loadClass);
            f44584e = true;
        } catch (ClassNotFoundException unused) {
            f44584e = false;
        } catch (IllegalAccessException unused2) {
            f44584e = false;
        } catch (NoSuchFieldException unused3) {
            f44584e = false;
        } catch (NoSuchMethodException unused4) {
            f44584e = false;
        }
        try {
            f44582c = Thread.currentThread().getContextClassLoader().loadClass("sun.text.Normalizer").getMethod("decompose", String.class, Boolean.TYPE, Integer.TYPE);
            f44581b = true;
        } catch (ClassNotFoundException unused5) {
            f44581b = false;
        } catch (NoSuchMethodException unused6) {
            f44581b = false;
        }
    }

    public static String a(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        if (str2 == null) {
            while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                length--;
            }
        } else {
            if (str2.length() == 0) {
                return str;
            }
            while (length != 0 && str2.indexOf(str.charAt(length - 1)) != -1) {
                length--;
            }
        }
        return str.substring(0, length);
    }
}
