package com.google.android.gms.internal.auth;

import android.util.Log;

/* loaded from: classes2.dex */
final class F extends M {
    F(I i10, String str, Boolean bool, boolean z10) {
        super(i10, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.M
    final /* synthetic */ Object a(Object obj) {
        if (AbstractC2065l.f23729c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (AbstractC2065l.f23730d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f23627b + ": " + ((String) obj));
        return null;
    }
}
