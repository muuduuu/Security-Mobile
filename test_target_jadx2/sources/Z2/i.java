package Z2;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class i extends e {

    /* renamed from: b, reason: collision with root package name */
    private static i f12363b;

    private i() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static i h() {
        if (f12363b == null) {
            f12363b = new i();
        }
        return f12363b;
    }

    @Override // Z2.e, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
