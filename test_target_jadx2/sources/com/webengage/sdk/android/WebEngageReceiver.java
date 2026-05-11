package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.facebook.react.bridge.BaseJavaModule;
import com.webengage.sdk.android.t1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class WebEngageReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        try {
            String action = intent.getAction();
            if ("com.google.android.c2dm.intent.RECEIVE".equals(action)) {
                Logger.w("WebEngage", "GCM/FCM message received in WebEngageReceiver, Please fix your integration");
                return;
            }
            if (!"com.webengage.sdk.android.intent.ACTION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            if (WebEngage.get().getWebEngageConfig().isLocationTrackingEnabled()) {
                Location b10 = s1.a(context).b(intent);
                if (b10 != null) {
                    WebEngage.get().a(b10, this);
                }
                List<t1.a> a10 = s1.a(context).a(intent);
                if (a10 != null) {
                    for (t1.a aVar : a10) {
                        WebEngage.get().a(aVar, this);
                        Logger.d("WebEngage", aVar.toString());
                    }
                }
            }
            String string = extras.getString("action");
            if ("session_destroy".equals(string)) {
                WebEngage.get().d(this);
                return;
            }
            if (BaseJavaModule.METHOD_TYPE_SYNC.equals(string)) {
                WebEngage.get().c(this);
                return;
            }
            if ("config_refresh".equals(string)) {
                WebEngage.get().b(this);
                return;
            }
            if ("session_delay_event".equals(string)) {
                WebEngage.get().c(intent, this);
                return;
            }
            if ("page_delay_event".equals(string)) {
                WebEngage.get().b(intent, this);
                return;
            }
            if ("leave_intent_event".equals(string)) {
                WebEngage.get().b(intent);
                return;
            }
            if ("user_profile".equals(string)) {
                HashSet<String> hashSet = new HashSet<>(Arrays.asList("fetch_profile", "jcx", "static_list"));
                try {
                    if (intent.getExtras().get("data") != null) {
                        hashSet = (HashSet) intent.getExtras().get("data");
                    }
                    WebEngage.get().a(this, hashSet);
                    return;
                } catch (Exception unused) {
                    WebEngage.get().a(this, hashSet);
                    return;
                }
            }
            if ("amplify".equals(string)) {
                WebEngage.get().a(this);
            } else if ("progress_push_rerender".equals(string)) {
                WebEngage.get().c(intent);
            } else if ("push_rerender".equals(string)) {
                WebEngage.get().d(intent);
            }
        } catch (Exception e10) {
            Logger.e("WebEngage", e10.toString());
        }
    }
}
