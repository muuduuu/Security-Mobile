package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import ca.InterfaceC1746a;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.Z;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import com.swmansion.gesturehandler.react.c;
import da.AbstractC3005e;
import ea.AbstractC3109d;
import ea.C3107b;
import ea.C3116k;
import ea.n;
import ea.o;
import ea.p;
import ea.r;
import ea.s;
import ea.v;
import ea.z;
import fa.AbstractC3159b;
import fa.C3158a;
import fa.C3160c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = "RNGestureHandlerModule")
@Metadata(d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001V\b\u0007\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u000bklmnopqrstuB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u0010\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010!J7\u0010$\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0004\b&\u0010!J'\u0010)\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010(\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010(\u001a\u00028\u0000H\u0002¢\u0006\u0004\b.\u0010*J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u00105J'\u00108\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u00107\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u000206H\u0017¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0017¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\u000f2\u0006\u0010:\u001a\u0002062\u0006\u0010C\u001a\u00020BH\u0017¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u000fH\u0017¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000fH\u0017¢\u0006\u0004\bH\u0010GJ\u001f\u0010I\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020BH\u0017¢\u0006\u0004\bK\u0010LJ\u001b\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020N0MH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000fH\u0016¢\u0006\u0004\bQ\u0010GJ\u0015\u0010S\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u0019¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u0019¢\u0006\u0004\bU\u0010TR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010Z\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0017\u0010]\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00190d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006v"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/swmansion/gesturehandler/NativeRNGestureHandlerModuleSpec;", "Lca/a;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lea/d;", "T", BuildConfig.FLAVOR, "handlerName", BuildConfig.FLAVOR, "handlerTag", "Lcom/facebook/react/bridge/ReadableMap;", HVRetakeActivity.CONFIG_TAG, BuildConfig.FLAVOR, "createGestureHandlerHelper", "(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V", "updateGestureHandlerHelper", "(ILcom/facebook/react/bridge/ReadableMap;)V", BuildConfig.FLAVOR, "jsiPtr", "decorateRuntime", "(J)V", "viewTag", "Lcom/swmansion/gesturehandler/react/i;", "findRootHelperForViewAncestor", "(I)Lcom/swmansion/gesturehandler/react/i;", "handler", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "findFactoryForHandler", "(Lea/d;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "onHandlerUpdate", "(Lea/d;)V", "newState", "oldState", "onStateChange", "(Lea/d;II)V", "onTouchEvent", "Lcom/facebook/react/uimanager/events/d;", Keys.EVENT, "sendEventForReanimated", "(Lcom/facebook/react/uimanager/events/d;)V", "Lcom/swmansion/gesturehandler/react/c;", "sendEventForNativeAnimatedEvent", "(Lcom/swmansion/gesturehandler/react/c;)V", "sendEventForDirectEvent", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "data", "sendEventForDeviceEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "getName", "()Ljava/lang/String;", BuildConfig.FLAVOR, "handlerTagDouble", "createGestureHandler", "(Ljava/lang/String;DLcom/facebook/react/bridge/ReadableMap;)V", "viewTagDouble", "actionTypeDouble", "attachGestureHandler", "(DDD)V", "updateGestureHandler", "(DLcom/facebook/react/bridge/ReadableMap;)V", "dropGestureHandler", "(D)V", BuildConfig.FLAVOR, "blockNativeResponder", "handleSetJSResponder", "(DZ)V", "handleClearJSResponder", "()V", "flushOperations", "setGestureHandlerState", "(II)V", "install", "()Z", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getConstants", "()Ljava/util/Map;", "invalidate", "root", "registerRootHelper", "(Lcom/swmansion/gesturehandler/react/i;)V", "unregisterRootHelper", "com/swmansion/gesturehandler/react/RNGestureHandlerModule$l", "eventListener", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$l;", BuildConfig.FLAVOR, "handlerFactories", "[Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lcom/swmansion/gesturehandler/react/g;", "registry", "Lcom/swmansion/gesturehandler/react/g;", "getRegistry", "()Lcom/swmansion/gesturehandler/react/g;", "Lcom/swmansion/gesturehandler/react/d;", "interactionManager", "Lcom/swmansion/gesturehandler/react/d;", BuildConfig.FLAVOR, "roots", "Ljava/util/List;", "Lda/f;", "reanimatedEventDispatcher", "Lda/f;", "Companion", C4870a.f43493a, "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "react-native-gesture-handler_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec implements InterfaceC1746a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_MANUAL_ACTIVATION = "manualActivation";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NEEDS_POINTER_DATA = "needsPointerData";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVATE_AFTER_LONG_PRESS = "activateAfterLongPress";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String NAME = "RNGestureHandlerModule";
    private final l eventListener;
    private final c[] handlerFactories;
    private final com.swmansion.gesturehandler.react.d interactionManager;
    private final da.f reanimatedEventDispatcher;
    private final com.swmansion.gesturehandler.react.g registry;
    private final List<com.swmansion.gesturehandler.react.i> roots;

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(AbstractC3109d abstractC3109d, ReadableMap readableMap) {
            if (readableMap.getType(RNGestureHandlerModule.KEY_HIT_SLOP) == ReadableType.Number) {
                float f10 = C1944g0.f(readableMap.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP));
                abstractC3109d.w0(f10, f10, f10, f10, Float.NaN, Float.NaN);
                return;
            }
            ReadableMap map = readableMap.getMap(RNGestureHandlerModule.KEY_HIT_SLOP);
            Intrinsics.d(map);
            float f11 = map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL) ? C1944g0.f(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL)) : Float.NaN;
            float f12 = f11;
            float f13 = map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL) ? C1944g0.f(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL)) : Float.NaN;
            float f14 = f13;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_LEFT)) {
                f11 = C1944g0.f(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_LEFT));
            }
            float f15 = f11;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_TOP)) {
                f13 = C1944g0.f(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_TOP));
            }
            float f16 = f13;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_RIGHT)) {
                f12 = C1944g0.f(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_RIGHT));
            }
            float f17 = f12;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_BOTTOM)) {
                f14 = C1944g0.f(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_BOTTOM));
            }
            abstractC3109d.w0(f15, f16, f17, f14, map.hasKey("width") ? C1944g0.f(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? C1944g0.f(map.getDouble("height")) : Float.NaN);
        }

        private Companion() {
        }
    }

    private static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f29742a = C3107b.class;

        /* renamed from: b, reason: collision with root package name */
        private final String f29743b = "FlingGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f29743b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f29742a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(C3107b handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.a(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                handler.W0(config.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                handler.V0(config.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C3107b b(Context context) {
            return new C3107b();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C3158a c(C3107b handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C3158a(handler);
        }
    }

    private static abstract class c {
        public void a(AbstractC3109d handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            handler.n0();
            if (config.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                handler.D0(config.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (config.hasKey("enabled")) {
                handler.u0(config.getBoolean("enabled"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.INSTANCE.b(handler, config);
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA)) {
                handler.A0(config.getBoolean(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION)) {
                handler.y0(config.getBoolean(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION));
            }
            if (config.hasKey("mouseButton")) {
                handler.z0(config.getInt("mouseButton"));
            }
        }

        public abstract AbstractC3109d b(Context context);

        public abstract AbstractC3159b c(AbstractC3109d abstractC3109d);

        public abstract String d();

        public abstract Class e();
    }

    private static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f29744a = C3116k.class;

        /* renamed from: b, reason: collision with root package name */
        private final String f29745b = "HoverGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f29745b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f29744a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3116k b(Context context) {
            return new C3116k();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C3160c c(C3116k handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new C3160c(handler);
        }
    }

    private static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f29746a = ea.m.class;

        /* renamed from: b, reason: collision with root package name */
        private final String f29747b = "LongPressGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f29747b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f29746a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ea.m handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.a(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                handler.X0(config.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (config.hasKey("maxDist")) {
                handler.W0(C1944g0.f(config.getDouble("maxDist")));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                handler.Y0(config.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public ea.m b(Context context) {
            Intrinsics.d(context);
            return new ea.m(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public fa.d c(ea.m handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new fa.d(handler);
        }
    }

    private static final class f extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f29748a = n.class;

        /* renamed from: b, reason: collision with root package name */
        private final String f29749b = "ManualGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f29749b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f29748a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public n b(Context context) {
            return new n();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public fa.e c(n handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new fa.e(handler);
        }
    }

    private static final class g extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f29750a = o.class;

        /* renamed from: b, reason: collision with root package name */
        private final String f29751b = "NativeViewGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f29751b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f29750a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(o handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.a(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                handler.T0(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                handler.S0(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public o b(Context context) {
            return new o();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public fa.f c(o handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new fa.f(handler);
        }
    }

    private static final class h extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f29752a = r.class;

        /* renamed from: b, reason: collision with root package name */
        private final String f29753b = "PanGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f29753b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f29752a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(r handler, ReadableMap config) {
            boolean z10;
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.a(handler, config);
            boolean z11 = true;
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                handler.a1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)));
                z10 = true;
            } else {
                z10 = false;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                handler.Z0(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)));
                z10 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                handler.f1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)));
                z10 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                handler.e1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)));
                z10 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                handler.c1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)));
                z10 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                handler.b1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)));
                z10 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                handler.h1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)));
                z10 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                handler.g1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)));
                z10 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                handler.l1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)));
                z10 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                handler.m1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)));
                z10 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                handler.n1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)));
            } else {
                z11 = z10;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                handler.j1(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z11) {
                handler.j1(Float.MAX_VALUE);
            }
            if (config.hasKey("minPointers")) {
                handler.k1(config.getInt("minPointers"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                handler.i1(config.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                handler.d1(config.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS)) {
                handler.Y0(config.getInt(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public r b(Context context) {
            return new r(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public fa.g c(r handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new fa.g(handler);
        }
    }

    private static final class i extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f29754a = s.class;

        /* renamed from: b, reason: collision with root package name */
        private final String f29755b = "PinchGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f29755b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f29754a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public s b(Context context) {
            return new s();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public fa.h c(s handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new fa.h(handler);
        }
    }

    private static final class j extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f29756a = v.class;

        /* renamed from: b, reason: collision with root package name */
        private final String f29757b = "RotationGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f29757b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f29756a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public v b(Context context) {
            return new v();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public fa.i c(v handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new fa.i(handler);
        }
    }

    private static final class k extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f29758a = z.class;

        /* renamed from: b, reason: collision with root package name */
        private final String f29759b = "TapGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f29759b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class e() {
            return this.f29758a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(z handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.a(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                handler.a1(config.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                handler.W0(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                handler.U0(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                handler.X0(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                handler.Y0(C1944g0.f(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (config.hasKey("maxDist")) {
                handler.V0(C1944g0.f(config.getDouble("maxDist")));
            }
            if (config.hasKey("minPointers")) {
                handler.Z0(config.getInt("minPointers"));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public z b(Context context) {
            return new z();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public fa.j c(z handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new fa.j(handler);
        }
    }

    public static final class l implements p {
        l() {
        }

        @Override // ea.p
        public void a(AbstractC3109d handler, MotionEvent event) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(event, "event");
            RNGestureHandlerModule.this.onHandlerUpdate(handler);
        }

        @Override // ea.p
        public void b(AbstractC3109d handler, int i10, int i11) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            RNGestureHandlerModule.this.onStateChange(handler, i10, i11);
        }

        @Override // ea.p
        public void c(AbstractC3109d handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            RNGestureHandlerModule.this.onTouchEvent(handler);
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.eventListener = new l();
        this.handlerFactories = new c[]{new g(), new k(), new e(), new h(), new i(), new j(), new b(), new f(), new d()};
        this.registry = new com.swmansion.gesturehandler.react.g();
        this.interactionManager = new com.swmansion.gesturehandler.react.d();
        this.roots = new ArrayList();
        this.reanimatedEventDispatcher = new da.f();
    }

    private final <T extends AbstractC3109d> void createGestureHandlerHelper(String handlerName, int handlerTag, ReadableMap config) {
        if (this.registry.h(handlerTag) != null) {
            throw new IllegalStateException("Handler with tag " + handlerTag + " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors.");
        }
        for (c cVar : this.handlerFactories) {
            if (Intrinsics.b(cVar.d(), handlerName)) {
                AbstractC3109d b10 = cVar.b(getReactApplicationContext());
                b10.F0(handlerTag);
                b10.B0(this.eventListener);
                this.registry.j(b10);
                this.interactionManager.e(b10, config);
                cVar.a(b10, config);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("Invalid handler name " + handlerName);
    }

    private final native void decorateRuntime(long jsiPtr);

    private final <T extends AbstractC3109d> c findFactoryForHandler(AbstractC3109d handler) {
        for (c cVar : this.handlerFactories) {
            if (Intrinsics.b(cVar.e(), handler.getClass())) {
                return cVar;
            }
        }
        return null;
    }

    private final com.swmansion.gesturehandler.react.i findRootHelperForViewAncestor(int viewTag) {
        com.swmansion.gesturehandler.react.i iVar;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        int resolveRootTagFromReactTag = a.b(reactApplicationContext).resolveRootTagFromReactTag(viewTag);
        Object obj = null;
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            try {
                Iterator<T> it = this.roots.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    com.swmansion.gesturehandler.react.i iVar2 = (com.swmansion.gesturehandler.react.i) next;
                    if ((iVar2.f() instanceof Z) && ((Z) iVar2.f()).getRootViewTag() == resolveRootTagFromReactTag) {
                        obj = next;
                        break;
                    }
                }
                iVar = (com.swmansion.gesturehandler.react.i) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$2(RNGestureHandlerModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            SoLoader.t("gesturehandler");
            JavaScriptContextHolder javaScriptContextHolder = this$0.getReactApplicationContext().getJavaScriptContextHolder();
            Intrinsics.d(javaScriptContextHolder);
            this$0.decorateRuntime(javaScriptContextHolder.get());
        } catch (Exception unused) {
            Log.w("[RNGestureHandler]", "Could not install JSI bindings.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends AbstractC3109d> void onHandlerUpdate(T handler) {
        c findFactoryForHandler;
        if (handler.R() >= 0 && handler.Q() == 4 && (findFactoryForHandler = findFactoryForHandler(handler)) != null) {
            if (handler.D() == 1) {
                sendEventForReanimated(c.a.c(com.swmansion.gesturehandler.react.c.f29761d, handler, findFactoryForHandler.c(handler), false, 4, null));
                return;
            }
            if (handler.D() == 2) {
                sendEventForNativeAnimatedEvent(com.swmansion.gesturehandler.react.c.f29761d.b(handler, findFactoryForHandler.c(handler), true));
            } else if (handler.D() == 3) {
                sendEventForDeviceEvent("onGestureHandlerEvent", com.swmansion.gesturehandler.react.c.f29761d.a(findFactoryForHandler.c(handler)));
            } else if (handler.D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", com.swmansion.gesturehandler.react.c.f29761d.a(findFactoryForHandler.c(handler)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends AbstractC3109d> void onStateChange(T handler, int newState, int oldState) {
        c findFactoryForHandler;
        if (handler.R() >= 0 && (findFactoryForHandler = findFactoryForHandler(handler)) != null) {
            if (handler.D() == 1) {
                sendEventForReanimated(com.swmansion.gesturehandler.react.k.f29787d.b(handler, newState, oldState, findFactoryForHandler.c(handler)));
                return;
            }
            if (handler.D() == 2 || handler.D() == 3) {
                sendEventForDeviceEvent("onGestureHandlerStateChange", com.swmansion.gesturehandler.react.k.f29787d.a(findFactoryForHandler.c(handler), newState, oldState));
            } else if (handler.D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerStateChange", com.swmansion.gesturehandler.react.k.f29787d.a(findFactoryForHandler.c(handler), newState, oldState));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends AbstractC3109d> void onTouchEvent(T handler) {
        if (handler.R() < 0) {
            return;
        }
        if (handler.Q() == 2 || handler.Q() == 4 || handler.Q() == 0 || handler.U() != null) {
            if (handler.D() == 1) {
                sendEventForReanimated(com.swmansion.gesturehandler.react.l.f29792c.b(handler));
            } else if (handler.D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", com.swmansion.gesturehandler.react.l.f29792c.a(handler));
            }
        }
    }

    private final void sendEventForDeviceEvent(String eventName, WritableMap data) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        a.a(reactApplicationContext).emit(eventName, data);
    }

    private final <T extends com.facebook.react.uimanager.events.d> void sendEventForDirectEvent(T event) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        AbstractC3005e.a(reactApplicationContext, event);
    }

    private final void sendEventForNativeAnimatedEvent(com.swmansion.gesturehandler.react.c event) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        AbstractC3005e.a(reactApplicationContext, event);
    }

    private final <T extends com.facebook.react.uimanager.events.d> void sendEventForReanimated(T event) {
        da.f fVar = this.reanimatedEventDispatcher;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        fVar.a(event, reactApplicationContext);
    }

    private final <T extends AbstractC3109d> void updateGestureHandlerHelper(int handlerTag, ReadableMap config) {
        c findFactoryForHandler;
        AbstractC3109d h10 = this.registry.h(handlerTag);
        if (h10 == null || (findFactoryForHandler = findFactoryForHandler(h10)) == null) {
            return;
        }
        this.interactionManager.g(handlerTag);
        this.interactionManager.e(h10, config);
        findFactoryForHandler.a(h10, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void attachGestureHandler(double handlerTagDouble, double viewTagDouble, double actionTypeDouble) {
        int i10 = (int) handlerTagDouble;
        if (this.registry.c(i10, (int) viewTagDouble, (int) actionTypeDouble)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i10 + " does not exists");
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void createGestureHandler(String handlerName, double handlerTagDouble, ReadableMap config) {
        Intrinsics.checkNotNullParameter(handlerName, "handlerName");
        Intrinsics.checkNotNullParameter(config, "config");
        createGestureHandlerHelper(handlerName, (int) handlerTagDouble, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void dropGestureHandler(double handlerTagDouble) {
        int i10 = (int) handlerTagDouble;
        this.interactionManager.g(i10);
        this.registry.g(i10);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void flushOperations() {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return G.k(t.a("State", G.k(t.a("UNDETERMINED", 0), t.a("BEGAN", 2), t.a("ACTIVE", 4), t.a("CANCELLED", 3), t.a("FAILED", 1), t.a("END", 5))), t.a("Direction", G.k(t.a("RIGHT", 1), t.a("LEFT", 2), t.a("UP", 4), t.a("DOWN", 8))));
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    public final com.swmansion.gesturehandler.react.g getRegistry() {
        return this.registry;
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleClearJSResponder() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleSetJSResponder(double viewTagDouble, boolean blockNativeResponder) {
        int i10 = (int) viewTagDouble;
        com.swmansion.gesturehandler.react.i findRootHelperForViewAncestor = findRootHelperForViewAncestor(i10);
        if (findRootHelperForViewAncestor != null) {
            findRootHelperForViewAncestor.g(i10, blockNativeResponder);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        getReactApplicationContext().runOnJSQueueThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.e
            @Override // java.lang.Runnable
            public final void run() {
                RNGestureHandlerModule.install$lambda$2(RNGestureHandlerModule.this);
            }
        });
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.registry.f();
        this.interactionManager.h();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                try {
                    int size = this.roots.size();
                    this.roots.get(0).j();
                    if (this.roots.size() >= size) {
                        throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Unit unit = Unit.f36324a;
        }
        super.invalidate();
    }

    public final void registerRootHelper(com.swmansion.gesturehandler.react.i root) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.roots) {
            if (this.roots.contains(root)) {
                throw new IllegalStateException("Root helper" + root + " already registered");
            }
            this.roots.add(root);
        }
    }

    @Override // ca.InterfaceC1746a
    public void setGestureHandlerState(int handlerTag, int newState) {
        AbstractC3109d h10 = this.registry.h(handlerTag);
        if (h10 != null) {
            if (newState == 1) {
                h10.B();
                return;
            }
            if (newState == 2) {
                h10.n();
                return;
            }
            if (newState == 3) {
                h10.o();
            } else if (newState == 4) {
                h10.j(true);
            } else {
                if (newState != 5) {
                    return;
                }
                h10.z();
            }
        }
    }

    public final void unregisterRootHelper(com.swmansion.gesturehandler.react.i root) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void updateGestureHandler(double handlerTagDouble, ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        updateGestureHandlerHelper((int) handlerTagDouble, config);
    }
}
