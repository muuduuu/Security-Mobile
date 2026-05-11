package com.facebook.react.views.textinput;

import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final SpannableStringBuilder f22973a;

    /* renamed from: b, reason: collision with root package name */
    private final float f22974b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22975c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22976d;

    /* renamed from: e, reason: collision with root package name */
    private final int f22977e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22978f;

    /* renamed from: g, reason: collision with root package name */
    private final CharSequence f22979g;

    public r(EditText editText) {
        this.f22973a = new SpannableStringBuilder(editText.getText());
        this.f22974b = editText.getTextSize();
        this.f22977e = editText.getInputType();
        this.f22979g = editText.getHint();
        this.f22975c = editText.getMinLines();
        this.f22976d = editText.getMaxLines();
        this.f22978f = editText.getBreakStrategy();
    }

    public void a(EditText editText) {
        editText.setText(this.f22973a);
        editText.setTextSize(0, this.f22974b);
        editText.setMinLines(this.f22975c);
        editText.setMaxLines(this.f22976d);
        editText.setInputType(this.f22977e);
        editText.setHint(this.f22979g);
        editText.setBreakStrategy(this.f22978f);
    }
}
