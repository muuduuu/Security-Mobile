package o5;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements LineHeightSpan, i {

    /* renamed from: a, reason: collision with root package name */
    private final int f37936a;

    public b(float f10) {
        this.f37936a = (int) Math.ceil(f10);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        int i14 = fm.descent;
        int i15 = this.f37936a;
        if (i14 > i15) {
            int min = (int) Math.min(i15, i14);
            fm.descent = min;
            fm.bottom = min;
            fm.ascent = 0;
            fm.top = 0;
            return;
        }
        int i16 = fm.ascent;
        if ((-i16) + i14 > i15) {
            fm.bottom = i14;
            int i17 = (-i15) + i14;
            fm.ascent = i17;
            fm.top = i17;
            return;
        }
        int i18 = fm.bottom;
        if ((-i16) + i18 > i15) {
            fm.top = i16;
            fm.bottom = i16 + i15;
            return;
        }
        int i19 = fm.top;
        if ((-i19) + i18 > i15) {
            fm.top = i18 - i15;
            return;
        }
        double d10 = (i15 - ((-i19) + i18)) / 2.0f;
        int ceil = (int) (i19 - ((float) Math.ceil(d10)));
        int floor = (int) (fm.bottom + ((float) Math.floor(d10)));
        fm.top = ceil;
        fm.ascent = ceil;
        fm.descent = floor;
        fm.bottom = floor;
    }
}
