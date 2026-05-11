package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import xc.m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", BuildConfig.FLAVOR, "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", C4870a.f43493a, "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "K", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "l", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "t", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext;", "Element", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CoroutineContext {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", C4870a.f43493a, "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Element extends CoroutineContext {

        public static final class a {
            public static Object a(Element element, Object obj, Function2 operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(obj, element);
            }

            public static Element b(Element element, b key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.b(element.getKey(), key)) {
                    return null;
                }
                Intrinsics.e(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return element;
            }

            public static CoroutineContext c(Element element, b key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.b(element.getKey(), key) ? g.f36372a : element;
            }

            public static CoroutineContext d(Element element, CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return a.a(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        Element a(b key);

        b getKey();
    }

    public static final class a {

        /* renamed from: kotlin.coroutines.CoroutineContext$a$a, reason: collision with other inner class name */
        static final class C0527a extends m implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0527a f36363a = new C0527a();

            C0527a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CoroutineContext invoke(CoroutineContext acc, Element element) {
                c cVar;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                CoroutineContext t10 = acc.t(element.getKey());
                g gVar = g.f36372a;
                if (t10 == gVar) {
                    return element;
                }
                e.b bVar = e.f36370f0;
                e eVar = (e) t10.a(bVar);
                if (eVar == null) {
                    cVar = new c(t10, element);
                } else {
                    CoroutineContext t11 = t10.t(bVar);
                    if (t11 == gVar) {
                        return new c(element, eVar);
                    }
                    cVar = new c(new c(t11, element), eVar);
                }
                return cVar;
            }
        }

        public static CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == g.f36372a ? coroutineContext : (CoroutineContext) context.K(coroutineContext, C0527a.f36363a);
        }
    }

    public interface b {
    }

    Object K(Object initial, Function2 operation);

    Element a(b key);

    CoroutineContext l(CoroutineContext context);

    CoroutineContext t(b key);
}
