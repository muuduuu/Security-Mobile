package e8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class u extends AbstractC3095a implements w {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e8.w
    public final void g1(Bundle bundle, y yVar) {
        Parcel p10 = p();
        q.c(p10, bundle);
        p10.writeStrongBinder(yVar);
        k1(2, p10);
    }
}
