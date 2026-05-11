package com.google.android.gms.measurement;

import V6.AbstractC1287s;
import android.content.Context;
import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.measurement.internal.C2760q3;
import com.google.android.gms.measurement.internal.InterfaceC2650c5;
import com.google.android.gms.measurement.internal.W3;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f25273b;

    /* renamed from: a, reason: collision with root package name */
    private final c f25274a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            AbstractC1287s.m(bundle);
            this.mAppId = (String) W3.b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) W3.b(bundle, "origin", String.class, null);
            this.mName = (String) W3.b(bundle, "name", String.class, null);
            this.mValue = W3.b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) W3.b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) W3.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) W3.b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) W3.b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) W3.b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) W3.b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) W3.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) W3.b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) W3.b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) W3.b(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) W3.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) W3.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C2760q3 c2760q3) {
        this.f25274a = new a(c2760q3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f25273b == null) {
            synchronized (AppMeasurement.class) {
                if (f25273b == null) {
                    InterfaceC2650c5 interfaceC2650c5 = (InterfaceC2650c5) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC2650c5 != null) {
                        f25273b = new AppMeasurement(interfaceC2650c5);
                    } else {
                        f25273b = new AppMeasurement(C2760q3.O(context, new H0(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f25273b;
    }

    public void beginAdUnitExposure(String str) {
        this.f25274a.e(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f25274a.f(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f25274a.c(str);
    }

    public long generateEventId() {
        return this.f25274a.y();
    }

    public String getAppInstanceId() {
        return this.f25274a.r();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List g10 = this.f25274a.g(str, str2);
        ArrayList arrayList = new ArrayList(g10 == null ? 0 : g10.size());
        Iterator it = g10.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f25274a.l();
    }

    public String getCurrentScreenName() {
        return this.f25274a.d();
    }

    public String getGmpAppId() {
        return this.f25274a.u();
    }

    public int getMaxUserProperties(String str) {
        return this.f25274a.h(str);
    }

    protected Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f25274a.i(str, str2, z10);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f25274a.a(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC1287s.m(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            W3.a(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        c cVar = this.f25274a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.b(bundle);
    }

    public AppMeasurement(InterfaceC2650c5 interfaceC2650c5) {
        this.f25274a = new b(interfaceC2650c5);
    }
}
