package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.f4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2235f4 extends AbstractC2316o4 {
    C2235f4(C2262i4 c2262i4, String str, Boolean bool, boolean z10) {
        super(c2262i4, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2316o4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (I3.f24238c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (I3.f24239d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.f24596b;
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(str2.length() + 28 + obj2.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(obj2);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
