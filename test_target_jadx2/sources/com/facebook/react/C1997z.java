package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.devsupport.j0;
import r4.AbstractC4012a;

/* renamed from: com.facebook.react.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1997z {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f23003a;

    /* renamed from: b, reason: collision with root package name */
    private Z f23004b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23005c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f23006d;

    /* renamed from: e, reason: collision with root package name */
    private com.facebook.react.devsupport.L f23007e;

    /* renamed from: f, reason: collision with root package name */
    private O f23008f;

    /* renamed from: g, reason: collision with root package name */
    private A f23009g;

    /* renamed from: h, reason: collision with root package name */
    private E4.a f23010h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23011i;

    public C1997z(Activity activity, O o10, String str, Bundle bundle) {
        this.f23011i = ReactFeatureFlags.enableFabricRenderer;
        this.f23003a = activity;
        this.f23005c = str;
        this.f23006d = bundle;
        this.f23007e = new com.facebook.react.devsupport.L();
        this.f23008f = o10;
    }

    private C4.e c() {
        A a10;
        if (ReactFeatureFlags.enableBridgelessArchitecture && (a10 = this.f23009g) != null && a10.i() != null) {
            return this.f23009g.i();
        }
        if (!e().g() || e().c() == null) {
            return null;
        }
        return e().c().E();
    }

    private O e() {
        return this.f23008f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        if (!this.f23008f.g() || this.f23008f.c() == null) {
            return;
        }
        this.f23008f.c().m0();
    }

    protected Z b() {
        Z z10 = new Z(this.f23003a);
        z10.setIsFabric(g());
        return z10;
    }

    public J d() {
        return e().c();
    }

    public Z f() {
        return ReactFeatureFlags.enableBridgelessArchitecture ? (Z) this.f23010h.a() : this.f23004b;
    }

    protected boolean g() {
        return this.f23011i;
    }

    public void i(String str) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            if (this.f23010h == null) {
                this.f23010h = this.f23009g.b(this.f23003a, str, this.f23006d);
            }
            this.f23010h.start();
        } else {
            if (this.f23004b != null) {
                throw new IllegalStateException("Cannot loadApp while app is already running.");
            }
            Z b10 = b();
            this.f23004b = b10;
            b10.u(e().c(), str, this.f23006d);
        }
    }

    public void j(int i10, int i11, Intent intent, boolean z10) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f23009g.onActivityResult(this.f23003a, i10, i11, intent);
        } else if (e().g() && z10) {
            e().c().X(this.f23003a, i10, i11, intent);
        }
    }

    public boolean k() {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f23009g.a();
            return true;
        }
        if (!e().g()) {
            return false;
        }
        e().c().Y();
        return true;
    }

    public void l(Configuration configuration) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f23009g.c((Context) AbstractC4012a.c(this.f23003a));
        } else if (e().g()) {
            d().Z((Context) AbstractC4012a.c(this.f23003a), configuration);
        }
    }

    public void m() {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            E4.a aVar = this.f23010h;
            if (aVar != null) {
                aVar.stop();
                this.f23010h = null;
            }
            this.f23009g.f(this.f23003a);
            return;
        }
        Z z10 = this.f23004b;
        if (z10 != null) {
            z10.v();
            this.f23004b = null;
        }
        if (e().g()) {
            e().c().b0(this.f23003a);
        }
    }

    public void n() {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f23009g.d(this.f23003a);
        } else if (e().g()) {
            e().c().d0(this.f23003a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o() {
        Activity activity = this.f23003a;
        if (!(activity instanceof O4.b)) {
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        }
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f23009g.h(activity, (O4.b) activity);
        } else if (e().g()) {
            J c10 = e().c();
            Activity activity2 = this.f23003a;
            c10.f0(activity2, (O4.b) activity2);
        }
    }

    public boolean p(int i10, KeyEvent keyEvent) {
        A a10;
        if (i10 != 90) {
            return false;
        }
        if ((!ReactFeatureFlags.enableBridgelessArchitecture || (a10 = this.f23009g) == null || a10.i() == null) && !(e().g() && e().f())) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean q(int i10) {
        A a10;
        if (i10 != 90) {
            return false;
        }
        if (!ReactFeatureFlags.enableBridgelessArchitecture || (a10 = this.f23009g) == null) {
            if (!e().g() || !e().f()) {
                return false;
            }
            e().c().u0();
            return true;
        }
        C4.e i11 = a10.i();
        if (i11 == null || (i11 instanceof j0)) {
            return false;
        }
        i11.C();
        return true;
    }

    public boolean r(Intent intent) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f23009g.onNewIntent(intent);
            return true;
        }
        if (!e().g()) {
            return false;
        }
        e().c().h0(intent);
        return true;
    }

    public void s() {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f23009g.j(this.f23003a);
        } else if (e().g()) {
            e().c().i0(this.f23003a);
        }
    }

    public void t(boolean z10) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f23009g.onWindowFocusChange(z10);
        } else if (e().g()) {
            e().c().j0(z10);
        }
    }

    public void u() {
        C4.e c10 = c();
        if (c10 == null) {
            return;
        }
        if (!(c10 instanceof j0)) {
            c10.q();
            return;
        }
        if (!ReactFeatureFlags.enableBridgelessArchitecture) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.y
                @Override // java.lang.Runnable
                public final void run() {
                    C1997z.this.h();
                }
            });
            return;
        }
        A a10 = this.f23009g;
        if (a10 != null) {
            a10.g("ReactDelegate.reload()");
        }
    }

    public boolean v(int i10, KeyEvent keyEvent) {
        C4.e c10 = c();
        if (c10 != null && !(c10 instanceof j0)) {
            if (i10 == 82) {
                c10.C();
                return true;
            }
            if (((com.facebook.react.devsupport.L) AbstractC4012a.c(this.f23007e)).b(i10, this.f23003a.getCurrentFocus())) {
                c10.q();
                return true;
            }
        }
        return false;
    }

    public C1997z(Activity activity, A a10, String str, Bundle bundle) {
        this.f23011i = ReactFeatureFlags.enableFabricRenderer;
        this.f23003a = activity;
        this.f23005c = str;
        this.f23006d = bundle;
        this.f23007e = new com.facebook.react.devsupport.L();
        this.f23009g = a10;
    }

    public C1997z(Activity activity, O o10, String str, Bundle bundle, boolean z10) {
        boolean z11 = ReactFeatureFlags.useTurboModules;
        this.f23011i = z10;
        this.f23003a = activity;
        this.f23005c = str;
        this.f23006d = bundle;
        this.f23007e = new com.facebook.react.devsupport.L();
        this.f23008f = o10;
    }
}
