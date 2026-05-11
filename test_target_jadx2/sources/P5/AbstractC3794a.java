package p5;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3794a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC3795b f38325a;

    public static void a(InterfaceC3795b interfaceC3795b) {
        synchronized (AbstractC3794a.class) {
            try {
                if (f38325a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f38325a = interfaceC3795b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(InterfaceC3795b interfaceC3795b) {
        if (c()) {
            return;
        }
        a(interfaceC3795b);
    }

    public static boolean c() {
        boolean z10;
        synchronized (AbstractC3794a.class) {
            z10 = f38325a != null;
        }
        return z10;
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i10) {
        InterfaceC3795b interfaceC3795b;
        synchronized (AbstractC3794a.class) {
            interfaceC3795b = f38325a;
            if (interfaceC3795b == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return interfaceC3795b.a(str, i10);
    }
}
