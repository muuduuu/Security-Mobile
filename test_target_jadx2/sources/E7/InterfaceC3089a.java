package e7;

import android.os.IBinder;
import android.os.IInterface;
import n7.n;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3089a extends IInterface {

    /* renamed from: e7.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0469a extends n implements InterfaceC3089a {
        public AbstractBinderC0469a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static InterfaceC3089a k1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC3089a ? (InterfaceC3089a) queryLocalInterface : new C3092d(iBinder);
        }
    }
}
