package com.google.android.gms.auth;

import V6.AbstractC1287s;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes2.dex */
public class UserRecoverableAuthException extends I6.a {

    /* renamed from: a, reason: collision with root package name */
    private final Intent f23226a;

    /* renamed from: b, reason: collision with root package name */
    private final PendingIntent f23227b;

    /* renamed from: c, reason: collision with root package name */
    private final b f23228c;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, null, b.LEGACY);
    }

    public static UserRecoverableAuthException b(String str, Intent intent, PendingIntent pendingIntent) {
        AbstractC1287s.m(intent);
        AbstractC1287s.m(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, b.AUTH_INSTANTIATION);
    }

    public Intent a() {
        Intent intent = this.f23226a;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.f23228c.ordinal();
        if (ordinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (ordinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (ordinal != 2) {
            return null;
        }
        Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }

    private UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, b bVar) {
        super(str);
        this.f23227b = pendingIntent;
        this.f23226a = intent;
        this.f23228c = (b) AbstractC1287s.m(bVar);
    }
}
