package pa;

import android.app.Application;
import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3855a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3855a f38489a = new C3855a();

    /* renamed from: b, reason: collision with root package name */
    private static List f38490b;

    private C3855a() {
    }

    private final List a(Application application) {
        List list = f38490b;
        if (list != null) {
            return list;
        }
        List a10 = C3856b.f38491b.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            List d10 = ((Ea.g) it.next()).d(application);
            Intrinsics.checkNotNullExpressionValue(d10, "createApplicationLifecycleListeners(...)");
            CollectionsKt.z(arrayList, d10);
        }
        f38490b = arrayList;
        return arrayList;
    }

    public static final void b(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Iterator it = f38489a.a(application).iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public static final void c(Application application, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        Iterator it = f38489a.a(application).iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }
}
