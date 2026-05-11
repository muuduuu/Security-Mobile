package Jd;

import Jd.AbstractC0896m0;
import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Jd.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0896m0 extends J implements Closeable, AutoCloseable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5049c = new a(null);

    /* renamed from: Jd.m0$a */
    public static final class a extends kotlin.coroutines.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC0896m0 d(CoroutineContext.Element element) {
            if (element instanceof AbstractC0896m0) {
                return (AbstractC0896m0) element;
            }
            return null;
        }

        private a() {
            super(J.f4999b, new Function1() { // from class: Jd.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AbstractC0896m0 d10;
                    d10 = AbstractC0896m0.a.d((CoroutineContext.Element) obj);
                    return d10;
                }
            });
        }
    }
}
