package r7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* renamed from: r7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4139l extends AbstractC4029a implements InterfaceC4159n {
    C4139l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // r7.InterfaceC4159n
    public final C4129k v0(InterfaceC3089a interfaceC3089a, C4109i c4109i) {
        C4129k c4129k;
        Parcel p10 = p();
        O.b(p10, interfaceC3089a);
        O.a(p10, c4109i);
        Parcel k12 = k1(1, p10);
        IBinder readStrongBinder = k12.readStrongBinder();
        if (readStrongBinder == null) {
            c4129k = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c4129k = queryLocalInterface instanceof C4129k ? (C4129k) queryLocalInterface : new C4129k(readStrongBinder);
        }
        k12.recycle();
        return c4129k;
    }
}
