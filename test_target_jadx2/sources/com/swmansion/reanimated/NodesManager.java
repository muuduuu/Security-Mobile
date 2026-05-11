package com.swmansion.reanimated;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.InterfaceC1969t0;
import com.facebook.react.uimanager.K0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.N;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.Q0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.layoutReanimation.AnimationsManager;
import com.swmansion.reanimated.nativeProxy.NoopEventHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class NodesManager implements com.facebook.react.uimanager.events.h {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ReaCompatibility compatibility;
    private double lastFrameTimeMs;
    private final AnimationsManager mAnimationManager;
    private int mAnimationsDragFactor;
    private final N mChoreographerCallback;
    private final ReactContext mContext;
    protected final UIManagerModule.d mCustomEventNamesResolver;
    private final DeviceEventManagerModule.RCTDeviceEventEmitter mEventEmitter;
    private NativeProxy mNativeProxy;
    private final com.facebook.react.modules.core.a mReactChoreographer;
    private final K0 mUIImplementation;
    private final UIManager mUIManager;
    private Long mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean mSlowAnimationsEnabled = false;
    private final AtomicBoolean mCallbackPosted = new AtomicBoolean();
    private RCTEventEmitter mCustomEventHandler = new NoopEventHandler();
    private List<OnAnimationFrame> mFrameCallbacks = new ArrayList();
    private ConcurrentLinkedQueue<CopiedEvent> mEventQueue = new ConcurrentLinkedQueue<>();
    public Set<String> uiProps = Collections.emptySet();
    public Set<String> nativeProps = Collections.emptySet();
    private Queue<NativeUpdateOperation> mOperationsInBatch = new LinkedList();
    private boolean mTryRunBatchUpdatesSynchronously = false;

    /* renamed from: com.swmansion.reanimated.NodesManager$3, reason: invalid class name */
    class AnonymousClass3 extends GuardedRunnable {
        final /* synthetic */ NodesManager this$0;
        final /* synthetic */ Queue val$copiedOperationsQueue;
        final /* synthetic */ Semaphore val$semaphore;
        final /* synthetic */ boolean val$trySynchronously;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(NodesManager nodesManager, JSExceptionHandler jSExceptionHandler, boolean z10, Semaphore semaphore, Queue queue) {
            super(jSExceptionHandler);
            this.val$trySynchronously = z10;
            this.val$semaphore = semaphore;
            this.val$copiedOperationsQueue = queue;
            this.this$0 = nodesManager;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            boolean a10 = Q0.a(this.this$0.mUIImplementation);
            boolean z10 = this.val$trySynchronously && a10;
            if (!z10) {
                this.val$semaphore.release();
            }
            while (!this.val$copiedOperationsQueue.isEmpty()) {
                NativeUpdateOperation nativeUpdateOperation = (NativeUpdateOperation) this.val$copiedOperationsQueue.remove();
                InterfaceC1969t0 N10 = this.this$0.mUIImplementation.N(nativeUpdateOperation.mViewTag);
                if (N10 != null) {
                    ((UIManagerModule) this.this$0.mUIManager).updateView(nativeUpdateOperation.mViewTag, N10.O(), nativeUpdateOperation.mNativeProps);
                }
            }
            if (a10) {
                this.this$0.mUIImplementation.m(-1);
            }
            if (z10) {
                this.val$semaphore.release();
            }
        }
    }

    /* renamed from: com.swmansion.reanimated.NodesManager$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private final class NativeUpdateOperation {
        public WritableMap mNativeProps;
        public int mViewTag;

        public NativeUpdateOperation(int i10, WritableMap writableMap) {
            this.mViewTag = i10;
            this.mNativeProps = writableMap;
        }
    }

    public interface OnAnimationFrame {
        void onAnimationFrame(double d10);
    }

    public NodesManager(ReactContext reactContext) {
        this.mContext = reactContext;
        final UIManager g10 = L0.g(reactContext, 2);
        this.mUIManager = g10;
        this.mUIImplementation = g10 instanceof UIManagerModule ? ((UIManagerModule) g10).getUIImplementation() : null;
        Objects.requireNonNull(g10);
        this.mCustomEventNamesResolver = new UIManagerModule.d() { // from class: com.swmansion.reanimated.d
            @Override // com.facebook.react.uimanager.UIManagerModule.d
            public final String a(String str) {
                return UIManager.this.resolveCustomDirectEventName(str);
            }
        };
        this.mEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.mReactChoreographer = com.facebook.react.modules.core.a.h();
        this.mChoreographerCallback = new N(reactContext) { // from class: com.swmansion.reanimated.NodesManager.2
            @Override // com.facebook.react.uimanager.N
            protected void doFrameGuarded(long j10) {
                NodesManager.this.onAnimationFrame(j10);
            }
        };
        EventDispatcher b10 = L0.b(reactContext, 2);
        Objects.requireNonNull(b10);
        b10.b(this);
        this.mAnimationManager = new AnimationsManager(reactContext, g10);
    }

    private static void addProp(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (obj instanceof ReadableArray) {
            if (obj instanceof WritableArray) {
                writableMap.putArray(str, (ReadableArray) obj);
                return;
            } else {
                writableMap.putArray(str, copyReadableArray((ReadableArray) obj));
                return;
            }
        }
        if (!(obj instanceof ReadableMap)) {
            throw new IllegalStateException("[Reanimated] Unknown type of animated value.");
        }
        if (obj instanceof WritableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
        } else {
            writableMap.putMap(str, copyReadableMap((ReadableMap) obj));
        }
    }

    private static WritableArray copyReadableArray(ReadableArray readableArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            switch (AnonymousClass4.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i10).ordinal()]) {
                case 1:
                    createArray.pushBoolean(readableArray.getBoolean(i10));
                    break;
                case 2:
                    createArray.pushString(readableArray.getString(i10));
                    break;
                case 3:
                    createArray.pushNull();
                    break;
                case 4:
                    createArray.pushDouble(readableArray.getDouble(i10));
                    break;
                case 5:
                    createArray.pushMap(copyReadableMap(readableArray.getMap(i10)));
                    break;
                case 6:
                    createArray.pushArray(copyReadableArray(readableArray.getArray(i10)));
                    break;
                default:
                    throw new IllegalStateException("[Reanimated] Unknown type of ReadableArray.");
            }
        }
        return createArray;
    }

    private static WritableMap copyReadableMap(ReadableMap readableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        return createMap;
    }

    private void handleEvent(com.facebook.react.uimanager.events.d dVar) {
        dVar.dispatch(this.mCustomEventHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAnimationFrame(long j10) {
        double d10 = j10 / 1000000.0d;
        if (this.mSlowAnimationsEnabled) {
            d10 = ((d10 - this.mFirstUptime.longValue()) / this.mAnimationsDragFactor) + this.mFirstUptime.longValue();
        }
        if (d10 > this.lastFrameTimeMs) {
            this.lastFrameTimeMs = d10;
            while (!this.mEventQueue.isEmpty()) {
                CopiedEvent poll = this.mEventQueue.poll();
                handleEvent(poll.getTargetTag(), poll.getEventName(), poll.getPayload());
            }
            if (!this.mFrameCallbacks.isEmpty()) {
                List<OnAnimationFrame> list = this.mFrameCallbacks;
                this.mFrameCallbacks = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).onAnimationFrame(d10);
                }
            }
            performOperations();
        }
        this.mCallbackPosted.set(false);
        if (this.mFrameCallbacks.isEmpty() && this.mEventQueue.isEmpty()) {
            return;
        }
        startUpdatingOnAnimationFrame();
    }

    private void stopUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(false)) {
            this.mReactChoreographer.n(a.EnumC0379a.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
        }
    }

    public void configureProps(Set<String> set, Set<String> set2) {
        this.uiProps = set;
        this.nativeProps = set2;
    }

    public void dispatchCommand(final int i10, final String str, final ReadableArray readableArray) {
        ReactContext reactContext = this.mContext;
        reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(this, reactContext.getExceptionHandler()) { // from class: com.swmansion.reanimated.NodesManager.1
            final /* synthetic */ NodesManager this$0;

            {
                this.this$0 = this;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                this.this$0.mUIManager.dispatchCommand(i10, str, readableArray);
            }
        });
    }

    public void enableSlowAnimations(boolean z10, int i10) {
        this.mSlowAnimationsEnabled = z10;
        this.mAnimationsDragFactor = i10;
        if (z10) {
            this.mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public void enqueueUpdateViewOnNativeThread(int i10, WritableMap writableMap, boolean z10) {
        if (z10) {
            this.mTryRunBatchUpdatesSynchronously = true;
        }
        this.mOperationsInBatch.add(new NativeUpdateOperation(i10, writableMap));
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationManager;
    }

    public UIManagerModule.d getEventNameResolver() {
        return this.mCustomEventNamesResolver;
    }

    public NativeProxy getNativeProxy() {
        return this.mNativeProxy;
    }

    public void initWithContext(ReactApplicationContext reactApplicationContext, String str) {
        this.mNativeProxy = new NativeProxy(reactApplicationContext, str);
        this.mAnimationManager.setAndroidUIScheduler(getNativeProxy().getAndroidUIScheduler());
        ReaCompatibility reaCompatibility = new ReaCompatibility(reactApplicationContext);
        this.compatibility = reaCompatibility;
        reaCompatibility.registerFabricEventListener(this);
    }

    public void invalidate() {
        AnimationsManager animationsManager = this.mAnimationManager;
        if (animationsManager != null) {
            animationsManager.invalidate();
        }
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.invalidate();
            this.mNativeProxy = null;
        }
    }

    public boolean isAnimationRunning() {
        return this.mCallbackPosted.get();
    }

    public float[] measure(int i10) {
        try {
            return NativeMethodsHelper.measure(this.mUIManager.resolveView(i10));
        } catch (Q e10) {
            e10.printStackTrace();
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }
    }

    public String obtainProp(int i10, String str) {
        View resolveView;
        try {
            resolveView = this.mUIManager.resolveView(i10);
            str.hashCode();
            switch (str) {
                case "opacity":
                    return Float.toString(resolveView.getAlpha());
                case "height":
                    return Float.toString(C1944g0.e(resolveView.getHeight()));
                case "zIndex":
                    return Float.toString(resolveView.getElevation());
                case "top":
                    return Float.toString(C1944g0.e(resolveView.getTop()));
                case "left":
                    return Float.toString(C1944g0.e(resolveView.getLeft()));
                case "width":
                    return Float.toString(C1944g0.e(resolveView.getWidth()));
                case "backgroundColor":
                    Drawable background = resolveView.getBackground();
                    try {
                        String format = String.format("%08x", Integer.valueOf(((Integer) background.getClass().getMethod("getColor", null).invoke(background, null)).intValue()));
                        return "#" + format.substring(2, 8) + format.substring(0, 2);
                    } catch (Exception unused) {
                        return "Unable to resolve background color";
                    }
                default:
                    throw new IllegalArgumentException("[Reanimated] Attempted to get unsupported property " + str + " with function `getViewProp`");
            }
        } catch (Exception unused2) {
            return "[Reanimated] Unable to resolve view";
        }
    }

    @Override // com.facebook.react.uimanager.events.h
    public void onEventDispatch(com.facebook.react.uimanager.events.d dVar) {
        if (this.mNativeProxy == null) {
            return;
        }
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(dVar);
            performOperations();
            return;
        }
        if (this.mNativeProxy.isAnyHandlerWaitingForEvent(this.mCustomEventNamesResolver.a(dVar.getEventName()), dVar.getViewTag())) {
            this.mEventQueue.offer(new CopiedEvent(dVar));
        }
        startUpdatingOnAnimationFrame();
    }

    public void onHostPause() {
        if (this.mCallbackPosted.get()) {
            stopUpdatingOnAnimationFrame();
            this.mCallbackPosted.set(true);
        }
    }

    public void onHostResume() {
        if (this.mCallbackPosted.getAndSet(false)) {
            startUpdatingOnAnimationFrame();
        }
    }

    public void performOperations() {
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.performOperations();
        }
    }

    public void postOnAnimation(OnAnimationFrame onAnimationFrame) {
        this.mFrameCallbacks.add(onAnimationFrame);
        startUpdatingOnAnimationFrame();
    }

    public void registerEventHandler(RCTEventEmitter rCTEventEmitter) {
        this.mCustomEventHandler = rCTEventEmitter;
    }

    public void scrollTo(int i10, double d10, double d11, boolean z10) {
        try {
            NativeMethodsHelper.scrollTo(this.mUIManager.resolveView(i10), d10, d11, z10);
        } catch (Q e10) {
            e10.printStackTrace();
        }
    }

    public void sendEvent(String str, WritableMap writableMap) {
        this.mEventEmitter.emit(str, writableMap);
    }

    public void startUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(true)) {
            return;
        }
        this.mReactChoreographer.k(a.EnumC0379a.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
    }

    public void synchronouslyUpdateUIProps(int i10, ReadableMap readableMap) {
        this.compatibility.synchronouslyUpdateUIProps(i10, readableMap);
    }

    public void updateProps(int i10, Map<String, Object> map) {
        try {
            if (this.mUIManager.resolveView(i10) == null) {
                return;
            }
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (this.uiProps.contains(key)) {
                    addProp(javaOnlyMap, key, value);
                    z10 = true;
                } else if (this.nativeProps.contains(key)) {
                    addProp(createMap2, key, value);
                    z11 = true;
                } else {
                    addProp(createMap, key, value);
                    z12 = true;
                }
            }
            if (i10 != -1) {
                if (z10) {
                    this.mUIImplementation.V(i10, new C1973v0(javaOnlyMap));
                }
                if (z11) {
                    enqueueUpdateViewOnNativeThread(i10, createMap2, true);
                }
                if (z12) {
                    WritableMap createMap3 = Arguments.createMap();
                    createMap3.putInt("viewTag", i10);
                    createMap3.putMap("props", createMap);
                    sendEvent("onReanimatedPropsChange", createMap3);
                }
            }
        } catch (Q unused) {
        }
    }

    private void handleEvent(int i10, String str, WritableMap writableMap) {
        this.mCustomEventHandler.receiveEvent(i10, str, writableMap);
    }
}
