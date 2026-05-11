package io.invertase.firebase.messaging;

import android.content.Intent;
import com.facebook.react.AbstractServiceC1893h;
import com.google.firebase.messaging.W;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseMessagingHeadlessService extends AbstractServiceC1893h {
    @Override // com.facebook.react.AbstractServiceC1893h
    protected J4.a j(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        return new J4.a("ReactNativeFirebaseMessagingHeadlessTask", u.i((W) intent.getParcelableExtra("message")), Zb.i.g().e("messaging_android_headless_task_timeout", 60000L), true);
    }
}
