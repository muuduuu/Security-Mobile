package r2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f39189e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f39190f;

    /* renamed from: g, reason: collision with root package name */
    private static final File f39191g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile x f39192h;

    /* renamed from: b, reason: collision with root package name */
    private int f39194b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39195c = true;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f39196d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final int f39193a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f39189e = i10 < 29;
        f39190f = i10 >= 28;
        f39191g = new File("/proc/self/fd");
    }

    x() {
    }

    private boolean a() {
        return f39189e && !this.f39196d.get();
    }

    public static x b() {
        if (f39192h == null) {
            synchronized (x.class) {
                try {
                    if (f39192h == null) {
                        f39192h = new x();
                    }
                } finally {
                }
            }
        }
        return f39192h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.f39193a;
    }

    private synchronized boolean d() {
        try {
            boolean z10 = true;
            int i10 = this.f39194b + 1;
            this.f39194b = i10;
            if (i10 >= 50) {
                this.f39194b = 0;
                int length = f39191g.list().length;
                long c10 = c();
                if (length >= c10) {
                    z10 = false;
                }
                this.f39195c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39195c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f39190f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    boolean g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        Bitmap.Config config;
        boolean f10 = f(i10, i11, z10, z11);
        if (f10) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return f10;
    }

    public void h() {
        D2.l.b();
        this.f39196d.set(true);
    }
}
