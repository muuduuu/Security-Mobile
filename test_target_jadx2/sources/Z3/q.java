package Z3;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class q implements b3.o {

    /* renamed from: a, reason: collision with root package name */
    private static final long f12417a = TimeUnit.MINUTES.toMillis(5);

    private int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        return min < 33554432 ? 2097152 : 4194304;
    }

    @Override // b3.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        int b10 = b();
        return new y(b10, Integer.MAX_VALUE, b10, Integer.MAX_VALUE, b10 / 8, f12417a);
    }
}
