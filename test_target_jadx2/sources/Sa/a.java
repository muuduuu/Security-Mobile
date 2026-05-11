package Sa;

import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8928a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f8929b = G.k(t.a("light", new e(new long[]{0, 50}, new int[]{0, 30}, new long[]{0, 20})), t.a("soft", new e(new long[]{0, 50}, new int[]{0, 30}, new long[]{0, 20})), t.a("medium", new e(new long[]{0, 43}, new int[]{0, 50}, new long[]{0, 43})), t.a("rigid", new e(new long[]{0, 43}, new int[]{0, 50}, new long[]{0, 43})), t.a("heavy", new e(new long[]{0, 60}, new int[]{0, 70}, new long[]{0, 61})));

    private a() {
    }

    public final e a(String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        Object obj = f8929b.get(style);
        if (obj != null) {
            return (e) obj;
        }
        throw new b("'style' must be one of ['light', 'medium', 'heavy', 'rigid', 'soft']. Obtained " + style + "'.");
    }
}
