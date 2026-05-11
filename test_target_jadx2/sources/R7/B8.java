package r7;

import android.content.Context;
import s6.AbstractC4318d;
import s6.C4317c;
import s6.InterfaceC4321g;
import s6.InterfaceC4322h;
import s6.InterfaceC4323i;

/* loaded from: classes2.dex */
public final class B8 implements InterfaceC4118i8 {

    /* renamed from: a, reason: collision with root package name */
    private A8.b f39296a;

    /* renamed from: b, reason: collision with root package name */
    private final A8.b f39297b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4138k8 f39298c;

    public B8(Context context, AbstractC4138k8 abstractC4138k8) {
        this.f39298c = abstractC4138k8;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f23201g;
        u6.t.f(context);
        final InterfaceC4323i g10 = u6.t.c().g(aVar);
        if (aVar.a().contains(C4317c.b("json"))) {
            this.f39296a = new o8.w(new A8.b() { // from class: r7.y8
                @Override // A8.b
                public final Object get() {
                    return InterfaceC4323i.this.a("FIREBASE_ML_SDK", byte[].class, C4317c.b("json"), new InterfaceC4321g() { // from class: r7.A8
                        @Override // s6.InterfaceC4321g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f39297b = new o8.w(new A8.b() { // from class: r7.z8
            @Override // A8.b
            public final Object get() {
                return InterfaceC4323i.this.a("FIREBASE_ML_SDK", byte[].class, C4317c.b("proto"), new InterfaceC4321g() { // from class: r7.x8
                    @Override // s6.InterfaceC4321g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static AbstractC4318d b(AbstractC4138k8 abstractC4138k8, InterfaceC4108h8 interfaceC4108h8) {
        int a10 = abstractC4138k8.a();
        return interfaceC4108h8.zza() != 0 ? AbstractC4318d.e(interfaceC4108h8.b(a10, false)) : AbstractC4318d.g(interfaceC4108h8.b(a10, false));
    }

    @Override // r7.InterfaceC4118i8
    public final void a(InterfaceC4108h8 interfaceC4108h8) {
        if (this.f39298c.a() != 0) {
            ((InterfaceC4322h) this.f39297b.get()).a(b(this.f39298c, interfaceC4108h8));
            return;
        }
        A8.b bVar = this.f39296a;
        if (bVar != null) {
            ((InterfaceC4322h) bVar.get()).a(b(this.f39298c, interfaceC4108h8));
        }
    }
}
