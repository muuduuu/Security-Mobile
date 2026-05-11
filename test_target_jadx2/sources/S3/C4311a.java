package s3;

import O3.e;
import O3.g;
import O3.h;
import O3.i;
import O3.l;
import android.graphics.Rect;
import android.support.v4.media.session.b;
import b3.o;
import i3.InterfaceC3317b;
import i4.c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r3.d;
import t3.C4618a;
import t3.C4619b;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4311a implements h {

    /* renamed from: a, reason: collision with root package name */
    private final d f40762a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3317b f40763b;

    /* renamed from: c, reason: collision with root package name */
    private final i f40764c = new i();

    /* renamed from: d, reason: collision with root package name */
    private final o f40765d;

    /* renamed from: e, reason: collision with root package name */
    private C4619b f40766e;

    /* renamed from: f, reason: collision with root package name */
    private C4618a f40767f;

    /* renamed from: g, reason: collision with root package name */
    private c f40768g;

    /* renamed from: h, reason: collision with root package name */
    private List f40769h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f40770i;

    public C4311a(InterfaceC3317b interfaceC3317b, d dVar, o oVar) {
        this.f40763b = interfaceC3317b;
        this.f40762a = dVar;
        this.f40765d = oVar;
    }

    private void h() {
        if (this.f40767f == null) {
            this.f40767f = new C4618a(this.f40763b, this.f40764c, this, this.f40765d);
        }
        if (this.f40766e == null) {
            this.f40766e = new C4619b(this.f40763b, this.f40764c);
        }
        if (this.f40768g == null) {
            this.f40768g = new c(this.f40766e);
        }
    }

    @Override // O3.h
    public void a(i iVar, l lVar) {
        List list;
        if (!this.f40770i || (list = this.f40769h) == null || list.isEmpty()) {
            return;
        }
        iVar.y();
        Iterator it = this.f40769h.iterator();
        if (it.hasNext()) {
            b.a(it.next());
            throw null;
        }
    }

    @Override // O3.h
    public void b(i iVar, e eVar) {
        List list;
        iVar.n(eVar);
        if (!this.f40770i || (list = this.f40769h) == null || list.isEmpty()) {
            return;
        }
        if (eVar == e.SUCCESS) {
            d();
        }
        iVar.y();
        Iterator it = this.f40769h.iterator();
        if (it.hasNext()) {
            b.a(it.next());
            throw null;
        }
    }

    public void c(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f40769h == null) {
            this.f40769h = new CopyOnWriteArrayList();
        }
        this.f40769h.add(gVar);
    }

    public void d() {
        B3.b c10 = this.f40762a.c();
        if (c10 == null || c10.e() == null) {
            return;
        }
        Rect bounds = c10.e().getBounds();
        this.f40764c.t(bounds.width());
        this.f40764c.s(bounds.height());
    }

    public void e() {
        List list = this.f40769h;
        if (list != null) {
            list.clear();
        }
    }

    public void f() {
        e();
        g(false);
        this.f40764c.b();
    }

    public void g(boolean z10) {
        this.f40770i = z10;
        if (!z10) {
            C4618a c4618a = this.f40767f;
            if (c4618a != null) {
                this.f40762a.T(c4618a);
            }
            c cVar = this.f40768g;
            if (cVar != null) {
                this.f40762a.y0(cVar);
                return;
            }
            return;
        }
        h();
        C4618a c4618a2 = this.f40767f;
        if (c4618a2 != null) {
            this.f40762a.l(c4618a2);
        }
        c cVar2 = this.f40768g;
        if (cVar2 != null) {
            this.f40762a.j0(cVar2);
        }
    }
}
