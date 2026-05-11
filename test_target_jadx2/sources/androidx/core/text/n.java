package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class n implements Spannable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f15999a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f16000b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16001c;

        /* renamed from: d, reason: collision with root package name */
        private final int f16002d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f16003e;

        /* renamed from: androidx.core.text.n$a$a, reason: collision with other inner class name */
        public static class C0271a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f16004a;

            /* renamed from: c, reason: collision with root package name */
            private int f16006c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f16007d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f16005b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0271a(TextPaint textPaint) {
                this.f16004a = textPaint;
            }

            public a a() {
                return new a(this.f16004a, this.f16005b, this.f16006c, this.f16007d);
            }

            public C0271a b(int i10) {
                this.f16006c = i10;
                return this;
            }

            public C0271a c(int i10) {
                this.f16007d = i10;
                return this;
            }

            public C0271a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f16005b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = m.a(textPaint).setBreakStrategy(i10);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f16003e = build;
            } else {
                this.f16003e = null;
            }
            this.f15999a = textPaint;
            this.f16000b = textDirectionHeuristic;
            this.f16001c = i10;
            this.f16002d = i11;
        }

        public boolean a(a aVar) {
            if (this.f16001c == aVar.b() && this.f16002d == aVar.c() && this.f15999a.getTextSize() == aVar.e().getTextSize() && this.f15999a.getTextScaleX() == aVar.e().getTextScaleX() && this.f15999a.getTextSkewX() == aVar.e().getTextSkewX() && this.f15999a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f15999a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f15999a.getFlags() == aVar.e().getFlags() && this.f15999a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f15999a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f15999a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f16001c;
        }

        public int c() {
            return this.f16002d;
        }

        public TextDirectionHeuristic d() {
            return this.f16000b;
        }

        public TextPaint e() {
            return this.f15999a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f16000b == aVar.d();
        }

        public int hashCode() {
            return y0.b.b(Float.valueOf(this.f15999a.getTextSize()), Float.valueOf(this.f15999a.getTextScaleX()), Float.valueOf(this.f15999a.getTextSkewX()), Float.valueOf(this.f15999a.getLetterSpacing()), Integer.valueOf(this.f15999a.getFlags()), this.f15999a.getTextLocales(), this.f15999a.getTypeface(), Boolean.valueOf(this.f15999a.isElegantTextHeight()), this.f16000b, Integer.valueOf(this.f16001c), Integer.valueOf(this.f16002d));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f15999a.getTextSize());
            sb2.append(", textScaleX=" + this.f15999a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f15999a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f15999a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f15999a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f15999a.getTextLocales());
            sb2.append(", typeface=" + this.f15999a.getTypeface());
            if (i10 >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f15999a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb2.append(sb3.toString());
            }
            sb2.append(", textDir=" + this.f16000b);
            sb2.append(", breakStrategy=" + this.f16001c);
            sb2.append(", hyphenationFrequency=" + this.f16002d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f15999a = textPaint;
            textDirection = params.getTextDirection();
            this.f16000b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f16001c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f16002d = hyphenationFrequency;
            this.f16003e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
