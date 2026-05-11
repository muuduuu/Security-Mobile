package O2;

import Q2.r;
import androidx.lifecycle.AbstractC1604v;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final ChuckerDatabase f7005a;

    public c(ChuckerDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f7005a = database;
    }

    @Override // O2.d
    public AbstractC1604v a() {
        return this.f7005a.F().d();
    }

    @Override // O2.d
    public AbstractC1604v b(long j10) {
        return r.j(this.f7005a.F().a(j10), null, null, 3, null);
    }

    @Override // O2.d
    public Object c(long j10, kotlin.coroutines.d dVar) {
        Object c10 = this.f7005a.F().c(j10, dVar);
        return c10 == AbstractC3868b.e() ? c10 : Unit.f36324a;
    }

    @Override // O2.d
    public Object d(kotlin.coroutines.d dVar) {
        Object b10 = this.f7005a.F().b(dVar);
        return b10 == AbstractC3868b.e() ? b10 : Unit.f36324a;
    }
}
