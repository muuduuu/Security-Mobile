package T6;

import android.app.Dialog;

/* loaded from: classes2.dex */
final class z0 extends U {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f9498a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A0 f9499b;

    z0(A0 a02, Dialog dialog) {
        this.f9499b = a02;
        this.f9498a = dialog;
    }

    @Override // T6.U
    public final void a() {
        this.f9499b.f9332b.o();
        if (this.f9498a.isShowing()) {
            this.f9498a.dismiss();
        }
    }
}
