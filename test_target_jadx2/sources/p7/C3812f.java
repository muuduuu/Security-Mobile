package p7;

import T6.C1181k;

/* renamed from: p7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3812f implements U {

    /* renamed from: a, reason: collision with root package name */
    private C1181k f38425a;

    C3812f(C1181k c1181k) {
        this.f38425a = c1181k;
    }

    @Override // p7.U
    public final synchronized void b(C1181k c1181k) {
        C1181k c1181k2 = this.f38425a;
        if (c1181k2 != c1181k) {
            c1181k2.a();
            this.f38425a = c1181k;
        }
    }

    @Override // p7.U
    public final synchronized C1181k zza() {
        return this.f38425a;
    }

    @Override // p7.U
    public final void zzb() {
    }
}
