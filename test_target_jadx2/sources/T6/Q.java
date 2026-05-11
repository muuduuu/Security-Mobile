package T6;

import S6.a;
import android.util.Log;
import com.google.android.gms.common.C2010b;
import java.util.Map;

/* loaded from: classes2.dex */
final class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2010b f9376a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S f9377b;

    Q(S s10, C2010b c2010b) {
        this.f9377b = s10;
        this.f9376a = c2010b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C1163b c1163b;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        S s10 = this.f9377b;
        map = s10.f9383f.f9427j;
        c1163b = s10.f9379b;
        N n10 = (N) map.get(c1163b);
        if (n10 == null) {
            return;
        }
        if (!this.f9376a.Z0()) {
            n10.F(this.f9376a, null);
            return;
        }
        this.f9377b.f9382e = true;
        fVar = this.f9377b.f9378a;
        if (fVar.s()) {
            this.f9377b.i();
            return;
        }
        try {
            S s11 = this.f9377b;
            fVar3 = s11.f9378a;
            fVar4 = s11.f9378a;
            fVar3.q(null, fVar4.c());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            fVar2 = this.f9377b.f9378a;
            fVar2.d("Failed to get service from broker.");
            n10.F(new C2010b(10), null);
        }
    }
}
