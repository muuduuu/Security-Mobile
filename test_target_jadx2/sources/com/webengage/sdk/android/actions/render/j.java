package com.webengage.sdk.android.actions.render;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.webengage.sdk.android.NotificationClickHandlerService;
import com.webengage.sdk.android.WETransparentActivity;
import com.webengage.sdk.android.WebEngageReceiver;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30358a;

    /* renamed from: b, reason: collision with root package name */
    private final PushNotificationData f30359b;

    /* renamed from: c, reason: collision with root package name */
    private final CallToAction f30360c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30361d;

    /* renamed from: e, reason: collision with root package name */
    private final String f30362e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f30363f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f30364g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f30365h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f30366i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f30367j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f30368k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f30369l;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f30370a;

        /* renamed from: b, reason: collision with root package name */
        private final PushNotificationData f30371b;

        /* renamed from: c, reason: collision with root package name */
        private final CallToAction f30372c;

        /* renamed from: d, reason: collision with root package name */
        private String f30373d;

        /* renamed from: e, reason: collision with root package name */
        private String f30374e;

        /* renamed from: f, reason: collision with root package name */
        private Bundle f30375f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f30376g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f30377h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f30378i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f30379j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f30380k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f30381l;

        public b(Context context, PushNotificationData pushNotificationData, CallToAction callToAction) {
            this.f30373d = null;
            this.f30374e = null;
            this.f30375f = null;
            this.f30376g = null;
            this.f30377h = true;
            this.f30378i = true;
            this.f30379j = false;
            this.f30380k = false;
            this.f30381l = false;
            this.f30370a = context;
            this.f30371b = pushNotificationData;
            this.f30372c = callToAction;
        }

        public PendingIntent a() {
            return new j(this).a();
        }

        public b c(boolean z10) {
            this.f30379j = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f30380k = z10;
            return this;
        }

        public b(Context context, PushNotificationData pushNotificationData, String str) {
            this.f30374e = null;
            this.f30375f = null;
            this.f30376g = null;
            this.f30377h = true;
            this.f30378i = true;
            this.f30379j = false;
            this.f30380k = false;
            this.f30381l = false;
            this.f30370a = context;
            this.f30371b = pushNotificationData;
            this.f30372c = null;
            this.f30373d = str;
        }

        public b b(Bundle bundle) {
            this.f30376g = bundle;
            return this;
        }

        public b e(boolean z10) {
            this.f30381l = z10;
            return this;
        }

        public b a(Bundle bundle) {
            this.f30375f = bundle;
            return this;
        }

        public b b(String str) {
            this.f30373d = str;
            return this;
        }

        public b a(String str) {
            this.f30374e = str;
            return this;
        }

        public b b(boolean z10) {
            this.f30377h = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f30378i = z10;
            return this;
        }
    }

    private j(b bVar) {
        this.f30358a = bVar.f30370a;
        this.f30359b = bVar.f30371b;
        this.f30360c = bVar.f30372c;
        this.f30361d = bVar.f30373d;
        this.f30362e = bVar.f30374e;
        this.f30363f = bVar.f30375f;
        this.f30364g = bVar.f30376g;
        this.f30365h = bVar.f30377h;
        this.f30366i = bVar.f30378i;
        this.f30367j = bVar.f30379j;
        this.f30368k = bVar.f30380k;
        this.f30369l = bVar.f30381l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0074, code lost:
    
        if (r9.f30367j != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PendingIntent a() {
        Intent intent;
        boolean z10;
        String str;
        String str2;
        Bundle bundle = new Bundle();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            intent = new Intent(this.f30358a.getApplicationContext(), (Class<?>) NotificationClickHandlerService.class);
        } else if (this.f30367j) {
            intent = new Intent(this.f30358a.getApplicationContext(), (Class<?>) NotificationClickHandlerService.class);
            if (this.f30368k || this.f30369l) {
                intent = new Intent(this.f30358a.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
            }
            if (this.f30368k) {
                str = "progress_push_rerender";
                bundle.putString("action", str);
                z10 = false;
            }
            str = "push_rerender";
            bundle.putString("action", str);
            z10 = false;
        } else if ("push_notification_close".equalsIgnoreCase(this.f30361d)) {
            intent = new Intent(this.f30358a.getApplicationContext(), (Class<?>) NotificationClickHandlerService.class);
            z10 = false;
            bundle.putString("action", "WebEngageDeeplink");
        } else {
            intent = new Intent(this.f30358a.getApplicationContext(), (Class<?>) WETransparentActivity.class);
            z10 = true;
            bundle.putString("action", "WebEngageDeeplink");
        }
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        String str3 = this.f30362e;
        if (str3 != null) {
            bundle.putString(Keys.EVENT, str3);
        }
        bundle.putBoolean("dismiss_flag", this.f30365h);
        bundle.putBoolean("launch_app_if_invalid", this.f30366i);
        bundle.putString("id", this.f30359b.getVariationId());
        bundle.putString("experiment_id", this.f30359b.getExperimentId());
        bundle.putInt("hashed_notification_id", this.f30359b.getVariationId().hashCode());
        if (this.f30359b.getCustomData() != null) {
            bundle.putBundle("custom_data", this.f30359b.getCustomData());
        }
        Bundle bundle2 = this.f30363f;
        if (bundle2 != null) {
            bundle.putBundle("event_data", bundle2);
        }
        Bundle bundle3 = this.f30364g;
        if (bundle3 != null) {
            bundle.putBundle("extra_data", bundle3);
        }
        CallToAction callToAction = this.f30360c;
        if (callToAction != null) {
            if (callToAction.isPrimeAction()) {
                bundle.putBoolean("notification_main_intent", true);
            } else {
                bundle.putBoolean("notification_main_intent", false);
            }
            if (this.f30360c.getId() != null) {
                bundle.putString("call_to_action", this.f30360c.getId());
            }
            bundle.putString("deeplink_uri", this.f30360c.getFullActionUri());
            if (this.f30360c.getType() != null) {
                bundle.putString("type", this.f30360c.getType().toString());
            }
            if (this.f30360c.getCustomActionJSON() != null) {
                bundle.putString("CUSTOM_ACTION_JSON", this.f30360c.getCustomActionJSON().toString());
            }
            bundle.putString("PUSH_NOTIFICATION_DATA", this.f30359b.getPushPayloadJSON().toString());
        }
        if (this.f30361d == null) {
            CallToAction callToAction2 = this.f30360c;
            str2 = (callToAction2 == null || callToAction2.isPrimeAction() || this.f30360c.getId() == null) ? this.f30359b.getVariationId() : this.f30360c.getId();
        } else {
            str2 = this.f30361d + this.f30359b.getVariationId();
        }
        int hashCode = str2.hashCode();
        intent.putExtras(bundle);
        if (i10 < 31) {
            return PendingIntent.getService(this.f30358a.getApplicationContext(), hashCode, intent, 134217728);
        }
        if (this.f30368k || this.f30369l) {
            return PendingIntent.getBroadcast(this.f30358a.getApplicationContext(), hashCode, intent, 201326592);
        }
        Context applicationContext = this.f30358a.getApplicationContext();
        return z10 ? PendingIntent.getActivity(applicationContext, hashCode, intent, 201326592) : PendingIntent.getService(applicationContext, hashCode, intent, 201326592);
    }
}
