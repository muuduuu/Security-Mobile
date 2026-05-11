package t7;

import android.content.Context;
import s6.AbstractC4318d;
import s6.C4317c;
import s6.InterfaceC4321g;
import s6.InterfaceC4322h;
import s6.InterfaceC4323i;

/* loaded from: classes2.dex */
public final class V5 implements L5 {

    /* renamed from: a, reason: collision with root package name */
    private A8.b f42745a;

    /* renamed from: b, reason: collision with root package name */
    private final A8.b f42746b;

    /* renamed from: c, reason: collision with root package name */
    private final D5 f42747c;

    public V5(Context context, D5 d52) {
        this.f42747c = d52;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f23201g;
        u6.t.f(context);
        final InterfaceC4323i g10 = u6.t.c().g(aVar);
        if (aVar.a().contains(C4317c.b("json"))) {
            this.f42745a = new o8.w(new A8.b() { // from class: t7.T5
                @Override // A8.b
                public final Object get() {
                    return InterfaceC4323i.this.a("FIREBASE_ML_SDK", byte[].class, C4317c.b("json"), new InterfaceC4321g() { // from class: t7.R5
                        @Override // s6.InterfaceC4321g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f42746b = new o8.w(new A8.b() { // from class: t7.U5
            @Override // A8.b
            public final Object get() {
                return InterfaceC4323i.this.a("FIREBASE_ML_SDK", byte[].class, C4317c.b("proto"), new InterfaceC4321g() { // from class: t7.S5
                    @Override // s6.InterfaceC4321g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static AbstractC4318d b(D5 d52, Q5 q52) {
        int a10 = d52.a();
        return q52.a() != 0 ? AbstractC4318d.e(q52.c(a10, false)) : AbstractC4318d.g(q52.c(a10, false));
    }

    @Override // t7.L5
    public final void a(Q5 q52) {
        if (this.f42747c.a() != 0) {
            ((InterfaceC4322h) this.f42746b.get()).a(b(this.f42747c, q52));
            return;
        }
        A8.b bVar = this.f42745a;
        if (bVar != null) {
            ((InterfaceC4322h) bVar.get()).a(b(this.f42747c, q52));
        }
    }
}
