package m;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3634e {
    public abstract void a(Runnable runnable);

    public void b(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(Runnable runnable);
}
