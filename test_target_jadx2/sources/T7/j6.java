package t7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* loaded from: classes2.dex */
public final class j6 extends AbstractC4639a implements l6 {
    j6(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    @Override // t7.l6
    public final i6 L0(InterfaceC3089a interfaceC3089a, e6 e6Var) {
        i6 i6Var;
        Parcel p10 = p();
        AbstractC4654c0.b(p10, interfaceC3089a);
        AbstractC4654c0.a(p10, e6Var);
        Parcel k12 = k1(1, p10);
        IBinder readStrongBinder = k12.readStrongBinder();
        if (readStrongBinder == null) {
            i6Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            i6Var = queryLocalInterface instanceof i6 ? (i6) queryLocalInterface : new i6(readStrongBinder);
        }
        k12.recycle();
        return i6Var;
    }
}
