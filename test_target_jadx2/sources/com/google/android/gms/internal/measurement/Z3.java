package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes2.dex */
final class Z3 implements W3 {

    /* renamed from: d, reason: collision with root package name */
    private static Z3 f24437d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f24438a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f24439b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24440c;

    private Z3() {
        this.f24440c = false;
        this.f24438a = null;
        this.f24439b = null;
    }

    static Z3 c(Context context) {
        Z3 z32;
        synchronized (Z3.class) {
            try {
                if (f24437d == null) {
                    f24437d = androidx.core.content.e.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new Z3(context) : new Z3();
                }
                Z3 z33 = f24437d;
                if (z33 != null && z33.f24439b != null && !z33.f24440c) {
                    try {
                        context.getContentResolver().registerContentObserver(I3.f24236a, true, f24437d.f24439b);
                        ((Z3) g8.h.h(f24437d)).f24440c = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                z32 = (Z3) g8.h.h(f24437d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z32;
    }

    static synchronized void e() {
        Context context;
        synchronized (Z3.class) {
            try {
                Z3 z32 = f24437d;
                if (z32 != null && (context = z32.f24438a) != null && z32.f24439b != null && z32.f24440c) {
                    context.getContentResolver().unregisterContentObserver(f24437d.f24439b);
                }
                f24437d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.W3
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.f24438a;
        if (context != null && !O3.b(context)) {
            try {
                return (String) W3.b(new V3() { // from class: com.google.android.gms.internal.measurement.Y3
                    @Override // com.google.android.gms.internal.measurement.V3
                    public final /* synthetic */ Object zza() {
                        return Z3.this.f(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    final /* synthetic */ String f(String str) {
        return H3.a(((Context) g8.h.h(this.f24438a)).getContentResolver(), str, null);
    }

    private Z3(Context context) {
        this.f24440c = false;
        this.f24438a = context;
        this.f24439b = new X3(this, null);
    }
}
