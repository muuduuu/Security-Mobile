package u6;

import s6.AbstractC4318d;
import s6.C4317c;
import s6.InterfaceC4321g;
import s6.InterfaceC4322h;
import s6.InterfaceC4324j;

/* loaded from: classes2.dex */
final class r implements InterfaceC4322h {

    /* renamed from: a, reason: collision with root package name */
    private final o f43569a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43570b;

    /* renamed from: c, reason: collision with root package name */
    private final C4317c f43571c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4321g f43572d;

    /* renamed from: e, reason: collision with root package name */
    private final s f43573e;

    r(o oVar, String str, C4317c c4317c, InterfaceC4321g interfaceC4321g, s sVar) {
        this.f43569a = oVar;
        this.f43570b = str;
        this.f43571c = c4317c;
        this.f43572d = interfaceC4321g;
        this.f43573e = sVar;
    }

    @Override // s6.InterfaceC4322h
    public void a(AbstractC4318d abstractC4318d) {
        d(abstractC4318d, new InterfaceC4324j() { // from class: u6.q
            @Override // s6.InterfaceC4324j
            public final void a(Exception exc) {
                r.c(exc);
            }
        });
    }

    public void d(AbstractC4318d abstractC4318d, InterfaceC4324j interfaceC4324j) {
        this.f43573e.a(n.a().e(this.f43569a).c(abstractC4318d).f(this.f43570b).d(this.f43572d).b(this.f43571c).a(), interfaceC4324j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Exception exc) {
    }
}
