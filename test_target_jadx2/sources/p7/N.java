package p7;

import D7.C0787k;
import T6.AbstractC1192w;
import android.location.Location;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class N extends L0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C0787k f38383f;

    N(C3809d0 c3809d0, C0787k c0787k) {
        this.f38383f = c0787k;
    }

    @Override // p7.M0
    public final void u(Status status, Location location) {
        AbstractC1192w.b(status, location, this.f38383f);
    }
}
