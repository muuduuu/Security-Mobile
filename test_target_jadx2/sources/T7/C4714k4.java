package t7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* renamed from: t7.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4714k4 extends AbstractC4639a implements InterfaceC4729m5 {
    C4714k4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    @Override // t7.InterfaceC4729m5
    public final J3 A0(InterfaceC3089a interfaceC3089a, H2 h22) {
        J3 j32;
        Parcel p10 = p();
        AbstractC4654c0.b(p10, interfaceC3089a);
        AbstractC4654c0.a(p10, h22);
        Parcel k12 = k1(1, p10);
        IBinder readStrongBinder = k12.readStrongBinder();
        if (readStrongBinder == null) {
            j32 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            j32 = queryLocalInterface instanceof J3 ? (J3) queryLocalInterface : new J3(readStrongBinder);
        }
        k12.recycle();
        return j32;
    }
}
