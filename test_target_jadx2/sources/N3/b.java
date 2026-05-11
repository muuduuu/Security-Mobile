package N3;

import O3.b;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6536a = new b();

    private b() {
    }

    public static final b.a a(Map componentAttribution, Map shortcutAttribution, Map map, Map map2, Rect rect, String str, PointF pointF, Map map3, Object obj, boolean z10, Uri uri) {
        Intrinsics.checkNotNullParameter(componentAttribution, "componentAttribution");
        Intrinsics.checkNotNullParameter(shortcutAttribution, "shortcutAttribution");
        b.a aVar = new b.a();
        if (rect != null) {
            aVar.f7017h = rect.width();
            aVar.f7018i = rect.height();
        }
        aVar.f7019j = str;
        if (pointF != null) {
            aVar.f7020k = Float.valueOf(pointF.x);
            aVar.f7021l = Float.valueOf(pointF.y);
        }
        aVar.f7015f = obj;
        aVar.f7022m = z10;
        aVar.f7016g = uri;
        aVar.f7012c = map;
        aVar.f7013d = map3;
        aVar.f7011b = shortcutAttribution;
        aVar.f7010a = componentAttribution;
        aVar.f7014e = map2;
        return aVar;
    }
}
