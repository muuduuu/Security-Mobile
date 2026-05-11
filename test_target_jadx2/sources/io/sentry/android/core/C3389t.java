package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.K1;

/* renamed from: io.sentry.android.core.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3389t implements ILogger {

    /* renamed from: a, reason: collision with root package name */
    private final String f34995a;

    /* renamed from: io.sentry.android.core.t$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34996a;

        static {
            int[] iArr = new int[K1.values().length];
            f34996a = iArr;
            try {
                iArr[K1.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34996a[K1.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34996a[K1.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34996a[K1.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34996a[K1.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C3389t() {
        this("Sentry");
    }

    private int e(K1 k12) {
        int i10 = a.f34996a[k12.ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 != 2) {
            return i10 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.ILogger
    public void a(K1 k12, Throwable th, String str, Object... objArr) {
        b(k12, String.format(str, objArr), th);
    }

    @Override // io.sentry.ILogger
    public void b(K1 k12, String str, Throwable th) {
        int i10 = a.f34996a[k12.ordinal()];
        if (i10 == 1) {
            Log.i(this.f34995a, str, th);
            return;
        }
        if (i10 == 2) {
            Log.w(this.f34995a, str, th);
            return;
        }
        if (i10 == 3) {
            Log.e(this.f34995a, str, th);
        } else if (i10 != 4) {
            Log.d(this.f34995a, str, th);
        } else {
            Log.wtf(this.f34995a, str, th);
        }
    }

    @Override // io.sentry.ILogger
    public void c(K1 k12, String str, Object... objArr) {
        Log.println(e(k12), this.f34995a, String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public boolean d(K1 k12) {
        return true;
    }

    public C3389t(String str) {
        this.f34995a = str;
    }
}
