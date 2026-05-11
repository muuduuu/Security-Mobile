package androidx.core.os;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15967a;

    /* renamed from: b, reason: collision with root package name */
    private a f15968b;

    /* renamed from: c, reason: collision with root package name */
    private Object f15969c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15970d;

    public interface a {
        void onCancel();
    }

    private void d() {
        while (this.f15970d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f15967a) {
                    return;
                }
                this.f15967a = true;
                this.f15970d = true;
                a aVar = this.f15968b;
                Object obj = this.f15969c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f15970d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f15970d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f15969c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f15969c = cancellationSignal;
                    if (this.f15967a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f15969c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void c(a aVar) {
        synchronized (this) {
            try {
                d();
                if (this.f15968b == aVar) {
                    return;
                }
                this.f15968b = aVar;
                if (this.f15967a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }
}
