package H;

import A.AbstractC0700h0;
import E.a;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final G f3069a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3070b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3071c;

    /* renamed from: d, reason: collision with root package name */
    private final Rational f3072d;

    /* renamed from: e, reason: collision with root package name */
    private final l f3073e;

    public k(G g10, Size size) {
        this.f3069a = g10;
        this.f3070b = g10.d();
        this.f3071c = g10.i();
        Rational h10 = size != null ? h(size) : i(g10);
        this.f3072d = h10;
        this.f3073e = new l(g10, h10);
    }

    private static LinkedHashMap a(List list, P.a aVar, Rational rational) {
        return b(o(list), aVar, rational);
    }

    private static LinkedHashMap b(Map map, P.a aVar, Rational rational) {
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        Rational n10 = n(aVar.b(), z10);
        if (aVar.a() == 0) {
            Rational n11 = n(aVar.b(), z10);
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational2 = (Rational) it.next();
                if (!rational2.equals(n11)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new a.C0034a(n10, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, (List) map.get(rational3));
        }
        return linkedHashMap;
    }

    private List c(List list, P.c cVar, int i10) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f3069a.l(i10));
        Collections.sort(arrayList, new E.e(true));
        return arrayList;
    }

    private static void d(LinkedHashMap linkedHashMap, Size size) {
        int c10 = L.d.c(size);
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = (List) linkedHashMap.get((Rational) it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (L.d.c(size2) <= c10) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private static List e(List list, P.b bVar, int i10, int i11, int i12) {
        if (bVar == null) {
            return list;
        }
        List a10 = bVar.a(new ArrayList(list), E.c.a(E.c.b(i10), i11, i12 == 1));
        if (list.containsAll(a10)) {
            return a10;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void f(LinkedHashMap linkedHashMap, P.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g((List) linkedHashMap.get((Rational) it.next()), dVar);
        }
    }

    private static void g(List list, P.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        int b10 = dVar.b();
        if (dVar.equals(P.d.f7369c)) {
            return;
        }
        Size a10 = dVar.a();
        if (b10 == 0) {
            s(list, a10);
            return;
        }
        if (b10 == 1) {
            q(list, a10, true);
            return;
        }
        if (b10 == 2) {
            q(list, a10, false);
        } else if (b10 == 3) {
            r(list, a10, true);
        } else {
            if (b10 != 4) {
                return;
            }
            r(list, a10, false);
        }
    }

    private Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational i(G g10) {
        List q10 = g10.q(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        if (q10.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(q10, new E.e());
        return new Rational(size.getWidth(), size.getHeight());
    }

    private List j(List list, int i10) {
        List l10 = l(list, i10);
        if (l10 == null) {
            l10 = this.f3069a.q(i10);
        }
        ArrayList arrayList = new ArrayList(l10);
        Collections.sort(arrayList, new E.e(true));
        if (arrayList.isEmpty()) {
            AbstractC0700h0.l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i10 + ".");
        }
        return arrayList;
    }

    static List k(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(E.a.f1800a);
        arrayList.add(E.a.f1802c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (E.a.a(size, (Rational) it2.next())) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private List l(List list, int i10) {
        Size[] sizeArr;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).intValue() == i10) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    static Rational n(int i10, boolean z10) {
        if (i10 != -1) {
            if (i10 == 0) {
                return z10 ? E.a.f1800a : E.a.f1801b;
            }
            if (i10 == 1) {
                return z10 ? E.a.f1802c : E.a.f1803d;
            }
            AbstractC0700h0.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i10);
        }
        return null;
    }

    static Map o(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = k(list).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (E.a.a(size, rational)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static List p(P.c cVar, List list, Size size, int i10, Rational rational, int i11, int i12) {
        LinkedHashMap a10 = a(list, cVar.b(), rational);
        if (size != null) {
            d(a10, size);
        }
        f(a10, cVar.d());
        ArrayList arrayList = new ArrayList();
        Iterator it = a10.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : (List) it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return e(arrayList, cVar.c(), i10, i11, i12);
    }

    static void q(List list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    private static void r(List list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = (Size) list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    private static void s(List list, Size size) {
        boolean contains = list.contains(size);
        list.clear();
        if (contains) {
            list.add(size);
        }
    }

    public List m(l1 l1Var) {
        InterfaceC1457q0 interfaceC1457q0 = (InterfaceC1457q0) l1Var;
        List o10 = interfaceC1457q0.o(null);
        if (o10 != null) {
            return o10;
        }
        P.c S10 = interfaceC1457q0.S(null);
        List j10 = j(interfaceC1457q0.l(null), l1Var.p());
        if (S10 == null) {
            return this.f3073e.f(j10, l1Var);
        }
        Size i10 = ((InterfaceC1457q0) l1Var).i(null);
        int V10 = interfaceC1457q0.V(0);
        if (!l1Var.R(false)) {
            j10 = c(j10, S10, l1Var.p());
        }
        return p(interfaceC1457q0.m(), j10, i10, V10, this.f3072d, this.f3070b, this.f3071c);
    }
}
