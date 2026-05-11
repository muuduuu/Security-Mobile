package com.chuckerteam.chucker.internal.ui.transaction;

import Jd.AbstractC0891k;
import Jd.N;
import Q2.A;
import Q2.B;
import Q2.D;
import Q2.E;
import T2.u;
import T2.v;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AbstractC1397a;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC1600q;
import androidx.lifecycle.InterfaceC1608z;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.viewpager.widget.ViewPager;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.ui.a;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import u5.C4870a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity;", "Lcom/chuckerteam/chucker/internal/ui/a;", "<init>", "()V", "Landroid/view/Menu;", "menu", BuildConfig.FLAVOR, "K", "(Landroid/view/Menu;)V", "Lkotlin/Function1;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "LQ2/A;", "block", BuildConfig.FLAVOR, "P", "(Lkotlin/jvm/functions/Function1;)Z", "O", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "N", "(Landroidx/viewpager/widget/ViewPager;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LT2/u;", "c", "Lkotlin/Lazy;", "I", "()LT2/u;", "viewModel", "LM2/c;", "d", "LM2/c;", "transactionBinding", "e", C4870a.f43493a, "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionActivity extends a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static int f20565f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new U(C5142C.b(u.class), new h(this), new i());

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private M2.c transactionBinding;

    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, long j10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) TransactionActivity.class);
            intent.putExtra("transaction_id", j10);
            context.startActivity(intent);
        }

        private Companion() {
        }
    }

    static final class b extends m implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke(HttpTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            Object f10 = TransactionActivity.this.I().h().f();
            Intrinsics.d(f10);
            Intrinsics.checkNotNullExpressionValue(f10, "viewModel.encodeUrl.value!!");
            return new E(transaction, ((Boolean) f10).booleanValue());
        }
    }

    static final class c extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f20569a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke(HttpTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            return new D(transaction);
        }
    }

    static final class d extends m implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke(HttpTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            Object f10 = TransactionActivity.this.I().h().f();
            Intrinsics.d(f10);
            Intrinsics.checkNotNullExpressionValue(f10, "viewModel.encodeUrl.value!!");
            return new E(transaction, ((Boolean) f10).booleanValue());
        }
    }

    public static final class e extends ViewPager.m {
        e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            TransactionActivity.f20565f = i10;
        }
    }

    static final class f extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f20571a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f20572b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TransactionActivity f20573c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(A a10, TransactionActivity transactionActivity, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f20572b = a10;
            this.f20573c = transactionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new f(this.f20572b, this.f20573c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((f) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f20571a;
            if (i10 == 0) {
                p.b(obj);
                A a10 = this.f20572b;
                TransactionActivity transactionActivity = this.f20573c;
                String string = transactionActivity.getString(K2.g.f5213O);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_share_transaction_title)");
                String string2 = this.f20573c.getString(K2.g.f5212N);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_share_transaction_subject)");
                this.f20571a = 1;
                obj = B.a(a10, transactionActivity, "transaction.txt", string, string2, "transaction", this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            Intent intent = (Intent) obj;
            if (intent != null) {
                this.f20573c.startActivity(intent);
            }
            return Unit.f36324a;
        }
    }

    static final class g extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f20574a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f20575b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TransactionActivity f20576c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(A a10, TransactionActivity transactionActivity, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f20575b = a10;
            this.f20576c = transactionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new g(this.f20575b, this.f20576c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((g) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f20574a;
            if (i10 == 0) {
                p.b(obj);
                A a10 = this.f20575b;
                TransactionActivity transactionActivity = this.f20576c;
                String string = transactionActivity.getString(K2.g.f5213O);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_share_transaction_title)");
                String string2 = this.f20576c.getString(K2.g.f5212N);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_share_transaction_subject)");
                this.f20574a = 1;
                obj = B.b(a10, transactionActivity, string, string2, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            this.f20576c.startActivity((Intent) obj);
            return Unit.f36324a;
        }
    }

    public static final class h extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.activity.f f20577a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.activity.f fVar) {
            super(0);
            this.f20577a = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            W viewModelStore = this.f20577a.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    static final class i extends m implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.c invoke() {
            return new v(TransactionActivity.this.getIntent().getLongExtra("transaction_id", 0L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u I() {
        return (u) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(TransactionActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        M2.c cVar = this$0.transactionBinding;
        if (cVar != null) {
            cVar.f6002d.setText(str);
        } else {
            Intrinsics.v("transactionBinding");
            throw null;
        }
    }

    private final void K(Menu menu) {
        final MenuItem findItem = menu.findItem(K2.d.f5173q);
        findItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: T2.d
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean L10;
                L10 = TransactionActivity.L(TransactionActivity.this, menuItem);
                return L10;
            }
        });
        I().h().i(this, new InterfaceC1608z() { // from class: T2.e
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                TransactionActivity.M(findItem, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(TransactionActivity this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I().l();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(MenuItem menuItem, Boolean encode) {
        Intrinsics.checkNotNullExpressionValue(encode, "encode");
        menuItem.setIcon(encode.booleanValue() ? K2.c.f5116c : K2.c.f5114a);
    }

    private final void N(ViewPager viewPager) {
        G supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        viewPager.setAdapter(new T2.m(this, supportFragmentManager));
        viewPager.c(new e());
        viewPager.setCurrentItem(f20565f);
    }

    private final boolean O(Function1 block) {
        HttpTransaction httpTransaction = (HttpTransaction) I().j().f();
        if (httpTransaction != null) {
            AbstractC0891k.d(AbstractC1600q.a(this), null, null, new f((A) block.invoke(httpTransaction), this, null), 3, null);
            return true;
        }
        String string = getString(K2.g.f5199A);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_request_not_ready)");
        C(string);
        return true;
    }

    private final boolean P(Function1 block) {
        HttpTransaction httpTransaction = (HttpTransaction) I().j().f();
        if (httpTransaction != null) {
            AbstractC0891k.d(AbstractC1600q.a(this), null, null, new g((A) block.invoke(httpTransaction), this, null), 3, null);
            return true;
        }
        String string = getString(K2.g.f5199A);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_request_not_ready)");
        C(string);
        return true;
    }

    @Override // com.chuckerteam.chucker.internal.ui.a, androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        M2.c c10 = M2.c.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(layoutInflater)");
        this.transactionBinding = c10;
        if (c10 == null) {
            Intrinsics.v("transactionBinding");
            throw null;
        }
        setContentView(c10.b());
        setSupportActionBar(c10.f6001c);
        ViewPager viewPager = c10.f6003e;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        N(viewPager);
        c10.f6000b.setupWithViewPager(c10.f6003e);
        AbstractC1397a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
        I().k().i(this, new InterfaceC1608z() { // from class: T2.c
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                TransactionActivity.J(TransactionActivity.this, (String) obj);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(K2.f.f5197c, menu);
        K(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        return itemId == K2.d.f5135P ? P(new b()) : itemId == K2.d.f5133N ? P(c.f20569a) : itemId == K2.d.f5134O ? O(new d()) : super.onOptionsItemSelected(item);
    }
}
