package o8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class p {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C3766c f38017a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f38018b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f38019c = new HashSet();

        b(C3766c c3766c) {
            this.f38017a = c3766c;
        }

        void a(b bVar) {
            this.f38018b.add(bVar);
        }

        void b(b bVar) {
            this.f38019c.add(bVar);
        }

        C3766c c() {
            return this.f38017a;
        }

        Set d() {
            return this.f38018b;
        }

        boolean e() {
            return this.f38018b.isEmpty();
        }

        boolean f() {
            return this.f38019c.isEmpty();
        }

        void g(b bVar) {
            this.f38019c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final C3762D f38020a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f38021b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f38020a.equals(this.f38020a) && cVar.f38021b == this.f38021b;
        }

        public int hashCode() {
            return ((this.f38020a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f38021b).hashCode();
        }

        private c(C3762D c3762d, boolean z10) {
            this.f38020a = c3762d;
            this.f38021b = z10;
        }
    }

    static void a(List list) {
        Set<b> c10 = c(list);
        Set b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b bVar = (b) b10.iterator().next();
            b10.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b10.add(bVar2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : c10) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new r(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.d() && (set = (Set) hashMap.get(new c(qVar.b(), qVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C3766c c3766c = (C3766c) it.next();
            b bVar3 = new b(c3766c);
            for (C3762D c3762d : c3766c.j()) {
                c cVar = new c(c3762d, !c3766c.p());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f38021b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c3762d));
                }
                set2.add(bVar3);
            }
        }
    }
}
