package T6;

import S6.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;

/* renamed from: T6.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1194y implements k.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f9492a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A f9493b;

    C1194y(A a10, BasePendingResult basePendingResult) {
        this.f9493b = a10;
        this.f9492a = basePendingResult;
    }

    @Override // S6.k.a
    public final void a(Status status) {
        Map map;
        map = this.f9493b.f9329a;
        map.remove(this.f9492a);
    }
}
