package Jd;

import kotlin.jvm.functions.Function1;

/* renamed from: Jd.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0913v0 extends B0 {

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f5069e;

    public C0913v0(Function1 function1) {
        this.f5069e = function1;
    }

    @Override // Jd.B0
    public boolean w() {
        return false;
    }

    @Override // Jd.B0
    public void x(Throwable th) {
        this.f5069e.invoke(th);
    }
}
