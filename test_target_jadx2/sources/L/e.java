package L;

import android.util.Size;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.l1;

/* loaded from: classes.dex */
public abstract class e {
    public static void a(l1.a aVar, int i10) {
        Size A10;
        InterfaceC1457q0 interfaceC1457q0 = (InterfaceC1457q0) aVar.c();
        int V10 = interfaceC1457q0.V(-1);
        if (V10 == -1 || V10 != i10) {
            ((InterfaceC1457q0.a) aVar).d(i10);
        }
        if (V10 == -1 || i10 == -1 || V10 == i10) {
            return;
        }
        if (Math.abs(E.c.b(i10) - E.c.b(V10)) % 180 != 90 || (A10 = interfaceC1457q0.A(null)) == null) {
            return;
        }
        ((InterfaceC1457q0.a) aVar).a(new Size(A10.getHeight(), A10.getWidth()));
    }
}
