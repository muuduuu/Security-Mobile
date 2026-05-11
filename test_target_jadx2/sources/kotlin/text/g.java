package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC3566a;
import kotlin.collections.AbstractC3568c;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
final class g implements MatchResult {

    /* renamed from: a, reason: collision with root package name */
    private final Matcher f36850a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f36851b;

    /* renamed from: c, reason: collision with root package name */
    private final f f36852c;

    /* renamed from: d, reason: collision with root package name */
    private List f36853d;

    public static final class a extends AbstractC3568c {
        a() {
        }

        @Override // kotlin.collections.AbstractC3566a
        public int c() {
            return g.this.f().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC3566a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return e((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean e(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.AbstractC3568c, java.util.List
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String group = g.this.f().group(i10);
            return group == null ? BuildConfig.FLAVOR : group;
        }

        @Override // kotlin.collections.AbstractC3568c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return j((String) obj);
            }
            return -1;
        }

        public /* bridge */ int j(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.AbstractC3568c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return m((String) obj);
            }
            return -1;
        }

        public /* bridge */ int m(String str) {
            return super.lastIndexOf(str);
        }
    }

    public static final class b extends AbstractC3566a implements f {

        static final class a extends xc.m implements Function1 {
            a() {
                super(1);
            }

            public final MatchGroup a(int i10) {
                return b.this.get(i10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        b() {
        }

        @Override // kotlin.collections.AbstractC3566a
        public int c() {
            return g.this.f().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC3566a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return e((MatchGroup) obj);
            }
            return false;
        }

        public /* bridge */ boolean e(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // kotlin.text.f
        public MatchGroup get(int i10) {
            IntRange h10;
            h10 = h.h(g.this.f(), i10);
            if (h10.t().intValue() < 0) {
                return null;
            }
            String group = g.this.f().group(i10);
            Intrinsics.checkNotNullExpressionValue(group, "group(...)");
            return new MatchGroup(group, h10);
        }

        @Override // kotlin.collections.AbstractC3566a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return kotlin.sequences.j.w(CollectionsKt.T(CollectionsKt.k(this)), new a()).iterator();
        }
    }

    public g(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f36850a = matcher;
        this.f36851b = input;
        this.f36852c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult f() {
        return this.f36850a;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult.b a() {
        return MatchResult.a.a(this);
    }

    @Override // kotlin.text.MatchResult
    public List b() {
        if (this.f36853d == null) {
            this.f36853d = new a();
        }
        List list = this.f36853d;
        Intrinsics.d(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public f c() {
        return this.f36852c;
    }

    @Override // kotlin.text.MatchResult
    public IntRange d() {
        IntRange g10;
        g10 = h.g(f());
        return g10;
    }
}
