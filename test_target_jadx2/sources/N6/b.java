package N6;

import S6.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public class b implements o {

    /* renamed from: a, reason: collision with root package name */
    private final Status f6564a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f6565b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f6565b = googleSignInAccount;
        this.f6564a = status;
    }

    public GoogleSignInAccount a() {
        return this.f6565b;
    }

    @Override // S6.o
    public Status c() {
        return this.f6564a;
    }
}
