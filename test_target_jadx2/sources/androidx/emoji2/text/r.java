package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
class r implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16583a = false;

    /* renamed from: b, reason: collision with root package name */
    private Spannable f16584b;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.n;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.r.b
        boolean a(CharSequence charSequence) {
            return s.a(charSequence) || (charSequence instanceof androidx.core.text.n);
        }
    }

    r(Spannable spannable) {
        this.f16584b = spannable;
    }

    private void a() {
        Spannable spannable = this.f16584b;
        if (!this.f16583a && c().a(spannable)) {
            this.f16584b = new SpannableString(spannable);
        }
        this.f16583a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f16584b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f16584b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f16584b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f16584b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f16584b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f16584b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f16584b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f16584b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f16584b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f16584b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f16584b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f16584b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f16584b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f16584b.toString();
    }

    r(CharSequence charSequence) {
        this.f16584b = new SpannableString(charSequence);
    }
}
