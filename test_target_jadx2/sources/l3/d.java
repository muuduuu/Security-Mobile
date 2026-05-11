package L3;

import I3.j;
import K3.f;
import T3.e;
import Z3.n;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b3.l;
import b3.o;
import b3.p;
import f4.InterfaceC3146a;
import g4.C3188c;
import g4.InterfaceC3190e;
import i3.InterfaceC3317b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class d implements InterfaceC3146a {

    /* renamed from: a, reason: collision with root package name */
    private final V3.b f5681a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f5682b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f5683c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3317b f5684d;

    /* renamed from: e, reason: collision with root package name */
    private final Y3.d f5685e;

    /* renamed from: f, reason: collision with root package name */
    private final n f5686f;

    /* renamed from: g, reason: collision with root package name */
    private final o f5687g;

    /* renamed from: h, reason: collision with root package name */
    private final o f5688h;

    /* renamed from: i, reason: collision with root package name */
    private final o f5689i;

    /* renamed from: j, reason: collision with root package name */
    private final o f5690j;

    /* renamed from: k, reason: collision with root package name */
    private final o f5691k;

    /* renamed from: l, reason: collision with root package name */
    private final o f5692l;

    /* renamed from: m, reason: collision with root package name */
    private final o f5693m = p.f18551b;

    public d(V3.b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, InterfaceC3317b interfaceC3317b, Y3.d dVar, n nVar, o oVar, o oVar2, o oVar3, o oVar4, o oVar5, o oVar6) {
        this.f5681a = bVar;
        this.f5682b = scheduledExecutorService;
        this.f5683c = executorService;
        this.f5684d = interfaceC3317b;
        this.f5685e = dVar;
        this.f5686f = nVar;
        this.f5687g = oVar;
        this.f5688h = oVar2;
        this.f5689i = oVar3;
        this.f5690j = oVar4;
        this.f5692l = oVar6;
        this.f5691k = oVar5;
    }

    private T3.a c(e eVar) {
        T3.c d10 = eVar.d();
        return this.f5681a.a(eVar, new Rect(0, 0, d10.getWidth(), d10.getHeight()));
    }

    private V3.c d(e eVar) {
        return new V3.c(new F3.a(eVar.hashCode(), ((Boolean) this.f5689i.get()).booleanValue()), this.f5686f);
    }

    private D3.a e(e eVar, Bitmap.Config config, P3.c cVar) {
        G3.d dVar;
        G3.b bVar;
        T3.a c10 = c(eVar);
        J3.a aVar = new J3.a(c10);
        E3.b f10 = f(eVar);
        J3.b bVar2 = new J3.b(f10, c10, ((Boolean) this.f5690j.get()).booleanValue());
        int intValue = ((Integer) this.f5688h.get()).intValue();
        if (intValue > 0) {
            dVar = new G3.d(intValue);
            bVar = g(bVar2, config);
        } else {
            dVar = null;
            bVar = null;
        }
        return D3.c.s(new E3.a(this.f5685e, f10, aVar, bVar2, ((Boolean) this.f5690j.get()).booleanValue(), ((Boolean) this.f5690j.get()).booleanValue() ? new G3.e(eVar.e(), aVar, bVar2, new j(this.f5685e, ((Integer) this.f5692l.get()).intValue()), ((Boolean) this.f5691k.get()).booleanValue()) : dVar, bVar, null), this.f5684d, this.f5682b);
    }

    private E3.b f(e eVar) {
        int intValue = ((Integer) this.f5687g.get()).intValue();
        return intValue != 1 ? intValue != 2 ? intValue != 3 ? new F3.d() : new F3.c() : new F3.b(d(eVar), false) : new F3.b(d(eVar), true);
    }

    private G3.b g(E3.c cVar, Bitmap.Config config) {
        Y3.d dVar = this.f5685e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new G3.c(dVar, cVar, config, this.f5683c);
    }

    @Override // f4.InterfaceC3146a
    public Drawable a(InterfaceC3190e interfaceC3190e) {
        C3188c c3188c = (C3188c) interfaceC3190e;
        T3.c s10 = c3188c.s();
        D3.a e10 = e((e) l.g(c3188c.t()), s10 != null ? s10.N() : null, null);
        return ((Boolean) this.f5693m.get()).booleanValue() ? new f(e10) : new K3.b(e10);
    }

    @Override // f4.InterfaceC3146a
    public boolean b(InterfaceC3190e interfaceC3190e) {
        return interfaceC3190e instanceof C3188c;
    }
}
