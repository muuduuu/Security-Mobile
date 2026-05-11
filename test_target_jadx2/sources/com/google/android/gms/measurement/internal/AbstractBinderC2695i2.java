package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2695i2 extends com.google.android.gms.internal.measurement.P implements InterfaceC2703j2 {
    public AbstractBinderC2695i2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2751p2 interfaceC2751p2 = null;
        InterfaceC2727m2 interfaceC2727m2 = null;
        switch (i10) {
            case 1:
                I i12 = (I) com.google.android.gms.internal.measurement.Q.b(parcel, I.CREATOR);
                n7 n7Var = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                W(i12, n7Var);
                parcel2.writeNoException();
                return true;
            case 2:
                h7 h7Var = (h7) com.google.android.gms.internal.measurement.Q.b(parcel, h7.CREATOR);
                n7 n7Var2 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                j0(h7Var, n7Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case 28:
            default:
                return false;
            case 4:
                n7 n7Var3 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                E0(n7Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                I i13 = (I) com.google.android.gms.internal.measurement.Q.b(parcel, I.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.Q.f(parcel);
                r(i13, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                n7 n7Var4 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                X(n7Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                n7 n7Var5 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                boolean a10 = com.google.android.gms.internal.measurement.Q.a(parcel);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                List f12 = f1(n7Var5, a10);
                parcel2.writeNoException();
                parcel2.writeTypedList(f12);
                return true;
            case 9:
                I i14 = (I) com.google.android.gms.internal.measurement.Q.b(parcel, I.CREATOR);
                String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.Q.f(parcel);
                byte[] e02 = e0(i14, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(e02);
                return true;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.Q.f(parcel);
                z(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                n7 n7Var6 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                String V02 = V0(n7Var6);
                parcel2.writeNoException();
                parcel2.writeString(V02);
                return true;
            case 12:
                C2692i c2692i = (C2692i) com.google.android.gms.internal.measurement.Q.b(parcel, C2692i.CREATOR);
                n7 n7Var7 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                l(c2692i, n7Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                C2692i c2692i2 = (C2692i) com.google.android.gms.internal.measurement.Q.b(parcel, C2692i.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                g0(c2692i2);
                parcel2.writeNoException();
                return true;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean a11 = com.google.android.gms.internal.measurement.Q.a(parcel);
                n7 n7Var8 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                List Q02 = Q0(readString7, readString8, a11, n7Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(Q02);
                return true;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean a12 = com.google.android.gms.internal.measurement.Q.a(parcel);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                List e10 = e(readString9, readString10, readString11, a12);
                parcel2.writeNoException();
                parcel2.writeTypedList(e10);
                return true;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                n7 n7Var9 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                List W02 = W0(readString12, readString13, n7Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(W02);
                return true;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                com.google.android.gms.internal.measurement.Q.f(parcel);
                List G10 = G(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(G10);
                return true;
            case 18:
                n7 n7Var10 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                B(n7Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.Q.b(parcel, Bundle.CREATOR);
                n7 n7Var11 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                m0(bundle, n7Var11);
                parcel2.writeNoException();
                return true;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                n7 n7Var12 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                e1(n7Var12);
                parcel2.writeNoException();
                return true;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                n7 n7Var13 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                C2748p k02 = k0(n7Var13);
                parcel2.writeNoException();
                if (k02 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    k02.writeToParcel(parcel2, 1);
                }
                return true;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                n7 n7Var14 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.Q.b(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                List P10 = P(n7Var14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(P10);
                return true;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                n7 n7Var15 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                M(n7Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                n7 n7Var16 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                Y(n7Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                n7 n7Var17 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                N0(n7Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                n7 n7Var18 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                I6 i62 = (I6) com.google.android.gms.internal.measurement.Q.b(parcel, I6.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    interfaceC2751p2 = queryLocalInterface instanceof InterfaceC2751p2 ? (InterfaceC2751p2) queryLocalInterface : new C2735n2(readStrongBinder);
                }
                com.google.android.gms.internal.measurement.Q.f(parcel);
                d(n7Var18, i62, interfaceC2751p2);
                parcel2.writeNoException();
                return true;
            case 30:
                n7 n7Var19 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                C2676g c2676g = (C2676g) com.google.android.gms.internal.measurement.Q.b(parcel, C2676g.CREATOR);
                com.google.android.gms.internal.measurement.Q.f(parcel);
                d0(n7Var19, c2676g);
                parcel2.writeNoException();
                return true;
            case HVError.INSTRUCTION_ERROR /* 31 */:
                n7 n7Var20 = (n7) com.google.android.gms.internal.measurement.Q.b(parcel, n7.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.Q.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    interfaceC2727m2 = queryLocalInterface2 instanceof InterfaceC2727m2 ? (InterfaceC2727m2) queryLocalInterface2 : new C2711k2(readStrongBinder2);
                }
                com.google.android.gms.internal.measurement.Q.f(parcel);
                R(n7Var20, bundle3, interfaceC2727m2);
                parcel2.writeNoException();
                return true;
        }
    }
}
