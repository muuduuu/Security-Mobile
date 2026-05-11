package com.google.android.gms.internal.auth;

import android.util.Log;

/* loaded from: classes2.dex */
final class E extends M {
    E(I i10, String str, Long l10, boolean z10) {
        super(i10, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.M
    final /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + this.f23627b + ": " + ((String) obj));
            return null;
        }
    }
}
