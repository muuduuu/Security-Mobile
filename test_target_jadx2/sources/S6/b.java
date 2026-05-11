package S6;

import com.google.android.gms.common.api.Status;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected final Status f8819a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Status status) {
        super(r4.toString());
        int u10 = status.u();
        String F10 = status.F() != null ? status.F() : BuildConfig.FLAVOR;
        StringBuilder sb2 = new StringBuilder(String.valueOf(u10).length() + 2 + String.valueOf(F10).length());
        sb2.append(u10);
        sb2.append(": ");
        sb2.append(F10);
        this.f8819a = status;
    }

    public Status a() {
        return this.f8819a;
    }

    public int b() {
        return this.f8819a.u();
    }
}
