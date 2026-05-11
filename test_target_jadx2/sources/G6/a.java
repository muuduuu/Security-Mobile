package G6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r6.AbstractBinderC4026b;
import r6.AbstractC4025a;
import r6.AbstractC4027c;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: G6.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0068a extends AbstractBinderC4026b implements a {

        /* renamed from: G6.a$a$a, reason: collision with other inner class name */
        public static class C0069a extends AbstractC4025a implements a {
            C0069a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // G6.a
            public final Bundle L(Bundle bundle) {
                Parcel p10 = p();
                AbstractC4027c.b(p10, bundle);
                Parcel k12 = k1(p10);
                Bundle bundle2 = (Bundle) AbstractC4027c.a(k12, Bundle.CREATOR);
                k12.recycle();
                return bundle2;
            }
        }

        public static a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0069a(iBinder);
        }
    }

    Bundle L(Bundle bundle);
}
