package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
class g extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    private static final int f26923d;

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f26924a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26925b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26926c;

    static {
        f26923d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar i10 = r.i();
        this.f26924a = i10;
        this.f26925b = i10.getMaximum(7);
        this.f26926c = i10.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f26926c;
        int i12 = this.f26925b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f26925b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f26925b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(H7.h.f3294q, viewGroup, false);
        }
        this.f26924a.set(7, b(i10));
        textView.setText(this.f26924a.getDisplayName(7, f26923d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(H7.j.f3317n), this.f26924a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
