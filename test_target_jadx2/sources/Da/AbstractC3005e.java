package da;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.L0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: da.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3005e {
    public static final void a(ReactContext reactContext, com.facebook.react.uimanager.events.d event) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        UIManager g10 = L0.g(reactContext, 2);
        Intrinsics.e(g10, "null cannot be cast to non-null type com.facebook.react.fabric.FabricUIManager");
        ((FabricUIManager) g10).getEventDispatcher().c(event);
    }
}
