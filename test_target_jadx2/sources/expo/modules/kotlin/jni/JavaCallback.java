package expo.modules.kotlin.jni;

import Db.J;
import Db.K;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pb.AbstractC3864c;
import u5.C4870a;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u0007\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0007\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0013J \u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0016J&\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0017H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u0007\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001bH\u0082 ¢\u0006\u0004\b\u0007\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001dH\u0082 ¢\u0006\u0004\b\u0007\u0010\u001eJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b\u0007\u0010!J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\"H\u0082 ¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020%H\u0082 ¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020(H\u0082 ¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020+H\u0082 ¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0015H\u0086\u0002¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b1\u0010\bJ\u0018\u00102\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b2\u0010\u000bJ\u0018\u00103\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b3\u0010\rJ\u0018\u00104\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b4\u0010\u000fJ\u0018\u00105\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b5\u0010\u0011J\u0018\u00106\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b6\u0010\u0013J \u00107\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0086\u0002¢\u0006\u0004\b7\u0010\u0016J \u00108\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b8\u0010!J\u000f\u00109\u001a\u00020\u0006H\u0004¢\u0006\u0004\b9\u0010\bJ\u000f\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;¨\u0006<"}, d2 = {"Lexpo/modules/kotlin/jni/JavaCallback;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", BuildConfig.FLAVOR, "invokeNative", "()V", BuildConfig.FLAVOR, "result", "(I)V", BuildConfig.FLAVOR, "(Z)V", BuildConfig.FLAVOR, "(D)V", BuildConfig.FLAVOR, "(F)V", BuildConfig.FLAVOR, "(Ljava/lang/String;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "(Ljava/util/Collection;)V", BuildConfig.FLAVOR, "(Ljava/util/Map;)V", "Lcom/facebook/react/bridge/WritableNativeArray;", "(Lcom/facebook/react/bridge/WritableNativeArray;)V", "Lcom/facebook/react/bridge/WritableNativeMap;", "(Lcom/facebook/react/bridge/WritableNativeMap;)V", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "(Lexpo/modules/kotlin/sharedobjects/SharedObject;)V", AppConstants.RETAKE_ERROR_CODE, Keys.ERROR_MESSAGE, "(Ljava/lang/String;Ljava/lang/String;)V", BuildConfig.FLAVOR, "invokeIntArray", "([I)V", BuildConfig.FLAVOR, "invokeLongArray", "([J)V", BuildConfig.FLAVOR, "invokeFloatArray", "([F)V", BuildConfig.FLAVOR, "invokeDoubleArray", "([D)V", "value", "f", "(Ljava/lang/Object;)V", "b", "e", "j", "c", "d", "g", "i", "h", "finalize", C4870a.f43493a, "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JavaCallback implements Destructible {
    private final HybridData mHybridData;

    public JavaCallback(HybridData mHybridData) {
        Intrinsics.checkNotNullParameter(mHybridData, "mHybridData");
        this.mHybridData = mHybridData;
    }

    private final native void invokeDoubleArray(double[] result);

    private final native void invokeFloatArray(float[] result);

    private final native void invokeIntArray(int[] result);

    private final native void invokeLongArray(long[] result);

    private final native void invokeNative();

    private final native void invokeNative(double result);

    private final native void invokeNative(float result);

    private final native void invokeNative(int result);

    private final native void invokeNative(WritableNativeArray result);

    private final native void invokeNative(WritableNativeMap result);

    private final native void invokeNative(SharedObject result);

    private final native void invokeNative(String result);

    private final native void invokeNative(String code, String errorMessage);

    private final native void invokeNative(Collection<? extends Object> result);

    private final native void invokeNative(Map<String, ? extends Object> result);

    private final native void invokeNative(boolean result);

    @Override // expo.modules.kotlin.jni.Destructible
    public void a() {
        this.mHybridData.resetNative();
    }

    public final void b() {
        try {
            invokeNative();
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC3864c.a().a("Invalidated JavaCallback was invoked", th);
        }
    }

    public final void c(double result) {
        try {
            invokeNative(result);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC3864c.a().a("Invalidated JavaCallback was invoked", th);
        }
    }

    public final void d(float result) {
        try {
            invokeNative(result);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC3864c.a().a("Invalidated JavaCallback was invoked", th);
        }
    }

    public final void e(int result) {
        try {
            invokeNative(result);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC3864c.a().a("Invalidated JavaCallback was invoked", th);
        }
    }

    public final void f(Object value) {
        try {
            Object b10 = J.b(J.f1409a, value, null, true, 2, null);
            if (b10 == null) {
                invokeNative();
                return;
            }
            if (b10 instanceof Integer) {
                invokeNative(((Number) b10).intValue());
                return;
            }
            if (b10 instanceof Boolean) {
                invokeNative(((Boolean) b10).booleanValue());
                return;
            }
            if (b10 instanceof Double) {
                invokeNative(((Number) b10).doubleValue());
                return;
            }
            if (b10 instanceof Float) {
                invokeNative(((Number) b10).floatValue());
                return;
            }
            if (b10 instanceof String) {
                invokeNative((String) b10);
                return;
            }
            if (b10 instanceof Collection) {
                invokeNative((Collection<? extends Object>) b10);
                return;
            }
            if (b10 instanceof Map) {
                invokeNative((Map<String, ? extends Object>) b10);
                return;
            }
            if (b10 instanceof WritableNativeArray) {
                invokeNative((WritableNativeArray) b10);
                return;
            }
            if (b10 instanceof WritableNativeMap) {
                invokeNative((WritableNativeMap) b10);
                return;
            }
            if (b10 instanceof SharedObject) {
                invokeNative((SharedObject) b10);
                return;
            }
            if (b10 instanceof int[]) {
                invokeIntArray((int[]) b10);
                return;
            }
            if (b10 instanceof long[]) {
                invokeLongArray((long[]) b10);
                return;
            }
            if (b10 instanceof float[]) {
                invokeFloatArray((float[]) b10);
                return;
            }
            if (b10 instanceof double[]) {
                invokeDoubleArray((double[]) b10);
                return;
            }
            throw new UnexpectedException("Unknown type: " + b10.getClass());
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC3864c.a().a("Invalidated JavaCallback was invoked", th);
        }
    }

    protected final void finalize() {
        a();
    }

    public final void g(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            invokeNative(result);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC3864c.a().a("Invalidated JavaCallback was invoked", th);
        }
    }

    public final void h(String code, String errorMessage) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        try {
            invokeNative(code, errorMessage);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC3864c.a().a("Invalidated JavaCallback was invoked", th);
        }
    }

    public final void i(Collection result) {
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            invokeNative(K.r(result));
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC3864c.a().a("Invalidated JavaCallback was invoked", th);
        }
    }

    public final void j(boolean result) {
        try {
            invokeNative(result);
        } catch (Throwable th) {
            if (this.mHybridData.isValid()) {
                throw th;
            }
            AbstractC3864c.a().a("Invalidated JavaCallback was invoked", th);
        }
    }
}
