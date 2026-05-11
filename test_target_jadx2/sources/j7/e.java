package j7;

import D7.C0787k;
import S6.a;
import S6.g;
import T6.AbstractC1191v;
import V6.AbstractC1287s;
import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class e extends S6.g implements K6.c {

    /* renamed from: l, reason: collision with root package name */
    private static final a.g f35855l;

    /* renamed from: m, reason: collision with root package name */
    private static final a.AbstractC0172a f35856m;

    /* renamed from: n, reason: collision with root package name */
    private static final S6.a f35857n;

    /* renamed from: k, reason: collision with root package name */
    private final String f35858k;

    static {
        a.g gVar = new a.g();
        f35855l = gVar;
        C3505b c3505b = new C3505b();
        f35856m = c3505b;
        f35857n = new S6.a("Auth.Api.Identity.SignIn.API", c3505b, gVar);
    }

    public e(Activity activity, K6.e eVar) {
        super(activity, f35857n, (a.d) eVar, g.a.f8847c);
        this.f35858k = h.a();
    }

    final /* synthetic */ void M(K6.a aVar, f fVar, C0787k c0787k) {
        BinderC3506c binderC3506c = new BinderC3506c(this, c0787k);
        ((t) fVar.I()).l1(binderC3506c, aVar, this.f35858k, m.a(fVar.D()));
    }

    @Override // K6.c
    public final String k(Intent intent) {
        if (intent == null) {
            throw new S6.b(Status.f23341h);
        }
        Status status = (Status) W6.e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new S6.b(Status.f23343j);
        }
        if (!status.Z0()) {
            throw new S6.b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new S6.b(Status.f23341h);
    }

    @Override // K6.c
    public final Task m(final K6.a aVar) {
        AbstractC1287s.m(aVar);
        return w(AbstractC1191v.a().d(g.f35868i).b(new T6.r() { // from class: j7.d
            @Override // T6.r
            public final /* synthetic */ void a(Object obj, Object obj2) {
                e.this.M(aVar, (f) obj, (C0787k) obj2);
            }
        }).e(1653).a());
    }
}
