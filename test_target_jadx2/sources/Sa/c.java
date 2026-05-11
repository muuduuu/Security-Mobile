package Sa;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8930a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f8931b = G.k(t.a("success", new e(new long[]{0, 40, 100, 40}, new int[]{0, 50, 0, 60}, new long[]{0, 40, 100, 40})), t.a("warning", new e(new long[]{0, 40, 120, 60}, new int[]{0, 40, 0, 60}, new long[]{0, 40, 120, 60})), t.a(AppConstants.VIDEO_RECORDING_ERROR, new e(new long[]{0, 60, 100, 40, 80, 50}, new int[]{0, 50, 0, 40, 0, 50}, new long[]{0, 60, 100, 40, 80, 50})));

    private c() {
    }

    public final e a(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj = f8931b.get(type);
        if (obj != null) {
            return (e) obj;
        }
        throw new b("'type' must be one of ['success', 'warning', 'error']. Obtained '" + type + "'.");
    }
}
