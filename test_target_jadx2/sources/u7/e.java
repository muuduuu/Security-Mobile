package u7;

import S6.h;
import V6.AbstractC1277h;
import V6.C1271e;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class e extends AbstractC1277h {
    public e(Context context, Looper looper, C1271e c1271e, h.b bVar, h.c cVar) {
        super(context, looper, 51, c1271e, bVar, cVar);
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return 11925000;
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new c(iBinder);
    }
}
