package com.nextbillion.gobbler.internal.eventsync;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import v9.C4975d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/nextbillion/gobbler/internal/eventsync/PeriodicEventSyncWork;", "Lcom/nextbillion/gobbler/internal/eventsync/BaseEventSyncWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "s", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "j", "Ljava/lang/String;", "TAG", "gobbler_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PeriodicEventSyncWork extends BaseEventSyncWorker {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f29190a;

        /* renamed from: c, reason: collision with root package name */
        int f29192c;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29190a = obj;
            this.f29192c |= Integer.MIN_VALUE;
            return PeriodicEventSyncWork.this.s(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicEventSyncWork(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.TAG = "Gobbler.PeriodicEventSyncWork";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f29192c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f29192c = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f29190a;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f29192c;
                    if (i10 != 0) {
                        p.b(obj);
                        C4975d.f44033a.b(true);
                        aVar.f29192c = 1;
                        obj = y(aVar);
                        if (obj == e10) {
                            return e10;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p.b(obj);
                    }
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            return obj;
        } finally {
            C4975d.f44033a.b(false);
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f29190a;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f29192c;
    }
}
