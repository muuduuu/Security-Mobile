package p7;

import D7.C0787k;
import S6.a;
import S6.g;
import T6.AbstractC1191v;
import V6.AbstractC1287s;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import x7.C5132o;

/* loaded from: classes2.dex */
public final class F extends S6.g implements x7.t {
    public F(Context context) {
        super(context, C3837v.f38470l, a.d.f8818Q, g.a.f8847c);
    }

    @Override // x7.t
    public final Task p(final C5132o c5132o) {
        return w(AbstractC1191v.a().b(new T6.r() { // from class: p7.E
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                C5132o c5132o2 = C5132o.this;
                C3809d0 c3809d0 = (C3809d0) obj;
                C0787k c0787k = (C0787k) obj2;
                AbstractC1287s.b(c5132o2 != null, "locationSettingsRequest can't be null");
                ((K0) c3809d0.I()).S0(c5132o2, new S(c0787k), null);
            }
        }).e(2426).a());
    }
}
