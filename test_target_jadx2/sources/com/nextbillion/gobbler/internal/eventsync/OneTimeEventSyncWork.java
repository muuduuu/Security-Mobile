package com.nextbillion.gobbler.internal.eventsync;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import v9.C4975d;
import v9.GobblerConfig;
import v9.g;
import z9.InterfaceC5264a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/nextbillion/gobbler/internal/eventsync/OneTimeEventSyncWork;", "Lcom/nextbillion/gobbler/internal/eventsync/BaseEventSyncWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "s", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "j", "Ljava/lang/String;", "TAG", "gobbler_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneTimeEventSyncWork extends BaseEventSyncWorker {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f29183a;

        /* renamed from: b, reason: collision with root package name */
        Object f29184b;

        /* renamed from: c, reason: collision with root package name */
        Object f29185c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f29186d;

        /* renamed from: f, reason: collision with root package name */
        int f29188f;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29186d = obj;
            this.f29188f |= Integer.MIN_VALUE;
            return OneTimeEventSyncWork.this.s(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTimeEventSyncWork(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.TAG = "Gobbler.OneTimeEventSyncWork";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:18:0x003c, B:19:0x00ce, B:21:0x00d6, B:22:0x00df, B:23:0x00db, B:25:0x004d, B:26:0x00a2, B:28:0x00aa, B:29:0x00be, B:33:0x0054, B:36:0x0083, B:40:0x00e8), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:18:0x003c, B:19:0x00ce, B:21:0x00d6, B:22:0x00df, B:23:0x00db, B:25:0x004d, B:26:0x00a2, B:28:0x00aa, B:29:0x00be, B:33:0x0054, B:36:0x0083, B:40:0x00e8), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:18:0x003c, B:19:0x00ce, B:21:0x00d6, B:22:0x00df, B:23:0x00db, B:25:0x004d, B:26:0x00a2, B:28:0x00aa, B:29:0x00be, B:33:0x0054, B:36:0x0083, B:40:0x00e8), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:18:0x003c, B:19:0x00ce, B:21:0x00d6, B:22:0x00df, B:23:0x00db, B:25:0x004d, B:26:0x00a2, B:28:0x00aa, B:29:0x00be, B:33:0x0054, B:36:0x0083, B:40:0x00e8), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        g valueOf;
        OneTimeEventSyncWork oneTimeEventSyncWork;
        E9.a aVar2;
        List list;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f29188f;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f29188f = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f29186d;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f29188f;
                    if (i10 != 0) {
                        p.b(obj);
                        C4975d.f44033a.b(true);
                        boolean h10 = f().h("IS_FOREGROUND_SYNC", true);
                        String j10 = f().j("SERVICE_NAME");
                        InterfaceC5264a.C0676a c0676a = InterfaceC5264a.f45781a;
                        GobblerConfig i12 = c0676a.a().i();
                        E9.a e11 = c0676a.a().e();
                        if (!h10 || j10 == null) {
                            aVar.f29188f = 3;
                            obj = y(aVar);
                            if (obj == e10) {
                                return e10;
                            }
                        } else {
                            valueOf = g.valueOf(j10);
                            int flushBatchSize = i12.e(valueOf).getFlushBatchSize();
                            aVar.f29183a = this;
                            aVar.f29184b = e11;
                            aVar.f29185c = valueOf;
                            aVar.f29188f = 1;
                            obj = e11.g("todo", flushBatchSize, valueOf, aVar);
                            if (obj == e10) {
                                return e10;
                            }
                            oneTimeEventSyncWork = this;
                            aVar2 = e11;
                            list = (List) obj;
                            if (list.isEmpty()) {
                            }
                        }
                    } else if (i10 == 1) {
                        valueOf = (g) aVar.f29185c;
                        aVar2 = (E9.a) aVar.f29184b;
                        oneTimeEventSyncWork = (OneTimeEventSyncWork) aVar.f29183a;
                        p.b(obj);
                        list = (List) obj;
                        if (list.isEmpty()) {
                            aVar.f29183a = null;
                            aVar.f29184b = null;
                            aVar.f29185c = null;
                            aVar.f29188f = 2;
                            obj = oneTimeEventSyncWork.B(aVar2, list, valueOf, aVar);
                            if (obj == e10) {
                                return e10;
                            }
                            if (!((Boolean) obj).booleanValue()) {
                            }
                            Intrinsics.d(obj);
                        } else {
                            F9.d.g(F9.d.f2658a, oneTimeEventSyncWork.TAG, "ForegroundSync:: Empty event list", null, 4, null);
                            obj = c.a.c();
                            Intrinsics.d(obj);
                        }
                    } else if (i10 == 2) {
                        p.b(obj);
                        obj = !((Boolean) obj).booleanValue() ? c.a.c() : c.a.a();
                        Intrinsics.d(obj);
                    } else {
                        if (i10 != 3) {
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
        Object obj2 = aVar.f29186d;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f29188f;
    }
}
