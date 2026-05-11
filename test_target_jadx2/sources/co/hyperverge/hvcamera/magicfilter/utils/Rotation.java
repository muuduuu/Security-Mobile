package co.hyperverge.hvcamera.magicfilter.utils;

import co.hyperverge.hvcamera.HVLog;

/* loaded from: classes.dex */
public enum Rotation {
    NORMAL,
    ROTATION_90,
    ROTATION_180,
    ROTATION_270;

    /* renamed from: co.hyperverge.hvcamera.magicfilter.utils.Rotation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation;

        static {
            int[] iArr = new int[Rotation.values().length];
            $SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation = iArr;
            try {
                iArr[Rotation.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation[Rotation.ROTATION_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation[Rotation.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation[Rotation.ROTATION_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Rotation fromInt(int i10) {
        HVLog.d("Rotation", "fromInt() called with: rotation = [" + i10 + "]");
        if (i10 == 0) {
            return NORMAL;
        }
        if (i10 == 90) {
            return ROTATION_90;
        }
        if (i10 == 180) {
            return ROTATION_180;
        }
        if (i10 == 270) {
            return ROTATION_270;
        }
        if (i10 == 360) {
            return NORMAL;
        }
        throw new IllegalStateException(i10 + " is an unknown rotation. Needs to be either 0, 90, 180 or 270!");
    }

    public int asInt() {
        HVLog.d("Rotation", "asInt() called");
        int i10 = AnonymousClass1.$SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation[ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 90;
        }
        if (i10 == 3) {
            return 180;
        }
        if (i10 == 4) {
            return 270;
        }
        throw new IllegalStateException("Unknown Rotation!");
    }
}
