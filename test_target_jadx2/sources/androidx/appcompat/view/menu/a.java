package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: a, reason: collision with root package name */
    protected Context f13419a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f13420b;

    /* renamed from: c, reason: collision with root package name */
    protected e f13421c;

    /* renamed from: d, reason: collision with root package name */
    protected LayoutInflater f13422d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f13423e;

    /* renamed from: f, reason: collision with root package name */
    private j.a f13424f;

    /* renamed from: g, reason: collision with root package name */
    private int f13425g;

    /* renamed from: h, reason: collision with root package name */
    private int f13426h;

    /* renamed from: i, reason: collision with root package name */
    protected k f13427i;

    /* renamed from: j, reason: collision with root package name */
    private int f13428j;

    public a(Context context, int i10, int i11) {
        this.f13419a = context;
        this.f13422d = LayoutInflater.from(context);
        this.f13425g = i10;
        this.f13426h = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f13427i).addView(view, i10);
    }

    public abstract void b(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        j.a aVar = this.f13424f;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f13427i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f13421c;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList E10 = this.f13421c.E();
            int size = E10.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) E10.get(i12);
                if (q(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n10 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n10.setPressed(false);
                        n10.jumpDrawablesToCurrentState();
                    }
                    if (n10 != childAt) {
                        a(n10, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
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
        this.f13424f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.f13420b = context;
        this.f13423e = LayoutInflater.from(context);
        this.f13421c = eVar;
    }

    public k.a j(ViewGroup viewGroup) {
        return (k.a) this.f13422d.inflate(this.f13426h, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        j.a aVar = this.f13424f;
        m mVar2 = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            mVar2 = this.f13421c;
        }
        return aVar.d(mVar2);
    }

    protected boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f13424f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a j10 = view instanceof k.a ? (k.a) view : j(viewGroup);
        b(gVar, j10);
        return (View) j10;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f13427i == null) {
            k kVar = (k) this.f13422d.inflate(this.f13425g, viewGroup, false);
            this.f13427i = kVar;
            kVar.b(this.f13421c);
            d(true);
        }
        return this.f13427i;
    }

    public void p(int i10) {
        this.f13428j = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
