package Z3;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class o implements b3.o {

    /* renamed from: b, reason: collision with root package name */
    private static final long f12414b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    private final ActivityManager f12415a;

    public o(ActivityManager activityManager) {
        this.f12415a = activityManager;
    }

    private int b() {
        int min = Math.min(this.f12415a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        return min / 4;
    }

    @Override // b3.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        return new y(b(), PSKKeyManager.MAX_KEY_LENGTH_BYTES, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, f12414b);
    }
}
