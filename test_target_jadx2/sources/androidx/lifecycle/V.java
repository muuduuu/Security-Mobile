package androidx.lifecycle;

import Z0.a;
import a1.C1339d;
import a1.C1342g;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vc.AbstractC5011a;

/* loaded from: classes.dex */
public class V {

    /* renamed from: b, reason: collision with root package name */
    public static final b f17099b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final a.b f17100c = C1342g.a.f12547a;

    /* renamed from: a, reason: collision with root package name */
    private final Z0.d f17101a;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final V a(W store, c factory, Z0.a extras) {
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new V(store, factory, extras);
        }

        private b() {
        }
    }

    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17106a = a.f17107a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f17107a = new a();

            private a() {
            }
        }

        default S a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return C1342g.f12546a.d();
        }

        default S b(kotlin.reflect.d modelClass, Z0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return c(AbstractC5011a.b(modelClass), extras);
        }

        default S c(Class modelClass, Z0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return a(modelClass);
        }
    }

    public static class d implements c {

        /* renamed from: c, reason: collision with root package name */
        private static d f17109c;

        /* renamed from: b, reason: collision with root package name */
        public static final a f17108b = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final a.b f17110d = C1342g.a.f12547a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.f17109c == null) {
                    d.f17109c = new d();
                }
                d dVar = d.f17109c;
                Intrinsics.d(dVar);
                return dVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.V.c
        public S a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return C1339d.f12541a.a(modelClass);
        }

        @Override // androidx.lifecycle.V.c
        public S b(kotlin.reflect.d modelClass, Z0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return c(AbstractC5011a.b(modelClass), extras);
        }

        @Override // androidx.lifecycle.V.c
        public S c(Class modelClass, Z0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return a(modelClass);
        }
    }

    public static class e {
        public abstract void d(S s10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V(W store, c factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public S a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return c(AbstractC5011a.e(modelClass));
    }

    public S b(String key, Class modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return this.f17101a.a(AbstractC5011a.e(modelClass), key);
    }

    public final S c(kotlin.reflect.d modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return Z0.d.b(this.f17101a, modelClass, null, 2, null);
    }

    public static class a extends d {

        /* renamed from: g, reason: collision with root package name */
        private static a f17103g;

        /* renamed from: e, reason: collision with root package name */
        private final Application f17105e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f17102f = new b(null);

        /* renamed from: h, reason: collision with root package name */
        public static final a.b f17104h = new C0290a();

        /* renamed from: androidx.lifecycle.V$a$a, reason: collision with other inner class name */
        public static final class C0290a implements a.b {
            C0290a() {
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f17103g == null) {
                    a.f17103g = new a(application);
                }
                a aVar = a.f17103g;
                Intrinsics.d(aVar);
                return aVar;
            }

            private b() {
            }
        }

        private a(Application application, int i10) {
            this.f17105e = application;
        }

        private final S h(Class cls, Application application) {
            if (!AbstractC1584a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                S s10 = (S) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(s10, "{\n                try {\n…          }\n            }");
                return s10;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.V.d, androidx.lifecycle.V.c
        public S a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f17105e;
            if (application != null) {
                return h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.V.d, androidx.lifecycle.V.c
        public S c(Class modelClass, Z0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f17105e != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(f17104h);
            if (application != null) {
                return h(modelClass, application);
            }
            if (AbstractC1584a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }
    }

    private V(Z0.d dVar) {
        this.f17101a = dVar;
    }

    public /* synthetic */ V(W w10, c cVar, Z0.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(w10, cVar, (i10 & 4) != 0 ? a.C0228a.f12277b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V(W store, c factory, Z0.a defaultCreationExtras) {
        this(new Z0.d(store, factory, defaultCreationExtras));
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V(X owner) {
        this(r0, r1.b(owner), r1.a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        W viewModelStore = owner.getViewModelStore();
        C1342g c1342g = C1342g.f12546a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V(X owner, c factory) {
        this(owner.getViewModelStore(), factory, C1342g.f12546a.a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
