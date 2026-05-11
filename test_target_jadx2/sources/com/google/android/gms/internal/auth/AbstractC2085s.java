package com.google.android.gms.internal.auth;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.auth.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2085s {
    public static Object a(InterfaceC2088t interfaceC2088t) {
        try {
            return interfaceC2088t.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC2088t.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
