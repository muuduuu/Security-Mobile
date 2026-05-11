package X6;

import D7.C0787k;
import S6.a;
import S6.g;
import T6.AbstractC1191v;
import T6.r;
import V6.C1291w;
import V6.C1294z;
import V6.InterfaceC1293y;
import android.content.Context;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class d extends g implements InterfaceC1293y {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f11754k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0172a f11755l;

    /* renamed from: m, reason: collision with root package name */
    private static final S6.a f11756m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f11757n = 0;

    static {
        a.g gVar = new a.g();
        f11754k = gVar;
        c cVar = new c();
        f11755l = cVar;
        f11756m = new S6.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C1294z c1294z) {
        super(context, f11756m, c1294z, g.a.f8847c);
    }

    @Override // V6.InterfaceC1293y
    public final Task h(final C1291w c1291w) {
        AbstractC1191v.a a10 = AbstractC1191v.a();
        a10.d(l7.d.f37101a);
        a10.c(false);
        a10.b(new r() { // from class: X6.b
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                int i10 = d.f11757n;
                ((a) ((e) obj).I()).n1(C1291w.this);
                ((C0787k) obj2).c(null);
            }
        });
        return u(a10.a());
    }
}
