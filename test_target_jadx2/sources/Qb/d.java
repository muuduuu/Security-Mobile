package qb;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements InterfaceC3956a {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f38882a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f38883b = new WeakReference(null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(e listener, androidx.appcompat.app.d activity) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        listener.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(d this$0, androidx.appcompat.app.d activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Iterator it = this$0.f38882a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(activity);
        }
    }

    @Override // qb.InterfaceC3956a
    public void b(e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f38882a.remove(listener);
    }

    @Override // qb.InterfaceC3956a
    public void c(final e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f38882a.add(listener);
        final androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.f38883b.get();
        if (dVar != null) {
            dVar.runOnUiThread(new Runnable() { // from class: qb.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.e(e.this, dVar);
                }
            });
        }
    }

    public final void f(final androidx.appcompat.app.d activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f38883b = new WeakReference(activity);
        activity.runOnUiThread(new Runnable() { // from class: qb.c
            @Override // java.lang.Runnable
            public final void run() {
                d.g(d.this, activity);
            }
        });
    }
}
