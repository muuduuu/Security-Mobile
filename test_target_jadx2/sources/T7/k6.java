package t7;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class k6 extends B implements l6 {
    public static l6 p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        return queryLocalInterface instanceof l6 ? (l6) queryLocalInterface : new j6(iBinder);
    }
}
