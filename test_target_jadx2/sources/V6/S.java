package V6;

import D7.C0787k;
import S6.k;
import V6.r;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class S implements k.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S6.k f10871a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0787k f10872b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r.a f10873c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ U f10874d;

    S(S6.k kVar, C0787k c0787k, r.a aVar, U u10) {
        this.f10871a = kVar;
        this.f10872b = c0787k;
        this.f10873c = aVar;
        this.f10874d = u10;
    }

    @Override // S6.k.a
    public final void a(Status status) {
        if (!status.Z0()) {
            this.f10872b.b(AbstractC1265b.a(status));
        } else {
            this.f10872b.c(this.f10873c.a(this.f10871a.d(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
