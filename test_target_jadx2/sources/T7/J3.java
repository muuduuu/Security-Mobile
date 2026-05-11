package t7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* loaded from: classes2.dex */
public final class J3 extends AbstractC4639a implements IInterface {
    J3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final void f() {
        l1(3, p());
    }

    public final F1[] m1(InterfaceC3089a interfaceC3089a, p6 p6Var) {
        Parcel p10 = p();
        AbstractC4654c0.b(p10, interfaceC3089a);
        AbstractC4654c0.a(p10, p6Var);
        Parcel k12 = k1(1, p10);
        F1[] f1Arr = (F1[]) k12.createTypedArray(F1.CREATOR);
        k12.recycle();
        return f1Arr;
    }

    public final F1[] n1(InterfaceC3089a interfaceC3089a, InterfaceC3089a interfaceC3089a2, InterfaceC3089a interfaceC3089a3, int i10, int i11, int i12, int i13, int i14, int i15, p6 p6Var) {
        Parcel p10 = p();
        AbstractC4654c0.b(p10, interfaceC3089a);
        AbstractC4654c0.b(p10, interfaceC3089a2);
        AbstractC4654c0.b(p10, interfaceC3089a3);
        p10.writeInt(i10);
        p10.writeInt(i11);
        p10.writeInt(i12);
        p10.writeInt(i13);
        p10.writeInt(i14);
        p10.writeInt(i15);
        AbstractC4654c0.a(p10, p6Var);
        Parcel k12 = k1(4, p10);
        F1[] f1Arr = (F1[]) k12.createTypedArray(F1.CREATOR);
        k12.recycle();
        return f1Arr;
    }
}
