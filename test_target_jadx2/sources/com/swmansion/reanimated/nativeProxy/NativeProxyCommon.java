package com.swmansion.reanimated.nativeProxy;

import C4.d;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import ca.InterfaceC1746a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.AndroidUIScheduler;
import com.swmansion.reanimated.BuildConfig;
import com.swmansion.reanimated.DevMenuUtils;
import com.swmansion.reanimated.NativeProxy;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.reanimated.Utils;
import com.swmansion.reanimated.keyboard.KeyboardAnimationManager;
import com.swmansion.reanimated.keyboard.KeyboardWorkletWrapper;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.sensor.ReanimatedSensorContainer;
import com.swmansion.reanimated.sensor.ReanimatedSensorType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class NativeProxyCommon {
    private final InterfaceC1746a gestureHandlerStateManager;
    private final KeyboardAnimationManager keyboardAnimationManager;
    protected final AndroidUIScheduler mAndroidUIScheduler;
    protected final WeakReference<ReactApplicationContext> mContext;
    protected NodesManager mNodesManager;
    private final ReanimatedSensorContainer reanimatedSensorContainer;
    private Long firstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean slowAnimationsEnabled = false;
    private final int ANIMATIONS_DRAG_FACTOR = 10;
    protected String cppVersion = null;

    static {
        SoLoader.t("reanimated");
    }

    protected NativeProxyCommon(ReactApplicationContext reactApplicationContext) {
        InterfaceC1746a interfaceC1746a = null;
        this.mAndroidUIScheduler = new AndroidUIScheduler(reactApplicationContext);
        WeakReference<ReactApplicationContext> weakReference = new WeakReference<>(reactApplicationContext);
        this.mContext = weakReference;
        this.reanimatedSensorContainer = new ReanimatedSensorContainer(weakReference);
        this.keyboardAnimationManager = new KeyboardAnimationManager(weakReference);
        addDevMenuOption();
        try {
            RNGestureHandlerModule.Companion companion = RNGestureHandlerModule.INSTANCE;
            interfaceC1746a = (InterfaceC1746a) reactApplicationContext.getNativeModule(RNGestureHandlerModule.class);
        } catch (ClassCastException | ClassNotFoundException unused) {
        }
        this.gestureHandlerStateManager = interfaceC1746a;
    }

    private void addDevMenuOption() {
        DevMenuUtils.addDevMenuOption(this.mContext.get(), new d() { // from class: com.swmansion.reanimated.nativeProxy.a
            @Override // C4.d
            public final void a() {
                NativeProxyCommon.this.toggleSlowAnimations();
            }
        });
    }

    private Set<String> convertProps(ReadableNativeArray readableNativeArray) {
        HashSet hashSet = new HashSet();
        ArrayList<Object> arrayList = readableNativeArray.toArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashSet.add((String) arrayList.get(i10));
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleSlowAnimations() {
        boolean z10 = this.slowAnimationsEnabled;
        this.slowAnimationsEnabled = !z10;
        if (!z10) {
            this.firstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
        this.mNodesManager.enableSlowAnimations(this.slowAnimationsEnabled, 10);
    }

    protected void checkCppVersion() {
        if (this.cppVersion == null) {
            throw new RuntimeException("[Reanimated] Java side failed to resolve C++ code version. See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#java-side-failed-to-resolve-c-code-version for more information.");
        }
        String reanimatedJavaVersion = getReanimatedJavaVersion();
        if (this.cppVersion.equals(reanimatedJavaVersion)) {
            return;
        }
        throw new RuntimeException("[Reanimated] Mismatch between Java code version and C++ code version (" + reanimatedJavaVersion + " vs. " + this.cppVersion + " respectively). See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#mismatch-between-java-code-version-and-c-code-version for more information.");
    }

    public void configureProps(ReadableNativeArray readableNativeArray, ReadableNativeArray readableNativeArray2) {
        this.mNodesManager.configureProps(convertProps(readableNativeArray), convertProps(readableNativeArray2));
    }

    public void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        this.mNodesManager.dispatchCommand(i10, str, readableArray);
    }

    public AndroidUIScheduler getAndroidUIScheduler() {
        return this.mAndroidUIScheduler;
    }

    public long getAnimationTimestamp() {
        return this.slowAnimationsEnabled ? this.firstUptime.longValue() + ((SystemClock.uptimeMillis() - this.firstUptime.longValue()) / 10) : SystemClock.uptimeMillis();
    }

    protected abstract HybridData getHybridData();

    public boolean getIsReducedMotion() {
        String string = Settings.Global.getString(this.mContext.get().getContentResolver(), "transition_animation_scale");
        return (string != null ? Float.parseFloat(string) : 1.0f) == 0.0f;
    }

    public String getReanimatedJavaVersion() {
        return BuildConfig.REANIMATED_VERSION_JAVA;
    }

    protected native void installJSIBindings();

    public void invalidate() {
        this.mAndroidUIScheduler.deactivate();
    }

    void maybeFlushUIUpdatesQueue() {
        if (this.mNodesManager.isAnimationRunning()) {
            return;
        }
        this.mNodesManager.performOperations();
    }

    public float[] measure(int i10) {
        return this.mNodesManager.measure(i10);
    }

    public String obtainProp(int i10, String str) {
        return this.mNodesManager.obtainProp(i10, str);
    }

    public void prepareLayoutAnimations(LayoutAnimations layoutAnimations) {
        if (Utils.isChromeDebugger) {
            Log.w("[REANIMATED]", "You can not use LayoutAnimation with enabled Chrome Debugger");
            return;
        }
        ReanimatedModule reanimatedModule = (ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule);
        this.mNodesManager = reanimatedModule.getNodesManager();
        ReanimatedModule reanimatedModule2 = (ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule2);
        reanimatedModule2.getNodesManager().getAnimationsManager().setNativeMethods(NativeProxy.createNativeMethodsHolder(layoutAnimations));
    }

    public void registerEventHandler(EventHandler eventHandler) {
        eventHandler.mCustomEventNamesResolver = this.mNodesManager.getEventNameResolver();
        this.mNodesManager.registerEventHandler(eventHandler);
    }

    public int registerSensor(int i10, int i11, SensorSetter sensorSetter) {
        return this.reanimatedSensorContainer.registerSensor(ReanimatedSensorType.getInstanceById(i10), i11, sensorSetter);
    }

    public void requestRender(AnimationFrameCallback animationFrameCallback) {
        this.mNodesManager.postOnAnimation(animationFrameCallback);
    }

    public void scrollTo(int i10, double d10, double d11, boolean z10) {
        this.mNodesManager.scrollTo(i10, d10, d11, z10);
    }

    protected void setCppVersion(String str) {
        this.cppVersion = str;
    }

    public void setGestureState(int i10, int i11) {
        InterfaceC1746a interfaceC1746a = this.gestureHandlerStateManager;
        if (interfaceC1746a != null) {
            interfaceC1746a.setGestureHandlerState(i10, i11);
        }
    }

    public int subscribeForKeyboardEvents(KeyboardWorkletWrapper keyboardWorkletWrapper, boolean z10, boolean z11) {
        return this.keyboardAnimationManager.subscribeForKeyboardUpdates(keyboardWorkletWrapper, z10, z11);
    }

    public void synchronouslyUpdateUIProps(int i10, ReadableMap readableMap) {
        this.mNodesManager.synchronouslyUpdateUIProps(i10, readableMap);
    }

    public void unregisterSensor(int i10) {
        this.reanimatedSensorContainer.unregisterSensor(i10);
    }

    public void unsubscribeFromKeyboardEvents(int i10) {
        this.keyboardAnimationManager.unsubscribeFromKeyboardUpdates(i10);
    }

    public void updateProps(int i10, Map<String, Object> map) {
        this.mNodesManager.updateProps(i10, map);
    }
}
