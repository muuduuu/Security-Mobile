package D7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f1308a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B f1309b;

    A(B b10, Task task) {
        this.f1309b = b10;
        this.f1308a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCompleteListener onCompleteListener;
        OnCompleteListener onCompleteListener2;
        obj = this.f1309b.f1311b;
        synchronized (obj) {
            try {
                B b10 = this.f1309b;
                onCompleteListener = b10.f1312c;
                if (onCompleteListener != null) {
                    onCompleteListener2 = b10.f1312c;
                    onCompleteListener2.onComplete(this.f1308a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
