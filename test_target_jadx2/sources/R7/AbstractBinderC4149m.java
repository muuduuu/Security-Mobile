package r7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: r7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4149m extends AbstractBinderC4218t implements InterfaceC4159n {
    public static InterfaceC4159n p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return queryLocalInterface instanceof InterfaceC4159n ? (InterfaceC4159n) queryLocalInterface : new C4139l(iBinder);
    }
}
