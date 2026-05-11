package hd;

import gd.AbstractC3218a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public abstract class g implements fd.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f34072d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final String f34073e;

    /* renamed from: f, reason: collision with root package name */
    private static final List f34074f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f34075g;

    /* renamed from: a, reason: collision with root package name */
    private final String[] f34076a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f34077b;

    /* renamed from: c, reason: collision with root package name */
    private final List f34078c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34079a;

        static {
            int[] iArr = new int[AbstractC3218a.e.c.EnumC0497c.values().length];
            try {
                iArr[AbstractC3218a.e.c.EnumC0497c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC3218a.e.c.EnumC0497c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC3218a.e.c.EnumC0497c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34079a = iArr;
        }
    }

    static {
        String l02 = CollectionsKt.l0(CollectionsKt.m('k', 'o', 't', 'l', 'i', 'n'), BuildConfig.FLAVOR, null, null, 0, null, null, 62, null);
        f34073e = l02;
        List m10 = CollectionsKt.m(l02 + "/Any", l02 + "/Nothing", l02 + "/Unit", l02 + "/Throwable", l02 + "/Number", l02 + "/Byte", l02 + "/Double", l02 + "/Float", l02 + "/Int", l02 + "/Long", l02 + "/Short", l02 + "/Boolean", l02 + "/Char", l02 + "/CharSequence", l02 + "/String", l02 + "/Comparable", l02 + "/Enum", l02 + "/Array", l02 + "/ByteArray", l02 + "/DoubleArray", l02 + "/FloatArray", l02 + "/IntArray", l02 + "/LongArray", l02 + "/ShortArray", l02 + "/BooleanArray", l02 + "/CharArray", l02 + "/Cloneable", l02 + "/Annotation", l02 + "/collections/Iterable", l02 + "/collections/MutableIterable", l02 + "/collections/Collection", l02 + "/collections/MutableCollection", l02 + "/collections/List", l02 + "/collections/MutableList", l02 + "/collections/Set", l02 + "/collections/MutableSet", l02 + "/collections/Map", l02 + "/collections/MutableMap", l02 + "/collections/Map.Entry", l02 + "/collections/MutableMap.MutableEntry", l02 + "/collections/Iterator", l02 + "/collections/MutableIterator", l02 + "/collections/ListIterator", l02 + "/collections/MutableListIterator");
        f34074f = m10;
        Iterable<IndexedValue> U02 = CollectionsKt.U0(m10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(U02, 10)), 16));
        for (IndexedValue indexedValue : U02) {
            linkedHashMap.put((String) indexedValue.d(), Integer.valueOf(indexedValue.c()));
        }
        f34075g = linkedHashMap;
    }

    public g(String[] strings, Set localNameIndices, List records) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.f34076a = strings;
        this.f34077b = localNameIndices;
        this.f34078c = records;
    }

    @Override // fd.c
    public String a(int i10) {
        return getString(i10);
    }

    @Override // fd.c
    public boolean b(int i10) {
        return this.f34077b.contains(Integer.valueOf(i10));
    }

    @Override // fd.c
    public String getString(int i10) {
        String str;
        AbstractC3218a.e.c cVar = (AbstractC3218a.e.c) this.f34078c.get(i10);
        if (cVar.M()) {
            str = cVar.F();
        } else {
            if (cVar.K()) {
                List list = f34074f;
                int size = list.size();
                int B10 = cVar.B();
                if (B10 >= 0 && B10 < size) {
                    str = (String) list.get(cVar.B());
                }
            }
            str = this.f34076a[i10];
        }
        if (cVar.H() >= 2) {
            List I10 = cVar.I();
            Intrinsics.d(I10);
            Integer num = (Integer) I10.get(0);
            Integer num2 = (Integer) I10.get(1);
            Intrinsics.d(num);
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                Intrinsics.d(num2);
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    Intrinsics.d(str);
                    str = str.substring(num.intValue(), num2.intValue());
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                }
            }
        }
        String str2 = str;
        if (cVar.D() >= 2) {
            List E10 = cVar.E();
            Intrinsics.d(E10);
            Integer num3 = (Integer) E10.get(0);
            Integer num4 = (Integer) E10.get(1);
            Intrinsics.d(str2);
            str2 = StringsKt.y(str2, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        String str3 = str2;
        AbstractC3218a.e.c.EnumC0497c A10 = cVar.A();
        if (A10 == null) {
            A10 = AbstractC3218a.e.c.EnumC0497c.NONE;
        }
        int i11 = b.f34079a[A10.ordinal()];
        if (i11 == 2) {
            Intrinsics.d(str3);
            str3 = StringsKt.y(str3, '$', '.', false, 4, null);
        } else if (i11 == 3) {
            if (str3.length() >= 2) {
                Intrinsics.d(str3);
                str3 = str3.substring(1, str3.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str3, "substring(...)");
            }
            String str4 = str3;
            Intrinsics.d(str4);
            str3 = StringsKt.y(str4, '$', '.', false, 4, null);
        }
        Intrinsics.d(str3);
        return str3;
    }
}
