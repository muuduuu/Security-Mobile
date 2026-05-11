package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.actions.rules.RuleExecutor;
import com.webengage.sdk.android.t1;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AbstractWebEngage {
    protected abstract void a(BroadcastReceiver broadcastReceiver);

    protected abstract void a(BroadcastReceiver broadcastReceiver, HashSet<String> hashSet);

    protected abstract void a(Intent intent);

    protected abstract void a(Intent intent, BroadcastReceiver broadcastReceiver);

    protected abstract void a(Location location, BroadcastReceiver broadcastReceiver);

    protected abstract void a(t1.a aVar, BroadcastReceiver broadcastReceiver);

    public abstract Analytics analytics();

    protected abstract void b(BroadcastReceiver broadcastReceiver);

    protected abstract void b(Intent intent);

    protected abstract void b(Intent intent, BroadcastReceiver broadcastReceiver);

    protected abstract void c(BroadcastReceiver broadcastReceiver);

    protected abstract void c(Intent intent);

    protected abstract void c(Intent intent, BroadcastReceiver broadcastReceiver);

    protected abstract void d(BroadcastReceiver broadcastReceiver);

    protected abstract void d(Intent intent);

    public abstract void filterCustomEvents(boolean z10);

    public abstract String getCUID();

    public abstract String getSecurityToken(String str);

    public abstract String getWEInstanceID();

    public abstract WebEngageConfig getWebEngageConfig();

    public abstract boolean isAdvertisingIDTrackingEnabled();

    public abstract void receive(Intent intent);

    public abstract void receive(Bundle bundle);

    public abstract void receive(Map<String, String> map);

    public abstract RuleExecutor ruleExecutor();

    public abstract void setEventReportingStrategy(ReportingStrategy reportingStrategy);

    public abstract void setEveryActivityIsScreen(boolean z10);

    public abstract void setHuaweiRegistrationID(String str);

    @Deprecated
    public abstract void setLocationTracking(boolean z10);

    public abstract void setLocationTrackingStrategy(LocationTrackingStrategy locationTrackingStrategy);

    public abstract void setLogLevel(int i10);

    public abstract void setRegistrationID(String str);

    @Deprecated
    public abstract void setRegistrationID(String str, String str2);

    public abstract void setSecurityToken(String str, String str2);

    @Deprecated
    public abstract void setXiaomiRegistrationID(String str);

    public abstract void setXiaomiRegistrationID(String str, String str2);

    public abstract void startGAIDTracking();

    public abstract User user();
}
