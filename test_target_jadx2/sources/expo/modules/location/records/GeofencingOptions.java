package expo.modules.location.records;

import Ab.b;
import Ab.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u000e\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007¨\u0006\u0014"}, d2 = {"Lexpo/modules/location/records/GeofencingOptions;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "Lexpo/modules/location/records/Region;", "regions", "<init>", "(Ljava/util/List;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toMap$expo_location_release", "()Ljava/util/Map;", "toMap", "Ljava/util/List;", "getRegions", "()Ljava/util/List;", "setRegions", "getRegions$annotations", "()V", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GeofencingOptions implements c, Serializable {
    private List<Region> regions;

    public GeofencingOptions(List<Region> regions) {
        Intrinsics.checkNotNullParameter(regions, "regions");
        this.regions = regions;
    }

    @b
    public static /* synthetic */ void getRegions$annotations() {
    }

    public final List<Region> getRegions() {
        return this.regions;
    }

    public final void setRegions(List<Region> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.regions = list;
    }

    public final Map<String, Object> toMap$expo_location_release() {
        List<Region> list = this.regions;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Region) it.next()).toMap$expo_location_release());
        }
        return G.e(t.a("regions", arrayList));
    }
}
