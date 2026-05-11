package Q;

import A.AbstractC0700h0;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    private static final double f7776h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a, reason: collision with root package name */
    private final Size f7777a;

    /* renamed from: b, reason: collision with root package name */
    private final Rational f7778b;

    /* renamed from: c, reason: collision with root package name */
    private final Rational f7779c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f7780d;

    /* renamed from: e, reason: collision with root package name */
    private final H.k f7781e;

    /* renamed from: f, reason: collision with root package name */
    private final G f7782f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f7783g;

    private static class a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        private final Rational f7784a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f7785b;

        a(Rational rational, boolean z10) {
            this.f7784a = rational;
            this.f7785b = z10;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float c10 = b.c(rational, this.f7784a);
            float c11 = b.c(rational2, this.f7784a);
            return this.f7785b ? Float.compare(c11, c10) : Float.compare(c10, c11);
        }
    }

    b(H h10, Set set) {
        this(E.r.m(h10.h().g()), h10.q(), set);
    }

    private static boolean A(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!y((Size) it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    private boolean B(Rational rational, Size size) {
        if (this.f7778b.equals(rational) || E.a.a(size, rational)) {
            return false;
        }
        return b(this.f7778b.floatValue(), rational.floatValue(), N(size).floatValue());
    }

    private boolean C(Size size, Size size2) {
        return B(N(size), size2);
    }

    private boolean D() {
        Iterator it = l().iterator();
        while (it.hasNext()) {
            if (!E.a.a((Size) it.next(), this.f7779c)) {
                return true;
            }
        }
        return false;
    }

    private static List E(List list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    static Rect F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    private List G(List list, boolean z10) {
        Map x10 = x(list);
        ArrayList<Rational> arrayList = new ArrayList(x10.keySet());
        K(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(E.a.f1802c) && !rational.equals(E.a.f1800a)) {
                List list2 = (List) x10.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z10));
            }
        }
        return arrayList2;
    }

    private List H(List list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.f7778b, list, false));
        }
        arrayList.addAll(I(this.f7779c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            AbstractC0700h0.l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        AbstractC0700h0.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private List I(Rational rational, List list, boolean z10) {
        List<Size> g10 = g(rational, list);
        L(g10);
        HashSet hashSet = new HashSet(g10);
        Iterator it = this.f7780d.iterator();
        while (it.hasNext()) {
            List v10 = v((l1) it.next());
            if (!z10) {
                v10 = d(rational, v10);
            }
            if (v10.isEmpty()) {
                return new ArrayList();
            }
            g10 = f(v10, g10);
            hashSet.retainAll(p(v10, g10));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : g10) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private boolean J() {
        boolean z10;
        P.c S10;
        Iterator it = this.f7780d.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            l1 l1Var = (l1) it.next();
            if (!l1Var.R(false) && (l1Var instanceof InterfaceC1457q0) && (S10 = ((InterfaceC1457q0) l1Var).S(null)) != null) {
                z10 = true;
                if (S10.a() == 1) {
                    break;
                }
            }
        }
        return z10;
    }

    private void K(List list) {
        Collections.sort(list, new a(M(this.f7777a), true));
    }

    static void L(List list) {
        Collections.sort(list, new E.e(true));
    }

    private static Rational M(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private static Rational N(Size size) {
        Rational rational = E.a.f1800a;
        if (E.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = E.a.f1802c;
        return E.a.a(size, rational2) ? rational2 : M(size);
    }

    private boolean b(float f10, float f11, float f12) {
        if (f10 == f11 || f11 == f12) {
            return false;
        }
        return f10 > f11 ? f11 < f12 : f11 > f12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float c(Rational rational, Rational rational2) {
        float floatValue = rational.floatValue();
        float floatValue2 = rational2.floatValue();
        return floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
    }

    private List d(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static List e(List list) {
        Rational rational;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = hashMap.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it2.next();
                if (E.a.a(size, rational)) {
                    break;
                }
            }
            if (rational != null) {
                Size size2 = (Size) hashMap.get(rational);
                Objects.requireNonNull(size2);
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = M(size);
            }
            arrayList.add(size);
            hashMap.put(rational, size);
        }
        return arrayList;
    }

    static List f(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    static List g(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (E.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static Rational h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f7776h ? E.a.f1802c : E.a.f1800a;
    }

    private List i() {
        return this.f7782f.l(34);
    }

    private List j() {
        return this.f7782f.q(34);
    }

    private static Rect k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational M10 = M(size);
        if (rational.floatValue() == M10.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > M10.floatValue()) {
                float f10 = width;
                float floatValue = f10 / rational.floatValue();
                float f11 = (height - floatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f10, floatValue + f11);
            } else {
                float f12 = height;
                float floatValue2 = rational.floatValue() * f12;
                float f13 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, floatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    private Set l() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f7780d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(v((l1) it.next()));
        }
        return hashSet;
    }

    static Rect m(Size size, Size size2) {
        return k(M(size2), size);
    }

    private static Rational n(Rational rational) {
        Rational rational2 = E.a.f1800a;
        if (rational.equals(rational2)) {
            return E.a.f1802c;
        }
        if (rational.equals(E.a.f1802c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    static List p(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> E10 = E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : E10) {
            if (z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    private Pair t(Rect rect, l1 l1Var, boolean z10) {
        Size q10;
        if (z10) {
            q10 = r(E.r.m(rect), l1Var);
        } else {
            Size m10 = E.r.m(rect);
            q10 = q(m10, l1Var);
            rect = m(m10, q10);
        }
        return new Pair(rect, q10);
    }

    private static Rational u(Size size) {
        Rational h10 = h(size);
        AbstractC0700h0.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + h10 + ".");
        return h10;
    }

    private List v(l1 l1Var) {
        if (!this.f7780d.contains(l1Var)) {
            throw new IllegalArgumentException("Invalid child config: " + l1Var);
        }
        if (this.f7783g.containsKey(l1Var)) {
            List list = (List) this.f7783g.get(l1Var);
            Objects.requireNonNull(list);
            return list;
        }
        List e10 = e(this.f7781e.m(l1Var));
        this.f7783g.put(l1Var, e10);
        return e10;
    }

    private static List w(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    private Map x(List list) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = E.a.f1800a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = E.a.f1802c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list2 = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (E.a.a(size, rational3)) {
                        list2 = (List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational M10 = M(size);
                    arrayList.add(M10);
                    hashMap.put(M10, list2);
                }
                list2.add(size);
            }
        }
        return hashMap;
    }

    static boolean y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static boolean z(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (y((Size) it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    List o(A0 a02) {
        List j10 = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(j10);
            arrayList.addAll(i());
            j10 = arrayList;
        }
        List list = (List) a02.f(InterfaceC1457q0.f14682u, null);
        if (list != null) {
            j10 = w(list);
        }
        return H(j10);
    }

    Size q(Size size, l1 l1Var) {
        List<Size> v10 = v(l1Var);
        for (Size size2 : v10) {
            if (!C(size, size2) && !y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : v10) {
            if (!y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    Size r(Size size, l1 l1Var) {
        Iterator it = v(l1Var).iterator();
        while (it.hasNext()) {
            Size m10 = E.r.m(m((Size) it.next(), size));
            if (!y(m10, size)) {
                return m10;
            }
        }
        return size;
    }

    Pair s(l1 l1Var, Rect rect, int i10, boolean z10) {
        boolean z11;
        if (E.r.i(i10)) {
            rect = F(rect);
            z11 = true;
        } else {
            z11 = false;
        }
        Pair t10 = t(rect, l1Var, z10);
        Rect rect2 = (Rect) t10.first;
        Size size = (Size) t10.second;
        if (z11) {
            size = E.r.o(size);
            rect2 = F(rect2);
        }
        return new Pair(rect2, size);
    }

    private b(Size size, G g10, Set set) {
        this(size, g10, set, new H.k(g10, size));
    }

    b(Size size, G g10, Set set, H.k kVar) {
        this.f7783g = new HashMap();
        this.f7777a = size;
        Rational u10 = u(size);
        this.f7778b = u10;
        this.f7779c = n(u10);
        this.f7782f = g10;
        this.f7780d = set;
        this.f7781e = kVar;
    }
}
