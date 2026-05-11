package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.internal.util.d;

/* loaded from: classes2.dex */
final class C implements io.sentry.transport.q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34705a;

    /* renamed from: b, reason: collision with root package name */
    private final ILogger f34706b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34707a;

        static {
            int[] iArr = new int[d.a.values().length];
            f34707a = iArr;
            try {
                iArr[d.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34707a[d.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34707a[d.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C(Context context, ILogger iLogger) {
        this.f34705a = context;
        this.f34706b = iLogger;
    }

    @Override // io.sentry.transport.q
    public boolean a() {
        return b(io.sentry.android.core.internal.util.d.b(this.f34705a, this.f34706b));
    }

    boolean b(d.a aVar) {
        int i10 = a.f34707a[aVar.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }
}
