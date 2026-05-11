package com.nextbillion.gobbler.internal.eventsync;

import Jd.AbstractC0881f;
import Jd.AbstractC0887i;
import Jd.AbstractC0891k;
import Jd.N;
import Jd.O;
import Jd.O0;
import Jd.V;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.groww.ems.EventRequestV2.EventRequestV2OuterClass$EventRequestV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.i;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import v9.GobblerConfig;
import v9.g;
import xc.m;
import y9.C5180a;
import z9.InterfaceC5264a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0084@¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0084@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H\u0084@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/nextbillion/gobbler/internal/eventsync/BaseEventSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "LE9/a;", "repo", BuildConfig.FLAVOR, "Ly9/a;", "eventsFromDb", "Lv9/g;", "serviceName", BuildConfig.FLAVOR, "B", "(LE9/a;Ljava/util/List;Lv9/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "flushBatchSize", "Landroidx/work/c$a;", "z", "(LE9/a;ILv9/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "y", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "h", "Ljava/lang/String;", "TAG", "LJd/N;", "i", "Lkotlin/Lazy;", "A", "()LJd/N;", "scope", "gobbler_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseEventSyncWorker extends CoroutineWorker {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy scope;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f29158a;

        /* renamed from: c, reason: collision with root package name */
        int f29160c;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29158a = obj;
            this.f29160c |= Integer.MIN_VALUE;
            return BaseEventSyncWorker.this.y(this);
        }
    }

    static final class b extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f29161a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E9.a f29163c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GobblerConfig.Sync f29164d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f29165e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(E9.a aVar, GobblerConfig.Sync sync, g gVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f29163c = aVar;
            this.f29164d = sync;
            this.f29165e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return BaseEventSyncWorker.this.new b(this.f29163c, this.f29164d, this.f29165e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f29161a;
            if (i10 == 0) {
                p.b(obj);
                BaseEventSyncWorker baseEventSyncWorker = BaseEventSyncWorker.this;
                E9.a aVar = this.f29163c;
                int flushBatchSize = this.f29164d.getFlushBatchSize();
                g gVar = this.f29165e;
                this.f29161a = 1;
                obj = baseEventSyncWorker.z(aVar, flushBatchSize, gVar, this);
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

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29166a;

        /* renamed from: b, reason: collision with root package name */
        Object f29167b;

        /* renamed from: c, reason: collision with root package name */
        Object f29168c;

        /* renamed from: d, reason: collision with root package name */
        int f29169d;

        /* renamed from: e, reason: collision with root package name */
        int f29170e;

        /* renamed from: f, reason: collision with root package name */
        int f29171f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f29172g;

        /* renamed from: i, reason: collision with root package name */
        int f29174i;

        c(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29172g = obj;
            this.f29174i |= Integer.MIN_VALUE;
            return BaseEventSyncWorker.this.z(null, 0, null, this);
        }
    }

    static final class d extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f29175a;

        /* renamed from: b, reason: collision with root package name */
        int f29176b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f29177c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E9.a f29178d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f29179e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ BaseEventSyncWorker f29180f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, E9.a aVar, g gVar, BaseEventSyncWorker baseEventSyncWorker, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f29177c = list;
            this.f29178d = aVar;
            this.f29179e = gVar;
            this.f29180f = baseEventSyncWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new d(this.f29177c, this.f29178d, this.f29179e, this.f29180f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((d) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0117 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:10:0x0020, B:13:0x0028, B:15:0x0031, B:17:0x010f, B:19:0x0117, B:22:0x015d, B:26:0x003c, B:28:0x00fd, B:32:0x0047, B:33:0x00a5, B:34:0x00b9, B:36:0x00bf, B:39:0x00d1, B:44:0x00d5, B:48:0x004e, B:49:0x0061, B:51:0x0067, B:53:0x0075), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x015d A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:10:0x0020, B:13:0x0028, B:15:0x0031, B:17:0x010f, B:19:0x0117, B:22:0x015d, B:26:0x003c, B:28:0x00fd, B:32:0x0047, B:33:0x00a5, B:34:0x00b9, B:36:0x00bf, B:39:0x00d1, B:44:0x00d5, B:48:0x004e, B:49:0x0061, B:51:0x0067, B:53:0x0075), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x010e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:10:0x0020, B:13:0x0028, B:15:0x0031, B:17:0x010f, B:19:0x0117, B:22:0x015d, B:26:0x003c, B:28:0x00fd, B:32:0x0047, B:33:0x00a5, B:34:0x00b9, B:36:0x00bf, B:39:0x00d1, B:44:0x00d5, B:48:0x004e, B:49:0x0061, B:51:0x0067, B:53:0x0075), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00fc A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String e10;
            Object a10;
            Object f10;
            Object e11 = AbstractC3868b.e();
            boolean z10 = true;
            boolean z11 = false;
            try {
            } catch (Exception e12) {
                Ge.a.f3026a.d(this.f29180f.TAG).b(e12, "performRequest(" + this.f29177c.size() + ", " + this.f29179e + "): Exception: " + e12.getMessage(), new Object[0]);
                E9.a aVar = this.f29178d;
                List list = this.f29177c;
                g gVar = this.f29179e;
                this.f29175a = null;
                this.f29176b = 6;
                if (aVar.e(BuildConfig.FLAVOR, "todo", list, gVar, this) == e11) {
                    return e11;
                }
            }
            switch (this.f29176b) {
                case 0:
                    p.b(obj);
                    List list2 = this.f29177c;
                    ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C5180a) it.next()).c());
                    }
                    e10 = F9.d.e(F9.d.f2658a, CollectionsKt.l0(arrayList, BuildConfig.FLAVOR, null, null, 0, null, null, 62, null), null, 2, null);
                    E9.a aVar2 = this.f29178d;
                    List list3 = this.f29177c;
                    g gVar2 = this.f29179e;
                    this.f29175a = e10;
                    this.f29176b = 1;
                    if (aVar2.e(e10, "in_progress", list3, gVar2, this) == e11) {
                        return e11;
                    }
                    Set h10 = this.f29180f.h();
                    Intrinsics.checkNotNullExpressionValue(h10, "getTags(...)");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : h10) {
                        String str = (String) obj2;
                        Intrinsics.d(str);
                        if (StringsKt.F(str, "Gobbler_", false, 2, null)) {
                            arrayList2.add(obj2);
                        }
                    }
                    String l02 = CollectionsKt.l0(arrayList2, ",", null, null, 0, null, null, 62, null);
                    E9.a aVar3 = this.f29178d;
                    List list4 = this.f29177c;
                    g gVar3 = this.f29179e;
                    this.f29175a = e10;
                    this.f29176b = 2;
                    a10 = aVar3.a(e10, list4, l02, gVar3, this);
                    if (a10 == e11) {
                        return e11;
                    }
                    E9.a aVar4 = this.f29178d;
                    g gVar4 = this.f29179e;
                    this.f29175a = e10;
                    this.f29176b = 3;
                    f10 = aVar4.f((EventRequestV2OuterClass$EventRequestV2) a10, gVar4, this);
                    if (f10 == e11) {
                        return e11;
                    }
                    if (!((Boolean) f10).booleanValue()) {
                        F9.d.g(F9.d.f2658a, this.f29180f.TAG, "performRequest(" + this.f29177c.size() + ", " + this.f29179e + "): synced, requestId " + e10, null, 4, null);
                        E9.a aVar5 = this.f29178d;
                        g gVar5 = this.f29179e;
                        this.f29175a = null;
                        this.f29176b = 4;
                        if (aVar5.d(e10, gVar5, this) == e11) {
                            return e11;
                        }
                        z11 = z10;
                        return kotlin.coroutines.jvm.internal.b.a(z11);
                    }
                    F9.d.g(F9.d.f2658a, this.f29180f.TAG, "performRequest(" + this.f29177c.size() + ", " + this.f29179e + "): failed, requestId " + e10, null, 4, null);
                    E9.a aVar6 = this.f29178d;
                    List list5 = this.f29177c;
                    g gVar6 = this.f29179e;
                    this.f29175a = null;
                    this.f29176b = 5;
                    if (aVar6.e(BuildConfig.FLAVOR, "todo", list5, gVar6, this) == e11) {
                        return e11;
                    }
                    z10 = false;
                    z11 = z10;
                    return kotlin.coroutines.jvm.internal.b.a(z11);
                case 1:
                    e10 = (String) this.f29175a;
                    p.b(obj);
                    Set h102 = this.f29180f.h();
                    Intrinsics.checkNotNullExpressionValue(h102, "getTags(...)");
                    ArrayList arrayList22 = new ArrayList();
                    while (r1.hasNext()) {
                    }
                    String l022 = CollectionsKt.l0(arrayList22, ",", null, null, 0, null, null, 62, null);
                    E9.a aVar32 = this.f29178d;
                    List list42 = this.f29177c;
                    g gVar32 = this.f29179e;
                    this.f29175a = e10;
                    this.f29176b = 2;
                    a10 = aVar32.a(e10, list42, l022, gVar32, this);
                    if (a10 == e11) {
                    }
                    E9.a aVar42 = this.f29178d;
                    g gVar42 = this.f29179e;
                    this.f29175a = e10;
                    this.f29176b = 3;
                    f10 = aVar42.f((EventRequestV2OuterClass$EventRequestV2) a10, gVar42, this);
                    if (f10 == e11) {
                    }
                    if (!((Boolean) f10).booleanValue()) {
                    }
                    break;
                case 2:
                    e10 = (String) this.f29175a;
                    p.b(obj);
                    a10 = obj;
                    E9.a aVar422 = this.f29178d;
                    g gVar422 = this.f29179e;
                    this.f29175a = e10;
                    this.f29176b = 3;
                    f10 = aVar422.f((EventRequestV2OuterClass$EventRequestV2) a10, gVar422, this);
                    if (f10 == e11) {
                    }
                    if (!((Boolean) f10).booleanValue()) {
                    }
                    break;
                case 3:
                    e10 = (String) this.f29175a;
                    p.b(obj);
                    f10 = obj;
                    if (!((Boolean) f10).booleanValue()) {
                    }
                    break;
                case 4:
                    p.b(obj);
                    z11 = z10;
                    return kotlin.coroutines.jvm.internal.b.a(z11);
                case 5:
                    p.b(obj);
                    z10 = false;
                    z11 = z10;
                    return kotlin.coroutines.jvm.internal.b.a(z11);
                case 6:
                    p.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(z11);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    static final class e extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f29181a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke() {
            return O.a(O0.b(null, 1, null).l(F9.c.f2651a.a()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEventSyncWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.TAG = "Gobbler.BaseEventSyncWorker";
        this.scope = i.a(e.f29181a);
    }

    private final N A() {
        return (N) this.scope.getValue();
    }

    protected final Object B(E9.a aVar, List list, g gVar, kotlin.coroutines.d dVar) {
        return AbstractC0887i.g(F9.c.f2651a.a(), new d(list, aVar, gVar, this, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object y(kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        V b10;
        Iterator it;
        Object obj;
        c.a aVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f29160c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f29160c = i11 - Integer.MIN_VALUE;
                Object obj2 = aVar.f29158a;
                Object e10 = AbstractC3868b.e();
                i10 = aVar.f29160c;
                if (i10 != 0) {
                    p.b(obj2);
                    InterfaceC5264a.C0676a c0676a = InterfaceC5264a.f45781a;
                    E9.a e11 = c0676a.a().e();
                    HashMap f10 = c0676a.a().j().f();
                    ArrayList arrayList = new ArrayList(f10.size());
                    Iterator it2 = f10.entrySet().iterator();
                    while (it2.hasNext()) {
                        g gVar = (g) ((Map.Entry) it2.next()).getKey();
                        b10 = AbstractC0891k.b(A(), null, null, new b(e11, InterfaceC5264a.f45781a.a().i().e(gVar), gVar, null), 3, null);
                        arrayList.add(b10);
                    }
                    aVar.f29160c = 1;
                    obj2 = AbstractC0881f.a(arrayList, aVar);
                    if (obj2 == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj2);
                }
                it = ((List) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.b((c.a) obj, c.a.c())) {
                        break;
                    }
                }
                aVar2 = (c.a) obj;
                if (aVar2 == null) {
                    return aVar2;
                }
                c.a a10 = c.a.a();
                Intrinsics.checkNotNullExpressionValue(a10, "failure(...)");
                return a10;
            }
        }
        aVar = new a(dVar);
        Object obj22 = aVar.f29158a;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f29160c;
        if (i10 != 0) {
        }
        it = ((List) obj22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        aVar2 = (c.a) obj;
        if (aVar2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ae -> B:13:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d3 -> B:11:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object z(E9.a aVar, int i10, g gVar, kotlin.coroutines.d dVar) {
        c cVar;
        BaseEventSyncWorker baseEventSyncWorker;
        int i11;
        E9.a aVar2;
        g gVar2;
        c cVar2;
        BaseEventSyncWorker baseEventSyncWorker2;
        int i12;
        int i13;
        int i14;
        BaseEventSyncWorker baseEventSyncWorker3;
        E9.a aVar3;
        List list;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i15 = cVar.f29174i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar.f29174i = i15 - Integer.MIN_VALUE;
                baseEventSyncWorker = this;
                Object obj = cVar.f29172g;
                Object e10 = AbstractC3868b.e();
                i11 = cVar.f29174i;
                if (i11 != 0) {
                    p.b(obj);
                    aVar2 = aVar;
                    gVar2 = gVar;
                    cVar2 = cVar;
                    baseEventSyncWorker2 = baseEventSyncWorker;
                    i12 = 1;
                    i13 = 1;
                    i14 = i10;
                    if (i12 == 0) {
                    }
                } else if (i11 == 1) {
                    int i16 = cVar.f29171f;
                    int i17 = cVar.f29170e;
                    int i18 = cVar.f29169d;
                    g gVar3 = (g) cVar.f29168c;
                    aVar3 = (E9.a) cVar.f29167b;
                    baseEventSyncWorker3 = (BaseEventSyncWorker) cVar.f29166a;
                    p.b(obj);
                    cVar2 = cVar;
                    i14 = i18;
                    i12 = i17;
                    i13 = i16;
                    gVar2 = gVar3;
                    list = (List) obj;
                    if (list.isEmpty()) {
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i19 = cVar.f29171f;
                    int i20 = cVar.f29170e;
                    int i21 = cVar.f29169d;
                    g gVar4 = (g) cVar.f29168c;
                    aVar3 = (E9.a) cVar.f29167b;
                    baseEventSyncWorker3 = (BaseEventSyncWorker) cVar.f29166a;
                    p.b(obj);
                    cVar2 = cVar;
                    i14 = i21;
                    i12 = i20;
                    i13 = i19;
                    gVar2 = gVar4;
                    if (!((Boolean) obj).booleanValue()) {
                        i12 = 0;
                        i13 = 0;
                    }
                    aVar2 = aVar3;
                    baseEventSyncWorker2 = baseEventSyncWorker3;
                    if (i12 == 0) {
                        cVar2.f29166a = baseEventSyncWorker2;
                        cVar2.f29167b = aVar2;
                        cVar2.f29168c = gVar2;
                        cVar2.f29169d = i14;
                        cVar2.f29170e = i12;
                        cVar2.f29171f = i13;
                        cVar2.f29174i = 1;
                        Object g10 = aVar2.g("todo", i14, gVar2, cVar2);
                        if (g10 == e10) {
                            return e10;
                        }
                        BaseEventSyncWorker baseEventSyncWorker4 = baseEventSyncWorker2;
                        aVar3 = aVar2;
                        obj = g10;
                        baseEventSyncWorker3 = baseEventSyncWorker4;
                        list = (List) obj;
                        if (list.isEmpty()) {
                            cVar2.f29166a = baseEventSyncWorker3;
                            cVar2.f29167b = aVar3;
                            cVar2.f29168c = gVar2;
                            cVar2.f29169d = i14;
                            cVar2.f29170e = i12;
                            cVar2.f29171f = i13;
                            cVar2.f29174i = 2;
                            obj = baseEventSyncWorker3.B(aVar3, list, gVar2, cVar2);
                            if (obj == e10) {
                                return e10;
                            }
                            if (!((Boolean) obj).booleanValue()) {
                            }
                            aVar2 = aVar3;
                            baseEventSyncWorker2 = baseEventSyncWorker3;
                            if (i12 == 0) {
                            }
                        } else {
                            F9.d.g(F9.d.f2658a, baseEventSyncWorker3.TAG, "Empty event list", null, 4, null);
                            i12 = 0;
                            aVar2 = aVar3;
                            baseEventSyncWorker2 = baseEventSyncWorker3;
                            if (i12 == 0) {
                                if (i13 != 0) {
                                    c.a c10 = c.a.c();
                                    Intrinsics.d(c10);
                                    return c10;
                                }
                                c.a a10 = c.a.a();
                                Intrinsics.d(a10);
                                return a10;
                            }
                        }
                    }
                }
            }
        }
        baseEventSyncWorker = this;
        cVar = baseEventSyncWorker.new c(dVar);
        Object obj2 = cVar.f29172g;
        Object e102 = AbstractC3868b.e();
        i11 = cVar.f29174i;
        if (i11 != 0) {
        }
    }
}
