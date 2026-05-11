package S1;

import android.content.Context;
import b2.l;

/* loaded from: classes.dex */
public class c implements b {
    @Override // S1.b
    public a a(Context context) {
        return (context == null || l.f(context) != 0.0f) ? a.STANDARD_MOTION : a.REDUCED_MOTION;
    }
}
