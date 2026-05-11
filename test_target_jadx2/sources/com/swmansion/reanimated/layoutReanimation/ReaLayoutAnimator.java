package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C1936c0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.h;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import d5.C2983e;
import d5.InterfaceC2984f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
class ReaLayoutAnimator extends C2983e {
    private final ReactApplicationContext mContext;
    private final WeakReference<C1936c0> mWeakNativeViewHierarchyManager;
    private AnimationsManager mAnimationsManager = null;
    private volatile boolean mInitialized = false;
    private final ArrayList<View> viewsToSnapshot = new ArrayList<>();

    ReaLayoutAnimator(ReactApplicationContext reactApplicationContext, C1936c0 c1936c0) {
        this.mContext = reactApplicationContext;
        this.mWeakNativeViewHierarchyManager = new WeakReference<>(c1936c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteView$0(com.facebook.react.uimanager.events.d dVar) {
        if (dVar.getEventName().equals("topWillDisappear")) {
            getAnimationsManager().notifyAboutScreenWillDisappear();
        }
    }

    @Override // d5.C2983e
    public void applyLayoutUpdate(View view, int i10, int i11, int i12, int i13) {
        if (!isLayoutAnimationEnabled()) {
            super.applyLayoutUpdate(view, i10, i11, i12, i13);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        maybeInit();
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            Snapshot snapshot = new Snapshot(view, this.mWeakNativeViewHierarchyManager.get());
            view.layout(i10, i11, i12 + i10, i13 + i11);
            this.mAnimationsManager.onViewUpdate(view, snapshot, new Snapshot(view, this.mWeakNativeViewHierarchyManager.get()));
            return;
        }
        if (!this.mAnimationsManager.hasAnimationForTag(view.getId(), 1)) {
            super.applyLayoutUpdate(view, i10, i11, i12, i13);
            this.mAnimationsManager.maybeRegisterSharedView(view);
        } else {
            view.layout(i10, i11, i12 + i10, i13 + i11);
            if (view.getId() != -1) {
                this.viewsToSnapshot.add(view);
            }
        }
    }

    @Override // d5.C2983e
    public void deleteView(View view, final InterfaceC2984f interfaceC2984f) {
        if (!isLayoutAnimationEnabled()) {
            super.deleteView(view, interfaceC2984f);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        C1936c0 c1936c0 = this.mWeakNativeViewHierarchyManager.get();
        try {
            if (c1936c0.resolveViewManager(view.getId()).getName().equals(ScreenViewManager.REACT_CLASS) && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                try {
                    if (c1936c0.resolveViewManager(((View) view.getParent().getParent()).getId()).getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                        this.mAnimationsManager.cancelAnimationsInSubviews(view);
                        super.deleteView(view, interfaceC2984f);
                        EventDispatcher c10 = L0.c((ReactContext) view.getContext(), view.getId());
                        if (c10 != null) {
                            c10.b(new h() { // from class: com.swmansion.reanimated.layoutReanimation.a
                                @Override // com.facebook.react.uimanager.events.h
                                public final void onEventDispatch(com.facebook.react.uimanager.events.d dVar) {
                                    ReaLayoutAnimator.this.lambda$deleteView$0(dVar);
                                }
                            });
                            return;
                        }
                        return;
                    }
                } catch (Q e10) {
                    e10.printStackTrace();
                    this.mAnimationsManager.cancelAnimationsInSubviews(view);
                    super.deleteView(view, interfaceC2984f);
                    return;
                }
            }
            maybeInit();
            AnimationsManager animationsManager = this.mAnimationsManager;
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            Objects.requireNonNull(interfaceC2984f);
            animationsManager.onViewRemoval(view, viewGroup, new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.b
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC2984f.this.a();
                }
            });
        } catch (Q e11) {
            e11.printStackTrace();
            this.mAnimationsManager.cancelAnimationsInSubviews(view);
            super.deleteView(view, interfaceC2984f);
        }
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationsManager;
    }

    public boolean isLayoutAnimationEnabled() {
        if (!this.mContext.hasActiveReactInstance()) {
            return false;
        }
        maybeInit();
        return this.mAnimationsManager.isLayoutAnimationEnabled();
    }

    public void maybeInit() {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        AnimationsManager animationsManager = ((ReanimatedModule) this.mContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
        this.mAnimationsManager = animationsManager;
        animationsManager.setReanimatedNativeHierarchyManager((ReanimatedNativeHierarchyManager) this.mWeakNativeViewHierarchyManager.get());
    }

    @Override // d5.C2983e
    public void reset() {
        super.reset();
        Iterator<View> it = this.viewsToSnapshot.iterator();
        while (it.hasNext()) {
            View next = it.next();
            this.mAnimationsManager.onViewCreate(next, (ViewGroup) next.getParent(), new Snapshot(next, this.mWeakNativeViewHierarchyManager.get()));
        }
        this.viewsToSnapshot.clear();
    }

    @Override // d5.C2983e
    public boolean shouldAnimateLayout(View view) {
        return !isLayoutAnimationEnabled() ? super.shouldAnimateLayout(view) : (view == null || view.getParent() == null) ? false : true;
    }
}
