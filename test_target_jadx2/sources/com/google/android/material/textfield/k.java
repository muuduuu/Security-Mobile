package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
class k extends f {

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f27719e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.f f27720f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.g f27721g;

    class a extends com.google.android.material.internal.l {
        a() {
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            k.this.f27685c.setChecked(!r1.g());
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            k.this.f27685c.setChecked(!r0.g());
            editText.removeTextChangedListener(k.this.f27719e);
            editText.addTextChangedListener(k.this.f27719e);
        }
    }

    class c implements TextInputLayout.g {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EditText f27725a;

            a(EditText editText) {
                this.f27725a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27725a.removeTextChangedListener(k.this.f27719e);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = k.this.f27683a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (k.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            k.this.f27683a.U();
        }
    }

    k(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f27719e = new a();
        this.f27720f = new b();
        this.f27721g = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.f27683a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.f
    void a() {
        TextInputLayout textInputLayout = this.f27683a;
        int i10 = this.f27686d;
        if (i10 == 0) {
            i10 = H7.e.f3223a;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f27683a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(H7.j.f3323t));
        this.f27683a.setEndIconVisible(true);
        this.f27683a.setEndIconCheckable(true);
        this.f27683a.setEndIconOnClickListener(new d());
        this.f27683a.g(this.f27720f);
        this.f27683a.h(this.f27721g);
        EditText editText = this.f27683a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
