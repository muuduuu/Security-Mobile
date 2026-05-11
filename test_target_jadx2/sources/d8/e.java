package D8;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f1393d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f1394e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final i f1395a = i.c();

    /* renamed from: b, reason: collision with root package name */
    private long f1396b;

    /* renamed from: c, reason: collision with root package name */
    private int f1397c;

    e() {
    }

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f1397c) + this.f1395a.e(), f1394e);
        }
        return f1393d;
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f1397c = 0;
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f1397c != 0) {
            z10 = this.f1395a.a() > this.f1396b;
        }
        return z10;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f1397c++;
        this.f1396b = this.f1395a.a() + a(i10);
    }
}
