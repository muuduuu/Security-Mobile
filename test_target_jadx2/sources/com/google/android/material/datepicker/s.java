package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* loaded from: classes2.dex */
class s extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final h f27016d;

    public static class a extends RecyclerView.F {

        /* renamed from: u, reason: collision with root package name */
        final TextView f27017u;

        a(TextView textView) {
            super(textView);
            this.f27017u = textView;
        }
    }

    s(h hVar) {
        this.f27016d = hVar;
    }

    int A(int i10) {
        return i10 - this.f27016d.N().i().f26993c;
    }

    int B(int i10) {
        return this.f27016d.N().i().f26993c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void p(a aVar, int i10) {
        int B10 = B(i10);
        String string = aVar.f27017u.getContext().getString(H7.j.f3318o);
        aVar.f27017u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(B10)));
        aVar.f27017u.setContentDescription(String.format(string, Integer.valueOf(B10)));
        c O10 = this.f27016d.O();
        if (r.g().get(1) == B10) {
            b bVar = O10.f26919f;
        } else {
            b bVar2 = O10.f26917d;
        }
        this.f27016d.Q();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(H7.h.f3298u, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f27016d.N().j();
    }
}
