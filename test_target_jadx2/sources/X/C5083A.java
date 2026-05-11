package x;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.T;
import java.util.Iterator;
import java.util.List;
import s.C4301a;

/* renamed from: x.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5083A {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44588a;

    public C5083A() {
        this.f44588a = androidx.camera.camera2.internal.compat.quirk.b.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public T a(T t10) {
        T.a aVar = new T.a();
        aVar.v(t10.k());
        Iterator it = t10.i().iterator();
        while (it.hasNext()) {
            aVar.f((AbstractC1429c0) it.next());
        }
        aVar.e(t10.g());
        C4301a.C0609a c0609a = new C4301a.C0609a();
        c0609a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0609a.a());
        return aVar.h();
    }

    public boolean b(List list, boolean z10) {
        if (!this.f44588a || !z10) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
