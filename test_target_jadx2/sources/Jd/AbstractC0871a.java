package Jd;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: Jd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0871a extends C0 implements InterfaceC0915w0, kotlin.coroutines.d, N {

    /* renamed from: c, reason: collision with root package name */
    private final CoroutineContext f5022c;

    public AbstractC0871a(CoroutineContext coroutineContext, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            q0((InterfaceC0915w0) coroutineContext.a(InterfaceC0915w0.f5070O));
        }
        this.f5022c = coroutineContext.l(this);
    }

    @Override // Jd.C0
    protected final void B0(Object obj) {
        if (!(obj instanceof B)) {
            T0(obj);
        } else {
            B b10 = (B) obj;
            S0(b10.f4974a, b10.a());
        }
    }

    protected void R0(Object obj) {
        O(obj);
    }

    public final void U0(P p10, Object obj, Function2 function2) {
        p10.invoke(function2, obj, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Jd.C0
    public String X() {
        return S.a(this) + " was cancelled";
    }

    @Override // Jd.C0, Jd.InterfaceC0915w0
    public boolean b() {
        return super.b();
    }

    @Override // kotlin.coroutines.d
    public final CoroutineContext getContext() {
        return this.f5022c;
    }

    @Override // Jd.C0
    public final void p0(Throwable th) {
        L.a(this.f5022c, th);
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(Object obj) {
        Object v02 = v0(D.b(obj));
        if (v02 == D0.f4988b) {
            return;
        }
        R0(v02);
    }

    @Override // Jd.C0
    public String w0() {
        String g10 = H.g(this.f5022c);
        if (g10 == null) {
            return super.w0();
        }
        return '\"' + g10 + "\":" + super.w0();
    }

    @Override // Jd.N
    public CoroutineContext y() {
        return this.f5022c;
    }

    protected void T0(Object obj) {
    }

    protected void S0(Throwable th, boolean z10) {
    }
}
