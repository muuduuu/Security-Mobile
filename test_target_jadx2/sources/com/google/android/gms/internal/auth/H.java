package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
final class H extends M {

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ O1 f23602l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(I i10, String str, Object obj, boolean z10, O1 o12) {
        super(i10, "getTokenRefactor__blocked_packages", obj, true, null);
        this.f23602l = o12;
    }

    @Override // com.google.android.gms.internal.auth.M
    final Object a(Object obj) {
        try {
            return I1.r(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + this.f23627b + ": " + ((String) obj));
            return null;
        }
    }
}
