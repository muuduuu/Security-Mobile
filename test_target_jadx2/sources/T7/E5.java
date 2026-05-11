package t7;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class E5 implements L5 {

    /* renamed from: a, reason: collision with root package name */
    final List f42483a;

    public E5(Context context, D5 d52) {
        ArrayList arrayList = new ArrayList();
        this.f42483a = arrayList;
        if (d52.c()) {
            arrayList.add(new V5(context, d52));
        }
    }

    @Override // t7.L5
    public final void a(Q5 q52) {
        Iterator it = this.f42483a.iterator();
        while (it.hasNext()) {
            ((L5) it.next()).a(q52);
        }
    }
}
