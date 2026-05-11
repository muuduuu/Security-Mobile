package t7;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class L4 extends B implements InterfaceC4729m5 {
    public static InterfaceC4729m5 p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        return queryLocalInterface instanceof InterfaceC4729m5 ? (InterfaceC4729m5) queryLocalInterface : new C4714k4(iBinder);
    }
}
