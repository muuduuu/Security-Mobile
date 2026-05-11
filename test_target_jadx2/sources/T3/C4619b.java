package t3;

import O3.i;
import i3.InterfaceC3317b;
import i4.AbstractC3320a;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4619b extends AbstractC3320a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3317b f42301a;

    /* renamed from: b, reason: collision with root package name */
    private final i f42302b;

    public C4619b(InterfaceC3317b interfaceC3317b, i iVar) {
        this.f42301a = interfaceC3317b;
        this.f42302b = iVar;
    }

    @Override // i4.e
    public void a(m4.b bVar, String str, boolean z10) {
        this.f42302b.p(this.f42301a.now());
        this.f42302b.o(bVar);
        this.f42302b.v(str);
        this.f42302b.u(z10);
    }

    @Override // i4.e
    public void c(m4.b bVar, String str, Throwable th, boolean z10) {
        this.f42302b.p(this.f42301a.now());
        this.f42302b.o(bVar);
        this.f42302b.v(str);
        this.f42302b.u(z10);
    }

    @Override // i4.e
    public void j(m4.b bVar, Object obj, String str, boolean z10) {
        this.f42302b.q(this.f42301a.now());
        this.f42302b.o(bVar);
        this.f42302b.d(obj);
        this.f42302b.v(str);
        this.f42302b.u(z10);
    }

    @Override // i4.e
    public void k(String str) {
        this.f42302b.p(this.f42301a.now());
        this.f42302b.v(str);
    }
}
