package I0;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o implements E {

    /* renamed from: d, reason: collision with root package name */
    public static final b f4209d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Set f4210e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f4211f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final A f4212a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f4213b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f4214c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4215a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return v.a(it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return o.f4210e;
        }

        public final Object b() {
            return o.f4211f;
        }

        private b() {
        }
    }

    static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f4216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f4216a = file;
        }

        public final void a() {
            b bVar = o.f4209d;
            Object b10 = bVar.b();
            File file = this.f4216a;
            synchronized (b10) {
                bVar.a().remove(file.getAbsolutePath());
                Unit unit = Unit.f36324a;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public o(A serializer, Function1 coordinatorProducer, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.f4212a = serializer;
        this.f4213b = coordinatorProducer;
        this.f4214c = produceFile;
    }

    @Override // I0.E
    public F a() {
        File file = ((File) this.f4214c.invoke()).getCanonicalFile();
        synchronized (f4211f) {
            String path = file.getAbsolutePath();
            Set set = f4210e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.checkNotNullExpressionValue(path, "path");
            set.add(path);
        }
        Intrinsics.checkNotNullExpressionValue(file, "file");
        return new p(file, this.f4212a, (t) this.f4213b.invoke(file), new c(file));
    }

    public /* synthetic */ o(A a10, Function1 function1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(a10, (i10 & 2) != 0 ? a.f4215a : function1, function0);
    }
}
