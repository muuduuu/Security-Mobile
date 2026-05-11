package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f27167a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set f27168b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private b f27169c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27170d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27171e;

    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0401a implements h.a {
        C0401a() {
        }

        @Override // com.google.android.material.internal.h.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h hVar, boolean z10) {
            if (!z10) {
                a aVar = a.this;
                if (!aVar.r(hVar, aVar.f27171e)) {
                    return;
                }
            } else if (!a.this.g(hVar)) {
                return;
            }
            a.this.m();
        }
    }

    public interface b {
        void a(Set set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(h hVar) {
        int id2 = hVar.getId();
        if (this.f27168b.contains(Integer.valueOf(id2))) {
            return false;
        }
        h hVar2 = (h) this.f27167a.get(Integer.valueOf(k()));
        if (hVar2 != null) {
            r(hVar2, false);
        }
        boolean add = this.f27168b.add(Integer.valueOf(id2));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        b bVar = this.f27169c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(h hVar, boolean z10) {
        int id2 = hVar.getId();
        if (!this.f27168b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && this.f27168b.size() == 1 && this.f27168b.contains(Integer.valueOf(id2))) {
            hVar.setChecked(true);
            return false;
        }
        boolean remove = this.f27168b.remove(Integer.valueOf(id2));
        if (hVar.isChecked()) {
            hVar.setChecked(false);
        }
        return remove;
    }

    public void e(h hVar) {
        this.f27167a.put(Integer.valueOf(hVar.getId()), hVar);
        if (hVar.isChecked()) {
            g(hVar);
        }
        hVar.setInternalOnCheckedChangeListener(new C0401a());
    }

    public void f(int i10) {
        h hVar = (h) this.f27167a.get(Integer.valueOf(i10));
        if (hVar != null && g(hVar)) {
            m();
        }
    }

    public void h() {
        boolean isEmpty = this.f27168b.isEmpty();
        Iterator it = this.f27167a.values().iterator();
        while (it.hasNext()) {
            r((h) it.next(), false);
        }
        if (isEmpty) {
            return;
        }
        m();
    }

    public Set i() {
        return new HashSet(this.f27168b);
    }

    public List j(ViewGroup viewGroup) {
        Set i10 = i();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof h) && i10.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f27170d || this.f27168b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f27168b.iterator().next()).intValue();
    }

    public boolean l() {
        return this.f27170d;
    }

    public void n(h hVar) {
        hVar.setInternalOnCheckedChangeListener(null);
        this.f27167a.remove(Integer.valueOf(hVar.getId()));
        this.f27168b.remove(Integer.valueOf(hVar.getId()));
    }

    public void o(b bVar) {
        this.f27169c = bVar;
    }

    public void p(boolean z10) {
        this.f27171e = z10;
    }

    public void q(boolean z10) {
        if (this.f27170d != z10) {
            this.f27170d = z10;
            h();
        }
    }
}
