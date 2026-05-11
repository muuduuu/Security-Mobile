package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.AbstractC1484a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;

/* loaded from: classes2.dex */
class m extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f27003d;

    /* renamed from: e, reason: collision with root package name */
    private final h.l f27004e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27005f;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f27006a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f27006a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f27006a.getAdapter().l(i10)) {
                m.this.f27004e.a(this.f27006a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.F {

        /* renamed from: u, reason: collision with root package name */
        final TextView f27008u;

        /* renamed from: v, reason: collision with root package name */
        final MaterialCalendarGridView f27009v;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(H7.f.f3269u);
            this.f27008u = textView;
            AbstractC1484a0.r0(textView, true);
            this.f27009v = (MaterialCalendarGridView) linearLayout.findViewById(H7.f.f3265q);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    m(Context context, d dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        k i10 = aVar.i();
        k f10 = aVar.f();
        k h10 = aVar.h();
        if (i10.compareTo(h10) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (h10.compareTo(f10) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f27005f = (l.f26998e * h.R(context)) + (i.e0(context) ? h.R(context) : 0);
        this.f27003d = aVar;
        this.f27004e = lVar;
        y(true);
    }

    k B(int i10) {
        return this.f27003d.i().u(i10);
    }

    CharSequence C(int i10) {
        return B(i10).q();
    }

    int D(k kVar) {
        return this.f27003d.i().v(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void p(b bVar, int i10) {
        k u10 = this.f27003d.i().u(i10);
        bVar.f27008u.setText(u10.q());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f27009v.findViewById(H7.f.f3265q);
        if (materialCalendarGridView.getAdapter() == null || !u10.equals(materialCalendarGridView.getAdapter().f26999a)) {
            l lVar = new l(u10, null, this.f27003d);
            materialCalendarGridView.setNumColumns(u10.f26994d);
            materialCalendarGridView.setAdapter((ListAdapter) lVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().k(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(H7.h.f3296s, viewGroup, false);
        if (!i.e0(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f27005f));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f27003d.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i10) {
        return this.f27003d.i().u(i10).s();
    }
}
