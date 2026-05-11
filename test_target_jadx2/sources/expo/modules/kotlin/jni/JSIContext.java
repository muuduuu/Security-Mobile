package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.soloader.SoLoader;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pb.j;
import pb.k;
import pb.r;
import pb.t;
import u5.C4870a;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0086 ¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020 H\u0086 ¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b$\u0010\u0004J \u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020 H\u0086 ¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020\u001bH\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010*\u001a\u00020\u001bH\u0007¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b01H\u0007¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u0002042\u0006\u0010'\u001a\u00020 H\u0007¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0004\u0018\u00010 2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020\u000e2\n\u00105\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010'\u001a\u00020 H\u0007¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u0004\u0018\u00010 2\n\u00105\u001a\u0006\u0012\u0002\b\u00030<H\u0007¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000eH\u0004¢\u0006\u0004\bC\u0010\u0004J\u000f\u0010D\u001a\u00020\u000eH\u0016¢\u0006\u0004\bD\u0010\u0004J\u000f\u0010E\u001a\u00020\u000eH\u0016¢\u0006\u0004\bE\u0010\u0004R(\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00150F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lexpo/modules/kotlin/jni/JSIContext;", "Lexpo/modules/kotlin/jni/Destructible;", "Ljava/lang/AutoCloseable;", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", BuildConfig.FLAVOR, "jsRuntimePointer", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "jsInvokerHolder", BuildConfig.FLAVOR, "installJSI", "(JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "installJSIForBridgeless", "(JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/bridge/RuntimeExecutor;)V", "Lpb/r;", "runtimeContext", "c", "(Lpb/r;JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V", "d", "(Lpb/r;JLcom/facebook/react/bridge/RuntimeExecutor;)V", BuildConfig.FLAVOR, "script", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "evaluateScript", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "global", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", "createObject", "drainJSEventLoop", BuildConfig.FLAVOR, "id", "js", "setNativeStateForSharedObject", "(ILexpo/modules/kotlin/jni/JavaScriptObject;)V", "name", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "getJavaScriptModuleObject", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", BuildConfig.FLAVOR, "hasModule", "(Ljava/lang/String;)Z", BuildConfig.FLAVOR, "getJavaScriptModulesName", "()[Ljava/lang/String;", BuildConfig.FLAVOR, "native", "registerSharedObject", "(Ljava/lang/Object;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getSharedObject", "(I)Lexpo/modules/kotlin/jni/JavaScriptObject;", "deleteSharedObject", "(I)V", "Ljava/lang/Class;", "registerClass", "(Ljava/lang/Class;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getJavascriptClass", "(Ljava/lang/Class;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "getCoreModuleObject", "()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "finalize", C4870a.f43493a, "close", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "b", "()Ljava/lang/ref/WeakReference;", "e", "(Ljava/lang/ref/WeakReference;)V", "runtimeContextHolder", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JSIContext implements Destructible, AutoCloseable {

    /* renamed from: c, reason: collision with root package name */
    public static final int f32697c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public WeakReference runtimeContextHolder;
    private final HybridData mHybridData = initHybrid();

    static {
        SoLoader.t("expo-modules-core");
    }

    private final native HybridData initHybrid();

    private final native void installJSI(long jsRuntimePointer, JNIDeallocator jniDeallocator, CallInvokerHolderImpl jsInvokerHolder);

    private final native void installJSIForBridgeless(long jsRuntimePointer, JNIDeallocator jniDeallocator, RuntimeExecutor runtimeExecutor);

    @Override // expo.modules.kotlin.jni.Destructible
    public void a() {
        this.mHybridData.resetNative();
    }

    public final WeakReference b() {
        WeakReference weakReference = this.runtimeContextHolder;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.v("runtimeContextHolder");
        return null;
    }

    public final void c(r runtimeContext, long jsRuntimePointer, CallInvokerHolderImpl jsInvokerHolder) {
        Intrinsics.checkNotNullParameter(runtimeContext, "runtimeContext");
        Intrinsics.checkNotNullParameter(jsInvokerHolder, "jsInvokerHolder");
        e(t.a(runtimeContext));
        installJSI(jsRuntimePointer, runtimeContext.e(), jsInvokerHolder);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        a();
    }

    public final native JavaScriptObject createObject();

    public final void d(r runtimeContext, long jsRuntimePointer, RuntimeExecutor runtimeExecutor) {
        Intrinsics.checkNotNullParameter(runtimeContext, "runtimeContext");
        Intrinsics.checkNotNullParameter(runtimeExecutor, "runtimeExecutor");
        e(t.a(runtimeContext));
        installJSIForBridgeless(jsRuntimePointer, runtimeContext.e(), runtimeExecutor);
    }

    public final void deleteSharedObject(int id2) {
        Bb.c i10;
        r rVar = (r) b().get();
        if (rVar == null || (i10 = rVar.i()) == null) {
            return;
        }
        i10.b(Bb.b.b(id2));
    }

    public final native void drainJSEventLoop();

    public final void e(WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.runtimeContextHolder = weakReference;
    }

    public final native JavaScriptValue evaluateScript(String script);

    protected final void finalize() {
        a();
    }

    public final JavaScriptModuleObject_ getCoreModuleObject() {
        j d10;
        r rVar = (r) b().get();
        if (rVar == null || (d10 = rVar.d()) == null) {
            return null;
        }
        return d10.f();
    }

    public final JavaScriptModuleObject_ getJavaScriptModuleObject(String name) {
        k h10;
        j t10;
        Intrinsics.checkNotNullParameter(name, "name");
        r rVar = (r) b().get();
        if (rVar == null || (h10 = rVar.h()) == null || (t10 = h10.t(name)) == null) {
            return null;
        }
        return t10.f();
    }

    public final String[] getJavaScriptModulesName() {
        k h10;
        Map v10;
        Set keySet;
        String[] strArr;
        r rVar = (r) b().get();
        return (rVar == null || (h10 = rVar.h()) == null || (v10 = h10.v()) == null || (keySet = v10.keySet()) == null || (strArr = (String[]) keySet.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    public final JavaScriptObject getJavascriptClass(Class<?> r22) {
        Bb.a c10;
        Intrinsics.checkNotNullParameter(r22, "native");
        r rVar = (r) b().get();
        if (rVar == null || (c10 = rVar.c()) == null) {
            return null;
        }
        return c10.d(r22);
    }

    public final JavaScriptObject getSharedObject(int id2) {
        r rVar = (r) b().get();
        if (rVar == null) {
            return null;
        }
        return Bb.b.e(Bb.b.b(id2), rVar);
    }

    public final native JavaScriptObject global();

    public final boolean hasModule(String name) {
        k h10;
        Intrinsics.checkNotNullParameter(name, "name");
        r rVar = (r) b().get();
        if (rVar == null || (h10 = rVar.h()) == null) {
            return false;
        }
        return h10.w(name);
    }

    public final void registerClass(Class<?> r22, JavaScriptObject js) {
        Bb.a c10;
        Intrinsics.checkNotNullParameter(r22, "native");
        Intrinsics.checkNotNullParameter(js, "js");
        r rVar = (r) b().get();
        if (rVar == null || (c10 = rVar.c()) == null) {
            return;
        }
        c10.b(r22, js);
    }

    public final void registerSharedObject(Object r22, JavaScriptObject js) {
        Bb.c i10;
        Intrinsics.checkNotNullParameter(r22, "native");
        Intrinsics.checkNotNullParameter(js, "js");
        r rVar = (r) b().get();
        if (rVar == null || (i10 = rVar.i()) == null) {
            return;
        }
        Bb.b.a(i10.a((SharedObject) r22, js));
    }

    public final native void setNativeStateForSharedObject(int id2, JavaScriptObject js);
}
