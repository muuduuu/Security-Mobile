package com.facebook.react.fabric.mounting;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c3.AbstractC1721a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.InterfaceC1962p0;
import com.facebook.react.uimanager.InterfaceC1965r0;
import com.facebook.react.uimanager.O;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.i1;
import j0.j;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import r4.AbstractC4012a;
import s5.C4313a;
import x4.C5109a;

/* loaded from: classes.dex */
public class SurfaceMountingManager {
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES;
    public static final String TAG = "SurfaceMountingManager";
    private Y4.a mJSResponderHandler;
    private MountingManager.MountItemExecutor mMountItemExecutor;
    private RootViewManager mRootViewManager;
    private final int mSurfaceId;
    private j mTagSetForStoppedSurface;
    private F0 mThemedReactContext;
    private i1 mViewManagerRegistry;
    private volatile boolean mIsStopped = false;
    private volatile boolean mRootViewAttached = false;
    private ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    private Queue<MountItem> mOnViewAttachMountItems = new ArrayDeque();
    private final Set<Integer> mErroneouslyReaddedReactTags = new HashSet();
    private final Set<Integer> mViewsWithActiveTouches = new HashSet();
    private final Set<Integer> mViewsToDeleteAfterTouchFinishes = new HashSet();

    private static class PendingViewEvent {
        private final boolean mCanCoalesceEvent;
        private final int mEventCategory;
        private final String mEventName;
        private final WritableMap mParams;

        public PendingViewEvent(String str, WritableMap writableMap, int i10, boolean z10) {
            this.mEventName = str;
            this.mParams = writableMap;
            this.mEventCategory = i10;
            this.mCanCoalesceEvent = z10;
        }

        public void dispatch(EventEmitterWrapper eventEmitterWrapper) {
            if (this.mCanCoalesceEvent) {
                eventEmitterWrapper.dispatchUnique(this.mEventName, this.mParams);
            } else {
                eventEmitterWrapper.dispatch(this.mEventName, this.mParams, this.mEventCategory);
            }
        }
    }

    static {
        C5109a c5109a = C5109a.f44774a;
        SHOW_CHANGED_VIEW_HIERARCHIES = false;
    }

    public SurfaceMountingManager(int i10, Y4.a aVar, i1 i1Var, RootViewManager rootViewManager, MountingManager.MountItemExecutor mountItemExecutor, F0 f02) {
        this.mSurfaceId = i10;
        this.mJSResponderHandler = aVar;
        this.mViewManagerRegistry = i1Var;
        this.mRootViewManager = rootViewManager;
        this.mMountItemExecutor = mountItemExecutor;
        this.mThemedReactContext = f02;
    }

