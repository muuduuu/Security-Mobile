package com.chuckerteam.chucker.internal.ui.throwable;

import K2.d;
import K2.g;
import S2.e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.activity.f;
import androidx.appcompat.app.AbstractC1397a;
import androidx.core.app.B;
import androidx.lifecycle.InterfaceC1608z;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import com.chuckerteam.chucker.internal.ui.a;
import com.chuckerteam.chucker.internal.ui.throwable.ThrowableActivity;
import java.text.DateFormat;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u00020!*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/throwable/ThrowableActivity;", "Lcom/chuckerteam/chucker/internal/ui/a;", "<init>", "()V", "Lcom/chuckerteam/chucker/internal/data/entity/c;", "throwable", BuildConfig.FLAVOR, "I", "(Lcom/chuckerteam/chucker/internal/data/entity/c;)V", "H", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", BuildConfig.FLAVOR, "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LS2/e;", "c", "Lkotlin/Lazy;", "F", "()LS2/e;", "viewModel", "LM2/b;", "d", "LM2/b;", "errorBinding", BuildConfig.FLAVOR, "E", "(Lcom/chuckerteam/chucker/internal/data/entity/c;)Ljava/lang/String;", "formattedDate", "e", C4870a.f43493a, "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ThrowableActivity extends a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new U(C5142C.b(e.class), new b(this), new c());

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private M2.b errorBinding;

    /* renamed from: com.chuckerteam.chucker.internal.ui.throwable.ThrowableActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, long j10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) ThrowableActivity.class);
            intent.putExtra("transaction_id", j10);
            context.startActivity(intent);
        }

        private Companion() {
        }
    }

    public static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f20562a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(0);
            this.f20562a = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            W viewModelStore = this.f20562a.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    static final class c extends m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.c invoke() {
            return new S2.f(ThrowableActivity.this.getIntent().getLongExtra("transaction_id", 0L));
        }
    }

    private final String E(com.chuckerteam.chucker.internal.data.entity.c cVar) {
        String format = DateFormat.getDateTimeInstance(3, 2).format(cVar.c());
        Intrinsics.checkNotNullExpressionValue(format, "getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM)\n                .format(this.date)");
        return format;
    }

    private final e F() {
        return (e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(ThrowableActivity this$0, com.chuckerteam.chucker.internal.data.entity.c it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.H(it);
    }

    private final void H(com.chuckerteam.chucker.internal.data.entity.c throwable) {
        M2.b bVar = this.errorBinding;
        if (bVar == null) {
            Intrinsics.v("errorBinding");
            throw null;
        }
        bVar.f5998e.setText(E(throwable));
        bVar.f5995b.f6052e.setText(throwable.f());
        bVar.f5995b.f6049b.setText(throwable.a());
        bVar.f5995b.f6051d.setText(throwable.e());
        bVar.f5996c.setText(throwable.b());
    }

    private final void I(com.chuckerteam.chucker.internal.data.entity.c throwable) {
        String string = getString(g.f5209K, E(throwable), throwable.a(), throwable.f(), throwable.e(), throwable.b());
        Intrinsics.checkNotNullExpressionValue(string, "getString(\n            R.string.chucker_share_throwable_content,\n            throwable.formattedDate,\n            throwable.clazz,\n            throwable.tag,\n            throwable.message,\n            throwable.content\n        )");
        startActivity(B.a.d(this).j("text/plain").f(getString(g.f5211M)).h(getString(g.f5210L)).i(string).c());
    }

    @Override // com.chuckerteam.chucker.internal.ui.a, androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        M2.b c10 = M2.b.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(layoutInflater)");
        this.errorBinding = c10;
        if (c10 == null) {
            Intrinsics.v("errorBinding");
            throw null;
        }
        setContentView(c10.b());
        setSupportActionBar(c10.f5997d);
        c10.f5995b.f6050c.setVisibility(8);
        AbstractC1397a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
        F().e().i(this, new InterfaceC1608z() { // from class: S2.a
            @Override // androidx.lifecycle.InterfaceC1608z
            public final void b(Object obj) {
                ThrowableActivity.G(ThrowableActivity.this, (com.chuckerteam.chucker.internal.data.entity.c) obj);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "menuInflater");
        menuInflater.inflate(K2.f.f5195a, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != d.f5135P) {
            return super.onOptionsItemSelected(item);
        }
        com.chuckerteam.chucker.internal.data.entity.c cVar = (com.chuckerteam.chucker.internal.data.entity.c) F().e().f();
        if (cVar != null) {
            I(cVar);
        }
        return true;
    }
}
