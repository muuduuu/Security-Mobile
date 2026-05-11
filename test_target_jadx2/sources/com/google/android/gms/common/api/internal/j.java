package com.google.android.gms.common.api.internal;

import S6.a;
import V6.AbstractC1267c;
import V6.N;
import android.content.Context;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2018j;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
final class j extends o {

    /* renamed from: b, reason: collision with root package name */
    private final Map f23395b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f23396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, Map map) {
        super(pVar, null);
        this.f23396c = pVar;
        this.f23395b = map;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void a() {
        C2018j c2018j;
        Context context;
        boolean z10;
        Context context2;
        x xVar;
        A7.e eVar;
        A7.e eVar2;
        x xVar2;
        Context context3;
        boolean z11;
        c2018j = this.f23396c.f23407d;
        N n10 = new N(c2018j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.f23395b.keySet()) {
            if (fVar.l()) {
                z11 = ((g) this.f23395b.get(fVar)).f23391c;
                if (!z11) {
                    arrayList.add(fVar);
                }
            }
            arrayList2.add(fVar);
        }
        int i10 = 0;
        int i11 = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i10 < size) {
                a.f fVar2 = (a.f) arrayList.get(i10);
                context = this.f23396c.f23406c;
                i11 = n10.b(context, fVar2);
                i10++;
                if (i11 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                a.f fVar3 = (a.f) arrayList2.get(i10);
                context3 = this.f23396c.f23406c;
                i11 = n10.b(context3, fVar3);
                i10++;
                if (i11 == 0) {
                    break;
                }
            }
        }
        if (i11 != 0) {
            C2010b c2010b = new C2010b(i11, null);
            p pVar = this.f23396c;
            xVar2 = pVar.f23404a;
            xVar2.n(new h(this, pVar, c2010b));
            return;
        }
        p pVar2 = this.f23396c;
        z10 = pVar2.f23416m;
        if (z10) {
            eVar = pVar2.f23414k;
            if (eVar != null) {
                eVar2 = pVar2.f23414k;
                eVar2.t();
            }
        }
        for (a.f fVar4 : this.f23395b.keySet()) {
            AbstractC1267c.InterfaceC0202c interfaceC0202c = (AbstractC1267c.InterfaceC0202c) this.f23395b.get(fVar4);
            if (fVar4.l()) {
                context2 = this.f23396c.f23406c;
                if (n10.b(context2, fVar4) != 0) {
                    p pVar3 = this.f23396c;
                    xVar = pVar3.f23404a;
                    xVar.n(new i(this, pVar3, interfaceC0202c));
                }
            }
            fVar4.j(interfaceC0202c);
        }
    }
}
