package com.webengage.sdk.android;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.webengage.sdk.android.PushChannelConfiguration;
import com.webengage.sdk.android.WebEngageConfig;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.actions.render.CallToAction;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.actions.render.TimerService;
import com.webengage.sdk.android.actions.rules.RuleExecutor;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.callbacks.InAppNotificationCallbacks;
import com.webengage.sdk.android.callbacks.LifeCycleCallbacks;
import com.webengage.sdk.android.callbacks.PushNotificationCallbacks;
import com.webengage.sdk.android.callbacks.StateChangeCallbacks;
import com.webengage.sdk.android.callbacks.WENetworkInterceptor;
import com.webengage.sdk.android.callbacks.WESecurityCallback;
import com.webengage.sdk.android.t1;
import com.webengage.sdk.android.utils.Provider;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WebEngage extends AbstractWebEngage {

    /* renamed from: b, reason: collision with root package name */
    private static Context f30168b = null;

    /* renamed from: c, reason: collision with root package name */
    private static c0 f30169c = null;

    /* renamed from: d, reason: collision with root package name */
    private static WebEngageConfig f30170d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile AbstractWebEngage f30171e = null;

    /* renamed from: f, reason: collision with root package name */
    private static m2 f30172f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f30173g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static boolean f30174h = false;

    /* renamed from: a, reason: collision with root package name */
    private Boolean f30175a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30176a;

        static {
            int[] iArr = new int[LocationTrackingStrategy.values().length];
            f30176a = iArr;
            try {
                iArr[LocationTrackingStrategy.ACCURACY_BEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30176a[LocationTrackingStrategy.ACCURACY_CITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30176a[LocationTrackingStrategy.ACCURACY_COUNTRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30176a[LocationTrackingStrategy.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|1|(1:5)|6|(1:8)|9|(3:11|(1:13)|14)|15|(1:17)(1:64)|18|(1:20)(2:61|(1:63))|21|(1:23)|24|(2:26|(10:28|29|(1:31)|32|(2:51|52)|34|35|(1:37)(1:47)|38|(1:45)(2:42|43)))(2:58|(11:60|57|29|(0)|32|(0)|34|35|(0)(0)|38|(2:40|45)(1:46)))|56|57|29|(0)|32|(0)|34|35|(0)(0)|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0235, code lost:
    
        com.webengage.sdk.android.Logger.e("WebEngage", "Error during channel registration: " + r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021c A[Catch: Exception -> 0x022d, TryCatch #0 {Exception -> 0x022d, blocks: (B:35:0x0214, B:37:0x021c, B:47:0x022f), top: B:34:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x022f A[Catch: Exception -> 0x022d, TRY_LEAVE, TryCatch #0 {Exception -> 0x022d, blocks: (B:35:0x0214, B:37:0x021c, B:47:0x022f), top: B:34:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private WebEngage(Context context) {
        LocationTrackingStrategy locationTrackingStrategy;
        Boolean bool = Boolean.FALSE;
        this.f30175a = bool;
        Logger.d("WebEngage", " WebEngage constructor called");
        String x10 = f30169c.x();
        String webEngageKey = f30170d.getWebEngageKey();
        if (!WebEngageUtils.d(x10) && !x10.equals(webEngageKey)) {
            Logger.w("WebEngage", "Previous license-code (" + x10 + ") did not match current license-code (" + webEngageKey + "), hence deleting all saved data");
            a(context);
        }
        f30169c.l(f30170d.getWebEngageKey());
        DataHolder.get().b(true);
        com.webengage.sdk.android.utils.http.a.a(new y1());
        o3.a(f30168b).a(new a4(f30168b));
        DataHolder.get().a(analytics().a());
        DataHolder.get().a(com.webengage.sdk.android.actions.database.e.b(f30168b));
        if (analytics().a().g().isEmpty()) {
            analytics().a().b(false);
        }
        m0.b(f30168b).g();
        if (analytics().a().h().isEmpty()) {
            if (!get().getWebEngageConfig().isAutoGAIDTrackingEnabled()) {
                analytics().a().a(bool);
            }
            ((e4) user()).a();
        }
        startService(l1.a(y3.f31157b, null, f30168b), f30168b);
        String h10 = getCUID().isEmpty() ? analytics().a().h() : getCUID();
        if (analytics().a().j().isEmpty()) {
            analytics().c().i();
        } else if (String.valueOf(com.webengage.sdk.android.actions.database.e.b(f30168b).a(h10, "session_type")).equalsIgnoreCase("online")) {
            analytics().c().c();
            analytics().b().a();
        }
        x.a(f30168b);
        if (f30170d.q()) {
            setEventReportingStrategy(f30170d.getEventReportingStrategy());
        }
        if (f30170d.m()) {
            if (!f30170d.n()) {
                setLocationTracking(f30170d.getLocationTrackingFlag());
                if (analytics().a().c()) {
                    Logger.e("WebEngage", "App was crashed last time, ");
                    analytics().a().f("com.webengage.static.app_crashed");
                    startService(l1.a(y3.f31158c, n0.b("app_crashed", null, null, null, f30168b), f30168b), f30168b);
                }
                if (f30170d.isEnableCrashTracking()) {
                    try {
                        Thread.setDefaultUncaughtExceptionHandler(new r4(Thread.getDefaultUncaughtExceptionHandler(), f30168b, analytics().a()));
                    } catch (Exception e10) {
                        Logger.e("WebEngage", "Exception occurred during registering exception handler: " + e10.toString());
                    }
                }
                if (f30170d.getDefaultPushChannelConfiguration() != null) {
                    j2.a(f30170d.getDefaultPushChannelConfiguration(), f30168b);
                    Logger.d("WebEngage", "Default push channel registered");
                } else {
                    Logger.w("WebEngage", "Not registering for default push channel");
                }
                Logger.d("WebEngage", "WebEngage Successfully Initialized");
                Logger.d("WebEngage", "Current interface_id: " + analytics().a().g());
                Logger.d("WebEngage", "Current luid: " + analytics().a().h());
                Logger.d("WebEngage", "Current cuid: " + analytics().a().d());
                Logger.d("WebEngage", "Current token FCM: " + analytics().a().i());
                Logger.d("WebEngage", "Current token MI: " + analytics().a().t());
                Logger.d("WebEngage", "Current token HW: " + analytics().a().f());
                Logger.d("WebEngage", "Current WebEngage Configuration: " + f30170d.toString());
                Logger.d("WebEngage", "SDT from app config: " + f30170d.getSessionDestroyTime());
                if (analytics().a().v() || !n2.h()) {
                    return;
                }
                Logger.d("WebEngage", "isInstallReferrerSet " + analytics().a().v());
                new k1(context).a();
                return;
            }
        } else if (!f30170d.n()) {
            locationTrackingStrategy = LocationTrackingStrategy.DISABLED;
            setLocationTrackingStrategy(locationTrackingStrategy);
            if (analytics().a().c()) {
            }
            if (f30170d.isEnableCrashTracking()) {
            }
            if (f30170d.getDefaultPushChannelConfiguration() != null) {
            }
            Logger.d("WebEngage", "WebEngage Successfully Initialized");
            Logger.d("WebEngage", "Current interface_id: " + analytics().a().g());
            Logger.d("WebEngage", "Current luid: " + analytics().a().h());
            Logger.d("WebEngage", "Current cuid: " + analytics().a().d());
            Logger.d("WebEngage", "Current token FCM: " + analytics().a().i());
            Logger.d("WebEngage", "Current token MI: " + analytics().a().t());
            Logger.d("WebEngage", "Current token HW: " + analytics().a().f());
            Logger.d("WebEngage", "Current WebEngage Configuration: " + f30170d.toString());
            Logger.d("WebEngage", "SDT from app config: " + f30170d.getSessionDestroyTime());
            if (analytics().a().v()) {
                return;
            } else {
                return;
            }
        }
        locationTrackingStrategy = f30170d.getLocationTrackingStrategy();
        setLocationTrackingStrategy(locationTrackingStrategy);
        if (analytics().a().c()) {
        }
        if (f30170d.isEnableCrashTracking()) {
        }
        if (f30170d.getDefaultPushChannelConfiguration() != null) {
        }
        Logger.d("WebEngage", "WebEngage Successfully Initialized");
        Logger.d("WebEngage", "Current interface_id: " + analytics().a().g());
        Logger.d("WebEngage", "Current luid: " + analytics().a().h());
        Logger.d("WebEngage", "Current cuid: " + analytics().a().d());
        Logger.d("WebEngage", "Current token FCM: " + analytics().a().i());
        Logger.d("WebEngage", "Current token MI: " + analytics().a().t());
        Logger.d("WebEngage", "Current token HW: " + analytics().a().f());
        Logger.d("WebEngage", "Current WebEngage Configuration: " + f30170d.toString());
        Logger.d("WebEngage", "SDT from app config: " + f30170d.getSessionDestroyTime());
        if (analytics().a().v()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static WebEngageConfig a(WebEngageConfig webEngageConfig, WebEngageConfig webEngageConfig2, c0 c0Var) {
        boolean locationTrackingFlag;
        ReportingStrategy eventReportingStrategy;
        PushChannelConfiguration defaultPushChannelConfiguration;
        String notificationChannelId;
        if (webEngageConfig2 == null) {
            return webEngageConfig;
        }
        if (webEngageConfig == null) {
            return webEngageConfig2;
        }
        WebEngageConfig.Builder builder = new WebEngageConfig.Builder(c0Var);
        if (!webEngageConfig2.m()) {
            if (webEngageConfig.m()) {
                locationTrackingFlag = webEngageConfig.getLocationTrackingFlag();
            }
            if (webEngageConfig2.n()) {
                builder.setLocationTrackingStrategy(webEngageConfig2.getLocationTrackingStrategy());
            }
            if (webEngageConfig2.q()) {
                if (webEngageConfig.q()) {
                    eventReportingStrategy = webEngageConfig.getEventReportingStrategy();
                }
                builder.setAutoGCMRegistrationFlag(webEngageConfig2.e() ? webEngageConfig2.getAutoGCMRegistrationFlag() : webEngageConfig.getAutoGCMRegistrationFlag());
                builder.setWebEngageKey(webEngageConfig2.r() ? webEngageConfig2.getWebEngageKey() : webEngageConfig.getWebEngageKey());
                builder.setGCMProjectNumber(webEngageConfig2.l() ? webEngageConfig2.getGcmProjectNumber() : webEngageConfig.getGcmProjectNumber());
                builder.b(webEngageConfig2.s() ? webEngageConfig2.getWebEngageVersion() : webEngageConfig.getWebEngageVersion());
                builder.setDebugMode(webEngageConfig2.f() ? webEngageConfig2.getDebugMode() : webEngageConfig.getDebugMode());
                builder.setEveryActivityIsScreen(webEngageConfig2.j() ? webEngageConfig2.getEveryActivityIsScreen() : webEngageConfig.getEveryActivityIsScreen());
                builder.a((!webEngageConfig2.h() && (webEngageConfig.h() || !webEngageConfig2.i())) ? webEngageConfig.getEnvironment() : webEngageConfig2.getEnvironment());
                builder.a(!webEngageConfig2.c() ? webEngageConfig2.getAlternateInterfaceIdFlag() : webEngageConfig.getAlternateInterfaceIdFlag());
                builder.setPushSmallIcon(!webEngageConfig2.p() ? webEngageConfig2.getPushSmallIcon() : webEngageConfig.getPushSmallIcon());
                builder.setPushLargeIcon(!webEngageConfig2.o() ? webEngageConfig2.getPushLargeIcon() : webEngageConfig.getPushLargeIcon());
                builder.setPushAccentColor(!webEngageConfig2.b() ? webEngageConfig2.getAccentColor() : webEngageConfig.getAccentColor());
                builder.c(!webEngageConfig2.k() ? webEngageConfig2.getFilterCustomEvents() : webEngageConfig.getFilterCustomEvents());
                builder.b(webEngageConfig.isEnableCrashTracking());
                builder.setSessionDestroyTime(webEngageConfig2.getSessionDestroyTime() == -1 ? webEngageConfig2.getSessionDestroyTime() : webEngageConfig.getSessionDestroyTime());
                if (webEngageConfig2.d()) {
                    builder.setAutoGAIDTracking(webEngageConfig2.isAutoGAIDTrackingEnabled());
                }
                if (!webEngageConfig2.isProxyURLSet() || webEngageConfig.isProxyURLSet()) {
                    builder.setProxyURL(!webEngageConfig2.isProxyURLSet() ? webEngageConfig2.getProxyURL() : webEngageConfig.getProxyURL());
                }
                if (!webEngageConfig2.isShouldTrackIPLocationSet() || webEngageConfig.isShouldTrackIPLocationSet()) {
                    builder.shouldTrackIPLocation(!webEngageConfig2.isShouldTrackIPLocationSet() ? webEngageConfig2.getShouldTrackIPLocation() : webEngageConfig.getShouldTrackIPLocation());
                }
                if (!webEngageConfig2.isShouldEncryptUserStorageSet() || webEngageConfig.isShouldEncryptUserStorageSet()) {
                    builder.shouldEncryptUserStorage(!webEngageConfig2.isShouldEncryptUserStorageSet() ? webEngageConfig2.getShouldEncryptUserStorage() : webEngageConfig.getShouldEncryptUserStorage());
                }
                if (webEngageConfig2.g()) {
                    defaultPushChannelConfiguration = webEngageConfig.getDefaultPushChannelConfiguration();
                } else {
                    PushChannelConfiguration defaultPushChannelConfiguration2 = webEngageConfig2.getDefaultPushChannelConfiguration();
                    PushChannelConfiguration.Builder builder2 = new PushChannelConfiguration.Builder();
                    if (defaultPushChannelConfiguration2.isNotificationChannelIdSet()) {
                        notificationChannelId = defaultPushChannelConfiguration2.getNotificationChannelId();
                    } else {
                        if (webEngageConfig.getDefaultPushChannelConfiguration().isNotificationChannelIdSet()) {
                            notificationChannelId = webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelId();
                        }
                        builder2.setNotificationChannelName(!defaultPushChannelConfiguration2.isNotificationChannelNameSet() ? defaultPushChannelConfiguration2.getNotificationChannelName() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelName());
                        builder2.setNotificationChannelImportance(!defaultPushChannelConfiguration2.isNotificationChannelImportanceSet() ? defaultPushChannelConfiguration2.getNotificationChannelImportance() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelImportance());
                        builder2.setNotificationChannelDescription(!defaultPushChannelConfiguration2.isNotificationChannelDescriptionSet() ? defaultPushChannelConfiguration2.getNotificationChannelDescription() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelDescription());
                        builder2.setNotificationChannelGroup(!defaultPushChannelConfiguration2.isNotificationChannelGroupSet() ? defaultPushChannelConfiguration2.getNotificationChannelGroup() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelGroup());
                        builder2.setNotificationChannelLightColor(!defaultPushChannelConfiguration2.isNotificationLightColorSet() ? defaultPushChannelConfiguration2.getNotificationChannelLightColor() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelLightColor());
                        builder2.setNotificationChannelLockScreenVisibility(!defaultPushChannelConfiguration2.isNotificationLockScreenVisibilitySet() ? defaultPushChannelConfiguration2.getNotificationChannelLockScreenVisibility() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelLockScreenVisibility());
                        builder2.setNotificationChannelShowBadge(!defaultPushChannelConfiguration2.isNotificationChannelShowBadgeSet() ? defaultPushChannelConfiguration2.isNotificationChannelShowBadge() : webEngageConfig.getDefaultPushChannelConfiguration().isNotificationChannelShowBadge());
                        builder2.setNotificationChannelSound(!defaultPushChannelConfiguration2.isNotificationChannelSoundSet() ? defaultPushChannelConfiguration2.getNotificationChannelSound() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelSound());
                        if (!defaultPushChannelConfiguration2.isNotificationChannelVibrationSet()) {
                            defaultPushChannelConfiguration2 = webEngageConfig.getDefaultPushChannelConfiguration();
                        }
                        builder2.setNotificationChannelVibration(defaultPushChannelConfiguration2.isNotificationChannelVibration());
                        defaultPushChannelConfiguration = builder2.build();
                    }
                    builder2.setNotificationChannelID(notificationChannelId);
                    builder2.setNotificationChannelName(!defaultPushChannelConfiguration2.isNotificationChannelNameSet() ? defaultPushChannelConfiguration2.getNotificationChannelName() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelName());
                    builder2.setNotificationChannelImportance(!defaultPushChannelConfiguration2.isNotificationChannelImportanceSet() ? defaultPushChannelConfiguration2.getNotificationChannelImportance() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelImportance());
                    builder2.setNotificationChannelDescription(!defaultPushChannelConfiguration2.isNotificationChannelDescriptionSet() ? defaultPushChannelConfiguration2.getNotificationChannelDescription() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelDescription());
                    builder2.setNotificationChannelGroup(!defaultPushChannelConfiguration2.isNotificationChannelGroupSet() ? defaultPushChannelConfiguration2.getNotificationChannelGroup() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelGroup());
                    builder2.setNotificationChannelLightColor(!defaultPushChannelConfiguration2.isNotificationLightColorSet() ? defaultPushChannelConfiguration2.getNotificationChannelLightColor() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelLightColor());
                    builder2.setNotificationChannelLockScreenVisibility(!defaultPushChannelConfiguration2.isNotificationLockScreenVisibilitySet() ? defaultPushChannelConfiguration2.getNotificationChannelLockScreenVisibility() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelLockScreenVisibility());
                    builder2.setNotificationChannelShowBadge(!defaultPushChannelConfiguration2.isNotificationChannelShowBadgeSet() ? defaultPushChannelConfiguration2.isNotificationChannelShowBadge() : webEngageConfig.getDefaultPushChannelConfiguration().isNotificationChannelShowBadge());
                    builder2.setNotificationChannelSound(!defaultPushChannelConfiguration2.isNotificationChannelSoundSet() ? defaultPushChannelConfiguration2.getNotificationChannelSound() : webEngageConfig.getDefaultPushChannelConfiguration().getNotificationChannelSound());
                    if (!defaultPushChannelConfiguration2.isNotificationChannelVibrationSet()) {
                    }
                    builder2.setNotificationChannelVibration(defaultPushChannelConfiguration2.isNotificationChannelVibration());
                    defaultPushChannelConfiguration = builder2.build();
                }
                builder.setDefaultPushChannelConfiguration(defaultPushChannelConfiguration);
                if (!webEngageConfig2.isFirstAcquisitionTrackingDisabled() ? webEngageConfig2.isFirstAcquisitionTrackingDisabled() : webEngageConfig.isFirstAcquisitionTrackingDisabled()) {
                    builder.disableFirstAcquisitionTracking();
                }
                return builder.build();
            }
            eventReportingStrategy = webEngageConfig2.getEventReportingStrategy();
            builder.setEventReportingStrategy(eventReportingStrategy);
            builder.setAutoGCMRegistrationFlag(webEngageConfig2.e() ? webEngageConfig2.getAutoGCMRegistrationFlag() : webEngageConfig.getAutoGCMRegistrationFlag());
            builder.setWebEngageKey(webEngageConfig2.r() ? webEngageConfig2.getWebEngageKey() : webEngageConfig.getWebEngageKey());
            builder.setGCMProjectNumber(webEngageConfig2.l() ? webEngageConfig2.getGcmProjectNumber() : webEngageConfig.getGcmProjectNumber());
            builder.b(webEngageConfig2.s() ? webEngageConfig2.getWebEngageVersion() : webEngageConfig.getWebEngageVersion());
            builder.setDebugMode(webEngageConfig2.f() ? webEngageConfig2.getDebugMode() : webEngageConfig.getDebugMode());
            builder.setEveryActivityIsScreen(webEngageConfig2.j() ? webEngageConfig2.getEveryActivityIsScreen() : webEngageConfig.getEveryActivityIsScreen());
            if (webEngageConfig2.h()) {
                builder.a((!webEngageConfig2.h() && (webEngageConfig.h() || !webEngageConfig2.i())) ? webEngageConfig.getEnvironment() : webEngageConfig2.getEnvironment());
                builder.a(!webEngageConfig2.c() ? webEngageConfig2.getAlternateInterfaceIdFlag() : webEngageConfig.getAlternateInterfaceIdFlag());
                builder.setPushSmallIcon(!webEngageConfig2.p() ? webEngageConfig2.getPushSmallIcon() : webEngageConfig.getPushSmallIcon());
                builder.setPushLargeIcon(!webEngageConfig2.o() ? webEngageConfig2.getPushLargeIcon() : webEngageConfig.getPushLargeIcon());
                builder.setPushAccentColor(!webEngageConfig2.b() ? webEngageConfig2.getAccentColor() : webEngageConfig.getAccentColor());
                builder.c(!webEngageConfig2.k() ? webEngageConfig2.getFilterCustomEvents() : webEngageConfig.getFilterCustomEvents());
                builder.b(webEngageConfig.isEnableCrashTracking());
                builder.setSessionDestroyTime(webEngageConfig2.getSessionDestroyTime() == -1 ? webEngageConfig2.getSessionDestroyTime() : webEngageConfig.getSessionDestroyTime());
                if (webEngageConfig2.d()) {
                }
                if (!webEngageConfig2.isProxyURLSet()) {
                }
                builder.setProxyURL(!webEngageConfig2.isProxyURLSet() ? webEngageConfig2.getProxyURL() : webEngageConfig.getProxyURL());
                if (!webEngageConfig2.isShouldTrackIPLocationSet()) {
                }
                builder.shouldTrackIPLocation(!webEngageConfig2.isShouldTrackIPLocationSet() ? webEngageConfig2.getShouldTrackIPLocation() : webEngageConfig.getShouldTrackIPLocation());
                if (!webEngageConfig2.isShouldEncryptUserStorageSet()) {
                }
                builder.shouldEncryptUserStorage(!webEngageConfig2.isShouldEncryptUserStorageSet() ? webEngageConfig2.getShouldEncryptUserStorage() : webEngageConfig.getShouldEncryptUserStorage());
                if (webEngageConfig2.g()) {
                }
                builder.setDefaultPushChannelConfiguration(defaultPushChannelConfiguration);
                if (!webEngageConfig2.isFirstAcquisitionTrackingDisabled() ? webEngageConfig2.isFirstAcquisitionTrackingDisabled() : webEngageConfig.isFirstAcquisitionTrackingDisabled()) {
                }
                return builder.build();
            }
            builder.a((!webEngageConfig2.h() && (webEngageConfig.h() || !webEngageConfig2.i())) ? webEngageConfig.getEnvironment() : webEngageConfig2.getEnvironment());
            builder.a(!webEngageConfig2.c() ? webEngageConfig2.getAlternateInterfaceIdFlag() : webEngageConfig.getAlternateInterfaceIdFlag());
            builder.setPushSmallIcon(!webEngageConfig2.p() ? webEngageConfig2.getPushSmallIcon() : webEngageConfig.getPushSmallIcon());
            builder.setPushLargeIcon(!webEngageConfig2.o() ? webEngageConfig2.getPushLargeIcon() : webEngageConfig.getPushLargeIcon());
            builder.setPushAccentColor(!webEngageConfig2.b() ? webEngageConfig2.getAccentColor() : webEngageConfig.getAccentColor());
            builder.c(!webEngageConfig2.k() ? webEngageConfig2.getFilterCustomEvents() : webEngageConfig.getFilterCustomEvents());
            builder.b(webEngageConfig.isEnableCrashTracking());
            builder.setSessionDestroyTime(webEngageConfig2.getSessionDestroyTime() == -1 ? webEngageConfig2.getSessionDestroyTime() : webEngageConfig.getSessionDestroyTime());
            if (webEngageConfig2.d()) {
            }
            if (!webEngageConfig2.isProxyURLSet()) {
            }
            builder.setProxyURL(!webEngageConfig2.isProxyURLSet() ? webEngageConfig2.getProxyURL() : webEngageConfig.getProxyURL());
            if (!webEngageConfig2.isShouldTrackIPLocationSet()) {
            }
            builder.shouldTrackIPLocation(!webEngageConfig2.isShouldTrackIPLocationSet() ? webEngageConfig2.getShouldTrackIPLocation() : webEngageConfig.getShouldTrackIPLocation());
            if (!webEngageConfig2.isShouldEncryptUserStorageSet()) {
            }
            builder.shouldEncryptUserStorage(!webEngageConfig2.isShouldEncryptUserStorageSet() ? webEngageConfig2.getShouldEncryptUserStorage() : webEngageConfig.getShouldEncryptUserStorage());
            if (webEngageConfig2.g()) {
            }
            builder.setDefaultPushChannelConfiguration(defaultPushChannelConfiguration);
            if (!webEngageConfig2.isFirstAcquisitionTrackingDisabled() ? webEngageConfig2.isFirstAcquisitionTrackingDisabled() : webEngageConfig.isFirstAcquisitionTrackingDisabled()) {
            }
            return builder.build();
        }
        locationTrackingFlag = webEngageConfig2.getLocationTrackingFlag();
        builder.setLocationTracking(locationTrackingFlag);
        if (webEngageConfig2.n()) {
        }
        if (webEngageConfig2.q()) {
        }
        builder.setEventReportingStrategy(eventReportingStrategy);
        builder.setAutoGCMRegistrationFlag(webEngageConfig2.e() ? webEngageConfig2.getAutoGCMRegistrationFlag() : webEngageConfig.getAutoGCMRegistrationFlag());
        builder.setWebEngageKey(webEngageConfig2.r() ? webEngageConfig2.getWebEngageKey() : webEngageConfig.getWebEngageKey());
        builder.setGCMProjectNumber(webEngageConfig2.l() ? webEngageConfig2.getGcmProjectNumber() : webEngageConfig.getGcmProjectNumber());
        builder.b(webEngageConfig2.s() ? webEngageConfig2.getWebEngageVersion() : webEngageConfig.getWebEngageVersion());
        builder.setDebugMode(webEngageConfig2.f() ? webEngageConfig2.getDebugMode() : webEngageConfig.getDebugMode());
        builder.setEveryActivityIsScreen(webEngageConfig2.j() ? webEngageConfig2.getEveryActivityIsScreen() : webEngageConfig.getEveryActivityIsScreen());
        builder.a((!webEngageConfig2.h() && (webEngageConfig.h() || !webEngageConfig2.i())) ? webEngageConfig.getEnvironment() : webEngageConfig2.getEnvironment());
        builder.a(!webEngageConfig2.c() ? webEngageConfig2.getAlternateInterfaceIdFlag() : webEngageConfig.getAlternateInterfaceIdFlag());
        builder.setPushSmallIcon(!webEngageConfig2.p() ? webEngageConfig2.getPushSmallIcon() : webEngageConfig.getPushSmallIcon());
        builder.setPushLargeIcon(!webEngageConfig2.o() ? webEngageConfig2.getPushLargeIcon() : webEngageConfig.getPushLargeIcon());
        builder.setPushAccentColor(!webEngageConfig2.b() ? webEngageConfig2.getAccentColor() : webEngageConfig.getAccentColor());
        builder.c(!webEngageConfig2.k() ? webEngageConfig2.getFilterCustomEvents() : webEngageConfig.getFilterCustomEvents());
        builder.b(webEngageConfig.isEnableCrashTracking());
        builder.setSessionDestroyTime(webEngageConfig2.getSessionDestroyTime() == -1 ? webEngageConfig2.getSessionDestroyTime() : webEngageConfig.getSessionDestroyTime());
        if (webEngageConfig2.d()) {
        }
        if (!webEngageConfig2.isProxyURLSet()) {
        }
        builder.setProxyURL(!webEngageConfig2.isProxyURLSet() ? webEngageConfig2.getProxyURL() : webEngageConfig.getProxyURL());
        if (!webEngageConfig2.isShouldTrackIPLocationSet()) {
        }
        builder.shouldTrackIPLocation(!webEngageConfig2.isShouldTrackIPLocationSet() ? webEngageConfig2.getShouldTrackIPLocation() : webEngageConfig.getShouldTrackIPLocation());
        if (!webEngageConfig2.isShouldEncryptUserStorageSet()) {
        }
        builder.shouldEncryptUserStorage(!webEngageConfig2.isShouldEncryptUserStorageSet() ? webEngageConfig2.getShouldEncryptUserStorage() : webEngageConfig.getShouldEncryptUserStorage());
        if (webEngageConfig2.g()) {
        }
        builder.setDefaultPushChannelConfiguration(defaultPushChannelConfiguration);
        if (!webEngageConfig2.isFirstAcquisitionTrackingDisabled() ? webEngageConfig2.isFirstAcquisitionTrackingDisabled() : webEngageConfig.isFirstAcquisitionTrackingDisabled()) {
        }
        return builder.build();
    }

    static WebEngageConfig b(Context context) {
        Object obj;
        WebEngageConfig.Builder builder = new WebEngageConfig.Builder();
        Bundle c10 = WebEngageUtils.c(context);
        if (c10 != null) {
            if (c10.containsKey("com.webengage.sdk.android.environment")) {
                builder.a(c10.getString("com.webengage.sdk.android.environment"));
            }
            if (c10.containsKey("com.webengage.sdk.android.alternate_interface_id")) {
                builder.a(c10.getBoolean("com.webengage.sdk.android.alternate_interface_id"));
            }
            if (c10.containsKey("com.webengage.sdk.android.small_icon")) {
                builder.setPushSmallIcon(c10.getInt("com.webengage.sdk.android.small_icon"));
            }
            if (c10.containsKey("com.webengage.sdk.android.large_icon")) {
                builder.setPushLargeIcon(c10.getInt("com.webengage.sdk.android.large_icon"));
            }
            if (c10.containsKey("com.webengage.sdk.android.accent_color")) {
                builder.setPushAccentColor(c10.getInt("com.webengage.sdk.android.accent_color"));
            }
            if (c10.containsKey("com.webengage.sdk.android.proxy_url")) {
                builder.setProxyURL(c10.getString("com.webengage.sdk.android.proxy_url"));
            }
            String string = c10.containsKey("com.webengage.sdk.android.push.channel.name") ? c10.getString("com.webengage.sdk.android.push.channel.name") : "Marketing";
            int i10 = c10.containsKey("com.webengage.sdk.android.push.channel.importance") ? c10.getInt("com.webengage.sdk.android.push.channel.importance") : 3;
            PushChannelConfiguration.Builder builder2 = new PushChannelConfiguration.Builder();
            builder2.setNotificationChannelName(string);
            builder2.setNotificationChannelImportance(i10);
            if (c10.containsKey("com.webengage.sdk.android.push.channel.id")) {
                builder2.setNotificationChannelID(c10.getString("com.webengage.sdk.android.push.channel.id"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.description")) {
                builder2.setNotificationChannelDescription(c10.getString("com.webengage.sdk.android.push.channel.description"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.group")) {
                builder2.setNotificationChannelGroup(c10.getString("com.webengage.sdk.android.push.channel.group"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.light_color")) {
                builder2.setNotificationChannelLightColor(c10.getInt("com.webengage.sdk.android.push.channel.light_color"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.lock_screen_visibility")) {
                builder2.setNotificationChannelLockScreenVisibility(c10.getInt("com.webengage.sdk.android.push.channel.lock_screen_visibility"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.show_badge")) {
                builder2.setNotificationChannelShowBadge(c10.getBoolean("com.webengage.sdk.android.push.channel.show_badge"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.sound")) {
                builder2.setNotificationChannelSound(c10.getString("com.webengage.sdk.android.push.channel.sound"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.vibration")) {
                builder2.setNotificationChannelVibration(c10.getBoolean("com.webengage.sdk.android.push.channel.vibration"));
            }
            PushChannelConfiguration build = builder2.build();
            if (build != null) {
                builder.setDefaultPushChannelConfiguration(build);
            }
            if (c10.containsKey("com.webengage.sdk.android.session_destroy_time")) {
                builder.setSessionDestroyTime(c10.getInt("com.webengage.sdk.android.session_destroy_time", -1));
            }
            if (c10.containsKey("com.webengage.sdk.android.ip_location_tracking")) {
                builder.shouldTrackIPLocation(c10.getBoolean("com.webengage.sdk.android.ip_location_tracking"));
            }
            if (c10.containsKey("com.webengage.sdk.android.location_tracking")) {
                builder.setLocationTracking(c10.getBoolean("com.webengage.sdk.android.location_tracking"));
            }
            if (c10.containsKey("com.webengage.sdk.android.auto_gcm_registration")) {
                builder.setAutoGCMRegistrationFlag(c10.getBoolean("com.webengage.sdk.android.auto_gcm_registration"));
            }
            if (c10.containsKey("com.webengage.sdk.android.project_number")) {
                Object obj2 = c10.get("com.webengage.sdk.android.project_number");
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() > 0) {
                        builder.setGCMProjectNumber(str.substring(1));
                    }
                }
            }
            if (c10.containsKey("com.webengage.sdk.android.key") && (obj = c10.get("com.webengage.sdk.android.key")) != null) {
                builder.setWebEngageKey(obj.toString());
            }
            if (c10.containsKey("com.webengage.sdk.android.debug")) {
                builder.setDebugMode(c10.getBoolean("com.webengage.sdk.android.debug"));
            }
            if (c10.containsKey("com.webengage.sdk.android.crash_tracking")) {
                builder.b(c10.getBoolean("com.webengage.sdk.android.crash_tracking"));
            }
            if (c10.containsKey("com.webengage.sdk.android.encrypt_user_storage")) {
                builder.shouldEncryptUserStorage(c10.getBoolean("com.webengage.sdk.android.encrypt_user_storage"));
            }
            if (c10.containsKey("com.webengage.sdk.android.disable_first_acquisition_tracking") && c10.getBoolean("com.webengage.sdk.android.disable_first_acquisition_tracking")) {
                builder.disableFirstAcquisitionTracking();
            }
            a(c10);
        }
        return builder.build();
    }

    public static void engage(Context context) {
        engage(context, null);
    }

    public static AbstractWebEngage get() {
        synchronized (f30173g) {
            try {
                if (f30171e != null) {
                    return f30171e;
                }
                if (!f30174h) {
                    Logger.d("WebEngage", "Returning queued implementation of WebEngage");
                    if (f30172f == null) {
                        f30172f = new m2(new WebEngageConfig.Builder().build());
                    }
                    return f30172f;
                }
                Logger.d("WebEngage", "Returning no-op implementation of WebEngage");
                if (f30170d == null) {
                    f30170d = new WebEngageConfig.Builder().build();
                }
                f30171e = new p4(f30170d);
                return f30171e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Context getApplicationContext() {
        return f30168b;
    }

    public static boolean isEngaged() {
        boolean z10;
        synchronized (f30173g) {
            try {
                z10 = f30174h && f30171e != null && (f30171e instanceof WebEngage);
            } finally {
            }
        }
        return z10;
    }

    public static void registerCustomPushRenderCallback(CustomPushRender customPushRender) {
        x.a(customPushRender);
    }

    public static void registerCustomPushRerenderCallback(CustomPushRerender customPushRerender) {
        x.a(customPushRerender);
    }

    public static void registerInAppNotificationCallback(InAppNotificationCallbacks inAppNotificationCallbacks) {
        x.a(inAppNotificationCallbacks);
    }

    public static void registerLifeCycleCallback(LifeCycleCallbacks lifeCycleCallbacks) {
        x.b(lifeCycleCallbacks);
    }

    public static void registerNetworkInterceptor(WENetworkInterceptor wENetworkInterceptor) {
        x.a(wENetworkInterceptor);
    }

    public static void registerPushNotificationCallback(PushNotificationCallbacks pushNotificationCallbacks) {
        x.a(pushNotificationCallbacks);
    }

    public static void registerStateChangeCallback(StateChangeCallbacks stateChangeCallbacks) {
        if (isEngaged()) {
            x.a(stateChangeCallbacks, C2958f.a(f30168b), f30168b);
        } else {
            x.a(stateChangeCallbacks, null, null);
        }
    }

    public static void registerWESecurityCallback(WESecurityCallback wESecurityCallback) {
        x.a(wESecurityCallback);
    }

    public static void setInlinePersonalizationListener(InLinePersonalizationListener inLinePersonalizationListener) {
        Logger.d("WebEngage", " setInlinePersonalizationListener ");
        x.a(inLinePersonalizationListener);
    }

    public static void startService(Intent intent, Context context) {
        startService(intent, context, null);
    }

    public static void unregisterInAppNotificationCallback(InAppNotificationCallbacks inAppNotificationCallbacks) {
        x.b(inAppNotificationCallbacks);
    }

    public static void unregisterLifeCycleCallback(LifeCycleCallbacks lifeCycleCallbacks) {
        x.c(lifeCycleCallbacks);
    }

    public static void unregisterNetworkInterceptor() {
        x.b();
    }

    public static void unregisterPushNotificationCallback(PushNotificationCallbacks pushNotificationCallbacks) {
        x.b(pushNotificationCallbacks);
    }

    public static void unregisterStateChangeCallback(StateChangeCallbacks stateChangeCallbacks) {
        x.a(stateChangeCallbacks);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public Analytics analytics() {
        return C2958f.a(f30168b);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void c(BroadcastReceiver broadcastReceiver) {
        startService(l1.a(y3.f31169n, null, f30168b), f30168b, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void d(BroadcastReceiver broadcastReceiver) {
        Intent intent = new Intent(f30168b, (Class<?>) ExecutorService.class);
        intent.putExtra("action_name", 1);
        startService(intent, f30168b, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void filterCustomEvents(boolean z10) {
        f30170d = f30170d.getCurrentState().c(z10).build();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public String getCUID() {
        return analytics().a().d();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public String getSecurityToken(String str) {
        return analytics().a().c(str);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public String getWEInstanceID() {
        String r10 = get().analytics().a().r();
        return !TextUtils.isEmpty(r10) ? r10 : BuildConfig.FLAVOR;
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public WebEngageConfig getWebEngageConfig() {
        return f30170d;
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public boolean isAdvertisingIDTrackingEnabled() {
        if (getWebEngageConfig().isAutoGAIDTrackingEnabled()) {
            return true;
        }
        return analytics().a().u();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void receive(Intent intent) {
        if (intent == null) {
            Logger.e("WebEngage", "Push intent is null");
        } else {
            a(intent);
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public RuleExecutor ruleExecutor() {
        return u2.b();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setEventReportingStrategy(ReportingStrategy reportingStrategy) {
        if (reportingStrategy == null) {
            Logger.e("WebEngage", "Reporting Strategy is null");
        } else {
            f30170d = f30170d.getCurrentState().setEventReportingStrategy(reportingStrategy).build();
            f30169c.a(reportingStrategy);
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setEveryActivityIsScreen(boolean z10) {
        f30170d = f30170d.getCurrentState().setEveryActivityIsScreen(z10).build();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setHuaweiRegistrationID(String str) {
        if (str == null || str.isEmpty()) {
            Logger.e("WebEngage", "Invalid Huawei Token");
            return;
        }
        if (str.equals(analytics().a().f())) {
            return;
        }
        analytics().a().g(str);
        HashMap hashMap = new HashMap();
        hashMap.put("gcm_regId", str);
        hashMap.put("provider", Provider.HW.name());
        a(hashMap);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLocationTracking(boolean z10) {
        WebEngageConfig webEngageConfig = f30170d;
        if (webEngageConfig == null) {
            return;
        }
        try {
            f30170d = webEngageConfig.getCurrentState().setLocationTracking(z10).build();
            if (z10) {
                s1.a(f30168b).a(10800000L, 3600000L, 20000.0f, 104);
            } else {
                s1.a(f30168b).b();
            }
            f30169c.a(z10);
        } catch (Exception e10) {
            Logger.e("WebEngage", "Some error occurred during changing location tracking flag : " + e10.toString());
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLocationTrackingStrategy(LocationTrackingStrategy locationTrackingStrategy) {
        WebEngageConfig webEngageConfig = f30170d;
        if (webEngageConfig == null || locationTrackingStrategy == null) {
            return;
        }
        try {
            f30170d = webEngageConfig.getCurrentState().setLocationTrackingStrategy(locationTrackingStrategy).build();
            int i10 = a.f30176a[locationTrackingStrategy.ordinal()];
            if (i10 == 1) {
                s1.a(f30168b).a(900000L, 300000L, 1000.0f, 100);
            } else if (i10 == 2) {
                s1.a(f30168b).a(10800000L, 3600000L, 20000.0f, 104);
            } else if (i10 == 3) {
                s1.a(f30168b).a(43200000L, 43200000L, 100000.0f, 104);
            } else if (i10 == 4) {
                s1.a(f30168b).b();
            }
            f30169c.a(locationTrackingStrategy);
        } catch (Exception e10) {
            Logger.e("WebEngage", "Some error occurred while setting location tracking strategy: " + e10.toString());
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLogLevel(int i10) {
        Logger.setLogLevel(i10);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setRegistrationID(String str) {
        setRegistrationID(str, null);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setSecurityToken(String str, String str2) {
        analytics().a().a(str, str2);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setXiaomiRegistrationID(String str) {
        if (str == null || str.isEmpty()) {
            Logger.e("WebEngage", "Invalid Xiaomi Token");
            return;
        }
        if (str.equals(analytics().a().t())) {
            return;
        }
        analytics().a().k(str);
        HashMap hashMap = new HashMap();
        hashMap.put("gcm_regId", str);
        hashMap.put("provider", Provider.MI.name());
        a(hashMap);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void startGAIDTracking() {
        analytics().a().a(Boolean.TRUE);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public User user() {
        return d4.a(f30168b, analytics());
    }

    public static void engage(Context context, WebEngageConfig webEngageConfig) {
        Queue<v3> a10;
        if (context == null) {
            throw new IllegalArgumentException("Context found null while initializing WebEngage SDK");
        }
        if (f30171e == null) {
            synchronized (f30173g) {
                try {
                    if (f30171e == null) {
                        f30174h = true;
                        f30168b = context.getApplicationContext();
                        f30169c = new c0(f30168b);
                        Logger.setLogLevel(-1);
                        WebEngageConfig a11 = a(b(f30168b), webEngageConfig, f30169c);
                        f30170d = a11;
                        if (a11.getDebugMode()) {
                            Logger.setLogLevel(1);
                        } else {
                            Logger.setLogLevel(-1);
                        }
                        Logger.d("WebEngage", "Initializing WebEngage SDK");
                        if (f30170d.isValid(f30168b)) {
                            f30171e = new WebEngage(f30168b);
                        } else {
                            f30171e = new p4(f30170d);
                            Logger.e("WebEngage", "Invalid WebEngage config");
                            Logger.e("WebEngage", "WebEngage Initialization failed");
                        }
                        try {
                            m2 m2Var = f30172f;
                            if (m2Var != null && (a10 = m2Var.a()) != null && a10.size() > 0) {
                                Logger.d("WebEngage", "Executing tasks that have been submitted before webengage initialization, count: " + a10.size());
                                while (!a10.isEmpty()) {
                                    v3 poll = a10.poll();
                                    if (poll != null) {
                                        if (poll instanceof q4) {
                                            ((q4) poll).a(f30171e);
                                        } else if (poll instanceof C2962j) {
                                            ((C2962j) poll).a(C2958f.a(f30168b));
                                        } else if (poll instanceof h4) {
                                            Context context2 = f30168b;
                                            ((h4) poll).a(d4.a(context2, C2958f.a(context2)));
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            Logger.e("WebEngage", "Some error occurred while executing all queued tasks: " + e10.toString());
                        }
                    }
                } catch (Exception e11) {
                    Logger.e("WebEngage", "Some Error occurred during initialization : " + e11.toString());
                    Logger.e("WebEngage", "WebEngage Initialization Failed");
                } finally {
                }
            }
        }
    }

    public static void startService(Intent intent, Context context, BroadcastReceiver broadcastReceiver) {
        if (context == null || intent == null) {
            Logger.e("WebEngage", "Invalid Parameters to start a service");
        } else {
            x4.b(context, intent, broadcastReceiver);
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(BroadcastReceiver broadcastReceiver) {
        startService(l1.a(y3.f31170o, null, f30168b), f30168b, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void b(BroadcastReceiver broadcastReceiver) {
        startService(l1.a(y3.f31160e, null, f30168b), f30168b, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void c(Intent intent) {
        Map<String, Object> map;
        Map<String, Object> map2;
        HashMap hashMap;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("id");
            String string2 = extras.getString("experiment_id");
            hashMap = new HashMap();
            hashMap.put("id", string);
            hashMap.put("experiment_id", string2);
            map2 = WebEngageUtils.a(extras.getBundle("event_data"));
            map = WebEngageUtils.a(extras.getBundle("extra_data"));
        } else {
            map = null;
            map2 = null;
            hashMap = null;
        }
        startService(l1.a(y3.f31164i, n0.b("we_wk_progress_bar_push_notification_rerender", hashMap, map2, map, f30168b), f30168b), f30168b, null);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void d(Intent intent) {
        Map<String, Object> map;
        Map<String, Object> map2;
        HashMap hashMap;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("id");
            String string2 = extras.getString("experiment_id");
            hashMap = new HashMap();
            hashMap.put("id", string);
            hashMap.put("experiment_id", string2);
            map2 = WebEngageUtils.a(extras.getBundle("event_data"));
            map = WebEngageUtils.a(extras.getBundle("extra_data"));
        } else {
            map = null;
            map2 = null;
            hashMap = null;
        }
        startService(l1.a(y3.f31164i, n0.b("we_wk_push_notification_rerender", hashMap, map2, map, f30168b), f30168b), f30168b, null);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void receive(Bundle bundle) {
        if (bundle == null) {
            Logger.e("WebEngage", "Push bundle is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtras(bundle);
        receive(intent);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setRegistrationID(String str, String str2) {
        if (str == null || str.isEmpty()) {
            Logger.e("WebEngage", "Invalid GCM Parameters");
            return;
        }
        if (str.equals(analytics().a().i())) {
            return;
        }
        analytics().a().h(str);
        f30170d = f30170d.getCurrentState().setGCMProjectNumber(str2).build();
        HashMap hashMap = new HashMap();
        hashMap.put("gcm_regId", str);
        if (str2 != null) {
            hashMap.put("gcm_project_number", str2);
        }
        hashMap.put("provider", Provider.FCM.name());
        a(hashMap);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setXiaomiRegistrationID(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Logger.e("WebEngage", "Invalid Xiaomi Token or region");
            return;
        }
        if (str.equals(analytics().a().t()) && str2.equalsIgnoreCase(analytics().a().s())) {
            return;
        }
        analytics().a().k(str);
        analytics().a().j(str2);
        HashMap hashMap = new HashMap();
        hashMap.put("gcm_regId", str);
        hashMap.put("provider", Provider.MI.name());
        hashMap.put("region", str2);
        a(hashMap);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(BroadcastReceiver broadcastReceiver, HashSet<String> hashSet) {
        startService(l1.a(y3.f31168m, hashSet, f30168b), f30168b, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void b(Intent intent) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", Boolean.TRUE);
        startService(l1.a(y3.f31164i, n0.b("we_wk_leave_intent", null, hashMap, null, f30168b), f30168b), f30168b);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void c(Intent intent, BroadcastReceiver broadcastReceiver) {
        long longExtra = intent.getLongExtra("delay_value", 0L);
        HashMap hashMap = new HashMap();
        hashMap.put("value", Long.valueOf(longExtra + 1));
        startService(l1.a(y3.f31164i, n0.b("we_wk_session_delay", null, hashMap, null, f30168b), f30168b), f30168b, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void receive(Map<String, String> map) {
        if (map == null) {
            Logger.e("WebEngage", "Push data is null");
            return;
        }
        Bundle a10 = WebEngageUtils.a(map);
        if (a10 != null) {
            receive(a10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(Context context) {
        boolean z10;
        boolean z11;
        try {
            boolean deleteSharedPreferences = context.deleteSharedPreferences("webengage_prefs.txt");
            boolean z12 = true;
            if (!context.deleteSharedPreferences("webengage_volatile_prefs.txt") && !deleteSharedPreferences) {
                z10 = false;
                if (!m0.a(context) && !z10) {
                    z11 = false;
                    if (!com.webengage.sdk.android.actions.database.e.a(context) && !z11) {
                        z12 = false;
                    }
                    if (!com.webengage.sdk.android.utils.http.b.a(context) || z12) {
                        Logger.w("WebEngage", "Deleted all saved data");
                    }
                    return;
                }
                z11 = true;
                if (!com.webengage.sdk.android.actions.database.e.a(context)) {
                    z12 = false;
                }
                if (com.webengage.sdk.android.utils.http.b.a(context)) {
                }
                Logger.w("WebEngage", "Deleted all saved data");
            }
            z10 = true;
            if (!m0.a(context)) {
                z11 = false;
                if (!com.webengage.sdk.android.actions.database.e.a(context)) {
                }
                if (com.webengage.sdk.android.utils.http.b.a(context)) {
                }
                Logger.w("WebEngage", "Deleted all saved data");
            }
            z11 = true;
            if (!com.webengage.sdk.android.actions.database.e.a(context)) {
            }
            if (com.webengage.sdk.android.utils.http.b.a(context)) {
            }
            Logger.w("WebEngage", "Deleted all saved data");
        } catch (Exception e10) {
            Logger.e("WebEngage", "Some error occurred while clearing data", e10);
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void b(Intent intent, BroadcastReceiver broadcastReceiver) {
        long longExtra = intent.getLongExtra("delay_value", 0L);
        HashMap hashMap = new HashMap();
        hashMap.put("value", Long.valueOf(longExtra + 1));
        startService(l1.a(y3.f31164i, n0.b("we_wk_page_delay", null, hashMap, null, f30168b), f30168b), f30168b, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(Intent intent) {
        startService(l1.a(y3.f31159d, intent.getExtras(), f30168b), f30168b);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:7:0x0012, B:9:0x0018, B:17:0x001e, B:19:0x003a, B:21:0x0040, B:23:0x0064, B:25:0x006a, B:27:0x0070, B:29:0x0076, B:32:0x0091, B:34:0x0082, B:117:0x0058), top: B:6:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239  */
    @Override // com.webengage.sdk.android.AbstractWebEngage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void a(Intent intent, BroadcastReceiver broadcastReceiver) {
        String str;
        PushNotificationData pushNotificationData;
        boolean containsKey;
        Object obj;
        boolean z10;
        Intent a10;
        Context context;
        boolean onPushNotificationActionClicked;
        CallToAction callToActionById;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    try {
                        if (extras.containsKey("hashed_notification_id")) {
                            try {
                                pushNotificationData = new PushNotificationData(new JSONObject(analytics().a().d(extras.getString("id"))), f30168b);
                                try {
                                    if (pushNotificationData.getTestingDetails() != null) {
                                        DataHolder.get().a("in_app_testing_data", pushNotificationData.getTestingDetails());
                                    }
                                } catch (JSONException e10) {
                                    e = e10;
                                    Logger.e("WebEngage", "Exception while getting push notification data from sharedprefs", e);
                                    analytics().b(e);
                                    containsKey = extras.containsKey("notification_main_intent");
                                    if (pushNotificationData != null) {
                                    }
                                    str = "WebEngage";
                                    if (!containsKey) {
                                    }
                                    return;
                                }
                            } catch (JSONException e11) {
                                e = e11;
                                pushNotificationData = null;
                            }
                            containsKey = extras.containsKey("notification_main_intent");
                            if (pushNotificationData != null) {
                                this.f30175a = Boolean.valueOf(!(pushNotificationData.getTimerStyleData() == null || pushNotificationData.getStyle() == null || !WebEngageConstant.STYLE.PROGRESS_BAR.equals(pushNotificationData.getStyle())) || WebEngageConstant.STYLE.BIG_TIMER.equals(pushNotificationData.getStyle()));
                            }
                            str = "WebEngage";
                            if (!containsKey) {
                                try {
                                    boolean z11 = extras.getBoolean("dismiss_flag", true);
                                    if (z11) {
                                        obj = "amplified";
                                        if (this.f30175a.booleanValue()) {
                                            if (pushNotificationData != null && WebEngageConstant.STYLE.PROGRESS_BAR.equals(pushNotificationData.getStyle())) {
                                                ((AlarmManager) f30168b.getSystemService("alarm")).cancel(PendingIntentFactory.constructProgressBarRerenderPendingIntent(f30168b, pushNotificationData, "progressbar_update", null));
                                            }
                                            analytics().a().f("PREVIOUS_PROGRESS_NOTIFICATION_ID");
                                            f30168b.stopService(new Intent(f30168b, (Class<?>) TimerService.class));
                                        }
                                        ((NotificationManager) f30168b.getSystemService("notification")).cancel(extras.getInt("hashed_notification_id", -1));
                                    } else {
                                        obj = "amplified";
                                    }
                                    if (Build.VERSION.SDK_INT < 31) {
                                        f30168b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                                    }
                                    String string = extras.containsKey(Keys.EVENT) ? extras.getString(Keys.EVENT) : "push_notification_click";
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("id", extras.getString("id"));
                                    hashMap.put("call_to_action", extras.getString("call_to_action"));
                                    hashMap.put("experiment_id", extras.getString("experiment_id"));
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("dismiss_flag", Boolean.valueOf(z11));
                                    Map a11 = WebEngageUtils.a(extras.getBundle("event_data"));
                                    if (pushNotificationData != null) {
                                        if (a11 == null) {
                                            a11 = new HashMap();
                                        }
                                        a11.put(obj, Boolean.valueOf(pushNotificationData.isAmplified()));
                                        if (!TextUtils.isEmpty(pushNotificationData.getCollapseKey())) {
                                            hashMap2.put("collapseKey", pushNotificationData.getCollapseKey());
                                        }
                                    }
                                    analytics().a(n0.b(string, hashMap, a11, hashMap2, f30168b));
                                    if (pushNotificationData != null) {
                                        if (extras.getBoolean("notification_main_intent")) {
                                            onPushNotificationActionClicked = x.a(f30168b).onPushNotificationClicked(f30168b, pushNotificationData);
                                        } else if (extras.getBoolean("notification_main_intent")) {
                                            z10 = false;
                                            if (!z10 && n2.b()) {
                                                String string2 = extras.getString("call_to_action");
                                                Bundle customData = pushNotificationData.getCustomData();
                                                customData.putString("we_pushPayload", pushNotificationData.getPushPayloadJSON().toString());
                                                n2.a("com.webengage.cordova.WebEngagePlugin", "handlePushClick", new Class[]{String.class, Bundle.class}, new Object[]{(string2 != null || (callToActionById = pushNotificationData.getCallToActionById(string2)) == null) ? null : callToActionById.getAction(), customData});
                                            }
                                        } else {
                                            if ("push_notification_rating_submitted".equals(string)) {
                                                pushNotificationData.getRatingV1().setRateValue(((Integer) a11.get("we_wk_rating")).intValue());
                                            }
                                            onPushNotificationActionClicked = x.a(f30168b).onPushNotificationActionClicked(f30168b, pushNotificationData, extras.getString("call_to_action"));
                                        }
                                        z10 = onPushNotificationActionClicked;
                                        if (!z10) {
                                            String string22 = extras.getString("call_to_action");
                                            Bundle customData2 = pushNotificationData.getCustomData();
                                            customData2.putString("we_pushPayload", pushNotificationData.getPushPayloadJSON().toString());
                                            n2.a("com.webengage.cordova.WebEngagePlugin", "handlePushClick", new Class[]{String.class, Bundle.class}, new Object[]{(string22 != null || (callToActionById = pushNotificationData.getCallToActionById(string22)) == null) ? null : callToActionById.getAction(), customData2});
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        a10 = l1.a(y3.f31162g, intent, f30168b);
                                        context = f30168b;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    Logger.e(str, "Exception while handling notification click/close", e);
                                    return;
                                }
                            } else if (pushNotificationData != null) {
                                if (this.f30175a.booleanValue()) {
                                    if (WebEngageConstant.STYLE.PROGRESS_BAR.equals(pushNotificationData.getStyle())) {
                                        ((AlarmManager) f30168b.getSystemService("alarm")).cancel(PendingIntentFactory.constructProgressBarRerenderPendingIntent(f30168b, pushNotificationData, "progressbar_update", null));
                                    }
                                    analytics().a().f("PREVIOUS_PROGRESS_NOTIFICATION_ID");
                                    f30168b.stopService(new Intent(f30168b, (Class<?>) TimerService.class));
                                }
                                HashMap hashMap3 = new HashMap();
                                if (!TextUtils.isEmpty(pushNotificationData.getCollapseKey())) {
                                    hashMap3.put("collapseKey", pushNotificationData.getCollapseKey());
                                }
                                ((NotificationManager) f30168b.getSystemService("notification")).cancel(extras.getInt("hashed_notification_id", -1));
                                HashMap hashMap4 = new HashMap();
                                hashMap4.put("id", pushNotificationData.getVariationId());
                                hashMap4.put("experiment_id", pushNotificationData.getExperimentId());
                                if (extras.containsKey("call_to_action")) {
                                    hashMap4.put("call_to_action", extras.getString("call_to_action"));
                                }
                                HashMap hashMap5 = new HashMap();
                                hashMap5.put("amplified", Boolean.valueOf(pushNotificationData.isAmplified()));
                                analytics().a(n0.b("push_notification_close", hashMap4, hashMap5, hashMap3, f30168b));
                                x.a(f30168b).onPushNotificationDismissed(f30168b, pushNotificationData);
                                return;
                            }
                            return;
                        }
                        a10 = l1.a(y3.f31162g, intent, f30168b);
                        context = f30168b;
                        startService(a10, context, broadcastReceiver);
                    } catch (Exception e13) {
                        e = e13;
                    }
                }
            } catch (Exception e14) {
                e = e14;
                str = "WebEngage";
            }
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(Location location, BroadcastReceiver broadcastReceiver) {
        HashMap hashMap = new HashMap();
        hashMap.put(AppConstants.LATITUDE, Double.valueOf(location.getLatitude()));
        hashMap.put(AppConstants.LONGITUDE, Double.valueOf(location.getLongitude()));
        startService(l1.a(y3.f31158c, n0.b("user_update_geo_info", hashMap, null, null, f30168b), f30168b), f30168b, broadcastReceiver);
    }

    private static void a(Bundle bundle) {
        Set<String> keySet = bundle.keySet();
        StringBuilder sb2 = new StringBuilder();
        for (String str : keySet) {
            if (str.contains("com.webengage.child")) {
                sb2.append(bundle.getString(str));
                sb2.append(";");
            }
        }
        if (sb2.toString().isEmpty()) {
            return;
        }
        DataHolder.get().j(sb2.substring(0, sb2.length() - 1));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(t1.a aVar, BroadcastReceiver broadcastReceiver) {
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("geofence_id", aVar.a());
            hashMap.put("transition_type", Integer.valueOf(aVar.c()));
            if (aVar.b() != null) {
                hashMap.put(AppConstants.LATITUDE, Double.valueOf(aVar.b().getLatitude()));
                hashMap.put(AppConstants.LONGITUDE, Double.valueOf(aVar.b().getLongitude()));
            }
            startService(l1.a(y3.f31158c, n0.b("geofence_transition", hashMap, null, null, f30168b), f30168b), f30168b, broadcastReceiver);
        }
    }

    private void a(Map<String, Object> map) {
        startService(l1.a(y3.f31158c, n0.b("gcm_registered", null, map, null, f30168b), f30168b), f30168b);
    }
}
