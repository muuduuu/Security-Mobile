package com.facebook.react.runtime;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* renamed from: com.facebook.react.runtime.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1904b extends com.facebook.react.devsupport.E {

    /* renamed from: F, reason: collision with root package name */
    private final ReactHostImpl f22066F;

    /* renamed from: com.facebook.react.runtime.b$a */
    class a implements com.facebook.react.devsupport.d0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactHostImpl f22067a;

        a(ReactHostImpl reactHostImpl) {
            this.f22067a = reactHostImpl;
        }

        @Override // com.facebook.react.devsupport.d0
        public Activity a() {
            return this.f22067a.u0();
        }

        @Override // com.facebook.react.devsupport.d0
        public View b(String str) {
            Activity a10 = a();
            if (a10 == null || this.f22067a.M0(str)) {
                return null;
            }
            j0 f10 = j0.f(a10, str, new Bundle());
            f10.c(this.f22067a);
            f10.start();
            return f10.a();
        }

        @Override // com.facebook.react.devsupport.d0
        public JavaScriptExecutorFactory c() {
            throw new IllegalStateException("Not implemented for bridgeless mode");
        }

        @Override // com.facebook.react.devsupport.d0
        public void e(View view) {
        }

        @Override // com.facebook.react.devsupport.d0
        public void i() {
            ReactContext k10 = this.f22067a.k();
            if (k10 != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) k10.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("toggleElementInspector", null);
            }
        }
    }

    public C1904b(ReactHostImpl reactHostImpl, Context context, String str) {
        super(context.getApplicationContext(), T0(reactHostImpl), str, true, null, null, 2, null, null, null, null);
        this.f22066F = reactHostImpl;
    }

    private static com.facebook.react.devsupport.d0 T0(ReactHostImpl reactHostImpl) {
        return new a(reactHostImpl);
    }

    @Override // com.facebook.react.devsupport.E
    protected String p0() {
        return "Bridgeless";
    }

    @Override // C4.e
    public void q() {
        UiThreadUtil.assertOnUiThread();
        o();
        this.f22066F.g("BridgelessDevSupportManager.handleReloadJS()");
    }
}
