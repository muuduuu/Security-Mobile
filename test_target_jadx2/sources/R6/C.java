package R6;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class C extends A {
    C(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // R6.A
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // R6.A
    final boolean b() {
        return false;
    }
}
