package com.google.firebase.iid;

import D7.AbstractC0789m;
import R6.AbstractC1144b;
import R6.C1143a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C2849n;
import com.google.firebase.messaging.L;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC1144b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // R6.AbstractC1144b
    protected int b(Context context, C1143a c1143a) {
        try {
            return ((Integer) AbstractC0789m.a(new C2849n(context).k(c1143a.j()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // R6.AbstractC1144b
    protected void c(Context context, Bundle bundle) {
        Intent f10 = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (L.E(f10)) {
            L.v(f10);
        }
    }
}
