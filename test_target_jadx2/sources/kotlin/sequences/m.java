package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m extends l {

    public static final class a implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f36774a;

        public a(Iterator it) {
            this.f36774a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return this.f36774a;
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36775a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Object> invoke(Sequence<Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.iterator();
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f36776a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f36777a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0 function0) {
            super(1);
            this.f36777a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f36777a.invoke();
        }
    }

    static final class e extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f36778a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(0);
            this.f36778a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f36778a;
        }
    }

    public static Sequence c(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return j.d(new a(it));
    }

    public static Sequence d(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof kotlin.sequences.a ? sequence : new kotlin.sequences.a(sequence);
    }

    public static Sequence e() {
        return kotlin.sequences.d.f36749a;
    }

    public static final Sequence f(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return g(sequence, b.f36775a);
    }

    private static final Sequence g(Sequence sequence, Function1 function1) {
        return sequence instanceof q ? ((q) sequence).d(function1) : new f(sequence, c.f36776a, function1);
    }

    public static Sequence h(Object obj, Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? kotlin.sequences.d.f36749a : new g(new e(obj), nextFunction);
    }

    public static Sequence i(Function0 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return j.d(new g(nextFunction, new d(nextFunction)));
    }

    public static final Sequence j(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return AbstractC3574i.t(elements);
    }
}
