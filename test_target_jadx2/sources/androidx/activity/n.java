package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12980a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f12981b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Function0 f12982c;

    public n(boolean z10) {
        this.f12980a = z10;
    }

    public final void a(a cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f12981b.add(cancellable);
    }

    public abstract void b();

    public final boolean c() {
        return this.f12980a;
    }

    public final void d() {
        Iterator it = this.f12981b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).cancel();
        }
    }

    public final void e(a cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f12981b.remove(cancellable);
    }

    public final void f(boolean z10) {
        this.f12980a = z10;
        Function0 function0 = this.f12982c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void g(Function0 function0) {
        this.f12982c = function0;
    }
}
