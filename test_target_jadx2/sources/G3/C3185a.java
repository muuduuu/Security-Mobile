package g3;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import b3.q;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3185a {

    /* renamed from: h, reason: collision with root package name */
    private static C3185a f33513h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f33514i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b, reason: collision with root package name */
    private volatile File f33516b;

    /* renamed from: d, reason: collision with root package name */
    private volatile File f33518d;

    /* renamed from: e, reason: collision with root package name */
    private long f33519e;

    /* renamed from: a, reason: collision with root package name */
    private volatile StatFs f33515a = null;

    /* renamed from: c, reason: collision with root package name */
    private volatile StatFs f33517c = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f33521g = false;

    /* renamed from: f, reason: collision with root package name */
    private final Lock f33520f = new ReentrantLock();

    /* renamed from: g3.a$a, reason: collision with other inner class name */
    public enum EnumC0486a {
        INTERNAL,
        EXTERNAL
    }

    protected C3185a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f33521g) {
            return;
        }
        this.f33520f.lock();
        try {
            if (!this.f33521g) {
                this.f33516b = Environment.getDataDirectory();
                this.f33518d = Environment.getExternalStorageDirectory();
                g();
                this.f33521g = true;
            }
        } finally {
            this.f33520f.unlock();
        }
    }

    public static synchronized C3185a d() {
        C3185a c3185a;
        synchronized (C3185a.class) {
            try {
                if (f33513h == null) {
                    f33513h = new C3185a();
                }
                c3185a = f33513h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3185a;
    }

    private void e() {
        if (this.f33520f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f33519e > f33514i) {
                    g();
                }
            } finally {
                this.f33520f.unlock();
            }
        }
    }

    private void g() {
        this.f33515a = h(this.f33515a, this.f33516b);
        this.f33517c = h(this.f33517c, this.f33518d);
        this.f33519e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th) {
            throw q.a(th);
        }
    }

    public long c(EnumC0486a enumC0486a) {
        b();
        e();
        StatFs statFs = enumC0486a == EnumC0486a.INTERNAL ? this.f33515a : this.f33517c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public boolean f(EnumC0486a enumC0486a, long j10) {
        b();
        long c10 = c(enumC0486a);
        return c10 <= 0 || c10 < j10;
    }
}
