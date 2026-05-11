package V6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes2.dex */
public final class V extends W6.a {
    public static final Parcelable.Creator<V> CREATOR = new W();

    /* renamed from: a, reason: collision with root package name */
    final int f10875a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f10876b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10877c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f10878d;

    V(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f10875a = i10;
        this.f10876b = account;
        this.f10877c = i11;
        this.f10878d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f10875a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.s(parcel, 2, this.f10876b, i10, false);
        W6.c.m(parcel, 3, this.f10877c);
        W6.c.s(parcel, 4, this.f10878d, i10, false);
        W6.c.b(parcel, a10);
    }

    public V(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
