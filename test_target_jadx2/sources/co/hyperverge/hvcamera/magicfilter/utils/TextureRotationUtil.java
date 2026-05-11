package co.hyperverge.hvcamera.magicfilter.utils;

import co.hyperverge.hvcamera.HVLog;

/* loaded from: classes.dex */
public class TextureRotationUtil {
    private static final String TAG = "TextureRotationUtil";
    public static final float[] TEXTURE_NO_ROTATION = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final float[] TEXTURE_ROTATED_90 = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    public static final float[] TEXTURE_ROTATED_180 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    public static final float[] TEXTURE_ROTATED_270 = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] CUBE = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] CUBEINV = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};

    /* renamed from: co.hyperverge.hvcamera.magicfilter.utils.TextureRotationUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation;

        static {
            int[] iArr = new int[Rotation.values().length];
            $SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation = iArr;
            try {
                iArr[Rotation.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation[Rotation.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation[Rotation.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation[Rotation.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private TextureRotationUtil() {
    }

    private static float flip(float f10) {
        HVLog.d(TAG, "flip() called with: i = [" + f10 + "]");
        return f10 < 0.1f ? 1.0f : 0.0f;
    }

    public static float[] getRotation(Rotation rotation, boolean z10, boolean z11) {
        HVLog.d(TAG, "getRotation() called with: rotation = [" + rotation + "], flipHorizontal = [" + z10 + "], flipVertical = [" + z11 + "]");
        int i10 = AnonymousClass1.$SwitchMap$co$hyperverge$hvcamera$magicfilter$utils$Rotation[rotation.ordinal()];
        float[] fArr = i10 != 1 ? i10 != 2 ? i10 != 3 ? TEXTURE_NO_ROTATION : TEXTURE_ROTATED_270 : TEXTURE_ROTATED_180 : TEXTURE_ROTATED_90;
        if (z10) {
            fArr = new float[]{flip(fArr[0]), fArr[1], flip(fArr[2]), fArr[3], flip(fArr[4]), fArr[5], flip(fArr[6]), fArr[7]};
        }
        return z11 ? new float[]{fArr[0], flip(fArr[1]), fArr[2], flip(fArr[3]), fArr[4], flip(fArr[5]), fArr[6], flip(fArr[7])} : fArr;
    }
}
