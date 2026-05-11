package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import g.AbstractC3176g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    Context f13466a;

    /* renamed from: b, reason: collision with root package name */
    LayoutInflater f13467b;

    /* renamed from: c, reason: collision with root package name */
    e f13468c;

    /* renamed from: d, reason: collision with root package name */
    ExpandedMenuView f13469d;

    /* renamed from: e, reason: collision with root package name */
    int f13470e;

    /* renamed from: f, reason: collision with root package name */
    int f13471f;

    /* renamed from: g, reason: collision with root package name */
    int f13472g;

    /* renamed from: h, reason: collision with root package name */
    private j.a f13473h;

    /* renamed from: i, reason: collision with root package name */
    a f13474i;

    private class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private int f13475a = -1;

        public a() {
            a();
        }

        void a() {
            g v10 = c.this.f13468c.v();
            if (v10 != null) {
                ArrayList z10 = c.this.f13468c.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) z10.get(i10)) == v10) {
                        this.f13475a = i10;
                        return;
                    }
                }
            }
            this.f13475a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList z10 = c.this.f13468c.z();
            int i11 = i10 + c.this.f13470e;
            int i12 = this.f13475a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) z10.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f13468c.z().size() - c.this.f13470e;
            return this.f13475a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f13467b.inflate(cVar.f13472g, viewGroup, false);
            }
            ((k.a) view).e(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f13466a = context;
        this.f13467b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f13474i == null) {
            this.f13474i = new a();
        }
        return this.f13474i;
    }

    public k b(ViewGroup viewGroup) {
        if (this.f13469d == null) {
            this.f13469d = (ExpandedMenuView) this.f13467b.inflate(AbstractC3176g.f33208g, viewGroup, false);
            if (this.f13474i == null) {
                this.f13474i = new a();
            }
            this.f13469d.setAdapter((ListAdapter) this.f13474i);
            this.f13469d.setOnItemClickListener(this);
        }
        return this.f13469d;
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        j.a aVar = this.f13473h;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        a aVar = this.f13474i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f13473h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        if (this.f13471f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f13471f);
            this.f13466a = contextThemeWrapper;
            this.f13467b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f13466a != null) {
            this.f13466a = context;
            if (this.f13467b == null) {
                this.f13467b = LayoutInflater.from(context);
            }
        }
        this.f13468c = eVar;
        a aVar = this.f13474i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).b(null);
        j.a aVar = this.f13473h;
        if (aVar == null) {
            return true;
        }
        aVar.d(mVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f13468c.N(this.f13474i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f13472g = i10;
        this.f13471f = i11;
    }
}
