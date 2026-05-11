package Ta;

import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f9655a = new w();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f9656b = new LinkedHashMap();

    private w() {
    }

    private final int a(Context context, String str) {
        if (str.length() == 0) {
            return -1;
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String z10 = StringsKt.z(lowerCase, "-", "_", false, 4, null);
        synchronized (this) {
            Map map = f9656b;
            Integer num = (Integer) map.get(z10);
            if (num != null) {
                return num.intValue();
            }
            int identifier = context.getResources().getIdentifier(z10, "raw", context.getPackageName());
            map.put(z10, Integer.valueOf(identifier));
            return identifier;
        }
    }

    public final Uri b(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Uri h10 = l5.c.f37094b.a().h(context, name);
        if (!Intrinsics.b(h10, Uri.EMPTY)) {
            return h10;
        }
        int a10 = a(context, name);
        if (a10 > 0) {
            return new Uri.Builder().scheme("res").path(String.valueOf(a10)).build();
        }
        return null;
    }
}
