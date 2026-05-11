package r7;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: r7.l8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4148l8 implements InterfaceC4118i8 {

    /* renamed from: a, reason: collision with root package name */
    final List f40133a;

    public C4148l8(Context context, AbstractC4138k8 abstractC4138k8) {
        ArrayList arrayList = new ArrayList();
        this.f40133a = arrayList;
        if (abstractC4138k8.c()) {
            arrayList.add(new B8(context, abstractC4138k8));
        }
    }

    @Override // r7.InterfaceC4118i8
    public final void a(InterfaceC4108h8 interfaceC4108h8) {
        Iterator it = this.f40133a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4118i8) it.next()).a(interfaceC4108h8);
        }
    }
}
