package Nb;

import android.location.Location;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface q {

    public static final class a {
        public static void a(q qVar, CodedException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }

    void a(CodedException codedException);

    void b();

    void c(CodedException codedException);

    void onLocationChanged(Location location);
}
