package io.invertase.firebase.analytics;

import D7.AbstractC0789m;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class v extends io.invertase.firebase.common.b {
    v(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void q(String str, Bundle bundle) {
        FirebaseAnalytics.getInstance(c()).c(str, bundle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void r() {
        FirebaseAnalytics.getInstance(c()).d();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void s(Boolean bool) {
        FirebaseAnalytics.getInstance(c()).e(bool.booleanValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void t(Bundle bundle) {
        boolean z10 = bundle.getBoolean("analytics_storage");
        boolean z11 = bundle.getBoolean("ad_storage");
        boolean z12 = bundle.getBoolean("ad_user_data");
        boolean z13 = bundle.getBoolean("ad_personalization");
        EnumMap enumMap = new EnumMap(FirebaseAnalytics.b.class);
        enumMap.put((EnumMap) FirebaseAnalytics.b.ANALYTICS_STORAGE, (FirebaseAnalytics.b) (z10 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED));
        enumMap.put((EnumMap) FirebaseAnalytics.b.AD_STORAGE, (FirebaseAnalytics.b) (z11 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED));
        enumMap.put((EnumMap) FirebaseAnalytics.b.AD_USER_DATA, (FirebaseAnalytics.b) (z12 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED));
        enumMap.put((EnumMap) FirebaseAnalytics.b.AD_PERSONALIZATION, (FirebaseAnalytics.b) (z13 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED));
        FirebaseAnalytics.getInstance(c()).f(enumMap);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void u(Bundle bundle) {
        FirebaseAnalytics.getInstance(c()).g(bundle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void v(long j10) {
        FirebaseAnalytics.getInstance(c()).h(j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void w(String str) {
        FirebaseAnalytics.getInstance(c()).i(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void x(Bundle bundle) {
        Set<String> keySet = bundle.keySet();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(c());
        for (String str : keySet) {
            firebaseAnalytics.j(str, (String) bundle.get(str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void y(String str, String str2) {
        FirebaseAnalytics.getInstance(c()).j(str, str2);
        return null;
    }

    Task A() {
        return AbstractC0789m.c(new Callable() { // from class: io.invertase.firebase.analytics.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void r10;
                r10 = v.this.r();
                return r10;
            }
        });
    }

    Task B(final Boolean bool) {
        return AbstractC0789m.c(new Callable() { // from class: io.invertase.firebase.analytics.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void s10;
                s10 = v.this.s(bool);
                return s10;
            }
        });
    }

    Task C(final Bundle bundle) {
        return AbstractC0789m.c(new Callable() { // from class: io.invertase.firebase.analytics.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void t10;
                t10 = v.this.t(bundle);
                return t10;
            }
        });
    }

    Task D(final Bundle bundle) {
        return AbstractC0789m.c(new Callable() { // from class: io.invertase.firebase.analytics.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void u10;
                u10 = v.this.u(bundle);
                return u10;
            }
        });
    }

    Task E(final long j10) {
        return AbstractC0789m.c(new Callable() { // from class: io.invertase.firebase.analytics.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void v10;
                v10 = v.this.v(j10);
                return v10;
            }
        });
    }

    Task F(final String str) {
        return AbstractC0789m.c(new Callable() { // from class: io.invertase.firebase.analytics.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void w10;
                w10 = v.this.w(str);
                return w10;
            }
        });
    }

    Task G(final Bundle bundle) {
        return AbstractC0789m.c(new Callable() { // from class: io.invertase.firebase.analytics.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void x10;
                x10 = v.this.x(bundle);
                return x10;
            }
        });
    }

    Task H(final String str, final String str2) {
        return AbstractC0789m.c(new Callable() { // from class: io.invertase.firebase.analytics.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void y10;
                y10 = v.this.y(str, str2);
                return y10;
            }
        });
    }

    Task o() {
        return FirebaseAnalytics.getInstance(c()).a();
    }

    Task p() {
        return FirebaseAnalytics.getInstance(c()).b();
    }

    Task z(final String str, final Bundle bundle) {
        return AbstractC0789m.c(new Callable() { // from class: io.invertase.firebase.analytics.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void q10;
                q10 = v.this.q(str, bundle);
                return q10;
            }
        });
    }
}
