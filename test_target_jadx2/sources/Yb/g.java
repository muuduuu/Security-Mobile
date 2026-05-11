package Yb;

import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f12175a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private Object f12176b;

    private final void a(Ea.c cVar) {
        this.f12175a.add(cVar);
    }

    private final void d() {
        if (this.f12176b == null) {
            return;
        }
        Ea.c cVar = (Ea.c) this.f12175a.poll();
        while (cVar != null) {
            cVar.apply(this.f12176b);
            cVar = (Ea.c) this.f12175a.poll();
        }
    }

    public final void b() {
        this.f12176b = null;
        this.f12175a.clear();
    }

    public final void c(Ea.c action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Object obj = this.f12176b;
        if (obj != null) {
            action.apply(obj);
        } else {
            a(action);
        }
    }

    public final boolean e() {
        return this.f12176b != null;
    }

    public final void f(Object obj) {
        this.f12176b = obj;
        d();
    }
}
