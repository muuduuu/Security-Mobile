package Pb;

import Ea.i;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7710a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final String g(Context context) {
        String string = context.getString(e.f7711a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final Integer h(Context context) {
        String string = context.getString(e.f7712b);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Integer intOrNull = StringsKt.toIntOrNull(string);
        if (!StringsKt.Z(string) && intOrNull == null) {
            Log.e("ERR_NAVIGATION_BAR", "Invalid XML value \"" + string + "\" for string \"expo_navigation_bar_border_color\". Expected a valid color int like \"-12177173\". Ensure the value of \"borderColor\" in the \"expo-navigation-bar\" config plugin is a valid CSS color. Skipping initial border color.");
        }
        return intOrNull;
    }

    private final String i(Context context) {
        String string = context.getString(e.f7713c);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String j(Context context) {
        String string = context.getString(e.f7714d);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String k(Context context) {
        String string = context.getString(e.f7715e);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // Ea.i
    public void b(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Integer h10 = h(activity);
        if (h10 != null) {
            Qb.b.d(activity, h10.intValue());
        }
        String k10 = k(activity);
        if (!StringsKt.Z(k10)) {
            Qb.b.j(activity, k10);
        }
        String j10 = j(activity);
        if (!StringsKt.Z(j10)) {
            Qb.b.h(activity, j10);
        }
        String g10 = g(activity);
        if (!StringsKt.Z(g10)) {
            Qb.b.b(activity, g10);
        }
        String i10 = i(activity);
        if (StringsKt.Z(i10)) {
            return;
        }
        Qb.b.g(activity, i10);
    }
}
