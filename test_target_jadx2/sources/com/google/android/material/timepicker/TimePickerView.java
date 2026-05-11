package com.google.android.material.timepicker;

import H7.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Chip f27776a;

    /* renamed from: b, reason: collision with root package name */
    private final Chip f27777b;

    /* renamed from: c, reason: collision with root package name */
    private final ClockHandView f27778c;

    /* renamed from: d, reason: collision with root package name */
    private final ClockFaceView f27779d;

    /* renamed from: e, reason: collision with root package name */
    private final MaterialButtonToggleGroup f27780e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnClickListener f27781f;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.i(TimePickerView.this);
        }
    }

    class b implements MaterialButtonToggleGroup.d {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            TimePickerView.p(TimePickerView.this);
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.q(TimePickerView.this);
            return false;
        }
    }

    class d implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f27785a;

        d(GestureDetector gestureDetector) {
            this.f27785a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f27785a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface e {
    }

    interface f {
    }

    interface g {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ g i(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ f p(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ e q(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void r() {
        this.f27776a.setTag(H7.f.f3238I, 12);
        this.f27777b.setTag(H7.f.f3238I, 10);
        this.f27776a.setOnClickListener(this.f27781f);
        this.f27777b.setOnClickListener(this.f27781f);
        this.f27776a.setAccessibilityClassName("android.view.View");
        this.f27777b.setAccessibilityClassName("android.view.View");
    }

    private void s() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f27776a.setOnTouchListener(dVar);
        this.f27777b.setOnTouchListener(dVar);
    }

    private void t() {
        if (this.f27780e.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.g(this);
            dVar.e(H7.f.f3257i, AbstractC1484a0.A(this) == 0 ? 2 : 1);
            dVar.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            t();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27781f = new a();
        LayoutInflater.from(context).inflate(h.f3291n, this);
        this.f27779d = (ClockFaceView) findViewById(H7.f.f3258j);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(H7.f.f3260l);
        this.f27780e = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.f27776a = (Chip) findViewById(H7.f.f3263o);
        this.f27777b = (Chip) findViewById(H7.f.f3261m);
        this.f27778c = (ClockHandView) findViewById(H7.f.f3259k);
        s();
        r();
    }
}
