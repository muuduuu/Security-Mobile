package k8;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m8.InterfaceC3657a;
import org.conscrypt.BuildConfig;

/* renamed from: k8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3554c {

    /* renamed from: a, reason: collision with root package name */
    private final A8.b f36278a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36279b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f36280c = null;

    public C3554c(Context context, A8.b bVar, String str) {
        this.f36278a = bVar;
        this.f36279b = str;
    }

    private void a(InterfaceC3657a.C0559a c0559a) {
        ((InterfaceC3657a) this.f36278a.get()).b(c0559a);
    }

    private void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3553b c3553b = (C3553b) it.next();
            while (arrayDeque.size() >= i10) {
                k(((InterfaceC3657a.C0559a) arrayDeque.pollFirst()).f37403b);
            }
            InterfaceC3657a.C0559a f10 = c3553b.f(this.f36279b);
            a(f10);
            arrayDeque.offer(f10);
        }
    }

    private static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C3553b.b((Map) it.next()));
        }
        return arrayList;
    }

    private boolean d(List list, C3553b c3553b) {
        String c10 = c3553b.c();
        String e10 = c3553b.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3553b c3553b2 = (C3553b) it.next();
            if (c3553b2.c().equals(c10) && c3553b2.e().equals(e10)) {
                return true;
            }
        }
        return false;
    }

    private List f() {
        return ((InterfaceC3657a) this.f36278a.get()).e(this.f36279b, BuildConfig.FLAVOR);
    }

    private ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3553b c3553b = (C3553b) it.next();
            if (!d(list2, c3553b)) {
                arrayList.add(c3553b);
            }
        }
        return arrayList;
    }

    private ArrayList h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3553b c3553b = (C3553b) it.next();
            if (!d(list2, c3553b)) {
                arrayList.add(c3553b.f(this.f36279b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f36280c == null) {
            this.f36280c = Integer.valueOf(((InterfaceC3657a) this.f36278a.get()).d(this.f36279b));
        }
        return this.f36280c.intValue();
    }

    private void k(String str) {
        ((InterfaceC3657a) this.f36278a.get()).clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k(((InterfaceC3657a.C0559a) it.next()).f37403b);
        }
    }

    private void n(List list) {
        if (list.isEmpty()) {
            j();
            return;
        }
        List e10 = e();
        l(h(e10, list));
        b(g(list, e10));
    }

    private void o() {
        if (this.f36278a.get() == null) {
            throw new C3552a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public List e() {
        o();
        List f10 = f();
        ArrayList arrayList = new ArrayList();
        Iterator it = f10.iterator();
        while (it.hasNext()) {
            arrayList.add(C3553b.a((InterfaceC3657a.C0559a) it.next()));
        }
        return arrayList;
    }

    public void j() {
        o();
        l(f());
    }

    public void m(List list) {
        o();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }
}
