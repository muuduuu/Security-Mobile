package S2;

import M2.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DateFormat;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final a f8689d;

    /* renamed from: e, reason: collision with root package name */
    private List f8690e;

    public interface a {
        void a(long j10, int i10);
    }

    /* renamed from: S2.b$b, reason: collision with other inner class name */
    public final class ViewOnClickListenerC0169b extends RecyclerView.F implements View.OnClickListener {

        /* renamed from: u, reason: collision with root package name */
        private final h f8691u;

        /* renamed from: v, reason: collision with root package name */
        private Long f8692v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ b f8693w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewOnClickListenerC0169b(b this$0, h itemBinding) {
            super(itemBinding.b());
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f8693w = this$0;
            this.f8691u = itemBinding;
            this.f17450a.setOnClickListener(this);
        }

        public final void O(com.chuckerteam.chucker.internal.data.entity.d throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            h hVar = this.f8691u;
            this.f8692v = throwable.c();
            hVar.f6052e.setText(throwable.e());
            hVar.f6049b.setText(throwable.a());
            hVar.f6051d.setText(throwable.d());
            hVar.f6050c.setText(DateFormat.getDateTimeInstance(3, 2).format(throwable.b()));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            Long l10 = this.f8692v;
            if (l10 == null) {
                return;
            }
            b bVar = this.f8693w;
            bVar.A().a(l10.longValue(), k());
        }
    }

    public b(a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8689d = listener;
        this.f8690e = CollectionsKt.j();
    }

    public final a A() {
        return this.f8689d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(ViewOnClickListenerC0169b holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.O((com.chuckerteam.chucker.internal.data.entity.d) this.f8690e.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public ViewOnClickListenerC0169b r(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        h c10 = h.c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(LayoutInflater.from(parent.context), parent, false)");
        return new ViewOnClickListenerC0169b(this, c10);
    }

    public final void D(List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f8690e = data;
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f8690e.size();
    }
}
