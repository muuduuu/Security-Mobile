package Dd;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractC3567b;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1497c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Object[] f1498a;

    /* renamed from: b, reason: collision with root package name */
    private int f1499b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC3567b {

        /* renamed from: c, reason: collision with root package name */
        private int f1500c = -1;

        b() {
        }

        @Override // kotlin.collections.AbstractC3567b
        protected void a() {
            do {
                int i10 = this.f1500c + 1;
                this.f1500c = i10;
                if (i10 >= d.this.f1498a.length) {
                    break;
                }
            } while (d.this.f1498a[this.f1500c] == null);
            if (this.f1500c >= d.this.f1498a.length) {
                b();
                return;
            }
            Object obj = d.this.f1498a[this.f1500c];
            Intrinsics.e(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            c(obj);
        }
    }

    private d(Object[] objArr, int i10) {
        super(null);
        this.f1498a = objArr;
        this.f1499b = i10;
    }

    private final void j(int i10) {
        Object[] objArr = this.f1498a;
        if (objArr.length > i10) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i10);
        Object[] copyOf = Arrays.copyOf(this.f1498a, length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.f1498a = copyOf;
    }

    @Override // Dd.c
    public int c() {
        return this.f1499b;
    }

    @Override // Dd.c
    public void e(int i10, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        j(i10);
        if (this.f1498a[i10] == null) {
            this.f1499b = c() + 1;
        }
        this.f1498a[i10] = value;
    }

    @Override // Dd.c
    public Object get(int i10) {
        return AbstractC3574i.G(this.f1498a, i10);
    }

    @Override // Dd.c, java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }

    public d() {
        this(new Object[20], 0);
    }
}
