package S6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
final class v extends BasePendingResult {
    public v(h hVar) {
        super(hVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final o g(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
