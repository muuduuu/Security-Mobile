package Qd;

import Jd.J;
import Od.AbstractC1084l;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
final class k extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final k f8343c = new k();

    private k() {
    }

    @Override // Jd.J
    public J i0(int i10, String str) {
        AbstractC1084l.a(i10);
        return i10 >= j.f8340d ? AbstractC1084l.b(this, str) : super.i0(i10, str);
    }

    @Override // Jd.J
    public void s(CoroutineContext coroutineContext, Runnable runnable) {
        c.f8327i.z0(runnable, true, false);
    }

    @Override // Jd.J
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // Jd.J
    public void u(CoroutineContext coroutineContext, Runnable runnable) {
        c.f8327i.z0(runnable, true, true);
    }
}
