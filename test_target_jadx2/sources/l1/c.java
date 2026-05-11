package l1;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f36996a = new c();

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        Intrinsics.checkNotNullExpressionValue(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
