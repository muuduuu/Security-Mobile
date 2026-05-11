package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.utils.WebEngageUtils;

/* loaded from: classes2.dex */
public class PushChannelConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private String f30126a;

    /* renamed from: b, reason: collision with root package name */
    private String f30127b;

    /* renamed from: c, reason: collision with root package name */
    private int f30128c;

    /* renamed from: d, reason: collision with root package name */
    private String f30129d;

    /* renamed from: e, reason: collision with root package name */
    private int f30130e;

    /* renamed from: f, reason: collision with root package name */
    private int f30131f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30132g;

    /* renamed from: h, reason: collision with root package name */
    private String f30133h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30134i;

    /* renamed from: j, reason: collision with root package name */
    private String f30135j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30136k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30137l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f30138m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f30139n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f30140o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30141p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f30142q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f30143r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f30144s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f30145t;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f30146a = "we_wk_push_channel";

        /* renamed from: b, reason: collision with root package name */
        private String f30147b = "Marketing";

        /* renamed from: c, reason: collision with root package name */
        private String f30148c = null;

        /* renamed from: d, reason: collision with root package name */
        private int f30149d = 3;

        /* renamed from: e, reason: collision with root package name */
        private String f30150e = null;

        /* renamed from: f, reason: collision with root package name */
        private int f30151f = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f30152g = 1;

        /* renamed from: h, reason: collision with root package name */
        private boolean f30153h = true;

        /* renamed from: i, reason: collision with root package name */
        private String f30154i = null;

        /* renamed from: j, reason: collision with root package name */
        private boolean f30155j = true;

        /* renamed from: k, reason: collision with root package name */
        private boolean f30156k = false;

        /* renamed from: l, reason: collision with root package name */
        private boolean f30157l = false;

        /* renamed from: m, reason: collision with root package name */
        private boolean f30158m = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f30159n = false;

        /* renamed from: o, reason: collision with root package name */
        private boolean f30160o = false;

        /* renamed from: p, reason: collision with root package name */
        private boolean f30161p = false;

        /* renamed from: q, reason: collision with root package name */
        private boolean f30162q = false;

        /* renamed from: r, reason: collision with root package name */
        private boolean f30163r = false;

        /* renamed from: s, reason: collision with root package name */
        private boolean f30164s = false;

        /* renamed from: t, reason: collision with root package name */
        private boolean f30165t = false;

        public PushChannelConfiguration build() {
            return new PushChannelConfiguration(this);
        }

        public Builder setNotificationChannelDescription(String str) {
            this.f30148c = str;
            this.f30158m = true;
            return this;
        }

        public Builder setNotificationChannelGroup(String str) {
            this.f30150e = str;
            this.f30160o = true;
            return this;
        }

        public Builder setNotificationChannelID(String str) {
            this.f30146a = str;
            this.f30156k = true;
            return this;
        }

        public Builder setNotificationChannelImportance(int i10) {
            this.f30149d = i10;
            this.f30159n = true;
            return this;
        }

        public Builder setNotificationChannelLightColor(int i10) {
            this.f30151f = i10;
            this.f30161p = true;
            return this;
        }

        public Builder setNotificationChannelLockScreenVisibility(int i10) {
            this.f30152g = i10;
            this.f30162q = true;
            return this;
        }

        public Builder setNotificationChannelName(String str) {
            this.f30147b = str;
            this.f30157l = true;
            return this;
        }

        public Builder setNotificationChannelShowBadge(boolean z10) {
            this.f30153h = z10;
            this.f30163r = true;
            return this;
        }

        public Builder setNotificationChannelSound(String str) {
            this.f30154i = str;
            this.f30164s = true;
            return this;
        }

        public Builder setNotificationChannelVibration(boolean z10) {
            this.f30155j = z10;
            this.f30165t = true;
            return this;
        }
    }

    private PushChannelConfiguration(Builder builder) {
        this.f30126a = builder.f30147b;
        this.f30127b = builder.f30148c;
        this.f30128c = builder.f30149d;
        this.f30129d = builder.f30150e;
        this.f30130e = builder.f30151f;
        this.f30131f = builder.f30152g;
        this.f30132g = builder.f30153h;
        this.f30133h = builder.f30154i;
        this.f30134i = builder.f30155j;
        this.f30135j = builder.f30146a;
        this.f30136k = builder.f30156k;
        this.f30137l = builder.f30157l;
        this.f30138m = builder.f30158m;
        this.f30139n = builder.f30159n;
        this.f30140o = builder.f30160o;
        this.f30141p = builder.f30161p;
        this.f30142q = builder.f30162q;
        this.f30143r = builder.f30163r;
        this.f30144s = builder.f30164s;
        this.f30145t = builder.f30165t;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PushChannelConfiguration) {
            return ((PushChannelConfiguration) obj).getNotificationChannelId().equals(getNotificationChannelId());
        }
        return false;
    }

    public String getNotificationChannelDescription() {
        return this.f30127b;
    }

    public String getNotificationChannelGroup() {
        return this.f30129d;
    }

    public String getNotificationChannelId() {
        return this.f30135j;
    }

    public int getNotificationChannelImportance() {
        return this.f30128c;
    }

    public int getNotificationChannelLightColor() {
        return this.f30130e;
    }

    public int getNotificationChannelLockScreenVisibility() {
        return this.f30131f;
    }

    public String getNotificationChannelName() {
        return this.f30126a;
    }

    public String getNotificationChannelSound() {
        return this.f30133h;
    }

    public int hashCode() {
        return this.f30135j.hashCode();
    }

    public boolean isNotificationChannelDescriptionSet() {
        return this.f30138m;
    }

    public boolean isNotificationChannelGroupSet() {
        return this.f30140o;
    }

    public boolean isNotificationChannelIdSet() {
        return this.f30136k;
    }

    public boolean isNotificationChannelImportanceSet() {
        return this.f30139n;
    }

    public boolean isNotificationChannelNameSet() {
        return this.f30137l;
    }

    public boolean isNotificationChannelShowBadge() {
        return this.f30132g;
    }

    public boolean isNotificationChannelShowBadgeSet() {
        return this.f30143r;
    }

    public boolean isNotificationChannelSoundSet() {
        return this.f30144s;
    }

    public boolean isNotificationChannelVibration() {
        return this.f30134i;
    }

    public boolean isNotificationChannelVibrationSet() {
        return this.f30145t;
    }

    public boolean isNotificationLightColorSet() {
        return this.f30141p;
    }

    public boolean isNotificationLockScreenVisibilitySet() {
        return this.f30142q;
    }

    public boolean isValid(Context context) {
        String str;
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (WebEngageUtils.d(getNotificationChannelId())) {
            str = " Notification channel cannot be null or empty";
        } else if (WebEngageUtils.d(getNotificationChannelName())) {
            str = " Notification channel name cannot be null or empty";
        } else if (getNotificationChannelImportance() < 0 || getNotificationChannelImportance() > 5) {
            str = " Notification channel importance should be >=0 && <= 5";
        } else {
            if (getNotificationChannelGroup() == null || j2.a(getNotificationChannelGroup(), applicationContext)) {
                return true;
            }
            str = " Notification channel group with id: " + getNotificationChannelGroup() + " is not yet registered";
        }
        Logger.e("WebEngage", str);
        return false;
    }

    public String toString() {
        return "ChannelId: " + getNotificationChannelId() + "\nChannelName: " + getNotificationChannelName() + "\nChannelImportance: " + getNotificationChannelImportance() + "\nChannelDescription: " + getNotificationChannelDescription() + "\nChannelGroup: " + getNotificationChannelGroup() + "\nChannelColor: " + getNotificationChannelLightColor() + "\nLockScreenVisibility: " + getNotificationChannelLockScreenVisibility() + "\nShowBadge: " + isNotificationChannelShowBadge() + "\nSound: " + getNotificationChannelSound() + "\nVibration: " + isNotificationChannelVibration();
    }
}
