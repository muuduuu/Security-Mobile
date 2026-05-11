package e8;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* renamed from: e8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3096b extends AbstractRunnableC3093A {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f32264b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC3099e f32265c;

    C3096b(ServiceConnectionC3099e serviceConnectionC3099e, IBinder iBinder) {
        this.f32265c = serviceConnectionC3099e;
        this.f32264b = iBinder;
    }

    @Override // e8.AbstractRunnableC3093A
    public final void b() {
        G g10;
        List list;
        List list2;
        g10 = this.f32265c.f32267a.f32277i;
        this.f32265c.f32267a.f32282n = (IInterface) g10.a(this.f32264b);
        C3100f.r(this.f32265c.f32267a);
        this.f32265c.f32267a.f32275g = false;
        list = this.f32265c.f32267a.f32272d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f32265c.f32267a.f32272d;
        list2.clear();
    }
}
