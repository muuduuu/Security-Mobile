package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = "RNSModule")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/swmansion/rnscreens/ScreensModule;", "Lcom/swmansion/rnscreens/NativeScreensModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, "jsiPtr", BuildConfig.FLAVOR, "nativeInstall", "(J)V", BuildConfig.FLAVOR, "reactTag", BuildConfig.FLAVOR, "startTransition", "(Ljava/lang/Integer;)[I", BuildConfig.FLAVOR, ReactProgressBarViewManager.PROP_PROGRESS, "updateTransition", "(D)V", BuildConfig.FLAVOR, "canceled", "finishTransition", "(Ljava/lang/Integer;Z)V", "initialize", "()V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "topScreenId", "I", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isActiveTransition", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/swmansion/rnscreens/NativeProxy;", "proxy", "Lcom/swmansion/rnscreens/NativeProxy;", "Companion", C4870a.f43493a, "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreensModule extends NativeScreensModuleSpec {
    public static final String NAME = "RNSModule";
    private final AtomicBoolean isActiveTransition;
    private NativeProxy proxy;
    private final ReactApplicationContext reactContext;
    private int topScreenId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.topScreenId = -1;
        this.isActiveTransition = new AtomicBoolean(false);
        try {
            System.loadLibrary("rnscreens");
            JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
            if (javaScriptContextHolder != null) {
                nativeInstall(javaScriptContextHolder.get());
            } else {
                Log.e("[RNScreens]", "Could not install JSI bindings.");
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.w("[RNScreens]", "Could not load RNScreens module.");
        }
    }

    private final void finishTransition(Integer reactTag, boolean canceled) {
        UiThreadUtil.assertOnUiThread();
        if (!this.isActiveTransition.get() || reactTag == null) {
            Log.e("[RNScreens]", "Unable to call `finishTransition` method before transition start.");
            return;
        }
        UIManager i10 = L0.i(this.reactContext, reactTag.intValue());
        View resolveView = i10 != null ? i10.resolveView(reactTag.intValue()) : null;
        if (resolveView instanceof B) {
            if (canceled) {
                ((B) resolveView).h();
            } else {
                ((B) resolveView).q();
            }
            this.isActiveTransition.set(false);
        }
        this.topScreenId = -1;
    }

    private final native void nativeInstall(long jsiPtr);

    private final int[] startTransition(Integer reactTag) {
        B b10;
        ArrayList<D> fragments;
        int size;
        UiThreadUtil.assertOnUiThread();
        if (this.isActiveTransition.get() || reactTag == null) {
            return new int[]{-1, -1};
        }
        this.topScreenId = -1;
        int[] iArr = {-1, -1};
        UIManager i10 = L0.i(this.reactContext, reactTag.intValue());
        View resolveView = i10 != null ? i10.resolveView(reactTag.intValue()) : null;
        if ((resolveView instanceof B) && (size = (fragments = (b10 = (B) resolveView).getFragments()).size()) > 1) {
            this.isActiveTransition.set(true);
            b10.e();
            int id2 = fragments.get(size - 1).m().getId();
            this.topScreenId = id2;
            iArr[0] = id2;
            iArr[1] = fragments.get(size - 2).m().getId();
        }
        return iArr;
    }

    private final void updateTransition(double progress) {
        UiThreadUtil.assertOnUiThread();
        if (this.topScreenId == -1) {
            return;
        }
        float f10 = (float) progress;
        short a10 = y.INSTANCE.a(f10);
        EventDispatcher c10 = L0.c(this.reactContext, this.topScreenId);
        if (c10 != null) {
            c10.c(new ha.h(L0.e(this.reactContext), this.topScreenId, f10, true, true, a10));
        }
    }

    @Override // com.swmansion.rnscreens.NativeScreensModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        UIManager g10 = L0.g(this.reactContext, 2);
        Intrinsics.e(g10, "null cannot be cast to non-null type com.facebook.react.fabric.FabricUIManager");
        NativeProxy nativeProxy = new NativeProxy();
        nativeProxy.nativeAddMutationsListener((FabricUIManager) g10);
        this.proxy = nativeProxy;
    }
}
