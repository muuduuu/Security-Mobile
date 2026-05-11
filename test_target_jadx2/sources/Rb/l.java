package rb;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        String encodeToString = Base64.encodeToString(marshall, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(String str) {
        byte[] decode = Base64.decode(str, 0);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(null);
        obtain.recycle();
        return readBundle;
    }
}
