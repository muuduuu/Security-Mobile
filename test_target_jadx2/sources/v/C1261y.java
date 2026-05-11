package V;

import A.AbstractC0700h0;
import V.AbstractC1253p;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1441i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: V.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261y {

    /* renamed from: a, reason: collision with root package name */
    private final List f10745a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1253p f10746b;

    C1261y(List list, AbstractC1253p abstractC1253p) {
        y0.f.b((list.isEmpty() && abstractC1253p == AbstractC1253p.f10704a) ? false : true, "No preferred quality and fallback strategy.");
        this.f10745a = Collections.unmodifiableList(new ArrayList(list));
        this.f10746b = abstractC1253p;
    }

    private void a(List list, Set set) {
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        AbstractC0700h0.a("QualitySelector", "Select quality by fallbackStrategy = " + this.f10746b);
        AbstractC1253p abstractC1253p = this.f10746b;
        if (abstractC1253p == AbstractC1253p.f10704a) {
            return;
        }
        y0.f.j(abstractC1253p instanceof AbstractC1253p.b, "Currently only support type RuleStrategy");
        AbstractC1253p.b bVar = (AbstractC1253p.b) this.f10746b;
        List b10 = AbstractC1258v.b();
        AbstractC1258v b11 = bVar.b() == AbstractC1258v.f10731f ? (AbstractC1258v) b10.get(0) : bVar.b() == AbstractC1258v.f10730e ? (AbstractC1258v) b10.get(b10.size() - 1) : bVar.b();
        int indexOf = b10.indexOf(b11);
        y0.f.i(indexOf != -1);
        ArrayList arrayList = new ArrayList();
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            AbstractC1258v abstractC1258v = (AbstractC1258v) b10.get(i10);
            if (list.contains(abstractC1258v)) {
                arrayList.add(abstractC1258v);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = indexOf + 1; i11 < b10.size(); i11++) {
            AbstractC1258v abstractC1258v2 = (AbstractC1258v) b10.get(i11);
            if (list.contains(abstractC1258v2)) {
                arrayList2.add(abstractC1258v2);
            }
        }
        AbstractC0700h0.a("QualitySelector", "sizeSortedQualities = " + b10 + ", fallback quality = " + b11 + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int c10 = bVar.c();
        if (c10 != 0) {
            if (c10 == 1) {
                set.addAll(arrayList);
                set.addAll(arrayList2);
                return;
            }
            if (c10 == 2) {
                set.addAll(arrayList);
                return;
            }
            if (c10 != 3) {
                if (c10 == 4) {
                    set.addAll(arrayList2);
                    return;
                }
                throw new AssertionError("Unhandled fallback strategy: " + this.f10746b);
            }
            set.addAll(arrayList2);
            set.addAll(arrayList);
        }
    }

    private static void b(AbstractC1258v abstractC1258v) {
        y0.f.b(AbstractC1258v.a(abstractC1258v), "Invalid quality: " + abstractC1258v);
    }

    private static void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1258v abstractC1258v = (AbstractC1258v) it.next();
            y0.f.b(AbstractC1258v.a(abstractC1258v), "qualities contain invalid quality: " + abstractC1258v);
        }
    }

    public static C1261y d(AbstractC1258v abstractC1258v, AbstractC1253p abstractC1253p) {
        y0.f.h(abstractC1258v, "quality cannot be null");
        y0.f.h(abstractC1253p, "fallbackStrategy cannot be null");
        b(abstractC1258v);
        return new C1261y(Collections.singletonList(abstractC1258v), abstractC1253p);
    }

    public static C1261y e(List list, AbstractC1253p abstractC1253p) {
        y0.f.h(list, "qualities cannot be null");
        y0.f.h(abstractC1253p, "fallbackStrategy cannot be null");
        y0.f.b(!list.isEmpty(), "qualities cannot be empty");
        c(list);
        return new C1261y(list, abstractC1253p);
    }

    private static Size g(X.g gVar) {
        InterfaceC1441i0.c k10 = gVar.k();
        return new Size(k10.k(), k10.h());
    }

    public static Map h(InterfaceC1239b0 interfaceC1239b0, A.B b10) {
        HashMap hashMap = new HashMap();
        for (AbstractC1258v abstractC1258v : interfaceC1239b0.b(b10)) {
            X.g c10 = interfaceC1239b0.c(abstractC1258v, b10);
            Objects.requireNonNull(c10);
            hashMap.put(abstractC1258v, g(c10));
        }
        return hashMap;
    }

    List f(List list) {
        if (list.isEmpty()) {
            AbstractC0700h0.l("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        AbstractC0700h0.a("QualitySelector", "supportedQualities = " + list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = this.f10745a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC1258v abstractC1258v = (AbstractC1258v) it.next();
            if (abstractC1258v == AbstractC1258v.f10731f) {
                linkedHashSet.addAll(list);
                break;
            }
            if (abstractC1258v == AbstractC1258v.f10730e) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(abstractC1258v)) {
                linkedHashSet.add(abstractC1258v);
            } else {
                AbstractC0700h0.l("QualitySelector", "quality is not supported and will be ignored: " + abstractC1258v);
            }
        }
        a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f10745a + ", fallbackStrategy=" + this.f10746b + "}";
    }
}
