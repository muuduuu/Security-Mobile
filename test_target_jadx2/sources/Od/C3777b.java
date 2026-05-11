package od;

import Gd.b;
import Kc.InterfaceC0930b;

/* renamed from: od.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3777b implements b.c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38048a;

    public C3777b(boolean z10) {
        this.f38048a = z10;
    }

    @Override // Gd.b.c
    public Iterable a(Object obj) {
        Iterable g10;
        g10 = AbstractC3778c.g(this.f38048a, (InterfaceC0930b) obj);
        return g10;
    }
}
