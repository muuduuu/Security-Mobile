package com.facebook.react.fabric.events;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.FabricSoLoader;
import com.facebook.react.uimanager.events.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0017\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u0003¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/fabric/events/EventBeatManager;", "Lcom/facebook/react/uimanager/events/a;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, "tick", "onBatchEventDispatched", "Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "Companion", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventBeatManager implements a {
    private static final Companion Companion = new Companion(null);
    private final HybridData mHybridData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0083 ¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/fabric/events/EventBeatManager$Companion;", BuildConfig.FLAVOR, "()V", "initHybrid", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData initHybrid() {
            return EventBeatManager.initHybrid();
        }

        private Companion() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    public EventBeatManager() {
        this.mHybridData = Companion.initHybrid();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid();

    private final native void tick();

    @Override // com.facebook.react.uimanager.events.a
    public void onBatchEventDispatched() {
        tick();
    }

    public EventBeatManager(ReactApplicationContext reactApplicationContext) {
        this();
    }
}
