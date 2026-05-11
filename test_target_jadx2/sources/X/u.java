package x;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f44617a;

    public u() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    public List a(b1.b bVar, List list) {
        ExtraCroppingQuirk extraCroppingQuirk = this.f44617a;
        if (extraCroppingQuirk == null) {
            return list;
        }
        Size f10 = extraCroppingQuirk.f(bVar);
        if (f10 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(f10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!size.equals(f10)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    u(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f44617a = extraCroppingQuirk;
    }
}
