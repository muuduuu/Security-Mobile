package d5;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.Q;

/* renamed from: d5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2981c extends AbstractC2979a {

    /* renamed from: d5.c$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31209a;

        static {
            int[] iArr = new int[EnumC2980b.values().length];
            f31209a = iArr;
            try {
                iArr[EnumC2980b.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31209a[EnumC2980b.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31209a[EnumC2980b.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31209a[EnumC2980b.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    AbstractC2981c() {
    }

    @Override // d5.AbstractC2979a
    Animation b(View view, int i10, int i11, int i12, int i13) {
        EnumC2980b enumC2980b = this.f31207c;
        if (enumC2980b == null) {
            throw new Q("Missing animated property from animation config");
        }
        int i14 = a.f31209a[enumC2980b.ordinal()];
        if (i14 == 1) {
            return new C2990l(view, g() ? view.getAlpha() : 0.0f, g() ? 0.0f : view.getAlpha());
        }
        if (i14 == 2) {
            float f10 = g() ? 1.0f : 0.0f;
            float f11 = g() ? 0.0f : 1.0f;
            return new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
        }
        if (i14 == 3) {
            return new ScaleAnimation(g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        }
        if (i14 == 4) {
            return new ScaleAnimation(1.0f, 1.0f, g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
        }
        throw new Q("Missing animation for property : " + this.f31207c);
    }

    @Override // d5.AbstractC2979a
    boolean e() {
        return this.f31208d > 0 && this.f31207c != null;
    }

    abstract boolean g();
}
