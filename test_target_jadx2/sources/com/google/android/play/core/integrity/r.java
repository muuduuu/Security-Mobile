package com.google.android.play.core.integrity;

import android.os.Bundle;
import co.hyperverge.hypersnapsdk.utils.AppConstants;

/* loaded from: classes2.dex */
public final class r implements s {
    r() {
    }

    @Override // com.google.android.play.core.integrity.s
    public final S6.b a(Bundle bundle) {
        int i10 = bundle.getInt(AppConstants.VIDEO_RECORDING_ERROR);
        if (i10 == 0) {
            return null;
        }
        return new a(i10, null);
    }
}
