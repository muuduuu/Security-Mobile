package A;

import androidx.camera.core.impl.C1462t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final r f209c = new a().b(0).a();

    /* renamed from: d, reason: collision with root package name */
    public static final r f210d = new a().b(1).a();

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f211a;

    /* renamed from: b, reason: collision with root package name */
    private final String f212b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedHashSet f213a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        private String f214b;

        public r a() {
            return new r(this.f213a, this.f214b);
        }

        public a b(int i10) {
            y0.f.j(i10 != -1, "The specified lens facing is invalid.");
            this.f213a.add(new C1462t0(i10));
            return this;
        }
    }

    r(LinkedHashSet linkedHashSet, String str) {
        this.f211a = linkedHashSet;
        this.f212b = str;
    }

    public LinkedHashSet a(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.camera.core.impl.H) it.next()).c());
        }
        List b10 = b(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.H h10 = (androidx.camera.core.impl.H) it2.next();
            if (b10.contains(h10.c())) {
                linkedHashSet2.add(h10);
            }
        }
        return linkedHashSet2;
    }

    public List b(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.f211a.iterator();
        while (it.hasNext()) {
            arrayList = ((InterfaceC0712o) it.next()).b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet c() {
        return this.f211a;
    }

    public Integer d() {
        Iterator it = this.f211a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC0712o interfaceC0712o = (InterfaceC0712o) it.next();
            if (interfaceC0712o instanceof C1462t0) {
                Integer valueOf = Integer.valueOf(((C1462t0) interfaceC0712o).c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public androidx.camera.core.impl.H e(LinkedHashSet linkedHashSet) {
        Iterator it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return (androidx.camera.core.impl.H) it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
