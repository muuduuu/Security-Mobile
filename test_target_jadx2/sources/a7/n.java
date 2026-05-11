package a7;

import D7.AbstractC0789m;
import D7.C0787k;
import S6.a;
import S6.g;
import T6.AbstractC1191v;
import T6.r;
import V6.AbstractC1287s;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class n extends S6.g implements Z6.d {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f12642k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0172a f12643l;

    /* renamed from: m, reason: collision with root package name */
    private static final S6.a f12644m;

    static {
        a.g gVar = new a.g();
        f12642k = gVar;
        k kVar = new k();
        f12643l = kVar;
        f12644m = new S6.a("ModuleInstall.API", kVar, gVar);
    }

    public n(Context context) {
        super(context, f12644m, a.d.f8818Q, g.a.f8847c);
    }

    static final C1361a M(boolean z10, S6.i... iVarArr) {
        AbstractC1287s.n(iVarArr, "Requested APIs must not be null.");
        AbstractC1287s.b(iVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (S6.i iVar : iVarArr) {
            AbstractC1287s.n(iVar, "Requested API must not be null.");
        }
        return C1361a.F(Arrays.asList(iVarArr), z10);
    }

    @Override // Z6.d
    public final Task i(S6.i... iVarArr) {
        final C1361a M10 = M(false, iVarArr);
        if (M10.u().isEmpty()) {
            return AbstractC0789m.g(new Z6.b(true, 0));
        }
        AbstractC1191v.a a10 = AbstractC1191v.a();
        a10.d(l7.m.f37107a);
        a10.e(27301);
        a10.c(false);
        a10.b(new r() { // from class: a7.i
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                ((g) ((o) obj).I()).n1(new l(n.this, (C0787k) obj2), M10);
            }
        });
        return w(a10.a());
    }

    @Override // Z6.d
    public final Task o(Z6.f fVar) {
        final C1361a j10 = C1361a.j(fVar);
        fVar.b();
        fVar.c();
        if (j10.u().isEmpty()) {
            return AbstractC0789m.g(new Z6.g(0));
        }
        AbstractC1191v.a a10 = AbstractC1191v.a();
        a10.d(l7.m.f37107a);
        a10.c(true);
        a10.e(27304);
        a10.b(new r() { // from class: a7.j
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                ((g) ((o) obj).I()).o1(new m(n.this, (C0787k) obj2), j10, null);
            }
        });
        return w(a10.a());
    }
}
