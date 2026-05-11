package B1;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import z1.InterfaceC5237a;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private final E1.b f422a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f423b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f424c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f425d;

    /* renamed from: e, reason: collision with root package name */
    private Object f426e;

    protected h(Context context, E1.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f422a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f423b = applicationContext;
        this.f424c = new Object();
        this.f425d = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List listenersList, h this$0) {
        Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = listenersList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5237a) it.next()).a(this$0.f426e);
        }
    }

    public final void c(InterfaceC5237a listener) {
        String str;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f424c) {
            try {
                if (this.f425d.add(listener)) {
                    if (this.f425d.size() == 1) {
                        this.f426e = e();
                        x1.n e10 = x1.n.e();
                        str = i.f427a;
                        e10.a(str, getClass().getSimpleName() + ": initial state = " + this.f426e);
                        h();
                    }
                    listener.a(this.f426e);
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final Context d() {
        return this.f423b;
    }

    public abstract Object e();

    public final void f(InterfaceC5237a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f424c) {
            try {
                if (this.f425d.remove(listener) && this.f425d.isEmpty()) {
                    i();
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f424c) {
            Object obj2 = this.f426e;
            if (obj2 == null || !Intrinsics.b(obj2, obj)) {
                this.f426e = obj;
                final List O02 = CollectionsKt.O0(this.f425d);
                this.f422a.b().execute(new Runnable() { // from class: B1.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(O02, this);
                    }
                });
                Unit unit = Unit.f36324a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
