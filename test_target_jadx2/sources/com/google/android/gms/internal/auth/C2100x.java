package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.auth.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2100x implements InterfaceC2091u {

    /* renamed from: c, reason: collision with root package name */
    private static C2100x f23785c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f23786a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f23787b;

    private C2100x() {
        this.f23786a = null;
        this.f23787b = null;
    }

    static C2100x b(Context context) {
        C2100x c2100x;
        synchronized (C2100x.class) {
            try {
                if (f23785c == null) {
                    f23785c = androidx.core.content.e.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C2100x(context) : new C2100x();
                }
                c2100x = f23785c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2100x;
    }

    static synchronized void e() {
        Context context;
        synchronized (C2100x.class) {
            try {
                C2100x c2100x = f23785c;
                if (c2100x != null && (context = c2100x.f23786a) != null && c2100x.f23787b != null) {
                    context.getContentResolver().unregisterContentObserver(f23785c.f23787b);
                }
                f23785c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2091u
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.f23786a;
        if (context != null && !AbstractC2068m.a(context)) {
            try {
                return (String) AbstractC2085s.a(new InterfaceC2088t() { // from class: com.google.android.gms.internal.auth.v
                    @Override // com.google.android.gms.internal.auth.InterfaceC2088t
                    public final Object zza() {
                        return C2100x.this.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e10);
            }
        }
        return null;
    }

    final /* synthetic */ String d(String str) {
        return AbstractC2065l.a(this.f23786a.getContentResolver(), str, null);
    }

    private C2100x(Context context) {
        this.f23786a = context;
        C2097w c2097w = new C2097w(this, null);
        this.f23787b = c2097w;
        context.getContentResolver().registerContentObserver(AbstractC2065l.f23727a, true, c2097w);
    }
}
