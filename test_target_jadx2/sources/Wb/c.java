package Wb;

import Ea.i;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements i {
    private final String g(Context context) {
        String string = context.getString(a.f11423a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // Ea.i
    public void b(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Xb.a.a(g(activity));
    }
}
