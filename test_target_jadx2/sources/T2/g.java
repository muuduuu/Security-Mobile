package T2;

import Q2.z;
import T2.s;
import T2.t;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class g extends RecyclerView.h {

    /* renamed from: e, reason: collision with root package name */
    public static final a f9165e = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f9166d = new ArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void A(String newText, int i10, int i11) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        ArrayList arrayList = this.f9166d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof s.a) {
                arrayList2.add(obj);
            }
        }
        for (IndexedValue indexedValue : CollectionsKt.U0(arrayList2)) {
            int index = indexedValue.getIndex();
            s.a aVar = (s.a) indexedValue.getValue();
            if (StringsKt.I(aVar.a(), newText, true)) {
                aVar.a().clearSpans();
                String spannableStringBuilder = aVar.a().toString();
                Intrinsics.checkNotNullExpressionValue(spannableStringBuilder, "item.line.toString()");
                aVar.b(z.b(spannableStringBuilder, newText, i10, i11));
                k(index + 1);
            } else {
                Object[] spans = aVar.a().getSpans(0, aVar.a().length() - 1, Object.class);
                Intrinsics.checkNotNullExpressionValue(spans, "spans");
                if (!(spans.length == 0)) {
                    aVar.a().clearSpans();
                    k(index + 1);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(t holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f9166d.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
        holder.O((s) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public t r(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (i10 == 1) {
            M2.k c10 = M2.k.c(from, parent, false);
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(inflater, parent, false)");
            return new t.b(c10);
        }
        if (i10 != 2) {
            M2.l c11 = M2.l.c(from, parent, false);
            Intrinsics.checkNotNullExpressionValue(c11, "inflate(inflater, parent, false)");
            return new t.c(c11);
        }
        M2.j c12 = M2.j.c(from, parent, false);
        Intrinsics.checkNotNullExpressionValue(c12, "inflate(inflater, parent, false)");
        return new t.a(c12);
    }

    public final void D() {
        ArrayList arrayList = this.f9166d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof s.a) {
                arrayList2.add(obj);
            }
        }
        for (IndexedValue indexedValue : CollectionsKt.U0(arrayList2)) {
            int index = indexedValue.getIndex();
            s.a aVar = (s.a) indexedValue.getValue();
            Object[] spans = aVar.a().getSpans(0, aVar.a().length() - 1, Object.class);
            Intrinsics.checkNotNullExpressionValue(spans, "spans");
            if (!(spans.length == 0)) {
                aVar.a().clearSpans();
                k(index + 1);
            }
        }
    }

    public final void E(List bodyItems) {
        Intrinsics.checkNotNullParameter(bodyItems, "bodyItems");
        this.f9166d.clear();
        this.f9166d.addAll(bodyItems);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f9166d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i10) {
        s sVar = (s) this.f9166d.get(i10);
        if (sVar instanceof s.b) {
            return 1;
        }
        if (sVar instanceof s.a) {
            return 2;
        }
        if (sVar instanceof s.c) {
            return 3;
        }
        throw new lc.m();
    }
}
