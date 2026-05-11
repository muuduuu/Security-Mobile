package S6;

import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
public final class r extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final C2012d f8872a;

    public r(C2012d c2012d) {
        this.f8872a = c2012d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f8872a));
    }
}
