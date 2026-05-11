package Od;

import Jd.U;
import Jd.X;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class v extends Jd.J implements X {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X f7352c;

    /* renamed from: d, reason: collision with root package name */
    private final Jd.J f7353d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7354e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Jd.J j10, String str) {
        X x10 = j10 instanceof X ? (X) j10 : null;
        this.f7352c = x10 == null ? U.a() : x10;
        this.f7353d = j10;
        this.f7354e = str;
    }

    @Override // Jd.J
    public void s(CoroutineContext coroutineContext, Runnable runnable) {
        this.f7353d.s(coroutineContext, runnable);
    }

    @Override // Jd.J
    public String toString() {
        return this.f7354e;
    }

    @Override // Jd.J
    public void u(CoroutineContext coroutineContext, Runnable runnable) {
        this.f7353d.u(coroutineContext, runnable);
    }

    @Override // Jd.J
    public boolean y(CoroutineContext coroutineContext) {
        return this.f7353d.y(coroutineContext);
    }
}
