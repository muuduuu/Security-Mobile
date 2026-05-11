package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.f;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.soloader.SoLoader;
import h5.C3281z;
import h5.InterfaceC3231A;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import r4.AbstractC4012a;
import u5.C4870a;
import v4.AbstractC4929e;

@K4.a(name = "RNCViewPager")
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001IB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017¢\u0006\u0004\b.\u0010/J#\u00100\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b2\u0010)J#\u00103\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b3\u00101J!\u00104\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b4\u0010)J!\u00105\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b5\u0010)J#\u00106\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b6\u00101J!\u00107\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017¢\u0006\u0004\b7\u0010/J#\u00108\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b8\u00101J!\u00109\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017¢\u0006\u0004\b9\u0010/J'\u0010<\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020*¢\u0006\u0004\b<\u0010=J!\u0010>\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010:\u001a\u00020\u001aH\u0016¢\u0006\u0004\b>\u0010)J!\u0010?\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010:\u001a\u00020\u001aH\u0016¢\u0006\u0004\b?\u0010)J!\u0010A\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010@\u001a\u00020*H\u0016¢\u0006\u0004\bA\u0010/J'\u0010D\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0C0BH\u0016¢\u0006\u0004\bD\u0010ER\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativepagerview/b;", "Lh5/A;", "<init>", "()V", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", BuildConfig.FLAVOR, "receiveCommand", "(Lcom/reactnativepagerview/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/uimanager/F0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/reactnativepagerview/b;", "host", "Landroid/view/View;", "child", BuildConfig.FLAVOR, "index", "addView", "(Lcom/reactnativepagerview/b;Landroid/view/View;I)V", "parent", "getChildCount", "(Lcom/reactnativepagerview/b;)I", "getChildAt", "(Lcom/reactnativepagerview/b;I)Landroid/view/View;", "view", "removeView", "(Lcom/reactnativepagerview/b;Landroid/view/View;)V", "removeAllViews", "(Lcom/reactnativepagerview/b;)V", "removeViewAt", "(Lcom/reactnativepagerview/b;I)V", BuildConfig.FLAVOR, "needsCustomLayoutForChildren", "()Z", "value", "setScrollEnabled", "(Lcom/reactnativepagerview/b;Z)V", "setLayoutDirection", "(Lcom/reactnativepagerview/b;Ljava/lang/String;)V", "setInitialPage", "setOrientation", "setOffscreenPageLimit", "setPageMargin", "setOverScrollMode", "setOverdrag", "setKeyboardDismissMode", "setUseLegacy", "selectedPage", "scrollWithAnimation", "goTo", "(Lcom/reactnativepagerview/b;IZ)V", "setPage", "setPageWithoutAnimation", "scrollEnabled", "setScrollEnabledImperatively", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "mDelegate", "Lcom/facebook/react/uimanager/c1;", "Companion", C4870a.f43493a, "react-native-pager-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagerViewViewManager extends ViewGroupManager<com.reactnativepagerview.b> implements InterfaceC3231A {
    private final c1 mDelegate = new C3281z(this);

    public static final class b extends f.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F0 f29397a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.reactnativepagerview.b f29398b;

        b(F0 f02, com.reactnativepagerview.b bVar) {
            this.f29397a = f02;
            this.f29398b = bVar;
        }

        @Override // androidx.viewpager2.widget.f.i
        public void a(int i10) {
            String str;
            super.a(i10);
            if (i10 == 0) {
                str = "idle";
            } else if (i10 == 1) {
                str = "dragging";
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported pageScrollState");
                }
                str = "settling";
            }
            EventDispatcher c10 = L0.c(this.f29397a, this.f29398b.getId());
            if (c10 != null) {
                c10.c(new W9.b(this.f29398b.getId(), str));
            }
        }

        @Override // androidx.viewpager2.widget.f.i
        public void b(int i10, float f10, int i11) {
            super.b(i10, f10, i11);
            EventDispatcher c10 = L0.c(this.f29397a, this.f29398b.getId());
            if (c10 != null) {
                c10.c(new W9.a(this.f29398b.getId(), i10, f10));
            }
        }

        @Override // androidx.viewpager2.widget.f.i
        public void c(int i10) {
            super.c(i10);
            EventDispatcher c10 = L0.c(this.f29397a, this.f29398b.getId());
            if (c10 != null) {
                c10.c(new W9.c(this.f29398b.getId(), i10));
            }
        }
    }

    static {
        String str = a.f29399a;
        if (str != null) {
            SoLoader.t(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(androidx.viewpager2.widget.f vp, F0 reactContext, com.reactnativepagerview.b host) {
        Intrinsics.checkNotNullParameter(vp, "$vp");
        Intrinsics.checkNotNullParameter(reactContext, "$reactContext");
        Intrinsics.checkNotNullParameter(host, "$host");
        vp.g(new b(reactContext, host));
        EventDispatcher c10 = L0.c(reactContext, host.getId());
        if (c10 != null) {
            c10.c(new W9.c(host.getId(), vp.getCurrentItem()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate, reason: from getter */
    protected c1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map<String, Map<String, String>> f10 = AbstractC4929e.f("topPageScroll", AbstractC4929e.d("registrationName", "onPageScroll"), "topPageScrollStateChanged", AbstractC4929e.d("registrationName", "onPageScrollStateChanged"), "topPageSelected", AbstractC4929e.d("registrationName", "onPageSelected"));
        Intrinsics.checkNotNullExpressionValue(f10, "of(...)");
        return f10;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCViewPager";
    }

    public final void goTo(com.reactnativepagerview.b root, int selectedPage, boolean scrollWithAnimation) {
        if (root == null) {
            return;
        }
        i iVar = i.f29413a;
        androidx.viewpager2.widget.f h10 = iVar.h(root);
        AbstractC4012a.c(h10);
        RecyclerView.h adapter = h10.getAdapter();
        Integer valueOf = adapter != null ? Integer.valueOf(adapter.e()) : null;
        if (valueOf == null || valueOf.intValue() <= 0 || selectedPage < 0 || selectedPage >= valueOf.intValue()) {
            return;
        }
        iVar.p(h10, selectedPage, scrollWithAnimation);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.P
    public boolean needsCustomLayoutForChildren() {
        return i.f29413a.i();
    }

    @Override // h5.InterfaceC3231A
    @Z4.a(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(com.reactnativepagerview.b view, String value) {
    }

    @Override // h5.InterfaceC3231A
    @Z4.a(name = "overdrag")
    public void setOverdrag(com.reactnativepagerview.b view, boolean value) {
    }

    @Override // h5.InterfaceC3231A
    @Z4.a(name = "useLegacy")
    public void setUseLegacy(com.reactnativepagerview.b view, boolean value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.reactnativepagerview.b createViewInstance(final F0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        final com.reactnativepagerview.b bVar = new com.reactnativepagerview.b(reactContext);
        bVar.setId(View.generateViewId());
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        bVar.setSaveEnabled(false);
        final androidx.viewpager2.widget.f fVar = new androidx.viewpager2.widget.f(reactContext);
        fVar.setAdapter(new j());
        fVar.setSaveEnabled(false);
        fVar.post(new Runnable() { // from class: com.reactnativepagerview.d
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.createViewInstance$lambda$0(androidx.viewpager2.widget.f.this, reactContext, bVar);
            }
        });
        bVar.addView(fVar);
        return bVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.reactnativepagerview.b root, String commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.mDelegate.a(root, commandId, args);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public void removeAllViews(com.reactnativepagerview.b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        i.f29413a.l(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(com.reactnativepagerview.b parent, View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        i.f29413a.m(parent, view);
    }

    @Override // h5.InterfaceC3231A
    @Z4.a(defaultInt = 0, name = "initialPage")
    public void setInitialPage(com.reactnativepagerview.b view, int value) {
        if (view != null) {
            i.f29413a.q(view, value);
        }
    }

    @Override // h5.InterfaceC3231A
    @Z4.a(name = "layoutDirection")
    public void setLayoutDirection(com.reactnativepagerview.b view, String value) {
        if (view == null || value == null) {
            return;
        }
        i.f29413a.s(view, value);
    }

    @Override // h5.InterfaceC3231A
    @Z4.a(defaultInt = -1, name = "offscreenPageLimit")
    public void setOffscreenPageLimit(com.reactnativepagerview.b view, int value) {
        if (view != null) {
            i.f29413a.t(view, value);
        }
    }

    @Override // h5.InterfaceC3231A
    @Z4.a(name = "orientation")
    public void setOrientation(com.reactnativepagerview.b view, String value) {
        if (view == null || value == null) {
            return;
        }
        i.f29413a.u(view, value);
    }

    @Override // h5.InterfaceC3231A
    @Z4.a(name = "overScrollMode")
    public void setOverScrollMode(com.reactnativepagerview.b view, String value) {
        if (view == null || value == null) {
            return;
        }
        i.f29413a.v(view, value);
    }

    @Override // h5.InterfaceC3231A
    public void setPage(com.reactnativepagerview.b view, int selectedPage) {
        goTo(view, selectedPage, true);
    }

    @Override // h5.InterfaceC3231A
    @Z4.a(defaultInt = 0, name = "pageMargin")
    public void setPageMargin(com.reactnativepagerview.b view, int value) {
        if (view != null) {
            i.f29413a.w(view, value);
        }
    }

    @Override // h5.InterfaceC3231A
    public void setPageWithoutAnimation(com.reactnativepagerview.b view, int selectedPage) {
        goTo(view, selectedPage, false);
    }

    @Override // h5.InterfaceC3231A
    @Z4.a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(com.reactnativepagerview.b view, boolean value) {
        if (view != null) {
            i.f29413a.y(view, value);
        }
    }

    @Override // h5.InterfaceC3231A
    public void setScrollEnabledImperatively(com.reactnativepagerview.b view, boolean scrollEnabled) {
        if (view != null) {
            i.f29413a.y(view, scrollEnabled);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(com.reactnativepagerview.b host, View child, int index) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(child, "child");
        i.f29413a.e(host, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(com.reactnativepagerview.b parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return i.f29413a.f(parent, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(com.reactnativepagerview.b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return i.f29413a.g(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(com.reactnativepagerview.b parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        i.f29413a.n(parent, index);
    }
}
