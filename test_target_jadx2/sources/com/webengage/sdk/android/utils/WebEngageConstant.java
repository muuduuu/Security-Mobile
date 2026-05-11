package com.webengage.sdk.android.utils;

import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class WebEngageConstant {
    public static final String AWS = "aws";
    public static final String GCE = "gce";
    public static final String IMAGE_GIF_TYPE = "image/gif";
    public static final String IN = "in";
    public static final String IR0 = "ir0";
    public static final String KSA = "ksa";
    public static final String UNL = "unl";

    /* renamed from: a, reason: collision with root package name */
    public static final int f30862a = 456647605;

    /* renamed from: b, reason: collision with root package name */
    public static final List<b> f30863b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f30864c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, Integer> f30865d;

    public enum STYLE {
        BIG_PICTURE,
        BIG_TEXT,
        INBOX,
        CAROUSEL_V1,
        RATING_V1,
        TIMER,
        PROGRESS_BAR,
        BIG_TIMER,
        OVERLAY
    }

    public enum a {
        NOTIFICATION,
        SURVEY,
        PUSH,
        INLINE_PERSONALIZATION,
        NOTIFICATION_INBOX
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f30872a;

        /* renamed from: b, reason: collision with root package name */
        public String f30873b;

        /* renamed from: c, reason: collision with root package name */
        public a f30874c;

        public b() {
            this.f30872a = BuildConfig.FLAVOR;
            this.f30873b = BuildConfig.FLAVOR;
            this.f30874c = null;
        }

        public b(String str, String str2, a aVar) {
            this.f30872a = str;
            this.f30873b = str2;
            this.f30874c = aVar;
        }
    }

    public enum c {
        CHANNEL_OPTED_OUT("Channel Opted Out", 23000),
        DEVICE_PUSH_OPTED_OUT("Device Push Opted Out", 23001),
        USER_PUSH_OPTED_OUT("User Push Opted Out", 23002),
        TIMER_DATE_EXPIRED("Timer Date Expired", 23003),
        NO_USER_CREATED_ON_LICENSE("No User Created On License", 23004),
        UNKNOWN_SDK_FAILURE("Unknown SDK Failure", 23005),
        INVALID_PUSH_CONTENT("Invalid Push Content", 23006),
        CUSTOM_PUSH_RENDER_FAILURE("Custom Push Failed to Render", 23007);


        /* renamed from: a, reason: collision with root package name */
        private final String f30884a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30885b;

        c(String str, int i10) {
            this.f30884a = str;
            this.f30885b = i10;
        }

        public int a() {
            return this.f30885b;
        }

        public String b() {
            return this.f30884a;
        }
    }

    public enum d {
        PAGE_RULE("pageRuleCode"),
        SESSION_RULE("sessionRuleCode"),
        EVENT_RULE("eventRuleCode"),
        CUSTOM_RULE("customRuleCode");


        /* renamed from: a, reason: collision with root package name */
        private String f30891a;

        d(String str) {
            this.f30891a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f30891a;
        }
    }

    public enum e {
        UPLOAD_EVENTS_URL("https://c.webengage.com/m2.jpg", "https://c.webengage.io/m2.jpg", "https://c.in.webengage.com/m2.jpg", "https://c.ir0.webengage.com/m2.jpg", "https://c.unl.webengage.com/m2.jpg", "https://c.ksa.webengage.com/m2.jpg"),
        EXCEPTION_END_POINT("https://c.webengage.com/e.jpg", "https://c.webengage.io/e.jpg", "https://c.in.webengage.com/e.jpg", "https://c.ir0.webengage.com/e.jpg", "https://c.unl.webengage.com/e.jpg", "https://c.ksa.webengage.com/e.jpg"),
        USER_PROFILE_2_BASE("https://c.webengage.com/upf2.js", "https://c.webengage.io/upf2.js", "https://c.in.webengage.com/upf2.js", "https://c.ir0.webengage.com/upf2.js", "https://c.unl.webengage.com/upf2.js", "https://c.ksa.webengage.com/upf2.js"),
        AMPLIFY_PUSH_BASE("https://c.webengage.com/push-amp", "https://c.webengage.io/push-amp", "https://c.in.webengage.com/push-amp", "https://c.ir0.webengage.com/push-amp", "https://c.unl.webengage.com/push-amp", "https://c.ksa.webengage.com/push-amp"),
        RESOURCE_BASE("https://wsdk-files.webengage.com/", "https://s3.amazonaws.com/webengage-zfiles-gc/", "https://wsdk-files.in.webengage.com/", "https://wsdk-files.ir0.webengage.com/", "https://wsdk-files.webengage.com/", "https://wsdk-files.ksa.webengage.com/"),
        PERSONALISATION_BASE("https://p.webengage.com", "https://p.webengage.io", "https://p.in.webengage.com", "https://p.ir0.webengage.com", "https://p.unl.webengage.com", "https://p.ksa.webengage.com"),
        URL_BASE("https://c.webengage.com/", "https://c.webengage.io/", "https://c.in.webengage.com/", "https://c.ir0.webengage.com/", "https://c.unl.webengage.com/", "https://c.ksa.webengage.com/");


        /* renamed from: a, reason: collision with root package name */
        private String[] f30900a;

        e(String... strArr) {
            this.f30900a = strArr;
        }

        public static String a(String str) {
            return RESOURCE_BASE.toString() + "webengage/" + str + "/android/v4.js";
        }

        public static String b(String str, String str2) {
            try {
                return str2.concat("?url=").concat(URLEncoder.encode(str, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                Logger.e("WebEngage", "Failed to wrap the proxy URL");
                return str;
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            String environment = WebEngage.get().getWebEngageConfig().getEnvironment();
            if (WebEngageConstant.AWS.equals(environment)) {
                return this.f30900a[0];
            }
            if (WebEngageConstant.GCE.equals(environment)) {
                return this.f30900a[1];
            }
            if (WebEngageConstant.IN.equals(environment)) {
                return this.f30900a[2];
            }
            if (WebEngageConstant.IR0.equals(environment)) {
                return this.f30900a[3];
            }
            if (WebEngageConstant.UNL.equals(environment)) {
                return this.f30900a[4];
            }
            if (WebEngageConstant.KSA.equals(environment)) {
                return this.f30900a[5];
            }
            return null;
        }

        public static String a(String str, String str2) {
            return str + "js/notification-layout-" + str2 + ".js";
        }

        public static String a(String str, String str2, String str3) {
            String str4;
            StringBuilder sb2 = new StringBuilder(AMPLIFY_PUSH_BASE.toString());
            sb2.append("?sdkId=2");
            sb2.append("&licenseCode=");
            sb2.append(str);
            sb2.append("&luid=");
            sb2.append(str2);
            if (!WebEngageUtils.d(str3)) {
                try {
                    String encode = URLEncoder.encode(str3, "UTF-8");
                    sb2.append("&cuid=");
                    sb2.append(encode);
                } catch (UnsupportedEncodingException e10) {
                    Logger.e("WebEngage", "Exception while url-encoding cuid: " + str3, e10);
                }
            }
            try {
                String c10 = WebEngageUtils.c();
                String encode2 = URLEncoder.encode(String.format("%s:%s", c10.substring(0, 3), c10.substring(3)), "UTF-8");
                sb2.append("&timezone=");
                sb2.append(encode2);
            } catch (UnsupportedEncodingException e11) {
                e = e11;
                str4 = "Exception while url-encoding timezone in push-amplify url.";
                Logger.e("WebEngage", str4, e);
                sb2.append("&sdkVersion=");
                sb2.append(42101.0d);
                return sb2.toString();
            } catch (Exception e12) {
                e = e12;
                str4 = "Exception while adding timezone in push-amplify url.";
                Logger.e("WebEngage", str4, e);
                sb2.append("&sdkVersion=");
                sb2.append(42101.0d);
                return sb2.toString();
            }
            sb2.append("&sdkVersion=");
            sb2.append(42101.0d);
            return sb2.toString();
        }

        public static String a(String str, String str2, String str3, String str4, String str5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(PERSONALISATION_BASE.toString());
            sb2.append("/users/");
            sb2.append(str);
            sb2.append("/");
            sb2.append(str2);
            sb2.append("/templates/");
            sb2.append(str5);
            sb2.append(str3);
            if (str4 != null && !str4.isEmpty()) {
                try {
                    String encode = URLEncoder.encode(str4, "UTF-8");
                    sb2.append("?cuid=");
                    sb2.append(encode);
                } catch (UnsupportedEncodingException unused) {
                }
            }
            return sb2.toString();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f30863b = arrayList;
        arrayList.add(new b("personalizationRuleList", "notificationEncId", a.INLINE_PERSONALIZATION));
        arrayList.add(new b("notificationRuleList", "notificationEncId", a.NOTIFICATION));
        arrayList.add(new b("surveyRuleList", "surveyEncId", a.SURVEY));
        f30864c = new String[]{"view", "click", "close", "view_session", "close_session"};
        HashMap hashMap = new HashMap();
        f30865d = hashMap;
        hashMap.put("push_notification_click", 2);
        hashMap.put("push_notification_close", 2);
        hashMap.put("push_notification_item_view", 2);
        hashMap.put("push_notification_rating_submitted", 2);
        hashMap.put("push_notification_rerender", 2);
        hashMap.put("push_notification_received", 2);
        hashMap.put("push_notification_view", 2);
        hashMap.put("geofence_transition", 2);
        hashMap.put("gcm_registered", 2);
        hashMap.put("app_upgraded", 2);
        hashMap.put("app_installed", 2);
    }
}
