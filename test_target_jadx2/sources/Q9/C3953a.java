package q9;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import com.growwtechpvt.reactnativestorage.RNStorageModule;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3953a implements P {
    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.e(new RNStorageModule(reactContext));
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.j();
    }
}
