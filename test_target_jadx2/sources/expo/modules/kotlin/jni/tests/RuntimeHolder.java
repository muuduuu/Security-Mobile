package expo.modules.kotlin.jni.tests;

import com.facebook.jni.HybridData;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\b\u0010\u0003J\u0010\u0010\n\u001a\u00020\tH\u0086 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/jni/tests/RuntimeHolder;", "Ljava/lang/AutoCloseable;", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", BuildConfig.FLAVOR, "release", BuildConfig.FLAVOR, "createRuntime", "()J", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "createCallInvoker", "()Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "finalize", "close", "mHybridData", "Lcom/facebook/jni/HybridData;", "Ljava/util/concurrent/atomic/AtomicBoolean;", C4870a.f43493a, "Ljava/util/concurrent/atomic/AtomicBoolean;", "wasDeallocated", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RuntimeHolder implements AutoCloseable {
    private final HybridData mHybridData = initHybrid();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AtomicBoolean wasDeallocated = new AtomicBoolean(false);

    private final native HybridData initHybrid();

    private final native void release();

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.wasDeallocated.compareAndSet(false, true)) {
            release();
            this.mHybridData.resetNative();
        }
    }

    public final native CallInvokerHolderImpl createCallInvoker();

    public final native long createRuntime();

    protected final void finalize() {
        close();
    }
}
