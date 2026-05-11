package T6;

import V6.AbstractC1287s;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes2.dex */
final class A0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final y0 f9331a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B0 f9332b;

    A0(B0 b02, y0 y0Var) {
        this.f9332b = b02;
        this.f9331a = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9332b.f9335b) {
            C2010b b10 = this.f9331a.b();
            if (b10.y0()) {
                B0 b02 = this.f9332b;
                b02.f9437a.startActivityForResult(GoogleApiActivity.a(b02.b(), (PendingIntent) AbstractC1287s.m(b10.I()), this.f9331a.a(), false), 1);
                return;
            }
            B0 b03 = this.f9332b;
            if (b03.f9338e.d(b03.b(), b10.u(), null) != null) {
                B0 b04 = this.f9332b;
                b04.f9338e.A(b04.b(), b04.f9437a, b10.u(), 2, this.f9332b);
                return;
            }
            if (b10.u() != 18) {
                this.f9332b.l(b10, this.f9331a.a());
                return;
            }
            B0 b05 = this.f9332b;
            Dialog v10 = b05.f9338e.v(b05.b(), b05);
            B0 b06 = this.f9332b;
            b06.f9338e.w(b06.b().getApplicationContext(), new z0(this, v10));
        }
    }
}
