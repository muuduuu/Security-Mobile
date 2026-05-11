package Ta;

import expo.modules.image.enums.ContentFit;
import kotlin.jvm.internal.Intrinsics;
import r2.n;

/* renamed from: Ta.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1197b extends AbstractC1198c {

    /* renamed from: j, reason: collision with root package name */
    private final t f9514j;

    /* renamed from: k, reason: collision with root package name */
    private final ContentFit f9515k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9516l;

    /* renamed from: Ta.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9517a;

        static {
            int[] iArr = new int[ContentFit.values().length];
            try {
                iArr[ContentFit.Contain.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentFit.Cover.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentFit.ScaleDown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9517a = iArr;
        }
    }

    public C1197b(t target, ContentFit contentFit) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(contentFit, "contentFit");
        this.f9514j = target;
        this.f9515k = contentFit;
    }

    private final float c(float f10, float f11, float f12, float f13) {
        int i10 = a.f9517a[this.f9515k.ordinal()];
        if (i10 == 1) {
            return Math.min(f12 / f10, f13 / f11);
        }
        if (i10 == 2) {
            return Float.max(f12 / f10, f13 / f11);
        }
        if (i10 != 3) {
            return 1.0f;
        }
        if (f12 < f10 || f13 < f11) {
            return Math.min(f12 / f10, f13 / f11);
        }
        return 1.0f;
    }

    @Override // r2.n
    public n.g a(int i10, int i11, int i12, int i13) {
        return n.g.QUALITY;
    }

    @Override // r2.n
    public float b(int i10, int i11, int i12, int i13) {
        if (!this.f9516l) {
            this.f9514j.z(i10);
            this.f9514j.y(i11);
            this.f9516l = true;
        }
        if (i12 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE) {
            return 1.0f;
        }
        return Math.min(1.0f, c(i10, i11, i12, i13));
    }
}
