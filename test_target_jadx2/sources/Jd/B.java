package Jd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public class B {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4973b = AtomicIntegerFieldUpdater.newUpdater(B.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4974a;

    public B(Throwable th, boolean z10) {
        this.f4974a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f4973b.get(this) != 0;
    }

    public final boolean c() {
        return f4973b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return S.a(this) + '[' + this.f4974a + ']';
    }

    public /* synthetic */ B(Throwable th, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
