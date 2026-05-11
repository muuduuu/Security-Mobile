package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import e7.InterfaceC3089a;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2365u0 extends P implements InterfaceC2374v0 {
    public AbstractBinderC2365u0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC2374v0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof InterfaceC2374v0 ? (InterfaceC2374v0) queryLocalInterface : new C2356t0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2401y0 c2383w0;
        InterfaceC2401y0 interfaceC2401y0 = null;
        B0 b02 = null;
        InterfaceC2401y0 interfaceC2401y02 = null;
        InterfaceC2401y0 interfaceC2401y03 = null;
        InterfaceC2401y0 interfaceC2401y04 = null;
        InterfaceC2401y0 interfaceC2401y05 = null;
        E0 e02 = null;
        E0 e03 = null;
        E0 e04 = null;
        InterfaceC2401y0 interfaceC2401y06 = null;
        InterfaceC2401y0 interfaceC2401y07 = null;
        InterfaceC2401y0 interfaceC2401y08 = null;
        InterfaceC2401y0 interfaceC2401y09 = null;
        InterfaceC2401y0 interfaceC2401y010 = null;
        InterfaceC2401y0 interfaceC2401y011 = null;
        G0 g02 = null;
        InterfaceC2401y0 interfaceC2401y012 = null;
        InterfaceC2401y0 interfaceC2401y013 = null;
        InterfaceC2401y0 interfaceC2401y014 = null;
        InterfaceC2401y0 interfaceC2401y015 = null;
        switch (i10) {
            case 1:
                InterfaceC3089a k12 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                H0 h02 = (H0) Q.b(parcel, H0.CREATOR);
                long readLong = parcel.readLong();
                Q.f(parcel);
                initialize(k12, h02, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) Q.b(parcel, Bundle.CREATOR);
                boolean a10 = Q.a(parcel);
                boolean a11 = Q.a(parcel);
                long readLong2 = parcel.readLong();
                Q.f(parcel);
                logEvent(readString, readString2, bundle, a10, a11, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c2383w0 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2383w0 = queryLocalInterface instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface : new C2383w0(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                Q.f(parcel);
                logEventAndBundle(readString3, readString4, bundle2, c2383w0, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                InterfaceC3089a k13 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                boolean a12 = Q.a(parcel);
                long readLong4 = parcel.readLong();
                Q.f(parcel);
                setUserProperty(readString5, readString6, k13, a12, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean a13 = Q.a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y0 = queryLocalInterface2 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface2 : new C2383w0(readStrongBinder2);
                }
                Q.f(parcel);
                getUserProperties(readString7, readString8, a13, interfaceC2401y0);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y015 = queryLocalInterface3 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface3 : new C2383w0(readStrongBinder3);
                }
                Q.f(parcel);
                getMaxUserProperties(readString9, interfaceC2401y015);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                Q.f(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                Q.f(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                Q.f(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y014 = queryLocalInterface4 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface4 : new C2383w0(readStrongBinder4);
                }
                Q.f(parcel);
                getConditionalUserProperties(readString13, readString14, interfaceC2401y014);
                break;
            case 11:
                boolean a14 = Q.a(parcel);
                long readLong7 = parcel.readLong();
                Q.f(parcel);
                setMeasurementEnabled(a14, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                Q.f(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                Q.f(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                long readLong10 = parcel.readLong();
                Q.f(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                InterfaceC3089a k14 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                Q.f(parcel);
                setCurrentScreen(k14, readString15, readString16, readLong11);
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y013 = queryLocalInterface5 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface5 : new C2383w0(readStrongBinder5);
                }
                Q.f(parcel);
                getCurrentScreenName(interfaceC2401y013);
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y012 = queryLocalInterface6 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface6 : new C2383w0(readStrongBinder6);
                }
                Q.f(parcel);
                getCurrentScreenClass(interfaceC2401y012);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    g02 = queryLocalInterface7 instanceof G0 ? (G0) queryLocalInterface7 : new F0(readStrongBinder7);
                }
                Q.f(parcel);
                setInstanceIdProvider(g02);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y011 = queryLocalInterface8 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface8 : new C2383w0(readStrongBinder8);
                }
                Q.f(parcel);
                getCachedAppInstanceId(interfaceC2401y011);
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y010 = queryLocalInterface9 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface9 : new C2383w0(readStrongBinder9);
                }
                Q.f(parcel);
                getAppInstanceId(interfaceC2401y010);
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y09 = queryLocalInterface10 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface10 : new C2383w0(readStrongBinder10);
                }
                Q.f(parcel);
                getGmpAppId(interfaceC2401y09);
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y08 = queryLocalInterface11 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface11 : new C2383w0(readStrongBinder11);
                }
                Q.f(parcel);
                generateEventId(interfaceC2401y08);
                break;
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                Q.f(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                Q.f(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                InterfaceC3089a k15 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                Q.f(parcel);
                onActivityStarted(k15, readLong14);
                break;
            case 26:
                InterfaceC3089a k16 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                Q.f(parcel);
                onActivityStopped(k16, readLong15);
                break;
            case 27:
                InterfaceC3089a k17 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                Q.f(parcel);
                onActivityCreated(k17, bundle5, readLong16);
                break;
            case 28:
                InterfaceC3089a k18 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                Q.f(parcel);
                onActivityDestroyed(k18, readLong17);
                break;
            case 29:
                InterfaceC3089a k19 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                Q.f(parcel);
                onActivityPaused(k19, readLong18);
                break;
            case 30:
                InterfaceC3089a k110 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                Q.f(parcel);
                onActivityResumed(k110, readLong19);
                break;
            case HVError.INSTRUCTION_ERROR /* 31 */:
                InterfaceC3089a k111 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y07 = queryLocalInterface12 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface12 : new C2383w0(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                Q.f(parcel);
                onActivitySaveInstanceState(k111, interfaceC2401y07, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y06 = queryLocalInterface13 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface13 : new C2383w0(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                Q.f(parcel);
                performAction(bundle6, interfaceC2401y06, readLong21);
                break;
            case HVError.GPS_ACCESS_DENIED /* 33 */:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                InterfaceC3089a k112 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                InterfaceC3089a k113 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                InterfaceC3089a k114 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
                Q.f(parcel);
                logHealthData(readInt, readString19, k112, k113, k114);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e04 = queryLocalInterface14 instanceof E0 ? (E0) queryLocalInterface14 : new C0(readStrongBinder14);
                }
                Q.f(parcel);
                setEventInterceptor(e04);
                break;
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e03 = queryLocalInterface15 instanceof E0 ? (E0) queryLocalInterface15 : new C0(readStrongBinder15);
                }
                Q.f(parcel);
                registerOnMeasurementEventListener(e03);
                break;
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e02 = queryLocalInterface16 instanceof E0 ? (E0) queryLocalInterface16 : new C0(readStrongBinder16);
                }
                Q.f(parcel);
                unregisterOnMeasurementEventListener(e02);
                break;
            case HVError.INVALID_FILE_ERROR /* 37 */:
                HashMap e10 = Q.e(parcel);
                Q.f(parcel);
                initForTests(e10);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y05 = queryLocalInterface17 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface17 : new C2383w0(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                Q.f(parcel);
                getTestFlag(interfaceC2401y05, readInt2);
                break;
            case 39:
                boolean a15 = Q.a(parcel);
                Q.f(parcel);
                setDataCollectionEnabled(a15);
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y04 = queryLocalInterface18 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface18 : new C2383w0(readStrongBinder18);
                }
                Q.f(parcel);
                isDataCollectionEnabled(interfaceC2401y04);
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
            case 47:
            case 49:
            default:
                return false;
            case HVError.CONSENT_DENIED /* 42 */:
                Bundle bundle7 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                Q.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case HVError.ENCRYPTION_ERROR /* 43 */:
                long readLong22 = parcel.readLong();
                Q.f(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case HVError.SDK_CLOSE_ERROR /* 44 */:
                Bundle bundle8 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                Q.f(parcel);
                setConsent(bundle8, readLong23);
                break;
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                Bundle bundle9 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                Q.f(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y03 = queryLocalInterface19 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface19 : new C2383w0(readStrongBinder19);
                }
                Q.f(parcel);
                getSessionId(interfaceC2401y03);
                break;
            case 48:
                Intent intent = (Intent) Q.b(parcel, Intent.CREATOR);
                Q.f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                J0 j02 = (J0) Q.b(parcel, J0.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                Q.f(parcel);
                setCurrentScreenByScionActivityInfo(j02, readString20, readString21, readLong25);
                break;
            case 51:
                J0 j03 = (J0) Q.b(parcel, J0.CREATOR);
                long readLong26 = parcel.readLong();
                Q.f(parcel);
                onActivityStartedByScionActivityInfo(j03, readLong26);
                break;
            case 52:
                J0 j04 = (J0) Q.b(parcel, J0.CREATOR);
                long readLong27 = parcel.readLong();
                Q.f(parcel);
                onActivityStoppedByScionActivityInfo(j04, readLong27);
                break;
            case 53:
                J0 j05 = (J0) Q.b(parcel, J0.CREATOR);
                Bundle bundle10 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                Q.f(parcel);
                onActivityCreatedByScionActivityInfo(j05, bundle10, readLong28);
                break;
            case 54:
                J0 j06 = (J0) Q.b(parcel, J0.CREATOR);
                long readLong29 = parcel.readLong();
                Q.f(parcel);
                onActivityDestroyedByScionActivityInfo(j06, readLong29);
                break;
            case 55:
                J0 j07 = (J0) Q.b(parcel, J0.CREATOR);
                long readLong30 = parcel.readLong();
                Q.f(parcel);
                onActivityPausedByScionActivityInfo(j07, readLong30);
                break;
            case 56:
                J0 j08 = (J0) Q.b(parcel, J0.CREATOR);
                long readLong31 = parcel.readLong();
                Q.f(parcel);
                onActivityResumedByScionActivityInfo(j08, readLong31);
                break;
            case 57:
                J0 j09 = (J0) Q.b(parcel, J0.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC2401y02 = queryLocalInterface20 instanceof InterfaceC2401y0 ? (InterfaceC2401y0) queryLocalInterface20 : new C2383w0(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                Q.f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(j09, interfaceC2401y02, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    b02 = queryLocalInterface21 instanceof B0 ? (B0) queryLocalInterface21 : new C2410z0(readStrongBinder21);
                }
                Q.f(parcel);
                retrieveAndUploadBatches(b02);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
