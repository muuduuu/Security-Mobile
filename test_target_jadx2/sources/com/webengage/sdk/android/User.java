package com.webengage.sdk.android;

import com.webengage.sdk.android.utils.Gender;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface User {
    void deleteAttribute(String str);

    void deleteAttributes(List<String> list);

    @Deprecated
    void loggedIn(String str);

    @Deprecated
    void loggedOut();

    void login(String str);

    void login(String str, String str2);

    void logout();

    void setAttribute(String str, Boolean bool);

    void setAttribute(String str, Number number);

    void setAttribute(String str, String str2);

    void setAttribute(String str, Date date);

    void setAttribute(String str, List<? extends Object> list);

    void setAttributes(Map<String, ? extends Object> map);

    @Deprecated
    void setBirthDate(Integer num, Integer num2, Integer num3);

    void setBirthDate(String str);

    void setCompany(String str);

    void setDevicePushOptIn(boolean z10);

    void setEmail(String str);

    void setFirstName(String str);

    void setGender(Gender gender);

    void setHashedEmail(String str);

    void setHashedPhoneNumber(String str);

    void setLastName(String str);

    void setLocation(double d10, double d11);

    void setOptIn(Channel channel, boolean z10);

    void setPhoneNumber(String str);

    void setUserProfile(UserProfile userProfile);
}
