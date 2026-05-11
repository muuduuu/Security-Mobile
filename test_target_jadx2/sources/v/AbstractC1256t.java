package V;

import android.net.Uri;

/* renamed from: V.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1256t {
    static AbstractC1256t b(Uri uri) {
        y0.f.h(uri, "OutputUri cannot be null.");
        return new C1245h(uri);
    }

    public abstract Uri a();
}
