package q7;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class K implements H {

    /* renamed from: a, reason: collision with root package name */
    final List f38775a;

    public K(Context context, J j10) {
        ArrayList arrayList = new ArrayList();
        this.f38775a = arrayList;
        if (j10.c()) {
            arrayList.add(new T(context, j10));
        }
    }
}
