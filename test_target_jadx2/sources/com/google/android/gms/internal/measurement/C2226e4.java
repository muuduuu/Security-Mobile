package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2226e4 extends AbstractC2316o4 {
    C2226e4(C2262i4 c2262i4, String str, Long l10, boolean z10) {
        super(c2262i4, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2316o4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f24596b;
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 25 + obj2.length());
        sb2.append("Invalid long value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj2);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
