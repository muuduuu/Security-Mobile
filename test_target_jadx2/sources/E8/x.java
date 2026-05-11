package e8;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class x extends p implements y {
    public x() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // e8.p
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) q.a(parcel, Bundle.CREATOR);
        q.b(parcel);
        Q(bundle);
        return true;
    }
}
