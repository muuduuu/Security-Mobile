package a1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341f {

    /* renamed from: a, reason: collision with root package name */
    private final C1340e f12542a = new C1340e();

    /* renamed from: b, reason: collision with root package name */
    private final Map f12543b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set f12544c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f12545d;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f12545d) {
            f(closeable);
            return;
        }
        synchronized (this.f12542a) {
            autoCloseable = (AutoCloseable) this.f12543b.put(key, closeable);
        }
        f(autoCloseable);
    }

    public final void e() {
        if (this.f12545d) {
            return;
        }
        this.f12545d = true;
        synchronized (this.f12542a) {
            try {
                Iterator it = this.f12543b.values().iterator();
                while (it.hasNext()) {
                    f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f12544c.iterator();
                while (it2.hasNext()) {
                    f((AutoCloseable) it2.next());
                }
                this.f12544c.clear();
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AutoCloseable g(String key) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f12542a) {
            autoCloseable = (AutoCloseable) this.f12543b.get(key);
        }
        return autoCloseable;
    }
}
