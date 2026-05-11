package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2135j extends AbstractC2120e {
    C2135j(C2150o c2150o, String str, Boolean bool) {
        super(c2150o, str, bool, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.AbstractC2120e
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Boolean f(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f24034b, false));
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(this.f24034b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(valueOf) : new String("Invalid boolean value in SharedPreferences for "), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2120e
    protected final /* synthetic */ Object m(String str) {
        if (Z1.f23976c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (Z1.f23977d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f24034b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(str);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
