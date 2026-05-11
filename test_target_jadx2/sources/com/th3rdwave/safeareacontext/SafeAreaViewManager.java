package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.c1;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = SafeAreaViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", BuildConfig.FLAVOR, "Lcom/th3rdwave/safeareacontext/k;", "<init>", "()V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/c1;", "Lcom/facebook/react/views/view/j;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/th3rdwave/safeareacontext/k;", "Lcom/th3rdwave/safeareacontext/p;", "createShadowNodeInstance", "()Lcom/th3rdwave/safeareacontext/p;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "mode", BuildConfig.FLAVOR, "setMode", "(Lcom/th3rdwave/safeareacontext/k;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "propList", "setEdges", "(Lcom/th3rdwave/safeareacontext/k;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/uimanager/v0;", "props", "Lcom/facebook/react/uimanager/E0;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/view/j;Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/uimanager/E0;)Ljava/lang/Object;", "Companion", C4870a.f43493a, "react-native-safe-area-context_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SafeAreaViewManager extends ReactViewManager {
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    protected c1 getMDelegate() {
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<p> getShadowNodeClass() {
        return p.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r7 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0 == null) goto L8;
     */
    @Z4.a(name = "edges")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setEdges(k view, ReadableMap propList) {
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
        Intrinsics.checkNotNullParameter(view, "view");
        if (propList != null) {
            String string = propList.getString("top");
            if (string != null) {
                String upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                lVar = l.valueOf(upperCase);
            }
            lVar = l.OFF;
            String string2 = propList.getString("right");
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                lVar2 = l.valueOf(upperCase2);
            }
            lVar2 = l.OFF;
            String string3 = propList.getString("bottom");
            if (string3 != null) {
                String upperCase3 = string3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                lVar3 = l.valueOf(upperCase3);
            }
            lVar3 = l.OFF;
            String string4 = propList.getString("left");
            if (string4 != null) {
                String upperCase4 = string4.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                lVar4 = l.valueOf(upperCase4);
            }
            lVar4 = l.OFF;
            view.setEdges(new m(lVar, lVar2, lVar3, lVar4));
        }
    }

    @Z4.a(name = "mode")
    public void setMode(k view, String mode) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.b(mode, "padding")) {
            view.setMode(o.PADDING);
        } else if (Intrinsics.b(mode, "margin")) {
            view.setMode(o.MARGIN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(com.facebook.react.views.view.j view, C1973v0 props, E0 stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((k) view).setStateWrapper(stateWrapper);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public p createShadowNodeInstance() {
        return new p();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public k createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new k(context);
    }
}
