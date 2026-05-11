package Gd;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.O;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.AbstractC5149b;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public final class g extends AbstractSet {

    /* renamed from: c, reason: collision with root package name */
    public static final b f3017c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private Object f3018a;

    /* renamed from: b, reason: collision with root package name */
    private int f3019b;

    private static final class a implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f3020a;

        public a(Object[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f3020a = AbstractC5149b.a(array);
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3020a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f3020a.next();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return new g(null);
        }

        public final g b(Collection set) {
            Intrinsics.checkNotNullParameter(set, "set");
            g gVar = new g(null);
            gVar.addAll(set);
            return gVar;
        }

        private b() {
        }
    }

    private static final class c implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f3021a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f3022b = true;

        public c(Object obj) {
            this.f3021a = obj;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3022b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f3022b) {
                throw new NoSuchElementException();
            }
            this.f3022b = false;
            return this.f3021a;
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final g c() {
        return f3017c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object[] objArr;
        if (size() == 0) {
            this.f3018a = obj;
        } else if (size() == 1) {
            if (Intrinsics.b(this.f3018a, obj)) {
                return false;
            }
            this.f3018a = new Object[]{this.f3018a, obj};
        } else if (size() < 5) {
            Object obj2 = this.f3018a;
            Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj2;
            if (AbstractC3574i.v(objArr2, obj)) {
                return false;
            }
            if (size() == 4) {
                ?? e10 = O.e(Arrays.copyOf(objArr2, objArr2.length));
                e10.add(obj);
                objArr = e10;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                copyOf[copyOf.length - 1] = obj;
                objArr = copyOf;
            }
            this.f3018a = objArr;
        } else {
            Object obj3 = this.f3018a;
            Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!kotlin.jvm.internal.a.e(obj3).add(obj)) {
                return false;
            }
        }
        h(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f3018a = null;
        h(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.b(this.f3018a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f3018a;
            Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return AbstractC3574i.v((Object[]) obj2, obj);
        }
        Object obj3 = this.f3018a;
        Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public int e() {
        return this.f3019b;
    }

    public void h(int i10) {
        this.f3019b = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.f3018a);
        }
        if (size() < 5) {
            Object obj = this.f3018a;
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f3018a;
        Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return kotlin.jvm.internal.a.e(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }

    private g() {
    }
}
