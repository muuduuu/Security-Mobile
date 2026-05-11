package i7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: i7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3327e extends AbstractBinderC3324b implements InterfaceC3328f {
    public static InterfaceC3328f p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof InterfaceC3328f ? (InterfaceC3328f) queryLocalInterface : new C3326d(iBinder);
    }
}
