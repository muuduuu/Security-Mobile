package com.growwwealth.tech;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.W;
import com.webengage.sdk.android.WebEngage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/growwwealth/tech/WealthFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/W;", "remoteMessage", BuildConfig.FLAVOR, "onMessageReceived", "(Lcom/google/firebase/messaging/W;)V", BuildConfig.FLAVOR, "s", "onNewToken", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WealthFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(W remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Map<String, String> u10 = remoteMessage.u();
        Intrinsics.checkNotNullExpressionValue(u10, "getData(...)");
        if (u10.containsKey("source") && "webengage".equals(u10.get("source"))) {
            WebEngage.get().receive(u10);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String s10) {
        Intrinsics.checkNotNullParameter(s10, "s");
        super.onNewToken(s10);
        WebEngage.get().setRegistrationID(s10);
    }
}
