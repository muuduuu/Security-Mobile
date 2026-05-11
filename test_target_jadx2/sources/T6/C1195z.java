package T6;

import D7.C0787k;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;

/* renamed from: T6.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1195z implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0787k f9496a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A f9497b;

    C1195z(A a10, C0787k c0787k) {
        this.f9497b = a10;
        this.f9496a = c0787k;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Map map;
        map = this.f9497b.f9330b;
        map.remove(this.f9496a);
    }
}
