package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes2.dex */
interface W3 {
    static Object b(V3 v32) {
        try {
            return v32.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return v32.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    Object a(String str);
}
