package com.webengage.sdk.android.bridge;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.webengage.sdk.android.Channel;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.UserProfile;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.Gender;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class WebEngageMobileBridge {
    private static final String BIRTH_DATE = "we_birth_date";
    public static final String BRIDGE_NAME = "__WEBENGAGE_MOBILE_BRIDGE__";
    private static final String COMPANY = "we_company";
    private static final String EMAIL = "we_email";
    private static final String EMAIL_OPT_IN = "we_email_opt_in";
    private static final String FIRST_NAME = "we_first_name";
    private static final String GENDER = "we_gender";
    private static final String HASHED_EMAIL = "we_hashed_email";
    private static final String HASHED_PHONE = "we_hashed_phone";
    private static final String LAST_NAME = "we_last_name";
    private static final String PHONE = "we_phone";
    private static final String PUSH_OPT_IN = "we_push_opt_in";
    private static final String SMS_OPT_IN = "we_sms_opt_in";
    private static final String TAG = "WebEngageMobileBridge";
    private static final String VIBER_OPT_IN = "we_viber_opt_in";
    private static final String WHATSAPP_OPT_IN = "we_whatsapp_opt_in";
    Context applicationContext;

    public WebEngageMobileBridge(Context context) {
        this.applicationContext = null;
        this.applicationContext = context.getApplicationContext();
    }

    @JavascriptInterface
    public void login(String str) {
        Logger.d(TAG, "Bridge login called: " + str);
        WebEngage.get().user().login(str);
    }

    @JavascriptInterface
    public void logout() {
        Logger.d(TAG, "Bridge logout called");
        WebEngage.get().user().logout();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0035  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void screen(String str, String str2) {
        Map<String, ? extends Object> map;
        Logger.d(TAG, "Bridge screen called screenName: " + str + ", screenData: " + str2);
        if (str2 != null) {
            try {
                map = (Map) DataType.convert(str2, DataType.MAP, false);
            } catch (Exception e10) {
                Logger.e(TAG, e10.toString());
            }
            if (str != null) {
                if (map != null) {
                    WebEngage.get().analytics().setScreenData(map);
                    return;
                }
                return;
            } else if (map != null) {
                WebEngage.get().analytics().screenNavigated(str, map);
                return;
            } else {
                WebEngage.get().analytics().screenNavigated(str);
                return;
            }
        }
        map = null;
        if (str != null) {
        }
    }

    @JavascriptInterface
    public void setAttribute(String str) {
        Map map;
        Channel channel;
        Boolean valueOf;
        Logger.d(TAG, "Bridge attribute called: " + str);
        try {
            map = (Map) DataType.convert(str, DataType.MAP, false);
        } catch (Exception e10) {
            Logger.e(TAG, e10.toString());
            map = null;
        }
        if (map != null) {
            try {
                if (map.size() > 0) {
                    HashMap hashMap = new HashMap();
                    UserProfile.Builder builder = new UserProfile.Builder();
                    for (Map.Entry entry : map.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            if (FIRST_NAME.equals(str2) && (value instanceof String)) {
                                builder.setFirstName((String) value);
                            } else if (LAST_NAME.equals(str2) && (value instanceof String)) {
                                builder.setLastName((String) value);
                            } else if (EMAIL.equals(str2) && (value instanceof String)) {
                                builder.setEmail((String) value);
                            } else if (BIRTH_DATE.equals(str2) && (value instanceof String)) {
                                builder.setBirthDate((String) value);
                            } else if (PHONE.equals(str2) && (value instanceof String)) {
                                builder.setPhoneNumber((String) value);
                            } else if (GENDER.equals(str2) && (value instanceof String)) {
                                builder.setGender(Gender.valueByString((String) value));
                            } else if (COMPANY.equals(str2) && (value instanceof String)) {
                                builder.setCompany((String) value);
                            } else if (HASHED_EMAIL.equals(str2) && (value instanceof String)) {
                                builder.setHashedEmail((String) value);
                            } else if (HASHED_PHONE.equals(str2) && (value instanceof String)) {
                                builder.setHashedPhoneNumber((String) value);
                            } else if (PUSH_OPT_IN.equals(str2)) {
                                if ("true".equals(value.toString()) || "false".equals(value.toString())) {
                                    channel = Channel.PUSH;
                                    valueOf = Boolean.valueOf(value.toString());
                                    builder.setOptIn(channel, valueOf.booleanValue());
                                }
                            } else if (SMS_OPT_IN.equals(str2)) {
                                if ("true".equals(value.toString()) || "false".equals(value.toString())) {
                                    channel = Channel.SMS;
                                    valueOf = Boolean.valueOf(value.toString());
                                    builder.setOptIn(channel, valueOf.booleanValue());
                                }
                            } else if (EMAIL_OPT_IN.equals(str2)) {
                                if ("true".equals(value.toString()) || "false".equals(value.toString())) {
                                    channel = Channel.EMAIL;
                                    valueOf = Boolean.valueOf(value.toString());
                                    builder.setOptIn(channel, valueOf.booleanValue());
                                }
                            } else if (WHATSAPP_OPT_IN.equals(str2)) {
                                if ("true".equals(value.toString()) || "false".equals(value.toString())) {
                                    channel = Channel.WHATSAPP;
                                    valueOf = Boolean.valueOf(value.toString());
                                    builder.setOptIn(channel, valueOf.booleanValue());
                                }
                            } else if (!VIBER_OPT_IN.equals(str2)) {
                                hashMap.put(str2, value);
                            } else if ("true".equals(value.toString()) || "false".equals(value.toString())) {
                                channel = Channel.VIBER;
                                valueOf = Boolean.valueOf(value.toString());
                                builder.setOptIn(channel, valueOf.booleanValue());
                            }
                        }
                    }
                    if (hashMap.size() > 0) {
                        WebEngage.get().user().setAttributes(hashMap);
                    }
                    WebEngage.get().user().setUserProfile(builder.build());
                }
            } catch (Exception e11) {
                Logger.e(TAG, e11.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0035  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void track(String str, String str2) {
        Map<String, ? extends Object> map;
        Logger.d(TAG, "Bridge track called eventName: " + str + ", eventData: " + str2);
        if (str2 != null) {
            try {
                map = (Map) DataType.convert(str2, DataType.MAP, false);
            } catch (Exception e10) {
                Logger.e(TAG, e10.toString());
            }
            if (str == null) {
                if (map != null) {
                    WebEngage.get().analytics().track(str, map);
                    return;
                } else {
                    WebEngage.get().analytics().track(str);
                    return;
                }
            }
            return;
        }
        map = null;
        if (str == null) {
        }
    }
}
