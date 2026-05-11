package t7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class i6 extends AbstractC4639a implements IInterface {
    i6(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    public final void g() {
        l1(1, p());
    }

    public final void h() {
        l1(2, p());
    }

    public final List m1(InterfaceC3089a interfaceC3089a, a6 a6Var) {
        Parcel p10 = p();
        AbstractC4654c0.b(p10, interfaceC3089a);
        AbstractC4654c0.a(p10, a6Var);
        Parcel k12 = k1(3, p10);
        ArrayList createTypedArrayList = k12.createTypedArrayList(g6.CREATOR);
        k12.recycle();
        return createTypedArrayList;
    }
}
