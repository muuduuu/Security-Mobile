package e8;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class v extends p implements w {
    public static w k1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof w ? (w) queryLocalInterface : new u(iBinder);
    }
}
