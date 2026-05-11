package r7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* loaded from: classes2.dex */
public final class i9 extends AbstractC4029a implements k9 {
    i9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // r7.k9
    public final h9 n0(InterfaceC3089a interfaceC3089a, Z8 z82) {
        h9 h9Var;
        Parcel p10 = p();
        O.b(p10, interfaceC3089a);
        O.a(p10, z82);
        Parcel k12 = k1(1, p10);
        IBinder readStrongBinder = k12.readStrongBinder();
        if (readStrongBinder == null) {
            h9Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            h9Var = queryLocalInterface instanceof h9 ? (h9) queryLocalInterface : new h9(readStrongBinder);
        }
        k12.recycle();
        return h9Var;
    }
}
