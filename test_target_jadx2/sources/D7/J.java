package D7;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1328a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f1329b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1330c;

    J() {
    }

    public final void a(I i10) {
        synchronized (this.f1328a) {
            try {
                if (this.f1329b == null) {
                    this.f1329b = new ArrayDeque();
                }
                this.f1329b.add(i10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Task task) {
        I i10;
        synchronized (this.f1328a) {
            if (this.f1329b != null && !this.f1330c) {
                this.f1330c = true;
                while (true) {
                    synchronized (this.f1328a) {
                        try {
                            i10 = (I) this.f1329b.poll();
                            if (i10 == null) {
                                this.f1330c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    i10.c(task);
                }
            }
        }
    }
}
