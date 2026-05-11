package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2138k extends AbstractC2120e {
    C2138k(C2150o c2150o, String str, String str2) {
        super(c2150o, str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.AbstractC2120e
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final String f(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f24034b, null);
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(this.f24034b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(valueOf) : new String("Invalid string value in SharedPreferences for "), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2120e
    protected final /* synthetic */ Object m(String str) {
        return str;
    }
}
