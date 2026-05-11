package be;

import Td.D;
import Td.F;
import Td.InterfaceC1229e;
import Td.InterfaceC1234j;
import Td.x;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements x.a {

    /* renamed from: a, reason: collision with root package name */
    private final ae.k f19059a;

    /* renamed from: b, reason: collision with root package name */
    private final List f19060b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19061c;

    /* renamed from: d, reason: collision with root package name */
    private final ae.e f19062d;

    /* renamed from: e, reason: collision with root package name */
    private final D f19063e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19064f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19065g;

    /* renamed from: h, reason: collision with root package name */
    private final int f19066h;

    /* renamed from: i, reason: collision with root package name */
    private int f19067i;

    public g(ae.k call, List interceptors, int i10, ae.e eVar, D request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f19059a = call;
        this.f19060b = interceptors;
        this.f19061c = i10;
        this.f19062d = eVar;
        this.f19063e = request;
        this.f19064f = i11;
        this.f19065g = i12;
        this.f19066h = i13;
    }

    public static /* synthetic */ g d(g gVar, int i10, ae.e eVar, D d10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f19061c;
        }
        if ((i14 & 2) != 0) {
            eVar = gVar.f19062d;
        }
        ae.e eVar2 = eVar;
        if ((i14 & 4) != 0) {
            d10 = gVar.f19063e;
        }
        D d11 = d10;
        if ((i14 & 8) != 0) {
            i11 = gVar.f19064f;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.f19065g;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.f19066h;
        }
        return gVar.c(i10, eVar2, d11, i15, i16, i13);
    }

    @Override // Td.x.a
    public F a(D request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f19061c >= this.f19060b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f19067i++;
        ae.e eVar = this.f19062d;
        if (eVar != null) {
            if (!eVar.j().b().c(request.n())) {
                throw new IllegalStateException(("network interceptor " + this.f19060b.get(this.f19061c - 1) + " must retain the same host and port").toString());
            }
            if (this.f19067i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f19060b.get(this.f19061c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g d10 = d(this, this.f19061c + 1, null, request, 0, 0, 0, 58, null);
        x xVar = (x) this.f19060b.get(this.f19061c);
        F intercept = xVar.intercept(d10);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + xVar + " returned null");
        }
        if (this.f19062d == null || this.f19061c + 1 >= this.f19060b.size() || d10.f19067i == 1) {
            return intercept;
        }
        throw new IllegalStateException(("network interceptor " + xVar + " must call proceed() exactly once").toString());
    }

    @Override // Td.x.a
    public InterfaceC1234j b() {
        ae.e eVar = this.f19062d;
        if (eVar != null) {
            return eVar.h();
        }
        return null;
    }

    public final g c(int i10, ae.e eVar, D request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new g(this.f19059a, this.f19060b, i10, eVar, request, i11, i12, i13);
    }

    @Override // Td.x.a
    public InterfaceC1229e call() {
        return this.f19059a;
    }

    public final ae.k e() {
        return this.f19059a;
    }

    public final int f() {
        return this.f19064f;
    }

    public final ae.e g() {
        return this.f19062d;
    }

    public final int h() {
        return this.f19065g;
    }

    public final D i() {
        return this.f19063e;
    }

    public final int j() {
        return this.f19066h;
    }

    public int k() {
        return this.f19065g;
    }

    @Override // Td.x.a
    public D t() {
        return this.f19063e;
    }
}
