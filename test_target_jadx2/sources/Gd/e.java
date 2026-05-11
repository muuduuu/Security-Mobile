package Gd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import wc.InterfaceC5068n;
import xc.m;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1 f2999a = f.f3010a;

    /* renamed from: b, reason: collision with root package name */
    private static final Function1 f3000b = b.f3006a;

    /* renamed from: c, reason: collision with root package name */
    private static final Function1 f3001c = a.f3005a;

    /* renamed from: d, reason: collision with root package name */
    private static final Function1 f3002d = c.f3007a;

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f3003e = d.f3008a;

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC5068n f3004f = C0074e.f3009a;

    static final class a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3005a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    static final class b extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f3006a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    public static final Function1 a() {
        return f3000b;
    }

    public static final InterfaceC5068n b() {
        return f3004f;
    }

    static final class c extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3007a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return Unit.f36324a;
        }

        public final void a(Object obj) {
        }
    }

    static final class f extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f3010a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    static final class d extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f3008a = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(obj, obj2);
            return Unit.f36324a;
        }

        public final void a(Object obj, Object obj2) {
        }
    }

    /* renamed from: Gd.e$e, reason: collision with other inner class name */
    static final class C0074e extends m implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0074e f3009a = new C0074e();

        C0074e() {
            super(3);
        }

        @Override // wc.InterfaceC5068n
        public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3) {
            a(obj, obj2, obj3);
            return Unit.f36324a;
        }

        public final void a(Object obj, Object obj2, Object obj3) {
        }
    }
}
