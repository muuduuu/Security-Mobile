package T6;

import T6.C1181k;
import V6.AbstractC1287s;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: T6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1182l {

    /* renamed from: a, reason: collision with root package name */
    private final Set f9444a = Collections.newSetFromMap(new WeakHashMap());

    public static C1181k a(Object obj, Looper looper, String str) {
        AbstractC1287s.n(obj, "Listener must not be null");
        AbstractC1287s.n(looper, "Looper must not be null");
        AbstractC1287s.n(str, "Listener type must not be null");
        return new C1181k(looper, obj, str);
    }

    public static C1181k b(Object obj, Executor executor, String str) {
        AbstractC1287s.n(obj, "Listener must not be null");
        AbstractC1287s.n(executor, "Executor must not be null");
        AbstractC1287s.n(str, "Listener type must not be null");
        return new C1181k(executor, obj, str);
    }

    public static C1181k.a c(Object obj, String str) {
        AbstractC1287s.n(obj, "Listener must not be null");
        AbstractC1287s.n(str, "Listener type must not be null");
        AbstractC1287s.h(str, "Listener type must not be empty");
        return new C1181k.a(obj, str);
    }

    public final void d() {
        Iterator it = this.f9444a.iterator();
        while (it.hasNext()) {
            ((C1181k) it.next()).a();
        }
        this.f9444a.clear();
    }
}
