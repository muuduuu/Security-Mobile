package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001f\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0013\u0010\u0007\u001a\u001d\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0014\u0010\n\u001a\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001f\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u001d\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0018\u0010\n\u001a\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\u0007\u001a\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001a\u0010\n\u001a+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030 H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a)\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b%\u0010&\u001a=\u0010*\u001a\u00028\u0000\"\u0010\b\u0000\u0010(*\n\u0012\u0006\b\u0000\u0012\u00028\u00010'\"\b\b\u0001\u0010\u0000*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+\u001a+\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/\u001a+\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b0\u0010\u001d\u001a+\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b1\u0010\u001f\u001a#\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b2\u0010&\u001a-\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000003*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b4\u0010&\u001a?\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00107\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000005j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`6¢\u0006\u0004\b8\u00109\u001a\u0017\u0010=\u001a\u00020<*\b\u0012\u0004\u0012\u00020;0:¢\u0006\u0004\b=\u0010>\u001a\u0017\u0010A\u001a\u00020@*\b\u0012\u0004\u0012\u00020?0:¢\u0006\u0004\bA\u0010B\u001a\u0017\u0010E\u001a\u00020D*\b\u0012\u0004\u0012\u00020C0:¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010H\u001a\u00020G*\b\u0012\u0004\u0012\u00020\r0:¢\u0006\u0004\bH\u0010I\u001a7\u0010J\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010(*\n\u0012\u0006\b\u0000\u0012\u00028\u00000'*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010)\u001a\u00028\u0001¢\u0006\u0004\bJ\u0010+\u001a-\u0010M\u001a\u0012\u0012\u0004\u0012\u00028\u00000Kj\b\u0012\u0004\u0012\u00028\u0000`L\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bM\u0010N\u001a#\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bO\u0010&\u001a#\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000P\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bQ\u0010&\u001a#\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000P\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000:¢\u0006\u0004\bR\u0010S\u001a#\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000T\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bU\u0010V\u001aC\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010W*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0086\bø\u0001\u0000¢\u0006\u0004\bY\u0010#\u001a)\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Z0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b[\u0010\\\u001a#\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b]\u0010&\u001a4\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000T\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\b_\u0010`\u001a#\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bb\u0010V\u001a4\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000T\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\bc\u0010`\u001a7\u0010d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030 H\u0086\bø\u0001\u0000¢\u0006\u0004\bd\u0010e\u001a\u0019\u0010f\u001a\u00020?*\b\u0012\u0004\u0012\u00020?0\u0001H\u0007¢\u0006\u0004\bf\u0010g\u001a+\u0010h\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000003*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bh\u0010i\u001a.\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bj\u0010k\u001a.\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bl\u0010k\u001a.\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000:2\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bm\u0010n\u001a4\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\bp\u0010q\u001a4\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\br\u0010s\u001aF\u0010u\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010t0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010W*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0004\bu\u0010q\u001a\u0080\u0001\u0010\u0080\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010x*\u00060vj\u0002`w*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010y\u001a\u00028\u00012\b\b\u0002\u0010{\u001a\u00020z2\b\b\u0002\u0010|\u001a\u00020z2\b\b\u0002\u0010}\u001a\u00020z2\b\b\u0002\u0010~\u001a\u00020\r2\b\b\u0002\u0010\u007f\u001a\u00020z2\u0016\b\u0002\u0010X\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020z\u0018\u00010 ¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001ak\u0010\u0083\u0001\u001a\u00030\u0082\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010{\u001a\u00020z2\b\b\u0002\u0010|\u001a\u00020z2\b\b\u0002\u0010}\u001a\u00020z2\b\b\u0002\u0010~\u001a\u00020\r2\b\b\u0002\u0010\u007f\u001a\u00020z2\u0016\b\u0002\u0010X\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020z\u0018\u00010 ¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a%\u0010\u0000\u001a\t\u0012\u0004\u0012\u00028\u00000\u0085\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0005\b\u0000\u0010\u0086\u0001\u001a\u001b\u0010\u0087\u0001\u001a\u00020?*\b\u0012\u0004\u0012\u00020C0\u0001H\u0007¢\u0006\u0005\b\u0087\u0001\u0010g\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0088\u0001"}, d2 = {"T", BuildConfig.FLAVOR, "element", BuildConfig.FLAVOR, "V", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "c0", "(Ljava/lang/Iterable;)Ljava/lang/Object;", BuildConfig.FLAVOR, "d0", "(Ljava/util/List;)Ljava/lang/Object;", "e0", "firstOrNull", BuildConfig.FLAVOR, "index", "f0", "(Ljava/util/List;I)Ljava/lang/Object;", "g0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "m0", "n0", "o0", "p0", "z0", "A0", "B0", "C0", "n", "X", "(Ljava/lang/Iterable;I)Ljava/util/List;", "Y", "(Ljava/util/List;I)Ljava/util/List;", "Lkotlin/Function1;", "predicate", "Z", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", BuildConfig.FLAVOR, "a0", "(Ljava/lang/Iterable;)Ljava/util/List;", BuildConfig.FLAVOR, "C", "destination", "b0", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/IntRange;", "indices", "D0", "(Ljava/util/List;Lkotlin/ranges/IntRange;)Ljava/util/List;", "G0", "H0", "y0", BuildConfig.FLAVOR, "E0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "F0", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "I0", "(Ljava/util/Collection;)[B", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "K0", "(Ljava/util/Collection;)[D", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "L0", "(Ljava/util/Collection;)[F", BuildConfig.FLAVOR, "N0", "(Ljava/util/Collection;)[I", "J0", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "M0", "(Ljava/lang/Iterable;)Ljava/util/HashSet;", "O0", BuildConfig.FLAVOR, "P0", "Q0", "(Ljava/util/Collection;)Ljava/util/List;", BuildConfig.FLAVOR, "S0", "(Ljava/lang/Iterable;)Ljava/util/Set;", "R", "transform", "q0", "Lkotlin/collections/IndexedValue;", "U0", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "W", "other", "h0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;", BuildConfig.FLAVOR, "R0", "T0", "S", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z", "s0", "(Ljava/lang/Iterable;)D", "r0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "t0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "v0", "x0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "elements", "u0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "w0", "(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;", "Lkotlin/Pair;", "V0", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", BuildConfig.FLAVOR, "separator", "prefix", "postfix", "limit", "truncated", "i0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", BuildConfig.FLAVOR, "k0", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Lkotlin/sequences/Sequence;", "(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;", "U", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes.dex */
public class CollectionsKt___CollectionsKt extends w {

    public static final class a implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f36329a;

        public a(Iterable iterable) {
            this.f36329a = iterable;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return this.f36329a.iterator();
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f36330a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Iterable iterable) {
            super(0);
            this.f36330a = iterable;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Object> invoke() {
            return this.f36330a.iterator();
        }
    }

    public static Object A0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object B0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object C0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List D0(List list, IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.j() : CollectionsKt.O0(list.subList(indices.t().intValue(), indices.r().intValue() + 1));
    }

    public static List E0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List P02 = P0(iterable);
            CollectionsKt.x(P02);
            return P02;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return CollectionsKt.O0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C3577l.q((Comparable[]) array);
        return AbstractC3574i.d(array);
    }

    public static List F0(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List P02 = P0(iterable);
            CollectionsKt.y(P02, comparator);
            return P02;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return CollectionsKt.O0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC3574i.r(array, comparator);
        return AbstractC3574i.d(array);
    }

    public static List G0(Iterable iterable, int i10) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.j();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return CollectionsKt.O0(iterable);
            }
            if (i10 == 1) {
                return CollectionsKt.e(CollectionsKt.c0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return C3581p.q(arrayList);
    }

    public static List H0(List list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.j();
        }
        int size = list.size();
        if (i10 >= size) {
            return CollectionsKt.O0(list);
        }
        if (i10 == 1) {
            return CollectionsKt.e(CollectionsKt.n0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] I0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final Collection J0(Iterable iterable, Collection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static double[] K0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = ((Number) it.next()).doubleValue();
            i10++;
        }
        return dArr;
    }

    public static float[] L0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static HashSet M0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (HashSet) J0(iterable, new HashSet(G.d(CollectionsKt.u(iterable, 12))));
    }

    public static int[] N0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List O0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C3581p.q(P0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return CollectionsKt.j();
        }
        if (size != 1) {
            return CollectionsKt.Q0(collection);
        }
        return CollectionsKt.e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final List P0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? CollectionsKt.Q0((Collection) iterable) : (List) J0(iterable, new ArrayList());
    }

    public static List Q0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set R0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) J0(iterable, new LinkedHashSet());
    }

    public static boolean S(Iterable iterable, Function1 predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static Set S0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return Q.g((Set) J0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return O.d();
        }
        if (size != 1) {
            return (Set) J0(iterable, new LinkedHashSet(G.d(collection.size())));
        }
        return O.c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static Sequence T(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new a(iterable);
    }

    public static Set T0(Iterable iterable, Iterable other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set R02 = CollectionsKt.R0(iterable);
        CollectionsKt.z(R02, other);
        return R02;
    }

    public static double U(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        double d10 = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            d10 += ((Number) it.next()).floatValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt.s();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / i10;
    }

    public static Iterable U0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new B(new b(iterable));
    }

    public static boolean V(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : g0(iterable, obj) >= 0;
    }

    public static List V0(Iterable iterable, Iterable other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.u(iterable, 10), CollectionsKt.u(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(lc.t.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static List W(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.O0(CollectionsKt.R0(iterable));
    }

    public static List X(Iterable iterable, int i10) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt.O0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i10;
            if (size <= 0) {
                return CollectionsKt.j();
            }
            if (size == 1) {
                return CollectionsKt.e(CollectionsKt.m0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i10 < size2) {
                        arrayList.add(((List) iterable).get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return C3581p.q(arrayList);
    }

    public static List Y(List list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i10 >= 0) {
            return CollectionsKt.G0(list, kotlin.ranges.d.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List Z(Iterable iterable, Function1 predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List a0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (List) CollectionsKt.b0(iterable, new ArrayList());
    }

    public static Collection b0(Iterable iterable, Collection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object c0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return CollectionsKt.d0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object d0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object e0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object f0(List list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static <T> T firstOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final int g0(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                CollectionsKt.t();
            }
            if (Intrinsics.b(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Set h0(Iterable iterable, Iterable other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set R02 = CollectionsKt.R0(iterable);
        u.I(R02, other);
        return R02;
    }

    public static final Appendable i0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            StringsKt.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ Appendable j0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        CharSequence charSequence5 = (i11 & 2) != 0 ? ", " : charSequence;
        int i12 = i11 & 4;
        CharSequence charSequence6 = BuildConfig.FLAVOR;
        CharSequence charSequence7 = i12 != 0 ? BuildConfig.FLAVOR : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        return i0(iterable, appendable, charSequence5, charSequence7, charSequence6, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : function1);
    }

    public static final String k0(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb2 = ((StringBuilder) i0(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String l0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = BuildConfig.FLAVOR;
        CharSequence charSequence6 = i12 != 0 ? BuildConfig.FLAVOR : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i13 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return k0(iterable, charSequence, charSequence6, charSequence5, i13, charSequence7, function1);
    }

    public static Object m0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return CollectionsKt.n0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object n0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(CollectionsKt.l(list));
    }

    public static Object o0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object p0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List q0(Iterable iterable, Function1 transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(CollectionsKt.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static Comparable r0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static double s0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) it.next()).doubleValue());
        }
        return doubleValue;
    }

    public static List t0(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.u(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && Intrinsics.b(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List u0(Iterable iterable, Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return CollectionsKt.w0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.z(arrayList, iterable);
        CollectionsKt.z(arrayList, elements);
        return arrayList;
    }

    public static List v0(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return CollectionsKt.x0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.z(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static List w0(Collection collection, Iterable elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            CollectionsKt.z(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List x0(Collection collection, Object obj) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List y0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return CollectionsKt.O0(iterable);
        }
        List P02 = P0(iterable);
        w.R(P02);
        return P02;
    }

    public static Object z0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return CollectionsKt.A0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }
}
