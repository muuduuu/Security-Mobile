package io.invertase.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.AbstractServiceC1893h;
import com.google.firebase.messaging.W;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static HashMap f34378a = new HashMap();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("RNFirebaseMsgReceiver", "broadcast received for message");
        if (io.invertase.firebase.app.a.a() == null) {
            io.invertase.firebase.app.a.b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.e("RNFirebaseMsgReceiver", "broadcast intent received with no extras");
            return;
        }
        W w10 = new W(intent.getExtras());
        Zb.g i10 = Zb.g.i();
        if (w10.a1() != null) {
            f34378a.put(w10.I(), w10);
            w.a().b().c(w10);
        }
        if (Zb.m.c(context)) {
            i10.o(u.h(w10, Boolean.FALSE));
            return;
        }
        try {
            Intent intent2 = new Intent(context, (Class<?>) ReactNativeFirebaseMessagingHeadlessService.class);
            intent2.putExtra("message", w10);
            if (context.startService(intent2) != null) {
                AbstractServiceC1893h.e(context);
            }
        } catch (IllegalStateException e10) {
            Log.e("RNFirebaseMsgReceiver", "Background messages only work if the message priority is set to 'high'", e10);
        }
    }
}
