package com.webengage.sdk.android;

/* loaded from: classes2.dex */
public enum h0 {
    PAGE,
    EVENT,
    LATEST_EVENT,
    USER,
    ANDROID,
    WEB,
    IOS,
    EVENT_CRITERIA,
    JOURNEY,
    ATTR,
    SCOPES,
    STATIC_LIST;

    public static h0 a(String str) {
        try {
            return valueOf(str.toUpperCase());
        } catch (Exception unused) {
            return null;
        }
    }

    public String b() {
        if (equals(WEB)) {
            return "1";
        }
        if (equals(ANDROID)) {
            return "2";
        }
        if (equals(IOS)) {
            return "3";
        }
        return null;
    }

    public boolean c() {
        return equals(EVENT_CRITERIA) || equals(JOURNEY) || equals(SCOPES) || equals(STATIC_LIST);
    }

    public boolean d() {
        return equals(USER) || equals(ANDROID) || equals(WEB) || equals(IOS) || equals(EVENT_CRITERIA) || equals(ATTR) || equals(JOURNEY) || equals(SCOPES) || equals(STATIC_LIST);
    }

    public boolean e() {
        return equals(ATTR) || equals(USER);
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase();
    }

    public boolean a() {
        return equals(USER) || equals(ANDROID) || equals(WEB) || equals(IOS) || equals(EVENT_CRITERIA) || equals(ATTR) || equals(SCOPES) || equals(STATIC_LIST);
    }
}
