package S6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
final class u extends BasePendingResult {

    /* renamed from: p, reason: collision with root package name */
    private final o f8873p;

    public u(h hVar, o oVar) {
        super(hVar);
        this.f8873p = oVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final o g(Status status) {
        return this.f8873p;
    }
}
