package com.facebook.react.fabric;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.DevToolsReactPerfLogger;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.internal.interop.InteropUIBlockListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import com.facebook.react.fabric.mounting.MountItemDispatcher;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItemFactory;
import com.facebook.react.internal.interop.InteropEventEmitter;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.C1967s0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.InterfaceC1965r0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.e1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.j;
import com.facebook.react.uimanager.events.o;
import com.facebook.react.uimanager.i1;
import com.facebook.react.views.text.s;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import x4.C5109a;

/* loaded from: classes.dex */
public class FabricUIManager implements UIManager, LifecycleEventListener, UIBlockViewResolver, o {
    private static final DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener FABRIC_PERF_LOGGER = new DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener() { // from class: com.facebook.react.fabric.b
        @Override // com.facebook.react.fabric.DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener
        public final void onFabricCommitEnd(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
            FabricUIManager.lambda$static$0(fabricCommitPoint);
        }
    };
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";
    private final com.facebook.react.uimanager.events.a mBatchEventDispatchedListener;
    private Binding mBinding;
    public DevToolsReactPerfLogger mDevToolsReactPerfLogger;
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private final EventDispatcher mEventDispatcher;
    private InteropUIBlockListener mInteropUIBlockListener;
    private final MountItemDispatcher mMountItemDispatcher;
    private final MountingManager.MountItemExecutor mMountItemExecutor;
    private final MountingManager mMountingManager;
    private final ReactApplicationContext mReactApplicationContext;
    private final i1 mViewManagerRegistry;
    private final CopyOnWriteArrayList<UIManagerListener> mListeners = new CopyOnWriteArrayList<>();
    private boolean mMountNotificationScheduled = false;
    private List<Integer> mSurfaceIdsWithPendingMountNotification = new ArrayList();
    private final Set<SynchronousEvent> mSynchronousEvents = new HashSet();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = ModuleDescriptor.MODULE_VERSION;

    private class DispatchUIFrameCallback extends GuardedFrameCallback {
        private volatile boolean mIsMountingEnabled;
        private boolean mIsScheduled;
        private boolean mShouldSchedule;

        private void schedule() {
            if (this.mIsScheduled || !this.mShouldSchedule) {
                return;
            }
            this.mIsScheduled = true;
            com.facebook.react.modules.core.a.h().k(a.EnumC0379a.DISPATCH_UI, this);
        }

        @Override // com.facebook.react.fabric.GuardedFrameCallback
        public void doFrameGuarded(long j10) {
            this.mIsScheduled = false;
            if (!this.mIsMountingEnabled) {
                AbstractC1721a.J(FabricUIManager.TAG, "Not flushing pending UI operations: exception was previously thrown");
                return;
            }
            if (FabricUIManager.this.mDestroyed) {
                AbstractC1721a.J(FabricUIManager.TAG, "Not flushing pending UI operations: FabricUIManager is destroyed");
                return;
            }
            if (FabricUIManager.this.mDriveCxxAnimations && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.driveCxxAnimations();
            }
            if (G4.a.t() && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.drainPreallocateViewsQueue();
            }
            try {
                try {
                    FabricUIManager.this.mMountItemDispatcher.dispatchPreMountItems(j10);
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                    schedule();
                    FabricUIManager.this.mSynchronousEvents.clear();
                } catch (Exception e10) {
                    AbstractC1721a.n(FabricUIManager.TAG, "Exception thrown when executing UIFrameGuarded", e10);
                    this.mIsMountingEnabled = false;
                    throw e10;
                }
            } catch (Throwable th) {
                schedule();
                throw th;
            }
        }

        void pause() {
            com.facebook.react.modules.core.a.h().n(a.EnumC0379a.DISPATCH_UI, this);
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }

        void resume() {
            this.mShouldSchedule = true;
            schedule();
        }

        private DispatchUIFrameCallback(ReactContext reactContext) {
            super(reactContext);
            this.mIsMountingEnabled = true;
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }
    }

