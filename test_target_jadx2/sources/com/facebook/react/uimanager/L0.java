package com.facebook.react.uimanager;

import a5.C1351a;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.AbstractC1484a0;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;

/* loaded from: classes.dex */
public abstract class L0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22177a = "com.facebook.react.uimanager.L0";

    public static float[] a(Context context) {
        EditText editText = new EditText(context);
        return new float[]{C1944g0.e(AbstractC1484a0.F(editText)), C1944g0.e(AbstractC1484a0.E(editText)), C1944g0.e(editText.getPaddingTop()), C1944g0.e(editText.getPaddingBottom())};
    }

    public static EventDispatcher b(ReactContext reactContext, int i10) {
        if (reactContext.isBridgeless()) {
            boolean z10 = reactContext instanceof F0;
            Object obj = reactContext;
            if (z10) {
                obj = ((F0) reactContext).b();
            }
            return ((com.facebook.react.uimanager.events.i) obj).getEventDispatcher();
        }
        UIManager h10 = h(reactContext, i10, false);
        if (h10 == null) {
            ReactSoftExceptionLogger.logSoftException(f22177a, new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i10));
            return null;
        }
        EventDispatcher eventDispatcher = h10.getEventDispatcher();
        if (eventDispatcher == null) {
            ReactSoftExceptionLogger.logSoftException(f22177a, new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i10));
        }
        return eventDispatcher;
    }

    public static EventDispatcher c(ReactContext reactContext, int i10) {
        EventDispatcher b10 = b(reactContext, C1351a.a(i10));
        if (b10 == null) {
            ReactSoftExceptionLogger.logSoftException(f22177a, new IllegalStateException("Cannot get EventDispatcher for reactTag " + i10));
        }
        return b10;
    }

    public static ReactContext d(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public static int e(Context context) {
        if (context instanceof F0) {
            return ((F0) context).c();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int f(View view) {
        if (view instanceof InterfaceC1965r0) {
            InterfaceC1965r0 interfaceC1965r0 = (InterfaceC1965r0) view;
            if (interfaceC1965r0.getUIManagerType() == 2) {
                return interfaceC1965r0.getRootViewTag();
            }
            return -1;
        }
        int id2 = view.getId();
        if (C1351a.a(id2) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof F0) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int e10 = e(context);
        if (e10 == -1) {
            ReactSoftExceptionLogger.logSoftException(f22177a, new IllegalStateException("Fabric View [" + id2 + "] does not have SurfaceId associated with it"));
        }
        return e10;
    }

    public static UIManager g(ReactContext reactContext, int i10) {
        return h(reactContext, i10, true);
    }

    private static UIManager h(ReactContext reactContext, int i10, boolean z10) {
        if (reactContext.isBridgeless()) {
            UIManager fabricUIManager = reactContext.getFabricUIManager();
            if (fabricUIManager != null) {
                return fabricUIManager;
            }
            ReactSoftExceptionLogger.logSoftException(f22177a, new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
            return null;
        }
        if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException(f22177a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        }
        if (!reactContext.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException(f22177a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
            if (z10) {
                return null;
            }
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        try {
            return i10 == 2 ? reactContext.getFabricUIManager() : (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        } catch (IllegalArgumentException unused) {
            ReactSoftExceptionLogger.logSoftException(f22177a, new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i10));
            return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        }
    }

    public static UIManager i(ReactContext reactContext, int i10) {
        return g(reactContext, C1351a.a(i10));
    }
}
