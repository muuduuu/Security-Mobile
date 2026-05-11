package H;

import E.a;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.l1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f3074a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3075b;

    /* renamed from: c, reason: collision with root package name */
    private final Rational f3076c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3077d;

    l(G g10, Rational rational) {
        this.f3074a = g10.d();
        this.f3075b = g10.i();
        this.f3076c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f3077d = z10;
    }

    private static Size a(Size size, int i10, int i11, int i12) {
        return (size == null || !e(i10, i11, i12)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private static Rational b(Size size, List list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : k.k(list)) {
            if (E.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational c(InterfaceC1457q0 interfaceC1457q0, List list) {
        if (interfaceC1457q0.K()) {
            return k.n(interfaceC1457q0.N(), this.f3077d);
        }
        Size d10 = d(interfaceC1457q0);
        if (d10 != null) {
            return b(d10, list);
        }
        return null;
    }

    private Size d(InterfaceC1457q0 interfaceC1457q0) {
        return a(interfaceC1457q0.A(null), interfaceC1457q0.V(0), this.f3075b, this.f3074a);
    }

    private static boolean e(int i10, int i11, int i12) {
        int a10 = E.c.a(E.c.b(i10), i12, 1 == i11);
        return a10 == 90 || a10 == 270;
    }

    List f(List list, l1 l1Var) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new E.e(true));
        ArrayList arrayList2 = new ArrayList();
        InterfaceC1457q0 interfaceC1457q0 = (InterfaceC1457q0) l1Var;
        Size i10 = interfaceC1457q0.i(null);
        Size size = (Size) arrayList.get(0);
        if (i10 == null || L.d.c(size) < L.d.c(i10)) {
            i10 = size;
        }
        Size d10 = d(interfaceC1457q0);
        Size size2 = L.d.f5619c;
        int c10 = L.d.c(size2);
        if (L.d.c(i10) < c10) {
            size2 = L.d.f5617a;
        } else if (d10 != null && L.d.c(d10) < c10) {
            size2 = d10;
        }
        for (Size size3 : arrayList) {
            if (L.d.c(size3) <= L.d.c(i10) && L.d.c(size3) >= L.d.c(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + i10 + "\ninitial size list: " + arrayList);
        }
        Rational c11 = c(interfaceC1457q0, arrayList2);
        if (d10 == null) {
            d10 = interfaceC1457q0.u(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (c11 == null) {
            arrayList3.addAll(arrayList2);
            if (d10 != null) {
                k.q(arrayList3, d10, true);
            }
        } else {
            Map o10 = k.o(arrayList2);
            if (d10 != null) {
                Iterator it = o10.keySet().iterator();
                while (it.hasNext()) {
                    k.q((List) o10.get((Rational) it.next()), d10, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(o10.keySet());
            Collections.sort(arrayList4, new a.C0034a(c11, this.f3076c));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : (List) o10.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
