package j7;

import D7.C0787k;
import T6.AbstractC1192w;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* renamed from: j7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class BinderC3506c extends r {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C0787k f35852f;

    BinderC3506c(e eVar, C0787k c0787k) {
        this.f35852f = c0787k;
        Objects.requireNonNull(eVar);
    }

    @Override // j7.s
    public final void o0(Status status, PendingIntent pendingIntent) {
        AbstractC1192w.b(status, pendingIntent, this.f35852f);
    }
}
