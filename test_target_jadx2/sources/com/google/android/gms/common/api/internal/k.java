package com.google.android.gms.common.api.internal;

import S6.a;
import V6.InterfaceC1280k;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class k extends o {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f23397b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f23398c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, ArrayList arrayList) {
        super(pVar, null);
        this.f23398c = pVar;
        this.f23397b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void a() {
        x xVar;
        InterfaceC1280k interfaceC1280k;
        x xVar2;
        p pVar = this.f23398c;
        xVar = pVar.f23404a;
        xVar.f23468s.f23443p = p.y(pVar);
        ArrayList arrayList = this.f23397b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a.f fVar = (a.f) arrayList.get(i10);
            p pVar2 = this.f23398c;
            interfaceC1280k = pVar2.f23418o;
            xVar2 = pVar2.f23404a;
            fVar.q(interfaceC1280k, xVar2.f23468s.f23443p);
        }
    }
}
