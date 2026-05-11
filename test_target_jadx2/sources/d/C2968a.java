package d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2968a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f31187a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f31188b;

    public final void a(InterfaceC2969b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f31188b;
        if (context != null) {
            listener.a(context);
        }
        this.f31187a.add(listener);
    }

    public final void b() {
        this.f31188b = null;
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31188b = context;
        Iterator it = this.f31187a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2969b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f31188b;
    }

    public final void e(InterfaceC2969b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31187a.remove(listener);
    }
}
