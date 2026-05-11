package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\u001d\u0010\fJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0086 ¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000!H\u0086 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H\u0086 ¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0004¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+¨\u0006,"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "T", "Lexpo/modules/kotlin/jni/JavaScriptFunction;", "jniGetFunction", "()Lexpo/modules/kotlin/jni/JavaScriptFunction;", BuildConfig.FLAVOR, "kind", "()Ljava/lang/String;", BuildConfig.FLAVOR, "isNull", "()Z", "isUndefined", "isBool", "isNumber", "isString", "isSymbol", "isFunction", "isArray", "isTypedArray", "isObject", "getBool", BuildConfig.FLAVOR, "getDouble", "()D", "getString", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "getObject", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", BuildConfig.FLAVOR, "getArray", "()[Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "getTypedArray", "()Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", BuildConfig.FLAVOR, "finalize", "()V", C4870a.f43493a, "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JavaScriptValue implements Destructible {
    private final HybridData mHybridData;

    private JavaScriptValue(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private final native <T> JavaScriptFunction<T> jniGetFunction();

    @Override // expo.modules.kotlin.jni.Destructible
    public void a() {
        this.mHybridData.resetNative();
    }

    protected final void finalize() {
        a();
    }

    public final native JavaScriptValue[] getArray();

    public final native boolean getBool();

    public final native double getDouble();

    public final native JavaScriptObject getObject();

    public final native String getString();

    public final native JavaScriptTypedArray getTypedArray();

    public final native boolean isArray();

    public final native boolean isBool();

    public final native boolean isFunction();

    public final native boolean isNull();

    public final native boolean isNumber();

    public final native boolean isObject();

    public final native boolean isString();

    public final native boolean isSymbol();

    public final native boolean isTypedArray();

    public final native boolean isUndefined();

    public final native String kind();
}
