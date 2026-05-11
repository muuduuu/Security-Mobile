package com.google.android.material.theme;

import L7.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.t;
import androidx.appcompat.widget.C1402d;
import androidx.appcompat.widget.C1404f;
import androidx.appcompat.widget.C1405g;
import androidx.appcompat.widget.C1419v;
import androidx.appcompat.widget.D;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.i;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends t {
    @Override // androidx.appcompat.app.t
    protected C1402d c(Context context, AttributeSet attributeSet) {
        return new i(context, attributeSet);
    }

    @Override // androidx.appcompat.app.t
    protected C1404f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.t
    protected C1405g e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.t
    protected C1419v k(Context context, AttributeSet attributeSet) {
        return new U7.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.t
    protected D o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
