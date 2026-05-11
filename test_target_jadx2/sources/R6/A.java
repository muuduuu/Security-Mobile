package R6;

import D7.C0787k;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes2.dex */
abstract class A {

    /* renamed from: a, reason: collision with root package name */
    final int f8561a;

    /* renamed from: b, reason: collision with root package name */
    final C0787k f8562b = new C0787k();

    /* renamed from: c, reason: collision with root package name */
    final int f8563c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f8564d;

    A(int i10, int i11, Bundle bundle) {
        this.f8561a = i10;
        this.f8563c = i11;
        this.f8564d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(B b10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + b10.toString());
        }
        this.f8562b.b(b10);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f8562b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f8563c + " id=" + this.f8561a + " oneWay=" + b() + "}";
    }
}
