package com.facebook.react.fabric.mounting;

import android.view.View;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.i1;
import com.facebook.yoga.p;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MountingManager {
    private static final int MAX_STOPPED_SURFACE_IDS_LENGTH = 15;
    public static final String TAG = "MountingManager";
    private SurfaceMountingManager mLastQueriedSurfaceMountingManager;
    private SurfaceMountingManager mMostRecentSurfaceMountingManager;
    private final MountItemExecutor mMountItemExecutor;
    private final i1 mViewManagerRegistry;
    private final ConcurrentHashMap<Integer, SurfaceMountingManager> mSurfaceIdToManager = new ConcurrentHashMap<>();
    private final CopyOnWriteArrayList<Integer> mStoppedSurfaceIds = new CopyOnWriteArrayList<>();
    private final Y4.a mJSResponderHandler = new Y4.a();
    private final RootViewManager mRootViewManager = new RootViewManager();

    public interface MountItemExecutor {
        void executeItems(Queue<MountItem> queue);
    }

    public MountingManager(i1 i1Var, MountItemExecutor mountItemExecutor) {
        this.mViewManagerRegistry = i1Var;
        this.mMountItemExecutor = mountItemExecutor;
    }

    private SurfaceMountingManager getSurfaceMountingManager(int i10, int i11) {
        return i10 == -1 ? getSurfaceManagerForView(i11) : getSurfaceManager(i10);
    }

    public void attachRootView(int i10, View view, F0 f02) {
        SurfaceMountingManager surfaceManagerEnforced = getSurfaceManagerEnforced(i10, "attachView");
        if (surfaceManagerEnforced.isStopped()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to attach a view to a stopped surface"));
        } else {
            surfaceManagerEnforced.attachRootView(view, f02);
        }
    }

    public void clearJSResponder() {
        this.mJSResponderHandler.b();
    }

    public void enqueuePendingEvent(int i10, int i11, String str, boolean z10, WritableMap writableMap, int i12) {
        SurfaceMountingManager surfaceMountingManager = getSurfaceMountingManager(i10, i11);
        if (surfaceMountingManager == null) {
            AbstractC1721a.d(TAG, "Cannot queue event without valid surface mounting manager for tag: %d, surfaceId: %d", Integer.valueOf(i11), Integer.valueOf(i10));
        } else {
            surfaceMountingManager.enqueuePendingEvent(i11, str, z10, writableMap, i12);
        }
    }

    public EventEmitterWrapper getEventEmitter(int i10, int i11) {
        SurfaceMountingManager surfaceMountingManager = getSurfaceMountingManager(i10, i11);
        if (surfaceMountingManager == null) {
            return null;
        }
        return surfaceMountingManager.getEventEmitter(i11);
    }

    public SurfaceMountingManager getSurfaceManager(int i10) {
        SurfaceMountingManager surfaceMountingManager = this.mLastQueriedSurfaceMountingManager;
        if (surfaceMountingManager != null && surfaceMountingManager.getSurfaceId() == i10) {
            return this.mLastQueriedSurfaceMountingManager;
        }
        SurfaceMountingManager surfaceMountingManager2 = this.mMostRecentSurfaceMountingManager;
        if (surfaceMountingManager2 != null && surfaceMountingManager2.getSurfaceId() == i10) {
            return this.mMostRecentSurfaceMountingManager;
        }
        SurfaceMountingManager surfaceMountingManager3 = this.mSurfaceIdToManager.get(Integer.valueOf(i10));
        this.mLastQueriedSurfaceMountingManager = surfaceMountingManager3;
        return surfaceMountingManager3;
    }

    public SurfaceMountingManager getSurfaceManagerEnforced(int i10, String str) {
        SurfaceMountingManager surfaceManager = getSurfaceManager(i10);
        if (surfaceManager != null) {
            return surfaceManager;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for surfaceId: [" + i10 + "]. Context: " + str);
    }

    public SurfaceMountingManager getSurfaceManagerForView(int i10) {
        SurfaceMountingManager surfaceMountingManager = this.mMostRecentSurfaceMountingManager;
        if (surfaceMountingManager != null && surfaceMountingManager.getViewExists(i10)) {
            return this.mMostRecentSurfaceMountingManager;
        }
        Iterator<Map.Entry<Integer, SurfaceMountingManager>> it = this.mSurfaceIdToManager.entrySet().iterator();
        while (it.hasNext()) {
            SurfaceMountingManager value = it.next().getValue();
            if (value != this.mMostRecentSurfaceMountingManager && value.getViewExists(i10)) {
                if (this.mMostRecentSurfaceMountingManager == null) {
                    this.mMostRecentSurfaceMountingManager = value;
                }
                return value;
            }
        }
        return null;
    }

    public SurfaceMountingManager getSurfaceManagerForViewEnforced(int i10) {
        SurfaceMountingManager surfaceManagerForView = getSurfaceManagerForView(i10);
        if (surfaceManagerForView != null) {
            return surfaceManagerForView;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for tag: [" + i10 + "]");
    }

    public boolean getViewExists(int i10) {
        return getSurfaceManagerForView(i10) != null;
    }

    public boolean isWaitingForViewAttach(int i10) {
        SurfaceMountingManager surfaceManager = getSurfaceManager(i10);
        if (surfaceManager == null || surfaceManager.isStopped()) {
            return false;
        }
        return !surfaceManager.isRootViewAttached();
    }

    public long measure(ReactContext reactContext, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        return this.mViewManagerRegistry.c(str).measure(reactContext, readableMap, readableMap2, readableMap3, f10, pVar, f11, pVar2, fArr);
    }

    public long measureMapBuffer(ReactContext reactContext, String str, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        return this.mViewManagerRegistry.c(str).measure(reactContext, aVar, aVar2, aVar3, f10, pVar, f11, pVar2, fArr);
    }

    @Deprecated
    public void receiveCommand(int i10, int i11, int i12, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        getSurfaceManagerEnforced(i10, "receiveCommand:int").receiveCommand(i11, i12, readableArray);
    }

    public void sendAccessibilityEvent(int i10, int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        if (i10 == -1) {
            getSurfaceManagerForViewEnforced(i11).sendAccessibilityEvent(i11, i12);
        } else {
            getSurfaceManagerEnforced(i10, "sendAccessibilityEvent").sendAccessibilityEvent(i11, i12);
        }
    }

    public SurfaceMountingManager startSurface(int i10, F0 f02, View view) {
        SurfaceMountingManager surfaceMountingManager = new SurfaceMountingManager(i10, this.mJSResponderHandler, this.mViewManagerRegistry, this.mRootViewManager, this.mMountItemExecutor, f02);
        this.mSurfaceIdToManager.putIfAbsent(Integer.valueOf(i10), surfaceMountingManager);
        if (this.mSurfaceIdToManager.get(Integer.valueOf(i10)) != surfaceMountingManager) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Called startSurface more than once for the SurfaceId [" + i10 + "]"));
        }
        this.mMostRecentSurfaceMountingManager = this.mSurfaceIdToManager.get(Integer.valueOf(i10));
        if (view != null) {
            surfaceMountingManager.attachRootView(view, f02);
        }
        return surfaceMountingManager;
    }

    public void stopSurface(int i10) {
        SurfaceMountingManager surfaceMountingManager = this.mSurfaceIdToManager.get(Integer.valueOf(i10));
        if (surfaceMountingManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot call stopSurface on non-existent surface: [" + i10 + "]"));
            return;
        }
        while (this.mStoppedSurfaceIds.size() >= 15) {
            Integer num = this.mStoppedSurfaceIds.get(0);
            ConcurrentHashMap<Integer, SurfaceMountingManager> concurrentHashMap = this.mSurfaceIdToManager;
            num.intValue();
            concurrentHashMap.remove(num);
            this.mStoppedSurfaceIds.remove(num);
            AbstractC1721a.c(TAG, "Removing stale SurfaceMountingManager: [%d]", num);
        }
        this.mStoppedSurfaceIds.add(Integer.valueOf(i10));
        surfaceMountingManager.stopSurface();
        if (this.mMostRecentSurfaceMountingManager == surfaceMountingManager) {
            this.mMostRecentSurfaceMountingManager = null;
        }
        if (this.mLastQueriedSurfaceMountingManager == surfaceMountingManager) {
            this.mLastQueriedSurfaceMountingManager = null;
        }
    }

    public boolean surfaceIsStopped(int i10) {
        if (this.mStoppedSurfaceIds.contains(Integer.valueOf(i10))) {
            return true;
        }
        SurfaceMountingManager surfaceManager = getSurfaceManager(i10);
        return surfaceManager != null && surfaceManager.isStopped();
    }

    public void updateProps(int i10, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        if (readableMap == null) {
            return;
        }
        getSurfaceManagerForViewEnforced(i10).updateProps(i10, readableMap);
    }

    public void receiveCommand(int i10, int i11, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        getSurfaceManagerEnforced(i10, "receiveCommand:string").receiveCommand(i11, str, readableArray);
    }
}
