package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2369u4 implements H5 {
    protected int zza = 0;

    protected static void f(Iterable iterable, List list) {
        AbstractC2360t4.m(iterable, list);
    }

    public final byte[] c() {
        try {
            int a10 = a();
            byte[] bArr = new byte[a10];
            int i10 = O4.f24319d;
            M4 m42 = new M4(bArr, 0, a10);
            d(m42);
            m42.e();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    abstract int e(S5 s52);
}
