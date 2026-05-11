package u3;

import android.os.Looper;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4864a {

    /* renamed from: a, reason: collision with root package name */
    private static AbstractC4864a f43480a;

    /* renamed from: u3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0620a {
        void a();
    }

    public static synchronized AbstractC4864a b() {
        AbstractC4864a abstractC4864a;
        synchronized (AbstractC4864a.class) {
            try {
                if (f43480a == null) {
                    f43480a = new C4865b();
                }
                abstractC4864a = f43480a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC4864a;
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0620a interfaceC0620a);

    public abstract void d(InterfaceC0620a interfaceC0620a);
}
