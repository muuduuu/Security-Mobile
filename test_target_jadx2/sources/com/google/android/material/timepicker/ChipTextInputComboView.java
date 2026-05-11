package com.google.android.material.timepicker;

import H7.f;
import H7.h;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    private final Chip f27736a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputLayout f27737b;

    /* renamed from: c, reason: collision with root package name */
    private final EditText f27738c;

    /* renamed from: d, reason: collision with root package name */
    private TextWatcher f27739d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f27740e;

    private class b extends l {
        private b() {
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f27736a.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f27736a.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return c.a(getResources(), charSequence);
    }

    private void d() {
        this.f27738c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f27736a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f27736a.setChecked(z10);
        this.f27738c.setVisibility(z10 ? 0 : 4);
        this.f27736a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            o.h(this.f27738c);
            if (TextUtils.isEmpty(this.f27738c.getText())) {
                return;
            }
            EditText editText = this.f27738c;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f27736a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f27736a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f27736a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(h.f3289l, (ViewGroup) this, false);
        this.f27736a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(h.f3290m, (ViewGroup) this, false);
        this.f27737b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f27738c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f27739d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f27740e = (TextView) findViewById(f.f3262n);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
