package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.modal.c;
import h5.C3267s;
import h5.InterfaceC3269t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = ReactModalHostManager.REACT_CLASS)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001:B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001d\u0010\u0017J!\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u001f\u0010\u0013J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0014H\u0017¢\u0006\u0004\b \u0010\u0017J!\u0010\"\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b-\u0010\u0010J)\u00102\u001a\u0004\u0018\u00010*2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0016¢\u0006\u0004\b5\u00106R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/modal/c;", "Lh5/t;", "<init>", "()V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/facebook/react/views/modal/c;", "view", BuildConfig.FLAVOR, "onDropViewInstance", "(Lcom/facebook/react/views/modal/c;)V", "animationType", "setAnimationType", "(Lcom/facebook/react/views/modal/c;Ljava/lang/String;)V", BuildConfig.FLAVOR, "transparent", "setTransparent", "(Lcom/facebook/react/views/modal/c;Z)V", "statusBarTranslucent", "setStatusBarTranslucent", "hardwareAccelerated", "setHardwareAccelerated", "visible", "setVisible", "value", "setPresentationStyle", "setAnimated", "Lcom/facebook/react/bridge/ReadableArray;", "setSupportedOrientations", "(Lcom/facebook/react/views/modal/c;Lcom/facebook/react/bridge/ReadableArray;)V", BuildConfig.FLAVOR, "setIdentifier", "(Lcom/facebook/react/views/modal/c;I)V", "addEventEmitters", "(Lcom/facebook/react/uimanager/F0;Lcom/facebook/react/views/modal/c;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "Lcom/facebook/react/uimanager/v0;", "props", "Lcom/facebook/react/uimanager/E0;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/modal/c;Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/uimanager/E0;)Ljava/lang/Object;", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "delegate", "Lcom/facebook/react/uimanager/c1;", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReactModalHostManager extends ViewGroupManager<c> implements InterfaceC3269t {
    public static final String REACT_CLASS = "RCTModalHostView";
    private final c1 delegate = new C3267s(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(EventDispatcher eventDispatcher, F0 reactContext, c view, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(reactContext, "$reactContext");
        Intrinsics.checkNotNullParameter(view, "$view");
        eventDispatcher.c(new d(L0.e(reactContext), view.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$1(EventDispatcher eventDispatcher, F0 reactContext, c view, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(reactContext, "$reactContext");
        Intrinsics.checkNotNullParameter(view, "$view");
        eventDispatcher.c(new e(L0.e(reactContext), view.getId()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topRequestClose", G.e(t.a("registrationName", "onRequestClose")));
        exportedCustomDirectEventTypeConstants.put("topShow", G.e(t.a("registrationName", "onShow")));
        exportedCustomDirectEventTypeConstants.put("topDismiss", G.e(t.a("registrationName", "onDismiss")));
        exportedCustomDirectEventTypeConstants.put("topOrientationChange", G.e(t.a("registrationName", "onOrientationChange")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // h5.InterfaceC3269t
    @Z4.a(name = "animated")
    public void setAnimated(c view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // h5.InterfaceC3269t
    @Z4.a(name = "identifier")
    public void setIdentifier(c view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // h5.InterfaceC3269t
    @Z4.a(name = "presentationStyle")
    public void setPresentationStyle(c view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // h5.InterfaceC3269t
    @Z4.a(name = "supportedOrientations")
    public void setSupportedOrientations(c view, ReadableArray value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // h5.InterfaceC3269t
    @Z4.a(name = "visible")
    public void setVisible(c view, boolean visible) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final F0 reactContext, final c view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        final EventDispatcher c10 = L0.c(reactContext, view.getId());
        if (c10 != null) {
            view.setOnRequestCloseListener(new c.InterfaceC0385c() { // from class: com.facebook.react.views.modal.a
                @Override // com.facebook.react.views.modal.c.InterfaceC0385c
                public final void a(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$0(EventDispatcher.this, reactContext, view, dialogInterface);
                }
            });
            view.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.facebook.react.views.modal.b
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$1(EventDispatcher.this, reactContext, view, dialogInterface);
                }
            });
            view.setEventDispatcher(c10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(F0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new c(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((ReactModalHostManager) view);
        view.c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance((ReactModalHostManager) view);
        view.b();
    }

    @Override // h5.InterfaceC3269t
    @Z4.a(name = "animationType")
    public void setAnimationType(c view, String animationType) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (animationType != null) {
            view.setAnimationType(animationType);
        }
    }

    @Override // h5.InterfaceC3269t
    @Z4.a(name = "hardwareAccelerated")
    public void setHardwareAccelerated(c view, boolean hardwareAccelerated) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHardwareAccelerated(hardwareAccelerated);
    }

    @Override // h5.InterfaceC3269t
    @Z4.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(c view, boolean statusBarTranslucent) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarTranslucent(statusBarTranslucent);
    }

    @Override // h5.InterfaceC3269t
    @Z4.a(name = "transparent")
    public void setTransparent(c view, boolean transparent) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTransparent(transparent);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(c view, C1973v0 props, E0 stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        return null;
    }
}
