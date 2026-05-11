package ze;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: classes3.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    private final s f46011a;

    /* renamed from: c, reason: collision with root package name */
    private E f46013c;

    /* renamed from: b, reason: collision with root package name */
    List f46012b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private Set f46014d = new HashSet();

    x(s sVar) {
        this.f46011a = sVar;
    }

    void a(String str, C c10, int i10, C5282g c5282g) {
        E e10 = new E(i10, str, c10, c5282g);
        this.f46013c = e10;
        this.f46012b.add(e10);
        this.f46014d.add(str);
    }

    E b() {
        if (this.f46012b.isEmpty()) {
            return null;
        }
        return (E) this.f46012b.get(0);
    }

    E c(String str, C5282g c5282g) {
        if (str != null) {
            List list = this.f46012b;
            ListIterator listIterator = list.listIterator(list.size());
            C q10 = this.f46011a.q(str, c5282g);
            while (listIterator.hasPrevious()) {
                if (!Thread.currentThread().isInterrupted()) {
                    E e10 = (E) listIterator.previous();
                    if (!str.equals(e10.f45900b)) {
                        if (q10 != null && q10.w(e10.f45900b)) {
                            break;
                        }
                    } else {
                        return e10;
                    }
                } else {
                    this.f46011a.u();
                    return null;
                }
            }
        }
        return null;
    }

    E d() {
        if (f()) {
            return null;
        }
        List list = this.f46012b;
        ListIterator listIterator = list.listIterator(list.size());
        E e10 = null;
        while (true) {
            E e11 = e10;
            if (!listIterator.hasPrevious()) {
                return e10;
            }
            if (Thread.currentThread().isInterrupted()) {
                this.f46011a.u();
                return null;
            }
            e10 = (E) listIterator.previous();
            C c10 = e10.f45901c;
            if (c10 == null || c10.a()) {
                if (e11 != null) {
                    return e11;
                }
            }
        }
    }

    E e() {
        return this.f46013c;
    }

    boolean f() {
        return this.f46012b.isEmpty();
    }

    void g(String str) {
        E e10;
        List list = this.f46012b;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (Thread.currentThread().isInterrupted()) {
                this.f46011a.u();
                break;
            } else if (str.equals(((E) listIterator.previous()).f45900b)) {
                listIterator.remove();
                break;
            }
        }
        if (this.f46012b.isEmpty()) {
            e10 = null;
        } else {
            e10 = (E) this.f46012b.get(r3.size() - 1);
        }
        this.f46013c = e10;
    }

    boolean h(Set set) {
        Iterator it = this.f46012b.iterator();
        while (it.hasNext()) {
            if (set.contains(((E) it.next()).f45900b)) {
                return true;
            }
        }
        return false;
    }

    boolean i(String str) {
        return this.f46014d.contains(str);
    }

    boolean j(String str, C5282g c5282g) {
        return c(str, c5282g) != null;
    }
}
