package D1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class s implements E1.a {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f1155b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f1156c;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f1154a = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    final Object f1157d = new Object();

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final s f1158a;

        /* renamed from: b, reason: collision with root package name */
        final Runnable f1159b;

        a(s sVar, Runnable runnable) {
            this.f1158a = sVar;
            this.f1159b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1159b.run();
                synchronized (this.f1158a.f1157d) {
                    this.f1158a.a();
                }
            } catch (Throwable th) {
                synchronized (this.f1158a.f1157d) {
                    this.f1158a.a();
                    throw th;
                }
            }
        }
    }

    public s(Executor executor) {
        this.f1155b = executor;
    }

    void a() {
        Runnable runnable = (Runnable) this.f1154a.poll();
        this.f1156c = runnable;
        if (runnable != null) {
            this.f1155b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f1157d) {
            try {
                this.f1154a.add(new a(this, runnable));
                if (this.f1156c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E1.a
    public boolean o() {
        boolean z10;
        synchronized (this.f1157d) {
            z10 = !this.f1154a.isEmpty();
        }
        return z10;
    }
}
