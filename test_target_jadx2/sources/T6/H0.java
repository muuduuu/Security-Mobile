package T6;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
final class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC1177i f9347a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9348b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I0 f9349c;

    H0(I0 i02, AbstractC1177i abstractC1177i, String str) {
        this.f9347a = abstractC1177i;
        this.f9348b = str;
        Objects.requireNonNull(i02);
        this.f9349c = i02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        I0 i02 = this.f9349c;
        if (i02.k() > 0) {
            AbstractC1177i abstractC1177i = this.f9347a;
            if (i02.l() != null) {
                bundle = i02.l().getBundle(this.f9348b);
            } else {
                bundle = null;
            }
            abstractC1177i.f(bundle);
        }
        if (i02.k() >= 2) {
            this.f9347a.j();
        }
        if (i02.k() >= 3) {
            this.f9347a.h();
        }
        if (i02.k() >= 4) {
            this.f9347a.k();
        }
        if (i02.k() >= 5) {
            this.f9347a.g();
        }
    }
}
