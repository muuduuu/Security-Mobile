package com.facebook.react.views.drawer;

import P0.a;
import android.view.View;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import com.facebook.react.uimanager.events.EventDispatcher;
import h5.C3232a;
import h5.InterfaceC3234b;
import java.util.LinkedHashMap;
import java.util.Map;
import k5.C3542a;
import k5.C3543b;
import k5.C3544c;
import k5.C3545d;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = ReactDrawerLayoutManager.REACT_CLASS)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002FGB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0016\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ!\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010!J!\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b#\u0010\u000bJ!\u0010%\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b'\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$0-H\u0016¢\u0006\u0004\b.\u0010/J)\u00104\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u000102H\u0017¢\u0006\u0004\b4\u00105J)\u00104\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00106J\u001b\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002070-H\u0016¢\u0006\u0004\b8\u0010/J\u001b\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002070-H\u0016¢\u0006\u0004\b9\u0010/J'\u0010>\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020$H\u0016¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0016¢\u0006\u0004\bA\u0010BR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/drawer/a;", "Lh5/b;", "<init>", "()V", "view", BuildConfig.FLAVOR, "drawerPosition", BuildConfig.FLAVOR, "setDrawerPositionInternal", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "reactContext", "addEventEmitters", "(Lcom/facebook/react/uimanager/F0;Lcom/facebook/react/views/drawer/a;)V", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/facebook/react/views/drawer/a;", "value", "setDrawerPosition", "Lcom/facebook/react/bridge/Dynamic;", "(Lcom/facebook/react/views/drawer/a;Lcom/facebook/react/bridge/Dynamic;)V", BuildConfig.FLAVOR, "width", "setDrawerWidth", "(Lcom/facebook/react/views/drawer/a;F)V", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/Float;)V", "drawerLockMode", "setDrawerLockMode", ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER, "(Lcom/facebook/react/views/drawer/a;)V", ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER, "setKeyboardDismissMode", BuildConfig.FLAVOR, "setDrawerBackgroundColor", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/Integer;)V", "setStatusBarBackgroundColor", "elevation", "setElevation", BuildConfig.FLAVOR, "needsCustomLayoutForChildren", "()Z", BuildConfig.FLAVOR, "getCommandsMap", "()Ljava/util/Map;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/facebook/react/views/drawer/a;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", BuildConfig.FLAVOR, "getExportedViewConstants", "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", "index", "addView", "(Lcom/facebook/react/views/drawer/a;Landroid/view/View;I)V", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "delegate", "Lcom/facebook/react/uimanager/c1;", "Companion", C4870a.f43493a, "b", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReactDrawerLayoutManager extends ViewGroupManager<a> implements InterfaceC3234b {
    public static final int CLOSE_DRAWER = 2;
    public static final String COMMAND_CLOSE_DRAWER = "closeDrawer";
    public static final String COMMAND_OPEN_DRAWER = "openDrawer";
    private static final String DRAWER_POSITION = "DrawerPosition";
    private static final String DRAWER_POSITION_LEFT = "Left";
    private static final String DRAWER_POSITION_RIGHT = "Right";
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final c1 delegate = new C3232a(this);

    public static final class b implements a.e {

        /* renamed from: a, reason: collision with root package name */
        private final P0.a f22509a;

        /* renamed from: b, reason: collision with root package name */
        private final EventDispatcher f22510b;

        public b(P0.a drawerLayout, EventDispatcher eventDispatcher) {
            Intrinsics.checkNotNullParameter(drawerLayout, "drawerLayout");
            Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
            this.f22509a = drawerLayout;
            this.f22510b = eventDispatcher;
        }

        @Override // P0.a.e
        public void a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f22510b.c(new C3543b(L0.f(this.f22509a), this.f22509a.getId()));
        }

        @Override // P0.a.e
        public void b(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f22510b.c(new C3542a(L0.f(this.f22509a), this.f22509a.getId()));
        }

        @Override // P0.a.e
        public void c(int i10) {
            this.f22510b.c(new C3545d(L0.f(this.f22509a), this.f22509a.getId(), i10));
        }

        @Override // P0.a.e
        public void d(View view, float f10) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f22510b.c(new C3544c(L0.f(this.f22509a), this.f22509a.getId(), f10));
        }
    }

    private final void setDrawerPositionInternal(a view, String drawerPosition) {
        if (Intrinsics.b(drawerPosition, "left")) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (Intrinsics.b(drawerPosition, "right")) {
            view.setDrawerPosition$ReactAndroid_release(8388613);
            return;
        }
        AbstractC1721a.J("ReactNative", "drawerPosition must be 'left' or 'right', received" + drawerPosition);
        view.setDrawerPosition$ReactAndroid_release(8388611);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return G.k(t.a(COMMAND_OPEN_DRAWER, 1), t.a(COMMAND_CLOSE_DRAWER, 2));
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
        exportedCustomDirectEventTypeConstants.put("topDrawerSlide", G.e(t.a("registrationName", "onDrawerSlide")));
        exportedCustomDirectEventTypeConstants.put("topDrawerOpen", G.e(t.a("registrationName", "onDrawerOpen")));
        exportedCustomDirectEventTypeConstants.put("topDrawerClose", G.e(t.a("registrationName", "onDrawerClose")));
        exportedCustomDirectEventTypeConstants.put("topDrawerStateChanged", G.e(t.a("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return G.e(t.a(DRAWER_POSITION, G.k(t.a(DRAWER_POSITION_LEFT, 8388611), t.a(DRAWER_POSITION_RIGHT, 8388613))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.P
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // h5.InterfaceC3234b
    @Z4.a(customType = "Color", name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(a view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // h5.InterfaceC3234b
    @Z4.a(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(a view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // h5.InterfaceC3234b
    @Z4.a(customType = "Color", name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(a view, Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(F0 reactContext, a view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        EventDispatcher c10 = L0.c(reactContext, view.getId());
        if (c10 == null) {
            return;
        }
        view.a(new b(view, c10));
    }

    @Override // h5.InterfaceC3234b
    public void closeDrawer(a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.W();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new a(context);
    }

    @Override // h5.InterfaceC3234b
    public void openDrawer(a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.X();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5.equals("unlocked") != false) goto L22;
     */
    @Override // h5.InterfaceC3234b
    @Z4.a(name = "drawerLockMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDrawerLockMode(a view, String drawerLockMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (drawerLockMode != null) {
            int hashCode = drawerLockMode.hashCode();
            if (hashCode != -1292600945) {
                if (hashCode != -210949405) {
                    if (hashCode == 168848173 && drawerLockMode.equals("locked-open")) {
                        view.setDrawerLockMode(2);
                        return;
                    }
                }
            } else if (drawerLockMode.equals("locked-closed")) {
                view.setDrawerLockMode(1);
                return;
            }
            AbstractC1721a.J("ReactNative", "Unknown drawerLockMode " + drawerLockMode);
            view.setDrawerLockMode(0);
            return;
        }
        view.setDrawerLockMode(0);
    }

    @Override // h5.InterfaceC3234b
    public void setDrawerPosition(a view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
        } else {
            setDrawerPositionInternal(view, value);
        }
    }

    @Z4.a(defaultFloat = Float.NaN, name = "drawerWidth")
    public final void setDrawerWidth(a view, float width) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDrawerWidth$ReactAndroid_release(Float.isNaN(width) ? -1 : Math.round(C1944g0.f22418a.b(width)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    public void setElevation(a view, float elevation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDrawerElevation(C1944g0.f22418a.b(elevation));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(a parent, View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (getChildCount((ReactDrawerLayoutManager) parent) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (index != 0 && index != 1) {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + index + " instead.");
        }
        parent.addView(child, index);
        parent.Y();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(a root, int commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (commandId == 1) {
            root.X();
        } else {
            if (commandId != 2) {
                return;
            }
            root.W();
        }
    }

    @Z4.a(name = "drawerPosition")
    public final void setDrawerPosition(a view, Dynamic drawerPosition) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(drawerPosition, "drawerPosition");
        if (drawerPosition.isNull()) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (drawerPosition.getType() == ReadableType.Number) {
            int asInt = drawerPosition.asInt();
            if (8388611 != asInt && 8388613 != asInt) {
                AbstractC1721a.J("ReactNative", "Unknown drawerPosition " + asInt);
                view.setDrawerPosition$ReactAndroid_release(8388611);
                return;
            }
            view.setDrawerPosition$ReactAndroid_release(asInt);
            return;
        }
        if (drawerPosition.getType() == ReadableType.String) {
            setDrawerPositionInternal(view, drawerPosition.asString());
        } else {
            AbstractC1721a.J("ReactNative", "drawerPosition must be a string or int");
            view.setDrawerPosition$ReactAndroid_release(8388611);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(a root, String commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        if (Intrinsics.b(commandId, COMMAND_OPEN_DRAWER)) {
            root.X();
        } else if (Intrinsics.b(commandId, COMMAND_CLOSE_DRAWER)) {
            root.W();
        }
    }

    @Override // h5.InterfaceC3234b
    public void setDrawerWidth(a view, Float width) {
        int i10;
        Intrinsics.checkNotNullParameter(view, "view");
        if (width != null) {
            i10 = Math.round(C1944g0.f22418a.b(width.floatValue()));
        } else {
            i10 = -1;
        }
        view.setDrawerWidth$ReactAndroid_release(i10);
    }
}
