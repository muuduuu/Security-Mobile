package com.facebook.react.defaults;

import android.app.Application;
import com.facebook.react.EnumC1894i;
import com.facebook.react.O;
import com.facebook.react.W;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManagerProviderImpl;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.i1;
import com.facebook.react.uimanager.j1;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import lc.m;

/* loaded from: classes.dex */
public abstract class b extends O {

    public static final class a implements j1 {
        a() {
        }

        @Override // com.facebook.react.uimanager.j1
        public Collection a() {
            return b.this.c().I();
        }

        @Override // com.facebook.react.uimanager.j1
        public ViewManager b(String viewManagerName) {
            Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
            return b.this.c().A(viewManagerName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIManager j(b this$0, ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        return new FabricUIManagerProviderImpl(componentFactory, ReactNativeConfig.DEFAULT_CONFIG, this$0.b() ? new i1(this$0.new a()) : new i1(this$0.c().H(reactApplicationContext))).createUIManager(reactApplicationContext);
    }

    @Override // com.facebook.react.O
    protected EnumC1894i getJSEngineResolutionAlgorithm() {
        Boolean k10 = k();
        if (Intrinsics.b(k10, Boolean.TRUE)) {
            return EnumC1894i.HERMES;
        }
        if (Intrinsics.b(k10, Boolean.FALSE)) {
            return EnumC1894i.JSC;
        }
        if (k10 == null) {
            return null;
        }
        throw new m();
    }

    @Override // com.facebook.react.O
    protected W.a getReactPackageTurboModuleManagerDelegateBuilder() {
        if (l()) {
            return new DefaultTurboModuleManagerDelegate.a();
        }
        return null;
    }

    @Override // com.facebook.react.O
    protected UIManagerProvider getUIManagerProvider() {
        if (l()) {
            return new UIManagerProvider() { // from class: A4.b
                @Override // com.facebook.react.bridge.UIManagerProvider
                public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                    UIManager j10;
                    j10 = com.facebook.react.defaults.b.j(com.facebook.react.defaults.b.this, reactApplicationContext);
                    return j10;
                }
            };
        }
        return null;
    }

    protected Boolean k() {
        return null;
    }

    protected boolean l() {
        return false;
    }
}
