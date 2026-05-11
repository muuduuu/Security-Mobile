package N5;

import D5.AbstractC0776b;
import K5.AbstractC0928i;
import K5.C0922c;
import K5.C0923d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class i extends M5.d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected LinkedHashSet f6547a;

    @Override // M5.d
    public Collection a(F5.l lVar, C0922c c0922c) {
        AbstractC0776b g10 = lVar.g();
        HashMap hashMap = new HashMap();
        if (this.f6547a != null) {
            Class d10 = c0922c.d();
            Iterator it = this.f6547a.iterator();
            while (it.hasNext()) {
                M5.b bVar = (M5.b) it.next();
                if (d10.isAssignableFrom(bVar.b())) {
                    c(C0923d.m(lVar, bVar.b()), bVar, lVar, g10, hashMap);
                }
            }
        }
        c(c0922c, new M5.b(c0922c.d(), null), lVar, g10, hashMap);
        return new ArrayList(hashMap.values());
    }

    @Override // M5.d
    public Collection b(F5.l lVar, AbstractC0928i abstractC0928i, D5.j jVar) {
        Class d10;
        List<M5.b> Q10;
        AbstractC0776b g10 = lVar.g();
        if (jVar != null) {
            d10 = jVar.q();
        } else {
            if (abstractC0928i == null) {
                throw new IllegalArgumentException("Both property and base type are nulls");
            }
            d10 = abstractC0928i.d();
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet = this.f6547a;
        if (linkedHashSet != null) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                M5.b bVar = (M5.b) it.next();
                if (d10.isAssignableFrom(bVar.b())) {
                    c(C0923d.m(lVar, bVar.b()), bVar, lVar, g10, hashMap);
                }
            }
        }
        if (abstractC0928i != null && (Q10 = g10.Q(abstractC0928i)) != null) {
            for (M5.b bVar2 : Q10) {
                c(C0923d.m(lVar, bVar2.b()), bVar2, lVar, g10, hashMap);
            }
        }
        c(C0923d.m(lVar, d10), new M5.b(d10, null), lVar, g10, hashMap);
        return new ArrayList(hashMap.values());
    }

    protected void c(C0922c c0922c, M5.b bVar, F5.l lVar, AbstractC0776b abstractC0776b, HashMap hashMap) {
        String R10;
        if (!bVar.c() && (R10 = abstractC0776b.R(c0922c)) != null) {
            bVar = new M5.b(bVar.b(), R10);
        }
        M5.b bVar2 = new M5.b(bVar.b());
        if (hashMap.containsKey(bVar2)) {
            if (!bVar.c() || ((M5.b) hashMap.get(bVar2)).c()) {
                return;
            }
            hashMap.put(bVar2, bVar);
            return;
        }
        hashMap.put(bVar2, bVar);
        List<M5.b> Q10 = abstractC0776b.Q(c0922c);
        if (Q10 == null || Q10.isEmpty()) {
            return;
        }
        for (M5.b bVar3 : Q10) {
            c(C0923d.m(lVar, bVar3.b()), bVar3, lVar, abstractC0776b, hashMap);
        }
    }
}
