package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.clearcut.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2111b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UserManager f24007a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f24008b = !b();

    public static boolean a(Context context) {
        return b() && !c(context);
    }

    private static boolean b() {
        return true;
    }

    private static boolean c(Context context) {
        boolean z10 = f24008b;
        if (!z10) {
            UserManager userManager = f24007a;
            if (userManager == null) {
                synchronized (AbstractC2111b.class) {
                    try {
                        userManager = f24007a;
                        if (userManager == null) {
                            UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                            f24007a = userManager2;
                            if (userManager2 == null) {
                                f24008b = true;
                                return true;
                            }
                            userManager = userManager2;
                        }
                    } finally {
                    }
                }
            }
            z10 = userManager.isUserUnlocked();
            f24008b = z10;
            if (z10) {
                f24007a = null;
            }
        }
        return z10;
    }
}
