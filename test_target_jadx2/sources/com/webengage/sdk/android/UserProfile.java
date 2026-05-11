package com.webengage.sdk.android;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.webengage.sdk.android.utils.Gender;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Object> f30166a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f30167b;

    public static class Builder {
        private Map<String, Object> locationData;
        private Map<String, Object> userData;

        public Builder() {
            this.userData = null;
            this.locationData = null;
            this.userData = new HashMap();
            this.locationData = new HashMap();
        }

        public UserProfile build() {
            return new UserProfile(this);
        }

        public Builder setBirthDate(Integer num, Integer num2, Integer num3) {
            try {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
                gregorianCalendar.clear();
                gregorianCalendar.set(num.intValue(), num2.intValue() - 1, num3.intValue());
                this.userData.put(g4.f30595f.toString(), gregorianCalendar.getTime());
            } catch (Exception unused) {
            }
            return this;
        }

        public Builder setCompany(String str) {
            this.userData.put(g4.f30599j.toString(), str);
            return this;
        }

        public Builder setEmail(String str) {
            this.userData.put(g4.f30593d.toString(), str);
            return this;
        }

        public Builder setFirstName(String str) {
            this.userData.put(g4.f30591b.toString(), str);
            return this;
        }

        public Builder setGender(Gender gender) {
            this.userData.put(g4.f30596g.toString(), gender.toString());
            return this;
        }

        public Builder setHashedEmail(String str) {
            this.userData.put(g4.f30594e.toString(), str);
            return this;
        }

        public Builder setHashedPhoneNumber(String str) {
            this.userData.put(g4.f30598i.toString(), str);
            return this;
        }

        public Builder setLastName(String str) {
            this.userData.put(g4.f30592c.toString(), str);
            return this;
        }

        public Builder setLocation(double d10, double d11) {
            this.locationData.put(AppConstants.LATITUDE, Double.valueOf(d10));
            this.locationData.put(AppConstants.LONGITUDE, Double.valueOf(d11));
            return this;
        }

        public Builder setOptIn(Channel channel, boolean z10) {
            this.userData.put(channel.toString(), Boolean.valueOf(z10));
            return this;
        }

        public Builder setPhoneNumber(String str) {
            this.userData.put(g4.f30597h.toString(), str);
            return this;
        }

        public Builder setBirthDate(String str) {
            if (str != null && !str.isEmpty()) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                try {
                    this.userData.put(g4.f30595f.toString(), simpleDateFormat.parse(str));
                } catch (ParseException unused) {
                }
            }
            return this;
        }
    }

    private UserProfile(Builder builder) {
        this.f30166a = null;
        this.f30167b = null;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : builder.userData.entrySet()) {
            if (entry.getValue() == null) {
                Logger.e("WebEngage", "Illegal Argument : " + ((String) entry.getKey()));
                Logger.e("WebEngage", "Rejecting attribute : " + ((String) entry.getKey()));
            } else {
                hashMap.put((String) entry.getKey(), entry.getValue());
            }
        }
        this.f30166a = hashMap;
        this.f30167b = builder.locationData;
    }

    Map<String, Object> a() {
        return this.f30167b;
    }

    Map<String, Object> b() {
        return this.f30166a;
    }
}
