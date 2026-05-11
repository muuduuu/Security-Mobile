package m2;

import android.util.Log;
import e2.C3072b;
import java.io.File;
import java.io.IOException;
import m2.InterfaceC3639a;

/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3643e implements InterfaceC3639a {

    /* renamed from: b, reason: collision with root package name */
    private final File f37302b;

    /* renamed from: c, reason: collision with root package name */
    private final long f37303c;

    /* renamed from: e, reason: collision with root package name */
    private C3072b f37305e;

    /* renamed from: d, reason: collision with root package name */
    private final C3641c f37304d = new C3641c();

    /* renamed from: a, reason: collision with root package name */
    private final C3648j f37301a = new C3648j();

    protected C3643e(File file, long j10) {
        this.f37302b = file;
        this.f37303c = j10;
    }

    public static InterfaceC3639a c(File file, long j10) {
        return new C3643e(file, j10);
    }

    private synchronized C3072b d() {
        try {
            if (this.f37305e == null) {
                this.f37305e = C3072b.x(this.f37302b, 1, 1, this.f37303c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37305e;
    }

    private synchronized void e() {
        this.f37305e = null;
    }

    @Override // m2.InterfaceC3639a
    public File a(i2.f fVar) {
        String b10 = this.f37301a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b10 + " for for Key: " + fVar);
        }
        try {
            C3072b.e t10 = d().t(b10);
            if (t10 != null) {
                return t10.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // m2.InterfaceC3639a
    public void b(i2.f fVar, InterfaceC3639a.b bVar) {
        C3072b d10;
        String b10 = this.f37301a.b(fVar);
        this.f37304d.a(b10);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b10 + " for for Key: " + fVar);
            }
            try {
                d10 = d();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            if (d10.t(b10) != null) {
                return;
            }
            C3072b.c q10 = d10.q(b10);
            if (q10 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + b10);
            }
            try {
                if (bVar.a(q10.f(0))) {
                    q10.e();
                }
                q10.b();
            } catch (Throwable th) {
                q10.b();
                throw th;
            }
        } finally {
            this.f37304d.b(b10);
        }
    }

    @Override // m2.InterfaceC3639a
    public synchronized void clear() {
        try {
            try {
                d().o();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            }
        } finally {
            e();
        }
    }
}
