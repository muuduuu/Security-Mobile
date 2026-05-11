package com.facebook.react.views.safeareaview;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.e;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.I;
import androidx.core.view.K0;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final F0 f22600a;

    /* renamed from: b, reason: collision with root package name */
    private E0 f22601b;

    public static final class a extends GuardedRunnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f22603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, F0 f02) {
            super(f02);
            this.f22603b = eVar;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) b.this.getReactContext().b().getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                int id2 = b.this.getId();
                e eVar = this.f22603b;
                uIManagerModule.updateInsetsPadding(id2, eVar.f15925b, eVar.f15924a, eVar.f15927d, eVar.f15926c);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(F0 reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f22600a = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K0 b(b this$0, View view, K0 windowInsets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        e f10 = windowInsets.f(K0.m.g() | K0.m.a());
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        this$0.c(f10);
        return K0.f16032b;
    }

    private final void c(e eVar) {
        E0 e02 = this.f22601b;
        if (e02 == null) {
            F0 f02 = this.f22600a;
            f02.runOnNativeModulesQueueThread(new a(eVar, f02));
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        C1944g0 c1944g0 = C1944g0.f22418a;
        writableNativeMap.putDouble("left", c1944g0.d(eVar.f15924a));
        writableNativeMap.putDouble("top", c1944g0.d(eVar.f15925b));
        writableNativeMap.putDouble("bottom", c1944g0.d(eVar.f15927d));
        writableNativeMap.putDouble("right", c1944g0.d(eVar.f15926c));
        e02.updateState(writableNativeMap);
    }

    public final F0 getReactContext() {
        return this.f22600a;
    }

    public final E0 getStateWrapper$ReactAndroid_release() {
        return this.f22601b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1484a0.F0(this, new I() { // from class: com.facebook.react.views.safeareaview.a
            @Override // androidx.core.view.I
            public final K0 p(View view, K0 k02) {
                K0 b10;
                b10 = b.b(b.this, view, k02);
                return b10;
            }
        });
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setStateWrapper$ReactAndroid_release(E0 e02) {
        this.f22601b = e02;
    }
}
