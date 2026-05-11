package X;

import androidx.camera.core.impl.InterfaceC1441i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g implements InterfaceC1441i0 {
    public static g h(int i10, int i11, List list, List list2) {
        y0.f.b(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new a(i10, i11, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), !list.isEmpty() ? (InterfaceC1441i0.a) list.get(0) : null, (InterfaceC1441i0.c) list2.get(0));
    }

    public static g i(InterfaceC1441i0 interfaceC1441i0) {
        return h(interfaceC1441i0.a(), interfaceC1441i0.b(), interfaceC1441i0.c(), interfaceC1441i0.d());
    }

    public abstract InterfaceC1441i0.a j();

    public abstract InterfaceC1441i0.c k();
}
