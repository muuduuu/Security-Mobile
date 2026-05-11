package V6;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.C2012d;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes2.dex */
public final class u0 implements Parcelable.Creator {
    static void a(C1275g c1275g, Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, c1275g.f10950a);
        W6.c.m(parcel, 2, c1275g.f10951b);
        W6.c.m(parcel, 3, c1275g.f10952c);
        W6.c.u(parcel, 4, c1275g.f10953d, false);
        W6.c.l(parcel, 5, c1275g.f10954e, false);
        W6.c.x(parcel, 6, c1275g.f10955f, i10, false);
        W6.c.e(parcel, 7, c1275g.f10956g, false);
        W6.c.s(parcel, 8, c1275g.f10957h, i10, false);
        W6.c.x(parcel, 10, c1275g.f10958i, i10, false);
        W6.c.x(parcel, 11, c1275g.f10959j, i10, false);
        W6.c.c(parcel, 12, c1275g.f10960k);
        W6.c.m(parcel, 13, c1275g.f10961l);
        W6.c.c(parcel, 14, c1275g.f10962m);
        W6.c.u(parcel, 15, c1275g.j(), false);
        W6.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        Scope[] scopeArr = C1275g.f10948o;
        Bundle bundle = new Bundle();
        C2012d[] c2012dArr = C1275g.f10949p;
        C2012d[] c2012dArr2 = c2012dArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 3:
                    i12 = W6.b.v(parcel, t10);
                    break;
                case 4:
                    str = W6.b.g(parcel, t10);
                    break;
                case 5:
                    iBinder = W6.b.u(parcel, t10);
                    break;
                case 6:
                    scopeArr = (Scope[]) W6.b.j(parcel, t10, Scope.CREATOR);
                    break;
                case 7:
                    bundle = W6.b.a(parcel, t10);
                    break;
                case 8:
                    account = (Account) W6.b.f(parcel, t10, Account.CREATOR);
                    break;
                case 9:
                default:
                    W6.b.B(parcel, t10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    c2012dArr = (C2012d[]) W6.b.j(parcel, t10, C2012d.CREATOR);
                    break;
                case 11:
                    c2012dArr2 = (C2012d[]) W6.b.j(parcel, t10, C2012d.CREATOR);
                    break;
                case 12:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 13:
                    i13 = W6.b.v(parcel, t10);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    z11 = W6.b.n(parcel, t10);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    str2 = W6.b.g(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C1275g(i10, i11, i12, str, iBinder, scopeArr, bundle, account, c2012dArr, c2012dArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1275g[i10];
    }
}
