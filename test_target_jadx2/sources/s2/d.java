package S2;

import K2.g;
import S2.b;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.V;
import androidx.lifecycle.InterfaceC1608z;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.RecyclerView;
import com.chuckerteam.chucker.internal.ui.throwable.ThrowableActivity;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"LS2/d;", "Landroidx/fragment/app/o;", "LS2/b$a;", "<init>", "()V", BuildConfig.FLAVOR, "G", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", BuildConfig.FLAVOR, "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", BuildConfig.FLAVOR, "throwableId", BuildConfig.FLAVOR, "position", C4870a.f43493a, "(JI)V", "LR2/b;", "Lkotlin/Lazy;", "H", "()LR2/b;", "viewModel", "LM2/d;", "b", "LM2/d;", "errorsBinding", "LS2/b;", "c", "LS2/b;", "errorsAdapter", "d", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class d extends ComponentCallbacksC1573o implements b.a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = V.a(this, C5142C.b(R2.b.class), new C0170d(new c(this)), null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private M2.d errorsBinding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private S2.b errorsAdapter;

    /* renamed from: S2.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return new d();
        }

        private Companion() {
        }
    }

    static final class b extends m implements Function0 {
        b() {
            super(0);
        }

        public final void a() {
            d.this.H().e();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class c extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC1573o f8700a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacksC1573o componentCallbacksC1573o) {
            super(0);
            this.f8700a = componentCallbacksC1573o;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC1573o invoke() {
            return this.f8700a;
        }
    }

    /* renamed from: S2.d$d, reason: collision with other inner class name */
    public static final class C0170d extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f8701a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0170d(Function0 function0) {
            super(0);
            this.f8701a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            W viewModelStore = ((X) this.f8701a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    private final void G() {
        String string = getString(g.f5227f);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_clear)");
        String string2 = getString(g.f5229h);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_clear_throwable_confirmation)");
        N2.a aVar = new N2.a(string, string2, getString(g.f5227f), getString(g.f5226e));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        Q2.g.c(requireContext, aVar, new b(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final R2.b H() {
        return (R2.b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(d this$0, List throwables) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        S2.b bVar = this$0.errorsAdapter;
        if (bVar == null) {
            Intrinsics.v("errorsAdapter");
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(throwables, "throwables");
        bVar.D(throwables);
        M2.d dVar = this$0.errorsBinding;
        if (dVar != null) {
            dVar.f6007d.setVisibility(throwables.isEmpty() ? 0 : 8);
        } else {
            Intrinsics.v("errorsBinding");
            throw null;
        }
    }

    @Override // S2.b.a
    public void a(long throwableId, int position) {
        ThrowableActivity.Companion companion = ThrowableActivity.INSTANCE;
        AbstractActivityC1577t requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        companion.a(requireActivity, throwableId);
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
        inflater.inflate(K2.f.f5196b, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        M2.d c10 = M2.d.c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(inflater, container, false)");
        this.errorsBinding = c10;
        this.errorsAdapter = new S2.b(this);
        M2.d dVar = this.errorsBinding;
        if (dVar == null) {
            Intrinsics.v("errorsBinding");
            throw null;
        }
        dVar.f6006c.setMovementMethod(LinkMovementMethod.getInstance());
        RecyclerView recyclerView = dVar.f6005b;
        recyclerView.setHasFixedSize(true);
        recyclerView.j(new androidx.recyclerview.widget.d(recyclerView.getContext(), 1));
        S2.b bVar = this.errorsAdapter;
        if (bVar == null) {
            Intrinsics.v("errorsAdapter");
            throw null;
        }
        recyclerView.setAdapter(bVar);
        M2.d dVar2 = this.errorsBinding;
        if (dVar2 != null) {
            return dVar2.b();
        }
        Intrinsics.v("errorsBinding");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != K2.d.f5164j) {
            return super.onOptionsItemSelected(item);
        }
        G();
        return true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        H().h().i(getViewLifecycleOwner(), new InterfaceC1608z() { // from class: S2.c
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                d.I(d.this, (List) obj);
            }
        });
    }
}
