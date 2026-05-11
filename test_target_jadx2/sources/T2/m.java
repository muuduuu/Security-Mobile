package T2;

import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.G;
import androidx.fragment.app.N;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends N {

    /* renamed from: j, reason: collision with root package name */
    private final String[] f9185j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, G fm) {
        super(fm, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f9185j = new String[]{context.getString(K2.g.f5244w), context.getString(K2.g.f5246y), context.getString(K2.g.f5202D)};
    }

    @Override // androidx.viewpager.widget.a
    public int c() {
        return this.f9185j.length;
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence e(int i10) {
        return this.f9185j[i10];
    }

    @Override // androidx.fragment.app.N
    public ComponentCallbacksC1573o p(int i10) {
        if (i10 == 0) {
            return new l();
        }
        if (i10 == 1) {
            return r.INSTANCE.a(a.REQUEST);
        }
        if (i10 == 2) {
            return r.INSTANCE.a(a.RESPONSE);
        }
        throw new IllegalArgumentException("no item");
    }
}
