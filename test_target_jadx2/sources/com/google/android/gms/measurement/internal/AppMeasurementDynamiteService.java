package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractBinderC2365u0;
import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import e7.BinderC3090b;
import e7.InterfaceC3089a;
import j0.C3476a;
import java.util.Map;

/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC2365u0 {

    /* renamed from: f, reason: collision with root package name */
    C2760q3 f25307f = null;

    /* renamed from: g, reason: collision with root package name */
    private final Map f25308g = new C3476a();

    private final void k1() {
        if (this.f25307f == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void l1(InterfaceC2401y0 interfaceC2401y0, String str) {
        k1();
        this.f25307f.C().a0(interfaceC2401y0, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void beginAdUnitExposure(String str, long j10) {
        k1();
        this.f25307f.M().i(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        k1();
        this.f25307f.B().O(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void clearMeasurementEnabled(long j10) {
        k1();
        this.f25307f.B().n0(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void endAdUnitExposure(String str, long j10) {
        k1();
        this.f25307f.M().j(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void generateEventId(InterfaceC2401y0 interfaceC2401y0) {
        k1();
        long p02 = this.f25307f.C().p0();
        k1();
        this.f25307f.C().b0(interfaceC2401y0, p02);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void getAppInstanceId(InterfaceC2401y0 interfaceC2401y0) {
        k1();
        this.f25307f.b().t(new RunnableC2704j3(this, interfaceC2401y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void getCachedAppInstanceId(InterfaceC2401y0 interfaceC2401y0) {
        k1();
        l1(interfaceC2401y0, this.f25307f.B().D());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void getConditionalUserProperties(String str, String str2, InterfaceC2401y0 interfaceC2401y0) {
        k1();
        this.f25307f.b().t(new RunnableC2777s5(this, interfaceC2401y0, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void getCurrentScreenClass(InterfaceC2401y0 interfaceC2401y0) {
        k1();
        l1(interfaceC2401y0, this.f25307f.B().R());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void getCurrentScreenName(InterfaceC2401y0 interfaceC2401y0) {
        k1();
        l1(interfaceC2401y0, this.f25307f.B().Q());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void getGmpAppId(InterfaceC2401y0 interfaceC2401y0) {
        k1();
        l1(interfaceC2401y0, this.f25307f.B().S());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void getMaxUserProperties(String str, InterfaceC2401y0 interfaceC2401y0) {
        k1();
        this.f25307f.B().L(str);
        k1();
        this.f25307f.C().c0(interfaceC2401y0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void getSessionId(InterfaceC2401y0 interfaceC2401y0) {
        k1();
        C2642b5 B10 = this.f25307f.B();
        B10.f25694a.b().t(new B4(B10, interfaceC2401y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void getTestFlag(InterfaceC2401y0 interfaceC2401y0, int i10) {
        k1();
        if (i10 == 0) {
            this.f25307f.C().a0(interfaceC2401y0, this.f25307f.B().j0());
            return;
        }
        if (i10 == 1) {
            this.f25307f.C().b0(interfaceC2401y0, this.f25307f.B().k0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f25307f.C().c0(interfaceC2401y0, this.f25307f.B().l0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f25307f.C().e0(interfaceC2401y0, this.f25307f.B().i0().booleanValue());
                return;
            }
        }
        l7 C10 = this.f25307f.C();
        double doubleValue = this.f25307f.B().m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            interfaceC2401y0.r0(bundle);
        } catch (RemoteException e10) {
            C10.f25694a.a().r().b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void getUserProperties(String str, String str2, boolean z10, InterfaceC2401y0 interfaceC2401y0) {
        k1();
        this.f25307f.b().t(new RunnableC2753p4(this, interfaceC2401y0, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void initForTests(Map map) {
        k1();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void initialize(InterfaceC3089a interfaceC3089a, com.google.android.gms.internal.measurement.H0 h02, long j10) {
        C2760q3 c2760q3 = this.f25307f;
        if (c2760q3 == null) {
            this.f25307f = C2760q3.O((Context) AbstractC1287s.m((Context) BinderC3090b.l1(interfaceC3089a)), h02, Long.valueOf(j10));
        } else {
            c2760q3.a().r().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void isDataCollectionEnabled(InterfaceC2401y0 interfaceC2401y0) {
        k1();
        this.f25307f.b().t(new S5(this, interfaceC2401y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        k1();
        this.f25307f.B().q(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2401y0 interfaceC2401y0, long j10) {
        k1();
        AbstractC1287s.g(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f25307f.b().t(new O3(this, interfaceC2401y0, new I(str2, new G(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void logHealthData(int i10, String str, InterfaceC3089a interfaceC3089a, InterfaceC3089a interfaceC3089a2, InterfaceC3089a interfaceC3089a3) {
        k1();
        this.f25307f.a().y(i10, true, false, str, interfaceC3089a == null ? null : BinderC3090b.l1(interfaceC3089a), interfaceC3089a2 == null ? null : BinderC3090b.l1(interfaceC3089a2), interfaceC3089a3 != null ? BinderC3090b.l1(interfaceC3089a3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityCreated(InterfaceC3089a interfaceC3089a, Bundle bundle, long j10) {
        k1();
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.j((Activity) AbstractC1287s.m((Activity) BinderC3090b.l1(interfaceC3089a))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle, long j10) {
        k1();
        N4 n42 = this.f25307f.B().f25787c;
        if (n42 != null) {
            this.f25307f.B().h0();
            n42.e(j02, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityDestroyed(InterfaceC3089a interfaceC3089a, long j10) {
        k1();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.j((Activity) AbstractC1287s.m((Activity) BinderC3090b.l1(interfaceC3089a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) {
        k1();
        N4 n42 = this.f25307f.B().f25787c;
        if (n42 != null) {
            this.f25307f.B().h0();
            n42.b(j02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityPaused(InterfaceC3089a interfaceC3089a, long j10) {
        k1();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.j((Activity) AbstractC1287s.m((Activity) BinderC3090b.l1(interfaceC3089a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) {
        k1();
        N4 n42 = this.f25307f.B().f25787c;
        if (n42 != null) {
            this.f25307f.B().h0();
            n42.a(j02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityResumed(InterfaceC3089a interfaceC3089a, long j10) {
        k1();
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.j((Activity) AbstractC1287s.m((Activity) BinderC3090b.l1(interfaceC3089a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) {
        k1();
        N4 n42 = this.f25307f.B().f25787c;
        if (n42 != null) {
            this.f25307f.B().h0();
            n42.d(j02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivitySaveInstanceState(InterfaceC3089a interfaceC3089a, InterfaceC2401y0 interfaceC2401y0, long j10) {
        k1();
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.J0.j((Activity) AbstractC1287s.m((Activity) BinderC3090b.l1(interfaceC3089a))), interfaceC2401y0, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, InterfaceC2401y0 interfaceC2401y0, long j10) {
        k1();
        N4 n42 = this.f25307f.B().f25787c;
        Bundle bundle = new Bundle();
        if (n42 != null) {
            this.f25307f.B().h0();
            n42.c(j02, bundle);
        }
        try {
            interfaceC2401y0.r0(bundle);
        } catch (RemoteException e10) {
            this.f25307f.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityStarted(InterfaceC3089a interfaceC3089a, long j10) {
        k1();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.j((Activity) AbstractC1287s.m((Activity) BinderC3090b.l1(interfaceC3089a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) {
        k1();
        if (this.f25307f.B().f25787c != null) {
            this.f25307f.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityStopped(InterfaceC3089a interfaceC3089a, long j10) {
        k1();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.j((Activity) AbstractC1287s.m((Activity) BinderC3090b.l1(interfaceC3089a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) {
        k1();
        if (this.f25307f.B().f25787c != null) {
            this.f25307f.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void performAction(Bundle bundle, InterfaceC2401y0 interfaceC2401y0, long j10) {
        k1();
        interfaceC2401y0.r0(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.E0 e02) {
        InterfaceC2673f4 interfaceC2673f4;
        k1();
        Map map = this.f25308g;
        synchronized (map) {
            try {
                interfaceC2673f4 = (InterfaceC2673f4) map.get(Integer.valueOf(e02.h()));
                if (interfaceC2673f4 == null) {
                    interfaceC2673f4 = new m7(this, e02);
                    map.put(Integer.valueOf(e02.h()), interfaceC2673f4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f25307f.B().J(interfaceC2673f4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void resetAnalyticsData(long j10) {
        k1();
        this.f25307f.B().G(j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.B0 b02) {
        k1();
        this.f25307f.B().r0(new Runnable() { // from class: com.google.android.gms.measurement.internal.t6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    b02.g();
                } catch (RemoteException e10) {
                    ((C2760q3) AbstractC1287s.m(AppMeasurementDynamiteService.this.f25307f)).a().r().b("Failed to call IDynamiteUploadBatchesCallback", e10);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        k1();
        if (bundle == null) {
            this.f25307f.a().o().a("Conditional user property must not be null");
        } else {
            this.f25307f.B().N(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setConsent(Bundle bundle, long j10) {
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setConsentThirdParty(Bundle bundle, long j10) {
        k1();
        this.f25307f.B().o0(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setCurrentScreen(InterfaceC3089a interfaceC3089a, String str, String str2, long j10) {
        k1();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.J0.j((Activity) AbstractC1287s.m((Activity) BinderC3090b.l1(interfaceC3089a))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, String str, String str2, long j10) {
        k1();
        this.f25307f.I().t(j02, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setDataCollectionEnabled(boolean z10) {
        k1();
        C2642b5 B10 = this.f25307f.B();
        B10.j();
        B10.f25694a.b().t(new RunnableC2737n4(B10, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setDefaultEventParameters(Bundle bundle) {
        k1();
        final C2642b5 B10 = this.f25307f.B();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        B10.f25694a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.W4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C2642b5.this.U(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setEventInterceptor(com.google.android.gms.internal.measurement.E0 e02) {
        k1();
        U6 u62 = new U6(this, e02);
        if (this.f25307f.b().p()) {
            this.f25307f.B().I(u62);
        } else {
            this.f25307f.b().t(new P4(this, u62));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.G0 g02) {
        k1();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setMeasurementEnabled(boolean z10, long j10) {
        k1();
        this.f25307f.B().n0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setMinimumSessionDuration(long j10) {
        k1();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setSessionTimeoutDuration(long j10) {
        k1();
        C2642b5 B10 = this.f25307f.B();
        B10.f25694a.b().t(new RunnableC2761q4(B10, j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setSgtmDebugInfo(Intent intent) {
        k1();
        C2642b5 B10 = this.f25307f.B();
        Uri data = intent.getData();
        if (data == null) {
            B10.f25694a.a().u().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            C2760q3 c2760q3 = B10.f25694a;
            c2760q3.a().u().a("[sgtm] Preview Mode was not enabled.");
            c2760q3.w().Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            C2760q3 c2760q32 = B10.f25694a;
            c2760q32.a().u().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            c2760q32.w().Q(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setUserId(final String str, long j10) {
        k1();
        final C2642b5 B10 = this.f25307f.B();
        if (str != null && TextUtils.isEmpty(str)) {
            B10.f25694a.a().r().a("User ID must be non-empty or null");
        } else {
            B10.f25694a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.X4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C2760q3 c2760q3 = C2642b5.this.f25694a;
                    if (c2760q3.L().x(str)) {
                        c2760q3.L().p();
                    }
                }
            });
            B10.z(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void setUserProperty(String str, String str2, InterfaceC3089a interfaceC3089a, boolean z10, long j10) {
        k1();
        this.f25307f.B().z(str, str2, BinderC3090b.l1(interfaceC3089a), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.E0 e02) {
        InterfaceC2673f4 interfaceC2673f4;
        k1();
        Map map = this.f25308g;
        synchronized (map) {
            interfaceC2673f4 = (InterfaceC2673f4) map.remove(Integer.valueOf(e02.h()));
        }
        if (interfaceC2673f4 == null) {
            interfaceC2673f4 = new m7(this, e02);
        }
        this.f25307f.B().K(interfaceC2673f4);
    }
}
