package V6;

import S6.a;
import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C2018j;

/* loaded from: classes2.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f10869a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private C2018j f10870b;

    public N(C2018j c2018j) {
        AbstractC1287s.m(c2018j);
        this.f10870b = c2018j;
    }

    public final int a(Context context, int i10) {
        return this.f10869a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        AbstractC1287s.m(context);
        AbstractC1287s.m(fVar);
        int i10 = 0;
        if (!fVar.l()) {
            return 0;
        }
        int m10 = fVar.m();
        int a10 = a(context, m10);
        if (a10 == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f10869a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f10869a.keyAt(i11);
                if (keyAt > m10 && this.f10869a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            a10 = i10 == -1 ? this.f10870b.j(context, m10) : i10;
            this.f10869a.put(m10, a10);
        }
        return a10;
    }

    public final void c() {
        this.f10869a.clear();
    }
}
