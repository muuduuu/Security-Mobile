package s7;

import android.content.Context;
import s6.AbstractC4318d;
import s6.C4317c;
import s6.InterfaceC4321g;
import s6.InterfaceC4322h;
import s6.InterfaceC4323i;

/* loaded from: classes2.dex */
public final class D5 implements InterfaceC4444q5 {

    /* renamed from: a, reason: collision with root package name */
    private A8.b f40854a;

    /* renamed from: b, reason: collision with root package name */
    private final A8.b f40855b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4457s5 f40856c;

    public D5(Context context, AbstractC4457s5 abstractC4457s5) {
        this.f40856c = abstractC4457s5;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f23201g;
        u6.t.f(context);
        final InterfaceC4323i g10 = u6.t.c().g(aVar);
        if (aVar.a().contains(C4317c.b("json"))) {
            this.f40854a = new o8.w(new A8.b() { // from class: s7.A5
                @Override // A8.b
                public final Object get() {
                    return InterfaceC4323i.this.a("FIREBASE_ML_SDK", byte[].class, C4317c.b("json"), new InterfaceC4321g() { // from class: s7.C5
                        @Override // s6.InterfaceC4321g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f40855b = new o8.w(new A8.b() { // from class: s7.B5
            @Override // A8.b
            public final Object get() {
                return InterfaceC4323i.this.a("FIREBASE_ML_SDK", byte[].class, C4317c.b("proto"), new InterfaceC4321g() { // from class: s7.z5
                    @Override // s6.InterfaceC4321g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static AbstractC4318d b(AbstractC4457s5 abstractC4457s5, InterfaceC4437p5 interfaceC4437p5) {
        return AbstractC4318d.g(interfaceC4437p5.d(abstractC4457s5.a(), false));
    }

    @Override // s7.InterfaceC4444q5
    public final void a(InterfaceC4437p5 interfaceC4437p5) {
        if (this.f40856c.a() != 0) {
            ((InterfaceC4322h) this.f40855b.get()).a(b(this.f40856c, interfaceC4437p5));
            return;
        }
        A8.b bVar = this.f40854a;
        if (bVar != null) {
            ((InterfaceC4322h) bVar.get()).a(b(this.f40856c, interfaceC4437p5));
        }
    }
}
