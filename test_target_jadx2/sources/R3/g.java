package r3;

import Z3.x;
import android.content.res.Resources;
import b3.o;
import f4.InterfaceC3146a;
import java.util.concurrent.Executor;
import u3.AbstractC4864a;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private Resources f39235a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC4864a f39236b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3146a f39237c;

    /* renamed from: d, reason: collision with root package name */
    private Executor f39238d;

    /* renamed from: e, reason: collision with root package name */
    private x f39239e;

    /* renamed from: f, reason: collision with root package name */
    private b3.f f39240f;

    /* renamed from: g, reason: collision with root package name */
    private o f39241g;

    public void a(Resources resources, AbstractC4864a abstractC4864a, InterfaceC3146a interfaceC3146a, Executor executor, x xVar, b3.f fVar, o oVar) {
        this.f39235a = resources;
        this.f39236b = abstractC4864a;
        this.f39237c = interfaceC3146a;
        this.f39238d = executor;
        this.f39239e = xVar;
        this.f39240f = fVar;
        this.f39241g = oVar;
    }

    protected d b(Resources resources, AbstractC4864a abstractC4864a, InterfaceC3146a interfaceC3146a, Executor executor, x xVar, b3.f fVar) {
        return new d(resources, abstractC4864a, interfaceC3146a, executor, xVar, fVar);
    }

    public d c() {
        d b10 = b(this.f39235a, this.f39236b, this.f39237c, this.f39238d, this.f39239e, this.f39240f);
        o oVar = this.f39241g;
        if (oVar != null) {
            b10.A0(((Boolean) oVar.get()).booleanValue());
        }
        return b10;
    }
}
