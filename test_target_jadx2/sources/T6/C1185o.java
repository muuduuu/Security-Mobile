package T6;

import S6.k;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* renamed from: T6.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1185o extends S6.j {

    /* renamed from: a, reason: collision with root package name */
    private final BasePendingResult f9455a;

    public C1185o(S6.k kVar) {
        this.f9455a = (BasePendingResult) kVar;
    }

    @Override // S6.k
    public final void c(k.a aVar) {
        this.f9455a.c(aVar);
    }

    @Override // S6.k
    public final S6.o d(long j10, TimeUnit timeUnit) {
        return this.f9455a.d(j10, timeUnit);
    }

    @Override // S6.k
    public final void e(S6.p pVar) {
        this.f9455a.e(pVar);
    }
}