    private class MountItemDispatchListener implements MountItemDispatcher.ItemDispatchListener {
        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didDispatchMountItems() {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didDispatchMountItems(FabricUIManager.this);
            }
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didMountItems(List<MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didMountItems(FabricUIManager.this);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            for (MountItem mountItem : list) {
                if (mountItem != null && !FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.contains(Integer.valueOf(mountItem.get_surfaceId()))) {
                    FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.add(Integer.valueOf(mountItem.get_surfaceId()));
                }
            }
            if (FabricUIManager.this.mMountNotificationScheduled || FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.isEmpty()) {
                return;
            }
            FabricUIManager.this.mMountNotificationScheduled = true;
            UiThreadUtil.getUiThreadHandler().postAtFrontOfQueue(new Runnable() { // from class: com.facebook.react.fabric.FabricUIManager.MountItemDispatchListener.1
                @Override // java.lang.Runnable
                public void run() {
                    FabricUIManager.this.mMountNotificationScheduled = false;
                    List list2 = FabricUIManager.this.mSurfaceIdsWithPendingMountNotification;
                    FabricUIManager.this.mSurfaceIdsWithPendingMountNotification = new ArrayList();
                    Binding binding = FabricUIManager.this.mBinding;
                    if (binding == null || FabricUIManager.this.mDestroyed) {
                        return;
                    }
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        binding.reportMount(((Integer) it2.next()).intValue());
                    }
                }
            });
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void willMountItems(List<MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).willMountItems(FabricUIManager.this);
            }
        }

        private MountItemDispatchListener() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FabricUIManager(ReactApplicationContext reactApplicationContext, i1 i1Var, com.facebook.react.uimanager.events.a aVar) {
        MountingManager.MountItemExecutor mountItemExecutor = new MountingManager.MountItemExecutor() { // from class: com.facebook.react.fabric.FabricUIManager.1
            @Override // com.facebook.react.fabric.mounting.MountingManager.MountItemExecutor
            public void executeItems(Queue<MountItem> queue) {
                FabricUIManager.this.mMountItemDispatcher.dispatchMountItems(queue);
            }
        };
        this.mMountItemExecutor = mountItemExecutor;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        MountingManager mountingManager = new MountingManager(i1Var, mountItemExecutor);
        this.mMountingManager = mountingManager;
        this.mMountItemDispatcher = new MountItemDispatcher(mountingManager, new MountItemDispatchListener());
        this.mEventDispatcher = new j(reactApplicationContext);
        this.mBatchEventDispatchedListener = aVar;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mViewManagerRegistry = i1Var;
        reactApplicationContext.registerComponentCallbacks(i1Var);
    }

    private MountItem createIntBufferBatchMountItem(int i10, int[] iArr, Object[] objArr, int i11) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return MountItemFactory.createIntBufferBatchMountItem(i10, iArr, objArr, i11);
    }

    private InteropUIBlockListener getInteropUIBlockListener() {
        if (this.mInteropUIBlockListener == null) {
            InteropUIBlockListener interopUIBlockListener = new InteropUIBlockListener();
            this.mInteropUIBlockListener = interopUIBlockListener;
            addUIManagerEventListener(interopUIBlockListener);
        }
        return this.mInteropUIBlockListener;
    }

    private boolean isOnMainThread() {
        return UiThreadUtil.isOnUiThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
        long commitDuration = fabricCommitPoint.getCommitDuration();
        long layoutDuration = fabricCommitPoint.getLayoutDuration();
        long diffDuration = fabricCommitPoint.getDiffDuration();
        long transactionEndDuration = fabricCommitPoint.getTransactionEndDuration();
        long batchExecutionDuration = fabricCommitPoint.getBatchExecutionDuration();
        LongStreamingStats longStreamingStats = DevToolsReactPerfLogger.mStreamingCommitStats;
        longStreamingStats.add(commitDuration);
        LongStreamingStats longStreamingStats2 = DevToolsReactPerfLogger.mStreamingLayoutStats;
        longStreamingStats2.add(layoutDuration);
        LongStreamingStats longStreamingStats3 = DevToolsReactPerfLogger.mStreamingDiffStats;
        longStreamingStats3.add(diffDuration);
        LongStreamingStats longStreamingStats4 = DevToolsReactPerfLogger.mStreamingTransactionEndStats;
        longStreamingStats4.add(transactionEndDuration);
        LongStreamingStats longStreamingStats5 = DevToolsReactPerfLogger.mStreamingBatchExecutionStats;
        longStreamingStats5.add(batchExecutionDuration);
        AbstractC1721a.w(TAG, "Statistics of Fabric commit #%d:\n - Total commit time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Layout time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Diffing time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - FinishTransaction (Diffing + JNI serialization): %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Mounting: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n", Long.valueOf(fabricCommitPoint.getCommitNumber()), Long.valueOf(commitDuration), Double.valueOf(longStreamingStats.getAverage()), Double.valueOf(longStreamingStats.getMedian()), Long.valueOf(longStreamingStats.getMax()), Long.valueOf(layoutDuration), Double.valueOf(longStreamingStats2.getAverage()), Double.valueOf(longStreamingStats2.getMedian()), Long.valueOf(longStreamingStats2.getMax()), Long.valueOf(diffDuration), Double.valueOf(longStreamingStats3.getAverage()), Double.valueOf(longStreamingStats3.getMedian()), Long.valueOf(longStreamingStats3.getMax()), Long.valueOf(transactionEndDuration), Double.valueOf(longStreamingStats4.getAverage()), Double.valueOf(longStreamingStats4.getMedian()), Long.valueOf(longStreamingStats4.getMax()), Long.valueOf(batchExecutionDuration), Double.valueOf(longStreamingStats5.getAverage()), Double.valueOf(longStreamingStats5.getMedian()), Long.valueOf(longStreamingStats5.getMax()));
    }

    private long measure(int i10, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, float f11, float f12, float f13) {
        return measure(i10, str, readableMap, readableMap2, readableMap3, f10, f11, f12, f13, null);
    }

    private NativeArray measureLines(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10, float f11) {
        return (NativeArray) s.k(this.mReactApplicationContext, readableMapBuffer, readableMapBuffer2, C1944g0.g(f10), C1944g0.g(f11));
    }

    private long measureMapBuffer(int i10, String str, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, ReadableMapBuffer readableMapBuffer3, float f10, float f11, float f12, float f13, float[] fArr) {
        ReactContext reactContext;
        if (i10 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i10, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            reactContext = surfaceManagerEnforced.getContext();
        } else {
            reactContext = this.mReactApplicationContext;
        }
        return this.mMountingManager.measureMapBuffer(reactContext, str, readableMapBuffer, readableMapBuffer2, readableMapBuffer3, LayoutMetricsConversions.getYogaSize(f10, f11), LayoutMetricsConversions.getYogaMeasureMode(f10, f11), LayoutMetricsConversions.getYogaSize(f12, f13), LayoutMetricsConversions.getYogaMeasureMode(f12, f13), fArr);
    }

    private void preallocateView(int i10, int i11, String str, Object obj, Object obj2, boolean z10) {
        this.mMountItemDispatcher.addPreAllocateMountItem(MountItemFactory.createPreAllocateViewMountItem(i10, i11, str, (ReadableMap) obj, (E0) obj2, z10));
    }

    private void scheduleMountItem(MountItem mountItem, int i10, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i11) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z10 = mountItem instanceof BatchMountItem;
        boolean z11 = (z10 && !((BatchMountItem) mountItem).isBatchEmpty()) || !(z10 || mountItem == null);
        for (Iterator<UIManagerListener> it = this.mListeners.iterator(); it.hasNext(); it = it) {
            it.next().didScheduleMountItems(this);
        }
        if (z10) {
            this.mCommitStartTime = j10;
            this.mLayoutTime = j14 - j13;
            this.mFinishTransactionCPPTime = j16 - j15;
            this.mFinishTransactionTime = uptimeMillis - j15;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z11) {
            this.mMountItemDispatcher.addMountItem(mountItem);
            GuardedRunnable guardedRunnable = new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.fabric.FabricUIManager.3
                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                }
            };
            if (UiThreadUtil.isOnUiThread()) {
                guardedRunnable.run();
            }
        }
        if (z10) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i10, j10);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i10, j15);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i10, j16);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i10, j11);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i10, j12);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i10, j13);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i10, j14);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES, null, i10, j14, i11);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public <T extends View> int addRootView(T t10, WritableMap writableMap) {
        String str = TAG;
        ReactSoftExceptionLogger.logSoftException(str, new Q("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        InterfaceC1965r0 interfaceC1965r0 = (InterfaceC1965r0) t10;
        int rootViewTag = interfaceC1965r0.getRootViewTag();
        this.mMountingManager.startSurface(rootViewTag, new F0(this.mReactApplicationContext, t10.getContext(), interfaceC1965r0.getSurfaceID(), rootViewTag), t10);
        String jSModuleName = interfaceC1965r0.getJSModuleName();
        if (G4.a.f()) {
            AbstractC1721a.d(str, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(rootViewTag));
        }
        this.mBinding.startSurface(rootViewTag, jSModuleName, (NativeMap) writableMap);
        return rootViewTag;
    }

    public void addUIBlock(UIBlock uIBlock) {
        if (G4.a.p()) {
            getInteropUIBlockListener().addUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(E4.b bVar, View view) {
        this.mMountingManager.attachRootView(bVar.getSurfaceId(), view, new F0(this.mReactApplicationContext, view.getContext(), bVar.getModuleName(), bVar.getSurfaceId()));
        bVar.setMountable(true);
    }

    public void clearJSResponder() {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.5
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                mountingManager.clearJSResponder();
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            /* renamed from: getSurfaceId */
            public int get_surfaceId() {
                return -1;
            }

            public String toString() {
                return "CLEAR_JS_RESPONDER";
            }
        });
    }

    DispatchCommandMountItem createDispatchCommandMountItemForInterop(int i10, int i11, String str, ReadableArray readableArray) {
        try {
            return MountItemFactory.createDispatchCommandMountItem(i10, i11, Integer.parseInt(str), readableArray);
        } catch (NumberFormatException unused) {
            return MountItemFactory.createDispatchCommandMountItem(i10, i11, str, readableArray);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    public int getColor(int i10, String[] strArr) {
        F0 context = this.mMountingManager.getSurfaceManagerEnforced(i10, "getColor").getContext();
        if (context == null) {
            return 0;
        }
        for (String str : strArr) {
            Integer resolveResourcePath = ColorPropConverter.resolveResourcePath(context, str);
            if (resolveResourcePath != null) {
                return resolveResourcePath.intValue();
            }
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public ReadableMap getInspectorDataForInstance(int i10, View view) {
        UiThreadUtil.assertOnUiThread();
        return this.mBinding.getInspectorDataForInstance(this.mMountingManager.getEventEmitter(i10, view.getId()));
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        hashMap.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        hashMap.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.getRunStartTime()));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.getBatchedExecutionTime()));
        hashMap.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        hashMap.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return hashMap;
    }

    public boolean getThemeData(int i10, float[] fArr) {
        F0 context = this.mMountingManager.getSurfaceManagerEnforced(i10, "getThemeData").getContext();
        if (context == null) {
            AbstractC1721a.J(TAG, "\"themedReactContext\" is null when call \"getThemeData\"");
            return false;
        }
        float[] a10 = L0.a(context);
        fArr[0] = a10[0];
        fArr[1] = a10[1];
        fArr[2] = a10[2];
        fArr[3] = a10[3];
        return true;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void initialize() {
        this.mEventDispatcher.h(2, new FabricEventEmitter(this));
        this.mEventDispatcher.f(this.mBatchEventDispatchedListener);
        if (G4.a.f()) {
            DevToolsReactPerfLogger devToolsReactPerfLogger = new DevToolsReactPerfLogger();
            this.mDevToolsReactPerfLogger = devToolsReactPerfLogger;
            devToolsReactPerfLogger.addDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.addFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (G4.a.p()) {
            this.mReactApplicationContext.internal_registerInteropModule(RCTEventEmitter.class, new InteropEventEmitter(this.mReactApplicationContext));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void invalidate() {
        String str = TAG;
        AbstractC1721a.s(str, "FabricUIManager.invalidate");
        DevToolsReactPerfLogger devToolsReactPerfLogger = this.mDevToolsReactPerfLogger;
        if (devToolsReactPerfLogger != null) {
            devToolsReactPerfLogger.removeDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.removeFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        this.mEventDispatcher.e(this.mBatchEventDispatchedListener);
        this.mEventDispatcher.i(2);
        this.mReactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        this.mViewManagerRegistry.f();
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        this.mBinding.unregister();
        this.mBinding = null;
        e1.a();
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            return;
        }
        this.mEventDispatcher.g();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i10, int i11) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i10);
        if (surfaceManager != null) {
            surfaceManager.markActiveTouchForTag(i11);
        }
    }

    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mDispatchUIFrameCallback.pause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mDispatchUIFrameCallback.resume();
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.d();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        if (G4.a.p()) {
            getInteropUIBlockListener().prependUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(-1, i10, str, false, writableMap, 2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("top")) {
            return str;
        }
        return "on" + str.substring(3);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i10) {
        UiThreadUtil.assertOnUiThread();
        SurfaceMountingManager surfaceManagerForView = this.mMountingManager.getSurfaceManagerForView(i10);
        if (surfaceManagerForView == null) {
            return null;
        }
        return surfaceManagerForView.getView(i10);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i10, int i11) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(-1, i10, i11));
    }

    public void sendAccessibilityEventFromJS(int i10, int i11, String str) {
        int i12;
        if ("focus".equals(str)) {
            i12 = 8;
        } else if ("windowStateChange".equals(str)) {
            i12 = 32;
        } else if ("click".equals(str)) {
            i12 = 1;
        } else {
            if (!"viewHoverEnter".equals(str)) {
                throw new IllegalArgumentException("sendAccessibilityEventFromJS: invalid eventType " + str);
            }
            i12 = 128;
        }
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(i10, i11, i12));
    }

    public void setBinding(Binding binding) {
        this.mBinding = binding;
    }

    public void setJSResponder(final int i10, final int i11, final int i12, final boolean z10) {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.4
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(i10);
                if (surfaceManager != null) {
                    surfaceManager.setJSResponder(i11, i12, z10);
                    return;
                }
                AbstractC1721a.m(FabricUIManager.TAG, "setJSResponder skipped, surface no longer available [" + i10 + "]");
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            /* renamed from: getSurfaceId */
            public int get_surfaceId() {
                return i10;
            }

            public String toString() {
                return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(i11), Integer.valueOf(i10));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t10, String str, WritableMap writableMap, int i10, int i11) {
        int rootViewTag = ((InterfaceC1965r0) t10).getRootViewTag();
        Context context = t10.getContext();
        F0 f02 = new F0(this.mReactApplicationContext, context, str, rootViewTag);
        if (G4.a.f()) {
            AbstractC1721a.d(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(rootViewTag));
        }
        this.mMountingManager.startSurface(rootViewTag, f02, t10);
        Point b10 = UiThreadUtil.isOnUiThread() ? B0.b(t10) : new Point(0, 0);
        this.mBinding.startSurfaceWithConstraints(rootViewTag, str, (NativeMap) writableMap, LayoutMetricsConversions.getMinSize(i10), LayoutMetricsConversions.getMaxSize(i10), LayoutMetricsConversions.getMinSize(i11), LayoutMetricsConversions.getMaxSize(i11), b10.x, b10.y, com.facebook.react.modules.i18nmanager.a.f().i(context), com.facebook.react.modules.i18nmanager.a.f().d(context));
        return rootViewTag;
    }

    public void stopSurface(E4.b bVar) {
        if (!bVar.isRunning()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.stopSurface(bVar.getSurfaceId());
        bVar.stop();
        if (bVar instanceof SurfaceHandlerBinding) {
            this.mBinding.unregisterSurface((SurfaceHandlerBinding) bVar);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i10, int i11) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i10);
        if (surfaceManager != null) {
            surfaceManager.sweepActiveTouchForTag(i11);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(final int i10, final ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        int i11 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i11 + 1;
        MountItem mountItem = new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.2
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                try {
                    mountingManager.updateProps(i10, readableMap);
                } catch (Exception unused) {
                }
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            /* renamed from: getSurfaceId */
            public int get_surfaceId() {
                return -1;
            }

            public String toString() {
                return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(i10), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
            }
        };
        if (!this.mMountingManager.getViewExists(i10)) {
            this.mMountItemDispatcher.addMountItem(mountItem);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i11);
        if (G4.a.f()) {
            AbstractC1721a.d(TAG, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", Integer.valueOf(i10), IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
        }
        mountItem.execute(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean z11;
        if (G4.a.f()) {
            AbstractC1721a.c(TAG, "Updating Root Layout Specs for [%d]", Integer.valueOf(i10));
        }
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i10);
        if (surfaceManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new Q("Cannot updateRootLayoutSpecs on surfaceId that does not exist: " + i10));
            return;
        }
        F0 context = surfaceManager.getContext();
        if (context != null) {
            boolean i15 = com.facebook.react.modules.i18nmanager.a.f().i(context);
            z11 = com.facebook.react.modules.i18nmanager.a.f().d(context);
            z10 = i15;
        } else {
            z10 = false;
            z11 = false;
        }
        this.mBinding.setConstraints(i10, LayoutMetricsConversions.getMinSize(i11), LayoutMetricsConversions.getMaxSize(i11), LayoutMetricsConversions.getMinSize(i12), LayoutMetricsConversions.getMaxSize(i12), i13, i14, z10, z11);
    }

    private long measure(int i10, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, float f11, float f12, float f13, float[] fArr) {
        ReactContext reactContext;
        if (i10 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i10, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            reactContext = surfaceManagerEnforced.getContext();
        } else {
            reactContext = this.mReactApplicationContext;
        }
        return this.mMountingManager.measure(reactContext, str, readableMap, readableMap2, readableMap3, LayoutMetricsConversions.getYogaSize(f10, f11), LayoutMetricsConversions.getYogaMeasureMode(f10, f11), LayoutMetricsConversions.getYogaSize(f12, f13), LayoutMetricsConversions.getYogaMeasureMode(f12, f13), fArr);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        receiveEvent(i10, i11, str, false, writableMap, 2);
    }

    @Deprecated
    public void dispatchCommand(int i10, int i11, int i12, ReadableArray readableArray) {
        this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i10, i11, i12, readableArray));
    }

    public void receiveEvent(int i10, int i11, String str, boolean z10, WritableMap writableMap, int i12) {
        receiveEvent(i10, i11, str, z10, writableMap, i12, false);
    }

    @Override // com.facebook.react.uimanager.events.o
    public void receiveEvent(int i10, int i11, String str, boolean z10, WritableMap writableMap, int i12, boolean z11) {
        if (C5109a.f44775b && i10 == -1) {
            AbstractC1721a.d(TAG, "Emitted event without surfaceId: [%d] %s", Integer.valueOf(i11), str);
        }
        if (this.mDestroyed) {
            AbstractC1721a.m(TAG, "Attempted to receiveEvent after destruction");
            return;
        }
        EventEmitterWrapper eventEmitter = this.mMountingManager.getEventEmitter(i10, i11);
        if (eventEmitter != null) {
            if (z11) {
                if (this.mSynchronousEvents.add(new SynchronousEvent(i10, i11, str))) {
                    eventEmitter.dispatchEventSynchronously(str, writableMap);
                    return;
                }
                return;
            } else if (z10) {
                eventEmitter.dispatchUnique(str, writableMap);
                return;
            } else {
                eventEmitter.dispatch(str, writableMap, i12);
                return;
            }
        }
        if (this.mMountingManager.getViewExists(i11)) {
            this.mMountingManager.enqueuePendingEvent(i10, i11, str, z10, writableMap, i12);
            return;
        }
        AbstractC1721a.b(TAG, "Unable to invoke event: " + str + " for reactTag: " + i11);
    }

    public void dispatchCommand(int i10, int i11, String str, ReadableArray readableArray) {
        if (G4.a.p()) {
            this.mMountItemDispatcher.addViewCommandMountItem(createDispatchCommandMountItemForInterop(i10, i11, str, readableArray));
        } else {
            this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i10, i11, str, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i10) {
        this.mMountingManager.stopSurface(i10);
        this.mBinding.stopSurface(i10);
    }

    public void startSurface(E4.b bVar, Context context, View view) {
        int a10 = C1967s0.a();
        this.mMountingManager.startSurface(a10, new F0(this.mReactApplicationContext, context, bVar.getModuleName(), a10), view);
        bVar.setSurfaceId(a10);
        if (bVar instanceof SurfaceHandlerBinding) {
            this.mBinding.registerSurface((SurfaceHandlerBinding) bVar);
        }
        bVar.setMountable(view != null);
        bVar.start();
    }
}
