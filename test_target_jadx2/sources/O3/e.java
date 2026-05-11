package O3;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public enum e {
    UNKNOWN(-1),
    REQUESTED(0),
    INTERMEDIATE_AVAILABLE(2),
    SUCCESS(3),
    CANCELED(4),
    ERROR(5),
    DRAW(6),
    EMPTY_EVENT(7),
    RELEASED(8);

    private final int value;
    public static final a Companion = new a(null);
    private static final e[] VALUES = values();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(int i10) {
            for (e eVar : e.VALUES) {
                if (eVar.getValue() == i10) {
                    return eVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7025a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.INTERMEDIATE_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.RELEASED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f7025a = iArr;
        }
    }

    e(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (b.f7025a[ordinal()]) {
            case 1:
                return "requested";
            case 2:
                return "success";
            case 3:
                return "canceled";
            case 4:
                return "intermediate_available";
            case 5:
                return AppConstants.VIDEO_RECORDING_ERROR;
            case 6:
                return "released";
            default:
                return "unknown";
        }
    }
}
