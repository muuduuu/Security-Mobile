package Ba;

import java.util.Map;
import kotlin.collections.G;
import lc.t;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f548a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f549b = G.k(t.a("host.exp.exponent.experience.splashscreen.legacy.SplashScreenPackage", 11), t.a("expo.modules.updates.UpdatesPackage", 10));

    /* renamed from: c, reason: collision with root package name */
    public static final int f550c = 8;

    private a() {
    }

    public final int a(String str) {
        Integer num;
        if (str == null || (num = (Integer) f549b.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
