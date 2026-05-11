package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1936c0;
import com.facebook.react.uimanager.C1938d0;
import com.facebook.react.uimanager.J0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.V;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class O extends V {

    /* renamed from: A, reason: collision with root package name */
    private ReactContext f29914A;

    public O(ReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29914A = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1(O this$0, C1936c0 nativeViewHierarchyManager) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nativeViewHierarchyManager, "nativeViewHierarchyManager");
        View resolveView = nativeViewHierarchyManager.resolveView(this$0.r());
        if (resolveView instanceof C2949t) {
            ((C2949t) resolveView).u();
        }
    }

    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    public void X(C1938d0 nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        super.X(nativeViewHierarchyOptimizer);
        UIManagerModule uIManagerModule = (UIManagerModule) this.f29914A.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new J0() { // from class: com.swmansion.rnscreens.N
                @Override // com.facebook.react.uimanager.J0
                public final void a(C1936c0 c1936c0) {
                    O.x1(O.this, c1936c0);
                }
            });
        }
    }
}
