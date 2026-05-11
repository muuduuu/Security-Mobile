package com.facebook.react.views.textinput;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.C1410l;
import androidx.core.view.AbstractC1484a0;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.C1948i0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import com.facebook.react.uimanager.events.EventDispatcher;
import e5.EnumC3081c;
import e5.EnumC3083e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import o5.C3756a;
import r4.AbstractC4012a;
import x4.C5109a;

/* renamed from: com.facebook.react.views.textinput.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1992j extends C1410l {

    /* renamed from: l0, reason: collision with root package name */
    public static final boolean f22924l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final KeyListener f22925m0;

    /* renamed from: A, reason: collision with root package name */
    private boolean f22926A;

    /* renamed from: B, reason: collision with root package name */
    private String f22927B;

    /* renamed from: C, reason: collision with root package name */
    private int f22928C;

    /* renamed from: D, reason: collision with root package name */
    private int f22929D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f22930E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f22931F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f22932G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f22933H;

    /* renamed from: I, reason: collision with root package name */
    private String f22934I;

    /* renamed from: J, reason: collision with root package name */
    private e5.k f22935J;

    /* renamed from: K, reason: collision with root package name */
    private final com.facebook.react.views.view.g f22936K;

    /* renamed from: g, reason: collision with root package name */
    private final InputMethodManager f22937g;

    /* renamed from: h, reason: collision with root package name */
    private final String f22938h;

    /* renamed from: h0, reason: collision with root package name */
    private E0 f22939h0;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f22940i;

    /* renamed from: i0, reason: collision with root package name */
    protected boolean f22941i0;

    /* renamed from: j, reason: collision with root package name */
    private final int f22942j;

    /* renamed from: j0, reason: collision with root package name */
    protected boolean f22943j0;

    /* renamed from: k, reason: collision with root package name */
    private final int f22944k;

    /* renamed from: k0, reason: collision with root package name */
    private EventDispatcher f22945k0;

    /* renamed from: l, reason: collision with root package name */
    protected int f22946l;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f22947m;

    /* renamed from: n, reason: collision with root package name */
    private d f22948n;

    /* renamed from: o, reason: collision with root package name */
    private int f22949o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f22950p;

    /* renamed from: q, reason: collision with root package name */
    private String f22951q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f22952r;

    /* renamed from: s, reason: collision with root package name */
    private String f22953s;

    /* renamed from: t, reason: collision with root package name */
    private K f22954t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC1983a f22955u;

    /* renamed from: v, reason: collision with root package name */
    private J f22956v;

    /* renamed from: w, reason: collision with root package name */
    private c f22957w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f22958x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f22959y;

    /* renamed from: z, reason: collision with root package name */
    private com.facebook.react.views.text.r f22960z;

    /* renamed from: com.facebook.react.views.textinput.j$a */
    class a extends C1948i0 {
        a(View view, boolean z10, int i10) {
            super(view, z10, i10);
        }

        @Override // com.facebook.react.uimanager.C1948i0, androidx.core.view.C1483a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            int length = C1992j.this.getText().length();
            if (length > 0) {
                C1992j.this.setSelection(length);
            }
            return C1992j.this.R();
        }
    }

    /* renamed from: com.facebook.react.views.textinput.j$b */
    class b implements ActionMode.Callback {
        b() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (C1992j.this.f22931F) {
                return false;
            }
            menu.removeItem(R.id.pasteAsPlainText);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return true;
        }
    }

    /* renamed from: com.facebook.react.views.textinput.j$c */
    private static class c implements KeyListener {

        /* renamed from: a, reason: collision with root package name */
        private int f22963a = 0;

        public void a(int i10) {
            this.f22963a = i10;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i10) {
            C1992j.f22925m0.clearMetaKeyState(view, editable, i10);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f22963a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
            return C1992j.f22925m0.onKeyDown(view, editable, i10, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return C1992j.f22925m0.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
            return C1992j.f22925m0.onKeyUp(view, editable, i10, keyEvent);
        }
    }

    /* renamed from: com.facebook.react.views.textinput.j$d */
    private class d implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C1992j c1992j = C1992j.this;
            if (c1992j.f22940i || c1992j.f22947m == null) {
                return;
            }
            Iterator it = C1992j.this.f22947m.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C1992j c1992j = C1992j.this;
            if (c1992j.f22940i || c1992j.f22947m == null) {
                return;
            }
            Iterator it = C1992j.this.f22947m.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i10, i11, i12);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (C1992j.f22924l0) {
                AbstractC1721a.m(C1992j.this.f22938h, "onTextChanged[" + C1992j.this.getId() + "]: " + ((Object) charSequence) + " " + i10 + " " + i11 + " " + i12);
            }
            C1992j c1992j = C1992j.this;
            if (!c1992j.f22940i && c1992j.f22947m != null) {
                Iterator it = C1992j.this.f22947m.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i10, i11, i12);
                }
            }
            C1992j.this.c0();
            C1992j.this.P();
        }

        private d() {
        }
    }

    static {
        C5109a c5109a = C5109a.f44774a;
        f22924l0 = false;
        f22925m0 = QwertyKeyListener.getInstanceForFullKeyboard();
    }

    public C1992j(Context context) {
        super(context);
        this.f22938h = C1992j.class.getSimpleName();
        this.f22951q = null;
        this.f22958x = false;
        this.f22959y = false;
        this.f22926A = false;
        this.f22927B = null;
        this.f22928C = -1;
        this.f22929D = -1;
        this.f22930E = false;
        this.f22931F = false;
        this.f22932G = false;
        this.f22933H = false;
        this.f22934I = null;
        this.f22935J = e5.k.VISIBLE;
        this.f22939h0 = null;
        this.f22941i0 = false;
        this.f22943j0 = false;
        setFocusableInTouchMode(false);
        this.f22936K = new com.facebook.react.views.view.g(this);
        this.f22937g = (InputMethodManager) AbstractC4012a.c(context.getSystemService("input_method"));
        this.f22942j = getGravity() & 8388615;
        this.f22944k = getGravity() & 112;
        this.f22946l = 0;
        this.f22940i = false;
        this.f22952r = false;
        this.f22947m = null;
        this.f22948n = null;
        this.f22949o = getInputType();
        if (this.f22957w == null) {
            this.f22957w = new c();
        }
        this.f22956v = null;
        this.f22960z = new com.facebook.react.views.text.r();
        t();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27) {
            setLayerType(1, null);
        }
        AbstractC1484a0.q0(this, new a(this, isFocusable(), getImportantForAccessibility()));
        b bVar = new b();
        setCustomSelectionActionModeCallback(bVar);
        setCustomInsertionActionModeCallback(bVar);
    }

    private boolean B() {
        return (getInputType() & 144) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean C(o5.d dVar) {
        return dVar.getSize() == this.f22960z.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean D(o5.e eVar) {
        return eVar.getBackgroundColor() == this.f22936K.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean E(o5.g gVar) {
        return gVar.getForegroundColor() == getCurrentTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean F(o5.j jVar) {
        return (getPaintFlags() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean G(o5.l lVar) {
        return (getPaintFlags() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean H(C3756a c3756a) {
        return c3756a.b() == this.f22960z.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean I(o5.c cVar) {
        return cVar.c() == this.f22929D && Objects.equals(cVar.a(), this.f22927B) && cVar.d() == this.f22928C && Objects.equals(cVar.b(), getFontFeatureSettings());
    }

    private void J(SpannableStringBuilder spannableStringBuilder) {
        for (Object obj : getText().getSpans(0, length(), Object.class)) {
            int spanFlags = getText().getSpanFlags(obj);
            boolean z10 = (spanFlags & 33) == 33;
            if (obj instanceof o5.i) {
                getText().removeSpan(obj);
            }
            if (z10) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (S(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        InterfaceC1983a interfaceC1983a = this.f22955u;
        if (interfaceC1983a != null) {
            interfaceC1983a.a();
        }
        W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R() {
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            Z();
        }
        return requestFocus;
    }

    private static boolean S(Editable editable, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        if (i10 > spannableStringBuilder.length() || i11 > spannableStringBuilder.length()) {
            return false;
        }
        while (i10 < i11) {
            if (editable.charAt(i10) != spannableStringBuilder.charAt(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private void W() {
        ReactContext d10 = L0.d(this);
        if (this.f22939h0 != null || d10.isBridgeless()) {
            return;
        }
        r rVar = new r(this);
        UIManagerModule uIManagerModule = (UIManagerModule) d10.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), rVar);
        }
    }

    private void a0(SpannableStringBuilder spannableStringBuilder, Class cls, y0.g gVar) {
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
            if (gVar.a(obj)) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
    }

    private void b0(SpannableStringBuilder spannableStringBuilder) {
        a0(spannableStringBuilder, o5.d.class, new y0.g() { // from class: com.facebook.react.views.textinput.c
            @Override // y0.g
            public final boolean a(Object obj) {
                boolean C10;
                C10 = C1992j.this.C((o5.d) obj);
                return C10;
            }
        });
        a0(spannableStringBuilder, o5.e.class, new y0.g() { // from class: com.facebook.react.views.textinput.d
            @Override // y0.g
            public final boolean a(Object obj) {
                boolean D10;
                D10 = C1992j.this.D((o5.e) obj);
                return D10;
            }
        });
        a0(spannableStringBuilder, o5.g.class, new y0.g() { // from class: com.facebook.react.views.textinput.e
            @Override // y0.g
            public final boolean a(Object obj) {
                boolean E10;
                E10 = C1992j.this.E((o5.g) obj);
                return E10;
            }
        });
        a0(spannableStringBuilder, o5.j.class, new y0.g() { // from class: com.facebook.react.views.textinput.f
            @Override // y0.g
            public final boolean a(Object obj) {
                boolean F10;
                F10 = C1992j.this.F((o5.j) obj);
                return F10;
            }
        });
        a0(spannableStringBuilder, o5.l.class, new y0.g() { // from class: com.facebook.react.views.textinput.g
            @Override // y0.g
            public final boolean a(Object obj) {
                boolean G10;
                G10 = C1992j.this.G((o5.l) obj);
                return G10;
            }
        });
        a0(spannableStringBuilder, C3756a.class, new y0.g() { // from class: com.facebook.react.views.textinput.h
            @Override // y0.g
            public final boolean a(Object obj) {
                boolean H10;
                H10 = C1992j.this.H((C3756a) obj);
                return H10;
            }
        });
        a0(spannableStringBuilder, o5.c.class, new y0.g() { // from class: com.facebook.react.views.textinput.i
            @Override // y0.g
            public final boolean a(Object obj) {
                boolean I10;
                I10 = C1992j.this.I((o5.c) obj);
                return I10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        if (this.f22939h0 == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z10 = text != null && text.length() > 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e10) {
                ReactSoftExceptionLogger.logSoftException(this.f22938h, e10);
            }
        }
        if (!z10) {
            if (getHint() == null || getHint().length() <= 0) {
                spannableStringBuilder.append("I");
            } else {
                spannableStringBuilder.append(getHint());
            }
        }
        s(spannableStringBuilder);
        com.facebook.react.views.text.s.m(getId(), spannableStringBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d0() {
        int i10 = 5;
        String str = this.f22953s;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "previous":
                    i10 = 7;
                    break;
                case "search":
                    i10 = 3;
                    break;
                case "go":
                    i10 = 2;
                    break;
                case "none":
                    i10 = 1;
                    break;
                case "send":
                    i10 = 4;
                    break;
            }
            if (this.f22952r) {
                setImeOptions(i10);
                return;
            } else {
                setImeOptions(i10 | 33554432);
                return;
            }
        }
        i10 = 6;
        if (this.f22952r) {
        }
    }

    private d getTextWatcherDelegator() {
        if (this.f22948n == null) {
            this.f22948n = new d();
        }
        return this.f22948n;
    }

    private void s(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new o5.d(this.f22960z.c()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new o5.g(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        int b10 = this.f22936K.b();
        if (b10 != 0) {
            spannableStringBuilder.setSpan(new o5.e(b10), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new o5.j(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new o5.l(), 0, spannableStringBuilder.length(), 16711698);
        }
        float d10 = this.f22960z.d();
        if (!Float.isNaN(d10)) {
            spannableStringBuilder.setSpan(new C3756a(d10), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.f22929D != -1 || this.f22928C != -1 || this.f22927B != null || getFontFeatureSettings() != null) {
            spannableStringBuilder.setSpan(new o5.c(this.f22929D, this.f22928C, getFontFeatureSettings(), this.f22927B, getContext().getAssets()), 0, spannableStringBuilder.length(), 16711698);
        }
        float e10 = this.f22960z.e();
        if (Float.isNaN(e10)) {
            return;
        }
        spannableStringBuilder.setSpan(new o5.b(e10), 0, spannableStringBuilder.length(), 16711698);
    }

    private int v(int i10) {
        return Math.max(0, Math.min(i10, getText() == null ? 0 : getText().length()));
    }

    boolean A() {
        return (getInputType() & 131072) != 0;
    }

    public void K(int i10, int i11, int i12) {
        if (!u(i10) || i11 == -1 || i12 == -1) {
            return;
        }
        setSelection(v(i11), v(i12));
    }

    public void L(com.facebook.react.views.text.i iVar) {
        if (!(B() && TextUtils.equals(getText(), iVar.i())) && u(iVar.c())) {
            if (f22924l0) {
                AbstractC1721a.m(this.f22938h, "maybeSetText[" + getId() + "]: current text: " + ((Object) getText()) + " update: " + ((Object) iVar.i()));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(iVar.i());
            J(spannableStringBuilder);
            b0(spannableStringBuilder);
            this.f22950p = iVar.b();
            this.f22941i0 = true;
            if (iVar.i().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.f22941i0 = false;
            if (getBreakStrategy() != iVar.k()) {
                setBreakStrategy(iVar.k());
            }
            c0();
        }
    }

    public void M(com.facebook.react.views.text.i iVar) {
        this.f22940i = true;
        L(iVar);
        this.f22940i = false;
    }

    public void N(com.facebook.react.views.text.i iVar) {
        this.f22943j0 = true;
        L(iVar);
        this.f22943j0 = false;
    }

    public void O() {
        if (this.f22926A) {
            this.f22926A = false;
            setTypeface(com.facebook.react.views.text.o.a(getTypeface(), this.f22929D, this.f22928C, this.f22927B, getContext().getAssets()));
            if (this.f22929D == -1 && this.f22928C == -1 && this.f22927B == null && getFontFeatureSettings() == null) {
                setPaintFlags(getPaintFlags() & (-129));
            } else {
                setPaintFlags(getPaintFlags() | 128);
            }
        }
    }

    public void Q() {
        R();
    }

    public void T(int i10, Integer num) {
        if (G4.a.c()) {
            C1931a.k(this, e5.j.values()[i10], num);
        } else {
            this.f22936K.f(i10, num);
        }
    }

    public void U(float f10, int i10) {
        if (G4.a.c()) {
            C1931a.l(this, EnumC3081c.values()[i10], Float.isNaN(f10) ? null : new X(C1944g0.e(f10), Y.POINT));
        } else {
            this.f22936K.h(f10, i10);
        }
    }

    public void V(int i10, float f10) {
        if (G4.a.c()) {
            C1931a.n(this, e5.j.values()[i10], Float.valueOf(C1944g0.e(f10)));
        } else {
            this.f22936K.j(i10, f10);
        }
    }

    public boolean X() {
        String submitBehavior = getSubmitBehavior();
        return submitBehavior == null ? !A() : submitBehavior.equals("blurAndSubmit");
    }

    public boolean Y() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (A()) {
                return false;
            }
        } else if (!submitBehavior.equals("submit") && !submitBehavior.equals("blurAndSubmit")) {
            return false;
        }
        return true;
    }

    protected boolean Z() {
        return this.f22937g.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f22947m == null) {
            this.f22947m = new ArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f22947m.add(textWatcher);
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        y();
    }

    protected void finalize() {
        if (f22924l0) {
            AbstractC1721a.m(this.f22938h, "finalize[" + getId() + "] delete cached spannable");
        }
        com.facebook.react.views.text.s.f(getId());
    }

    public boolean getDisableFullscreenUI() {
        return this.f22952r;
    }

    int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public String getReturnKeyType() {
        return this.f22953s;
    }

    int getStagedInputType() {
        return this.f22949o;
    }

    public E0 getStateWrapper() {
        return this.f22939h0;
    }

    public String getSubmitBehavior() {
        return this.f22951q;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f22950p) {
            Editable text = getText();
            for (o5.o oVar : (o5.o[]) text.getSpans(0, text.length(), o5.o.class)) {
                if (oVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setTextIsSelectable(true);
        if (this.f22950p) {
            Editable text = getText();
            for (o5.o oVar : (o5.o[]) text.getSpans(0, text.length(), o5.o.class)) {
                oVar.c();
            }
        }
        if (this.f22930E && !this.f22932G) {
            R();
        }
        this.f22932G = true;
    }

    @Override // androidx.appcompat.widget.C1410l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext d10 = L0.d(this);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.f22959y) {
            onCreateInputConnection = new l(onCreateInputConnection, d10, this, this.f22945k0);
        }
        if (A() && (X() || Y())) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    @Override // androidx.appcompat.widget.C1410l, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f22950p) {
            Editable text = getText();
            for (o5.o oVar : (o5.o[]) text.getSpans(0, text.length(), o5.o.class)) {
                oVar.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!G4.a.c()) {
            this.f22936K.d(canvas);
        } else if (this.f22935J != e5.k.VISIBLE) {
            C1931a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f22950p) {
            Editable text = getText();
            for (o5.o oVar : (o5.o[]) text.getSpans(0, text.length(), o5.o.class)) {
                oVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        K k10;
        super.onFocusChanged(z10, i10, rect);
        if (!z10 || (k10 = this.f22954t) == null) {
            return;
        }
        k10.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 66 || A()) {
            return super.onKeyUp(i10, keyEvent);
        }
        y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        P();
        if (this.f22933H && isFocused()) {
            selectAll();
            this.f22933H = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        J j10 = this.f22956v;
        if (j10 != null) {
            j10.a(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i10, int i11) {
        if (f22924l0) {
            AbstractC1721a.m(this.f22938h, "onSelectionChanged[" + getId() + "]: " + i10 + " " + i11);
        }
        super.onSelectionChanged(i10, i11);
        if (this.f22954t == null || !hasFocus()) {
            return;
        }
        this.f22954t.a(i10, i11);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f22950p) {
            Editable text = getText();
            for (o5.o oVar : (o5.o[]) text.getSpans(0, text.length(), o5.o.class)) {
                oVar.f();
            }
        }
    }

    @Override // androidx.appcompat.widget.C1410l, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            i10 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22958x = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f22958x) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f22958x = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList = this.f22947m;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.f22947m.isEmpty()) {
                this.f22947m = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        return isFocused();
    }

    public void setAllowFontScaling(boolean z10) {
        if (this.f22960z.b() != z10) {
            this.f22960z.m(z10);
            t();
        }
    }

    public void setAutoFocus(boolean z10) {
        this.f22930E = z10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (G4.a.c()) {
            C1931a.i(this, Integer.valueOf(i10));
        } else {
            this.f22936K.e(i10);
        }
    }

    public void setBorderRadius(float f10) {
        U(f10, EnumC3081c.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        if (G4.a.c()) {
            C1931a.m(this, str == null ? null : EnumC3083e.fromString(str));
        } else {
            this.f22936K.i(str);
        }
    }

    public void setContentSizeWatcher(InterfaceC1983a interfaceC1983a) {
        this.f22955u = interfaceC1983a;
    }

    public void setContextMenuHidden(boolean z10) {
        this.f22931F = z10;
    }

    public void setDisableFullscreenUI(boolean z10) {
        this.f22952r = z10;
        d0();
    }

    void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.f22945k0 = eventDispatcher;
    }

    public void setFontFamily(String str) {
        this.f22927B = str;
        this.f22926A = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (Objects.equals(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.f22926A = true;
    }

    public void setFontSize(float f10) {
        this.f22960z.n(f10);
        t();
    }

    public void setFontStyle(String str) {
        int b10 = com.facebook.react.views.text.o.b(str);
        if (b10 != this.f22929D) {
            this.f22929D = b10;
            this.f22926A = true;
        }
    }

    public void setFontWeight(String str) {
        int d10 = com.facebook.react.views.text.o.d(str);
        if (d10 != this.f22928C) {
            this.f22928C = d10;
            this.f22926A = true;
        }
    }

    void setGravityHorizontal(int i10) {
        if (i10 == 0) {
            i10 = this.f22942j;
        }
        setGravity(i10 | (getGravity() & (-8388616)));
    }

    void setGravityVertical(int i10) {
        if (i10 == 0) {
            i10 = this.f22944k;
        }
        setGravity(i10 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i10);
        this.f22949o = i10;
        super.setTypeface(typeface);
        if (A()) {
            setSingleLine(false);
        }
        if (this.f22957w == null) {
            this.f22957w = new c();
        }
        this.f22957w.a(i10);
        setKeyListener(this.f22957w);
    }

    public void setLetterSpacingPt(float f10) {
        this.f22960z.p(f10);
        t();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        this.f22960z.q(i10);
    }

    public void setMaxFontSizeMultiplier(float f10) {
        if (f10 != this.f22960z.k()) {
            this.f22960z.r(f10);
            t();
        }
    }

    public void setOnKeyPress(boolean z10) {
        this.f22959y = z10;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f22935J = e5.k.VISIBLE;
        } else {
            e5.k fromString = e5.k.fromString(str);
            if (fromString == null) {
                fromString = e5.k.VISIBLE;
            }
            this.f22935J = fromString;
        }
        this.f22936K.k(str);
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.f22934I)) {
            return;
        }
        this.f22934I = str;
        setHint(str);
    }

    public void setReturnKeyType(String str) {
        this.f22953s = str;
        d0();
    }

    public void setScrollWatcher(J j10) {
        this.f22956v = j10;
    }

    public void setSelectTextOnFocus(boolean z10) {
        super.setSelectAllOnFocus(z10);
        this.f22933H = z10;
    }

    @Override // android.widget.EditText
    public void setSelection(int i10, int i11) {
        if (f22924l0) {
            AbstractC1721a.m(this.f22938h, "setSelection[" + getId() + "]: " + i10 + " " + i11);
        }
        super.setSelection(i10, i11);
    }

    public void setSelectionWatcher(K k10) {
        this.f22954t = k10;
    }

    void setStagedInputType(int i10) {
        this.f22949o = i10;
    }

    public void setStateWrapper(E0 e02) {
        this.f22939h0 = e02;
    }

    public void setSubmitBehavior(String str) {
        this.f22951q = str;
    }

    protected void t() {
        setTextSize(0, this.f22960z.c());
        float d10 = this.f22960z.d();
        if (Float.isNaN(d10)) {
            return;
        }
        setLetterSpacing(d10);
    }

    public boolean u(int i10) {
        return i10 >= this.f22946l;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f22950p) {
            Editable text = getText();
            for (o5.o oVar : (o5.o[]) text.getSpans(0, text.length(), o5.o.class)) {
                if (oVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    void w() {
        clearFocus();
    }

    void x() {
        if (getInputType() != this.f22949o) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f22949o);
            setSelection(selectionStart, selectionEnd);
        }
    }

    protected void y() {
        this.f22937g.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int z() {
        int i10 = this.f22946l + 1;
        this.f22946l = i10;
        return i10;
    }
}
