package com.google.firebase.messaging;

import R6.C1143a;
import R6.C1145c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends AbstractServiceC2844i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private C1145c rpc;

    private boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private void h(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (N.t(extras)) {
            N n10 = new N(extras);
            ExecutorService e10 = AbstractC2850o.e();
            try {
                if (new C2841f(this, n10, e10).a()) {
                    return;
                }
                e10.shutdown();
                if (L.E(intent)) {
                    L.w(intent);
                }
            } finally {
                e10.shutdown();
            }
        }
        onMessageReceived(new W(extras));
    }

    private String i(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private C1145c j(Context context) {
        if (this.rpc == null) {
            this.rpc = new C1145c(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void k(Intent intent) {
        if (!g(intent.getStringExtra("google.message_id"))) {
            l(intent);
        }
        j(this).b(new C1143a(intent));
    }

    private void l(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                L.y(intent);
                h(intent);
                break;
            case "send_error":
                onSendError(i(intent), new a0(intent.getStringExtra(AppConstants.VIDEO_RECORDING_ERROR)));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2844i
    protected Intent getStartCommandIntent(Intent intent) {
        return b0.b().c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2844i
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            k(intent);
            return;
        }
        if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(W w10) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }

    void setRpcForTesting(C1145c c1145c) {
        this.rpc = c1145c;
    }
}
