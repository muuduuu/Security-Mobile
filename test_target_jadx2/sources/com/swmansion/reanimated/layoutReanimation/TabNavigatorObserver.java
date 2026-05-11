package com.swmansion.reanimated.layoutReanimation;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.G;
import com.swmansion.reanimated.layoutReanimation.TabNavigatorObserver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class TabNavigatorObserver {
    private final Set<Integer> mFragmentsWithListenerRegistry = new HashSet();
    private final ReaLayoutAnimator mReaLayoutAnimator;

    class FragmentLifecycleCallbacks extends G.k {
        private View firstScreen;
        private Method getActivityState;
        private Method getScreen;
        private final Set<Integer> screenTagsWithListener = new HashSet();
        private final List<View> nextTransition = new ArrayList();

        public FragmentLifecycleCallbacks(ComponentCallbacksC1573o componentCallbacksC1573o) {
            if (ScreensHelper.isScreenFragment(componentCallbacksC1573o)) {
                try {
                    Method method = componentCallbacksC1573o.getClass().getMethod("getScreen", null);
                    this.getScreen = method;
                    View view = (View) method.invoke(componentCallbacksC1573o, null);
                    this.getActivityState = view.getClass().getMethod("getActivityState", null);
                    addScreenListener(view);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                    Log.e("[Reanimated]", e10.getMessage() != null ? e10.getMessage() : "Unable to get screen activity state");
                }
            }
        }

        private void addScreenListener(View view) {
            if (this.screenTagsWithListener.contains(Integer.valueOf(view.getId()))) {
                return;
            }
            this.screenTagsWithListener.add(Integer.valueOf(view.getId()));
            view.addOnAttachStateChangeListener(TabNavigatorObserver.this.new OnAttachStateChangeListener());
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.swmansion.reanimated.layoutReanimation.f
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    TabNavigatorObserver.FragmentLifecycleCallbacks.this.lambda$addScreenListener$0(view2, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addScreenListener$0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (this.nextTransition.isEmpty()) {
                return;
            }
            TabNavigatorObserver.this.mReaLayoutAnimator.getAnimationsManager().navigationTabChanged(this.nextTransition.get(0), this.nextTransition.get(1));
            this.nextTransition.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void onFragmentUpdate(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
            if (ScreensHelper.isScreenFragment(componentCallbacksC1573o)) {
                try {
                    View view = (View) this.getScreen.invoke(componentCallbacksC1573o, null);
                    if (this.getActivityState.invoke(view, null) == null) {
                        return;
                    }
                    addScreenListener(view);
                    View view2 = this.firstScreen;
                    if (view2 == null) {
                        this.firstScreen = view;
                        return;
                    }
                    if (z10) {
                        this.nextTransition.add(view2);
                        this.nextTransition.add(view);
                    } else {
                        this.nextTransition.add(view);
                        this.nextTransition.add(this.firstScreen);
                    }
                    this.firstScreen = null;
                } catch (IllegalAccessException e10) {
                    e = e10;
                    Log.e("[Reanimated]", e.getMessage() == null ? e.getMessage() : "Unable to get screen view");
                } catch (InvocationTargetException e11) {
                    e = e11;
                    Log.e("[Reanimated]", e.getMessage() == null ? e.getMessage() : "Unable to get screen view");
                }
            }
        }

        @Override // androidx.fragment.app.G.k
        public void onFragmentAttached(G g10, ComponentCallbacksC1573o componentCallbacksC1573o, Context context) {
            onFragmentUpdate(componentCallbacksC1573o, true);
        }

        @Override // androidx.fragment.app.G.k
        public void onFragmentDetached(G g10, ComponentCallbacksC1573o componentCallbacksC1573o) {
            onFragmentUpdate(componentCallbacksC1573o, false);
        }
    }

    class OnAttachStateChangeListener implements View.OnAttachStateChangeListener {
        OnAttachStateChangeListener() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            TabNavigatorObserver.this.mReaLayoutAnimator.getAnimationsManager().visitNativeTreeAndMakeSnapshot(view);
        }
    }

    public TabNavigatorObserver(ReaLayoutAnimator reaLayoutAnimator) {
        this.mReaLayoutAnimator = reaLayoutAnimator;
    }

    public void handleScreenContainerUpdate(View view) {
        try {
            ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) view.getClass().getMethod("getFragment", null).invoke(view, null);
            int id2 = componentCallbacksC1573o.getId();
            if (this.mFragmentsWithListenerRegistry.contains(Integer.valueOf(id2))) {
                return;
            }
            this.mFragmentsWithListenerRegistry.add(Integer.valueOf(id2));
            componentCallbacksC1573o.getParentFragmentManager().j1(new FragmentLifecycleCallbacks(componentCallbacksC1573o), true);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            Log.e("[Reanimated]", e10.getMessage() != null ? e10.getMessage() : "Unable to get screen fragment");
        }
    }
}
