package Mc;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.InterfaceC0952y;
import Kc.X;
import Kc.a0;
import Kc.f0;
import Kc.j0;
import Mc.L;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd.AbstractC3565e;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import sd.C4516d;
import sd.InterfaceC4518f;
import yd.AbstractC5197E;
import yd.AbstractC5216s;
import yd.l0;
import yd.n0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class p extends AbstractC0985k implements InterfaceC0952y {

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC0952y f6281A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC0930b.a f6282B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC0952y f6283C;

    /* renamed from: D, reason: collision with root package name */
    protected Map f6284D;

    /* renamed from: e, reason: collision with root package name */
    private List f6285e;

    /* renamed from: f, reason: collision with root package name */
    private List f6286f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC5197E f6287g;

    /* renamed from: h, reason: collision with root package name */
    private List f6288h;

    /* renamed from: i, reason: collision with root package name */
    private X f6289i;

    /* renamed from: j, reason: collision with root package name */
    private X f6290j;

    /* renamed from: k, reason: collision with root package name */
    private Kc.D f6291k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC0948u f6292l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6293m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6294n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6295o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6296p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6297q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6298r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6299s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6300t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6301u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6302v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6303w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6304x;

    /* renamed from: y, reason: collision with root package name */
    private Collection f6305y;

    /* renamed from: z, reason: collision with root package name */
    private volatile Function0 f6306z;

    class a implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f6307a;

        a(n0 n0Var) {
            this.f6307a = n0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            Gd.f fVar = new Gd.f();
            Iterator it = p.this.f().iterator();
            while (it.hasNext()) {
                fVar.add(((InterfaceC0952y) it.next()).c(this.f6307a));
            }
            return fVar;
        }
    }

    static class b implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6309a;

        b(List list) {
            this.f6309a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List invoke() {
            return this.f6309a;
        }
    }

    public class c implements InterfaceC0952y.a {

        /* renamed from: a, reason: collision with root package name */
        protected l0 f6310a;

        /* renamed from: b, reason: collision with root package name */
        protected InterfaceC0941m f6311b;

        /* renamed from: c, reason: collision with root package name */
        protected Kc.D f6312c;

        /* renamed from: d, reason: collision with root package name */
        protected AbstractC0948u f6313d;

        /* renamed from: e, reason: collision with root package name */
        protected InterfaceC0952y f6314e;

        /* renamed from: f, reason: collision with root package name */
        protected InterfaceC0930b.a f6315f;

        /* renamed from: g, reason: collision with root package name */
        protected List f6316g;

        /* renamed from: h, reason: collision with root package name */
        protected List f6317h;

        /* renamed from: i, reason: collision with root package name */
        protected X f6318i;

        /* renamed from: j, reason: collision with root package name */
        protected X f6319j;

        /* renamed from: k, reason: collision with root package name */
        protected AbstractC5197E f6320k;

        /* renamed from: l, reason: collision with root package name */
        protected id.f f6321l;

        /* renamed from: m, reason: collision with root package name */
        protected boolean f6322m;

        /* renamed from: n, reason: collision with root package name */
        protected boolean f6323n;

        /* renamed from: o, reason: collision with root package name */
        protected boolean f6324o;

        /* renamed from: p, reason: collision with root package name */
        protected boolean f6325p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f6326q;

        /* renamed from: r, reason: collision with root package name */
        private List f6327r;

        /* renamed from: s, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f6328s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f6329t;

        /* renamed from: u, reason: collision with root package name */
        private Map f6330u;

        /* renamed from: v, reason: collision with root package name */
        private Boolean f6331v;

        /* renamed from: w, reason: collision with root package name */
        protected boolean f6332w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ p f6333x;

        public c(p pVar, l0 l0Var, InterfaceC0941m interfaceC0941m, Kc.D d10, AbstractC0948u abstractC0948u, InterfaceC0930b.a aVar, List list, List list2, X x10, AbstractC5197E abstractC5197E, id.f fVar) {
            if (l0Var == null) {
                a(0);
            }
            if (interfaceC0941m == null) {
                a(1);
            }
            if (d10 == null) {
                a(2);
            }
            if (abstractC0948u == null) {
                a(3);
            }
            if (aVar == null) {
                a(4);
            }
            if (list == null) {
                a(5);
            }
            if (list2 == null) {
                a(6);
            }
            if (abstractC5197E == null) {
                a(7);
            }
            this.f6333x = pVar;
            this.f6314e = null;
            this.f6319j = pVar.f6290j;
            this.f6322m = true;
            this.f6323n = false;
            this.f6324o = false;
            this.f6325p = false;
            this.f6326q = pVar.D0();
            this.f6327r = null;
            this.f6328s = null;
            this.f6329t = pVar.K0();
            this.f6330u = new LinkedHashMap();
            this.f6331v = null;
            this.f6332w = false;
            this.f6310a = l0Var;
            this.f6311b = interfaceC0941m;
            this.f6312c = d10;
            this.f6313d = abstractC0948u;
            this.f6315f = aVar;
            this.f6316g = list;
            this.f6317h = list2;
            this.f6318i = x10;
            this.f6320k = abstractC5197E;
            this.f6321l = fVar;
        }

        private static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case 18:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case 34:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case 38:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case HVError.CONSENT_DENIED /* 42 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 12:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                case 19:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                case HVError.INVALID_FILE_ERROR /* 37 */:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case 18:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case 34:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case 38:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case HVError.CONSENT_DENIED /* 42 */:
                    i11 = 2;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 12:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                case 19:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                case HVError.INVALID_FILE_ERROR /* 37 */:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case 18:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case 34:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case 38:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case HVError.CONSENT_DENIED /* 42 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    objArr[0] = "name";
                    break;
                case 19:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    objArr[0] = "parameters";
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    objArr[0] = "type";
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    objArr[0] = "additionalAnnotations";
                    break;
                case HVError.INVALID_FILE_ERROR /* 37 */:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 12:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                case 19:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                case HVError.INVALID_FILE_ERROR /* 37 */:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    objArr[1] = "setKind";
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    objArr[1] = "setValueParameters";
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    objArr[1] = "setTypeParameters";
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    objArr[1] = "putUserData";
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    objArr[1] = "getSubstitution";
                    break;
                case HVError.CONSENT_DENIED /* 42 */:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case 18:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case 34:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case 38:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case HVError.CONSENT_DENIED /* 42 */:
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    objArr[2] = "setKind";
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    objArr[2] = "setTypeParameters";
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    objArr[2] = "setReturnType";
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case 18:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case 34:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case 38:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case HVError.CONSENT_DENIED /* 42 */:
                    throw new IllegalStateException(format);
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 12:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                case 19:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                case HVError.INVALID_FILE_ERROR /* 37 */:
                case 39:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public c r(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            if (gVar == null) {
                a(35);
            }
            this.f6328s = gVar;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public c m(boolean z10) {
            this.f6322m = z10;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public c n(X x10) {
            this.f6319j = x10;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public c d() {
            this.f6325p = true;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public c s(X x10) {
            this.f6318i = x10;
            return this;
        }

        public c H(boolean z10) {
            this.f6331v = Boolean.valueOf(z10);
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public c l() {
            this.f6329t = true;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public c q() {
            this.f6326q = true;
            return this;
        }

        public c K(boolean z10) {
            this.f6332w = z10;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public c p(InterfaceC0930b.a aVar) {
            if (aVar == null) {
                a(14);
            }
            this.f6315f = aVar;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public c k(Kc.D d10) {
            if (d10 == null) {
                a(10);
            }
            this.f6312c = d10;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public c j(id.f fVar) {
            if (fVar == null) {
                a(17);
            }
            this.f6321l = fVar;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public c g(InterfaceC0930b interfaceC0930b) {
            this.f6314e = (InterfaceC0952y) interfaceC0930b;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public c f(InterfaceC0941m interfaceC0941m) {
            if (interfaceC0941m == null) {
                a(8);
            }
            this.f6311b = interfaceC0941m;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c h() {
            this.f6324o = true;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public c v(AbstractC5197E abstractC5197E) {
            if (abstractC5197E == null) {
                a(23);
            }
            this.f6320k = abstractC5197E;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public c w() {
            this.f6323n = true;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public c u(l0 l0Var) {
            if (l0Var == null) {
                a(37);
            }
            this.f6310a = l0Var;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public c o(List list) {
            if (list == null) {
                a(21);
            }
            this.f6327r = list;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public c e(List list) {
            if (list == null) {
                a(19);
            }
            this.f6316g = list;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public c i(AbstractC0948u abstractC0948u) {
            if (abstractC0948u == null) {
                a(12);
            }
            this.f6313d = abstractC0948u;
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y c() {
            return this.f6333x.V0(this);
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a t(InterfaceC0929a.InterfaceC0107a interfaceC0107a, Object obj) {
            if (interfaceC0107a == null) {
                a(39);
            }
            this.f6330u.put(interfaceC0107a, obj);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected p(InterfaceC0941m interfaceC0941m, InterfaceC0952y interfaceC0952y, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, InterfaceC0930b.a aVar, a0 a0Var) {
        super(interfaceC0941m, gVar, fVar, a0Var);
        if (interfaceC0941m == null) {
            D(0);
        }
        if (gVar == null) {
            D(1);
        }
        if (fVar == null) {
            D(2);
        }
        if (aVar == null) {
            D(3);
        }
        if (a0Var == null) {
            D(4);
        }
        this.f6292l = AbstractC0947t.f5593i;
        this.f6293m = false;
        this.f6294n = false;
        this.f6295o = false;
        this.f6296p = false;
        this.f6297q = false;
        this.f6298r = false;
        this.f6299s = false;
        this.f6300t = false;
        this.f6301u = false;
        this.f6302v = false;
        this.f6303w = true;
        this.f6304x = false;
        this.f6305y = null;
        this.f6306z = null;
        this.f6283C = null;
        this.f6284D = null;
        this.f6281A = interfaceC0952y == null ? this : interfaceC0952y;
        this.f6282B = aVar;
    }

    private static /* synthetic */ void D(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case 26:
            case 27:
                i11 = 2;
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[0] = "overriddenDescriptors";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[0] = "originalSubstitutor";
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case 29:
            case HVError.INSTRUCTION_ERROR /* 31 */:
                objArr[0] = "substitutor";
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[1] = "getModality";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[1] = "getOriginal";
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[1] = "getKind";
                break;
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case 26:
            case 27:
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[2] = "substitute";
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                objArr[2] = "newCopyBuilder";
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case HVError.INSTRUCTION_ERROR /* 31 */:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    private a0 W0(boolean z10, InterfaceC0952y interfaceC0952y) {
        a0 a0Var;
        if (z10) {
            if (interfaceC0952y == null) {
                interfaceC0952y = a();
            }
            a0Var = interfaceC0952y.j();
        } else {
            a0Var = a0.f5560a;
        }
        if (a0Var == null) {
            D(27);
        }
        return a0Var;
    }

    public static List X0(InterfaceC0952y interfaceC0952y, List list, n0 n0Var) {
        if (list == null) {
            D(28);
        }
        if (n0Var == null) {
            D(29);
        }
        return Y0(interfaceC0952y, list, n0Var, false, false, null);
    }

    public static List Y0(InterfaceC0952y interfaceC0952y, List list, n0 n0Var, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            D(30);
        }
        if (n0Var == null) {
            D(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            AbstractC5197E type = j0Var.getType();
            u0 u0Var = u0.IN_VARIANCE;
            AbstractC5197E p10 = n0Var.p(type, u0Var);
            AbstractC5197E r02 = j0Var.r0();
            AbstractC5197E p11 = r02 == null ? null : n0Var.p(r02, u0Var);
            if (p10 == null) {
                return null;
            }
            if ((p10 != j0Var.getType() || r02 != p11) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(L.T0(interfaceC0952y, z10 ? null : j0Var, j0Var.getIndex(), j0Var.i(), j0Var.getName(), p10, j0Var.B0(), j0Var.h0(), j0Var.d0(), p11, z11 ? j0Var.j() : a0.f5560a, j0Var instanceof L.b ? new b(((L.b) j0Var).W0()) : null));
        }
        return arrayList;
    }

    private void c1() {
        Function0 function0 = this.f6306z;
        if (function0 != null) {
            this.f6305y = (Collection) function0.invoke();
            this.f6306z = null;
        }
    }

    private void j1(boolean z10) {
        this.f6301u = z10;
    }

    private void k1(boolean z10) {
        this.f6300t = z10;
    }

    private void m1(InterfaceC0952y interfaceC0952y) {
        this.f6283C = interfaceC0952y;
    }

    public InterfaceC0952y.a A() {
        c b12 = b1(n0.f45552b);
        if (b12 == null) {
            D(23);
        }
        return b12;
    }

    @Override // Kc.InterfaceC0929a
    public Object A0(InterfaceC0929a.InterfaceC0107a interfaceC0107a) {
        Map map = this.f6284D;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC0107a);
    }

    @Override // Kc.InterfaceC0952y
    public boolean D0() {
        return this.f6300t;
    }

    public void F0(Collection collection) {
        if (collection == null) {
            D(17);
        }
        this.f6305y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0952y) it.next()).K0()) {
                this.f6301u = true;
                return;
            }
        }
    }

    @Override // Kc.InterfaceC0952y
    public boolean K0() {
        return this.f6301u;
    }

    @Override // Kc.InterfaceC0929a
    public boolean M() {
        return this.f6304x;
    }

    @Override // Kc.C
    public boolean M0() {
        return this.f6299s;
    }

    @Override // Kc.InterfaceC0952y
    public boolean Q0() {
        if (this.f6294n) {
            return true;
        }
        Iterator it = a().f().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0952y) it.next()).Q0()) {
                return true;
            }
        }
        return false;
    }

    @Override // Kc.C
    public boolean R() {
        return this.f6298r;
    }

    public InterfaceC0952y T0(InterfaceC0941m interfaceC0941m, Kc.D d10, AbstractC0948u abstractC0948u, InterfaceC0930b.a aVar, boolean z10) {
        InterfaceC0952y c10 = A().f(interfaceC0941m).k(d10).i(abstractC0948u).p(aVar).m(z10).c();
        if (c10 == null) {
            D(26);
        }
        return c10;
    }

    public boolean U() {
        return this.f6297q;
    }

    protected abstract p U0(InterfaceC0941m interfaceC0941m, InterfaceC0952y interfaceC0952y, InterfaceC0930b.a aVar, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, a0 a0Var);

    @Override // Kc.InterfaceC0952y
    public boolean V() {
        if (this.f6293m) {
            return true;
        }
        Iterator it = a().f().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0952y) it.next()).V()) {
                return true;
            }
        }
        return false;
    }

    protected InterfaceC0952y V0(c cVar) {
        F f10;
        X x10;
        AbstractC5197E p10;
        if (cVar == null) {
            D(25);
        }
        boolean[] zArr = new boolean[1];
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a10 = cVar.f6328s != null ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(i(), cVar.f6328s) : i();
        InterfaceC0941m interfaceC0941m = cVar.f6311b;
        InterfaceC0952y interfaceC0952y = cVar.f6314e;
        p U02 = U0(interfaceC0941m, interfaceC0952y, cVar.f6315f, cVar.f6321l, a10, W0(cVar.f6324o, interfaceC0952y));
        List n10 = cVar.f6327r == null ? n() : cVar.f6327r;
        zArr[0] = zArr[0] | (!n10.isEmpty());
        ArrayList arrayList = new ArrayList(n10.size());
        n0 c10 = AbstractC5216s.c(n10, cVar.f6310a, U02, arrayList, zArr);
        if (c10 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f6317h.isEmpty()) {
            int i10 = 0;
            for (X x11 : cVar.f6317h) {
                AbstractC5197E p11 = c10.p(x11.getType(), u0.IN_VARIANCE);
                if (p11 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(AbstractC3565e.b(U02, p11, ((InterfaceC4518f) x11.getValue()).a(), x11.i(), i10));
                zArr[0] = zArr[0] | (p11 != x11.getType());
                i10 = i11;
            }
        }
        X x12 = cVar.f6318i;
        if (x12 != null) {
            AbstractC5197E p12 = c10.p(x12.getType(), u0.IN_VARIANCE);
            if (p12 == null) {
                return null;
            }
            F f11 = new F(U02, new C4516d(U02, p12, cVar.f6318i.getValue()), cVar.f6318i.i());
            zArr[0] = (p12 != cVar.f6318i.getType()) | zArr[0];
            f10 = f11;
        } else {
            f10 = null;
        }
        X x13 = cVar.f6319j;
        if (x13 != null) {
            X c11 = x13.c(c10);
            if (c11 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (c11 != cVar.f6319j);
            x10 = c11;
        } else {
            x10 = null;
        }
        List Y02 = Y0(U02, cVar.f6316g, c10, cVar.f6325p, cVar.f6324o, zArr);
        if (Y02 == null || (p10 = c10.p(cVar.f6320k, u0.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z10 = zArr[0] | (p10 != cVar.f6320k);
        zArr[0] = z10;
        if (!z10 && cVar.f6332w) {
            return this;
        }
        U02.a1(f10, x10, arrayList2, arrayList, Y02, p10, cVar.f6312c, cVar.f6313d);
        U02.o1(this.f6293m);
        U02.l1(this.f6294n);
        U02.g1(this.f6295o);
        U02.n1(this.f6296p);
        U02.r1(this.f6297q);
        U02.q1(this.f6302v);
        U02.f1(this.f6298r);
        U02.e1(this.f6299s);
        U02.h1(this.f6303w);
        U02.k1(cVar.f6326q);
        U02.j1(cVar.f6329t);
        U02.i1(cVar.f6331v != null ? cVar.f6331v.booleanValue() : this.f6304x);
        if (!cVar.f6330u.isEmpty() || this.f6284D != null) {
            Map map = cVar.f6330u;
            Map map2 = this.f6284D;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                U02.f6284D = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                U02.f6284D = map;
            }
        }
        if (cVar.f6323n || j0() != null) {
            U02.m1((j0() != null ? j0() : this).c(c10));
        }
        if (cVar.f6322m && !a().f().isEmpty()) {
            if (cVar.f6310a.f()) {
                Function0 function0 = this.f6306z;
                if (function0 != null) {
                    U02.f6306z = function0;
                } else {
                    U02.F0(f());
                }
            } else {
                U02.f6306z = new a(c10);
            }
        }
        return U02;
    }

    public boolean Z0() {
        return this.f6303w;
    }

    @Override // Mc.AbstractC0985k, Mc.AbstractC0984j, Kc.InterfaceC0941m
    public InterfaceC0952y a() {
        InterfaceC0952y interfaceC0952y = this.f6281A;
        InterfaceC0952y a10 = interfaceC0952y == this ? this : interfaceC0952y.a();
        if (a10 == null) {
            D(20);
        }
        return a10;
    }

    public p a1(X x10, X x11, List list, List list2, List list3, AbstractC5197E abstractC5197E, Kc.D d10, AbstractC0948u abstractC0948u) {
        if (list == null) {
            D(5);
        }
        if (list2 == null) {
            D(6);
        }
        if (list3 == null) {
            D(7);
        }
        if (abstractC0948u == null) {
            D(8);
        }
        this.f6285e = CollectionsKt.O0(list2);
        this.f6286f = CollectionsKt.O0(list3);
        this.f6287g = abstractC5197E;
        this.f6291k = d10;
        this.f6292l = abstractC0948u;
        this.f6289i = x10;
        this.f6290j = x11;
        this.f6288h = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            f0 f0Var = (f0) list2.get(i10);
            if (f0Var.getIndex() != i10) {
                throw new IllegalStateException(f0Var + " index is " + f0Var.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            j0 j0Var = (j0) list3.get(i11);
            if (j0Var.getIndex() != i11) {
                throw new IllegalStateException(j0Var + "index is " + j0Var.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    protected c b1(n0 n0Var) {
        if (n0Var == null) {
            D(24);
        }
        return new c(this, n0Var.j(), b(), s(), h(), o(), m(), x0(), s0(), g(), null);
    }

    public void d1(InterfaceC0929a.InterfaceC0107a interfaceC0107a, Object obj) {
        if (this.f6284D == null) {
            this.f6284D = new LinkedHashMap();
        }
        this.f6284D.put(interfaceC0107a, obj);
    }

    public void e1(boolean z10) {
        this.f6299s = z10;
    }

    public Collection f() {
        c1();
        Collection collection = this.f6305y;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            D(14);
        }
        return collection;
    }

    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return interfaceC0943o.a(this, obj);
    }

    public void f1(boolean z10) {
        this.f6298r = z10;
    }

    public AbstractC5197E g() {
        return this.f6287g;
    }

    public void g1(boolean z10) {
        this.f6295o = z10;
    }

    @Override // Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        AbstractC0948u abstractC0948u = this.f6292l;
        if (abstractC0948u == null) {
            D(16);
        }
        return abstractC0948u;
    }

    public void h1(boolean z10) {
        this.f6303w = z10;
    }

    public void i1(boolean z10) {
        this.f6304x = z10;
    }

    @Override // Kc.InterfaceC0952y
    public InterfaceC0952y j0() {
        return this.f6283C;
    }

    @Override // Kc.InterfaceC0929a
    public X l0() {
        return this.f6290j;
    }

    public void l1(boolean z10) {
        this.f6294n = z10;
    }

    @Override // Kc.InterfaceC0929a
    public List m() {
        List list = this.f6286f;
        if (list == null) {
            D(19);
        }
        return list;
    }

    @Override // Kc.InterfaceC0929a
    public List n() {
        List list = this.f6285e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public void n1(boolean z10) {
        this.f6296p = z10;
    }

    @Override // Kc.InterfaceC0930b
    public InterfaceC0930b.a o() {
        InterfaceC0930b.a aVar = this.f6282B;
        if (aVar == null) {
            D(21);
        }
        return aVar;
    }

    public void o1(boolean z10) {
        this.f6293m = z10;
    }

    public boolean p() {
        return this.f6296p;
    }

    public void p1(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            D(11);
        }
        this.f6287g = abstractC5197E;
    }

    public boolean q() {
        return this.f6295o;
    }

    public void q1(boolean z10) {
        this.f6302v = z10;
    }

    public void r1(boolean z10) {
        this.f6297q = z10;
    }

    @Override // Kc.C
    public Kc.D s() {
        Kc.D d10 = this.f6291k;
        if (d10 == null) {
            D(15);
        }
        return d10;
    }

    @Override // Kc.InterfaceC0929a
    public X s0() {
        return this.f6289i;
    }

    public void s1(AbstractC0948u abstractC0948u) {
        if (abstractC0948u == null) {
            D(10);
        }
        this.f6292l = abstractC0948u;
    }

    @Override // Kc.InterfaceC0929a
    public List x0() {
        List list = this.f6288h;
        if (list == null) {
            D(13);
        }
        return list;
    }

    @Override // Kc.InterfaceC0952y
    public boolean z() {
        return this.f6302v;
    }

    @Override // Kc.InterfaceC0952y, Kc.c0
    public InterfaceC0952y c(n0 n0Var) {
        if (n0Var == null) {
            D(22);
        }
        return n0Var.k() ? this : b1(n0Var).g(a()).h().K(true).c();
    }
}
