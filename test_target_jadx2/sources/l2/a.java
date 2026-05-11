package L2;

import Q2.w;
import android.content.Context;
import android.content.Intent;
import com.chuckerteam.chucker.internal.ui.MainActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5646a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f5647b = true;

    private a() {
    }

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new w(context).f();
    }

    public static final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new w(context).g();
    }

    public static final Intent c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent flags = new Intent(context, (Class<?>) MainActivity.class).setFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(flags, "Intent(context, MainActivity::class.java)\n            .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)");
        return flags;
    }

    public static final Intent d(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent putExtra = c(context).putExtra("EXTRA_SCREEN", i10);
        Intrinsics.checkNotNullExpressionValue(putExtra, "getLaunchIntent(context).putExtra(MainActivity.EXTRA_SCREEN, screen)");
        return putExtra;
    }
}
