package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class O3 {

    /* renamed from: a, reason: collision with root package name */
    private static UserManager f24315a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f24316b = !a();

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean d(Context context) {
        boolean z10;
        if (f24316b) {
            return true;
        }
        synchronized (O3.class) {
            try {
                if (f24316b) {
                    return true;
                }
                int i10 = 1;
                while (true) {
                    z10 = false;
                    if (i10 > 2) {
                        break;
                    }
                    if (f24315a == null) {
                        f24315a = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = f24315a;
                    if (userManager == null) {
                        z10 = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e10) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                        f24315a = null;
                        i10++;
                    }
                }
                if (z10) {
                    f24315a = null;
                }
                if (z10) {
                    f24316b = true;
                }
                return z10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
