package S0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f8669a;

    /* renamed from: b, reason: collision with root package name */
    private f.AbstractC0284f f8670b;

    private static class a extends f.AbstractC0284f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f8671a;

        /* renamed from: b, reason: collision with root package name */
        private final Reference f8672b;

        a(TextView textView, d dVar) {
            this.f8671a = new WeakReference(textView);
            this.f8672b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.f.AbstractC0284f
        public void b() {
            CharSequence text;
            CharSequence p10;
            super.b();
            TextView textView = (TextView) this.f8671a.get();
            if (c(textView, (InputFilter) this.f8672b.get()) && textView.isAttachedToWindow() && text != (p10 = androidx.emoji2.text.f.c().p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(p10);
                int selectionEnd = Selection.getSelectionEnd(p10);
                textView.setText(p10);
                if (p10 instanceof Spannable) {
                    d.b((Spannable) p10, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f8669a = textView;
    }

    private f.AbstractC0284f a() {
        if (this.f8670b == null) {
            this.f8670b = new a(this.f8669a, this);
        }
        return this.f8670b;
    }

    static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f8669a.isInEditMode()) {
            return charSequence;
        }
        int e10 = androidx.emoji2.text.f.c().e();
        if (e10 != 0) {
            if (e10 == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f8669a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.f.c().q(charSequence, 0, charSequence.length());
            }
            if (e10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.f.c().t(a());
        return charSequence;
    }
}
