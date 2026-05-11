package com.facebook.react.modules.network;

import Td.v;
import Td.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class n implements a {

    /* renamed from: c, reason: collision with root package name */
    private Td.o f21856c = null;

    @Override // com.facebook.react.modules.network.a
    public void a(Td.o oVar) {
        this.f21856c = oVar;
    }

    @Override // Td.o
    public void b(w wVar, List list) {
        Td.o oVar = this.f21856c;
        if (oVar != null) {
            oVar.b(wVar, list);
        }
    }

    @Override // com.facebook.react.modules.network.a
    public void c() {
        this.f21856c = null;
    }

    @Override // Td.o
    public List d(w wVar) {
        Td.o oVar = this.f21856c;
        if (oVar == null) {
            return Collections.emptyList();
        }
        List<Td.n> d10 = oVar.d(wVar);
        ArrayList arrayList = new ArrayList();
        for (Td.n nVar : d10) {
            try {
                new v.a().a(nVar.e(), nVar.g());
                arrayList.add(nVar);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }
}
