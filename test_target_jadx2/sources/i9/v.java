package i9;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2459i1;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2459i1 f34155a = new t();

    public static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return 15;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            default:
                return 0;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return 17;
        }
    }
}
