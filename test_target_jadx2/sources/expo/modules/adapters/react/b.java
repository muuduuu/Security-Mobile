package expo.modules.adapters.react;

import Ea.g;
import android.content.Context;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends Ba.c {

    /* renamed from: b, reason: collision with root package name */
    private Collection f32578b;

    /* renamed from: c, reason: collision with root package name */
    private Collection f32579c;

    public b(List list, List list2) {
        super(list);
        this.f32579c = list2;
    }

    private Collection d(Context context) {
        Collection collection = this.f32579c;
        if (collection != null) {
            return collection;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((g) it.next()).c(context));
        }
        return arrayList;
    }

    public Ba.b b(Context context) {
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        for (g gVar : a()) {
            arrayList.addAll(gVar.f(context));
            if (gVar instanceof P) {
                cVar.a((P) gVar);
            }
        }
        arrayList.add(cVar);
        return new Ba.b(arrayList, d(context));
    }

    public Collection c(ReactApplicationContext reactApplicationContext) {
        Collection collection = this.f32578b;
        if (collection != null) {
            return collection;
        }
        this.f32578b = new HashSet();
        for (g gVar : a()) {
            if (gVar instanceof P) {
                this.f32578b.addAll(((P) gVar).createViewManagers(reactApplicationContext));
            }
        }
        return this.f32578b;
    }
}
