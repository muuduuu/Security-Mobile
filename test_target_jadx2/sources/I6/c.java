package I6;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* loaded from: classes2.dex */
public class c extends UserRecoverableAuthException {

    /* renamed from: d, reason: collision with root package name */
    private final int f4307d;

    c(int i10, String str, Intent intent) {
        super(str, intent);
        this.f4307d = i10;
    }
}
