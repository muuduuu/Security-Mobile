package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;

/* loaded from: classes2.dex */
public abstract class k {
    public static boolean a(Context context, String str) {
        io.sentry.util.n.c(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
