package pb;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.jni.JavaCallback;
import expo.modules.kotlin.jni.PromiseImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class n {

    public static final class a implements Promise {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f38578a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f38579b;

        a(Function1 function1, m mVar) {
            this.f38578a = function1;
            this.f38579b = mVar;
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, String str) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f38579b.reject(code, str, null);
        }

        @Override // com.facebook.react.bridge.Promise
        public void resolve(Object obj) {
            this.f38578a.invoke(obj);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, Throwable th) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f38579b.reject(code, null, th);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, String str, Throwable th) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f38579b.reject(code, str, th);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f38579b.reject("UnknownCode", null, throwable);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(Throwable throwable, WritableMap userInfo) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            this.f38579b.reject("UnknownCode", null, throwable);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, WritableMap userInfo) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            this.f38579b.reject(code, null, null);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, Throwable th, WritableMap userInfo) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            this.f38579b.reject(code, null, th);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, String str, WritableMap userInfo) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            this.f38579b.reject(code, str, null);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String str, String str2, Throwable th, WritableMap writableMap) {
            m mVar = this.f38579b;
            if (str == null) {
                str = "UnknownCode";
            }
            mVar.reject(str, str2, th);
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f38579b.reject("UnknownCode", message, null);
        }
    }

    /* synthetic */ class b extends xc.j implements Function1 {
        b(Object obj) {
            super(1, obj, JavaCallback.class, "invoke", "invoke(Ljava/lang/Object;)V", 0);
        }

        public final void I(Object obj) {
            ((JavaCallback) this.f44980b).f(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            I(obj);
            return Unit.f36324a;
        }
    }

    /* synthetic */ class c extends xc.j implements Function1 {
        c(Object obj) {
            super(1, obj, m.class, "resolve", "resolve(Ljava/lang/Object;)V", 0);
        }

        public final void I(Object obj) {
            ((m) this.f44980b).resolve(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            I(obj);
            return Unit.f36324a;
        }
    }

    public static final Promise a(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new a(mVar instanceof PromiseImpl ? new b(((PromiseImpl) mVar).getCallback()) : new c(mVar), mVar);
    }
}
