package X8;

import D7.C0787k;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import q7.HandlerC3927a;

/* renamed from: X8.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1301g {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f11787b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C1301g f11788c;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f11789a;

    private C1301g(Looper looper) {
        this.f11789a = new HandlerC3927a(looper);
    }

    public static C1301g a() {
        C1301g c1301g;
        synchronized (f11787b) {
            try {
                if (f11788c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f11788c = new C1301g(handlerThread.getLooper());
                }
                c1301g = f11788c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1301g;
    }

    public static Executor d() {
        return t.zza;
    }

    public Task b(final Callable callable) {
        final C0787k c0787k = new C0787k();
        c(new Runnable() { // from class: X8.s
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                C0787k c0787k2 = c0787k;
                try {
                    c0787k2.c(callable2.call());
                } catch (T8.a e10) {
                    c0787k2.b(e10);
                } catch (Exception e11) {
                    c0787k2.b(new T8.a("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return c0787k.a();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
