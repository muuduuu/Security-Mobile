package com.swmansion.rnscreens;

import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.FabricUIManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0003¨\u0006\u0014"}, d2 = {"Lcom/swmansion/rnscreens/NativeProxy;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/fabric/FabricUIManager;", "fabricUIManager", BuildConfig.FLAVOR, "nativeAddMutationsListener", "(Lcom/facebook/react/fabric/FabricUIManager;)V", BuildConfig.FLAVOR, "screenTag", "notifyScreenRemoved", "(I)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", C4870a.f43493a, "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NativeProxy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f29913b = new ConcurrentHashMap();
    private final HybridData mHybridData = initHybrid();

    /* renamed from: com.swmansion.rnscreens.NativeProxy$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i10, r view) {
            Intrinsics.checkNotNullParameter(view, "view");
            NativeProxy.f29913b.put(Integer.valueOf(i10), new WeakReference(view));
        }

        public final void b() {
            NativeProxy.f29913b.clear();
        }

        public final void c(int i10) {
            NativeProxy.f29913b.remove(Integer.valueOf(i10));
        }

        private Companion() {
        }
    }

    private final native HybridData initHybrid();

    public final native void nativeAddMutationsListener(FabricUIManager fabricUIManager);

    public final void notifyScreenRemoved(int screenTag) {
        WeakReference weakReference = (WeakReference) f29913b.get(Integer.valueOf(screenTag));
        r rVar = weakReference != null ? (r) weakReference.get() : null;
        if (rVar != null) {
            rVar.r();
            return;
        }
        Log.w("[RNScreens]", "Did not find view with tag " + screenTag + ".");
    }
}
