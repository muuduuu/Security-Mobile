package S0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f8680a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8681b;

    /* renamed from: c, reason: collision with root package name */
    private f.AbstractC0284f f8682c;

    /* renamed from: d, reason: collision with root package name */
    private int f8683d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f8684e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8685f = true;

    private static class a extends f.AbstractC0284f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f8686a;

        a(EditText editText) {
            this.f8686a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0284f
        public void b() {
            super.b();
            g.b((EditText) this.f8686a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f8680a = editText;
        this.f8681b = z10;
    }

    private f.AbstractC0284f a() {
        if (this.f8682c == null) {
            this.f8682c = new a(this.f8680a);
        }
        return this.f8682c;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f8685f && (this.f8681b || androidx.emoji2.text.f.i())) ? false : true;
    }

    public void c(boolean z10) {
        if (this.f8685f != z10) {
            if (this.f8682c != null) {
                androidx.emoji2.text.f.c().u(this.f8682c);
            }
            this.f8685f = z10;
            if (z10) {
                b(this.f8680a, androidx.emoji2.text.f.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f8680a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int e10 = androidx.emoji2.text.f.c().e();
        if (e10 != 0) {
            if (e10 == 1) {
                androidx.emoji2.text.f.c().s((Spannable) charSequence, i10, i10 + i12, this.f8683d, this.f8684e);
                return;
            } else if (e10 != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
