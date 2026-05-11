package xd;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public class f implements xd.n {

    /* renamed from: d, reason: collision with root package name */
    private static final String f45005d = StringsKt.R0(f.class.getCanonicalName(), ".", BuildConfig.FLAVOR);

    /* renamed from: e, reason: collision with root package name */
    public static final xd.n f45006e = new a("NO_LOCKS", InterfaceC0659f.f45015a, xd.e.f45004b);

    /* renamed from: a, reason: collision with root package name */
    protected final xd.k f45007a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0659f f45008b;

    /* renamed from: c, reason: collision with root package name */
    private final String f45009c;

    static class a extends f {
        a(String str, InterfaceC0659f interfaceC0659f, xd.k kVar) {
            super(str, interfaceC0659f, kVar, null);
        }

        private static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // xd.f
        protected o p(String str, Object obj) {
            if (str == null) {
                j(0);
            }
            o a10 = o.a();
            if (a10 == null) {
                j(1);
            }
            return a10;
        }
    }

    class b extends j {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f45010d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, Function0 function0, Object obj) {
            super(fVar, function0);
            this.f45010d = obj;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // xd.f.h
        protected o c(boolean z10) {
            o d10 = o.d(this.f45010d);
            if (d10 == null) {
                a(0);
            }
            return d10;
        }
    }

    class c extends k {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f45012e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f45013f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, Function0 function0, Function1 function1, Function1 function12) {
            super(fVar, function0);
            this.f45012e = function1;
            this.f45013f = function12;
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // xd.f.h
        protected o c(boolean z10) {
            Function1 function1 = this.f45012e;
            if (function1 == null) {
                o c10 = super.c(z10);
                if (c10 == null) {
                    a(0);
                }
                return c10;
            }
            o d10 = o.d(function1.invoke(Boolean.valueOf(z10)));
            if (d10 == null) {
                a(1);
            }
            return d10;
        }

        @Override // xd.f.i
        protected void e(Object obj) {
            if (obj == null) {
                a(2);
            }
            this.f45013f.invoke(obj);
        }
    }

    private static class d extends e implements InterfaceC5157a {
        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // xd.f.e, xd.InterfaceC5157a
        public Object a(Object obj, Function0 function0) {
            if (function0 == null) {
                b(2);
            }
            Object a10 = super.a(obj, function0);
            if (a10 == null) {
                b(3);
            }
            return a10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    private static class e extends l implements xd.b {

        class a implements Function1 {
            a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object invoke(g gVar) {
                return gVar.f45017b.invoke();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Object a(Object obj, Function0 function0) {
            if (function0 == null) {
                b(2);
            }
            return invoke(new g(obj, function0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* renamed from: xd.f$f, reason: collision with other inner class name */
    public interface InterfaceC0659f {

        /* renamed from: a, reason: collision with root package name */
        public static final InterfaceC0659f f45015a = new a();

        /* renamed from: xd.f$f$a */
        static class a implements InterfaceC0659f {
            a() {
            }

            private static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // xd.f.InterfaceC0659f
            public RuntimeException a(Throwable th) {
                if (th == null) {
                    b(0);
                }
                throw Gd.d.b(th);
            }
        }

        RuntimeException a(Throwable th);
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        private final Object f45016a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f45017b;

        public g(Object obj, Function0 function0) {
            this.f45016a = obj;
            this.f45017b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f45016a.equals(((g) obj).f45016a);
        }

        public int hashCode() {
            return this.f45016a.hashCode();
        }
    }

    private static abstract class i extends h {

        /* renamed from: d, reason: collision with root package name */
        private volatile xd.l f45021d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f fVar, Function0 function0) {
            super(fVar, function0);
            if (fVar == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
            this.f45021d = null;
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xd.f.h
        protected final void b(Object obj) {
            this.f45021d = new xd.l(obj);
            try {
                e(obj);
            } finally {
                this.f45021d = null;
            }
        }

        protected abstract void e(Object obj);

        @Override // xd.f.h, kotlin.jvm.functions.Function0
        public Object invoke() {
            xd.l lVar = this.f45021d;
            return (lVar == null || !lVar.b()) ? super.invoke() : lVar.a();
        }
    }

    private static class j extends h implements xd.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f fVar, Function0 function0) {
            super(fVar, function0);
            if (fVar == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // xd.f.h, kotlin.jvm.functions.Function0
        public Object invoke() {
            Object invoke = super.invoke();
            if (invoke == null) {
                a(2);
            }
            return invoke;
        }
    }

    private static abstract class k extends i implements xd.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f fVar, Function0 function0) {
            super(fVar, function0);
            if (fVar == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // xd.f.i, xd.f.h, kotlin.jvm.functions.Function0
        public Object invoke() {
            Object invoke = super.invoke();
            if (invoke == null) {
                a(2);
            }
            return invoke;
        }
    }

    private static class l implements xd.h {

        /* renamed from: a, reason: collision with root package name */
        private final f f45022a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentMap f45023b;

        /* renamed from: c, reason: collision with root package name */
        private final Function1 f45024c;

        public l(f fVar, ConcurrentMap concurrentMap, Function1 function1) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (function1 == null) {
                b(2);
            }
            this.f45022a = fVar;
            this.f45023b = concurrentMap;
            this.f45024c = function1;
        }

        private static /* synthetic */ void b(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        private AssertionError c(Object obj, Object obj2) {
            return (AssertionError) f.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f45022a));
        }

        private AssertionError e(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f45022a));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        private AssertionError g(Object obj, Throwable th) {
            return (AssertionError) f.q(new AssertionError("Unable to remove " + obj + " under " + this.f45022a, th));
        }

        protected o f(Object obj, boolean z10) {
            o p10 = this.f45022a.p(BuildConfig.FLAVOR, obj);
            if (p10 == null) {
                b(3);
            }
            return p10;
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            AssertionError g10;
            Object d10;
            Object obj2 = this.f45023b.get(obj);
            if (obj2 != null && obj2 != n.COMPUTING) {
                return Gd.h.d(obj2);
            }
            this.f45022a.f45007a.lock();
            try {
                Object obj3 = this.f45023b.get(obj);
                n nVar = n.COMPUTING;
                if (obj3 == nVar) {
                    obj3 = n.RECURSION_WAS_DETECTED;
                    o f10 = f(obj, true);
                    if (!f10.c()) {
                        d10 = f10.b();
                        return d10;
                    }
                }
                if (obj3 == n.RECURSION_WAS_DETECTED) {
                    o f11 = f(obj, false);
                    if (!f11.c()) {
                        d10 = f11.b();
                        return d10;
                    }
                }
                if (obj3 != null) {
                    d10 = Gd.h.d(obj3);
                    return d10;
                }
                AssertionError assertionError = null;
                try {
                    this.f45023b.put(obj, nVar);
                    Object invoke = this.f45024c.invoke(obj);
                    Object put = this.f45023b.put(obj, Gd.h.b(invoke));
                    if (put == nVar) {
                        return invoke;
                    }
                    assertionError = e(obj, put);
                    throw assertionError;
                } catch (Throwable th) {
                    if (Gd.d.a(th)) {
                        try {
                            Object remove = this.f45023b.remove(obj);
                            if (remove != n.COMPUTING) {
                                throw c(obj, remove);
                            }
                            throw th;
                        } finally {
                        }
                    }
                    if (th == assertionError) {
                        try {
                            this.f45023b.remove(obj);
                            throw this.f45022a.f45008b.a(th);
                        } finally {
                        }
                    }
                    Object put2 = this.f45023b.put(obj, Gd.h.c(th));
                    if (put2 != n.COMPUTING) {
                        throw e(obj, put2);
                    }
                    throw this.f45022a.f45008b.a(th);
                }
            } finally {
                this.f45022a.f45007a.unlock();
            }
        }

        @Override // xd.h
        public boolean t(Object obj) {
            Object obj2 = this.f45023b.get(obj);
            return (obj2 == null || obj2 == n.COMPUTING) ? false : true;
        }
    }

    private static class m extends l implements xd.g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap concurrentMap, Function1 function1) {
            super(fVar, concurrentMap, function1);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (function1 == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // xd.f.l, kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            Object invoke = super.invoke(obj);
            if (invoke == null) {
                b(3);
            }
            return invoke;
        }
    }

    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class o {

        /* renamed from: a, reason: collision with root package name */
        private final Object f45025a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f45026b;

        private o(Object obj, boolean z10) {
            this.f45025a = obj;
            this.f45026b = z10;
        }

        public static o a() {
            return new o(null, true);
        }

        public static o d(Object obj) {
            return new o(obj, false);
        }

        public Object b() {
            return this.f45025a;
        }

        public boolean c() {
            return this.f45026b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f45025a);
        }
    }

    /* synthetic */ f(String str, InterfaceC0659f interfaceC0659f, xd.k kVar, a aVar) {
        this(str, interfaceC0659f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void j(int i10) {
        String format;
        String str = (i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? 2 : 3];
        if (i10 != 1 && i10 != 3 && i10 != 5) {
            if (i10 != 6) {
                switch (i10) {
                    case 8:
                        break;
                    case 9:
                    case 11:
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case 19:
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        objArr[0] = "compute";
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case 13:
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                        break;
                    case 12:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 27:
                        objArr[0] = "onRecursiveCall";
                        break;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case 18:
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        objArr[0] = "map";
                        break;
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case 26:
                    case 28:
                    case 30:
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                    case 32:
                    case 34:
                        objArr[0] = "computable";
                        break;
                    case 29:
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                        objArr[0] = "postCompute";
                        break;
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                        objArr[0] = "source";
                        break;
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                        objArr[0] = "throwable";
                        break;
                    default:
                        objArr[0] = "debugText";
                        break;
                }
            } else {
                objArr[0] = "lock";
            }
            if (i10 != 10 || i10 == 13) {
                objArr[1] = "createMemoizedFunction";
            } else if (i10 == 20) {
                objArr[1] = "createMemoizedFunctionWithNullableValues";
            } else if (i10 != 37) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
            } else {
                objArr[1] = "sanitizeStackTrace";
            }
            switch (i10) {
                case 4:
                case 5:
                case 6:
                    objArr[2] = "<init>";
                    break;
                case 7:
                case 8:
                    objArr[2] = "replaceExceptionHandling";
                    break;
                case 9:
                case 11:
                case 12:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                case 18:
                    objArr[2] = "createMemoizedFunction";
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 13:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    break;
                case 19:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    objArr[2] = "createMemoizedFunctionWithNullableValues";
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    objArr[2] = "createLazyValue";
                    break;
                case 26:
                case 27:
                    objArr[2] = "createRecursionTolerantLazyValue";
                    break;
                case 28:
                case 29:
                    objArr[2] = "createLazyValueWithPostCompute";
                    break;
                case 30:
                    objArr[2] = "createNullableLazyValue";
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    objArr[2] = "createRecursionTolerantNullableLazyValue";
                    break;
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    objArr[2] = "createNullableLazyValueWithPostCompute";
                    break;
                case 34:
                    objArr[2] = "compute";
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    objArr[2] = "recursionDetectedDefault";
                    break;
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    objArr[2] = "sanitizeStackTrace";
                    break;
                default:
                    objArr[2] = "createWithExceptionHandling";
                    break;
            }
            format = String.format(str, objArr);
            if (i10 == 10 && i10 != 13 && i10 != 20 && i10 != 37) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "exceptionHandlingStrategy";
        if (i10 != 10) {
        }
        objArr[1] = "createMemoizedFunction";
        switch (i10) {
        }
        format = String.format(str, objArr);
        if (i10 == 10) {
        }
        throw new IllegalStateException(format);
    }

    private static ConcurrentMap m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Throwable q(Throwable th) {
        if (th == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!stackTrace[i10].getClassName().startsWith(f45005d)) {
                break;
            }
            i10++;
        }
        List subList = Arrays.asList(stackTrace).subList(i10, length);
        th.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return th;
    }

    @Override // xd.n
    public xd.b a() {
        return new e(this, m(), null);
    }

    @Override // xd.n
    public InterfaceC5157a b() {
        return new d(this, m(), null);
    }

    @Override // xd.n
    public xd.i c(Function0 function0, Object obj) {
        if (function0 == null) {
            j(26);
        }
        if (obj == null) {
            j(27);
        }
        return new b(this, function0, obj);
    }

    @Override // xd.n
    public xd.i d(Function0 function0) {
        if (function0 == null) {
            j(23);
        }
        return new j(this, function0);
    }

    @Override // xd.n
    public Object e(Function0 function0) {
        if (function0 == null) {
            j(34);
        }
        this.f45007a.lock();
        try {
            return function0.invoke();
        } finally {
        }
    }

    @Override // xd.n
    public xd.j f(Function0 function0) {
        if (function0 == null) {
            j(30);
        }
        return new h(this, function0);
    }

    @Override // xd.n
    public xd.i g(Function0 function0, Function1 function1, Function1 function12) {
        if (function0 == null) {
            j(28);
        }
        if (function12 == null) {
            j(29);
        }
        return new c(this, function0, function1, function12);
    }

    @Override // xd.n
    public xd.g h(Function1 function1) {
        if (function1 == null) {
            j(9);
        }
        xd.g n10 = n(function1, m());
        if (n10 == null) {
            j(10);
        }
        return n10;
    }

    @Override // xd.n
    public xd.h i(Function1 function1) {
        if (function1 == null) {
            j(19);
        }
        xd.h o10 = o(function1, m());
        if (o10 == null) {
            j(20);
        }
        return o10;
    }

    public xd.g n(Function1 function1, ConcurrentMap concurrentMap) {
        if (function1 == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, function1);
    }

    public xd.h o(Function1 function1, ConcurrentMap concurrentMap) {
        if (function1 == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, function1);
    }

    protected o p(String str, Object obj) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = BuildConfig.FLAVOR;
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f45009c + ")";
    }

    private f(String str, InterfaceC0659f interfaceC0659f, xd.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0659f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f45007a = kVar;
        this.f45008b = interfaceC0659f;
        this.f45009c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (Function1) null);
    }

    public f(String str, Runnable runnable, Function1 function1) {
        this(str, InterfaceC0659f.f45015a, xd.k.f45027a.a(runnable, function1));
    }

    private static class h implements xd.j {

        /* renamed from: a, reason: collision with root package name */
        private final f f45018a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f45019b;

        /* renamed from: c, reason: collision with root package name */
        private volatile Object f45020c;

        public h(f fVar, Function0 function0) {
            if (fVar == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
            this.f45020c = n.NOT_COMPUTED;
            this.f45018a = fVar;
            this.f45019b = function0;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        protected o c(boolean z10) {
            o p10 = this.f45018a.p("in a lazy value", null);
            if (p10 == null) {
                a(2);
            }
            return p10;
        }

        @Override // kotlin.jvm.functions.Function0
        public Object invoke() {
            Object invoke;
            Object obj = this.f45020c;
            if (!(obj instanceof n)) {
                return Gd.h.f(obj);
            }
            this.f45018a.f45007a.lock();
            try {
                Object obj2 = this.f45020c;
                if (obj2 instanceof n) {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f45020c = n.RECURSION_WAS_DETECTED;
                        o c10 = c(true);
                        if (!c10.c()) {
                            invoke = c10.b();
                        }
                    }
                    if (obj2 == n.RECURSION_WAS_DETECTED) {
                        o c11 = c(false);
                        if (!c11.c()) {
                            invoke = c11.b();
                        }
                    }
                    this.f45020c = nVar;
                    try {
                        invoke = this.f45019b.invoke();
                        b(invoke);
                        this.f45020c = invoke;
                    } catch (Throwable th) {
                        if (Gd.d.a(th)) {
                            this.f45020c = n.NOT_COMPUTED;
                            throw th;
                        }
                        if (this.f45020c == n.COMPUTING) {
                            this.f45020c = Gd.h.c(th);
                        }
                        throw this.f45018a.f45008b.a(th);
                    }
                } else {
                    invoke = Gd.h.f(obj2);
                }
                return invoke;
            } finally {
                this.f45018a.f45007a.unlock();
            }
        }

        public boolean m() {
            return (this.f45020c == n.NOT_COMPUTED || this.f45020c == n.COMPUTING) ? false : true;
        }

        protected void b(Object obj) {
        }
    }
}
