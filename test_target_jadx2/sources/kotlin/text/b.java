package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
final class b implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f36810a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36811b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36812c;

    /* renamed from: d, reason: collision with root package name */
    private final Function2 f36813d;

    public static final class a implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private int f36814a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f36815b;

        /* renamed from: c, reason: collision with root package name */
        private int f36816c;

        /* renamed from: d, reason: collision with root package name */
        private IntRange f36817d;

        /* renamed from: e, reason: collision with root package name */
        private int f36818e;

        a() {
            int k10 = kotlin.ranges.d.k(b.this.f36811b, 0, b.this.f36810a.length());
            this.f36815b = k10;
            this.f36816c = k10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f36819f.f36812c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void a() {
            if (this.f36816c < 0) {
                this.f36814a = 0;
                this.f36817d = null;
                return;
            }
            if (b.this.f36812c > 0) {
                int i10 = this.f36818e + 1;
                this.f36818e = i10;
            }
            if (this.f36816c <= b.this.f36810a.length()) {
                Pair pair = (Pair) b.this.f36813d.invoke(b.this.f36810a, Integer.valueOf(this.f36816c));
                if (pair == null) {
                    this.f36817d = new IntRange(this.f36815b, StringsKt.R(b.this.f36810a));
                    this.f36816c = -1;
                } else {
                    int intValue = ((Number) pair.getFirst()).intValue();
                    int intValue2 = ((Number) pair.getSecond()).intValue();
                    this.f36817d = kotlin.ranges.d.p(this.f36815b, intValue);
                    int i11 = intValue + intValue2;
                    this.f36815b = i11;
                    this.f36816c = i11 + (intValue2 == 0 ? 1 : 0);
                }
                this.f36814a = 1;
            }
            this.f36817d = new IntRange(this.f36815b, StringsKt.R(b.this.f36810a));
            this.f36816c = -1;
            this.f36814a = 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.f36814a == -1) {
                a();
            }
            if (this.f36814a == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.f36817d;
            Intrinsics.e(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f36817d = null;
            this.f36814a = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36814a == -1) {
                a();
            }
            return this.f36814a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence input, int i10, int i11, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f36810a = input;
        this.f36811b = i10;
        this.f36812c = i11;
        this.f36813d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
