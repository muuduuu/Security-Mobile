package com.webengage.sdk.android;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    private static String f30732a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f30733b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f30734c = false;

    public static String a() {
        f30733b = true;
        if (f30734c) {
            return null;
        }
        f30734c = true;
        String str = f30732a;
        f30732a = null;
        return str;
    }

    public static void b() {
        f30734c = false;
        f30733b = false;
        f30732a = null;
    }

    public static void a(Activity activity) {
        String a10 = a();
        if (activity == null || a10 == null) {
            return;
        }
        String trim = a10.trim();
        if (trim.isEmpty()) {
            return;
        }
        try {
            Intent intent = activity.getIntent();
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra("we_landing_page_intent", trim);
            activity.setIntent(intent);
        } catch (Exception unused) {
        }
    }

    public static void a(String str) {
        if (f30733b || f30732a != null || str == null || str.trim().isEmpty()) {
            return;
        }
        f30732a = str.trim();
    }
}
