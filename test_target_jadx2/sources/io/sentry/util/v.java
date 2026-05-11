package io.sentry.util;

import io.sentry.C3402d;
import io.sentry.K0;
import io.sentry.L;
import io.sentry.O0;
import io.sentry.P0;
import io.sentry.P1;

/* loaded from: classes2.dex */
public abstract class v {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(P1 p12, O0 o02, K0 k02) {
        C3402d b10 = k02.b();
        if (b10 == null) {
            b10 = new C3402d(p12.getLogger());
            k02.g(b10);
        }
        if (b10.q()) {
            b10.D(o02, p12);
            b10.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(O0 o02, K0 k02) {
        o02.w(new K0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(final O0 o02) {
        o02.z(new O0.a() { // from class: io.sentry.util.u
            @Override // io.sentry.O0.a
            public final void a(K0 k02) {
                v.e(O0.this, k02);
            }
        });
    }

    public static K0 g(final O0 o02, final P1 p12) {
        return o02.z(new O0.a() { // from class: io.sentry.util.s
            @Override // io.sentry.O0.a
            public final void a(K0 k02) {
                v.d(P1.this, o02, k02);
            }
        });
    }

    public static void h(L l10) {
        l10.B(new P0() { // from class: io.sentry.util.t
            @Override // io.sentry.P0
            public final void a(O0 o02) {
                v.f(o02);
            }
        });
    }
}
