package p7;

import D7.C0787k;
import T6.C1181k;

/* renamed from: p7.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3836u implements T6.r, U {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3835t f38462a;

    /* renamed from: b, reason: collision with root package name */
    private C1181k f38463b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38464c = true;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3837v f38465d;

    C3836u(C3837v c3837v, C1181k c1181k, InterfaceC3835t interfaceC3835t) {
        this.f38465d = c3837v;
        this.f38463b = c1181k;
        this.f38462a = interfaceC3835t;
    }

    @Override // T6.r
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1181k.a b10;
        boolean z10;
        C3809d0 c3809d0 = (C3809d0) obj;
        C0787k c0787k = (C0787k) obj2;
        synchronized (this) {
            b10 = this.f38463b.b();
            z10 = this.f38464c;
            this.f38463b.a();
        }
        if (b10 == null) {
            c0787k.c(Boolean.FALSE);
        } else {
            this.f38462a.a(c3809d0, b10, z10, c0787k);
        }
    }

    @Override // p7.U
    public final synchronized void b(C1181k c1181k) {
        C1181k c1181k2 = this.f38463b;
        if (c1181k2 != c1181k) {
            c1181k2.a();
            this.f38463b = c1181k;
        }
    }

    @Override // p7.U
    public final synchronized C1181k zza() {
        return this.f38463b;
    }

    @Override // p7.U
    public final void zzb() {
        C1181k.a b10;
        synchronized (this) {
            this.f38464c = false;
            b10 = this.f38463b.b();
        }
        if (b10 != null) {
            this.f38465d.y(b10, 2441);
        }
    }
}
