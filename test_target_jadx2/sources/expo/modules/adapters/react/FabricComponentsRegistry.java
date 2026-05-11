package expo.modules.adapters.react;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0012B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lexpo/modules/adapters/react/FabricComponentsRegistry;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/facebook/react/uimanager/ViewManager;", "viewManagerList", "<init>", "(Ljava/util/List;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "componentNames", BuildConfig.FLAVOR, "registerComponentsRegistry", "([Ljava/lang/String;)V", "finalize", "()V", C4870a.f43493a, "Ljava/util/List;", "mHybridData", "Lcom/facebook/jni/HybridData;", "b", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FabricComponentsRegistry {

    /* renamed from: c, reason: collision with root package name */
    public static final int f32570c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List componentNames;
    private final HybridData mHybridData;

    static {
        SoLoader.t("expo-modules-core");
    }

    public FabricComponentsRegistry(List viewManagerList) {
        Intrinsics.checkNotNullParameter(viewManagerList, "viewManagerList");
        List list = viewManagerList;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ViewManager) it.next()).getName());
        }
        this.componentNames = arrayList;
        this.mHybridData = initHybrid();
        registerComponentsRegistry((String[]) arrayList.toArray(new String[0]));
    }

    private final native HybridData initHybrid();

    private final native void registerComponentsRegistry(String[] componentNames);

    protected final void finalize() {
        this.mHybridData.resetNative();
    }
}
