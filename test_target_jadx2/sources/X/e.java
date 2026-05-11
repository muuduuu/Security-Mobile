package X;

import A.B;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.camera.core.impl.InterfaceC1441i0;
import d0.AbstractC2971b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e implements InterfaceC1439h0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1439h0 f11612c;

    /* renamed from: d, reason: collision with root package name */
    private final B f11613d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f11614e = new HashMap();

    public e(InterfaceC1439h0 interfaceC1439h0, B b10) {
        this.f11612c = interfaceC1439h0;
        this.f11613d = b10;
    }

    private static InterfaceC1441i0 c(InterfaceC1441i0 interfaceC1441i0, B b10) {
        if (interfaceC1441i0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1441i0.c cVar : interfaceC1441i0.d()) {
            if (AbstractC2971b.f(cVar, b10)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC1441i0.b.h(interfaceC1441i0.a(), interfaceC1441i0.b(), interfaceC1441i0.c(), arrayList);
    }

    private InterfaceC1441i0 d(int i10) {
        if (this.f11614e.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC1441i0) this.f11614e.get(Integer.valueOf(i10));
        }
        if (!this.f11612c.a(i10)) {
            return null;
        }
        InterfaceC1441i0 c10 = c(this.f11612c.b(i10), this.f11613d);
        this.f11614e.put(Integer.valueOf(i10), c10);
        return c10;
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public boolean a(int i10) {
        return this.f11612c.a(i10) && d(i10) != null;
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public InterfaceC1441i0 b(int i10) {
        return d(i10);
    }
}
