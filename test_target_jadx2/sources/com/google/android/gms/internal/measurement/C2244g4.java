package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2244g4 extends AbstractC2316o4 {
    C2244g4(C2262i4 c2262i4, String str, Double d10, boolean z10) {
        super(c2262i4, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2316o4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f24596b;
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 27 + obj2.length());
        sb2.append("Invalid double value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj2);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
