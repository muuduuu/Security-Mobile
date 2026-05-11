package T2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.lifecycle.InterfaceC1608z;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import xc.C5142C;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"LT2/l;", "Landroidx/fragment/app/o;", "<init>", "()V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", BuildConfig.FLAVOR, "encodeUrl", BuildConfig.FLAVOR, "J", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LT2/u;", C4870a.f43493a, "Lkotlin/Lazy;", "G", "()LT2/u;", "viewModel", "LM2/f;", "b", "LM2/f;", "overviewBinding", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class l extends ComponentCallbacksC1573o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private M2.f overviewBinding;

    public static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC1573o f9182a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacksC1573o componentCallbacksC1573o) {
            super(0);
            this.f9182a = componentCallbacksC1573o;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            AbstractActivityC1577t requireActivity = this.f9182a.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            W viewModelStore = requireActivity.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    public static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC1573o f9183a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacksC1573o componentCallbacksC1573o) {
            super(0);
            this.f9183a = componentCallbacksC1573o;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.c invoke() {
            AbstractActivityC1577t requireActivity = this.f9183a.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            return requireActivity.getDefaultViewModelProviderFactory();
        }
    }

    static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f9184a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.c invoke() {
            return new v(0L, 1, null);
        }
    }

    public l() {
        Function0 function0 = c.f9184a;
        this.viewModel = androidx.fragment.app.V.a(this, C5142C.b(u.class), new a(this), function0 == null ? new b(this) : function0);
    }

    private final u G() {
        return (u) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Menu menu, Boolean it) {
        Intrinsics.checkNotNullParameter(menu, "$menu");
        MenuItem findItem = menu.findItem(K2.d.f5173q);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        findItem.setVisible(it.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(l this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J((HttpTransaction) pair.getFirst(), ((Boolean) pair.getSecond()).booleanValue());
    }

    private final void J(HttpTransaction transaction, boolean encodeUrl) {
        M2.f fVar = this.overviewBinding;
        if (fVar == null) {
            Intrinsics.v("overviewBinding");
            throw null;
        }
        fVar.f6015D.setText(transaction == null ? null : transaction.getFormattedUrl(encodeUrl));
        fVar.f6025j.setText(transaction == null ? null : transaction.getMethod());
        fVar.f6027l.setText(transaction == null ? null : transaction.getProtocol());
        fVar.f6040y.setText(String.valueOf(transaction == null ? null : transaction.getStatus()));
        fVar.f6032q.setText(transaction == null ? null : transaction.getResponseSummaryText());
        Boolean valueOf = transaction == null ? null : Boolean.valueOf(transaction.isSsl());
        if (valueOf == null) {
            fVar.f6038w.setVisibility(8);
        } else if (Intrinsics.b(valueOf, Boolean.TRUE)) {
            fVar.f6038w.setVisibility(0);
            fVar.f6039x.setText(K2.g.f5221W);
        } else {
            fVar.f6038w.setVisibility(0);
            fVar.f6039x.setText(K2.g.f5243v);
        }
        if ((transaction == null ? null : transaction.getResponseTlsVersion()) != null) {
            fVar.f6013B.setText(transaction.getResponseTlsVersion());
            fVar.f6041z.setVisibility(0);
        }
        if ((transaction == null ? null : transaction.getResponseCipherSuite()) != null) {
            fVar.f6023h.setText(transaction.getResponseCipherSuite());
            fVar.f6022g.setVisibility(0);
        }
        fVar.f6030o.setText(transaction == null ? null : transaction.getRequestDateString());
        fVar.f6035t.setText(transaction == null ? null : transaction.getResponseDateString());
        fVar.f6024i.setText(transaction == null ? null : transaction.getDurationString());
        fVar.f6028m.setText(transaction == null ? null : transaction.getRequestSizeString());
        fVar.f6033r.setText(transaction == null ? null : transaction.getResponseSizeString());
        fVar.f6014C.setText(transaction != null ? transaction.getTotalSizeString() : null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreateOptionsMenu(final Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        menu.findItem(K2.d.f5131L).setVisible(false);
        G().g().i(getViewLifecycleOwner(), new InterfaceC1608z() { // from class: T2.j
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                l.H(menu, (Boolean) obj);
            }
        });
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        M2.f c10 = M2.f.c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(inflater, container, false)");
        this.overviewBinding = c10;
        if (c10 != null) {
            return c10.b();
        }
        Intrinsics.v("overviewBinding");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Q2.r.e(G().j(), G().h()).i(getViewLifecycleOwner(), new InterfaceC1608z() { // from class: T2.k
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                l.I(l.this, (Pair) obj);
            }
        });
    }
}