    private void addRootView(final View view) {
        if (isStopped()) {
            return;
        }
        this.mTagToViewState.put(Integer.valueOf(this.mSurfaceId), new ViewState(this.mSurfaceId, view, this.mRootViewManager, true));
        Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.a
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceMountingManager.this.lambda$addRootView$0(view);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    private void executeMountItemsOnViewAttach() {
        this.mMountItemExecutor.executeItems(this.mOnViewAttachMountItems);
    }

    private ViewState getNullableViewState(int i10) {
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i10));
    }

    private static O getViewGroupManager(ViewState viewState) {
        NativeModule nativeModule = viewState.mViewManager;
        if (nativeModule != null) {
            return (O) nativeModule;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    private ViewState getViewState(int i10) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i10));
        if (viewState != null) {
            return viewState;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i10 + ". Surface stopped: " + isStopped());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$addRootView$0(View view) {
        if (isStopped()) {
            return;
        }
        if (view.getId() == this.mSurfaceId) {
            ReactSoftExceptionLogger.logSoftException(TAG, new Q("Race condition in addRootView detected. Trying to set an id of [" + this.mSurfaceId + "] on the RootView, but that id has already been set. "));
        } else if (view.getId() != -1) {
            String str = TAG;
            AbstractC1721a.o(str, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(view.getId()), Integer.valueOf(this.mSurfaceId));
            ReactSoftExceptionLogger.logSoftException(str, new Q("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
        }
        view.setId(this.mSurfaceId);
        if (view instanceof InterfaceC1965r0) {
            ((InterfaceC1965r0) view).setRootViewTag(this.mSurfaceId);
        }
        if (!G4.a.j()) {
            this.mRootViewAttached = true;
        }
        executeMountItemsOnViewAttach();
        if (G4.a.j()) {
            this.mRootViewAttached = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopSurface$1() {
        if (G4.a.h()) {
            this.mViewManagerRegistry.i(this.mSurfaceId);
        }
        this.mTagSetForStoppedSurface = new j();
        for (Map.Entry<Integer, ViewState> entry : this.mTagToViewState.entrySet()) {
            this.mTagSetForStoppedSurface.n(entry.getKey().intValue(), this);
            onViewStateDeleted(entry.getValue());
        }
        this.mTagToViewState = null;
        this.mJSResponderHandler = null;
        this.mRootViewManager = null;
        this.mMountItemExecutor = null;
        this.mThemedReactContext = null;
        this.mOnViewAttachMountItems.clear();
        AbstractC1721a.m(TAG, "Surface [" + this.mSurfaceId + "] was stopped on SurfaceMountingManager.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logViewHierarchy(ViewGroup viewGroup, boolean z10) {
        int id2 = viewGroup.getId();
        AbstractC1721a.m(TAG, "  <ViewGroup tag=" + id2 + " class=" + viewGroup.getClass().toString() + ">");
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            AbstractC1721a.m(TAG, "     <View idx=" + i10 + " tag=" + viewGroup.getChildAt(i10).getId() + " class=" + viewGroup.getChildAt(i10).getClass().toString() + ">");
        }
        String str = TAG;
        AbstractC1721a.m(str, "  </ViewGroup tag=" + id2 + ">");
        if (z10) {
            AbstractC1721a.m(str, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                int id3 = viewGroup2 == null ? -1 : viewGroup2.getId();
                AbstractC1721a.m(TAG, "<ViewParent tag=" + id3 + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    private void onViewStateDeleted(ViewState viewState) {
        E0 e02 = viewState.mStateWrapper;
        if (e02 != null) {
            e02.destroyState();
            viewState.mStateWrapper = null;
        }
        EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            viewState.mEventEmitter = null;
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewState.mIsRoot || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(viewState.mView);
    }

    public void addViewAt(final int i10, final int i11, final int i12) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        View view = viewState.mView;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i10 + " - Tag: " + i11 + " - Index: " + i12;
            AbstractC1721a.m(TAG, str);
            throw new IllegalStateException(str);
        }
        final ViewGroup viewGroup = (ViewGroup) view;
        ViewState viewState2 = getViewState(i11);
        View view2 = viewState2.mView;
        if (view2 == null) {
            throw new IllegalStateException("Unable to find view for viewState " + viewState2 + " and tag " + i11);
        }
        boolean z10 = SHOW_CHANGED_VIEW_HIERARCHIES;
        if (z10) {
            AbstractC1721a.m(TAG, "addViewAt: [" + i11 + "] -> [" + i10 + "] idx: " + i12 + " BEFORE");
            logViewHierarchy(viewGroup, false);
        }
        ViewParent parent = view2.getParent();
        if (parent != null) {
            boolean z11 = parent instanceof ViewGroup;
            int id2 = z11 ? ((ViewGroup) parent).getId() : -1;
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("addViewAt: cannot insert view [" + i11 + "] into parent [" + i10 + "]: View already has a parent: [" + id2 + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view2.getClass().getSimpleName()));
            if (z11) {
                ((ViewGroup) parent).removeView(view2);
            }
            this.mErroneouslyReaddedReactTags.add(Integer.valueOf(i11));
        }
        try {
            getViewGroupManager(viewState).addView(viewGroup, view2, i12);
            if (z10) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC1721a.m(SurfaceMountingManager.TAG, "addViewAt: [" + i11 + "] -> [" + i10 + "] idx: " + i12 + " AFTER");
                        SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            throw new IllegalStateException("addViewAt: failed to insert view [" + i11 + "] into parent [" + i10 + "] at index " + i12, e10);
        }
    }

    public void attachRootView(View view, F0 f02) {
        this.mThemedReactContext = f02;
        addRootView(view);
    }

    public void createView(String str, int i10, ReadableMap readableMap, E0 e02, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null || nullableViewState.mView == null) {
            createViewUnsafe(str, i10, readableMap, e02, eventEmitterWrapper, z10);
        }
    }

    public void createViewUnsafe(String str, int i10, ReadableMap readableMap, E0 e02, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        C4313a.c(0L, "SurfaceMountingManager::createViewUnsafe(" + str + ")");
        try {
            C1973v0 c1973v0 = new C1973v0(readableMap);
            ViewState viewState = new ViewState(i10);
            viewState.mCurrentProps = c1973v0;
            viewState.mStateWrapper = e02;
            viewState.mEventEmitter = eventEmitterWrapper;
            this.mTagToViewState.put(Integer.valueOf(i10), viewState);
            if (z10) {
                ViewManager c10 = this.mViewManagerRegistry.c(str);
                viewState.mView = c10.createView(i10, this.mThemedReactContext, c1973v0, e02, this.mJSResponderHandler);
                viewState.mViewManager = c10;
            }
        } finally {
            C4313a.i(0L);
        }
    }

    public void deleteView(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException("Unable to find viewState for tag: " + i10 + " for deleteView"));
            return;
        }
        if (G4.a.e() && this.mViewsWithActiveTouches.contains(Integer.valueOf(i10))) {
            this.mViewsToDeleteAfterTouchFinishes.add(Integer.valueOf(i10));
        } else {
            this.mTagToViewState.remove(Integer.valueOf(i10));
            onViewStateDeleted(nullableViewState);
        }
    }

    public void enqueuePendingEvent(int i10, String str, boolean z10, WritableMap writableMap, int i11) {
        final ViewState viewState;
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null || (viewState = concurrentHashMap.get(Integer.valueOf(i10))) == null) {
            return;
        }
        final PendingViewEvent pendingViewEvent = new PendingViewEvent(str, writableMap, i11, z10);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewState viewState2 = viewState;
                EventEmitterWrapper eventEmitterWrapper = viewState2.mEventEmitter;
                if (eventEmitterWrapper != null) {
                    pendingViewEvent.dispatch(eventEmitterWrapper);
                    return;
                }
                if (viewState2.mPendingEventQueue == null) {
                    viewState2.mPendingEventQueue = new LinkedList();
                }
                viewState.mPendingEventQueue.add(pendingViewEvent);
            }
        });
    }

    public F0 getContext() {
        return this.mThemedReactContext;
    }

    public EventEmitterWrapper getEventEmitter(int i10) {
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            return null;
        }
        return nullableViewState.mEventEmitter;
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public View getView(int i10) {
        ViewState nullableViewState = getNullableViewState(i10);
        View view = nullableViewState == null ? null : nullableViewState.mView;
        if (view != null) {
            return view;
        }
        throw new Q("Trying to resolve view with tag " + i10 + " which doesn't exist");
    }

    public boolean getViewExists(int i10) {
        j jVar = this.mTagSetForStoppedSurface;
        if (jVar != null && jVar.h(i10)) {
            return true;
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i10));
    }

    public boolean isRootViewAttached() {
        return this.mRootViewAttached;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public void markActiveTouchForTag(int i10) {
        if (G4.a.e()) {
            this.mViewsWithActiveTouches.add(Integer.valueOf(i10));
        }
    }

    public void preallocateView(String str, int i10, ReadableMap readableMap, E0 e02, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped() && getNullableViewState(i10) == null) {
            createViewUnsafe(str, i10, readableMap, e02, null, z10);
        }
    }

    public void printSurfaceState() {
        AbstractC1721a.o(TAG, "Views created for surface {%d}:", Integer.valueOf(getSurfaceId()));
        for (ViewState viewState : this.mTagToViewState.values()) {
            ViewManager viewManager = viewState.mViewManager;
            Integer num = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = viewState.mView;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                num = Integer.valueOf(view2.getId());
            }
            AbstractC1721a.o(TAG, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(viewState.mReactTag), num, Boolean.valueOf(viewState.mIsRoot));
        }
    }

    @Deprecated
    public void receiveCommand(int i10, int i11, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i10 + "] for commandId: " + i11);
        }
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i10);
        }
        View view = nullableViewState.mView;
        if (view != null) {
            viewManager.receiveCommand((ViewManager) view, i11, readableArray);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
    }

    public void removeViewAt(final int i10, final int i11, int i12) {
        final int i13;
        if (isStopped()) {
            return;
        }
        if (this.mErroneouslyReaddedReactTags.contains(Integer.valueOf(i10))) {
            ReactSoftExceptionLogger.logSoftException(TAG, new Q("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + i10 + "]"));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException("Unable to find viewState for tag: [" + i11 + "] for removeViewAt"));
            return;
        }
        View view = nullableViewState.mView;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i11 + " - Tag: " + i10 + " - Index: " + i12;
            AbstractC1721a.m(TAG, str);
            throw new IllegalStateException(str);
        }
        final ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalStateException("Unable to find view for tag [" + i11 + "]");
        }
        int i14 = 0;
        if (SHOW_CHANGED_VIEW_HIERARCHIES) {
            AbstractC1721a.m(TAG, "removeViewAt: [" + i10 + "] -> [" + i11 + "] idx: " + i12 + " BEFORE");
            logViewHierarchy(viewGroup, false);
        }
        O viewGroupManager = getViewGroupManager(nullableViewState);
        View childAt = viewGroupManager.getChildAt(viewGroup, i12);
        int id2 = childAt != null ? childAt.getId() : -1;
        if (id2 != i10) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i14 >= childCount) {
                    i14 = -1;
                    break;
                } else if (viewGroup.getChildAt(i14).getId() == i10) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 == -1) {
                AbstractC1721a.m(TAG, "removeViewAt: [" + i10 + "] -> [" + i11 + "] @" + i12 + ": view already removed from parent! Children in parent: " + childCount);
                return;
            }
            logViewHierarchy(viewGroup, true);
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Tried to remove view [" + i10 + "] of parent [" + i11 + "] at index " + i12 + ", but got view tag " + id2 + " - actual index of view: " + i14));
            i13 = i14;
        } else {
            i13 = i12;
        }
        try {
            viewGroupManager.removeViewAt(viewGroup, i13);
            if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC1721a.m(SurfaceMountingManager.TAG, "removeViewAt: [" + i10 + "] -> [" + i11 + "] idx: " + i13 + " AFTER");
                        SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                    }
                });
            }
        } catch (RuntimeException e10) {
            int childCount2 = viewGroupManager.getChildCount(viewGroup);
            logViewHierarchy(viewGroup, true);
            throw new IllegalStateException("Cannot remove child at index " + i13 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e10);
        }
    }

    public void scheduleMountItemOnViewAttach(MountItem mountItem) {
        this.mOnViewAttachMountItems.add(mountItem);
    }

    public void sendAccessibilityEvent(int i10, int i11) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mViewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
        }
        View view = viewState.mView;
        if (view != null) {
            view.sendAccessibilityEvent(i11);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i10, int i11, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        if (!z10) {
            this.mJSResponderHandler.d(i11, null);
            return;
        }
        ViewState viewState = getViewState(i10);
        View view = viewState.mView;
        if (i11 != i10 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.d(i11, (ViewParent) view);
            return;
        }
        if (view == 0) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i10 + "].");
            return;
        }
        if (viewState.mIsRoot) {
            SoftAssertions.assertUnreachable("Cannot block native responder on [" + i10 + "] that is a root view");
        }
        this.mJSResponderHandler.d(i11, view.getParent());
    }

    public void stopSurface() {
        AbstractC1721a.m(TAG, "Stopping surface [" + this.mSurfaceId + "]");
        if (isStopped()) {
            return;
        }
        this.mIsStopped = true;
        for (ViewState viewState : this.mTagToViewState.values()) {
            E0 e02 = viewState.mStateWrapper;
            if (e02 != null) {
                e02.destroyState();
                viewState.mStateWrapper = null;
            }
            EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
            if (eventEmitterWrapper != null) {
                eventEmitterWrapper.destroy();
                viewState.mEventEmitter = null;
            }
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.b
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceMountingManager.this.lambda$stopSurface$1();
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    public void sweepActiveTouchForTag(int i10) {
        if (G4.a.e()) {
            this.mViewsWithActiveTouches.remove(Integer.valueOf(i10));
            if (this.mViewsToDeleteAfterTouchFinishes.contains(Integer.valueOf(i10))) {
                this.mViewsToDeleteAfterTouchFinishes.remove(Integer.valueOf(i10));
                deleteView(i10);
            }
        }
    }

    public void updateEventEmitter(int i10, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i10));
        if (viewState == null) {
            viewState = new ViewState(i10);
            this.mTagToViewState.put(Integer.valueOf(i10), viewState);
        }
        EventEmitterWrapper eventEmitterWrapper2 = viewState.mEventEmitter;
        viewState.mEventEmitter = eventEmitterWrapper;
        if (eventEmitterWrapper2 != eventEmitterWrapper && eventEmitterWrapper2 != null) {
            eventEmitterWrapper2.destroy();
        }
        Queue<PendingViewEvent> queue = viewState.mPendingEventQueue;
        if (queue != null) {
            Iterator<PendingViewEvent> it = queue.iterator();
            while (it.hasNext()) {
                it.next().dispatch(eventEmitterWrapper);
            }
            viewState.mPendingEventQueue = null;
        }
    }

    public void updateLayout(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
        if (G4.a.o()) {
            int i18 = 1;
            if (i17 == 1) {
                i18 = 0;
            } else if (i17 != 2) {
                i18 = 2;
            }
            view.setLayoutDirection(i18);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof A0) {
            parent.requestLayout();
        }
        NativeModule nativeModule = getViewState(i11).mViewManager;
        O o10 = nativeModule != null ? (O) nativeModule : null;
        if (o10 == null || !o10.needsCustomLayoutForChildren()) {
            view.layout(i12, i13, i14 + i12, i15 + i13);
        }
        int i19 = i16 == 0 ? 4 : 0;
        if (view.getVisibility() != i19) {
            view.setVisibility(i19);
        }
    }

    public void updateOverflowInset(int i10, int i11, int i12, int i13, int i14) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mIsRoot) {
            return;
        }
        KeyEvent.Callback callback = viewState.mView;
        if (callback != null) {
            if (callback instanceof InterfaceC1962p0) {
                ((InterfaceC1962p0) callback).setOverflowInset(i11, i12, i13, i14);
            }
        } else {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
    }

    public void updatePadding(int i10, int i11, int i12, int i13, int i14) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager != null) {
            viewManager.setPadding(view, i11, i12, i13, i14);
            return;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    public void updateProps(int i10, ReadableMap readableMap) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        viewState.mCurrentProps = new C1973v0(readableMap);
        View view = viewState.mView;
        if (view != null) {
            ((ViewManager) AbstractC4012a.c(viewState.mViewManager)).updateProperties(view, viewState.mCurrentProps);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag [" + i10 + "]");
    }

    public void updateState(int i10, E0 e02) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i10);
        E0 e03 = viewState.mStateWrapper;
        viewState.mStateWrapper = e02;
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager == null) {
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i10);
        }
        Object updateState = viewManager.updateState(viewState.mView, viewState.mCurrentProps, e02);
        if (updateState != null) {
            viewManager.updateExtraData(viewState.mView, updateState);
        }
        if (e03 != null) {
            e03.destroyState();
        }
    }

    private static class ViewState {
        ReadableMap mCurrentLocalData;
        C1973v0 mCurrentProps;
        EventEmitterWrapper mEventEmitter;
        final boolean mIsRoot;
        Queue<PendingViewEvent> mPendingEventQueue;
        final int mReactTag;
        E0 mStateWrapper;
        View mView;
        ViewManager mViewManager;

        public String toString() {
            return "ViewState [" + this.mReactTag + "] - isRoot: " + this.mIsRoot + " - props: " + this.mCurrentProps + " - localData: " + this.mCurrentLocalData + " - viewManager: " + this.mViewManager + " - isLayoutOnly: " + (this.mViewManager == null);
        }

        private ViewState(int i10) {
            this(i10, null, null, false);
        }

        private ViewState(int i10, View view, ViewManager viewManager, boolean z10) {
            this.mCurrentProps = null;
            this.mCurrentLocalData = null;
            this.mStateWrapper = null;
            this.mEventEmitter = null;
            this.mPendingEventQueue = null;
            this.mReactTag = i10;
            this.mView = view;
            this.mIsRoot = z10;
            this.mViewManager = viewManager;
        }
    }

    public void receiveCommand(int i10, String str, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState != null) {
            ViewManager viewManager = nullableViewState.mViewManager;
            if (viewManager != null) {
                View view = nullableViewState.mView;
                if (view != null) {
                    viewManager.receiveCommand((ViewManager) view, str, readableArray);
                    return;
                }
                throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
            }
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i10 + " for commandId: " + str);
    }
}
