package com.webengage.sdk.android.actions.render;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.webengage.sdk.android.AbstractC2951a;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.PendingIntentFactory;
import com.webengage.sdk.android.PushUtils;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.g4;
import com.webengage.sdk.android.l1;
import com.webengage.sdk.android.n0;
import com.webengage.sdk.android.p0;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.y3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class i extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private final Context f30349c;

    /* renamed from: d, reason: collision with root package name */
    private PushNotificationData f30350d;

    /* renamed from: e, reason: collision with root package name */
    private String f30351e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30352f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30353g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f30354h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f30355i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f30356j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f30357k;

    protected i(Context context) {
        super(context);
        this.f30350d = null;
        this.f30351e = BuildConfig.FLAVOR;
        this.f30352f = true;
        this.f30353g = false;
        this.f30354h = null;
        this.f30355i = null;
        this.f30356j = null;
        this.f30357k = Boolean.FALSE;
        this.f30349c = context.getApplicationContext();
    }

    private void a(PushNotificationData pushNotificationData) {
        if (pushNotificationData != null) {
            w();
            b(pushNotificationData);
        }
    }

    private void b(PushNotificationData pushNotificationData) {
        if (pushNotificationData != null) {
            ((AlarmManager) this.f30349c.getSystemService("alarm")).cancel(PendingIntentFactory.constructProgressBarRerenderPendingIntent(this.f30349c, pushNotificationData, "progressbar_update", null));
        } else {
            Logger.d("WebEngage", "Previous push notification data is null, Unable to cancel Alarm");
        }
    }

    private void l(String str) {
        if (str.isEmpty()) {
            return;
        }
        ((NotificationManager) this.f30349c.getSystemService("notification")).cancel(str.hashCode());
    }

    private void m(String str) {
        if (TextUtils.isEmpty(this.f30350d.getCollapseKey())) {
            return;
        }
        String d10 = d(this.f30350d.getCollapseKey());
        if (d10.isEmpty() || !d10.equals(this.f30350d.getVariationId())) {
            b(this.f30350d.getCollapseKey(), this.f30350d.getVariationId());
            if (!str.equals(d10)) {
                f(d10);
            }
            if (d10.equals(d("PREVIOUS_PROGRESS_NOTIFICATION_ID"))) {
                f("PREVIOUS_PROGRESS_NOTIFICATION_ID");
            }
        }
    }

    private void w() {
        Intent intent = new Intent(this.f30349c, (Class<?>) TimerService.class);
        intent.setAction("STOP_SERVICE_CANCEL_NOTIFICATION");
        try {
            this.f30349c.startService(intent);
        } catch (IllegalStateException e10) {
            b(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r6 != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.webengage.sdk.android.callbacks.CustomPushRender] */
    @Override // com.webengage.sdk.android.AbstractC2951a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Object obj) {
        String str;
        boolean onRerender;
        com.webengage.sdk.android.x xVar;
        if (obj == null) {
            return null;
        }
        boolean isCustomRender = this.f30350d.isCustomRender();
        if (!this.f30352f) {
            Bundle c10 = WebEngageUtils.c(this.f30356j);
            boolean z10 = false;
            if (c10 != null && c10.getBoolean("we_wk_render", false)) {
                z10 = true;
            }
            this.f30353g = z10;
            CustomPushRerender b10 = z10 ? l.b(this.f30350d.getStyle()) : a(this.f30349c);
            if (b10 != null) {
                onRerender = b10.onRerender(this.f30349c, this.f30350d, c10);
                return Boolean.valueOf(onRerender);
            }
            str = "CustomPushRerender is null";
            Logger.e("WebEngage", str);
            return null;
        }
        com.webengage.sdk.android.x a10 = a(this.f30349c);
        if (isCustomRender) {
            boolean a11 = a10.a();
            xVar = a10;
        }
        boolean booleanValue = this.f30357k.booleanValue();
        String str2 = BuildConfig.FLAVOR;
        if (booleanValue) {
            String d10 = d("PREVIOUS_PROGRESS_NOTIFICATION_ID");
            b("PREVIOUS_PROGRESS_NOTIFICATION_ID", BuildConfig.FLAVOR + this.f30350d.getVariationId());
            if (!d10.isEmpty() && !d10.equals(this.f30350d.getVariationId())) {
                f(d10);
                str2 = d10;
            }
        }
        m(str2);
        xVar = l.a(this.f30350d.getStyle());
        if (xVar != null) {
            onRerender = xVar.onRender(this.f30349c, this.f30350d);
            return Boolean.valueOf(onRerender);
        }
        a(WebEngageConstant.c.UNKNOWN_SDK_FAILURE);
        str = "CustomPushRender is null";
        Logger.e("WebEngage", str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.webengage.sdk.android.AbstractC2951a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(Map<String, Object> map) {
        boolean isEmpty;
        PushNotificationData pushNotificationData;
        WebEngageConstant.c cVar;
        PushNotificationData onPushNotificationReceived;
        boolean booleanValue = ((Boolean) map.get("first_time")).booleanValue();
        this.f30352f = booleanValue;
        Object obj = map.get("action_data");
        try {
            if (!booleanValue) {
                p0 p0Var = (p0) obj;
                this.f30354h = p0Var.l();
                this.f30355i = p0Var.c();
                this.f30356j = p0Var.f();
                Map<String, Object> map2 = this.f30354h;
                if (map2 != null) {
                    obj = map2.get("id");
                }
                this.f30350d = new PushNotificationData(new JSONObject(d(this.f30351e)), this.f30349c);
                if (this.f30355i == null) {
                    this.f30355i = new HashMap();
                }
                this.f30355i.put("amplified", Boolean.valueOf(this.f30350d.isAmplified()));
                String d10 = d("PREVIOUS_PROGRESS_NOTIFICATION_ID");
                isEmpty = TextUtils.isEmpty(d10);
                boolean z10 = isEmpty && d10.hashCode() != this.f30350d.getVariationId().hashCode();
                this.f30357k = Boolean.valueOf(this.f30350d.getStyle() == null && (WebEngageConstant.STYLE.PROGRESS_BAR.equals(this.f30350d.getStyle()) || WebEngageConstant.STYLE.BIG_TIMER.equals(this.f30350d.getStyle())));
                if (!isEmpty) {
                    try {
                        pushNotificationData = new PushNotificationData(new JSONObject(d(d10)), this.f30349c);
                    } catch (Exception e10) {
                        b(e10);
                    }
                    if (!this.f30352f) {
                        if (this.f30357k.booleanValue() && WebEngageUtils.c(this.f30356j).getBoolean("we_wk_render", false) && this.f30357k.booleanValue() && !isEmpty && z10) {
                            return null;
                        }
                        return this.f30350d;
                    }
                    String collapseKey = this.f30350d.getCollapseKey();
                    if (!this.f30350d.isCustomRender()) {
                        if (!TextUtils.isEmpty(collapseKey)) {
                            String d11 = d(this.f30350d.getCollapseKey());
                            l(d11);
                            if (!isEmpty && !d11.isEmpty() && d11.equals(d10)) {
                                a(pushNotificationData);
                            }
                        }
                        if (this.f30357k.booleanValue() && !isEmpty && pushNotificationData != null) {
                            l(pushNotificationData.getVariationId());
                            a(pushNotificationData);
                            if (!pushNotificationData.getCollapseKey().equals(this.f30350d.getCollapseKey())) {
                                f(pushNotificationData.getCollapseKey());
                            }
                        }
                    }
                    HashMap hashMap = new HashMap();
                    this.f30354h = hashMap;
                    hashMap.put("experiment_id", this.f30350d.getExperimentId());
                    this.f30354h.put("id", this.f30350d.getVariationId());
                    a(n0.b("push_notification_received", this.f30354h, this.f30355i, null, this.f30349c));
                    if (this.f30350d != null && (onPushNotificationReceived = a(this.f30349c).onPushNotificationReceived(this.f30349c, this.f30350d)) != null) {
                        this.f30350d = onPushNotificationReceived;
                    }
                    Boolean bool = (Boolean) DataHolder.get().i(g4.f30601l.toString());
                    if (!(bool == null || bool.booleanValue())) {
                        cVar = WebEngageConstant.c.USER_PUSH_OPTED_OUT;
                    } else if (PushUtils.checkForPushOptIn(this.f30349c)) {
                        WebEngage.get().user().setDevicePushOptIn(true);
                        g gVar = new g();
                        String a10 = gVar.a(this.f30350d, this.f30349c);
                        if (Build.VERSION.SDK_INT < 26 || gVar.a(this.f30349c, a10)) {
                            PushNotificationData pushNotificationData2 = this.f30350d;
                            if (pushNotificationData2 == null || !pushNotificationData2.shouldRender()) {
                                return null;
                            }
                            return this.f30350d;
                        }
                        cVar = WebEngageConstant.c.CHANNEL_OPTED_OUT;
                    } else {
                        WebEngage.get().user().setDevicePushOptIn(false);
                        cVar = WebEngageConstant.c.DEVICE_PUSH_OPTED_OUT;
                    }
                    a(cVar);
                    return null;
                }
                pushNotificationData = null;
                if (!this.f30352f) {
                }
            }
            this.f30350d = new PushNotificationData(new JSONObject(d(this.f30351e)), this.f30349c);
            if (this.f30355i == null) {
            }
            this.f30355i.put("amplified", Boolean.valueOf(this.f30350d.isAmplified()));
            String d102 = d("PREVIOUS_PROGRESS_NOTIFICATION_ID");
            isEmpty = TextUtils.isEmpty(d102);
            if (isEmpty) {
            }
            this.f30357k = Boolean.valueOf(this.f30350d.getStyle() == null && (WebEngageConstant.STYLE.PROGRESS_BAR.equals(this.f30350d.getStyle()) || WebEngageConstant.STYLE.BIG_TIMER.equals(this.f30350d.getStyle())));
            if (!isEmpty) {
            }
            pushNotificationData = null;
            if (!this.f30352f) {
            }
        } catch (Exception e11) {
            b(e11);
            return null;
        }
        this.f30351e = (String) obj;
    }

    private void a(WebEngageConstant.c cVar) {
        this.f30355i.put("error_code", Integer.valueOf(cVar.a()));
        this.f30355i.put("reason", cVar.toString());
        this.f30355i.put("error_message", cVar.b());
        a(n0.b("push_notification_failed", this.f30354h, this.f30355i, null, this.f30349c));
        Logger.e("WebEngage", "Push failed to render with reason : " + cVar.b());
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    public void e(Object obj) {
        y3 y3Var;
        p0 b10;
        if (obj != null) {
            com.webengage.sdk.android.x a10 = a(this.f30349c);
            if (!((Boolean) obj).booleanValue()) {
                if (this.f30350d.isCustomRender() && a10.a()) {
                    a(WebEngageConstant.c.CUSTOM_PUSH_RENDER_FAILURE);
                }
                Logger.e("WebEngage", "Push notification is not rendered.");
                return;
            }
            if (this.f30352f) {
                a(n0.b("push_notification_view", this.f30354h, this.f30355i, null, this.f30349c));
                a10.onPushNotificationShown(this.f30349c, this.f30350d);
                return;
            }
            if (this.f30350d.getStyle() == WebEngageConstant.STYLE.CAROUSEL_V1 && this.f30350d.getCarouselV1Data() != null) {
                List<CarouselV1CallToAction> callToActions = this.f30350d.getCarouselV1Data().getCallToActions();
                int currentIndex = this.f30350d.getCurrentIndex();
                Map<String, Object> map = this.f30356j;
                int intValue = (map == null || !map.containsKey("current") || this.f30356j.get("current") == null) ? 0 : ((Integer) this.f30356j.get("current")).intValue();
                Map<String, Object> map2 = this.f30356j;
                String str = (map2 == null || !map2.containsKey("navigation") || this.f30356j.get("navigation") == null) ? "right" : (String) this.f30356j.get("navigation");
                this.f30354h.put("call_to_action", callToActions.get(currentIndex).getId());
                this.f30354h.put("navigated_from", callToActions.get(intValue).getId());
                this.f30354h.put("navigation", str);
                Map<String, Object> map3 = this.f30356j;
                if (map3 != null) {
                    this.f30355i.putAll(map3);
                }
                y3Var = y3.f31158c;
                b10 = n0.b("push_notification_item_view", this.f30354h, this.f30355i, null, this.f30349c);
            } else {
                if (this.f30350d.getStyle() == WebEngageConstant.STYLE.RATING_V1 || this.f30353g) {
                    return;
                }
                Map<String, Object> map4 = this.f30356j;
                if (map4 != null) {
                    this.f30355i.putAll(map4);
                }
                y3Var = y3.f31158c;
                b10 = n0.b("push_notification_rerender", this.f30354h, this.f30355i, this.f30356j, this.f30349c);
            }
            WebEngage.startService(l1.a(y3Var, b10, this.f30349c), this.f30349c, null);
        }
    }
}
