package ob;

import android.app.Activity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements Fa.b, Ea.d {

    /* renamed from: a, reason: collision with root package name */
    private final Set f38038a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private Ba.b f38039b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        activity.getWindow().addFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        activity.getWindow().clearFlags(128);
    }

    private final Activity k() {
        Ba.b bVar = this.f38039b;
        if (bVar == null) {
            Intrinsics.v("moduleRegistry");
            bVar = null;
        }
        Ea.b bVar2 = (Ea.b) bVar.b(Ea.b.class);
        if (bVar2 == null) {
            throw new Da.c();
        }
        if (bVar2.a() == null) {
            throw new Da.c();
        }
        Activity a10 = bVar2.a();
        Intrinsics.d(a10);
        return a10;
    }

    @Override // Fa.b
    public boolean a() {
        return !this.f38038a.isEmpty();
    }

    @Override // Fa.b
    public void b(String tag, Runnable done) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(done, "done");
        final Activity k10 = k();
        if (this.f38038a.size() == 1 && this.f38038a.contains(tag)) {
            k10.runOnUiThread(new Runnable() { // from class: ob.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.j(k10);
                }
            });
        }
        this.f38038a.remove(tag);
        done.run();
    }

    @Override // Fa.b
    public void d(String tag, Runnable done) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(done, "done");
        final Activity k10 = k();
        if (!a()) {
            k10.runOnUiThread(new Runnable() { // from class: ob.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.h(k10);
                }
            });
        }
        this.f38038a.add(tag);
        done.run();
    }

    @Override // Ea.d
    public List e() {
        return CollectionsKt.e(Fa.b.class);
    }

    @Override // Ea.k
    public void i(Ba.b moduleRegistry) {
        Intrinsics.checkNotNullParameter(moduleRegistry, "moduleRegistry");
        this.f38039b = moduleRegistry;
    }
}
