package r7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* renamed from: r7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4129k extends AbstractC4029a implements IInterface {
    C4129k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void f() {
        l1(3, p());
    }

    public final C4247v8[] m1(InterfaceC3089a interfaceC3089a, C4169o c4169o) {
        Parcel p10 = p();
        O.b(p10, interfaceC3089a);
        O.a(p10, c4169o);
        Parcel k12 = k1(1, p10);
        C4247v8[] c4247v8Arr = (C4247v8[]) k12.createTypedArray(C4247v8.CREATOR);
        k12.recycle();
        return c4247v8Arr;
    }

    public final C4247v8[] n1(InterfaceC3089a interfaceC3089a, C4169o c4169o) {
        Parcel p10 = p();
        O.b(p10, interfaceC3089a);
        O.a(p10, c4169o);
        Parcel k12 = k1(2, p10);
        C4247v8[] c4247v8Arr = (C4247v8[]) k12.createTypedArray(C4247v8.CREATOR);
        k12.recycle();
        return c4247v8Arr;
    }
}
