package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.UserManager;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.auth.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2068m {

    /* renamed from: a, reason: collision with root package name */
    private static UserManager f23740a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f23741b = !b();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context) {
        int i10;
        boolean z10;
        if (b() && !f23741b) {
            synchronized (AbstractC2068m.class) {
                try {
                    if (!f23741b) {
                        i10 = 1;
                        while (true) {
                            if (i10 <= 2) {
                                if (f23740a == null) {
                                    f23740a = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = f23740a;
                                if (userManager != null) {
                                    if (userManager.isUserUnlocked()) {
                                        break;
                                    }
                                } else {
                                    z10 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        z10 = false;
                        if (z10) {
                            f23740a = null;
                        }
                        if (z10) {
                            f23741b = true;
                        }
                        if (!z10) {
                            return true;
                        }
                    }
                } catch (NullPointerException e10) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                    f23740a = null;
                    i10++;
                } finally {
                }
            }
        }
        return false;
    }

    public static boolean b() {
        return true;
    }
}
