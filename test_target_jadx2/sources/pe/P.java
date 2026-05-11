package pe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractC3568c;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class P extends AbstractC3568c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final a f38606d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final C3880h[] f38607b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f38608c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, C3877e c3877e, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            C3877e c3877e2;
            int i17 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i18 = i11; i18 < i12; i18++) {
                if (((C3880h) list.get(i18)).L() < i17) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C3880h c3880h = (C3880h) list.get(i11);
            C3880h c3880h2 = (C3880h) list.get(i12 - 1);
            int i19 = -1;
            if (i17 == c3880h.L()) {
                int intValue = ((Number) list2.get(i11)).intValue();
                int i20 = i11 + 1;
                C3880h c3880h3 = (C3880h) list.get(i20);
                i13 = i20;
                i14 = intValue;
                c3880h = c3880h3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (c3880h.p(i17) == c3880h2.p(i17)) {
                int min = Math.min(c3880h.L(), c3880h2.L());
                int i21 = 0;
                for (int i22 = i17; i22 < min && c3880h.p(i22) == c3880h2.p(i22); i22++) {
                    i21++;
                }
                long c10 = j10 + c(c3877e) + 2 + i21 + 1;
                c3877e.l0(-i21);
                c3877e.l0(i14);
                int i23 = i21 + i17;
                while (i17 < i23) {
                    c3877e.l0(c3880h.p(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (i23 != ((C3880h) list.get(i13)).L()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c3877e.l0(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    C3877e c3877e3 = new C3877e();
                    c3877e.l0(((int) (c(c3877e3) + c10)) * (-1));
                    a(c10, c3877e3, i23, list, i13, i12, list2);
                    c3877e.s0(c3877e3);
                    return;
                }
            }
            int i24 = 1;
            for (int i25 = i13 + 1; i25 < i12; i25++) {
                if (((C3880h) list.get(i25 - 1)).p(i17) != ((C3880h) list.get(i25)).p(i17)) {
                    i24++;
                }
            }
            long c11 = j10 + c(c3877e) + 2 + (i24 * 2);
            c3877e.l0(i24);
            c3877e.l0(i14);
            for (int i26 = i13; i26 < i12; i26++) {
                byte p10 = ((C3880h) list.get(i26)).p(i17);
                if (i26 == i13 || p10 != ((C3880h) list.get(i26 - 1)).p(i17)) {
                    c3877e.l0(p10 & 255);
                }
            }
            C3877e c3877e4 = new C3877e();
            while (i13 < i12) {
                byte p11 = ((C3880h) list.get(i13)).p(i17);
                int i27 = i13 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (p11 != ((C3880h) list.get(i28)).p(i17)) {
                            i15 = i28;
                            break;
                        }
                        i28++;
                    }
                }
                if (i27 == i15 && i17 + 1 == ((C3880h) list.get(i13)).L()) {
                    c3877e.l0(((Number) list2.get(i13)).intValue());
                    i16 = i15;
                    c3877e2 = c3877e4;
                } else {
                    c3877e.l0(((int) (c11 + c(c3877e4))) * i19);
                    i16 = i15;
                    c3877e2 = c3877e4;
                    a(c11, c3877e4, i17 + 1, list, i13, i15, list2);
                }
                c3877e4 = c3877e2;
                i13 = i16;
                i19 = -1;
            }
            c3877e.s0(c3877e4);
        }

        static /* synthetic */ void b(a aVar, long j10, C3877e c3877e, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.a((i13 & 1) != 0 ? 0L : j10, c3877e, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(C3877e c3877e) {
            return c3877e.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final P d(C3880h... byteStrings) {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new P(new C3880h[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List v02 = AbstractC3574i.v0(byteStrings);
            CollectionsKt.x(v02);
            int size = v02.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(CollectionsKt.i(v02, byteStrings[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((C3880h) v02.get(0)).L() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < v02.size()) {
                C3880h c3880h = (C3880h) v02.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < v02.size()) {
                    C3880h c3880h2 = (C3880h) v02.get(i15);
                    if (c3880h2.M(c3880h)) {
                        if (c3880h2.L() == c3880h.L()) {
                            throw new IllegalArgumentException(("duplicate option: " + c3880h2).toString());
                        }
                        if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                            v02.remove(i15);
                            arrayList.remove(i15);
                        } else {
                            i15++;
                        }
                    }
                }
                i13 = i14;
            }
            C3877e c3877e = new C3877e();
            b(this, 0L, c3877e, 0, v02, 0, 0, arrayList, 53, null);
            int c10 = (int) c(c3877e);
            int[] iArr = new int[c10];
            for (int i16 = 0; i16 < c10; i16++) {
                iArr[i16] = c3877e.readInt();
            }
            Object[] copyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            return new P((C3880h[]) copyOf, iArr, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ P(C3880h[] c3880hArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3880hArr, iArr);
    }

    public static final P u(C3880h... c3880hArr) {
        return f38606d.d(c3880hArr);
    }

    @Override // kotlin.collections.AbstractC3566a
    public int c() {
        return this.f38607b.length;
    }

    @Override // kotlin.collections.AbstractC3566a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C3880h) {
            return e((C3880h) obj);
        }
        return false;
    }

    public /* bridge */ boolean e(C3880h c3880h) {
        return super.contains(c3880h);
    }

    @Override // kotlin.collections.AbstractC3568c, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C3880h get(int i10) {
        return this.f38607b[i10];
    }

    @Override // kotlin.collections.AbstractC3568c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C3880h) {
            return r((C3880h) obj);
        }
        return -1;
    }

    public final C3880h[] j() {
        return this.f38607b;
    }

    @Override // kotlin.collections.AbstractC3568c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C3880h) {
            return t((C3880h) obj);
        }
        return -1;
    }

    public final int[] m() {
        return this.f38608c;
    }

    public /* bridge */ int r(C3880h c3880h) {
        return super.indexOf(c3880h);
    }

    public /* bridge */ int t(C3880h c3880h) {
        return super.lastIndexOf(c3880h);
    }

    private P(C3880h[] c3880hArr, int[] iArr) {
        this.f38607b = c3880hArr;
        this.f38608c = iArr;
    }
}
