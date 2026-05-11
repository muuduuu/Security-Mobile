package com.webengage.sdk.android;

import android.content.Context;
import java.util.Queue;

/* loaded from: classes2.dex */
class d4 {

    /* renamed from: a, reason: collision with root package name */
    static User f30498a;

    /* renamed from: b, reason: collision with root package name */
    static User f30499b;

    /* renamed from: c, reason: collision with root package name */
    static User f30500c;

    protected static User a() {
        if (f30499b == null) {
            f30499b = new f4();
        }
        return f30499b;
    }

    public static User a(Context context, Analytics analytics) {
        if (f30498a == null) {
            f30498a = new e4(context.getApplicationContext(), analytics);
        }
        return f30498a;
    }

    protected static User a(Queue<v3> queue) {
        if (f30500c == null) {
            f30500c = new l2(queue);
        }
        return f30500c;
    }
}
