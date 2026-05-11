package q7;

import android.content.Context;
import s6.C4317c;
import s6.InterfaceC4321g;
import s6.InterfaceC4323i;

/* loaded from: classes2.dex */
public final class T implements H {

    /* renamed from: a, reason: collision with root package name */
    private A8.b f38793a;

    /* renamed from: b, reason: collision with root package name */
    private final A8.b f38794b;

    /* renamed from: c, reason: collision with root package name */
    private final J f38795c;

    public T(Context context, J j10) {
        this.f38795c = j10;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f23201g;
        u6.t.f(context);
        final InterfaceC4323i g10 = u6.t.c().g(aVar);
        if (aVar.a().contains(C4317c.b("json"))) {
            this.f38793a = new o8.w(new A8.b() { // from class: q7.P
                @Override // A8.b
                public final Object get() {
                    return InterfaceC4323i.this.a("FIREBASE_ML_SDK", byte[].class, C4317c.b("json"), new InterfaceC4321g() { // from class: q7.S
                        @Override // s6.InterfaceC4321g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f38794b = new o8.w(new A8.b() { // from class: q7.Q
            @Override // A8.b
            public final Object get() {
                return InterfaceC4323i.this.a("FIREBASE_ML_SDK", byte[].class, C4317c.b("proto"), new InterfaceC4321g() { // from class: q7.O
                    @Override // s6.InterfaceC4321g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
