package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.actions.rules.RuleExecutor;
import com.webengage.sdk.android.t1;
import com.webengage.sdk.android.utils.Provider;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
class m2 extends AbstractWebEngage {

    /* renamed from: a, reason: collision with root package name */
    private WebEngageConfig f30723a;

    /* renamed from: b, reason: collision with root package name */
    private Queue<v3> f30724b;

    m2(WebEngageConfig webEngageConfig) {
        this.f30724b = null;
        this.f30723a = webEngageConfig;
        this.f30724b = new LinkedList();
    }

    protected Queue<v3> a() {
        return this.f30724b;
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public Analytics analytics() {
        return C2958f.a(this.f30724b);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void b(BroadcastReceiver broadcastReceiver) {
        this.f30724b.add(new q4(11, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void c(BroadcastReceiver broadcastReceiver) {
        this.f30724b.add(new q4(10, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void d(BroadcastReceiver broadcastReceiver) {
        this.f30724b.add(new q4(9, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void filterCustomEvents(boolean z10) {
        this.f30724b.add(new q4(3, Boolean.valueOf(z10)));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public String getCUID() {
        return analytics().a().d();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public String getSecurityToken(String str) {
        return BuildConfig.FLAVOR;
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public String getWEInstanceID() {
        return analytics().a().r();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public WebEngageConfig getWebEngageConfig() {
        return this.f30723a;
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public boolean isAdvertisingIDTrackingEnabled() {
        return analytics().a().u();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void receive(Intent intent) {
        if (intent == null) {
            Logger.e("WebEngage", "Intent is null");
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
        this.f30724b.add(new q4(2, reportingStrategy));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setEveryActivityIsScreen(boolean z10) {
        this.f30724b.add(new q4(4, Boolean.valueOf(z10)));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setHuaweiRegistrationID(String str) {
        this.f30724b.add(new q4(5, str, null, Provider.HW.name()));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLocationTracking(boolean z10) {
        this.f30724b.add(new q4(0, Boolean.valueOf(z10)));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLocationTrackingStrategy(LocationTrackingStrategy locationTrackingStrategy) {
        this.f30724b.add(new q4(19, locationTrackingStrategy));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLogLevel(int i10) {
        this.f30724b.add(new q4(1, Integer.valueOf(i10)));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setRegistrationID(String str) {
        setRegistrationID(str, null);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setSecurityToken(String str, String str2) {
        this.f30724b.add(new q4(20, str, str2));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setXiaomiRegistrationID(String str) {
        this.f30724b.add(new q4(5, str, null, Provider.MI.name()));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void startGAIDTracking() {
        this.f30724b.add(new q4(21, new Object[0]));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public User user() {
        return d4.a(this.f30724b);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(BroadcastReceiver broadcastReceiver) {
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void b(Intent intent) {
        this.f30724b.add(new q4(14, intent));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void c(Intent intent) {
        this.f30724b.add(new q4(17, intent, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void d(Intent intent) {
        this.f30724b.add(new q4(17, intent, null));
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
        this.f30724b.add(new q4(5, str, str2, Provider.FCM.name()));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setXiaomiRegistrationID(String str, String str2) {
        this.f30724b.add(new q4(5, str, null, Provider.MI.name(), str2));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(BroadcastReceiver broadcastReceiver, HashSet<String> hashSet) {
        this.f30724b.add(new q4(16, hashSet));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void b(Intent intent, BroadcastReceiver broadcastReceiver) {
        this.f30724b.add(new q4(13, intent, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void c(Intent intent, BroadcastReceiver broadcastReceiver) {
        this.f30724b.add(new q4(12, intent, null));
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

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(Intent intent) {
        this.f30724b.add(new q4(6, intent));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(Intent intent, BroadcastReceiver broadcastReceiver) {
        this.f30724b.add(new q4(7, intent, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(Location location, BroadcastReceiver broadcastReceiver) {
        this.f30724b.add(new q4(8, location, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    protected void a(t1.a aVar, BroadcastReceiver broadcastReceiver) {
        this.f30724b.add(new q4(15, aVar, null));
    }
}
