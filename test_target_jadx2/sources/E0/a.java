package E0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1496g0;
import androidx.core.view.AbstractC1498h0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f1867a = c.f1871b;

    /* renamed from: b, reason: collision with root package name */
    private static final int f1868b = c.f1870a;

    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator it = AbstractC1498h0.a(view).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Iterator it = AbstractC1496g0.a(viewGroup).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    private static final b c(View view) {
        int i10 = f1867a;
        b bVar = (b) view.getTag(i10);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i10, bVar2);
        return bVar2;
    }

    public static final void d(View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(f1868b, Boolean.valueOf(z10));
    }
}
