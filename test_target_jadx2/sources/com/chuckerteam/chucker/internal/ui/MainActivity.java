package com.chuckerteam.chucker.internal.ui;

import S2.b;
import T2.f;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.G;
import androidx.viewpager.widget.ViewPager;
import com.chuckerteam.chucker.internal.ui.throwable.ThrowableActivity;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\b\u0000\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/MainActivity;", "Lcom/chuckerteam/chucker/internal/ui/a;", "LT2/f$a;", "LS2/b$a;", "<init>", "()V", "Landroid/content/Intent;", "intent", BuildConfig.FLAVOR, "D", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", BuildConfig.FLAVOR, "throwableId", BuildConfig.FLAVOR, "position", C4870a.f43493a, "(JI)V", "transactionId", "l", "LM2/a;", "c", "LM2/a;", "mainBinding", BuildConfig.FLAVOR, "E", "()Ljava/lang/CharSequence;", "applicationName", "d", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MainActivity extends a implements f.a, b.a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private M2.a mainBinding;

    public static final class b extends TabLayout.h {
        b(TabLayout tabLayout) {
            super(tabLayout);
        }

        @Override // com.google.android.material.tabs.TabLayout.h, androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            super.c(i10);
            if (i10 == 0) {
                L2.a.b(MainActivity.this);
            } else {
                L2.a.a(MainActivity.this);
            }
        }
    }

    private final void D(Intent intent) {
        int intExtra = intent.getIntExtra("EXTRA_SCREEN", 1);
        M2.a aVar = this.mainBinding;
        if (aVar != null) {
            aVar.f5993d.setCurrentItem(intExtra == 1 ? 0 : 1);
        } else {
            Intrinsics.v("mainBinding");
            throw null;
        }
    }

    private final CharSequence E() {
        CharSequence loadLabel = getApplicationInfo().loadLabel(getPackageManager());
        Intrinsics.checkNotNullExpressionValue(loadLabel, "applicationInfo.loadLabel(packageManager)");
        return loadLabel;
    }

    @Override // S2.b.a
    public void a(long throwableId, int position) {
        ThrowableActivity.INSTANCE.a(this, throwableId);
    }

    @Override // T2.f.a
    public void l(long transactionId, int position) {
        TransactionActivity.INSTANCE.a(this, transactionId);
    }

    @Override // com.chuckerteam.chucker.internal.ui.a, androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        M2.a c10 = M2.a.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(layoutInflater)");
        this.mainBinding = c10;
        if (c10 == null) {
            Intrinsics.v("mainBinding");
            throw null;
        }
        setContentView(c10.b());
        setSupportActionBar(c10.f5992c);
        c10.f5992c.setSubtitle(E());
        ViewPager viewPager = c10.f5993d;
        G supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        viewPager.setAdapter(new R2.a(this, supportFragmentManager));
        c10.f5991b.setupWithViewPager(c10.f5993d);
        c10.f5993d.c(new b(c10.f5991b));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        D(intent);
    }

    @Override // androidx.activity.f, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        D(intent);
    }
}
