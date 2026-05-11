package androidx.core.app;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f15842c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static Set f15843d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private static final Object f15844e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f15845a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f15846b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private v(Context context) {
        this.f15845a = context;
        this.f15846b = (NotificationManager) context.getSystemService("notification");
    }

    public static v b(Context context) {
        return new v(context);
    }

    public boolean a() {
        return a.a(this.f15846b);
    }
}
