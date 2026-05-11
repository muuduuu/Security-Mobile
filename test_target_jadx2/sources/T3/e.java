package T3;

import b3.l;
import f3.AbstractC3142a;
import java.util.List;
import p4.InterfaceC3793a;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final c f9249a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9250b;

    /* renamed from: c, reason: collision with root package name */
    private String f9251c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC3142a f9252d;

    /* renamed from: e, reason: collision with root package name */
    private List f9253e;

    e(f fVar) {
        this.f9249a = (c) l.g(fVar.e());
        this.f9250b = fVar.d();
        this.f9252d = fVar.f();
        this.f9253e = fVar.c();
        fVar.b();
        this.f9251c = fVar.g();
    }

    public static e b(c cVar) {
        return new e(cVar);
    }

    public static f f(c cVar) {
        return new f(cVar);
    }

    public synchronized void a() {
        AbstractC3142a.n(this.f9252d);
        this.f9252d = null;
        AbstractC3142a.o(this.f9253e);
        this.f9253e = null;
    }

    public InterfaceC3793a c() {
        return null;
    }

    public c d() {
        return this.f9249a;
    }

    public String e() {
        return this.f9251c;
    }

    private e(c cVar) {
        this.f9249a = (c) l.g(cVar);
        this.f9250b = 0;
    }
}
