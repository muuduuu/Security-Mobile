package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.I;
import androidx.core.view.K0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m;
import androidx.fragment.app.P;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import h.AbstractC3220a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class i<S> extends DialogInterfaceOnCancelListenerC1571m {

    /* renamed from: Z, reason: collision with root package name */
    static final Object f26958Z = "CONFIRM_BUTTON_TAG";

    /* renamed from: h0, reason: collision with root package name */
    static final Object f26959h0 = "CANCEL_BUTTON_TAG";

    /* renamed from: i0, reason: collision with root package name */
    static final Object f26960i0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: A, reason: collision with root package name */
    private int f26961A;

    /* renamed from: B, reason: collision with root package name */
    private CharSequence f26962B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f26963C;

    /* renamed from: D, reason: collision with root package name */
    private int f26964D;

    /* renamed from: E, reason: collision with root package name */
    private int f26965E;

    /* renamed from: F, reason: collision with root package name */
    private CharSequence f26966F;

    /* renamed from: G, reason: collision with root package name */
    private int f26967G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f26968H;

    /* renamed from: I, reason: collision with root package name */
    private TextView f26969I;

    /* renamed from: J, reason: collision with root package name */
    private CheckableImageButton f26970J;

    /* renamed from: K, reason: collision with root package name */
    private Y7.g f26971K;

    /* renamed from: X, reason: collision with root package name */
    private Button f26972X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f26973Y;

    /* renamed from: s, reason: collision with root package name */
    private final LinkedHashSet f26974s = new LinkedHashSet();

    /* renamed from: t, reason: collision with root package name */
    private final LinkedHashSet f26975t = new LinkedHashSet();

    /* renamed from: u, reason: collision with root package name */
    private final LinkedHashSet f26976u = new LinkedHashSet();

    /* renamed from: v, reason: collision with root package name */
    private final LinkedHashSet f26977v = new LinkedHashSet();

    /* renamed from: w, reason: collision with root package name */
    private int f26978w;

    /* renamed from: x, reason: collision with root package name */
    private o f26979x;

    /* renamed from: y, reason: collision with root package name */
    private com.google.android.material.datepicker.a f26980y;

    /* renamed from: z, reason: collision with root package name */
    private h f26981z;

    class a implements I {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26982a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f26983b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26984c;

        a(int i10, View view, int i11) {
            this.f26982a = i10;
            this.f26983b = view;
            this.f26984c = i11;
        }

        @Override // androidx.core.view.I
        public K0 p(View view, K0 k02) {
            int i10 = k02.f(K0.m.g()).f15925b;
            if (this.f26982a >= 0) {
                this.f26983b.getLayoutParams().height = this.f26982a + i10;
                View view2 = this.f26983b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f26983b;
            view3.setPadding(view3.getPaddingLeft(), this.f26984c + i10, this.f26983b.getPaddingRight(), this.f26983b.getPaddingBottom());
            return k02;
        }
    }

    class b extends n {
        b() {
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Button unused = i.this.f26972X;
            i.V(i.this);
            throw null;
        }
    }

    static /* synthetic */ d V(i iVar) {
        iVar.Z();
        return null;
    }

    private static Drawable X(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC3220a.b(context, H7.e.f3224b));
        stateListDrawable.addState(new int[0], AbstractC3220a.b(context, H7.e.f3225c));
        return stateListDrawable;
    }

    private void Y(Window window) {
        if (this.f26973Y) {
            return;
        }
        View findViewById = requireView().findViewById(H7.f.f3256h);
        com.google.android.material.internal.d.a(window, true, com.google.android.material.internal.o.c(findViewById), null);
        AbstractC1484a0.F0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.f26973Y = true;
    }

    private d Z() {
        android.support.v4.media.session.b.a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static int b0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(H7.d.f3174K);
        int i10 = k.e().f26994d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(H7.d.f3176M) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(H7.d.f3179P));
    }

    private int c0(Context context) {
        int i10 = this.f26978w;
        if (i10 != 0) {
            return i10;
        }
        Z();
        throw null;
    }

    private void d0(Context context) {
        this.f26970J.setTag(f26960i0);
        this.f26970J.setImageDrawable(X(context));
        this.f26970J.setChecked(this.f26964D != 0);
        AbstractC1484a0.q0(this.f26970J, null);
        j0(this.f26970J);
        this.f26970J.setOnClickListener(new c());
    }

    static boolean e0(Context context) {
        return g0(context, R.attr.windowFullscreen);
    }

    static boolean f0(Context context) {
        return g0(context, H7.b.f3114F);
    }

    static boolean g0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(V7.b.d(context, H7.b.f3109A, h.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    private void h0() {
        o oVar;
        int c02 = c0(requireContext());
        Z();
        this.f26981z = h.U(null, c02, this.f26980y);
        if (this.f26970J.isChecked()) {
            Z();
            oVar = j.G(null, c02, this.f26980y);
        } else {
            oVar = this.f26981z;
        }
        this.f26979x = oVar;
        i0();
        P n10 = getChildFragmentManager().n();
        n10.n(H7.f.f3273y, this.f26979x);
        n10.i();
        this.f26979x.E(new b());
    }

    private void i0() {
        String a02 = a0();
        this.f26969I.setContentDescription(String.format(getString(H7.j.f3316m), a02));
        this.f26969I.setText(a02);
    }

    private void j0(CheckableImageButton checkableImageButton) {
        this.f26970J.setContentDescription(this.f26970J.isChecked() ? checkableImageButton.getContext().getString(H7.j.f3319p) : checkableImageButton.getContext().getString(H7.j.f3321r));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m
    public final Dialog M(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), c0(requireContext()));
        Context context = dialog.getContext();
        this.f26963C = e0(context);
        int d10 = V7.b.d(context, H7.b.f3143p, i.class.getCanonicalName());
        Y7.g gVar = new Y7.g(context, null, H7.b.f3109A, H7.k.f3347w);
        this.f26971K = gVar;
        gVar.M(context);
        this.f26971K.X(ColorStateList.valueOf(d10));
        this.f26971K.W(AbstractC1484a0.v(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public String a0() {
        Z();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f26976u.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, androidx.fragment.app.ComponentCallbacksC1573o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f26978w = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f26980y = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f26961A = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f26962B = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f26964D = bundle.getInt("INPUT_MODE_KEY");
        this.f26965E = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f26966F = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f26967G = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f26968H = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f26963C ? H7.h.f3302y : H7.h.f3301x, viewGroup);
        Context context = inflate.getContext();
        if (this.f26963C) {
            inflate.findViewById(H7.f.f3273y).setLayoutParams(new LinearLayout.LayoutParams(b0(context), -2));
        } else {
            inflate.findViewById(H7.f.f3274z).setLayoutParams(new LinearLayout.LayoutParams(b0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(H7.f.f3234E);
        this.f26969I = textView;
        AbstractC1484a0.s0(textView, 1);
        this.f26970J = (CheckableImageButton) inflate.findViewById(H7.f.f3235F);
        TextView textView2 = (TextView) inflate.findViewById(H7.f.f3236G);
        CharSequence charSequence = this.f26962B;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f26961A);
        }
        d0(context);
        this.f26972X = (Button) inflate.findViewById(H7.f.f3251c);
        Z();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f26977v.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, androidx.fragment.app.ComponentCallbacksC1573o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f26978w);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.f26980y);
        if (this.f26981z.P() != null) {
            bVar.b(this.f26981z.P().f26996f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f26961A);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f26962B);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f26965E);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f26966F);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f26967G);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f26968H);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, androidx.fragment.app.ComponentCallbacksC1573o
    public void onStart() {
        super.onStart();
        Window window = Q().getWindow();
        if (this.f26963C) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f26971K);
            Y(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(H7.d.f3178O);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f26971K, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new N7.a(Q(), rect));
        }
        h0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, androidx.fragment.app.ComponentCallbacksC1573o
    public void onStop() {
        this.f26979x.F();
        super.onStop();
    }
}
