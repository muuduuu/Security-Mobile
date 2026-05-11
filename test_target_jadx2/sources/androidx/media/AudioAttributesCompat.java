package androidx.media;

import android.util.SparseIntArray;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import t1.InterfaceC4604a;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC4604a {

    /* renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f17193b;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f17194c;

    /* renamed from: a, reason: collision with root package name */
    AudioAttributesImpl f17195a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17193b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f17194c = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    AudioAttributesCompat() {
    }

    static int a(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        }
        if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        }
        switch (i11) {
            case 0:
                return z10 ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return 3;
            case 2:
                return 0;
            case 3:
                return z10 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            default:
                if (!z10) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
        }
    }

    static String b(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return "USAGE_GAME";
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            default:
                return "unknown usage " + i10;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return "USAGE_ASSISTANT";
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f17195a;
        return audioAttributesImpl == null ? audioAttributesCompat.f17195a == null : audioAttributesImpl.equals(audioAttributesCompat.f17195a);
    }

    public int hashCode() {
        return this.f17195a.hashCode();
    }

    public String toString() {
        return this.f17195a.toString();
    }
}
