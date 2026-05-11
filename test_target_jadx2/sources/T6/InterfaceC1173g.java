package T6;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: T6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1173g extends IInterface {

    /* renamed from: T6.g$a */
    public static abstract class a extends l7.b implements InterfaceC1173g {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // l7.b
        protected final boolean k1(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) l7.c.a(parcel, Status.CREATOR);
            l7.c.b(parcel);
            F(status);
            return true;
        }
    }

    void F(Status status);
}
