package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import g.AbstractC3175f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    private SearchView f29935a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f29936b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f29937c;

    public U(SearchView searchView) {
        Intrinsics.checkNotNullParameter(searchView, "searchView");
        this.f29935a = searchView;
    }

    private final ImageView a() {
        return (ImageView) this.f29935a.findViewById(AbstractC3175f.f33201z);
    }

    private final EditText b() {
        View findViewById = this.f29935a.findViewById(AbstractC3175f.f33163E);
        if (findViewById instanceof EditText) {
            return (EditText) findViewById;
        }
        return null;
    }

    private final ImageView c() {
        return (ImageView) this.f29935a.findViewById(AbstractC3175f.f33200y);
    }

    private final View d() {
        return this.f29935a.findViewById(AbstractC3175f.f33162D);
    }

    public final void e(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            c().setColorFilter(intValue);
            a().setColorFilter(intValue);
        }
    }

    public final void f(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            EditText b10 = b();
            if (b10 != null) {
                b10.setHintTextColor(intValue);
            }
        }
    }

    public final void g(String placeholder, boolean z10) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        if (z10) {
            this.f29935a.setQueryHint(placeholder);
            return;
        }
        EditText b10 = b();
        if (b10 == null) {
            return;
        }
        b10.setHint(placeholder);
    }

    public final void h(Integer num) {
        EditText b10;
        ColorStateList textColors;
        Integer num2 = this.f29936b;
        if (num == null) {
            if (num2 == null || (b10 = b()) == null) {
                return;
            }
            b10.setTextColor(num2.intValue());
            return;
        }
        if (num2 == null) {
            EditText b11 = b();
            this.f29936b = (b11 == null || (textColors = b11.getTextColors()) == null) ? null : Integer.valueOf(textColors.getDefaultColor());
        }
        EditText b12 = b();
        if (b12 != null) {
            b12.setTextColor(num.intValue());
        }
    }

    public final void i(Integer num) {
        Drawable drawable = this.f29937c;
        if (num != null) {
            if (drawable == null) {
                this.f29937c = d().getBackground();
            }
            d().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            d().setBackground(drawable);
        }
    }
}
