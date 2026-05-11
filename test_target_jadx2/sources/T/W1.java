package t;

import androidx.camera.core.impl.m1;

/* loaded from: classes.dex */
public abstract class W1 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41937a;

        static {
            int[] iArr = new int[m1.b.values().length];
            f41937a = iArr;
            try {
                iArr[m1.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41937a[m1.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41937a[m1.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41937a[m1.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41937a[m1.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(m1.b bVar, int i10) {
        int i11 = a.f41937a[bVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? 1 : 3 : i10 == 2 ? 5 : 2;
    }

    public static int b(m1.b bVar, int i10) {
        int i11 = a.f41937a[bVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? 1 : 3 : i10 == 2 ? 5 : 1;
    }
}
