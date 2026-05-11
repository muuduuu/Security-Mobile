package com.facebook.react.views.textinput;

import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.AbstractC1484a0;
import c3.AbstractC1721a;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.R0;
import r4.AbstractC4012a;

/* loaded from: classes2.dex */
public class H extends com.facebook.react.views.text.c implements com.facebook.yoga.o {

    /* renamed from: b0, reason: collision with root package name */
    private int f22889b0;

    /* renamed from: c0, reason: collision with root package name */
    private EditText f22890c0;

    /* renamed from: d0, reason: collision with root package name */
    private r f22891d0;

    /* renamed from: e0, reason: collision with root package name */
    private String f22892e0;

    /* renamed from: f0, reason: collision with root package name */
    private String f22893f0;

    public H(com.facebook.react.views.text.n nVar) {
        super(nVar);
        this.f22889b0 = -1;
        this.f22892e0 = null;
        this.f22893f0 = null;
        this.f22766J = 1;
        B1();
    }

    private void B1() {
        Y0(this);
    }

    @Override // com.facebook.react.uimanager.C1971u0
    public void A0(R0 r02) {
        super.A0(r02);
        if (this.f22889b0 != -1) {
            r02.O(r(), new com.facebook.react.views.text.i(x1(this, A1(), false, null), this.f22889b0, this.f22782Z, l0(0), l0(1), l0(2), l0(3), this.f22765I, this.f22766J, this.f22768L));
        }
    }

    public String A1() {
        return this.f22892e0;
    }

    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    public void B(F0 f02) {
        super.B(f02);
        EditText y12 = y1();
        K0(4, AbstractC1484a0.F(y12));
        K0(1, y12.getPaddingTop());
        K0(5, AbstractC1484a0.E(y12));
        K0(3, y12.getPaddingBottom());
        this.f22890c0 = y12;
        y12.setPadding(0, 0, 0, 0);
        this.f22890c0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    public void G(Object obj) {
        AbstractC4012a.a(obj instanceof r);
        this.f22891d0 = (r) obj;
        i();
    }

    @Override // com.facebook.yoga.o
    public long W(com.facebook.yoga.r rVar, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2) {
        EditText editText = (EditText) AbstractC4012a.c(this.f22890c0);
        r rVar2 = this.f22891d0;
        if (rVar2 != null) {
            rVar2.a(editText);
        } else {
            editText.setTextSize(0, this.f22757A.c());
            int i10 = this.f22764H;
            if (i10 != -1) {
                editText.setLines(i10);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i11 = this.f22766J;
            if (breakStrategy != i11) {
                editText.setBreakStrategy(i11);
            }
        }
        editText.setHint(z1());
        editText.measure(com.facebook.react.views.view.e.a(f10, pVar), com.facebook.react.views.view.e.a(f11, pVar2));
        return com.facebook.yoga.q.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Z4.a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i10) {
        this.f22889b0 = i10;
    }

    @Z4.a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.f22893f0 = str;
        y0();
    }

    @Z4.a(name = "text")
    public void setText(String str) {
        this.f22892e0 = str;
        y0();
    }

    @Override // com.facebook.react.views.text.c
    public void setTextBreakStrategy(String str) {
        if (str == null || "simple".equals(str)) {
            this.f22766J = 0;
            return;
        }
        if ("highQuality".equals(str)) {
            this.f22766J = 1;
            return;
        }
        if ("balanced".equals(str)) {
            this.f22766J = 2;
            return;
        }
        AbstractC1721a.J("ReactNative", "Invalid textBreakStrategy: " + str);
        this.f22766J = 0;
    }

    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    public void v(int i10, float f10) {
        super.v(i10, f10);
        y0();
    }

    @Override // com.facebook.react.uimanager.C1971u0
    public boolean v0() {
        return true;
    }

    @Override // com.facebook.react.uimanager.C1971u0
    public boolean w0() {
        return true;
    }

    protected EditText y1() {
        return new EditText(new androidx.appcompat.view.d(H(), com.facebook.react.r.f21958g));
    }

    public String z1() {
        return this.f22893f0;
    }

    public H() {
        this(null);
    }
}
