package p;

import android.os.CancellationSignal;
import android.util.Log;

/* loaded from: classes.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    private final c f38180a = new a();

    /* renamed from: b, reason: collision with root package name */
    private CancellationSignal f38181b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.core.os.d f38182c;

    class a implements c {
        a() {
        }

        @Override // p.p.c
        public androidx.core.os.d a() {
            return new androidx.core.os.d();
        }

        @Override // p.p.c
        public CancellationSignal b() {
            return b.b();
        }
    }

    private static class b {
        static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    interface c {
        androidx.core.os.d a();

        CancellationSignal b();
    }

    p() {
    }

    void a() {
        CancellationSignal cancellationSignal = this.f38181b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e10) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
            }
            this.f38181b = null;
        }
        androidx.core.os.d dVar = this.f38182c;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (NullPointerException e11) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
            }
            this.f38182c = null;
        }
    }

    CancellationSignal b() {
        if (this.f38181b == null) {
            this.f38181b = this.f38180a.b();
        }
        return this.f38181b;
    }

    androidx.core.os.d c() {
        if (this.f38182c == null) {
            this.f38182c = this.f38180a.a();
        }
        return this.f38182c;
    }
}
