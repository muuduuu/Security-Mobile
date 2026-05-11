package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import e7.InterfaceC3089a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2374v0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(InterfaceC2401y0 interfaceC2401y0);

    void getAppInstanceId(InterfaceC2401y0 interfaceC2401y0);

    void getCachedAppInstanceId(InterfaceC2401y0 interfaceC2401y0);

    void getConditionalUserProperties(String str, String str2, InterfaceC2401y0 interfaceC2401y0);

    void getCurrentScreenClass(InterfaceC2401y0 interfaceC2401y0);

    void getCurrentScreenName(InterfaceC2401y0 interfaceC2401y0);

    void getGmpAppId(InterfaceC2401y0 interfaceC2401y0);

    void getMaxUserProperties(String str, InterfaceC2401y0 interfaceC2401y0);

    void getSessionId(InterfaceC2401y0 interfaceC2401y0);

    void getTestFlag(InterfaceC2401y0 interfaceC2401y0, int i10);

    void getUserProperties(String str, String str2, boolean z10, InterfaceC2401y0 interfaceC2401y0);

    void initForTests(Map map);

    void initialize(InterfaceC3089a interfaceC3089a, H0 h02, long j10);

    void isDataCollectionEnabled(InterfaceC2401y0 interfaceC2401y0);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2401y0 interfaceC2401y0, long j10);

    void logHealthData(int i10, String str, InterfaceC3089a interfaceC3089a, InterfaceC3089a interfaceC3089a2, InterfaceC3089a interfaceC3089a3);

    void onActivityCreated(InterfaceC3089a interfaceC3089a, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(J0 j02, Bundle bundle, long j10);

    void onActivityDestroyed(InterfaceC3089a interfaceC3089a, long j10);

    void onActivityDestroyedByScionActivityInfo(J0 j02, long j10);

    void onActivityPaused(InterfaceC3089a interfaceC3089a, long j10);

    void onActivityPausedByScionActivityInfo(J0 j02, long j10);

    void onActivityResumed(InterfaceC3089a interfaceC3089a, long j10);

    void onActivityResumedByScionActivityInfo(J0 j02, long j10);

    void onActivitySaveInstanceState(InterfaceC3089a interfaceC3089a, InterfaceC2401y0 interfaceC2401y0, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(J0 j02, InterfaceC2401y0 interfaceC2401y0, long j10);

    void onActivityStarted(InterfaceC3089a interfaceC3089a, long j10);

    void onActivityStartedByScionActivityInfo(J0 j02, long j10);

    void onActivityStopped(InterfaceC3089a interfaceC3089a, long j10);

    void onActivityStoppedByScionActivityInfo(J0 j02, long j10);

    void performAction(Bundle bundle, InterfaceC2401y0 interfaceC2401y0, long j10);

    void registerOnMeasurementEventListener(E0 e02);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(B0 b02);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(InterfaceC3089a interfaceC3089a, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(J0 j02, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(E0 e02);

    void setInstanceIdProvider(G0 g02);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, InterfaceC3089a interfaceC3089a, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(E0 e02);
}
