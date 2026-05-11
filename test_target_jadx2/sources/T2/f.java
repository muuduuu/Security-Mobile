package T2;

import T2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import h.AbstractC3220a;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class f extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final a f9154d;

    /* renamed from: e, reason: collision with root package name */
    private List f9155e;

    /* renamed from: f, reason: collision with root package name */
    private final int f9156f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9157g;

    /* renamed from: h, reason: collision with root package name */
    private final int f9158h;

    /* renamed from: i, reason: collision with root package name */
    private final int f9159i;

    /* renamed from: j, reason: collision with root package name */
    private final int f9160j;

    /* renamed from: k, reason: collision with root package name */
    private final int f9161k;

    public interface a {
        void l(long j10, int i10);
    }

    public final class b extends RecyclerView.F implements View.OnClickListener {

        /* renamed from: u, reason: collision with root package name */
        private final M2.i f9162u;

        /* renamed from: v, reason: collision with root package name */
        private Long f9163v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ f f9164w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f this$0, M2.i itemBinding) {
            super(itemBinding.b());
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f9164w = this$0;
            this.f9162u = itemBinding;
            this.f17450a.setOnClickListener(this);
        }

        private final void P(T2.b bVar) {
            this.f9162u.f6060h.setImageDrawable(AbstractC3220a.b(this.f17450a.getContext(), bVar.b()));
            androidx.core.widget.g.c(this.f9162u.f6060h, ColorStateList.valueOf(androidx.core.content.a.c(this.f17450a.getContext(), bVar.a())));
        }

        private final void Q(com.chuckerteam.chucker.internal.data.entity.b bVar) {
            int i10;
            if (bVar.i() == HttpTransaction.a.Failed) {
                i10 = this.f9164w.f9158h;
            } else if (bVar.i() == HttpTransaction.a.Requested) {
                i10 = this.f9164w.f9157g;
            } else if (bVar.h() == null) {
                i10 = this.f9164w.f9156f;
            } else {
                Integer h10 = bVar.h();
                Intrinsics.d(h10);
                if (h10.intValue() >= 500) {
                    i10 = this.f9164w.f9159i;
                } else {
                    Integer h11 = bVar.h();
                    Intrinsics.d(h11);
                    if (h11.intValue() >= 400) {
                        i10 = this.f9164w.f9160j;
                    } else {
                        Integer h12 = bVar.h();
                        Intrinsics.d(h12);
                        i10 = h12.intValue() >= 300 ? this.f9164w.f9161k : this.f9164w.f9156f;
                    }
                }
            }
            this.f9162u.f6054b.setTextColor(i10);
            this.f9162u.f6058f.setTextColor(i10);
        }

        public final void O(com.chuckerteam.chucker.internal.data.entity.b transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f9163v = Long.valueOf(transaction.e());
            M2.i iVar = this.f9162u;
            iVar.f6058f.setText(((Object) transaction.f()) + ' ' + transaction.c(false));
            iVar.f6057e.setText(transaction.d());
            iVar.f6061i.setText(DateFormat.getTimeInstance().format(transaction.g()));
            P(transaction.k() ? new b.C0180b() : new b.a());
            if (transaction.i() == HttpTransaction.a.Complete) {
                iVar.f6054b.setText(String.valueOf(transaction.h()));
                iVar.f6055c.setText(transaction.b());
                iVar.f6059g.setText(transaction.j());
            } else {
                iVar.f6054b.setText(BuildConfig.FLAVOR);
                iVar.f6055c.setText(BuildConfig.FLAVOR);
                iVar.f6059g.setText(BuildConfig.FLAVOR);
            }
            if (transaction.i() == HttpTransaction.a.Failed) {
                iVar.f6054b.setText("!!!");
            }
            Q(transaction);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Long l10 = this.f9163v;
            if (l10 == null) {
                return;
            }
            f fVar = this.f9164w;
            long longValue = l10.longValue();
            a aVar = fVar.f9154d;
            if (aVar == null) {
                return;
            }
            aVar.l(longValue, k());
        }
    }

    public f(Context context, a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9154d = aVar;
        this.f9155e = new ArrayList();
        this.f9156f = androidx.core.content.a.c(context, K2.a.f5110l);
        this.f9157g = androidx.core.content.a.c(context, K2.a.f5112n);
        this.f9158h = androidx.core.content.a.c(context, K2.a.f5111m);
        this.f9159i = androidx.core.content.a.c(context, K2.a.f5109k);
        this.f9160j = androidx.core.content.a.c(context, K2.a.f5108j);
        this.f9161k = androidx.core.content.a.c(context, K2.a.f5107i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void p(b holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.O((com.chuckerteam.chucker.internal.data.entity.b) this.f9155e.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        M2.i c10 = M2.i.c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(LayoutInflater.from(parent.context), parent, false)");
        return new b(this, c10);
    }

    public final void J(List httpTransactions) {
        Intrinsics.checkNotNullParameter(httpTransactions, "httpTransactions");
        this.f9155e = httpTransactions;
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f9155e.size();
    }
}
