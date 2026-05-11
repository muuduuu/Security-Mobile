package K0;

import I0.InterfaceC0841g;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import lc.p;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;
import xc.m;

/* loaded from: classes.dex */
public final class a implements InterfaceC0841g {

    /* renamed from: a, reason: collision with root package name */
    private final Function2 f5079a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5068n f5080b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f5081c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5082d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f5083e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f5084f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0.a$a, reason: collision with other inner class name */
    public static final class C0100a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f5085a;

        C0100a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new C0100a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.d dVar) {
            return ((C0100a) create(obj, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f5085a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f5086a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5087b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.f5086a = context;
            this.f5087b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f5086a.getSharedPreferences(this.f5087b, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5088a = new c();

        private c() {
        }

        public static final boolean a(Context context, String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f5089a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f5090b;

        /* renamed from: d, reason: collision with root package name */
        int f5092d;

        d(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5090b = obj;
            this.f5092d |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    private a(Function0 function0, Set set, Function2 function2, InterfaceC5068n interfaceC5068n, Context context, String str) {
        this.f5079a = function2;
        this.f5080b = interfaceC5068n;
        this.f5081c = context;
        this.f5082d = str;
        this.f5083e = i.a(function0);
        this.f5084f = set == K0.b.a() ? null : CollectionsKt.R0(set);
    }

    private final void d(Context context, String str) {
        c.a(context, str);
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.f5083e.getValue();
    }

    @Override // I0.InterfaceC0841g
    public Object a(kotlin.coroutines.d dVar) {
        Context context;
        String str;
        SharedPreferences.Editor edit = e().edit();
        Set set = this.f5084f;
        if (set == null) {
            edit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (!edit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.f5081c) != null && (str = this.f5082d) != null) {
            d(context, str);
        }
        Set set2 = this.f5084f;
        if (set2 != null) {
            set2.clear();
        }
        return Unit.f36324a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r5.isEmpty() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // I0.InterfaceC0841g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Object obj, kotlin.coroutines.d dVar) {
        d dVar2;
        Object obj2;
        int i10;
        a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.f5092d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.f5092d = i11 - Integer.MIN_VALUE;
                obj2 = dVar2.f5090b;
                Object e10 = AbstractC3868b.e();
                i10 = dVar2.f5092d;
                boolean z10 = true;
                if (i10 != 0) {
                    p.b(obj2);
                    Function2 function2 = this.f5079a;
                    dVar2.f5089a = this;
                    dVar2.f5092d = 1;
                    obj2 = function2.invoke(obj, dVar2);
                    if (obj2 == e10) {
                        return e10;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) dVar2.f5089a;
                    p.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return kotlin.coroutines.jvm.internal.b.a(false);
                }
                Set set = aVar.f5084f;
                if (set != null) {
                    SharedPreferences e11 = aVar.e();
                    if (set == null || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (e11.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z10 = false;
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                Map<String, ?> all = aVar.e().getAll();
                Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            }
        }
        dVar2 = new d(dVar);
        obj2 = dVar2.f5090b;
        Object e102 = AbstractC3868b.e();
        i10 = dVar2.f5092d;
        boolean z102 = true;
        if (i10 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    @Override // I0.InterfaceC0841g
    public Object c(Object obj, kotlin.coroutines.d dVar) {
        return this.f5080b.n(new K0.c(e(), this.f5084f), obj, dVar);
    }

    public /* synthetic */ a(Context context, String str, Set set, Function2 function2, InterfaceC5068n interfaceC5068n, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? K0.b.a() : set, (i10 & 8) != 0 ? new C0100a(null) : function2, interfaceC5068n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String sharedPreferencesName, Set keysToMigrate, Function2 shouldRunMigration, InterfaceC5068n migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }
}
