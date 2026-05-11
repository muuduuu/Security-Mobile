package u6;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import s6.C4317c;
import s6.InterfaceC4323i;
import s6.InterfaceC4324j;

/* loaded from: classes2.dex */
public class t implements s {

    /* renamed from: e, reason: collision with root package name */
    private static volatile u f43574e;

    /* renamed from: a, reason: collision with root package name */
    private final E6.a f43575a;

    /* renamed from: b, reason: collision with root package name */
    private final E6.a f43576b;

    /* renamed from: c, reason: collision with root package name */
    private final A6.e f43577c;

    /* renamed from: d, reason: collision with root package name */
    private final B6.r f43578d;

    t(E6.a aVar, E6.a aVar2, A6.e eVar, B6.r rVar, B6.v vVar) {
        this.f43575a = aVar;
        this.f43576b = aVar2;
        this.f43577c = eVar;
        this.f43578d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f43575a.a()).k(this.f43576b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f43574e;
        if (uVar != null) {
            return uVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(C4317c.b("proto"));
    }

    public static void f(Context context) {
        if (f43574e == null) {
            synchronized (t.class) {
                try {
                    if (f43574e == null) {
                        f43574e = e.c().a(context).c();
                    }
                } finally {
                }
            }
        }
    }

    @Override // u6.s
    public void a(n nVar, InterfaceC4324j interfaceC4324j) {
        this.f43577c.a(nVar.f().f(nVar.c().c()), b(nVar), interfaceC4324j);
    }

    public B6.r e() {
        return this.f43578d;
    }

    public InterfaceC4323i g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
