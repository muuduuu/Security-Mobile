package ze;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: c, reason: collision with root package name */
    public static int f45987c = 4;

    /* renamed from: a, reason: collision with root package name */
    private C5283h f45988a;

    /* renamed from: b, reason: collision with root package name */
    private i f45989b;

    public s() {
        this(null, null);
    }

    private boolean A(Object obj) {
        return (obj instanceof D) && !((D) obj).u();
    }

    private boolean C(List list, C5282g c5282g) {
        boolean z10 = false;
        for (Object obj : list) {
            if ((obj instanceof D) && !c5282g.f45931k.contains(obj)) {
                D d10 = (D) obj;
                if (b(d10, c5282g)) {
                    z10 = true;
                } else if (!d10.t()) {
                    z10 |= C(d10.k(), c5282g);
                }
            }
        }
        return z10;
    }

    private boolean D(C c10, C5282g c5282g) {
        boolean z10;
        E c11;
        E c12;
        if (c10 == null || c10.q().isEmpty()) {
            return false;
        }
        int i10 = -1;
        for (String str : c10.m()) {
            if (str != null && (c12 = o(c5282g).c(str, c5282g)) != null) {
                i10 = c12.f45899a;
            }
        }
        loop1: while (true) {
            z10 = true;
            for (String str2 : c10.q()) {
                if (str2 != null && (c11 = o(c5282g).c(str2, c5282g)) != null) {
                    if (c11.f45899a <= i10) {
                        break;
                    }
                    z10 = false;
                }
            }
        }
        if (!z10) {
            return false;
        }
        ListIterator listIterator = o(c5282g).f46012b.listIterator(o(c5282g).f46012b.size());
        while (listIterator.hasPrevious()) {
            E e10 = (E) listIterator.previous();
            if (Thread.currentThread().isInterrupted()) {
                u();
                return e10.f45899a <= i10;
            }
            if (c10.z(e10.f45900b)) {
                return e10.f45899a <= i10;
            }
        }
        return true;
    }

    private D E(String str) {
        return new D(str);
    }

    private w F(C5282g c5282g) {
        return (w) c5282g.f45925e.pop();
    }

    private w G(C5282g c5282g) {
        return (w) c5282g.f45925e.push(new w(new x(this), new C5281f()));
    }

    private void H(ListIterator listIterator, D d10, C5282g c5282g) {
        D w10 = d10.w();
        w10.C(true);
        w10.x("id");
        listIterator.add(w10);
        o(c5282g).a(d10.e(), q(d10.e(), c5282g), listIterator.previousIndex(), c5282g);
    }

    private void I(List list, Object obj, C5282g c5282g) {
        D d10;
        o(c5282g).e();
        E d11 = o(c5282g).d();
        if (d11 == null || (d10 = (D) list.get(d11.f45899a)) == null) {
            return;
        }
        d10.h(obj);
    }

    private void a(D d10, Map map) {
        if (map != null) {
            Map m10 = d10.m();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!m10.containsKey(str)) {
                    d10.d(str, (String) entry.getValue());
                }
            }
        }
    }

    private boolean b(D d10, C5282g c5282g) {
        Set<Be.a> set = c5282g.f45930j;
        if (set != null) {
            for (Be.a aVar : set) {
                if (aVar.a(d10)) {
                    d(d10, c5282g);
                    this.f45988a.c(aVar, d10);
                    return true;
                }
            }
        }
        Set set2 = c5282g.f45932l;
        if (set2 == null || set2.isEmpty()) {
            return false;
        }
        Iterator it = c5282g.f45932l.iterator();
        while (it.hasNext()) {
            if (((Be.a) it.next()).a(d10)) {
                return false;
            }
        }
        if (!d10.r()) {
            this.f45988a.b(true, d10, Ae.a.NotAllowedTag);
        }
        d(d10, c5282g);
        return true;
    }

    private void c(C c10, D d10, C5282g c5282g) {
        if (c10 == null || d10 == null) {
            return;
        }
        if (c10.y() || (c10.x() && c5282g.f45921a && !c5282g.f45922b)) {
            c5282g.f45923c.add(d10);
        }
    }

    private static boolean e(D d10, D d11) {
        return d10.f45902d.equals(d11.f45902d) && d10.m().equals(d11.m());
    }

    private void f(C5282g c5282g, Set set) {
        c5282g.f45929i = c5282g.f45926f;
        if (this.f45988a.v()) {
            List k10 = c5282g.f45927g.k();
            c5282g.f45929i = new D(null);
            if (k10 != null) {
                Iterator it = k10.iterator();
                while (it.hasNext()) {
                    c5282g.f45929i.f(it.next());
                }
            }
        }
        Map m10 = c5282g.f45929i.m();
        if (c5282g.f45929i.q("xmlns")) {
            D d10 = c5282g.f45929i;
            d10.i(BuildConfig.FLAVOR, d10.l("xmlns"));
        }
        if (!this.f45988a.r() || set == null) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (Thread.currentThread().isInterrupted()) {
                u();
                return;
            }
            String str = (String) it2.next();
            if (!c5282g.f45934n.containsKey(str)) {
                String str2 = "xmlns:" + str;
                if (!m10.containsKey(str2) && !str.equals("xml") && !str.equals(BuildConfig.FLAVOR)) {
                    if (str.equals("svg")) {
                        c5282g.f45929i.d(str2, "http://www.w3.org/2000/svg");
                    } else if (str.equals("xlink")) {
                        c5282g.f45929i.d(str2, "http://www.w3.org/1999/xlink");
                    } else {
                        c5282g.f45929i.d(str2, str);
                    }
                }
            }
        }
    }

    private void i(List list, C5282g c5282g) {
        E b10 = o(c5282g).b();
        for (E e10 : o(c5282g).f46012b) {
            if (Thread.currentThread().isInterrupted()) {
                u();
                return;
            }
            this.f45988a.a(true, (D) list.get(e10.f45899a), Ae.a.UnclosedTag);
        }
        if (b10 != null) {
            j(list, b10, null, c5282g);
        }
    }

    private List j(List list, E e10, Object obj, C5282g c5282g) {
        C q10;
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = list.listIterator(e10.f45899a);
        Object next = listIterator.next();
        boolean z10 = (!A(next) || (q10 = q(((D) next).e(), c5282g)) == null || q10.l() == null) ? false : true;
        boolean z11 = false;
        D d10 = null;
        while (true) {
            if ((obj != null || z11) && (obj == null || next == obj)) {
                break;
            }
            if (Thread.currentThread().isInterrupted()) {
                u();
                return arrayList;
            }
            if (A(next)) {
                D d11 = (D) next;
                arrayList.add(d11);
                List o10 = d11.o();
                if (o10 != null) {
                    G(c5282g);
                    B(o10, o10.listIterator(0), c5282g);
                    i(o10, c5282g);
                    d11.H(null);
                    F(c5282g);
                }
                D l10 = l(d11);
                c(q(l10.e(), c5282g), l10, c5282g);
                if (d10 != null) {
                    d10.g(o10);
                    d10.f(l10);
                    listIterator.set(null);
                } else if (o10 != null) {
                    o10.add(l10);
                    listIterator.set(o10);
                } else {
                    listIterator.set(l10);
                }
                o(c5282g).g(l10.e());
                d10 = l10;
            } else if (d10 != null) {
                listIterator.set(null);
                if (next != null) {
                    d10.f(next);
                }
            }
            if (listIterator.hasNext()) {
                next = listIterator.next();
            } else {
                z11 = true;
            }
        }
        if (z10 && !c5282g.f45933m.isEmpty()) {
            c5282g.f45933m.pop();
        }
        return arrayList;
    }

    private void k(List list, C5282g c5282g) {
        boolean z10;
        Iterator it = list.iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                if (next instanceof D) {
                    D d10 = (D) next;
                    c(q(d10.e(), c5282g), d10, c5282g);
                } else if (next instanceof l) {
                    z11 = true ^ BuildConfig.FLAVOR.equals(next.toString());
                }
                if (z11) {
                    c5282g.f45927g.f(next);
                }
            }
        }
        for (D d11 : c5282g.f45923c) {
            if (Thread.currentThread().isInterrupted()) {
                u();
                return;
            }
            D c10 = d11.c();
            while (true) {
                if (c10 == null) {
                    z10 = true;
                    break;
                } else {
                    if (c5282g.f45923c.contains(c10)) {
                        z10 = false;
                        break;
                    }
                    c10 = c10.c();
                }
            }
            if (z10) {
                d11.z();
                c5282g.f45928h.f(d11);
            }
        }
    }

    private D l(D d10) {
        d10.F();
        return d10;
    }

    private List m(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof D) {
                arrayList.add((D) obj);
            } else if (obj instanceof List) {
                arrayList.addAll((List) obj);
            }
        }
        return arrayList;
    }

    private C5281f n(C5282g c5282g) {
        return ((w) c5282g.f45925e.peek()).a();
    }

    private x o(C5282g c5282g) {
        return ((w) c5282g.f45925e.peek()).b();
    }

    private void t(InterfaceC5277b interfaceC5277b, ListIterator listIterator, List list, C5282g c5282g) {
        p pVar = (p) interfaceC5277b;
        String str = pVar.f45902d;
        C q10 = q(str, c5282g);
        if (q10 != null) {
            str = q10.n();
        }
        if ((q10 == null && this.f45988a.w() && !w(str, c5282g)) || (q10 != null && q10.v() && this.f45988a.u())) {
            listIterator.set(null);
            return;
        }
        if (q10 != null && !q10.b()) {
            listIterator.set(null);
            return;
        }
        E c10 = o(c5282g).c(str, c5282g);
        if (c10 != null) {
            List j10 = j(list, c10, pVar, c5282g);
            if (j10.size() > 0) {
                D d10 = (D) j10.get(0);
                if (d10.q("xmlns")) {
                    c5282g.f45933m.pop();
                }
                C q11 = q(d10.e(), c5282g);
                if (q11 != null && q11.l() != null && !c5282g.f45933m.isEmpty() && q11.l().equals(c5282g.f45933m.lastElement()) && !d10.q("xmlns")) {
                    c5282g.f45933m.pop();
                }
            }
            listIterator.set(null);
            for (int size = j10.size() - 1; size >= 0; size--) {
                D d11 = (D) j10.get(size);
                if (size > 0 && q10 != null && q10.t(d11.e())) {
                    D w10 = d11.w();
                    w10.C(true);
                    listIterator.add(w10);
                    listIterator.previous();
                }
            }
            if (!n(c5282g).d()) {
                while (c10.f45899a < n(c5282g).c()) {
                    n(c5282g).e();
                }
            }
            while (!n(c5282g).d() && str.equals(n(c5282g).b()) && c10.f45899a == n(c5282g).c()) {
                if (list.get(((E) n(c5282g).f45919a.peek()).f45899a) != null) {
                    int i10 = n(c5282g).e().f45899a;
                    Object obj = list.get(i10);
                    if (obj instanceof D) {
                        H(listIterator, (D) obj, c5282g);
                    } else if (obj instanceof List) {
                        for (D d12 : m((List) obj)) {
                            if (Thread.currentThread().isInterrupted()) {
                                return;
                            }
                            listIterator.add(d12);
                            B(list, list.listIterator(list.size() - 1), c5282g);
                        }
                        list.set(i10, null);
                    } else {
                        continue;
                    }
                } else {
                    n(c5282g).e();
                }
            }
        }
    }

    private void v(InterfaceC5277b interfaceC5277b, ListIterator listIterator, List list, C5282g c5282g) {
        C c10;
        D d10 = (D) interfaceC5277b;
        String e10 = d10.e();
        C q10 = q(e10, c5282g);
        E e11 = o(c5282g).f() ? null : o(c5282g).e();
        C q11 = e11 == null ? null : q(e11.f45900b, c5282g);
        c5282g.f45924d.add(e10);
        if (q10 != null && q10.l() != null && !d10.q("xmlns")) {
            c5282g.f45933m.push(q10.l());
        }
        for (String str : d10.m().keySet()) {
            if (str.toLowerCase().indexOf("xmlns:") != -1) {
                String str2 = str.toLowerCase().split("xmlns:")[1];
                String l10 = d10.l(str);
                d10.i(str2.toLowerCase(), l10);
                c5282g.f45934n.put(str2.toLowerCase(), l10);
            }
        }
        if (d10.q("xmlns")) {
            String l11 = d10.l("xmlns");
            if (l11.equals("https://www.w3.org/1999/xhtml") || l11.equals("http://w3.org/1999/xhtml")) {
                Map m10 = d10.m();
                m10.put("xmlns", "http://www.w3.org/1999/xhtml");
                d10.B(m10);
                l11 = "http://www.w3.org/1999/xhtml";
            }
            if ("html".equals(e10) && l11.equals("http://www.w3.org/TR/REC-html40")) {
                d10.x("xmlns");
            } else if (l11.trim().isEmpty()) {
                d10.x("xmlns");
            } else {
                c5282g.f45933m.push(l11);
                d10.i(BuildConfig.FLAVOR, l11);
                c5282g.f45934n.put(BuildConfig.FLAVOR, l11);
            }
            if (!this.f45988a.r()) {
                d10.x("xmlns");
            }
        }
        if (w(e10, c5282g)) {
            d10.E(true);
        } else {
            d10.E(false);
        }
        String e12 = d10.e();
        if ("html".equals(e12)) {
            a(c5282g.f45926f, d10.m());
            listIterator.set(null);
            return;
        }
        if ("body".equals(e12)) {
            c5282g.f45922b = true;
            a(c5282g.f45927g, d10.m());
            listIterator.set(null);
            return;
        }
        if ("head".equals(e12)) {
            c5282g.f45921a = true;
            a(c5282g.f45928h, d10.m());
            listIterator.set(null);
            return;
        }
        if (q10 == null && this.f45988a.w() && !w(e12, c5282g)) {
            listIterator.set(null);
            this.f45988a.d(true, d10, Ae.a.Unknown);
            return;
        }
        if (q10 != null && q10.v() && this.f45988a.u()) {
            listIterator.set(null);
            this.f45988a.d(true, d10, Ae.a.Deprecated);
            return;
        }
        if (q10 == null && q11 != null && !q11.a() && !q11.c(d10)) {
            j(list, e11, d10, c5282g);
            listIterator.previous();
            return;
        }
        if (q10 != null && q10.s() && o(c5282g).h(q10.o())) {
            listIterator.set(null);
            return;
        }
        if (q10 != null && q10.B() && o(c5282g).i(e12)) {
            listIterator.set(null);
            this.f45988a.a(true, d10, Ae.a.UniqueTagDuplicated);
            return;
        }
        if (!z(q10, c5282g)) {
            listIterator.set(null);
            this.f45988a.a(true, d10, Ae.a.FatalTagMissing);
            return;
        }
        if (D(q10, c5282g)) {
            D E10 = E((String) q10.q().iterator().next());
            if (!x(E10, c5282g)) {
                I(list, interfaceC5277b, c5282g);
                listIterator.set(null);
                return;
            }
            E10.C(true);
            listIterator.previous();
            listIterator.add(E10);
            listIterator.previous();
            this.f45988a.a(true, d10, Ae.a.RequiredParentMissing);
            return;
        }
        if (q10 == null || e11 == null || !q10.A(q11)) {
            if (x(interfaceC5277b, c5282g)) {
                if (q10 == null || q10.b()) {
                    o(c5282g).a(e12, q(e12, c5282g), listIterator.previousIndex(), c5282g);
                    return;
                }
                D l12 = l(d10);
                c(q10, l12, c5282g);
                listIterator.set(l12);
                return;
            }
            E e13 = o(c5282g).e();
            if (e13 == null || (c10 = e13.f45901c) == null || c10.p() == null) {
                I(list, interfaceC5277b, c5282g);
                listIterator.set(null);
                return;
            }
            D E11 = E(e13.f45901c.p());
            if (!x(E11, c5282g) || q(e13.f45901c.p(), c5282g) == null || !q(e13.f45901c.p(), c5282g).c(interfaceC5277b)) {
                I(list, interfaceC5277b, c5282g);
                listIterator.set(null);
                return;
            }
            E11.C(true);
            listIterator.previous();
            listIterator.add(E11);
            listIterator.previous();
            this.f45988a.a(true, d10, Ae.a.RequiredParentMissing);
            return;
        }
        n(c5282g).a(e11, new E(listIterator.previousIndex(), q10.n(), q(e12, c5282g), c5282g));
        this.f45988a.a(!d10.q("id"), (D) list.get(e11.f45899a), Ae.a.UnpermittedChild);
        List j10 = j(list, e11, d10, c5282g);
        int size = j10.size();
        if (q10.r() && size > 0) {
            ListIterator listIterator2 = j10.listIterator(size);
            ArrayList arrayList = new ArrayList();
            while (listIterator2.hasPrevious()) {
                if (Thread.currentThread().isInterrupted()) {
                    u();
                    return;
                }
                D d11 = (D) listIterator2.previous();
                if (!q10.u(d11.e())) {
                    break;
                } else {
                    arrayList.add(0, d11);
                }
            }
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (Thread.currentThread().isInterrupted()) {
                        u();
                        return;
                    }
                    D d12 = (D) it.next();
                    if (y(d12, listIterator)) {
                        it.remove();
                    } else {
                        listIterator.add(d12.w());
                    }
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    listIterator.previous();
                }
            }
        }
        listIterator.previous();
    }

    private boolean w(String str, C5282g c5282g) {
        String str2;
        if (!this.f45988a.r() || str == null) {
            return false;
        }
        if (str.contains(":")) {
            return true;
        }
        Stack stack = c5282g.f45933m;
        return (stack == null || stack.size() == 0 || (str2 = (String) c5282g.f45933m.peek()) == null || str2.equals("http://www.w3.org/1999/xhtml")) ? false : true;
    }

    private boolean x(InterfaceC5277b interfaceC5277b, C5282g c5282g) {
        C c10;
        E e10 = o(c5282g).e();
        if (e10 == null || (c10 = e10.f45901c) == null) {
            return true;
        }
        return c10.c(interfaceC5277b);
    }

    private static boolean y(D d10, ListIterator listIterator) {
        int i10 = 0;
        int i11 = 0;
        while (listIterator.hasNext() && i10 < 3) {
            InterfaceC5277b interfaceC5277b = (InterfaceC5277b) listIterator.next();
            i10++;
            if (!(interfaceC5277b instanceof D)) {
                break;
            }
            D d11 = (D) interfaceC5277b;
            if (!d11.s() || !e(d11, d10)) {
                break;
            }
            i11++;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            listIterator.previous();
        }
        return i11 == 3;
    }

    private boolean z(C c10, C5282g c5282g) {
        if (c10 == null || c10.m().isEmpty()) {
            return true;
        }
        Iterator it = c10.m().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (o(c5282g).j((String) it.next(), c5282g)) {
                z10 = true;
            }
        }
        return z10;
    }

    void B(List list, ListIterator listIterator, C5282g c5282g) {
        while (listIterator.hasNext()) {
            if (Thread.currentThread().isInterrupted()) {
                u();
                return;
            }
            InterfaceC5277b interfaceC5277b = (InterfaceC5277b) listIterator.next();
            if (interfaceC5277b instanceof p) {
                t(interfaceC5277b, listIterator, list, c5282g);
            } else if (A(interfaceC5277b)) {
                v(interfaceC5277b, listIterator, list, c5282g);
            } else {
                if (c5282g.f45921a && !c5282g.f45922b && this.f45988a.q()) {
                    if (interfaceC5277b instanceof k) {
                        if (o(c5282g).e() == null) {
                            c5282g.f45923c.add(new z((k) interfaceC5277b, c5282g.f45927g));
                        }
                    } else if (interfaceC5277b instanceof l) {
                        l lVar = (l) interfaceC5277b;
                        if (lVar.e() && ((InterfaceC5277b) list.get(list.size() - 1)) == interfaceC5277b) {
                            c5282g.f45923c.add(new z(lVar, c5282g.f45927g));
                        }
                    }
                }
                if (!x(interfaceC5277b, c5282g)) {
                    I(list, interfaceC5277b, c5282g);
                    listIterator.set(null);
                }
            }
        }
    }

    protected void d(D d10, C5282g c5282g) {
        d10.I(true);
        c5282g.f45931k.add(d10);
    }

    protected D g(Reader reader, C5282g c5282g) {
        G(c5282g);
        c5282g.f45921a = false;
        c5282g.f45922b = false;
        c5282g.f45923c.clear();
        c5282g.f45924d.clear();
        c5282g.f45930j = new HashSet(this.f45988a.k());
        c5282g.f45932l = new HashSet(this.f45988a.f());
        this.f45989b = this.f45988a.h();
        c5282g.f45931k.clear();
        c5282g.f45926f = E("html");
        c5282g.f45927g = E("body");
        D E10 = E("head");
        c5282g.f45928h = E10;
        c5282g.f45929i = null;
        c5282g.f45926f.f(E10);
        c5282g.f45926f.f(c5282g.f45927g);
        u uVar = new u(this, reader, c5282g);
        uVar.I();
        if (Thread.currentThread().isInterrupted()) {
            u();
            return null;
        }
        List k10 = uVar.k();
        i(k10, c5282g);
        if (Thread.currentThread().isInterrupted()) {
            u();
            return null;
        }
        k(k10, c5282g);
        if (Thread.currentThread().isInterrupted()) {
            u();
            return null;
        }
        f(c5282g, uVar.j());
        if (Thread.currentThread().isInterrupted()) {
            u();
            return null;
        }
        while (C(k10, c5282g)) {
            if (Thread.currentThread().isInterrupted()) {
                u();
                return null;
            }
        }
        Set set = c5282g.f45931k;
        if (set != null && !set.isEmpty()) {
            for (D d10 : c5282g.f45931k) {
                if (Thread.currentThread().isInterrupted()) {
                    u();
                    return null;
                }
                D c10 = d10.c();
                if (c10 != null) {
                    c10.y(d10);
                }
            }
        }
        c5282g.f45929i.D(uVar.i());
        F(c5282g);
        return c5282g.f45929i;
    }

    public D h(String str) {
        try {
            return g(new StringReader(str), new C5282g());
        } catch (IOException e10) {
            throw new t(e10);
        }
    }

    public C5283h p() {
        return this.f45988a;
    }

    public C q(String str, C5282g c5282g) {
        Stack stack;
        C a10 = r().a(str);
        if (a10 != null && a10.l() != null && (stack = c5282g.f45933m) != null && stack.size() > 0 && ((String) c5282g.f45933m.peek()) == a10.l()) {
            return a10;
        }
        if (w(str, c5282g)) {
            return null;
        }
        return r().a(str);
    }

    public v r() {
        return this.f45988a.l();
    }

    public i s() {
        return this.f45989b;
    }

    public s(v vVar, C5283h c5283h) {
        c5283h = c5283h == null ? new C5283h() : c5283h;
        this.f45988a = c5283h;
        if (vVar != null || c5283h.l() != null) {
            if (vVar != null) {
                this.f45988a.M(vVar);
            }
        } else if (this.f45988a.i() == f45987c) {
            this.f45988a.M(q.f45983b);
        } else {
            this.f45988a.M(r.f45985b);
        }
    }

    protected void u() {
    }
}
