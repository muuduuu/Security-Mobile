package com.chuckerteam.chucker.internal.support;

import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.N;
import Jd.O;
import O2.b;
import O2.e;
import Q2.w;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import u5.C4870a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService;", "Landroid/app/IntentService;", "<init>", "()V", "Landroid/content/Intent;", "intent", BuildConfig.FLAVOR, "onHandleIntent", "(Landroid/content/Intent;)V", C4870a.f43493a, "b", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ClearDatabaseService extends IntentService {

    public static abstract class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final C0362a f20551a = new C0362a(null);

        /* renamed from: com.chuckerteam.chucker.internal.support.ClearDatabaseService$a$a, reason: collision with other inner class name */
        public static final class C0362a {
            public /* synthetic */ C0362a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0362a() {
            }
        }

        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final b f20552b = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class c extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f20553a;

        c(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d dVar) {
            return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f20553a;
            if (i10 == 0) {
                p.b(obj);
                b c10 = e.f7006a.c();
                this.f20553a = 1;
                if (c10.f(this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    public ClearDatabaseService() {
        super("Chucker-ClearDatabaseService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if ((intent == null ? null : intent.getSerializableExtra("EXTRA_ITEM_TO_CLEAR")) instanceof a.b) {
            e eVar = e.f7006a;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            eVar.a(applicationContext);
            AbstractC0891k.d(O.a(C0874b0.b()), null, null, new c(null), 3, null);
            w.f8125e.a();
            new w(this).g();
        }
    }
}
