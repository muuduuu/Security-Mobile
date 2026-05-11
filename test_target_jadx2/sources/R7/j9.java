package r7;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class j9 extends AbstractBinderC4218t implements k9 {
    public static k9 p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return queryLocalInterface instanceof k9 ? (k9) queryLocalInterface : new i9(iBinder);
    }
}
