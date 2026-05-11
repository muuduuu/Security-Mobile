package V6;

import T6.InterfaceC1179j;
import android.content.Intent;

/* loaded from: classes2.dex */
final class H extends I {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f10856a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC1179j f10857b;

    H(Intent intent, InterfaceC1179j interfaceC1179j, int i10) {
        this.f10856a = intent;
        this.f10857b = interfaceC1179j;
    }

    @Override // V6.I
    public final void a() {
        Intent intent = this.f10856a;
        if (intent != null) {
            this.f10857b.startActivityForResult(intent, 2);
        }
    }
}
