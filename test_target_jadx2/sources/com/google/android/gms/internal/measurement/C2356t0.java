package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2356t0 extends O implements InterfaceC2374v0 {
    C2356t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeLong(j10);
        l1(23, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeString(str2);
        Q.c(k12, bundle);
        l1(9, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeLong(j10);
        l1(24, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void generateEventId(InterfaceC2401y0 interfaceC2401y0) {
        Parcel k12 = k1();
        Q.d(k12, interfaceC2401y0);
        l1(22, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void getAppInstanceId(InterfaceC2401y0 interfaceC2401y0) {
        Parcel k12 = k1();
        Q.d(k12, interfaceC2401y0);
        l1(20, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void getCachedAppInstanceId(InterfaceC2401y0 interfaceC2401y0) {
        Parcel k12 = k1();
        Q.d(k12, interfaceC2401y0);
        l1(19, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC2401y0 interfaceC2401y0) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeString(str2);
        Q.d(k12, interfaceC2401y0);
        l1(10, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void getCurrentScreenClass(InterfaceC2401y0 interfaceC2401y0) {
        Parcel k12 = k1();
        Q.d(k12, interfaceC2401y0);
        l1(17, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void getCurrentScreenName(InterfaceC2401y0 interfaceC2401y0) {
        Parcel k12 = k1();
        Q.d(k12, interfaceC2401y0);
        l1(16, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void getGmpAppId(InterfaceC2401y0 interfaceC2401y0) {
        Parcel k12 = k1();
        Q.d(k12, interfaceC2401y0);
        l1(21, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void getMaxUserProperties(String str, InterfaceC2401y0 interfaceC2401y0) {
        Parcel k12 = k1();
        k12.writeString(str);
        Q.d(k12, interfaceC2401y0);
        l1(6, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void getSessionId(InterfaceC2401y0 interfaceC2401y0) {
        Parcel k12 = k1();
        Q.d(k12, interfaceC2401y0);
        l1(46, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC2401y0 interfaceC2401y0) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeString(str2);
        int i10 = Q.f24335b;
        k12.writeInt(z10 ? 1 : 0);
        Q.d(k12, interfaceC2401y0);
        l1(5, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void initialize(InterfaceC3089a interfaceC3089a, H0 h02, long j10) {
        Parcel k12 = k1();
        Q.d(k12, interfaceC3089a);
        Q.c(k12, h02);
        k12.writeLong(j10);
        l1(1, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeString(str2);
        Q.c(k12, bundle);
        k12.writeInt(z10 ? 1 : 0);
        k12.writeInt(z11 ? 1 : 0);
        k12.writeLong(j10);
        l1(2, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void logHealthData(int i10, String str, InterfaceC3089a interfaceC3089a, InterfaceC3089a interfaceC3089a2, InterfaceC3089a interfaceC3089a3) {
        Parcel k12 = k1();
        k12.writeInt(5);
        k12.writeString(str);
        Q.d(k12, interfaceC3089a);
        Q.d(k12, interfaceC3089a2);
        Q.d(k12, interfaceC3089a3);
        l1(33, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void onActivityCreatedByScionActivityInfo(J0 j02, Bundle bundle, long j10) {
        Parcel k12 = k1();
        Q.c(k12, j02);
        Q.c(k12, bundle);
        k12.writeLong(j10);
        l1(53, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void onActivityDestroyedByScionActivityInfo(J0 j02, long j10) {
        Parcel k12 = k1();
        Q.c(k12, j02);
        k12.writeLong(j10);
        l1(54, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void onActivityPausedByScionActivityInfo(J0 j02, long j10) {
        Parcel k12 = k1();
        Q.c(k12, j02);
        k12.writeLong(j10);
        l1(55, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void onActivityResumedByScionActivityInfo(J0 j02, long j10) {
        Parcel k12 = k1();
        Q.c(k12, j02);
        k12.writeLong(j10);
        l1(56, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void onActivitySaveInstanceStateByScionActivityInfo(J0 j02, InterfaceC2401y0 interfaceC2401y0, long j10) {
        Parcel k12 = k1();
        Q.c(k12, j02);
        Q.d(k12, interfaceC2401y0);
        k12.writeLong(j10);
        l1(57, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void onActivityStartedByScionActivityInfo(J0 j02, long j10) {
        Parcel k12 = k1();
        Q.c(k12, j02);
        k12.writeLong(j10);
        l1(51, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void onActivityStoppedByScionActivityInfo(J0 j02, long j10) {
        Parcel k12 = k1();
        Q.c(k12, j02);
        k12.writeLong(j10);
        l1(52, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void resetAnalyticsData(long j10) {
        Parcel k12 = k1();
        k12.writeLong(j10);
        l1(12, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void retrieveAndUploadBatches(B0 b02) {
        Parcel k12 = k1();
        Q.d(k12, b02);
        l1(58, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel k12 = k1();
        Q.c(k12, bundle);
        k12.writeLong(j10);
        l1(8, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel k12 = k1();
        Q.c(k12, bundle);
        k12.writeLong(j10);
        l1(45, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void setCurrentScreenByScionActivityInfo(J0 j02, String str, String str2, long j10) {
        Parcel k12 = k1();
        Q.c(k12, j02);
        k12.writeString(str);
        k12.writeString(str2);
        k12.writeLong(j10);
        l1(50, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel k12 = k1();
        int i10 = Q.f24335b;
        k12.writeInt(z10 ? 1 : 0);
        l1(39, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel k12 = k1();
        Q.c(k12, bundle);
        l1(42, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel k12 = k1();
        int i10 = Q.f24335b;
        k12.writeInt(z10 ? 1 : 0);
        k12.writeLong(j10);
        l1(11, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void setSessionTimeoutDuration(long j10) {
        Parcel k12 = k1();
        k12.writeLong(j10);
        l1(14, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void setUserId(String str, long j10) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeLong(j10);
        l1(7, k12);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2374v0
    public final void setUserProperty(String str, String str2, InterfaceC3089a interfaceC3089a, boolean z10, long j10) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeString(str2);
        Q.d(k12, interfaceC3089a);
        k12.writeInt(z10 ? 1 : 0);
        k12.writeLong(j10);
        l1(4, k12);
    }
}
