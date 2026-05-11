package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
class a implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private int f27787a;

    public a(int i10) {
        this.f27787a = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f27787a) {
                return null;
            }
            return BuildConfig.FLAVOR;
        } catch (NumberFormatException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
