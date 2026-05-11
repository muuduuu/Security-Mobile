package com.facebook.react.modules.fresco;

import K4.a;
import R4.b;
import R4.c;
import Td.B;
import Td.y;
import android.content.Context;
import b4.k;
import b4.l;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.e;
import com.facebook.react.modules.network.h;
import com.facebook.react.modules.network.i;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@a(name = FrescoModule.NAME, needsEagerInit = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001$B)\b\u0007\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", BuildConfig.FLAVOR, "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", BuildConfig.FLAVOR, "clearOnDestroy", "Lb4/l;", "imagePipelineConfig", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;ZLb4/l;)V", "Lb4/k;", "imagePipeline", "hasBeenInitializedExternally", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lb4/k;ZZ)V", BuildConfig.FLAVOR, "initialize", "()V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "clearSensitiveData", "onHostResume", "onHostPause", "onHostDestroy", "invalidate", "Z", HVRetakeActivity.CONFIG_TAG, "Lb4/l;", "pipeline", "Lb4/k;", "getImagePipeline", "()Lb4/k;", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String NAME = "FrescoModule";
    private static boolean hasBeenInitialized;
    private final boolean clearOnDestroy;
    private l config;
    private k pipeline;

    /* renamed from: com.facebook.react.modules.fresco.FrescoModule$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final l b(ReactContext reactContext) {
            return c(reactContext).a();
        }

        public final l.a c(ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            HashSet hashSet = new HashSet();
            hashSet.add(new c());
            B a10 = h.a();
            i.a(a10).a(new y(new e(context)));
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            Intrinsics.d(a10);
            return X3.a.a(applicationContext, a10).Q(new b(a10)).P(b4.e.AUTO).R(hashSet);
        }

        public final boolean d() {
            return FrescoModule.hasBeenInitialized;
        }

        private Companion() {
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, false, null, 6, null);
    }

    public static final l.a getDefaultConfigBuilder(ReactContext reactContext) {
        return INSTANCE.c(reactContext);
    }

    private final k getImagePipeline() {
        if (this.pipeline == null) {
            this.pipeline = r3.c.a();
        }
        return this.pipeline;
    }

    public static final boolean hasBeenInitialized() {
        return INSTANCE.d();
    }

    public void clearSensitiveData() {
        k imagePipeline = getImagePipeline();
        if (imagePipeline != null) {
            imagePipeline.c();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.addLifecycleEventListener(this);
        Companion companion = INSTANCE;
        if (!companion.d()) {
            if (this.config == null) {
                Intrinsics.d(reactApplicationContext);
                this.config = companion.b(reactApplicationContext);
            }
            r3.c.c(reactApplicationContext.getApplicationContext(), this.config);
            hasBeenInitialized = true;
        } else if (this.config != null) {
            AbstractC1721a.J("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.config = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (INSTANCE.d() && this.clearOnDestroy) {
            k imagePipeline = getImagePipeline();
            Intrinsics.d(imagePipeline);
            imagePipeline.e();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, k kVar) {
        this(reactApplicationContext, kVar, false, false, 12, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, k kVar, boolean z10) {
        this(reactApplicationContext, kVar, z10, false, 8, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10) {
        this(reactApplicationContext, z10, null, 4, null);
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10, l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : lVar);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10, l lVar) {
        super(reactApplicationContext);
        this.clearOnDestroy = z10;
        this.config = lVar;
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, k kVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, kVar, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? false : z11);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, k kVar, boolean z10, boolean z11) {
        this(reactApplicationContext, z10, null, 4, null);
        this.pipeline = kVar;
        if (z11) {
            hasBeenInitialized = true;
        }
    }
}
