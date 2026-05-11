package l5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.res.f;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import uc.AbstractC4881a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37094b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final c f37095c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Map f37096a = new HashMap();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f37095c;
        }

        private a() {
        }
    }

    private c() {
    }

    private final int b(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        this.f37096a.put(str, Integer.valueOf(identifier));
        return identifier;
    }

    public static final c d() {
        return f37094b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r4 = r3.getName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String e(Context context, String str) {
        String str2;
        Integer valueOf = Integer.valueOf(g(context, str));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(valueOf.intValue());
            Intrinsics.checkNotNullExpressionValue(xml, "getXml(...)");
            try {
                int eventType = xml.getEventType();
                while (true) {
                    if (eventType == 1) {
                        str2 = null;
                        break;
                    }
                    if (eventType == 2) {
                        break;
                    }
                    eventType = xml.next();
                }
                AbstractC4881a.a(xml, null);
                return str2;
            } finally {
            }
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public final synchronized void c() {
        this.f37096a.clear();
    }

    public final Drawable f(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        int g10 = g(context, str);
        if (g10 > 0) {
            return f.f(context.getResources(), g10, null);
        }
        return null;
    }

    public final int g(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null || str.length() == 0) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String z10 = StringsKt.z(lowerCase, "-", "_", false, 4, null);
        try {
            return Integer.parseInt(z10);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                try {
                    Integer num = (Integer) this.f37096a.get(z10);
                    return num != null ? num.intValue() : b(context, z10);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final Uri h(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        int g10 = g(context, str);
        if (g10 > 0) {
            Uri build = new Uri.Builder().scheme("res").path(String.valueOf(g10)).build();
            Intrinsics.d(build);
            return build;
        }
        Uri uri = Uri.EMPTY;
        Intrinsics.d(uri);
        return uri;
    }

    public final boolean i(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.b(e(context, name), "vector");
    }
}
