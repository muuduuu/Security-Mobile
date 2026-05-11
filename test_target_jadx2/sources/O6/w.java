package O6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import j7.AbstractC3504a;

/* loaded from: classes2.dex */
public final class w extends AbstractC3504a implements IInterface {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void l1(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel p10 = p();
        j7.o.c(p10, vVar);
        j7.o.b(p10, googleSignInOptions);
        k1(101, p10);
    }

    public final void m1(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel p10 = p();
        j7.o.c(p10, vVar);
        j7.o.b(p10, googleSignInOptions);
        k1(102, p10);
    }

    public final void n1(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel p10 = p();
        j7.o.c(p10, vVar);
        j7.o.b(p10, googleSignInOptions);
        k1(103, p10);
    }
}
