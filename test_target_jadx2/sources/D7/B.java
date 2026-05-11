package D7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class B implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1310a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1311b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private OnCompleteListener f1312c;

    public B(Executor executor, OnCompleteListener onCompleteListener) {
        this.f1310a = executor;
        this.f1312c = onCompleteListener;
    }

    @Override // D7.I
    public final void c(Task task) {
        synchronized (this.f1311b) {
            try {
                if (this.f1312c == null) {
                    return;
                }
                this.f1310a.execute(new A(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
