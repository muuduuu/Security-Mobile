package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    e f13477a;

    /* renamed from: b, reason: collision with root package name */
    private int f13478b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13479c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13480d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f13481e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13482f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f13480d = z10;
        this.f13481e = layoutInflater;
        this.f13477a = eVar;
        this.f13482f = i10;
        a();
    }

    void a() {
        g v10 = this.f13477a.v();
        if (v10 != null) {
            ArrayList z10 = this.f13477a.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) z10.get(i10)) == v10) {
                    this.f13478b = i10;
                    return;
                }
            }
        }
        this.f13478b = -1;
    }

    public e b() {
        return this.f13477a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList z10 = this.f13480d ? this.f13477a.z() : this.f13477a.E();
        int i11 = this.f13478b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) z10.get(i10);
    }

    public void d(boolean z10) {
        this.f13479c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f13478b < 0 ? (this.f13480d ? this.f13477a.z() : this.f13477a.E()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f13481e.inflate(this.f13482f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f13477a.G() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f13479c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
