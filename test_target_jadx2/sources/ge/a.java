package Ge;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0075a f3026a = new C0075a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList f3027b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static volatile b[] f3028c = new b[0];

    /* renamed from: Ge.a$a, reason: collision with other inner class name */
    public static final class C0075a extends b {
        public /* synthetic */ C0075a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Ge.a.b
        public void a(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (b bVar : a.f3028c) {
                bVar.a(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Ge.a.b
        public void b(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (b bVar : a.f3028c) {
                bVar.b(th, str, Arrays.copyOf(args, args.length));
            }
        }

        public final b d(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            b[] bVarArr = a.f3028c;
            int length = bVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                b bVar = bVarArr[i10];
                i10++;
                bVar.c().set(tag);
            }
            return this;
        }

        private C0075a() {
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadLocal f3029a = new ThreadLocal();

        public abstract void a(Throwable th, String str, Object... objArr);

        public abstract void b(Throwable th, String str, Object... objArr);

        public final /* synthetic */ ThreadLocal c() {
            return this.f3029a;
        }
    }
}
