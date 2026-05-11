package Mc;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.InterfaceC0950w;
import Kc.InterfaceC0952y;
import Kc.T;
import Kc.U;
import Kc.V;
import Kc.W;
import Kc.X;
import Kc.a0;
import Kc.j0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import od.AbstractC3778c;
import sd.C4515c;
import sd.C4516d;
import sd.InterfaceC4518f;
import yd.AbstractC5197E;
import yd.AbstractC5216s;
import yd.l0;
import yd.n0;
import yd.u0;

/* loaded from: classes3.dex */
public class C extends N implements U {

    /* renamed from: A, reason: collision with root package name */
    private InterfaceC0950w f6152A;

    /* renamed from: B, reason: collision with root package name */
    private InterfaceC0950w f6153B;

    /* renamed from: i, reason: collision with root package name */
    private final Kc.D f6154i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC0948u f6155j;

    /* renamed from: k, reason: collision with root package name */
    private Collection f6156k;

    /* renamed from: l, reason: collision with root package name */
    private final U f6157l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC0930b.a f6158m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f6159n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f6160o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f6161p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f6162q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f6163r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f6164s;

    /* renamed from: t, reason: collision with root package name */
    private List f6165t;

    /* renamed from: u, reason: collision with root package name */
    private X f6166u;

    /* renamed from: v, reason: collision with root package name */
    private X f6167v;

    /* renamed from: w, reason: collision with root package name */
    private List f6168w;

    /* renamed from: x, reason: collision with root package name */
    private D f6169x;

    /* renamed from: y, reason: collision with root package name */
    private W f6170y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f6171z;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC0941m f6172a;

        /* renamed from: b, reason: collision with root package name */
        private Kc.D f6173b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC0948u f6174c;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC0930b.a f6177f;

        /* renamed from: i, reason: collision with root package name */
        private X f6180i;

        /* renamed from: k, reason: collision with root package name */
        private id.f f6182k;

        /* renamed from: l, reason: collision with root package name */
        private AbstractC5197E f6183l;

        /* renamed from: d, reason: collision with root package name */
        private U f6175d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f6176e = false;

        /* renamed from: g, reason: collision with root package name */
        private l0 f6178g = l0.f45549b;

        /* renamed from: h, reason: collision with root package name */
        private boolean f6179h = true;

        /* renamed from: j, reason: collision with root package name */
        private List f6181j = null;

