package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C1414p;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import g.AbstractC3170a;
import z0.C5228A;

/* loaded from: classes2.dex */
public class CheckableImageButton extends C1414p implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f27149g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    private boolean f27150d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27151e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27152f;

    class a extends C1483a {
        a() {
        }

        @Override // androidx.core.view.C1483a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            c5228a.o0(CheckableImageButton.this.a());
            c5228a.p0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends F0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f27154c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f27154c = parcel.readInt() == 1;
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f27154c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33053A);
    }

    public boolean a() {
        return this.f27151e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f27150d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f27150d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f27149g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f27154c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f27154c = this.f27150d;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f27151e != z10) {
            this.f27151e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f27151e || this.f27150d == z10) {
            return;
        }
        this.f27150d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f27152f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f27152f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f27150d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27151e = true;
        this.f27152f = true;
        AbstractC1484a0.q0(this, new a());
    }
}
