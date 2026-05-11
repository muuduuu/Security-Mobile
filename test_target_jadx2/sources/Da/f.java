package da;

import com.facebook.react.bridge.ReactContext;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private ReanimatedModule f31334a;

    public final void a(com.facebook.react.uimanager.events.d event, ReactContext reactApplicationContext) {
        NodesManager nodesManager;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        if (this.f31334a == null) {
            this.f31334a = (ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class);
        }
        ReanimatedModule reanimatedModule = this.f31334a;
        if (reanimatedModule == null || (nodesManager = reanimatedModule.getNodesManager()) == null) {
            return;
        }
        nodesManager.onEventDispatch(event);
    }
}
