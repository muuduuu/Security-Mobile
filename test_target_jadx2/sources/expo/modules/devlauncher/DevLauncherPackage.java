package expo.modules.devlauncher;

import Ea.g;
import Ja.a;
import android.content.Context;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, d2 = {"Lexpo/modules/devlauncher/DevLauncherPackage;", "LEa/g;", "Lcom/facebook/react/P;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", BuildConfig.FLAVOR, "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "d", "(Landroid/content/Context;)Ljava/util/List;", "activityContext", "LEa/i;", "b", "LEa/h;", "e", "LEa/j;", C4870a.f43493a, "expo-dev-launcher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DevLauncherPackage implements g, P {
    @Override // Ea.g
    public List a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a.f4871a.e(context);
    }

    @Override // Ea.g
    public List b(Context activityContext) {
        return a.f4871a.d(activityContext);
    }

    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return a.f4871a.b(reactContext);
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.j();
    }

    @Override // Ea.g
    public List d(Context context) {
        return a.f4871a.a(context);
    }

    @Override // Ea.g
    public List e(Context activityContext) {
        return a.f4871a.c(activityContext);
    }
}
