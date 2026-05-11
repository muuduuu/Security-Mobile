package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/runtime/JSTimerExecutor;", "LO4/d;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lcom/facebook/react/bridge/WritableNativeArray;", "timerIDs", BuildConfig.FLAVOR, "callTimers", "(Lcom/facebook/react/bridge/WritableNativeArray;)V", "Lcom/facebook/react/bridge/WritableArray;", "(Lcom/facebook/react/bridge/WritableArray;)V", BuildConfig.FLAVOR, "frameTime", "callIdleCallbacks", "(D)V", BuildConfig.FLAVOR, "warningMessage", "emitTimeDriftWarning", "(Ljava/lang/String;)V", "Lcom/facebook/jni/HybridData;", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JSTimerExecutor implements O4.d {
    private static final a Companion = new a(null);
    private final HybridData mHybridData;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        SoLoader.t("rninstance");
    }

    public JSTimerExecutor(HybridData mHybridData) {
        Intrinsics.checkNotNullParameter(mHybridData, "mHybridData");
        this.mHybridData = mHybridData;
    }

    private final native void callTimers(WritableNativeArray timerIDs);

    @Override // O4.d
    public void callIdleCallbacks(double frameTime) {
    }

    @Override // O4.d
    public void callTimers(WritableArray timerIDs) {
        Intrinsics.checkNotNullParameter(timerIDs, "timerIDs");
        callTimers((WritableNativeArray) timerIDs);
    }

    @Override // O4.d
    public void emitTimeDriftWarning(String warningMessage) {
        Intrinsics.checkNotNullParameter(warningMessage, "warningMessage");
    }
}
