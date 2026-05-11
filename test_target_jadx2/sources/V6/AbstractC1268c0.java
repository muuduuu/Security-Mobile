package V6;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.C2010b;
import java.util.Objects;

/* renamed from: V6.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1268c0 extends m0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f10921d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f10922e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1267c f10923f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1268c0(AbstractC1267c abstractC1267c, int i10, Bundle bundle) {
        super(abstractC1267c, Boolean.TRUE);
        Objects.requireNonNull(abstractC1267c);
        this.f10923f = abstractC1267c;
        this.f10921d = i10;
        this.f10922e = bundle;
    }

    @Override // V6.m0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f10921d;
        if (i10 != 0) {
            this.f10923f.b0(1, null);
            Bundle bundle = this.f10922e;
            f(new C2010b(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (e()) {
                return;
            }
            this.f10923f.b0(1, null);
            f(new C2010b(8, null));
        }
    }

    protected abstract boolean e();

    protected abstract void f(C2010b c2010b);
}
