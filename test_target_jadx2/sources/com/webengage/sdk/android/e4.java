package com.webengage.sdk.android;

import android.content.Context;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.webengage.sdk.android.utils.Gender;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/* loaded from: classes2.dex */
class e4 implements User {

    /* renamed from: a, reason: collision with root package name */
    Context f30516a;

    /* renamed from: b, reason: collision with root package name */
    Analytics f30517b;

    e4(Context context, Analytics analytics) {
        this.f30516a = null;
        this.f30517b = null;
        this.f30516a = context.getApplicationContext();
        this.f30517b = analytics;
    }

    void a() {
        String uuid = new UUID(System.currentTimeMillis(), UUID.randomUUID().getLeastSignificantBits()).toString();
        Logger.d("WebEngage", "New luid: " + uuid);
        this.f30517b.a().n(uuid);
        x.a(this.f30516a).onAnonymousIdChanged(this.f30516a, uuid);
    }

    @Override // com.webengage.sdk.android.User
    public void deleteAttribute(String str) {
        if (a(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, null);
            this.f30517b.a(n0.b("user_delete_attributes", null, hashMap, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void deleteAttributes(List<String> list) {
        if (list == null) {
            Logger.e("WebEngage", "Attribute list is Invalid");
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str : list) {
            if (a(str)) {
                hashMap.put(str, null);
            }
        }
        this.f30517b.a(n0.b("user_delete_attributes", null, hashMap, null, this.f30516a));
    }

    @Override // com.webengage.sdk.android.User
    public void loggedIn(String str) {
        if (str == null || str.isEmpty()) {
            Logger.e("WebEngage", "ILLEGAL ARGUMENT : User Identifier");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cuid", WebEngageUtils.a(str, 100));
        this.f30517b.a(n0.b("user_logged_in", null, null, hashMap, this.f30516a));
    }

    @Override // com.webengage.sdk.android.User
    public void loggedOut() {
        this.f30517b.a(n0.b("user_logged_out", null, null, null, this.f30516a));
    }

    @Override // com.webengage.sdk.android.User
    public void login(String str) {
        loggedIn(str);
    }

    @Override // com.webengage.sdk.android.User
    public void logout() {
        loggedOut();
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, Boolean bool) {
        if (a(str) && a(bool, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, bool);
            this.f30517b.a(n0.b("user_update", null, hashMap, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setAttributes(Map<String, ? extends Object> map) {
        if (map == null || map.size() == 0) {
            Logger.e("WebEngage", "ILLEGAL ARGUMENT : attributes");
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (a(key) && a(value, key)) {
                hashMap.put(key, value);
            }
        }
        this.f30517b.a(n0.b("user_update", null, hashMap, null, this.f30516a));
    }

    @Override // com.webengage.sdk.android.User
    public void setBirthDate(Integer num, Integer num2, Integer num3) {
        g4 g4Var = g4.f30595f;
        if (a(num, g4Var.toString()) && a(num2, g4Var.toString()) && a(num3, g4Var.toString())) {
            try {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
                gregorianCalendar.clear();
                gregorianCalendar.set(num.intValue(), num2.intValue() - 1, num3.intValue());
                Date time = gregorianCalendar.getTime();
                HashMap hashMap = new HashMap();
                hashMap.put(g4Var.toString(), time);
                this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setCompany(String str) {
        g4 g4Var = g4.f30599j;
        if (a(str, g4Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(g4Var.toString(), str);
            this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setDevicePushOptIn(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("opt_in_push", Boolean.valueOf(z10));
        this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
    }

    @Override // com.webengage.sdk.android.User
    public void setEmail(String str) {
        g4 g4Var = g4.f30593d;
        if (a(str, g4Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(g4Var.toString(), str);
            this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setFirstName(String str) {
        g4 g4Var = g4.f30591b;
        if (a(str, g4Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(g4Var.toString(), str);
            this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setGender(Gender gender) {
        g4 g4Var = g4.f30596g;
        if (a(gender, g4Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(g4Var.toString(), gender.toString());
            this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setHashedEmail(String str) {
        g4 g4Var = g4.f30594e;
        if (a(str, g4Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(g4Var.toString(), str);
            this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setHashedPhoneNumber(String str) {
        g4 g4Var = g4.f30598i;
        if (a(str, g4Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(g4Var.toString(), str);
            this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setLastName(String str) {
        g4 g4Var = g4.f30592c;
        if (a(str, g4Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(g4Var.toString(), str);
            this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setLocation(double d10, double d11) {
        HashMap hashMap = new HashMap();
        hashMap.put(AppConstants.LATITUDE, Double.valueOf(d10));
        hashMap.put(AppConstants.LONGITUDE, Double.valueOf(d11));
        this.f30517b.a(n0.b("user_update_geo_info", hashMap, null, null, this.f30516a));
    }

    @Override // com.webengage.sdk.android.User
    public void setOptIn(Channel channel, boolean z10) {
        if (a(channel, Channel.class.getSimpleName())) {
            HashMap hashMap = new HashMap();
            hashMap.put(channel.toString(), Boolean.valueOf(z10));
            this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setPhoneNumber(String str) {
        g4 g4Var = g4.f30597h;
        if (a(str, g4Var.toString())) {
            HashMap hashMap = new HashMap();
            hashMap.put(g4Var.toString(), str);
            this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setUserProfile(UserProfile userProfile) {
        if (userProfile == null) {
            return;
        }
        if (userProfile.b() != null && userProfile.b().size() > 0) {
            this.f30517b.a(n0.b("user_update", userProfile.b(), null, null, this.f30516a));
        }
        if (userProfile.a() == null || userProfile.a().size() <= 1) {
            return;
        }
        setLocation(((Double) userProfile.a().get(AppConstants.LATITUDE)).doubleValue(), ((Double) userProfile.a().get(AppConstants.LONGITUDE)).doubleValue());
    }

    private boolean a(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        Logger.e("WebEngage", "Found user attribute value as null");
        Logger.e("WebEngage", "Rejecting user attribute : " + str);
        return false;
    }

    @Override // com.webengage.sdk.android.User
    public void login(String str, String str2) {
        WebEngage.get().setSecurityToken(str, str2);
        loggedIn(str);
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, Number number) {
        if (a(str) && a(number, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, number);
            this.f30517b.a(n0.b("user_update", null, hashMap, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setBirthDate(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date parse = simpleDateFormat.parse(str);
            HashMap hashMap = new HashMap();
            hashMap.put(g4.f30595f.toString(), parse);
            this.f30517b.a(n0.b("user_update", hashMap, null, null, this.f30516a));
        } catch (ParseException unused) {
        }
    }

    private boolean a(String str) {
        StringBuilder sb2;
        String str2;
        if (str == null || str.isEmpty()) {
            Logger.e("WebEngage", "Attribute name is Invalid");
            sb2 = new StringBuilder();
            str2 = "Rejecting  user attribute : ";
        } else {
            if (!str.startsWith("we_")) {
                return true;
            }
            Logger.e("WebEngage", "Found prefix \"we_\" on custom attribute name : " + str);
            sb2 = new StringBuilder();
            str2 = "Rejecting user attribute : ";
        }
        sb2.append(str2);
        sb2.append(str);
        Logger.e("WebEngage", sb2.toString());
        return false;
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, String str2) {
        if (a(str) && a(str2, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, str2);
            this.f30517b.a(n0.b("user_update", null, hashMap, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, Date date) {
        if (a(str) && a(date, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, date);
            this.f30517b.a(n0.b("user_update", null, hashMap, null, this.f30516a));
        }
    }

    @Override // com.webengage.sdk.android.User
    public void setAttribute(String str, List<? extends Object> list) {
        if (a(str) && a(list, str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, list);
            this.f30517b.a(n0.b("user_update", null, hashMap, null, this.f30516a));
        }
    }
}
