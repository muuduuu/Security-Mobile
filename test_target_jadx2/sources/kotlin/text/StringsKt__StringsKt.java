package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import lc.t;
import org.conscrypt.BuildConfig;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0019\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\n\u001a\u00020\t*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0015\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0016\u001a#\u0010\u001a\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0018\u001a#\u0010\u001b\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u0018\u001a#\u0010\u001c\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0016\u001a#\u0010\u001d\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u0018\u001a)\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010#\u001a\u00020\u0000¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010'\u001a\u00020\t*\u00020\t2\u0006\u0010&\u001a\u00020\u0000¢\u0006\u0004\b'\u0010%\u001a!\u0010(\u001a\u00020\t*\u00020\t2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010*\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b*\u0010%\u001a;\u0010/\u001a\u00020\f*\u00020\u00002\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\fH\u0000¢\u0006\u0004\b/\u00100\u001a#\u00102\u001a\u00020\f*\u00020\u00002\u0006\u00101\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\f¢\u0006\u0004\b2\u00103\u001a#\u00104\u001a\u00020\f*\u00020\u00002\u0006\u00101\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\f¢\u0006\u0004\b4\u00103\u001a#\u00105\u001a\u00020\f*\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\f¢\u0006\u0004\b5\u00106\u001a#\u00107\u001a\u00020\f*\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\f¢\u0006\u0004\b7\u00106\u001a-\u0010:\u001a\u00020\u0003*\u00020\u00002\u0006\u00109\u001a\u0002082\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\f¢\u0006\u0004\b:\u0010;\u001a-\u0010<\u001a\u00020\u0003*\u00020\u00002\u0006\u00109\u001a\u0002082\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\f¢\u0006\u0004\b<\u0010;\u001a=\u0010>\u001a\u00020\u0003*\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\f2\b\b\u0002\u0010=\u001a\u00020\fH\u0002¢\u0006\u0004\b>\u0010?\u001aG\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010B*\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0@2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\f2\u0006\u0010=\u001a\u00020\fH\u0002¢\u0006\u0004\bC\u0010D\u001a-\u0010E\u001a\u00020\u0003*\u00020\u00002\u0006\u00101\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\f¢\u0006\u0004\bE\u0010F\u001a-\u0010H\u001a\u00020\u0003*\u00020\u00002\u0006\u0010G\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\f¢\u0006\u0004\bH\u0010I\u001a-\u0010J\u001a\u00020\u0003*\u00020\u00002\u0006\u00101\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\f¢\u0006\u0004\bJ\u0010F\u001a-\u0010K\u001a\u00020\u0003*\u00020\u00002\u0006\u0010G\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\f¢\u0006\u0004\bK\u0010I\u001a&\u0010L\u001a\u00020\f*\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\bL\u00106\u001a&\u0010M\u001a\u00020\f*\u00020\u00002\u0006\u00101\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\bM\u00103\u001a?\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000f0P*\u00020\u00002\u0006\u0010N\u001a\u0002082\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\f2\b\b\u0002\u0010O\u001a\u00020\u0003H\u0002¢\u0006\u0004\bQ\u0010R\u001aG\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000f0P*\u00020\u00002\u000e\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0S2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\f2\b\b\u0002\u0010O\u001a\u00020\u0003H\u0002¢\u0006\u0004\bT\u0010U\u001a\u0017\u0010W\u001a\u00020V2\u0006\u0010O\u001a\u00020\u0003H\u0000¢\u0006\u0004\bW\u0010X\u001a?\u0010Y\u001a\b\u0012\u0004\u0012\u00020\t0P*\u00020\u00002\u0012\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0S\"\u00020\t2\b\b\u0002\u0010.\u001a\u00020\f2\b\b\u0002\u0010O\u001a\u00020\u0003¢\u0006\u0004\bY\u0010Z\u001a?\u0010\\\u001a\b\u0012\u0004\u0012\u00020\t0[*\u00020\u00002\u0012\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0S\"\u00020\t2\b\b\u0002\u0010.\u001a\u00020\f2\b\b\u0002\u0010O\u001a\u00020\u0003¢\u0006\u0004\b\\\u0010]\u001a7\u0010^\u001a\b\u0012\u0004\u0012\u00020\t0[*\u00020\u00002\n\u0010N\u001a\u000208\"\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\f2\b\b\u0002\u0010O\u001a\u00020\u0003¢\u0006\u0004\b^\u0010_\u001a1\u0010`\u001a\b\u0012\u0004\u0012\u00020\t0[*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010.\u001a\u00020\f2\u0006\u0010O\u001a\u00020\u0003H\u0002¢\u0006\u0004\b`\u0010a\u001a\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020\t0P*\u00020\u0000¢\u0006\u0004\bb\u0010c\u001a\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\t0[*\u00020\u0000¢\u0006\u0004\bd\u0010e\"\u0015\u0010h\u001a\u00020\u000f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bf\u0010g\"\u0015\u0010k\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006l"}, d2 = {BuildConfig.FLAVOR, "S0", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", BuildConfig.FLAVOR, "length", BuildConfig.FLAVOR, "padChar", "h0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", BuildConfig.FLAVOR, "i0", "(Ljava/lang/String;IC)Ljava/lang/String;", BuildConfig.FLAVOR, "Z", "(Ljava/lang/CharSequence;)Z", "Lkotlin/ranges/IntRange;", "range", "E0", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "N0", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "O0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "F0", "G0", "R0", "J0", "K0", "startIndex", "endIndex", "replacement", "s0", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "prefix", "o0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "p0", "r0", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "q0", "thisOffset", "other", "otherOffset", "ignoreCase", "n0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "A0", "(Ljava/lang/CharSequence;CZ)Z", "L", "B0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "M", BuildConfig.FLAVOR, "chars", "Y", "(Ljava/lang/CharSequence;[CIZ)I", "e0", "last", "U", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", BuildConfig.FLAVOR, "strings", "Lkotlin/Pair;", "P", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "S", "(Ljava/lang/CharSequence;CIZ)I", "string", "T", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "a0", "b0", "I", "H", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "j0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", BuildConfig.FLAVOR, "k0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", BuildConfig.FLAVOR, "t0", "(I)V", "y0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", BuildConfig.FLAVOR, "v0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "u0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "w0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "f0", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "g0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "Q", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "R", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__StringsKt extends q {

    static final class a extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ char[] f36805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f36806b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f36805a = cArr;
            this.f36806b = z10;
        }

        public final Pair<Integer, Integer> a(CharSequence $receiver, int i10) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            int Y10 = StringsKt__StringsKt.Y($receiver, this.f36805a, i10, this.f36806b);
            if (Y10 < 0) {
                return null;
            }
            return t.a(Integer.valueOf(Y10), 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f36807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f36808b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z10) {
            super(2);
            this.f36807a = list;
            this.f36808b = z10;
        }

        public final Pair<Integer, Integer> a(CharSequence $receiver, int i10) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Pair P10 = StringsKt__StringsKt.P($receiver, this.f36807a, i10, this.f36808b, false);
            if (P10 != null) {
                return t.a(P10.c(), Integer.valueOf(((String) P10.d()).length()));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f36809a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f36809a = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(IntRange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt__StringsKt.E0(this.f36809a, it);
        }
    }

    public static final boolean A0(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.a.c(charSequence.charAt(0), c10, z10);
    }

    public static final boolean B0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? StringsKt.F((String) charSequence, (String) prefix, false, 2, null) : n0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean C0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return A0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean D0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return B0(charSequence, charSequence2, z10);
    }

    public static final String E0(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.t().intValue(), range.r().intValue() + 1).toString();
    }

    public static final String F0(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int W10 = StringsKt.W(str, c10, 0, false, 6, null);
        if (W10 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(W10 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String G0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int X10 = StringsKt.X(str, delimiter, 0, false, 6, null);
        if (X10 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(X10 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final boolean H(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.W(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ String H0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return F0(str, c10, str2);
    }

    public static boolean I(CharSequence charSequence, CharSequence other, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (StringsKt.X(charSequence, (String) other, 0, z10, 2, null) < 0) {
                return false;
            }
        } else if (V(charSequence, other, 0, charSequence.length(), z10, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String I0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return StringsKt.G0(str, str2, str3);
    }

    public static /* synthetic */ boolean J(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return H(charSequence, c10, z10);
    }

    public static String J0(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int c02 = StringsKt.c0(str, c10, 0, false, 6, null);
        if (c02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(c02 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean K(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return StringsKt.I(charSequence, charSequence2, z10);
    }

    public static final String K0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int d02 = StringsKt.d0(str, delimiter, 0, false, 6, null);
        if (d02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(d02 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final boolean L(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.a.c(charSequence.charAt(StringsKt.R(charSequence)), c10, z10);
    }

    public static /* synthetic */ String L0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return StringsKt.J0(str, c10, str2);
    }

    public static final boolean M(CharSequence charSequence, CharSequence suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? StringsKt.q((String) charSequence, (String) suffix, false, 2, null) : n0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static /* synthetic */ String M0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return K0(str, str2, str3);
    }

    public static /* synthetic */ boolean N(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return L(charSequence, c10, z10);
    }

    public static final String N0(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int W10 = StringsKt.W(str, c10, 0, false, 6, null);
        if (W10 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, W10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return M(charSequence, charSequence2, z10);
    }

    public static final String O0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int X10 = StringsKt.X(str, delimiter, 0, false, 6, null);
        if (X10 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, X10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair P(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        Object obj;
        Object obj2;
        if (!z10 && collection.size() == 1) {
            String str = (String) CollectionsKt.z0(collection);
            int X10 = !z11 ? StringsKt.X(charSequence, str, i10, false, 4, null) : StringsKt.d0(charSequence, str, i10, false, 4, null);
            if (X10 < 0) {
                return null;
            }
            return t.a(Integer.valueOf(X10), str);
        }
        kotlin.ranges.a intRange = !z11 ? new IntRange(kotlin.ranges.d.d(i10, 0), charSequence.length()) : kotlin.ranges.d.m(kotlin.ranges.d.h(i10, StringsKt.R(charSequence)), 0);
        if (charSequence instanceof String) {
            int c10 = intRange.c();
            int e10 = intRange.e();
            int h10 = intRange.h();
            if ((h10 > 0 && c10 <= e10) || (h10 < 0 && e10 <= c10)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (StringsKt.t(str2, 0, (String) charSequence, c10, str2.length(), z10)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (c10 == e10) {
                            break;
                        }
                        c10 += h10;
                    } else {
                        return t.a(Integer.valueOf(c10), str3);
                    }
                }
            }
        } else {
            int c11 = intRange.c();
            int e11 = intRange.e();
            int h11 = intRange.h();
            if ((h11 > 0 && c11 <= e11) || (h11 < 0 && e11 <= c11)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (n0(str4, 0, charSequence, c11, str4.length(), z10)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (c11 == e11) {
                            break;
                        }
                        c11 += h11;
                    } else {
                        return t.a(Integer.valueOf(c11), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String P0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return N0(str, c10, str2);
    }

    public static IntRange Q(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String Q0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return O0(str, str2, str3);
    }

    public static int R(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String R0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int d02 = StringsKt.d0(str, delimiter, 0, false, 6, null);
        if (d02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, d02);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final int S(CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? Y(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static CharSequence S0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean b10 = CharsKt.b(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!b10) {
                    break;
                }
                length--;
            } else if (b10) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static int T(CharSequence charSequence, String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? V(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    private static final int U(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        kotlin.ranges.a intRange = !z11 ? new IntRange(kotlin.ranges.d.d(i10, 0), kotlin.ranges.d.h(i11, charSequence.length())) : kotlin.ranges.d.m(kotlin.ranges.d.h(i10, StringsKt.R(charSequence)), kotlin.ranges.d.d(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int c10 = intRange.c();
            int e10 = intRange.e();
            int h10 = intRange.h();
            if ((h10 <= 0 || c10 > e10) && (h10 >= 0 || e10 > c10)) {
                return -1;
            }
            while (!StringsKt.t((String) charSequence2, 0, (String) charSequence, c10, charSequence2.length(), z10)) {
                if (c10 == e10) {
                    return -1;
                }
                c10 += h10;
            }
            return c10;
        }
        int c11 = intRange.c();
        int e11 = intRange.e();
        int h11 = intRange.h();
        if ((h11 <= 0 || c11 > e11) && (h11 >= 0 || e11 > c11)) {
            return -1;
        }
        while (!n0(charSequence2, 0, charSequence, c11, charSequence2.length(), z10)) {
            if (c11 == e11) {
                return -1;
            }
            c11 += h11;
        }
        return c11;
    }

    static /* synthetic */ int V(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return U(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int W(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return S(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int X(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return StringsKt.T(charSequence, str, i10, z10);
    }

    public static final int Y(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC3574i.Y(chars), i10);
        }
        int d10 = kotlin.ranges.d.d(i10, 0);
        int R10 = StringsKt.R(charSequence);
        if (d10 > R10) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(d10);
            for (char c10 : chars) {
                if (kotlin.text.a.c(c10, charAt, z10)) {
                    return d10;
                }
            }
            if (d10 == R10) {
                return -1;
            }
            d10++;
        }
    }

    public static boolean Z(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!CharsKt.b(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int a0(CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? e0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int b0(CharSequence charSequence, String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? U(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int c0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = StringsKt.R(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return a0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int d0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = StringsKt.R(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return b0(charSequence, str, i10, z10);
    }

    public static final int e0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC3574i.Y(chars), i10);
        }
        for (int h10 = kotlin.ranges.d.h(i10, StringsKt.R(charSequence)); -1 < h10; h10--) {
            char charAt = charSequence.charAt(h10);
            for (char c10 : chars) {
                if (kotlin.text.a.c(c10, charAt, z10)) {
                    return h10;
                }
            }
        }
        return -1;
    }

    public static final Sequence f0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return z0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static List g0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return kotlin.sequences.j.C(f0(charSequence));
    }

    public static final CharSequence h0(CharSequence charSequence, int i10, char c10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String i0(String str, int i10, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return h0(str, i10, c10).toString();
    }

    private static final Sequence j0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        t0(i11);
        return new kotlin.text.b(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final Sequence k0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        t0(i11);
        return new kotlin.text.b(charSequence, i10, i11, new b(AbstractC3574i.d(strArr), z10));
    }

    static /* synthetic */ Sequence l0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return j0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ Sequence m0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return k0(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean n0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!kotlin.text.a.c(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String o0(String str, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!D0(str, prefix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String p0(String str, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!O(str, suffix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String q0(String str, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return r0(str, delimiter, delimiter);
    }

    public static final String r0(String str, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !D0(str, prefix, false, 2, null) || !O(str, suffix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final CharSequence s0(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i11, charSequence.length());
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return v0(charSequence, strArr, z10, i10);
    }

    public static final void t0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List u0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return w0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable k10 = kotlin.sequences.j.k(l0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.u(k10, 10));
        Iterator it = k10.iterator();
        while (it.hasNext()) {
            arrayList.add(E0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final List v0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return w0(charSequence, str, z10, i10);
            }
        }
        Iterable k10 = kotlin.sequences.j.k(m0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.u(k10, 10));
        Iterator it = k10.iterator();
        while (it.hasNext()) {
            arrayList.add(E0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    private static final List w0(CharSequence charSequence, String str, boolean z10, int i10) {
        t0(i10);
        int i11 = 0;
        int T10 = StringsKt.T(charSequence, str, 0, z10);
        if (T10 == -1 || i10 == 1) {
            return CollectionsKt.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? kotlin.ranges.d.h(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i11, T10).toString());
            i11 = str.length() + T10;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            T10 = StringsKt.T(charSequence, str, i11, z10);
        } while (T10 != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List x0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return u0(charSequence, cArr, z10, i10);
    }

    public static final Sequence y0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return kotlin.sequences.j.w(m0(charSequence, delimiters, 0, z10, i10, 2, null), new c(charSequence));
    }

    public static /* synthetic */ Sequence z0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return y0(charSequence, strArr, z10, i10);
    }
}
