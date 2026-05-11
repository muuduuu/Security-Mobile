package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import z0.C5228A;

/* loaded from: classes2.dex */
public final class h<S> extends o {

    /* renamed from: k, reason: collision with root package name */
    static final Object f26927k = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: l, reason: collision with root package name */
    static final Object f26928l = "NAVIGATION_PREV_TAG";

    /* renamed from: o, reason: collision with root package name */
    static final Object f26929o = "NAVIGATION_NEXT_TAG";

    /* renamed from: p, reason: collision with root package name */
    static final Object f26930p = "SELECTOR_TOGGLE_TAG";

    /* renamed from: b, reason: collision with root package name */
    private int f26931b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.material.datepicker.a f26932c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.android.material.datepicker.k f26933d;

    /* renamed from: e, reason: collision with root package name */
    private k f26934e;

    /* renamed from: f, reason: collision with root package name */
    private com.google.android.material.datepicker.c f26935f;

    /* renamed from: g, reason: collision with root package name */
    private RecyclerView f26936g;

    /* renamed from: h, reason: collision with root package name */
    private RecyclerView f26937h;

    /* renamed from: i, reason: collision with root package name */
    private View f26938i;

    /* renamed from: j, reason: collision with root package name */
    private View f26939j;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26940a;

        a(int i10) {
            this.f26940a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f26937h.A1(this.f26940a);
        }
    }

    class b extends C1483a {
        b() {
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            c5228a.s0(null);
        }
    }

    class c extends p {

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f26943I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f26943I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void M1(RecyclerView.B b10, int[] iArr) {
            if (this.f26943I == 0) {
                iArr[0] = h.this.f26937h.getWidth();
                iArr[1] = h.this.f26937h.getWidth();
            } else {
                iArr[0] = h.this.f26937h.getHeight();
                iArr[1] = h.this.f26937h.getHeight();
            }
        }
    }

    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.h.l
        public void a(long j10) {
            if (h.this.f26932c.e().r(j10)) {
                h.I(h.this);
                throw null;
            }
        }
    }

    class e extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f26946a = r.i();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f26947b = r.i();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
            if ((recyclerView.getAdapter() instanceof s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                h.I(h.this);
                throw null;
            }
        }
    }

    class f extends C1483a {
        f() {
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            c5228a.B0(h.this.f26939j.getVisibility() == 0 ? h.this.getString(H7.j.f3322s) : h.this.getString(H7.j.f3320q));
        }
    }

    class g extends RecyclerView.u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f26950a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f26951b;

        g(m mVar, MaterialButton materialButton) {
            this.f26950a = mVar;
            this.f26951b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f26951b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int Y12 = i10 < 0 ? h.this.T().Y1() : h.this.T().a2();
            h.this.f26933d = this.f26950a.B(Y12);
            this.f26951b.setText(this.f26950a.C(Y12));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h, reason: collision with other inner class name */
    class ViewOnClickListenerC0398h implements View.OnClickListener {
        ViewOnClickListenerC0398h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.Y();
        }
    }

    class i implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f26954a;

        i(m mVar) {
            this.f26954a = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int Y12 = h.this.T().Y1() + 1;
            if (Y12 < h.this.f26937h.getAdapter().e()) {
                h.this.W(this.f26954a.B(Y12));
            }
        }
    }

    class j implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f26956a;

        j(m mVar) {
            this.f26956a = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int a22 = h.this.T().a2() - 1;
            if (a22 >= 0) {
                h.this.W(this.f26956a.B(a22));
            }
        }
    }

    enum k {
        DAY,
        YEAR
    }

    interface l {
        void a(long j10);
    }

    static /* synthetic */ com.google.android.material.datepicker.d I(h hVar) {
        hVar.getClass();
        return null;
    }

    private void L(View view, m mVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(H7.f.f3266r);
        materialButton.setTag(f26930p);
        AbstractC1484a0.q0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(H7.f.f3268t);
        materialButton2.setTag(f26928l);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(H7.f.f3267s);
        materialButton3.setTag(f26929o);
        this.f26938i = view.findViewById(H7.f.f3231B);
        this.f26939j = view.findViewById(H7.f.f3271w);
        X(k.DAY);
        materialButton.setText(this.f26933d.q());
        this.f26937h.n(new g(mVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0398h());
        materialButton3.setOnClickListener(new i(mVar));
        materialButton2.setOnClickListener(new j(mVar));
    }

    private RecyclerView.o M() {
        return new e();
    }

    static int R(Context context) {
        return context.getResources().getDimensionPixelSize(H7.d.f3175L);
    }

    private static int S(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(H7.d.f3182S) + resources.getDimensionPixelOffset(H7.d.f3183T) + resources.getDimensionPixelOffset(H7.d.f3181R);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(H7.d.f3177N);
        int i10 = com.google.android.material.datepicker.l.f26998e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(H7.d.f3175L) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(H7.d.f3180Q)) + resources.getDimensionPixelOffset(H7.d.f3173J);
    }

    public static h U(com.google.android.material.datepicker.d dVar, int i10, com.google.android.material.datepicker.a aVar) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.h());
        hVar.setArguments(bundle);
        return hVar;
    }

    private void V(int i10) {
        this.f26937h.post(new a(i10));
    }

    @Override // com.google.android.material.datepicker.o
    public boolean E(n nVar) {
        return super.E(nVar);
    }

    com.google.android.material.datepicker.a N() {
        return this.f26932c;
    }

    com.google.android.material.datepicker.c O() {
        return this.f26935f;
    }

    com.google.android.material.datepicker.k P() {
        return this.f26933d;
    }

    public com.google.android.material.datepicker.d Q() {
        return null;
    }

    LinearLayoutManager T() {
        return (LinearLayoutManager) this.f26937h.getLayoutManager();
    }

    void W(com.google.android.material.datepicker.k kVar) {
        m mVar = (m) this.f26937h.getAdapter();
        int D10 = mVar.D(kVar);
        int D11 = D10 - mVar.D(this.f26933d);
        boolean z10 = Math.abs(D11) > 3;
        boolean z11 = D11 > 0;
        this.f26933d = kVar;
        if (z10 && z11) {
            this.f26937h.r1(D10 - 3);
            V(D10);
        } else if (!z10) {
            V(D10);
        } else {
            this.f26937h.r1(D10 + 3);
            V(D10);
        }
    }

    void X(k kVar) {
        this.f26934e = kVar;
        if (kVar == k.YEAR) {
            this.f26936g.getLayoutManager().x1(((s) this.f26936g.getAdapter()).A(this.f26933d.f26993c));
            this.f26938i.setVisibility(0);
            this.f26939j.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f26938i.setVisibility(8);
            this.f26939j.setVisibility(0);
            W(this.f26933d);
        }
    }

    void Y() {
        k kVar = this.f26934e;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            X(k.DAY);
        } else if (kVar == k.DAY) {
            X(kVar2);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f26931b = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f26932c = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f26933d = (com.google.android.material.datepicker.k) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f26931b);
        this.f26935f = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.k i12 = this.f26932c.i();
        if (com.google.android.material.datepicker.i.e0(contextThemeWrapper)) {
            i10 = H7.h.f3297t;
            i11 = 1;
        } else {
            i10 = H7.h.f3295r;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        inflate.setMinimumHeight(S(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(H7.f.f3272x);
        AbstractC1484a0.q0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(i12.f26994d);
        gridView.setEnabled(false);
        this.f26937h = (RecyclerView) inflate.findViewById(H7.f.f3230A);
        this.f26937h.setLayoutManager(new c(getContext(), i11, false, i11));
        this.f26937h.setTag(f26927k);
        m mVar = new m(contextThemeWrapper, null, this.f26932c, new d());
        this.f26937h.setAdapter(mVar);
        int integer = contextThemeWrapper.getResources().getInteger(H7.g.f3277c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(H7.f.f3231B);
        this.f26936g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f26936g.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f26936g.setAdapter(new s(this));
            this.f26936g.j(M());
        }
        if (inflate.findViewById(H7.f.f3266r) != null) {
            L(inflate, mVar);
        }
        if (!com.google.android.material.datepicker.i.e0(contextThemeWrapper)) {
            new androidx.recyclerview.widget.k().b(this.f26937h);
        }
        this.f26937h.r1(mVar.D(this.f26933d));
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f26931b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f26932c);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f26933d);
    }
}
