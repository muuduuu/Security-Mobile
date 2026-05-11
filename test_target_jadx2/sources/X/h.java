package x;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.impl.P0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import t.K1;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final CaptureSessionOnClosedNotCalledQuirk f44597a;

    public interface a {
        void a(K1 k12);
    }

    public h(P0 p02) {
        this.f44597a = (CaptureSessionOnClosedNotCalledQuirk) p02.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    private void a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            K1 k12 = (K1) it.next();
            k12.c().q(k12);
        }
    }

    private void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            K1 k12 = (K1) it.next();
            k12.c().r(k12);
        }
    }

    public void c(K1 k12, List list, List list2, a aVar) {
        K1 k13;
        K1 k14;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext() && (k14 = (K1) it.next()) != k12) {
                linkedHashSet.add(k14);
            }
            b(linkedHashSet);
        }
        aVar.a(k12);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext() && (k13 = (K1) it2.next()) != k12) {
                linkedHashSet2.add(k13);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f44597a != null;
    }
}
