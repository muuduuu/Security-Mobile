package D2;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f1202a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f1203b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    private static volatile Handler f1204c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1205a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f1205a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1205a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1205a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f1205a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1205a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a() {
        if (!r()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!s()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(com.bumptech.glide.request.a aVar, com.bumptech.glide.request.a aVar2) {
        return aVar == null ? aVar2 == null : aVar.N(aVar2);
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static String f(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f1202a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static Queue g(int i10) {
        return new ArrayDeque(i10);
    }

    public static int h(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * j(config);
    }

    public static int i(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f1205a[config.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return i10 != 4 ? 4 : 8;
    }

    public static List k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static Handler l() {
        if (f1204c == null) {
            synchronized (l.class) {
                try {
                    if (f1204c == null) {
                        f1204c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f1204c;
    }

    public static int m(float f10) {
        return n(f10, 17);
    }

    public static int n(float f10, int i10) {
        return o(Float.floatToIntBits(f10), i10);
    }

    public static int o(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int p(Object obj, int i10) {
        return o(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int q(boolean z10, int i10) {
        return o(z10 ? 1 : 0, i10);
    }

    public static boolean r() {
        return !s();
    }

    public static boolean s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean t(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static boolean u(int i10, int i11) {
        return t(i10) && t(i11);
    }

    public static void v(Runnable runnable) {
        l().post(runnable);
    }

    public static void w(Runnable runnable) {
        l().removeCallbacks(runnable);
    }

    public static String x(byte[] bArr) {
        String f10;
        char[] cArr = f1203b;
        synchronized (cArr) {
            f10 = f(bArr, cArr);
        }
        return f10;
    }
}
