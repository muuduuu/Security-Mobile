package Ld;

import Jd.AbstractC0871a;
import Jd.C0;
import Jd.C0917x0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class h extends AbstractC0871a implements g {

    /* renamed from: d, reason: collision with root package name */
    private final g f5804d;

    public h(CoroutineContext coroutineContext, g gVar, boolean z10, boolean z11) {
        super(coroutineContext, z10, z11);
        this.f5804d = gVar;
    }

    @Override // Ld.x
    public Object B(Object obj) {
        return this.f5804d.B(obj);
    }

    @Override // Ld.x
    public Object D(Object obj, kotlin.coroutines.d dVar) {
        return this.f5804d.D(obj, dVar);
    }

    @Override // Ld.x
    public boolean E() {
        return this.f5804d.E();
    }

    @Override // Jd.C0
    public void U(Throwable th) {
        CancellationException K02 = C0.K0(this, th, null, 1, null);
        this.f5804d.d(K02);
        S(K02);
    }

    protected final g W0() {
        return this.f5804d;
    }

    @Override // Jd.C0, Jd.InterfaceC0915w0
    public final void d(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0917x0(X(), null, this);
        }
        U(cancellationException);
    }

    @Override // Ld.w
    public Object e() {
        return this.f5804d.e();
    }

    @Override // Ld.w
    public i iterator() {
        return this.f5804d.iterator();
    }

    @Override // Ld.w
    public Object k(kotlin.coroutines.d dVar) {
        Object k10 = this.f5804d.k(dVar);
        AbstractC3868b.e();
        return k10;
    }

    @Override // Ld.w
    public Object m(kotlin.coroutines.d dVar) {
        return this.f5804d.m(dVar);
    }

    @Override // Ld.x
    public boolean v(Throwable th) {
        return this.f5804d.v(th);
    }

    @Override // Ld.x
    public void w(Function1 function1) {
        this.f5804d.w(function1);
    }

    public final g V0() {
        return this;
    }
}
