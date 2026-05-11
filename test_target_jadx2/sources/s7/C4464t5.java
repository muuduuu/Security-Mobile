package s7;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: s7.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4464t5 implements InterfaceC4444q5 {

    /* renamed from: a, reason: collision with root package name */
    final List f41454a;

    public C4464t5(Context context, AbstractC4457s5 abstractC4457s5) {
        ArrayList arrayList = new ArrayList();
        this.f41454a = arrayList;
        if (abstractC4457s5.c()) {
            arrayList.add(new D5(context, abstractC4457s5));
        }
    }

    @Override // s7.InterfaceC4444q5
    public final void a(InterfaceC4437p5 interfaceC4437p5) {
        Iterator it = this.f41454a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4444q5) it.next()).a(interfaceC4437p5);
        }
    }
}
