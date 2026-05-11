package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
class l extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    static final int f26998e = r.i().getMaximum(4);

    /* renamed from: a, reason: collision with root package name */
    final k f26999a;

    /* renamed from: b, reason: collision with root package name */
    private Collection f27000b;

    /* renamed from: c, reason: collision with root package name */
    c f27001c;

    /* renamed from: d, reason: collision with root package name */
    final a f27002d;

    l(k kVar, d dVar, a aVar) {
        this.f26999a = kVar;
        this.f27002d = aVar;
        this.f27000b = dVar.t();
    }

    private void e(Context context) {
        if (this.f27001c == null) {
            this.f27001c = new c(context);
        }
    }

    private boolean f(long j10) {
        throw null;
    }

    private void i(TextView textView, long j10) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f27002d.e().r(j10)) {
            textView.setEnabled(true);
            bVar = f(j10) ? this.f27001c.f26915b : r.g().getTimeInMillis() == j10 ? this.f27001c.f26916c : this.f27001c.f26914a;
        } else {
            textView.setEnabled(false);
            bVar = this.f27001c.f26920g;
        }
        bVar.b(textView);
    }

    private void j(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (k.d(j10).equals(this.f26999a)) {
            i((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f26999a.p(j10)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f26999a.n();
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < this.f26999a.n() || i10 > g()) {
            return null;
        }
        return Long.valueOf(this.f26999a.o(h(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i10, View view, ViewGroup viewGroup) {
        Long item;
        e(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(H7.h.f3293p, viewGroup, false);
        }
        int b10 = i10 - b();
        if (b10 >= 0) {
            k kVar = this.f26999a;
            if (b10 < kVar.f26995e) {
                int i11 = b10 + 1;
                textView.setTag(kVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                long o10 = this.f26999a.o(i11);
                if (this.f26999a.f26993c == k.e().f26993c) {
                    textView.setContentDescription(e.a(o10));
                } else {
                    textView.setContentDescription(e.d(o10));
                }
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i10);
                if (item != null) {
                    return textView;
                }
                i(textView, item.longValue());
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        item = getItem(i10);
        if (item != null) {
        }
    }

    int g() {
        return (this.f26999a.n() + this.f26999a.f26995e) - 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f26999a.f26995e + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f26999a.f26994d;
    }

    int h(int i10) {
        return (i10 - this.f26999a.n()) + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public void k(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f27000b.iterator();
        while (it.hasNext()) {
            j(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    boolean l(int i10) {
        return i10 >= b() && i10 <= g();
    }
}
