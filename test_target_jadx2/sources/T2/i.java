package T2;

import Jd.AbstractC0891k;
import Jd.InterfaceC0915w0;
import Jd.N;
import Q2.B;
import Q2.F;
import T2.f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.V;
import androidx.lifecycle.AbstractC1600q;
import androidx.lifecycle.InterfaceC1608z;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.RecyclerView;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import u5.C4870a;
import xc.C5142C;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020%2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020%2\u0006\u0010,\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010+J\u001f\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"LT2/i;", "Landroidx/fragment/app/o;", "Landroidx/appcompat/widget/SearchView$m;", "LT2/f$a;", "<init>", "()V", "Landroid/view/Menu;", "menu", BuildConfig.FLAVOR, "M", "(Landroid/view/Menu;)V", "LJd/w0;", "H", "()LJd/w0;", "LN2/a;", "I", "()LN2/a;", "J", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", BuildConfig.FLAVOR, "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", BuildConfig.FLAVOR, "query", "i", "(Ljava/lang/String;)Z", "newText", "g", BuildConfig.FLAVOR, "transactionId", BuildConfig.FLAVOR, "position", "l", "(JI)V", "LR2/b;", C4870a.f43493a, "Lkotlin/Lazy;", "K", "()LR2/b;", "viewModel", "LM2/e;", "b", "LM2/e;", "transactionsBinding", "LT2/f;", "c", "LT2/f;", "transactionsAdapter", "d", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class i extends ComponentCallbacksC1573o implements SearchView.m, f.a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = V.a(this, C5142C.b(R2.b.class), new f(new e(this)), null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private M2.e transactionsBinding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T2.f transactionsAdapter;

    /* renamed from: T2.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return new i();
        }

        private Companion() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f9172a;

        b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return i.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Intent intent;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f9172a;
            if (i10 == 0) {
                lc.p.b(obj);
                R2.b K10 = i.this.K();
                this.f9172a = 1;
                obj = K10.g(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                    intent = (Intent) obj;
                    if (intent != null) {
                        i.this.startActivity(intent);
                    }
                    return Unit.f36324a;
                }
                lc.p.b(obj);
            }
            List list = (List) obj;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                Toast.makeText(i.this.requireContext(), K2.g.f5232k, 0).show();
                return Unit.f36324a;
            }
            F f10 = new F(list, false);
            AbstractActivityC1577t requireActivity = i.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            String string = i.this.getString(K2.g.f5208J);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_share_all_transactions_title)");
            String string2 = i.this.getString(K2.g.f5207I);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_share_all_transactions_subject)");
            this.f9172a = 2;
            obj = B.a(f10, requireActivity, "transactions.txt", string, string2, "transactions", this);
            if (obj == e10) {
                return e10;
            }
            intent = (Intent) obj;
            if (intent != null) {
            }
            return Unit.f36324a;
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        public final void a() {
            i.this.K().f();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class d extends xc.m implements Function0 {
        d() {
            super(0);
        }

        public final void a() {
            i.this.H();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class e extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC1573o f9176a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacksC1573o componentCallbacksC1573o) {
            super(0);
            this.f9176a = componentCallbacksC1573o;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC1573o invoke() {
            return this.f9176a;
        }
    }

    public static final class f extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f9177a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0) {
            super(0);
            this.f9177a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            W viewModelStore = ((X) this.f9177a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0915w0 H() {
        InterfaceC0915w0 d10;
        d10 = AbstractC0891k.d(AbstractC1600q.a(this), null, null, new b(null), 3, null);
        return d10;
    }

    private final N2.a I() {
        String string = getString(K2.g.f5227f);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_clear)");
        String string2 = getString(K2.g.f5228g);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_clear_http_confirmation)");
        return new N2.a(string, string2, getString(K2.g.f5227f), getString(K2.g.f5226e));
    }

    private final N2.a J() {
        String string = getString(K2.g.f5231j);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_export)");
        String string2 = getString(K2.g.f5233l);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_export_http_confirmation)");
        return new N2.a(string, string2, getString(K2.g.f5231j), getString(K2.g.f5226e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final R2.b K() {
        return (R2.b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(i this$0, List transactionTuples) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        T2.f fVar = this$0.transactionsAdapter;
        if (fVar == null) {
            Intrinsics.v("transactionsAdapter");
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(transactionTuples, "transactionTuples");
        fVar.J(transactionTuples);
        M2.e eVar = this$0.transactionsBinding;
        if (eVar != null) {
            eVar.f6011d.setVisibility(transactionTuples.isEmpty() ? 0 : 8);
        } else {
            Intrinsics.v("transactionsBinding");
            throw null;
        }
    }

    private final void M(Menu menu) {
        View actionView = menu.findItem(K2.d.f5132M).getActionView();
        if (actionView == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        }
        SearchView searchView = (SearchView) actionView;
        searchView.setOnQueryTextListener(this);
        searchView.setIconifiedByDefault(true);
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public boolean g(String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        K().j(newText);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public boolean i(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return true;
    }

    @Override // T2.f.a
    public void l(long transactionId, int position) {
        TransactionActivity.Companion companion = TransactionActivity.INSTANCE;
        AbstractActivityC1577t requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        companion.a(requireActivity, transactionId);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(K2.f.f5198d, menu);
        M(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        M2.e c10 = M2.e.c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(inflater, container, false)");
        this.transactionsBinding = c10;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.transactionsAdapter = new T2.f(requireContext, this);
        M2.e eVar = this.transactionsBinding;
        if (eVar == null) {
            Intrinsics.v("transactionsBinding");
            throw null;
        }
        eVar.f6010c.setMovementMethod(LinkMovementMethod.getInstance());
        RecyclerView recyclerView = eVar.f6009b;
        recyclerView.setHasFixedSize(true);
        recyclerView.j(new androidx.recyclerview.widget.d(requireContext(), 1));
        T2.f fVar = this.transactionsAdapter;
        if (fVar == null) {
            Intrinsics.v("transactionsAdapter");
            throw null;
        }
        recyclerView.setAdapter(fVar);
        M2.e eVar2 = this.transactionsBinding;
        if (eVar2 != null) {
            return eVar2.b();
        }
        Intrinsics.v("transactionsBinding");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == K2.d.f5164j) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            Q2.g.c(requireContext, I(), new c(), null);
            return true;
        }
        if (itemId != K2.d.f5175s) {
            return super.onOptionsItemSelected(item);
        }
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
        Q2.g.c(requireContext2, J(), new d(), null);
        return true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        K().i().i(getViewLifecycleOwner(), new InterfaceC1608z() { // from class: T2.h
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                i.L(i.this, (List) obj);
            }
        });
    }
}
