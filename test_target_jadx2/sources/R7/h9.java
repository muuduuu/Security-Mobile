package r7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class h9 extends AbstractC4029a implements IInterface {
    h9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final void g() {
        l1(1, p());
    }

    public final void h() {
        l1(2, p());
    }

    public final List m1(InterfaceC3089a interfaceC3089a, r9 r9Var) {
        Parcel p10 = p();
        O.b(p10, interfaceC3089a);
        O.a(p10, r9Var);
        Parcel k12 = k1(3, p10);
        ArrayList createTypedArrayList = k12.createTypedArrayList(X8.CREATOR);
        k12.recycle();
        return createTypedArrayList;
    }
}
