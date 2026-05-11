package t7;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class h6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 0;
        Rect rect = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    rect = (Rect) W6.b.f(parcel, t10, Rect.CREATOR);
                    break;
                case 3:
                    f10 = W6.b.r(parcel, t10);
                    break;
                case 4:
                    f11 = W6.b.r(parcel, t10);
                    break;
                case 5:
                    f12 = W6.b.r(parcel, t10);
                    break;
                case 6:
                    f13 = W6.b.r(parcel, t10);
                    break;
                case 7:
                    f14 = W6.b.r(parcel, t10);
                    break;
                case 8:
                    f15 = W6.b.r(parcel, t10);
                    break;
                case 9:
                    f16 = W6.b.r(parcel, t10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    arrayList = W6.b.k(parcel, t10, m6.CREATOR);
                    break;
                case 11:
                    arrayList2 = W6.b.k(parcel, t10, c6.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new g6(i10, rect, f10, f11, f12, f13, f14, f15, f16, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g6[i10];
    }
}
