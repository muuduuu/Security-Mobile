package D2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f1187a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f1188b = new b();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.v(runnable);
        }
    }

    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f1188b;
    }

    public static Executor b() {
        return f1187a;
    }
}
