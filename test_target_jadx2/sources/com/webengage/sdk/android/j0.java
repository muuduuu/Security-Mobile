package com.webengage.sdk.android;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.webengage.sdk.android.actions.render.CallToAction;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;
import u5.C4870a;

/* loaded from: classes2.dex */
class j0 extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private Context f30653c;

    /* renamed from: d, reason: collision with root package name */
    Bundle f30654d;

    /* renamed from: e, reason: collision with root package name */
    CallToAction.TYPE f30655e;

    /* renamed from: f, reason: collision with root package name */
    boolean f30656f;

    /* renamed from: g, reason: collision with root package name */
    String f30657g;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30658a;

        static {
            int[] iArr = new int[CallToAction.TYPE.values().length];
            f30658a = iArr;
            try {
                iArr[CallToAction.TYPE.LAUNCH_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30658a[CallToAction.TYPE.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30658a[CallToAction.TYPE.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    j0(Context context) {
        super(context);
        this.f30653c = null;
        this.f30654d = null;
        this.f30655e = null;
        this.f30656f = false;
        this.f30657g = null;
        this.f30653c = context.getApplicationContext();
    }

    private void f(Object obj) {
        boolean z10;
        String str;
        String str2;
        String str3;
        try {
            Pair pair = (Pair) obj;
            JSONObject jSONObject = new JSONObject((String) pair.first);
            PushNotificationData pushNotificationData = new PushNotificationData(new JSONObject((String) pair.second), this.f30653c);
            if (jSONObject.optJSONArray(C4870a.f43493a) != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray(C4870a.f43493a);
                Objects.requireNonNull(optJSONArray);
                if (optJSONArray.getJSONObject(0) != null) {
                    z10 = true;
                    String string = (jSONObject.has("at") || TextUtils.isEmpty(jSONObject.getString("at"))) ? BuildConfig.FLAVOR : jSONObject.getString("at");
                    String string2 = (jSONObject.has("v") || TextUtils.isEmpty(jSONObject.getString("v"))) ? BuildConfig.FLAVOR : jSONObject.getString("v");
                    if (z10 || !a(jSONObject, "an")) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        JSONArray optJSONArray2 = jSONObject.optJSONArray(C4870a.f43493a);
                        Objects.requireNonNull(optJSONArray2);
                        str = optJSONArray2.getJSONObject(0).getString("an");
                    }
                    if (z10 || !a(jSONObject, "av")) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        JSONArray optJSONArray3 = jSONObject.optJSONArray(C4870a.f43493a);
                        Objects.requireNonNull(optJSONArray3);
                        str2 = optJSONArray3.getJSONObject(0).getString("av");
                    }
                    if (z10 || !a(jSONObject, "att")) {
                        str3 = BuildConfig.FLAVOR;
                    } else {
                        JSONArray optJSONArray4 = jSONObject.optJSONArray(C4870a.f43493a);
                        Objects.requireNonNull(optJSONArray4);
                        str3 = optJSONArray4.getJSONObject(0).getString("att");
                    }
                    a(string, string2, str, str2, str3, pushNotificationData, (String) pair.second);
                }
            }
            z10 = false;
            if (jSONObject.has("at")) {
            }
            if (jSONObject.has("v")) {
            }
            if (z10) {
            }
            str = BuildConfig.FLAVOR;
            if (z10) {
            }
            str2 = BuildConfig.FLAVOR;
            if (z10) {
            }
            str3 = BuildConfig.FLAVOR;
            a(string, string2, str, str2, str3, pushNotificationData, (String) pair.second);
        } catch (Exception unused) {
        }
    }

    private long l(String str) {
        long j10;
        long j11;
        int parseInt = Integer.parseInt(str.substring(0, str.length() - 1));
        if (str.endsWith("m")) {
            j10 = parseInt;
            j11 = 60000;
        } else {
            if (!str.endsWith("h")) {
                return -1L;
            }
            j10 = parseInt;
            j11 = 3600000;
        }
        return j10 * j11;
    }

    private boolean m(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean n(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private boolean o(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private void w() {
        Intent launchIntentForPackage = this.f30653c.getPackageManager().getLaunchIntentForPackage(this.f30653c.getPackageName());
        Bundle bundle = this.f30654d;
        if (bundle != null && bundle.getBundle("custom_data") != null) {
            launchIntentForPackage.putExtras(this.f30654d.getBundle("custom_data"));
        }
        this.f30653c.startActivity(launchIntentForPackage);
    }

    void a(PushNotificationData pushNotificationData, long j10) {
        boolean canScheduleExactAlarms;
        if (j10 < 5000) {
            j10 = 5000;
        }
        AlarmManager alarmManager = (AlarmManager) this.f30653c.getSystemService("alarm");
        Bundle bundle = new Bundle();
        bundle.putBoolean("sn", true);
        bundle.putBoolean("we_wk_render", true);
        PendingIntent constructSnoozeReRenderPendingIntent = PendingIntentFactory.constructSnoozeReRenderPendingIntent(this.f30653c, pushNotificationData, "snooze", bundle);
        if (Build.VERSION.SDK_INT >= 31) {
            canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            if (!canScheduleExactAlarms) {
                alarmManager.set(1, System.currentTimeMillis() + j10, constructSnoozeReRenderPendingIntent);
                return;
            }
        }
        alarmManager.setExact(1, System.currentTimeMillis() + j10, constructSnoozeReRenderPendingIntent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r6.f30656f != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r6.f30656f != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fe, code lost:
    
        if (r6.f30656f != false) goto L65;
     */
    @Override // com.webengage.sdk.android.AbstractC2951a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object d(Object obj) {
        if (obj != null) {
            CallToAction.TYPE type = this.f30655e;
            if (type != null) {
                int i10 = a.f30658a[type.ordinal()];
                if (i10 == 1) {
                    String str = (String) obj;
                    String packageName = this.f30653c.getPackageName();
                    Bundle bundle = this.f30654d;
                    Bundle bundle2 = bundle != null ? bundle.getBundle("custom_data") : null;
                    Intent intent = new Intent();
                    if (bundle2 != null) {
                        intent.putExtras(bundle2);
                    }
                    intent.setFlags(268435456);
                    intent.setClassName(packageName, str);
                    if (intent.resolveActivityInfo(this.f30653c.getPackageManager(), 0) == null) {
                        if (!this.f30656f) {
                            throw new IllegalArgumentException("Received activity path is not valid");
                        }
                        w();
                    } else {
                        this.f30653c.startActivity(intent);
                    }
                } else if (i10 == 2) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse((String) obj));
                    Bundle bundle3 = this.f30654d;
                    Bundle bundle4 = bundle3 != null ? bundle3.getBundle("custom_data") : null;
                    if (bundle4 != null) {
                        intent2.putExtras(bundle4);
                    }
                    intent2.addFlags(268435456);
                    List<ResolveInfo> queryIntentActivities = this.f30653c.getPackageManager().queryIntentActivities(intent2, 65536);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ResolveInfo next = it.next();
                            if (next != null && next.activityInfo != null && this.f30653c.getPackageName().equals(next.activityInfo.packageName)) {
                                intent2.setPackage(this.f30653c.getPackageName());
                                break;
                            }
                        }
                    }
                    if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
                        if (!this.f30656f) {
                            throw new IllegalArgumentException("No App can handle implicit intent with link : " + obj);
                        }
                        w();
                    } else {
                        this.f30653c.startActivity(intent2);
                    }
                } else if (i10 == 3) {
                    f(obj);
                }
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object e(Map<String, Object> map) {
        List<String> list;
        Bundle extras = ((Intent) map.get("action_data")).getExtras();
        this.f30654d = extras;
        if (extras != null) {
            this.f30656f = extras.getBoolean("launch_app_if_invalid", false);
            String string = this.f30654d.getString("type");
            CallToAction.TYPE type = CallToAction.TYPE.CUSTOM;
            if (type.toString().equals(string)) {
                this.f30655e = type;
                try {
                    return new Pair(this.f30654d.getString("CUSTOM_ACTION_JSON"), this.f30654d.getString("PUSH_NOTIFICATION_DATA"));
                } catch (Exception unused) {
                    Logger.e("WebEngage", "Error while parsing custom action");
                    return null;
                }
            }
            try {
                list = Uri.parse(this.f30654d.getString("deeplink_uri")).getPathSegments();
            } catch (Exception unused2) {
                list = null;
            }
            if (list != null) {
                if (list.size() > 0) {
                    this.f30655e = CallToAction.TYPE.valueFromString(list.get(0));
                }
                if (this.f30655e != null && list.size() > 1) {
                    return list.get(1);
                }
            }
        }
        return null;
    }

    private void a(String str, String str2, String str3) {
        User user;
        Number valueOf;
        str3.hashCode();
        switch (str3) {
            case "number":
                if (n(str2)) {
                    user = WebEngage.get().user();
                    valueOf = Integer.valueOf(Integer.parseInt(str2));
                } else if (m(str2)) {
                    user = WebEngage.get().user();
                    valueOf = Double.valueOf(Double.parseDouble(str2));
                } else if (o(str2)) {
                    user = WebEngage.get().user();
                    valueOf = Long.valueOf(Long.parseLong(str2));
                }
                user.setAttribute(str, valueOf);
                break;
            case "string":
                WebEngage.get().user().setAttribute(str, str2);
                break;
            case "date":
                WebEngage.get().user().setAttribute(str, new Date(Long.parseLong(str2)));
                break;
            case "boolean":
                WebEngage.get().user().setAttribute(str, Boolean.valueOf(str2));
                break;
        }
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected void e(Object obj) {
    }

    private void a(String str, String str2, String str3, String str4, String str5, PushNotificationData pushNotificationData, String str6) {
        str.hashCode();
        switch (str) {
            case "user_a":
                a(str3, str4, str5);
                break;
            case "cl":
                WebEngageUtils.b(this.f30653c, str2);
                break;
            case "cp":
                WebEngageUtils.a(this.f30653c, str2);
                break;
            case "ev":
                HashMap hashMap = new HashMap();
                hashMap.put(str3, str4);
                WebEngage.get().analytics().track(str2, hashMap);
                break;
            case "sh":
                WebEngageUtils.c(this.f30653c, str2);
                break;
            case "sn":
                b(pushNotificationData.getVariationId(), str6);
                long l10 = l(str2);
                if (l10 != -1) {
                    a(pushNotificationData, l10);
                    break;
                }
                break;
        }
    }

    private boolean a(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(C4870a.f43493a);
            Objects.requireNonNull(optJSONArray);
            if (optJSONArray.length() <= 0) {
                return false;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(C4870a.f43493a);
            Objects.requireNonNull(optJSONArray2);
            if (!optJSONArray2.getJSONObject(0).has(str)) {
                return false;
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray(C4870a.f43493a);
            Objects.requireNonNull(optJSONArray3);
            return !TextUtils.isEmpty(optJSONArray3.getJSONObject(0).getString(str));
        } catch (Exception unused) {
            return false;
        }
    }
}
