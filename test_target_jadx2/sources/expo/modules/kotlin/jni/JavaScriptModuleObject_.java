package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", BuildConfig.FLAVOR, "name", "<init>", "(Lexpo/modules/kotlin/jni/JNIDeallocator;Ljava/lang/String;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "decorator", BuildConfig.FLAVOR, "decorate", "(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "finalize", "()V", C4870a.f43493a, "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "mHybridData", "Lcom/facebook/jni/HybridData;", BuildConfig.FLAVOR, "b", "()Z", "isValid", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: expo.modules.kotlin.jni.JavaScriptModuleObject, reason: from toString */
/* loaded from: classes2.dex */
public final class JavaScriptModuleObject_ implements Destructible {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String JavaScriptModuleObject_;
    private final HybridData mHybridData;

    public JavaScriptModuleObject_(JNIDeallocator jniDeallocator, String name) {
        Intrinsics.checkNotNullParameter(jniDeallocator, "jniDeallocator");
        Intrinsics.checkNotNullParameter(name, "name");
        this.JavaScriptModuleObject_ = name;
        this.mHybridData = initHybrid();
        jniDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    @Override // expo.modules.kotlin.jni.Destructible
    public void a() {
        this.mHybridData.resetNative();
    }

    public final boolean b() {
        return this.mHybridData.isValid();
    }

    public final native void decorate(JSDecoratorsBridgingObject decorator);

    protected final void finalize() {
        a();
    }

    public String toString() {
        return "JavaScriptModuleObject_" + this.JavaScriptModuleObject_;
    }
}