        public a() {
            this.f6172a = C.this.b();
            this.f6173b = C.this.s();
            this.f6174c = C.this.h();
            this.f6177f = C.this.o();
            this.f6180i = C.this.f6166u;
            this.f6182k = C.this.getName();
            this.f6183l = C.this.getType();
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public U n() {
            return C.this.Z0(this);
        }

        V o() {
            U u10 = this.f6175d;
            if (u10 == null) {
                return null;
            }
            return u10.d();
        }

        W p() {
            U u10 = this.f6175d;
            if (u10 == null) {
                return null;
            }
            return u10.l();
        }

        public a q(boolean z10) {
            this.f6179h = z10;
            return this;
        }

        public a r(InterfaceC0930b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f6177f = aVar;
            return this;
        }

        public a s(Kc.D d10) {
            if (d10 == null) {
                a(6);
            }
            this.f6173b = d10;
            return this;
        }

        public a t(InterfaceC0930b interfaceC0930b) {
            this.f6175d = (U) interfaceC0930b;
            return this;
        }

        public a u(InterfaceC0941m interfaceC0941m) {
            if (interfaceC0941m == null) {
                a(0);
            }
            this.f6172a = interfaceC0941m;
            return this;
        }

        public a v(l0 l0Var) {
            if (l0Var == null) {
                a(15);
            }
            this.f6178g = l0Var;
            return this;
        }

        public a w(AbstractC0948u abstractC0948u) {
            if (abstractC0948u == null) {
                a(8);
            }
            this.f6174c = abstractC0948u;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C(InterfaceC0941m interfaceC0941m, U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, Kc.D d10, AbstractC0948u abstractC0948u, boolean z10, id.f fVar, InterfaceC0930b.a aVar, a0 a0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(interfaceC0941m, gVar, fVar, null, z10, a0Var);
        if (interfaceC0941m == null) {
            D(0);
        }
        if (gVar == null) {
            D(1);
        }
        if (d10 == null) {
            D(2);
        }
        if (abstractC0948u == null) {
            D(3);
        }
        if (fVar == null) {
            D(4);
        }
        if (aVar == null) {
            D(5);
        }
        if (a0Var == null) {
            D(6);
        }
        this.f6156k = null;
        this.f6165t = Collections.emptyList();
        this.f6154i = d10;
        this.f6155j = abstractC0948u;
        this.f6157l = u10 == null ? this : u10;
        this.f6158m = aVar;
        this.f6159n = z11;
        this.f6160o = z12;
        this.f6161p = z13;
        this.f6162q = z14;
        this.f6163r = z15;
        this.f6164s = z16;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void D(int i10) {
        String str;
        int i11;
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
                switch (i10) {
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 26:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 8:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 9:
                        objArr[0] = "modality";
                        break;
                    case 3:
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        objArr[0] = "visibility";
                        break;
                    case 4:
                    case 11:
                        objArr[0] = "name";
                        break;
                    case 5:
                    case 12:
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                        objArr[0] = "kind";
                        break;
                    case 6:
                    case 13:
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                        objArr[0] = "source";
                        break;
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        objArr[0] = "inType";
                        break;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        objArr[0] = "outType";
                        break;
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case 18:
                        objArr[0] = "typeParameters";
                        break;
                    case 19:
                        objArr[0] = "contextReceiverParameters";
                        break;
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case RequestError.NO_DEV_KEY /* 41 */:
                    case HVError.CONSENT_DENIED /* 42 */:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                        break;
                    case 27:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 29:
                        objArr[0] = "copyConfiguration";
                        break;
                    case 30:
                        objArr[0] = "substitutor";
                        break;
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                        objArr[0] = "accessorDescriptor";
                        break;
                    case 32:
                        objArr[0] = "newOwner";
                        break;
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                        objArr[0] = "newModality";
                        break;
                    case 34:
                        objArr[0] = "newVisibility";
                        break;
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                        objArr[0] = "newName";
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        objArr[0] = "overriddenDescriptors";
                        break;
                }
                if (i10 != 28) {
                    objArr[1] = "getSourceToUseForCopy";
                } else if (i10 == 38) {
                    objArr[1] = "getOriginal";
                } else if (i10 == 39) {
                    objArr[1] = "getKind";
                } else if (i10 == 41) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i10 != 42) {
                    switch (i10) {
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            objArr[1] = "getTypeParameters";
                            break;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            objArr[1] = "getContextReceiverParameters";
                            break;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            objArr[1] = "getReturnType";
                            break;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            objArr[1] = "getModality";
                            break;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            objArr[1] = "getVisibility";
                            break;
                        case 26:
                            objArr[1] = "getAccessors";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i10) {
                    case 7:
                    case 8:
                    case 9:
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                        objArr[2] = "create";
                        break;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        objArr[2] = "setInType";
                        break;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    case 18:
                    case 19:
                        objArr[2] = "setType";
                        break;
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        objArr[2] = "setVisibility";
                        break;
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case RequestError.NO_DEV_KEY /* 41 */:
                    case HVError.CONSENT_DENIED /* 42 */:
                        break;
                    case 27:
                        objArr[2] = "substitute";
                        break;
                    case 29:
                        objArr[2] = "doSubstitute";
                        break;
                    case 30:
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                        objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                        break;
                    case 32:
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                    case 34:
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
                    switch (i10) {
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                        case 26:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 28) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 28) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 28) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 28) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 28) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 != 28) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 28) {
        }
        throw new IllegalStateException(format222);
    }

    public static C X0(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, Kc.D d10, AbstractC0948u abstractC0948u, boolean z10, id.f fVar, InterfaceC0930b.a aVar, a0 a0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (interfaceC0941m == null) {
            D(7);
        }
        if (gVar == null) {
            D(8);
        }
        if (d10 == null) {
            D(9);
        }
        if (abstractC0948u == null) {
            D(10);
        }
        if (fVar == null) {
            D(11);
        }
        if (aVar == null) {
            D(12);
        }
        if (a0Var == null) {
            D(13);
        }
        return new C(interfaceC0941m, null, gVar, d10, abstractC0948u, z10, fVar, aVar, a0Var, z11, z12, z13, z14, z15, z16);
    }

    private a0 b1(boolean z10, U u10) {
        a0 a0Var;
        if (z10) {
            if (u10 == null) {
                u10 = a();
            }
            a0Var = u10.j();
        } else {
            a0Var = a0.f5560a;
        }
        if (a0Var == null) {
            D(28);
        }
        return a0Var;
    }

    private static InterfaceC0952y c1(n0 n0Var, T t10) {
        if (n0Var == null) {
            D(30);
        }
        if (t10 == null) {
            D(31);
        }
        if (t10.j0() != null) {
            return t10.j0().c(n0Var);
        }
        return null;
    }

    private static AbstractC0948u h1(AbstractC0948u abstractC0948u, InterfaceC0930b.a aVar) {
        return (aVar == InterfaceC0930b.a.FAKE_OVERRIDE && AbstractC0947t.g(abstractC0948u.f())) ? AbstractC0947t.f5592h : abstractC0948u;
    }

    private static X m1(n0 n0Var, U u10, X x10) {
        AbstractC5197E p10 = n0Var.p(x10.getType(), u0.IN_VARIANCE);
        if (p10 == null) {
            return null;
        }
        return new F(u10, new C4515c(u10, p10, ((InterfaceC4518f) x10.getValue()).a(), x10.getValue()), x10.i());
    }

    private static X n1(n0 n0Var, U u10, X x10) {
        AbstractC5197E p10 = n0Var.p(x10.getType(), u0.IN_VARIANCE);
        if (p10 == null) {
            return null;
        }
        return new F(u10, new C4516d(u10, p10, x10.getValue()), x10.i());
    }

    @Override // Kc.InterfaceC0929a
    public Object A0(InterfaceC0929a.InterfaceC0107a interfaceC0107a) {
        return null;
    }

    @Override // Kc.U
    public List C() {
        ArrayList arrayList = new ArrayList(2);
        D d10 = this.f6169x;
        if (d10 != null) {
            arrayList.add(d10);
        }
        W w10 = this.f6170y;
        if (w10 != null) {
            arrayList.add(w10);
        }
        return arrayList;
    }

    @Override // Kc.InterfaceC0930b
    public void F0(Collection collection) {
        if (collection == null) {
            D(40);
        }
        this.f6156k = collection;
    }

    @Override // Kc.k0
    public boolean G() {
        return this.f6160o;
    }

    @Override // Kc.C
    public boolean M0() {
        return this.f6162q;
    }

    @Override // Kc.C
    public boolean R() {
        return this.f6161p;
    }

    @Override // Kc.l0
    public boolean T() {
        return this.f6164s;
    }

    @Override // Kc.InterfaceC0930b
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public U o0(InterfaceC0941m interfaceC0941m, Kc.D d10, AbstractC0948u abstractC0948u, InterfaceC0930b.a aVar, boolean z10) {
        U n10 = g1().u(interfaceC0941m).t(null).s(d10).w(abstractC0948u).r(aVar).q(z10).n();
        if (n10 == null) {
            D(42);
        }
        return n10;
    }

    protected C Y0(InterfaceC0941m interfaceC0941m, Kc.D d10, AbstractC0948u abstractC0948u, U u10, InterfaceC0930b.a aVar, id.f fVar, a0 a0Var) {
        if (interfaceC0941m == null) {
            D(32);
        }
        if (d10 == null) {
            D(33);
        }
        if (abstractC0948u == null) {
            D(34);
        }
        if (aVar == null) {
            D(35);
        }
        if (fVar == null) {
            D(36);
        }
        if (a0Var == null) {
            D(37);
        }
        return new C(interfaceC0941m, u10, i(), d10, abstractC0948u, q0(), fVar, aVar, a0Var, y0(), G(), R(), M0(), q(), T());
    }

    protected U Z0(a aVar) {
        X x10;
        Function0 function0;
        if (aVar == null) {
            D(29);
        }
        C Y02 = Y0(aVar.f6172a, aVar.f6173b, aVar.f6174c, aVar.f6175d, aVar.f6177f, aVar.f6182k, b1(aVar.f6176e, aVar.f6175d));
        List n10 = aVar.f6181j == null ? n() : aVar.f6181j;
        ArrayList arrayList = new ArrayList(n10.size());
        n0 b10 = AbstractC5216s.b(n10, aVar.f6178g, Y02, arrayList);
        AbstractC5197E abstractC5197E = aVar.f6183l;
        AbstractC5197E p10 = b10.p(abstractC5197E, u0.OUT_VARIANCE);
        if (p10 == null) {
            return null;
        }
        AbstractC5197E p11 = b10.p(abstractC5197E, u0.IN_VARIANCE);
        if (p11 != null) {
            Y02.i1(p11);
        }
        X x11 = aVar.f6180i;
        if (x11 != null) {
            X c10 = x11.c(b10);
            if (c10 == null) {
                return null;
            }
            x10 = c10;
        } else {
            x10 = null;
        }
        X x12 = this.f6167v;
        X n12 = x12 != null ? n1(b10, Y02, x12) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f6165t.iterator();
        while (it.hasNext()) {
            X m12 = m1(b10, Y02, (X) it.next());
            if (m12 != null) {
                arrayList2.add(m12);
            }
        }
        Y02.k1(p10, arrayList, x10, n12, arrayList2);
        D d10 = this.f6169x == null ? null : new D(Y02, this.f6169x.i(), aVar.f6173b, h1(this.f6169x.h(), aVar.f6177f), this.f6169x.a0(), this.f6169x.q(), this.f6169x.p(), aVar.f6177f, aVar.o(), a0.f5560a);
        if (d10 != null) {
            AbstractC5197E g10 = this.f6169x.g();
            d10.V0(c1(b10, this.f6169x));
            d10.Y0(g10 != null ? b10.p(g10, u0.OUT_VARIANCE) : null);
        }
        E e10 = this.f6170y == null ? null : new E(Y02, this.f6170y.i(), aVar.f6173b, h1(this.f6170y.h(), aVar.f6177f), this.f6170y.a0(), this.f6170y.q(), this.f6170y.p(), aVar.f6177f, aVar.p(), a0.f5560a);
        if (e10 != null) {
            List Y03 = p.Y0(e10, this.f6170y.m(), b10, false, false, null);
            if (Y03 == null) {
                Y02.j1(true);
                Y03 = Collections.singletonList(E.X0(e10, AbstractC3778c.j(aVar.f6172a).H(), ((j0) this.f6170y.m().get(0)).i()));
            }
            if (Y03.size() != 1) {
                throw new IllegalStateException();
            }
            e10.V0(c1(b10, this.f6170y));
            e10.Z0((j0) Y03.get(0));
        }
        InterfaceC0950w interfaceC0950w = this.f6152A;
        o oVar = interfaceC0950w == null ? null : new o(interfaceC0950w.i(), Y02);
        InterfaceC0950w interfaceC0950w2 = this.f6153B;
        Y02.e1(d10, e10, oVar, interfaceC0950w2 != null ? new o(interfaceC0950w2.i(), Y02) : null);
        if (aVar.f6179h) {
            Gd.g c11 = Gd.g.c();
            Iterator it2 = f().iterator();
            while (it2.hasNext()) {
                c11.add(((U) it2.next()).c(b10));
            }
            Y02.F0(c11);
        }
        if (G() && (function0 = this.f6216h) != null) {
            Y02.T0(this.f6215g, function0);
        }
        return Y02;
    }

    @Override // Kc.U
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public D d() {
        return this.f6169x;
    }

    public void d1(D d10, W w10) {
        e1(d10, w10, null, null);
    }

    public void e1(D d10, W w10, InterfaceC0950w interfaceC0950w, InterfaceC0950w interfaceC0950w2) {
        this.f6169x = d10;
        this.f6170y = w10;
        this.f6152A = interfaceC0950w;
        this.f6153B = interfaceC0950w2;
    }

    @Override // Kc.InterfaceC0929a
    public Collection f() {
        Collection collection = this.f6156k;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            D(41);
        }
        return collection;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return interfaceC0943o.l(this, obj);
    }

    public boolean f1() {
        return this.f6171z;
    }

    @Override // Mc.M, Kc.InterfaceC0929a
    public AbstractC5197E g() {
        AbstractC5197E type = getType();
        if (type == null) {
            D(23);
        }
        return type;
    }

    public a g1() {
        return new a();
    }

    @Override // Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        AbstractC0948u abstractC0948u = this.f6155j;
        if (abstractC0948u == null) {
            D(25);
        }
        return abstractC0948u;
    }

    public void i1(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            D(14);
        }
    }

    public void j1(boolean z10) {
        this.f6171z = z10;
    }

    public void k1(AbstractC5197E abstractC5197E, List list, X x10, X x11, List list2) {
        if (abstractC5197E == null) {
            D(17);
        }
        if (list == null) {
            D(18);
        }
        if (list2 == null) {
            D(19);
        }
        N0(abstractC5197E);
        this.f6168w = new ArrayList(list);
        this.f6167v = x11;
        this.f6166u = x10;
        this.f6165t = list2;
    }

    @Override // Kc.U
    public W l() {
        return this.f6170y;
    }

    @Override // Mc.M, Kc.InterfaceC0929a
    public X l0() {
        return this.f6166u;
    }

    public void l1(AbstractC0948u abstractC0948u) {
        if (abstractC0948u == null) {
            D(20);
        }
        this.f6155j = abstractC0948u;
    }

    @Override // Mc.M, Kc.InterfaceC0929a
    public List n() {
        List list = this.f6168w;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // Kc.InterfaceC0930b
    public InterfaceC0930b.a o() {
        InterfaceC0930b.a aVar = this.f6158m;
        if (aVar == null) {
            D(39);
        }
        return aVar;
    }

    @Override // Kc.C
    public boolean q() {
        return this.f6163r;
    }

    @Override // Kc.C
    public Kc.D s() {
        Kc.D d10 = this.f6154i;
        if (d10 == null) {
            D(24);
        }
        return d10;
    }

    @Override // Mc.M, Kc.InterfaceC0929a
    public X s0() {
        return this.f6167v;
    }

    @Override // Kc.U
    public InterfaceC0950w t0() {
        return this.f6153B;
    }

    @Override // Kc.U
    public InterfaceC0950w w0() {
        return this.f6152A;
    }

    @Override // Kc.InterfaceC0929a
    public List x0() {
        List list = this.f6165t;
        if (list == null) {
            D(22);
        }
        return list;
    }

    @Override // Kc.k0
    public boolean y0() {
        return this.f6159n;
    }

    @Override // Kc.c0
    public U c(n0 n0Var) {
        if (n0Var == null) {
            D(27);
        }
        return n0Var.k() ? this : g1().v(n0Var.j()).t(a()).n();
    }

    @Override // Mc.AbstractC0985k, Mc.AbstractC0984j, Kc.InterfaceC0941m
    public U a() {
        U u10 = this.f6157l;
        U a10 = u10 == this ? this : u10.a();
        if (a10 == null) {
            D(38);
        }
        return a10;
    }
}
