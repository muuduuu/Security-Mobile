package com.webengage.sdk.android;

import android.content.Context;
import android.os.Build;
import com.webengage.sdk.android.PushChannelConfiguration;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class WebEngageConfig {

    /* renamed from: A, reason: collision with root package name */
    private boolean f30177A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f30178B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f30179C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f30180D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f30181E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f30182F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f30183G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f30184H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f30185I;

    /* renamed from: J, reason: collision with root package name */
    private long f30186J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f30187K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f30188L;

    /* renamed from: M, reason: collision with root package name */
    private String f30189M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f30190N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f30191O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f30192P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f30193Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f30194R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f30195S;

    /* renamed from: a, reason: collision with root package name */
    private boolean f30196a;

    /* renamed from: b, reason: collision with root package name */
    private LocationTrackingStrategy f30197b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30198c;

    /* renamed from: d, reason: collision with root package name */
    private String f30199d;

    /* renamed from: e, reason: collision with root package name */
    private String f30200e;

    /* renamed from: f, reason: collision with root package name */
    private ReportingStrategy f30201f;

    /* renamed from: g, reason: collision with root package name */
    private String f30202g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30203h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30204i;

    /* renamed from: j, reason: collision with root package name */
    private String f30205j;

    /* renamed from: k, reason: collision with root package name */
    private Environment f30206k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30207l;

    /* renamed from: m, reason: collision with root package name */
    private int f30208m;

    /* renamed from: n, reason: collision with root package name */
    private int f30209n;

    /* renamed from: o, reason: collision with root package name */
    private int f30210o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30211p;

    /* renamed from: q, reason: collision with root package name */
    private PushChannelConfiguration f30212q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f30213r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f30214s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f30215t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f30216u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f30217v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f30218w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f30219x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f30220y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f30221z;

    public static class Builder {

        /* renamed from: A, reason: collision with root package name */
        private boolean f30222A;

        /* renamed from: B, reason: collision with root package name */
        private boolean f30223B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f30224C;

        /* renamed from: D, reason: collision with root package name */
        private boolean f30225D;

        /* renamed from: E, reason: collision with root package name */
        private boolean f30226E;

        /* renamed from: F, reason: collision with root package name */
        private boolean f30227F;

        /* renamed from: G, reason: collision with root package name */
        private boolean f30228G;

        /* renamed from: H, reason: collision with root package name */
        private boolean f30229H;

        /* renamed from: I, reason: collision with root package name */
        private boolean f30230I;

        /* renamed from: J, reason: collision with root package name */
        private long f30231J;

        /* renamed from: K, reason: collision with root package name */
        private boolean f30232K;

        /* renamed from: L, reason: collision with root package name */
        private boolean f30233L;

        /* renamed from: M, reason: collision with root package name */
        private String f30234M;

        /* renamed from: N, reason: collision with root package name */
        private boolean f30235N;

        /* renamed from: O, reason: collision with root package name */
        private boolean f30236O;

        /* renamed from: P, reason: collision with root package name */
        private boolean f30237P;

        /* renamed from: Q, reason: collision with root package name */
        private boolean f30238Q;

        /* renamed from: R, reason: collision with root package name */
        private boolean f30239R;

        /* renamed from: S, reason: collision with root package name */
        private boolean f30240S;

        /* renamed from: a, reason: collision with root package name */
        private AtomicBoolean f30241a;

        /* renamed from: b, reason: collision with root package name */
        private LocationTrackingStrategy f30242b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f30243c;

        /* renamed from: d, reason: collision with root package name */
        private String f30244d;

        /* renamed from: e, reason: collision with root package name */
        private String f30245e;

        /* renamed from: f, reason: collision with root package name */
        private String f30246f;

        /* renamed from: g, reason: collision with root package name */
        private ReportingStrategy f30247g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f30248h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f30249i;

        /* renamed from: j, reason: collision with root package name */
        private Environment f30250j;

        /* renamed from: k, reason: collision with root package name */
        private String f30251k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f30252l;

        /* renamed from: m, reason: collision with root package name */
        private int f30253m;

        /* renamed from: n, reason: collision with root package name */
        private int f30254n;

        /* renamed from: o, reason: collision with root package name */
        private int f30255o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f30256p;

        /* renamed from: q, reason: collision with root package name */
        private PushChannelConfiguration f30257q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f30258r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f30259s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f30260t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f30261u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f30262v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f30263w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f30264x;

        /* renamed from: y, reason: collision with root package name */
        private boolean f30265y;

        /* renamed from: z, reason: collision with root package name */
        private boolean f30266z;

        public Builder() {
            this.f30241a = new AtomicBoolean(false);
            this.f30242b = LocationTrackingStrategy.ACCURACY_CITY;
            this.f30243c = false;
            this.f30244d = null;
            this.f30245e = null;
            this.f30246f = "4.21.1";
            this.f30247g = ReportingStrategy.BUFFER;
            this.f30248h = false;
            this.f30249i = false;
            Environment environment = Environment.US;
            this.f30250j = environment;
            this.f30251k = environment.toString();
            this.f30252l = false;
            this.f30253m = -1;
            this.f30254n = -1;
            this.f30255o = -1;
            this.f30256p = false;
            this.f30257q = new PushChannelConfiguration.Builder().build();
            this.f30258r = false;
            this.f30259s = false;
            this.f30260t = false;
            this.f30261u = false;
            this.f30262v = false;
            this.f30263w = false;
            this.f30264x = false;
            this.f30265y = false;
            this.f30266z = false;
            this.f30222A = false;
            this.f30223B = false;
            this.f30224C = false;
            this.f30225D = false;
            this.f30226E = false;
            this.f30227F = false;
            this.f30228G = false;
            this.f30229H = false;
            this.f30230I = true;
            this.f30231J = -1L;
            this.f30232K = true;
            this.f30233L = false;
            this.f30234M = null;
            this.f30235N = false;
            this.f30236O = true;
            this.f30237P = false;
            this.f30238Q = false;
            this.f30239R = false;
            this.f30240S = false;
        }

        protected Builder a(String str) {
            String str2 = WebEngageConstant.IN;
            if (!WebEngageConstant.IN.equalsIgnoreCase(str)) {
                str2 = WebEngageConstant.GCE;
                if (!WebEngageConstant.GCE.equalsIgnoreCase(str)) {
                    str2 = WebEngageConstant.IR0;
                    if (!WebEngageConstant.IR0.equalsIgnoreCase(str)) {
                        str2 = WebEngageConstant.UNL;
                        if (!WebEngageConstant.UNL.equalsIgnoreCase(str)) {
                            str2 = WebEngageConstant.KSA;
                            if (!WebEngageConstant.KSA.equalsIgnoreCase(str)) {
                                this.f30251k = WebEngageConstant.AWS;
                                this.f30222A = true;
                                return this;
                            }
                        }
                    }
                }
            }
            this.f30251k = str2;
            this.f30222A = true;
            return this;
        }

        public WebEngageConfig build() {
            return new WebEngageConfig(this);
        }

        public Builder disableFirstAcquisitionTracking() {
            this.f30240S = true;
            return this;
        }

        public Builder setAutoGAIDTracking(boolean z10) {
            this.f30233L = true;
            this.f30232K = z10;
            return this;
        }

        public Builder setAutoGCMRegistrationFlag(boolean z10) {
            this.f30243c = z10;
            this.f30260t = true;
            return this;
        }

        public Builder setDebugMode(boolean z10) {
            this.f30248h = z10;
            this.f30265y = true;
            return this;
        }

        public Builder setDefaultPushChannelConfiguration(PushChannelConfiguration pushChannelConfiguration) {
            this.f30257q = pushChannelConfiguration;
            this.f30229H = true;
            return this;
        }

        public Builder setEnvironment(Environment environment) {
            this.f30251k = this.f30250j.toString();
            this.f30250j = environment;
            this.f30223B = true;
            return this;
        }

        public Builder setEventReportingStrategy(ReportingStrategy reportingStrategy) {
            this.f30247g = reportingStrategy;
            this.f30264x = true;
            return this;
        }

        public Builder setEveryActivityIsScreen(boolean z10) {
            this.f30249i = z10;
            this.f30266z = true;
            return this;
        }

        public Builder setGCMProjectNumber(String str) {
            this.f30245e = str;
            this.f30262v = true;
            return this;
        }

        @Deprecated
        public Builder setLocationTracking(boolean z10) {
            this.f30241a.set(z10);
            this.f30258r = true;
            return this;
        }

        public Builder setLocationTrackingStrategy(LocationTrackingStrategy locationTrackingStrategy) {
            this.f30242b = locationTrackingStrategy;
            this.f30259s = true;
            return this;
        }

        public Builder setProxyURL(String str) {
            this.f30234M = str;
            this.f30235N = true;
            return this;
        }

        public Builder setPushAccentColor(int i10) {
            this.f30255o = i10;
            this.f30227F = true;
            return this;
        }

        public Builder setPushLargeIcon(int i10) {
            this.f30254n = i10;
            this.f30226E = true;
            return this;
        }

        public Builder setPushSmallIcon(int i10) {
            this.f30253m = i10;
            this.f30225D = true;
            return this;
        }

        public Builder setSessionDestroyTime(long j10) {
            this.f30231J = j10;
            return this;
        }

        public Builder setWebEngageKey(String str) {
            this.f30244d = str;
            this.f30261u = true;
            return this;
        }

        public Builder shouldEncryptUserStorage(boolean z10) {
            this.f30238Q = z10;
            this.f30239R = true;
            return this;
        }

        public Builder shouldTrackIPLocation(boolean z10) {
            this.f30236O = z10;
            this.f30237P = true;
            return this;
        }

        protected Builder(c0 c0Var) {
            this.f30241a = new AtomicBoolean(false);
            this.f30242b = LocationTrackingStrategy.ACCURACY_CITY;
            this.f30243c = false;
            this.f30244d = null;
            this.f30245e = null;
            this.f30246f = "4.21.1";
            this.f30247g = ReportingStrategy.BUFFER;
            this.f30248h = false;
            this.f30249i = false;
            Environment environment = Environment.US;
            this.f30250j = environment;
            this.f30251k = environment.toString();
            this.f30252l = false;
            this.f30253m = -1;
            this.f30254n = -1;
            this.f30255o = -1;
            this.f30256p = false;
            this.f30257q = new PushChannelConfiguration.Builder().build();
            this.f30258r = false;
            this.f30259s = false;
            this.f30260t = false;
            this.f30261u = false;
            this.f30262v = false;
            this.f30263w = false;
            this.f30264x = false;
            this.f30265y = false;
            this.f30266z = false;
            this.f30222A = false;
            this.f30223B = false;
            this.f30224C = false;
            this.f30225D = false;
            this.f30226E = false;
            this.f30227F = false;
            this.f30228G = false;
            this.f30229H = false;
            this.f30230I = true;
            this.f30231J = -1L;
            this.f30232K = true;
            this.f30233L = false;
            this.f30234M = null;
            this.f30235N = false;
            this.f30236O = true;
            this.f30237P = false;
            this.f30238Q = false;
            this.f30239R = false;
            this.f30240S = false;
            this.f30241a.set(c0Var.y());
            this.f30258r = c0Var.b("webengage_prefs.txt").contains("location_tracking_flag");
            this.f30242b = c0Var.z();
            this.f30259s = c0Var.b("webengage_prefs.txt").contains("location_tracking_strategy");
            this.f30247g = c0Var.w();
            this.f30264x = c0Var.b("webengage_prefs.txt").contains("event_reporting_strategy");
        }

        @Deprecated
        protected Builder a(boolean z10) {
            this.f30252l = z10;
            this.f30224C = true;
            return this;
        }

        protected Builder b(String str) {
            this.f30246f = str;
            this.f30263w = true;
            return this;
        }

        protected Builder c(boolean z10) {
            this.f30256p = z10;
            this.f30228G = true;
            return this;
        }

        protected Builder b(boolean z10) {
            this.f30230I = z10;
            return this;
        }
    }

    private WebEngageConfig(Builder builder) {
        this.f30186J = -1L;
        this.f30189M = BuildConfig.FLAVOR;
        this.f30190N = false;
        this.f30191O = true;
        this.f30192P = false;
        this.f30193Q = false;
        this.f30194R = false;
        this.f30195S = false;
        this.f30196a = builder.f30241a.get();
        this.f30197b = builder.f30242b;
        this.f30198c = builder.f30243c;
        this.f30199d = builder.f30244d;
        this.f30200e = builder.f30245e;
        this.f30201f = builder.f30247g;
        this.f30202g = builder.f30246f;
        this.f30203h = builder.f30248h;
        this.f30204i = builder.f30249i;
        this.f30205j = builder.f30251k;
        this.f30206k = builder.f30250j;
        this.f30207l = builder.f30252l;
        this.f30208m = builder.f30253m;
        this.f30209n = builder.f30254n;
        this.f30210o = builder.f30255o;
        this.f30211p = builder.f30256p;
        this.f30212q = builder.f30257q;
        this.f30189M = builder.f30234M;
        this.f30191O = builder.f30236O;
        this.f30193Q = builder.f30238Q;
        this.f30213r = builder.f30258r;
        this.f30214s = builder.f30259s;
        this.f30215t = builder.f30260t;
        this.f30216u = builder.f30261u;
        this.f30217v = builder.f30262v;
        this.f30218w = builder.f30263w;
        this.f30219x = builder.f30264x;
        this.f30220y = builder.f30265y;
        this.f30221z = builder.f30266z;
        this.f30177A = builder.f30222A;
        this.f30178B = builder.f30223B;
        this.f30179C = builder.f30224C;
        this.f30180D = builder.f30225D;
        this.f30181E = builder.f30226E;
        this.f30182F = builder.f30227F;
        this.f30183G = builder.f30228G;
        this.f30184H = builder.f30229H;
        this.f30185I = builder.f30230I;
        this.f30186J = builder.f30231J;
        this.f30187K = builder.f30232K;
        this.f30188L = builder.f30233L;
        this.f30190N = builder.f30235N;
        this.f30192P = builder.f30237P;
        this.f30194R = builder.f30239R;
        this.f30195S = builder.f30240S;
    }

    protected Environment a() {
        return this.f30206k;
    }

    protected boolean b() {
        return this.f30182F;
    }

    protected boolean c() {
        return this.f30179C;
    }

    protected boolean d() {
        return this.f30188L;
    }

    protected boolean e() {
        return this.f30215t;
    }

    protected boolean f() {
        return this.f30220y;
    }

    protected boolean g() {
        return this.f30184H;
    }

    public int getAccentColor() {
        return this.f30210o;
    }

    public boolean getAlternateInterfaceIdFlag() {
        return this.f30207l;
    }

    public boolean getAutoGCMRegistrationFlag() {
        return this.f30198c;
    }

    public Builder getCurrentState() {
        Builder builder = new Builder();
        if (m()) {
            builder.setLocationTracking(getLocationTrackingFlag());
        }
        if (n()) {
            builder.setLocationTrackingStrategy(getLocationTrackingStrategy());
        }
        if (e()) {
            builder.setAutoGCMRegistrationFlag(getAutoGCMRegistrationFlag());
        }
        if (r()) {
            builder.setWebEngageKey(getWebEngageKey());
        }
        if (l()) {
            builder.setGCMProjectNumber(getGcmProjectNumber());
        }
        if (s()) {
            builder.b(getWebEngageVersion());
        }
        if (q()) {
            builder.setEventReportingStrategy(getEventReportingStrategy());
        }
        if (f()) {
            builder.setDebugMode(getDebugMode());
        }
        if (j()) {
            builder.setEveryActivityIsScreen(getEveryActivityIsScreen());
        }
        if (h()) {
            builder.setEnvironment(a());
        } else if (i()) {
            builder.a(getEnvironment());
        }
        if (c()) {
            builder.a(getAlternateInterfaceIdFlag());
        }
        if (p()) {
            builder.setPushSmallIcon(getPushSmallIcon());
        }
        if (o()) {
            builder.setPushLargeIcon(getPushLargeIcon());
        }
        if (b()) {
            builder.setPushAccentColor(getAccentColor());
        }
        if (k()) {
            builder.c(getFilterCustomEvents());
        }
        if (g()) {
            builder.setDefaultPushChannelConfiguration(getDefaultPushChannelConfiguration());
        }
        builder.b(isEnableCrashTracking());
        builder.setSessionDestroyTime(this.f30186J);
        if (d()) {
            builder.setAutoGAIDTracking(isAutoGAIDTrackingEnabled());
        }
        if (isProxyURLSet()) {
            builder.setProxyURL(getProxyURL());
        }
        if (isShouldTrackIPLocationSet()) {
            builder.shouldTrackIPLocation(getShouldTrackIPLocation());
        }
        if (isShouldEncryptUserStorageSet()) {
            builder.shouldEncryptUserStorage(getShouldEncryptUserStorage());
        }
        if (isFirstAcquisitionTrackingDisabled()) {
            builder.disableFirstAcquisitionTracking();
        }
        return builder;
    }

    public boolean getDebugMode() {
        return this.f30203h;
    }

    public PushChannelConfiguration getDefaultPushChannelConfiguration() {
        return this.f30212q;
    }

    public String getEnvironment() {
        return h() ? this.f30206k.toString() : this.f30205j;
    }

    public ReportingStrategy getEventReportingStrategy() {
        return this.f30201f;
    }

    public boolean getEveryActivityIsScreen() {
        return this.f30204i;
    }

    public boolean getFilterCustomEvents() {
        return this.f30211p;
    }

    public String getGcmProjectNumber() {
        return this.f30200e;
    }

    @Deprecated
    public boolean getLocationTrackingFlag() {
        return this.f30196a;
    }

    public LocationTrackingStrategy getLocationTrackingStrategy() {
        return this.f30197b;
    }

    public String getProxyURL() {
        return this.f30189M;
    }

    public int getPushLargeIcon() {
        return this.f30209n;
    }

    public int getPushSmallIcon() {
        return this.f30208m;
    }

    public long getSessionDestroyTime() {
        return this.f30186J;
    }

    public boolean getShouldEncryptUserStorage() {
        return this.f30193Q;
    }

    public boolean getShouldTrackIPLocation() {
        return this.f30191O;
    }

    public String getWebEngageKey() {
        return this.f30199d;
    }

    public String getWebEngageVersion() {
        return this.f30202g;
    }

    protected boolean h() {
        return this.f30178B;
    }

    protected boolean i() {
        return this.f30177A;
    }

    public boolean isAutoGAIDTrackingEnabled() {
        return this.f30187K;
    }

    public boolean isEnableCrashTracking() {
        return this.f30185I;
    }

    public boolean isFirstAcquisitionTrackingDisabled() {
        return this.f30195S;
    }

    public boolean isLocationTrackingEnabled() {
        return n() ? getLocationTrackingStrategy() != LocationTrackingStrategy.DISABLED : getLocationTrackingFlag();
    }

    public boolean isProxyURLSet() {
        return this.f30190N;
    }

    public boolean isShouldEncryptUserStorageSet() {
        return this.f30194R;
    }

    public boolean isShouldTrackIPLocationSet() {
        return this.f30192P;
    }

    public boolean isValid(Context context) {
        String str;
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (WebEngageUtils.d(getWebEngageKey())) {
            str = "WebEngage key not found";
        } else if (getAutoGCMRegistrationFlag() && WebEngageUtils.d(getGcmProjectNumber())) {
            str = "GCM project number not found";
        } else {
            if (h()) {
                if (a() == null) {
                    return false;
                }
            } else if (!WebEngageConstant.GCE.equals(getEnvironment()) && !WebEngageConstant.AWS.equals(getEnvironment()) && !WebEngageConstant.IN.equals(getEnvironment()) && !WebEngageConstant.IR0.equals(getEnvironment()) && !WebEngageConstant.UNL.equals(getEnvironment()) && !WebEngageConstant.KSA.equals(getEnvironment())) {
                str = "Invalid value for Environment provided";
            }
            if (Build.VERSION.SDK_INT < 26 || getDefaultPushChannelConfiguration().isValid(applicationContext)) {
                return true;
            }
            str = "Invalid Push channel configuration found";
        }
        Logger.e("WebEngage", str);
        return false;
    }

    protected boolean j() {
        return this.f30221z;
    }

    protected boolean k() {
        return this.f30183G;
    }

    protected boolean l() {
        return this.f30217v;
    }

    protected boolean m() {
        return this.f30213r;
    }

    protected boolean n() {
        return this.f30214s;
    }

    protected boolean o() {
        return this.f30181E;
    }

    protected boolean p() {
        return this.f30180D;
    }

    protected boolean q() {
        return this.f30219x;
    }

    protected boolean r() {
        return this.f30216u;
    }

    protected boolean s() {
        return this.f30218w;
    }

    public String toString() {
        return "LocationTracking: " + getLocationTrackingFlag() + "\nLocationTrackingStrategy: " + getLocationTrackingStrategy() + "\nShouldTrackIPLocation: " + getShouldTrackIPLocation() + "\nAutoGCMRegistration: " + getAutoGCMRegistrationFlag() + "\nWebEngageKey: " + getWebEngageKey() + "\nGCMProjectNumber: " + getGcmProjectNumber() + "\nWebEngageVersion: " + getWebEngageVersion() + "\nReportingStrategy: " + getEventReportingStrategy() + "\nDebugMode: " + getDebugMode() + "\nEveryActivityIsScreen: " + getEveryActivityIsScreen() + "\nEnvironment: " + getEnvironment() + "\nAlternateInterfaceId: " + getAlternateInterfaceIdFlag() + "\nPushSmallIcon: " + getPushSmallIcon() + "\nPushLargeIcon: " + getPushLargeIcon() + "\nAccentColor: " + getAccentColor() + "\nFilterCustomEvent: " + getFilterCustomEvents() + "\nSessionDestroyTime: " + getSessionDestroyTime() + "\nDefaultPushChannelConfiguration: " + getDefaultPushChannelConfiguration() + "\nAutoGAIDTracking: " + isAutoGAIDTrackingEnabled() + "\nProxyURL: " + isProxyURLSet() + "\nShouldEncryptUserStorage: " + getShouldEncryptUserStorage() + "\nisFirstAcquisitionTrackingDisabled: " + isFirstAcquisitionTrackingDisabled();
    }
}
