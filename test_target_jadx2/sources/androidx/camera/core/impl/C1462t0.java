package androidx.camera.core.impl;

import A.InterfaceC0712o;
import A.InterfaceC0713p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1462t0 implements InterfaceC0712o {

    /* renamed from: b, reason: collision with root package name */
    private final int f14686b;

    public C1462t0(int i10) {
        this.f14686b = i10;
    }

    @Override // A.InterfaceC0712o
    public List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0713p interfaceC0713p = (InterfaceC0713p) it.next();
            y0.f.b(interfaceC0713p instanceof G, "The camera info doesn't contain internal implementation.");
            if (interfaceC0713p.i() == this.f14686b) {
                arrayList.add(interfaceC0713p);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f14686b;
    }
}
