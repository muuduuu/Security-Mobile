package m2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: m2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3647i {

    /* renamed from: a, reason: collision with root package name */
    private final int f37309a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37310b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f37311c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37312d;

    /* renamed from: m2.i$a */
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        static final int f37313i;

        /* renamed from: a, reason: collision with root package name */
        final Context f37314a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f37315b;

        /* renamed from: c, reason: collision with root package name */
        c f37316c;

        /* renamed from: e, reason: collision with root package name */
        float f37318e;

        /* renamed from: d, reason: collision with root package name */
        float f37317d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f37319f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        float f37320g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        int f37321h = 4194304;

        static {
            f37313i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f37318e = f37313i;
            this.f37314a = context;
            this.f37315b = (ActivityManager) context.getSystemService("activity");
            this.f37316c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C3647i.e(this.f37315b)) {
                return;
            }
            this.f37318e = 0.0f;
        }

        public C3647i a() {
            return new C3647i(this);
        }
    }

    /* renamed from: m2.i$b */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f37322a;

        b(DisplayMetrics displayMetrics) {
            this.f37322a = displayMetrics;
        }

        @Override // m2.C3647i.c
        public int a() {
            return this.f37322a.heightPixels;
        }

        @Override // m2.C3647i.c
        public int b() {
            return this.f37322a.widthPixels;
        }
    }

    /* renamed from: m2.i$c */
    interface c {
        int a();

        int b();
    }

    C3647i(a aVar) {
        this.f37311c = aVar.f37314a;
        int i10 = e(aVar.f37315b) ? aVar.f37321h / 2 : aVar.f37321h;
        this.f37312d = i10;
        int c10 = c(aVar.f37315b, aVar.f37319f, aVar.f37320g);
        float b10 = aVar.f37316c.b() * aVar.f37316c.a() * 4;
        int round = Math.round(aVar.f37318e * b10);
        int round2 = Math.round(b10 * aVar.f37317d);
        int i11 = c10 - i10;
        int i12 = round2 + round;
        if (i12 <= i11) {
            this.f37310b = round2;
            this.f37309a = round;
        } else {
            float f10 = i11;
            float f11 = aVar.f37318e;
            float f12 = aVar.f37317d;
            float f13 = f10 / (f11 + f12);
            this.f37310b = Math.round(f12 * f13);
            this.f37309a = Math.round(f13 * aVar.f37318e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f37310b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f37309a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > c10);
            sb2.append(", max size: ");
            sb2.append(f(c10));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f37315b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f37315b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f37311c, i10);
    }

    public int a() {
        return this.f37312d;
    }

    public int b() {
        return this.f37309a;
    }

    public int d() {
        return this.f37310b;
    }
}
