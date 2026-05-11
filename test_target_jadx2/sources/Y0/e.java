package y0;

import androidx.core.util.Pools$SimplePool;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class e extends Pools$SimplePool {

    /* renamed from: c, reason: collision with root package name */
    private final Object f45132c;

    public e(int i10) {
        super(i10);
        this.f45132c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, y0.d
    public boolean a(Object instance) {
        boolean a10;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f45132c) {
            a10 = super.a(instance);
        }
        return a10;
    }

    @Override // androidx.core.util.Pools$SimplePool, y0.d
    public Object b() {
        Object b10;
        synchronized (this.f45132c) {
            b10 = super.b();
        }
        return b10;
    }
}
