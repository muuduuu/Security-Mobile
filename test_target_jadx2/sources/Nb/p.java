package Nb;

import D7.InterfaceC0781e;
import D7.InterfaceC0782f;
import D7.InterfaceC0783g;
import Db.C0792a;
import Db.C0794c;
import Nb.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import bc.InterfaceC1672b;
import bc.d;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Task;
import dc.C3023a;
import expo.modules.location.records.GeocodeResponse;
import expo.modules.location.records.GeofencingOptions;
import expo.modules.location.records.HeadingEventResponse;
import expo.modules.location.records.LocationLastKnownOptions;
import expo.modules.location.records.LocationOptions;
import expo.modules.location.records.LocationProviderStatus;
import expo.modules.location.records.LocationResponse;
import expo.modules.location.records.LocationTaskOptions;
import expo.modules.location.records.PermissionDetailsLocationAndroid;
import expo.modules.location.records.PermissionRequestResponse;
import expo.modules.location.records.ReverseGeocodeLocation;
import expo.modules.location.records.ReverseGeocodeResponse;
import fc.C3164b;
import hc.C3304a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import mb.InterfaceC3663a;
import nb.InterfaceC3726a;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import u5.C4870a;
import vb.C5006a;
import vb.EnumC5010e;
import wc.InterfaceC5068n;
import x7.AbstractC5129l;
import x7.AbstractC5131n;
import x7.C5118a;
import x7.C5132o;
import x7.InterfaceC5121d;
import xb.AbstractC5139a;
import xc.C5142C;

@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 £\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002¤\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u0019\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J3\u0010*\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H\u0082@¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020/H\u0082@¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020/H\u0082@¢\u0006\u0004\b3\u00101J\u001a\u00106\u001a\u0004\u0018\u00010\u00142\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\b6\u00107J\u001f\u0010;\u001a\u00020\u00102\u0006\u00105\u001a\u0002082\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bE\u0010\u0006J\u000f\u0010F\u001a\u00020\u0010H\u0002¢\u0006\u0004\bF\u0010\u0006J\u0017\u0010I\u001a\u00020G2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020G2\u0006\u0010K\u001a\u00020GH\u0002¢\u0006\u0004\bL\u0010JJ\u000f\u0010M\u001a\u00020\u0010H\u0002¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010N\u001a\u00020\u0010H\u0002¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010O\u001a\u00020\u0010H\u0002¢\u0006\u0004\bO\u0010\u0006J\u000f\u0010P\u001a\u00020\u0010H\u0002¢\u0006\u0004\bP\u0010\u0006J\u0017\u0010Q\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bQ\u0010DJ\u0017\u0010R\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bR\u0010DJ\u000f\u0010S\u001a\u00020\u0010H\u0002¢\u0006\u0004\bS\u0010\u0006J\u0012\u0010U\u001a\u0004\u0018\u00010TH\u0082@¢\u0006\u0004\bU\u00101J\u001e\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X2\u0006\u0010W\u001a\u00020VH\u0082@¢\u0006\u0004\bZ\u0010[J\u001e\u0010_\u001a\b\u0012\u0004\u0012\u00020^0X2\u0006\u0010]\u001a\u00020\\H\u0082@¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0002¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020aH\u0002¢\u0006\u0004\bd\u0010cJ\u000f\u0010e\u001a\u00020aH\u0002¢\u0006\u0004\be\u0010cJ\u000f\u0010f\u001a\u00020aH\u0003¢\u0006\u0004\bf\u0010cJ\u000f\u0010g\u001a\u00020aH\u0002¢\u0006\u0004\bg\u0010cR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR0\u0010q\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020m0lj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020m`n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR0\u0010s\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0lj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n`n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010pR&\u0010x\u001a\u0012\u0012\u0004\u0012\u00020=0tj\b\u0012\u0004\u0012\u00020=`u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010|\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0017\u0010\u0080\u0001\u001a\u00020}8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0094\u0001\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0090\u0001R\u001a\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009c\u0001\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010bR!\u0010¢\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001¨\u0006¥\u0001"}, d2 = {"LNb/p;", "Lxb/a;", "LEa/f;", "Landroid/hardware/SensorEventListener;", "LEa/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", BuildConfig.FLAVOR, "requestId", "LNb/q;", "callbacks", BuildConfig.FLAVOR, "d0", "(Lcom/google/android/gms/location/LocationRequest;Ljava/lang/Integer;LNb/q;)V", "watchId", "Lexpo/modules/location/records/LocationResponse;", Keys.RESPONSE, "j0", "(ILexpo/modules/location/records/LocationResponse;)V", "onHostResume", "onHostPause", "onHostDestroy", "Landroid/hardware/SensorEvent;", Keys.EVENT, "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Landroid/app/Activity;", "activity", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lexpo/modules/location/records/PermissionRequestResponse;", "S", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "c0", "Q", "Lexpo/modules/location/records/LocationLastKnownOptions;", "options", "U", "(Lexpo/modules/location/records/LocationLastKnownOptions;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lexpo/modules/location/records/LocationOptions;", "Lpb/m;", BaseJavaModule.METHOD_TYPE_PROMISE, "R", "(Lexpo/modules/location/records/LocationOptions;Lpb/m;)V", "LNb/g;", "listener", "K", "(Lcom/google/android/gms/location/LocationRequest;LNb/g;)V", "e0", "(Lcom/google/android/gms/location/LocationRequest;)V", "O", "(I)V", "m0", "k0", BuildConfig.FLAVOR, "azimuth", "L", "(F)F", "magNorth", "M", "p0", "N", "o0", "q0", "a0", "b0", "h0", "Landroid/location/Location;", "T", BuildConfig.FLAVOR, "address", BuildConfig.FLAVOR, "Lexpo/modules/location/records/GeocodeResponse;", "P", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lexpo/modules/location/records/ReverseGeocodeLocation;", "location", "Lexpo/modules/location/records/ReverseGeocodeResponse;", "i0", "(Lexpo/modules/location/records/ReverseGeocodeLocation;Lkotlin/coroutines/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Z", "()Z", "W", "Y", "l0", "X", "Landroid/hardware/GeomagneticField;", "d", "Landroid/hardware/GeomagneticField;", "mGeofield", "Ljava/util/HashMap;", "Lx7/l;", "Lkotlin/collections/HashMap;", "e", "Ljava/util/HashMap;", "mLocationCallbacks", "f", "mLocationRequests", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "mPendingLocationRequests", "Landroid/content/Context;", "h", "Landroid/content/Context;", "mContext", "Landroid/hardware/SensorManager;", "i", "Landroid/hardware/SensorManager;", "mSensorManager", "LFa/c;", "j", "LFa/c;", "mUIManager", "Lx7/d;", "k", "Lx7/d;", "mLocationProvider", BuildConfig.FLAVOR, "l", "[F", "mGravity", "m", "mGeomagnetic", "n", "I", "mHeadingId", "o", "F", "mLastAzimuth", "p", "mAccuracy", BuildConfig.FLAVOR, "q", "J", "mLastUpdate", "r", "mGeocoderPaused", "Lnb/a;", "s", "Lkotlin/Lazy;", "V", "()Lnb/a;", "mTaskManager", "t", C4870a.f43493a, "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class p extends AbstractC5139a implements Ea.f, SensorEventListener, Ea.a {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    private static final String f6636u = p.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private GeomagneticField mGeofield;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Context mContext;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private SensorManager mSensorManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Fa.c mUIManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5121d mLocationProvider;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mHeadingId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float mLastAzimuth;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int mAccuracy;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long mLastUpdate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean mGeocoderPaused;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final HashMap mLocationCallbacks = new HashMap();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final HashMap mLocationRequests = new HashMap();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ArrayList mPendingLocationRequests = new ArrayList();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float[] mGravity = new float[9];

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float[] mGeomagnetic = new float[9];

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy mTaskManager = lc.i.a(new e0());

    public static final class A extends xc.m implements Function1 {
        public A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            int intValue = ((Number) objArr[0]).intValue();
            if (p.this.Z()) {
                throw new u();
            }
            if (intValue == p.this.mHeadingId) {
                p.this.N();
            } else {
                p.this.b0(intValue);
            }
            return Unit.f36324a;
        }
    }

    public static final class B extends xc.m implements Function1 {
        public B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            l.a aVar = l.f6625a;
            Context context = p.this.mContext;
            if (context == null) {
                Intrinsics.v("mContext");
                context = null;
            }
            return Boolean.valueOf(aVar.h(context));
        }
    }

    public static final class C extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C f6655a = new C();

        public C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class D extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final D f6656a = new D();

        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(LocationOptions.class);
        }
    }

    public static final class E extends xc.m implements Function2 {
        public E() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            p.this.R((LocationOptions) objArr[0], promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class F extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final F f6658a = new F();

        public F() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Integer.TYPE);
        }
    }

    public static final class G extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final G f6659a = new G();

        public G() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(LocationOptions.class);
        }
    }

    public static final class H extends xc.m implements Function2 {
        public H() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            LocationOptions locationOptions = (LocationOptions) objArr[1];
            int intValue = ((Number) obj).intValue();
            if (p.this.Z()) {
                promise.h(new u());
                return;
            }
            l.a aVar = l.f6625a;
            LocationRequest m10 = aVar.m(locationOptions);
            boolean mayShowUserSettingsDialog = locationOptions.getMayShowUserSettingsDialog();
            Context context = p.this.mContext;
            if (context == null) {
                Intrinsics.v("mContext");
                context = null;
            }
            if (aVar.g(context) || !mayShowUserSettingsDialog) {
                aVar.n(p.this, m10, intValue, promise);
            } else {
                p pVar = p.this;
                pVar.K(m10, pVar.new C1006b(m10, intValue, promise));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class I extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f6661a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6662b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f6663c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(kotlin.coroutines.d dVar, p pVar) {
            super(3, dVar);
            this.f6663c = pVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            I i10 = new I(dVar, this.f6663c);
            i10.f6662b = objArr;
            return i10.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6661a;
            if (i10 == 0) {
                lc.p.b(obj);
                String str = (String) ((Object[]) this.f6662b)[0];
                p pVar = this.f6663c;
                this.f6661a = 1;
                obj = pVar.P(str, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class J extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final J f6664a = new J();

        public J() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(ReverseGeocodeLocation.class);
        }
    }

    public static final class K extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f6665a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6666b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f6667c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(kotlin.coroutines.d dVar, p pVar) {
            super(3, dVar);
            this.f6667c = pVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            K k10 = new K(dVar, this.f6667c);
            k10.f6666b = objArr;
            return k10.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6665a;
            if (i10 == 0) {
                lc.p.b(obj);
                ReverseGeocodeLocation reverseGeocodeLocation = (ReverseGeocodeLocation) ((Object[]) this.f6666b)[0];
                p pVar = this.f6667c;
                this.f6665a = 1;
                obj = pVar.i0(reverseGeocodeLocation, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class L extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f6668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f6669b;

        /* renamed from: c, reason: collision with root package name */
        Object f6670c;

        /* renamed from: d, reason: collision with root package name */
        Object f6671d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(kotlin.coroutines.d dVar, p pVar) {
            super(3, dVar);
            this.f6669b = pVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            return new L(dVar, this.f6669b).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6668a;
            if (i10 == 0) {
                lc.p.b(obj);
                l.a aVar = l.f6625a;
                Context context = this.f6669b.mContext;
                if (context == null) {
                    Intrinsics.v("mContext");
                    context = null;
                }
                if (aVar.g(context)) {
                    return null;
                }
                LocationRequest m10 = aVar.m(new LocationOptions(0, null, false, null, 15, null));
                this.f6670c = m10;
                this.f6671d = this;
                this.f6668a = 1;
                kotlin.coroutines.h hVar = new kotlin.coroutines.h(AbstractC3868b.c(this));
                this.f6669b.K(m10, new C1007c(hVar));
                obj = hVar.a();
                if (obj == AbstractC3868b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class M extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f6672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f6673b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(kotlin.coroutines.d dVar, p pVar) {
            super(3, dVar);
            this.f6673b = pVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            return new M(dVar, this.f6673b).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6672a;
            if (i10 == 0) {
                lc.p.b(obj);
                InterfaceC3663a v10 = this.f6673b.a().v();
                if (v10 == null) {
                    throw new Nb.A();
                }
                if (Build.VERSION.SDK_INT == 29) {
                    this.f6672a = 1;
                    obj = l.f6625a.d(v10, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    this.f6672a = 2;
                    obj = l.f6625a.d(v10, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, this);
                    if (obj == e10) {
                        return e10;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class N extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f6674a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f6675b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(kotlin.coroutines.d dVar, p pVar) {
            super(3, dVar);
            this.f6675b = pVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            return new N(dVar, this.f6675b).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6674a;
            if (i10 == 0) {
                lc.p.b(obj);
                InterfaceC3663a v10 = this.f6675b.a().v();
                if (v10 == null) {
                    throw new Nb.A();
                }
                if (Build.VERSION.SDK_INT == 29) {
                    this.f6674a = 1;
                    obj = l.f6625a.f(v10, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    p pVar = this.f6675b;
                    this.f6674a = 2;
                    obj = pVar.S(this);
                    if (obj == e10) {
                        return e10;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class O extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f6676a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f6677b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public O(kotlin.coroutines.d dVar, p pVar) {
            super(3, dVar);
            this.f6677b = pVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            return new O(dVar, this.f6677b).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6676a;
            if (i10 == 0) {
                lc.p.b(obj);
                InterfaceC3663a v10 = this.f6677b.a().v();
                if (v10 == null) {
                    throw new Nb.A();
                }
                this.f6676a = 1;
                if (l.f6625a.d(v10, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        lc.p.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            p pVar = this.f6677b;
            this.f6676a = 2;
            obj = pVar.S(this);
            return obj == e10 ? e10 : obj;
        }
    }

    public static final class P extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f6678a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f6679b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(kotlin.coroutines.d dVar, p pVar) {
            super(3, dVar);
            this.f6679b = pVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            return new P(dVar, this.f6679b).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6678a;
            if (i10 == 0) {
                lc.p.b(obj);
                p pVar = this.f6679b;
                this.f6678a = 1;
                obj = pVar.c0(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class Q extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f6680a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f6681b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Q(kotlin.coroutines.d dVar, p pVar) {
            super(3, dVar);
            this.f6681b = pVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            return new Q(dVar, this.f6681b).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6680a;
            if (i10 == 0) {
                lc.p.b(obj);
                p pVar = this.f6681b;
                this.f6680a = 1;
                obj = pVar.S(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class R extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f6682a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f6683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R(kotlin.coroutines.d dVar, p pVar) {
            super(3, dVar);
            this.f6683b = pVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            return new R(dVar, this.f6683b).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6682a;
            if (i10 == 0) {
                lc.p.b(obj);
                p pVar = this.f6683b;
                this.f6682a = 1;
                obj = pVar.Q(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class S extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final S f6684a = new S();

        public S() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(LocationLastKnownOptions.class);
        }
    }

    public static final class T extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f6685a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6686b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f6687c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T(kotlin.coroutines.d dVar, p pVar) {
            super(3, dVar);
            this.f6687c = pVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            T t10 = new T(dVar, this.f6687c);
            t10.f6686b = objArr;
            return t10.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6685a;
            if (i10 == 0) {
                lc.p.b(obj);
                LocationLastKnownOptions locationLastKnownOptions = (LocationLastKnownOptions) ((Object[]) this.f6686b)[0];
                p pVar = this.f6687c;
                this.f6685a = 1;
                obj = pVar.U(locationLastKnownOptions, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class U extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final U f6688a = new U();

        public U() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class V extends xc.m implements Function0 {
        public V() {
            super(0);
        }

        public final void a() {
            C1002a.f6620a.b(false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class W extends xc.m implements Function0 {
        public W() {
            super(0);
        }

        public final void a() {
            C1002a.f6620a.b(true);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class X extends xc.m implements Function0 {
        public X() {
            super(0);
        }

        public final void a() {
            Object obj;
            p pVar = p.this;
            Context w10 = pVar.a().w();
            if (w10 == null) {
                throw new expo.modules.kotlin.exception.l();
            }
            pVar.mContext = w10;
            p pVar2 = p.this;
            try {
                obj = pVar2.a().r().b(Fa.c.class);
            } catch (Exception unused) {
                obj = null;
            }
            Fa.c cVar = (Fa.c) obj;
            if (cVar == null) {
                throw new x();
            }
            pVar2.mUIManager = cVar;
            p pVar3 = p.this;
            Context context = pVar3.mContext;
            if (context == null) {
                Intrinsics.v("mContext");
                context = null;
            }
            InterfaceC5121d a10 = AbstractC5131n.a(context);
            Intrinsics.checkNotNullExpressionValue(a10, "getFusedLocationProviderClient(...)");
            pVar3.mLocationProvider = a10;
            p pVar4 = p.this;
            Context context2 = pVar4.mContext;
            if (context2 == null) {
                Intrinsics.v("mContext");
                context2 = null;
            }
            Object systemService = context2.getSystemService("sensor");
            SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
            if (sensorManager == null) {
                throw new Nb.B();
            }
            pVar4.mSensorManager = sensorManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class Y implements g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5118a f6691b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ pb.m f6692c;

        Y(C5118a c5118a, pb.m mVar) {
            this.f6691b = c5118a;
            this.f6692c = mVar;
        }

        @Override // Nb.g
        public void a(int i10) {
            if (i10 != -1) {
                this.f6692c.h(new t());
                return;
            }
            l.a aVar = l.f6625a;
            InterfaceC5121d interfaceC5121d = p.this.mLocationProvider;
            if (interfaceC5121d == null) {
                Intrinsics.v("mLocationProvider");
                interfaceC5121d = null;
            }
            aVar.o(interfaceC5121d, this.f6691b, this.f6692c);
        }
    }

    static final class Z extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6693a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6694b;

        /* renamed from: d, reason: collision with root package name */
        int f6696d;

        Z(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6694b = obj;
            this.f6696d |= Integer.MIN_VALUE;
            return p.this.S(this);
        }
    }

    /* renamed from: Nb.p$a, reason: case insensitive filesystem and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return p.f6636u;
        }

        private Companion() {
        }
    }

    static final class a0 extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f6697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(kotlin.coroutines.d dVar) {
            super(1);
            this.f6697a = dVar;
        }

        public final void a(Location location) {
            this.f6697a.resumeWith(lc.o.b(location));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Location) obj);
            return Unit.f36324a;
        }
    }

    /* renamed from: Nb.p$b, reason: case insensitive filesystem */
    public static final class C1006b implements g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocationRequest f6699b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6700c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ pb.m f6701d;

        C1006b(LocationRequest locationRequest, int i10, pb.m mVar) {
            this.f6699b = locationRequest;
            this.f6700c = i10;
            this.f6701d = mVar;
        }

        @Override // Nb.g
        public void a(int i10) {
            if (i10 == -1) {
                l.f6625a.n(p.this, this.f6699b, this.f6700c, this.f6701d);
            } else {
                this.f6701d.h(new t());
            }
        }
    }

    static final class b0 implements InterfaceC0781e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f6702a;

        b0(kotlin.coroutines.d dVar) {
            this.f6702a = dVar;
        }

        @Override // D7.InterfaceC0781e
        public final void a() {
            this.f6702a.resumeWith(lc.o.b(null));
        }
    }

    /* renamed from: Nb.p$c, reason: case insensitive filesystem */
    public static final class C1007c implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f6703a;

        C1007c(kotlin.coroutines.d dVar) {
            this.f6703a = dVar;
        }

        @Override // Nb.g
        public void a(int i10) {
            if (i10 == -1) {
                this.f6703a.resumeWith(lc.o.b(null));
                return;
            }
            kotlin.coroutines.d dVar = this.f6703a;
            o.a aVar = lc.o.f37128b;
            dVar.resumeWith(lc.o.b(lc.p.a(new t())));
        }
    }

    static final class c0 implements InterfaceC0782f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f6704a;

        c0(kotlin.coroutines.d dVar) {
            this.f6704a = dVar;
        }

        @Override // D7.InterfaceC0782f
        public final void b(Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f6704a.resumeWith(lc.o.b(null));
        }
    }

    /* renamed from: Nb.p$d, reason: case insensitive filesystem */
    public static final class C1008d extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1008d f6705a = new C1008d();

        public C1008d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(LocationTaskOptions.class);
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6706a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6707b;

        /* renamed from: d, reason: collision with root package name */
        int f6709d;

        d0(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6707b = obj;
            this.f6709d |= Integer.MIN_VALUE;
            return p.this.U(null, this);
        }
    }

    /* renamed from: Nb.p$e, reason: case insensitive filesystem */
    public static final class C1009e extends xc.m implements Function1 {
        public C1009e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            LocationTaskOptions locationTaskOptions = (LocationTaskOptions) objArr[1];
            boolean z10 = locationTaskOptions.getForegroundService() != null;
            if (p.this.Z()) {
                throw new h();
            }
            if (!z10 && p.this.Y()) {
                throw new h();
            }
            if (!C1002a.f6620a.a() && locationTaskOptions.getForegroundService() != null) {
                throw new e();
            }
            if (!p.this.W()) {
                throw new d();
            }
            p.w(p.this);
            locationTaskOptions.toMutableMap$expo_location_release();
            throw null;
        }
    }

    static final class e0 extends xc.m implements Function0 {
        e0() {
            super(0);
        }

        public final InterfaceC3726a a() {
            Object obj;
            try {
                obj = p.this.a().r().b(InterfaceC3726a.class);
            } catch (Exception unused) {
                obj = null;
            }
            android.support.v4.media.session.b.a(obj);
            throw new Nb.C();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return null;
        }
    }

    /* renamed from: Nb.p$f, reason: case insensitive filesystem */
    public static final class C1010f extends xc.m implements Function2 {
        public C1010f() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            p.w(p.this);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6713a;

        /* renamed from: c, reason: collision with root package name */
        int f6715c;

        f0(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6713a = obj;
            this.f6715c |= Integer.MIN_VALUE;
            return p.this.c0(this);
        }
    }

    /* renamed from: Nb.p$g, reason: case insensitive filesystem */
    public static final class C1011g extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1011g f6716a = new C1011g();

        public C1011g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class g0 extends AbstractC5129l {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6717a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f6718b;

        g0(q qVar) {
            this.f6718b = qVar;
        }

        @Override // x7.AbstractC5129l
        public void onLocationAvailability(LocationAvailability locationAvailability) {
            Intrinsics.checkNotNullParameter(locationAvailability, "locationAvailability");
            this.f6717a = locationAvailability.j();
        }

        @Override // x7.AbstractC5129l
        public void onLocationResult(LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            Location u10 = locationResult.u();
            if (u10 != null) {
                this.f6718b.onLocationChanged(u10);
            } else if (this.f6717a) {
                this.f6718b.a(new w());
            } else {
                this.f6718b.c(new v());
            }
        }
    }

    /* renamed from: Nb.p$h, reason: case insensitive filesystem */
    public static final class C1012h extends xc.m implements Function1 {
        public C1012h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            p.w(p.this);
            throw null;
        }
    }

    static final class h0 extends xc.m implements Function1 {
        h0() {
            super(1);
        }

        public final void a(x7.p pVar) {
            p.this.O(-1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x7.p) obj);
            return Unit.f36324a;
        }
    }

    /* renamed from: Nb.p$i, reason: case insensitive filesystem */
    public static final class C1013i extends xc.m implements Function2 {
        public C1013i() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            p.w(p.this);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    static final class i0 implements InterfaceC0783g {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f6722a;

        i0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f6722a = function;
        }

        @Override // D7.InterfaceC0783g
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f6722a.invoke(obj);
        }
    }

    /* renamed from: Nb.p$j, reason: case insensitive filesystem */
    public static final class C1014j extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1014j f6723a = new C1014j();

        public C1014j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Nb.p$k, reason: case insensitive filesystem */
    public static final class C1015k extends xc.m implements Function1 {
        public C1015k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            p.w(p.this);
            throw null;
        }
    }

    /* renamed from: Nb.p$l, reason: case insensitive filesystem */
    public static final class C1016l extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1016l f6725a = new C1016l();

        public C1016l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Nb.p$m, reason: case insensitive filesystem */
    public static final class C1017m extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1017m f6726a = new C1017m();

        public C1017m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(GeofencingOptions.class);
        }
    }

    /* renamed from: Nb.p$n, reason: case insensitive filesystem */
    public static final class C1018n extends xc.m implements Function1 {
        public C1018n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Context context = p.this.mContext;
            if (context == null) {
                Intrinsics.v("mContext");
                context = null;
            }
            C3304a e10 = bc.d.h(context).f().e();
            LocationProviderStatus locationProviderStatus = new LocationProviderStatus(null, null, null, false, null, 31, null);
            locationProviderStatus.setBackgroundModeEnabled(Boolean.valueOf(e10.d()));
            locationProviderStatus.setGpsAvailable(Boolean.valueOf(e10.a()));
            locationProviderStatus.setNetworkAvailable(Boolean.valueOf(e10.b()));
            locationProviderStatus.setLocationServicesEnabled(e10.d());
            locationProviderStatus.setPassiveAvailable(Boolean.valueOf(e10.c()));
            return locationProviderStatus;
        }
    }

    /* renamed from: Nb.p$o, reason: case insensitive filesystem */
    public static final class C1019o extends xc.m implements Function1 {
        public C1019o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            GeofencingOptions geofencingOptions = (GeofencingOptions) objArr[1];
            if (p.this.Y()) {
                throw new h();
            }
            p.w(p.this);
            geofencingOptions.toMap$expo_location_release();
            throw null;
        }
    }

    /* renamed from: Nb.p$p, reason: collision with other inner class name */
    public static final class C0132p extends xc.m implements Function2 {
        public C0132p() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            if (p.this.Y()) {
                throw new h();
            }
            p.w(p.this);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Nb.p$q, reason: case insensitive filesystem */
    public static final class C1020q extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1020q f6730a = new C1020q();

        public C1020q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Nb.p$r, reason: case insensitive filesystem */
    public static final class C1021r extends xc.m implements Function1 {
        public C1021r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            if (p.this.Y()) {
                throw new h();
            }
            p.w(p.this);
            throw null;
        }
    }

    /* renamed from: Nb.p$s, reason: case insensitive filesystem */
    public static final class C1022s extends xc.m implements Function2 {
        public C1022s() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            if (p.this.Y()) {
                throw new h();
            }
            p.w(p.this);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Nb.p$t, reason: case insensitive filesystem */
    public static final class C1023t extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1023t f6733a = new C1023t();

        public C1023t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Nb.p$u, reason: case insensitive filesystem */
    public static final class C1024u extends xc.m implements Function1 {
        public C1024u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            if (p.this.Y()) {
                throw new h();
            }
            p.w(p.this);
            throw null;
        }
    }

    /* renamed from: Nb.p$v, reason: case insensitive filesystem */
    public static final class C1025v extends xc.m implements Function2 {
        public C1025v() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            p.this.mHeadingId = ((Integer) promise).intValue();
            p.this.m0();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Nb.p$w, reason: case insensitive filesystem */
    public static final class C1026w extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1026w f6736a = new C1026w();

        public C1026w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Integer.TYPE);
        }
    }

    /* renamed from: Nb.p$x, reason: case insensitive filesystem */
    public static final class C1027x extends xc.m implements Function1 {
        public C1027x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            p.this.mHeadingId = ((Number) objArr[0]).intValue();
            p.this.m0();
            return Unit.f36324a;
        }
    }

    /* renamed from: Nb.p$y, reason: case insensitive filesystem */
    public static final class C1028y extends xc.m implements Function2 {
        public C1028y() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            int intValue = ((Integer) promise).intValue();
            if (p.this.Z()) {
                throw new u();
            }
            if (intValue == p.this.mHeadingId) {
                p.this.N();
            } else {
                p.this.b0(intValue);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Nb.p$z, reason: case insensitive filesystem */
    public static final class C1029z extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1029z f6739a = new C1029z();

        public C1029z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Integer.TYPE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(LocationRequest locationRequest, g listener) {
        this.mPendingLocationRequests.add(listener);
        if (this.mPendingLocationRequests.size() == 1) {
            e0(locationRequest);
        }
    }

    private final float L(float azimuth) {
        float f10 = 360;
        return (((float) Math.toDegrees(azimuth)) + f10) % f10;
    }

    private final float M(float magNorth) {
        GeomagneticField geomagneticField = this.mGeofield;
        if (Z()) {
            geomagneticField = null;
        }
        if (geomagneticField == null) {
            return -1.0f;
        }
        return (magNorth + geomagneticField.getDeclination()) % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        p0();
        this.mGravity = new float[9];
        this.mGeomagnetic = new float[9];
        this.mGeofield = null;
        this.mHeadingId = 0;
        this.mLastAzimuth = 0.0f;
        this.mAccuracy = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(int resultCode) {
        Iterator it = this.mPendingLocationRequests.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(resultCode);
        }
        this.mPendingLocationRequests.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P(String str, kotlin.coroutines.d dVar) {
        Unit unit = null;
        if (this.mGeocoderPaused) {
            throw new f("Geocoder is not running", null, 2, null);
        }
        if (Z()) {
            throw new u();
        }
        if (!Geocoder.isPresent()) {
            throw new y();
        }
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(AbstractC3868b.c(dVar));
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.v("mContext");
            context = null;
        }
        List<Address> fromLocationName = new Geocoder(context, Locale.getDefault()).getFromLocationName(str, 1);
        if (fromLocationName != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = fromLocationName.iterator();
            while (it.hasNext()) {
                C3023a c3023a = new C3023a((Address) it.next());
                GeocodeResponse.Companion companion = GeocodeResponse.INSTANCE;
                Location a10 = c3023a.a();
                Intrinsics.checkNotNullExpressionValue(a10, "getLocation(...)");
                GeocodeResponse a11 = companion.a(a10);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            hVar.resumeWith(lc.o.b(arrayList));
            unit = Unit.f36324a;
        }
        if (unit == null) {
            o.a aVar = lc.o.f37128b;
            hVar.resumeWith(lc.o.b(CollectionsKt.j()));
        }
        Object a12 = hVar.a();
        if (a12 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q(kotlin.coroutines.d dVar) {
        if (!X()) {
            throw new z("ACCESS_BACKGROUND_LOCATION");
        }
        if (!l0()) {
            return S(dVar);
        }
        InterfaceC3663a v10 = a().v();
        if (v10 != null) {
            return l.f6625a.f(v10, new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, dVar);
        }
        throw new Nb.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(LocationOptions options, pb.m promise) {
        l.a aVar = l.f6625a;
        LocationRequest m10 = aVar.m(options);
        C5118a l10 = aVar.l(options);
        boolean mayShowUserSettingsDialog = options.getMayShowUserSettingsDialog();
        if (Z()) {
            promise.h(new u());
            return;
        }
        Context context = this.mContext;
        InterfaceC5121d interfaceC5121d = null;
        if (context == null) {
            Intrinsics.v("mContext");
            context = null;
        }
        if (!aVar.g(context) && mayShowUserSettingsDialog) {
            K(m10, new Y(l10, promise));
            return;
        }
        InterfaceC5121d interfaceC5121d2 = this.mLocationProvider;
        if (interfaceC5121d2 == null) {
            Intrinsics.v("mLocationProvider");
        } else {
            interfaceC5121d = interfaceC5121d2;
        }
        aVar.o(interfaceC5121d, l10, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(kotlin.coroutines.d dVar) {
        Z z10;
        Object e10;
        int i10;
        InterfaceC3663a v10;
        Object f10;
        PermissionRequestResponse permissionRequestResponse;
        PermissionRequestResponse permissionRequestResponse2;
        if (dVar instanceof Z) {
            z10 = (Z) dVar;
            int i11 = z10.f6696d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                z10.f6696d = i11 - Integer.MIN_VALUE;
                Object obj = z10.f6694b;
                e10 = AbstractC3868b.e();
                i10 = z10.f6696d;
                if (i10 != 0) {
                    lc.p.b(obj);
                    v10 = a().v();
                    if (v10 == null) {
                        throw new Nb.A();
                    }
                    z10.f6693a = v10;
                    z10.f6696d = 1;
                    obj = l.f6625a.f(v10, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, z10);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        permissionRequestResponse = (PermissionRequestResponse) z10.f6693a;
                        lc.p.b(obj);
                        permissionRequestResponse2 = (PermissionRequestResponse) obj;
                        String str = !permissionRequestResponse.getGranted() ? "coarse" : "none";
                        if (permissionRequestResponse2.getGranted()) {
                            str = "fine";
                        }
                        permissionRequestResponse.setAndroid(new PermissionDetailsLocationAndroid(str));
                        return permissionRequestResponse;
                    }
                    v10 = (InterfaceC3663a) z10.f6693a;
                    lc.p.b(obj);
                }
                PermissionRequestResponse permissionRequestResponse3 = (PermissionRequestResponse) obj;
                z10.f6693a = permissionRequestResponse3;
                z10.f6696d = 2;
                f10 = l.f6625a.f(v10, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, z10);
                if (f10 != e10) {
                    return e10;
                }
                permissionRequestResponse = permissionRequestResponse3;
                obj = f10;
                permissionRequestResponse2 = (PermissionRequestResponse) obj;
                if (!permissionRequestResponse.getGranted()) {
                }
                if (permissionRequestResponse2.getGranted()) {
                }
                permissionRequestResponse.setAndroid(new PermissionDetailsLocationAndroid(str));
                return permissionRequestResponse;
            }
        }
        z10 = new Z(dVar);
        Object obj2 = z10.f6694b;
        e10 = AbstractC3868b.e();
        i10 = z10.f6696d;
        if (i10 != 0) {
        }
        PermissionRequestResponse permissionRequestResponse32 = (PermissionRequestResponse) obj2;
        z10.f6693a = permissionRequestResponse32;
        z10.f6696d = 2;
        f10 = l.f6625a.f(v10, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, z10);
        if (f10 != e10) {
        }
    }

    private final Object T(kotlin.coroutines.d dVar) {
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(AbstractC3868b.c(dVar));
        try {
            InterfaceC5121d interfaceC5121d = this.mLocationProvider;
            if (interfaceC5121d == null) {
                Intrinsics.v("mLocationProvider");
                interfaceC5121d = null;
            }
            interfaceC5121d.b().f(new i0(new a0(hVar))).a(new b0(hVar)).d(new c0(hVar));
        } catch (SecurityException unused) {
            hVar.resumeWith(lc.o.b(null));
        }
        Object a10 = hVar.a();
        if (a10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(LocationLastKnownOptions locationLastKnownOptions, kotlin.coroutines.d dVar) {
        d0 d0Var;
        int i10;
        Location location;
        if (dVar instanceof d0) {
            d0Var = (d0) dVar;
            int i11 = d0Var.f6709d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d0Var.f6709d = i11 - Integer.MIN_VALUE;
                Object obj = d0Var.f6707b;
                Object e10 = AbstractC3868b.e();
                i10 = d0Var.f6709d;
                if (i10 != 0) {
                    lc.p.b(obj);
                    if (Z()) {
                        throw new u();
                    }
                    d0Var.f6706a = locationLastKnownOptions;
                    d0Var.f6709d = 1;
                    obj = T(d0Var);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    locationLastKnownOptions = (LocationLastKnownOptions) d0Var.f6706a;
                    lc.p.b(obj);
                }
                location = (Location) obj;
                if (location == null && l.f6625a.i(location, locationLastKnownOptions)) {
                    return new LocationResponse(location);
                }
                return null;
            }
        }
        d0Var = new d0(dVar);
        Object obj2 = d0Var.f6707b;
        Object e102 = AbstractC3868b.e();
        i10 = d0Var.f6709d;
        if (i10 != 0) {
        }
        location = (Location) obj2;
        if (location == null) {
            return null;
        }
        return new LocationResponse(location);
    }

    private final InterfaceC3726a V() {
        android.support.v4.media.session.b.a(this.mTaskManager.getValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W() {
        InterfaceC3663a v10 = a().v();
        if (v10 == null) {
            throw new expo.modules.kotlin.exception.e();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return v10.h("android.permission.FOREGROUND_SERVICE") && v10.h("android.permission.FOREGROUND_SERVICE_LOCATION");
        }
        if (i10 >= 28) {
            return v10.h("android.permission.FOREGROUND_SERVICE");
        }
        return true;
    }

    private final boolean X() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        InterfaceC3663a v10 = a().v();
        if (v10 != null) {
            return v10.f("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        throw new Nb.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Y() {
        InterfaceC3663a v10 = a().v();
        if (v10 != null) {
            return Build.VERSION.SDK_INT >= 29 && !v10.h("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z() {
        InterfaceC3663a v10 = a().v();
        if (v10 != null) {
            return (v10.h("android.permission.ACCESS_FINE_LOCATION") || v10.h("android.permission.ACCESS_COARSE_LOCATION")) ? false : true;
        }
        throw new expo.modules.kotlin.exception.e();
    }

    private final void a0(int requestId) {
        AbstractC5129l abstractC5129l = (AbstractC5129l) this.mLocationCallbacks.get(Integer.valueOf(requestId));
        if (abstractC5129l != null) {
            InterfaceC5121d interfaceC5121d = this.mLocationProvider;
            if (interfaceC5121d == null) {
                Intrinsics.v("mLocationProvider");
                interfaceC5121d = null;
            }
            interfaceC5121d.e(abstractC5129l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(int requestId) {
        a0(requestId);
        this.mLocationCallbacks.remove(Integer.valueOf(requestId));
        this.mLocationRequests.remove(Integer.valueOf(requestId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(kotlin.coroutines.d dVar) {
        f0 f0Var;
        int i10;
        if (dVar instanceof f0) {
            f0Var = (f0) dVar;
            int i11 = f0Var.f6715c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f0Var.f6715c = i11 - Integer.MIN_VALUE;
                Object obj = f0Var.f6713a;
                Object e10 = AbstractC3868b.e();
                i10 = f0Var.f6715c;
                if (i10 == 0) {
                    if (i10 == 1) {
                        lc.p.b(obj);
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                    return new PermissionRequestResponse((Bundle) obj);
                }
                lc.p.b(obj);
                if (!X()) {
                    throw new z("ACCESS_BACKGROUND_LOCATION");
                }
                if (!l0()) {
                    f0Var.f6715c = 1;
                    obj = S(f0Var);
                    return obj == e10 ? e10 : obj;
                }
                InterfaceC3663a v10 = a().v();
                if (v10 == null) {
                    throw new Nb.A();
                }
                f0Var.f6715c = 2;
                obj = l.f6625a.d(v10, new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, f0Var);
                if (obj == e10) {
                    return e10;
                }
                return new PermissionRequestResponse((Bundle) obj);
            }
        }
        f0Var = new f0(dVar);
        Object obj2 = f0Var.f6713a;
        Object e102 = AbstractC3868b.e();
        i10 = f0Var.f6715c;
        if (i10 == 0) {
        }
    }

    private final void e0(LocationRequest locationRequest) {
        C5132o.a a10 = new C5132o.a().a(locationRequest);
        Intrinsics.checkNotNullExpressionValue(a10, "addLocationRequest(...)");
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.v("mContext");
            context = null;
        }
        x7.t c10 = AbstractC5131n.c(context);
        Intrinsics.checkNotNullExpressionValue(c10, "getSettingsClient(...)");
        Task p10 = c10.p(a10.b());
        Intrinsics.checkNotNullExpressionValue(p10, "checkLocationSettings(...)");
        final h0 h0Var = new h0();
        p10.f(new InterfaceC0783g() { // from class: Nb.n
            @Override // D7.InterfaceC0783g
            public final void onSuccess(Object obj) {
                p.f0(Function1.this, obj);
            }
        });
        p10.d(new InterfaceC0782f() { // from class: Nb.o
            @Override // D7.InterfaceC0782f
            public final void b(Exception exc) {
                p.g0(p.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(p this$0, Exception e10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (((S6.b) e10).b() != 6) {
            this$0.O(0);
            return;
        }
        try {
            S6.m mVar = (S6.m) e10;
            Fa.c cVar = this$0.mUIManager;
            if (cVar == null) {
                Intrinsics.v("mUIManager");
                cVar = null;
            }
            cVar.f(this$0);
            mVar.c(this$0.a().x(), 42);
        } catch (Throwable unused) {
            this$0.O(0);
        }
    }

    private final void h0() {
        LocationRequest locationRequest;
        for (Integer num : this.mLocationCallbacks.keySet()) {
            AbstractC5129l abstractC5129l = (AbstractC5129l) this.mLocationCallbacks.get(num);
            if (abstractC5129l == null || (locationRequest = (LocationRequest) this.mLocationRequests.get(num)) == null) {
                return;
            }
            try {
                InterfaceC5121d interfaceC5121d = this.mLocationProvider;
                if (interfaceC5121d == null) {
                    Intrinsics.v("mLocationProvider");
                    interfaceC5121d = null;
                }
                interfaceC5121d.c(locationRequest, abstractC5129l, Looper.myLooper());
            } catch (SecurityException e10) {
                Log.e(f6636u, "Error occurred while resuming location updates: " + e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i0(ReverseGeocodeLocation reverseGeocodeLocation, kotlin.coroutines.d dVar) {
        ReverseGeocodeResponse reverseGeocodeResponse;
        Unit unit = null;
        if (this.mGeocoderPaused) {
            throw new f("Geocoder is not running", null, 2, null);
        }
        if (Z()) {
            throw new u();
        }
        if (!Geocoder.isPresent()) {
            throw new y();
        }
        Location location = new Location(BuildConfig.FLAVOR);
        location.setLatitude(reverseGeocodeLocation.getLatitude());
        location.setLongitude(reverseGeocodeLocation.getLongitude());
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(AbstractC3868b.c(dVar));
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.v("mContext");
            context = null;
        }
        List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
        if (fromLocation != null) {
            ArrayList arrayList = new ArrayList();
            for (Address address : fromLocation) {
                if (address != null) {
                    Intrinsics.d(address);
                    reverseGeocodeResponse = new ReverseGeocodeResponse(address);
                } else {
                    reverseGeocodeResponse = null;
                }
                if (reverseGeocodeResponse != null) {
                    arrayList.add(reverseGeocodeResponse);
                }
            }
            hVar.resumeWith(lc.o.b(arrayList));
            unit = Unit.f36324a;
        }
        if (unit == null) {
            o.a aVar = lc.o.f37128b;
            hVar.resumeWith(lc.o.b(CollectionsKt.j()));
        }
        Object a10 = hVar.a();
        if (a10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a10;
    }

    private final void k0() {
        float[] fArr = new float[9];
        if (SensorManager.getRotationMatrix(fArr, new float[9], this.mGravity, this.mGeomagnetic)) {
            float[] fArr2 = new float[3];
            SensorManager.getOrientation(fArr, fArr2);
            if (Math.abs(fArr2[0] - this.mLastAzimuth) <= 0.0355d || System.currentTimeMillis() - this.mLastUpdate <= 50.0f) {
                return;
            }
            this.mLastAzimuth = fArr2[0];
            this.mLastUpdate = System.currentTimeMillis();
            float L10 = L(fArr2[0]);
            f("Expo.headingChanged", new HeadingEventResponse(Integer.valueOf(this.mHeadingId), new Ob.a(M(L10), L10, this.mAccuracy)).toBundle$expo_location_release());
        }
    }

    private final boolean l0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        Context context = this.mContext;
        SensorManager sensorManager = null;
        if (context == null) {
            Intrinsics.v("mContext");
            context = null;
        }
        d.C0329d a10 = bc.d.h(context).f().c().a(C3164b.f32980e);
        Location b10 = a10.b();
        if (b10 != null) {
            this.mGeofield = new GeomagneticField((float) b10.getLatitude(), (float) b10.getLongitude(), (float) b10.getAltitude(), System.currentTimeMillis());
        } else {
            a10.d(new InterfaceC1672b() { // from class: Nb.m
                @Override // bc.InterfaceC1672b
                public final void a(Location location) {
                    p.n0(p.this, location);
                }
            });
        }
        SensorManager sensorManager2 = this.mSensorManager;
        if (sensorManager2 == null) {
            Intrinsics.v("mSensorManager");
            sensorManager2 = null;
        }
        SensorManager sensorManager3 = this.mSensorManager;
        if (sensorManager3 == null) {
            Intrinsics.v("mSensorManager");
            sensorManager3 = null;
        }
        sensorManager2.registerListener(this, sensorManager3.getDefaultSensor(2), 3);
        SensorManager sensorManager4 = this.mSensorManager;
        if (sensorManager4 == null) {
            Intrinsics.v("mSensorManager");
            sensorManager4 = null;
        }
        SensorManager sensorManager5 = this.mSensorManager;
        if (sensorManager5 == null) {
            Intrinsics.v("mSensorManager");
        } else {
            sensorManager = sensorManager5;
        }
        sensorManager4.registerListener(this, sensorManager.getDefaultSensor(1), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(p this$0, Location location) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(location, "location");
        this$0.mGeofield = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis());
    }

    private final void o0() {
        if (!Z()) {
            this.mGeocoderPaused = false;
        }
        h0();
    }

    private final void p0() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager == null) {
            Intrinsics.v("mSensorManager");
            sensorManager = null;
        }
        sensorManager.unregisterListener(this);
    }

    private final void q0() {
        if (Geocoder.isPresent() && !Z()) {
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.v("mContext");
                context = null;
            }
            bc.d.h(context).d().a();
            this.mGeocoderPaused = true;
        }
        for (Integer num : this.mLocationCallbacks.keySet()) {
            Intrinsics.d(num);
            a0(num.intValue());
        }
    }

    public static final /* synthetic */ InterfaceC3726a w(p pVar) {
        pVar.V();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x06e7 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05fd A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0566 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x050b A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0464 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03c7 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x040f A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x045e A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04bd A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x04e4 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0505 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0557 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05ee A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0694 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x06bb A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x06e1 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0731 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x07ca A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x07d9 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0740 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:3:0x0045, B:5:0x0133, B:6:0x0152, B:8:0x017b, B:9:0x018d, B:12:0x01b6, B:13:0x01f7, B:16:0x0208, B:17:0x0297, B:19:0x02b7, B:20:0x02ce, B:22:0x02e3, B:23:0x02f5, B:25:0x0312, B:27:0x039f, B:29:0x03c7, B:30:0x03de, B:32:0x040f, B:33:0x0421, B:35:0x045e, B:36:0x049f, B:38:0x04bd, B:39:0x04cf, B:41:0x04e4, B:42:0x04f6, B:44:0x0505, B:45:0x0546, B:47:0x0557, B:48:0x05df, B:50:0x05ee, B:51:0x0676, B:53:0x0694, B:54:0x06a6, B:56:0x06bb, B:57:0x06d2, B:59:0x06e1, B:60:0x0722, B:62:0x0731, B:63:0x07bb, B:65:0x07ca, B:66:0x0852, B:71:0x07d9, B:73:0x07ee, B:74:0x0800, B:76:0x080f, B:78:0x0816, B:80:0x081e, B:81:0x0824, B:83:0x082c, B:84:0x0832, B:86:0x083a, B:87:0x0840, B:89:0x0846, B:90:0x084c, B:91:0x0740, B:93:0x0755, B:94:0x0767, B:96:0x0778, B:98:0x077f, B:100:0x0787, B:101:0x078d, B:103:0x0795, B:104:0x079b, B:106:0x07a3, B:107:0x07a9, B:109:0x07af, B:110:0x07b5, B:111:0x06e7, B:113:0x06ef, B:114:0x06f5, B:116:0x06fd, B:117:0x0703, B:119:0x070b, B:120:0x0711, B:122:0x0717, B:123:0x071d, B:125:0x05fd, B:127:0x0612, B:128:0x0624, B:130:0x0633, B:132:0x063a, B:134:0x0642, B:135:0x0648, B:137:0x0650, B:138:0x0656, B:140:0x065e, B:141:0x0664, B:143:0x066a, B:144:0x0670, B:145:0x0566, B:147:0x057b, B:148:0x058d, B:150:0x059c, B:152:0x05a3, B:154:0x05ab, B:155:0x05b1, B:157:0x05b9, B:158:0x05bf, B:160:0x05c7, B:161:0x05cd, B:163:0x05d3, B:164:0x05d9, B:165:0x050b, B:167:0x0513, B:168:0x0519, B:170:0x0521, B:171:0x0527, B:173:0x052f, B:174:0x0535, B:176:0x053b, B:177:0x0541, B:178:0x0464, B:180:0x046c, B:181:0x0472, B:183:0x047a, B:184:0x0480, B:186:0x0488, B:187:0x048e, B:189:0x0494, B:190:0x049a, B:192:0x0323, B:194:0x0338, B:195:0x034a, B:197:0x0359, B:199:0x0360, B:201:0x0368, B:202:0x036e, B:204:0x0376, B:205:0x037c, B:207:0x0384, B:208:0x038a, B:210:0x0392, B:212:0x0399, B:214:0x0219, B:216:0x022e, B:217:0x0245, B:219:0x0254, B:221:0x025b, B:223:0x0263, B:224:0x0269, B:226:0x0271, B:227:0x0277, B:229:0x027f, B:230:0x0285, B:232:0x028b, B:233:0x0291, B:235:0x01bc, B:237:0x01c4, B:238:0x01ca, B:240:0x01d2, B:241:0x01d8, B:243:0x01e0, B:244:0x01e6, B:246:0x01ec, B:247:0x01f2), top: B:2:0x0045 }] */
    @Override // xb.AbstractC5139a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xb.c b() {
        Class cls;
        Object obj;
        Object obj2;
        wb.g kVar;
        Class cls2;
        Class cls3;
        wb.g mVar;
        wb.g gVar;
        C0792a c0792a;
        Object obj3;
        C0792a c0792a2;
        C0792a c0792a3;
        C0792a c0792a4;
        Object obj4;
        wb.g kVar2;
        wb.g kVar3;
        C0792a c0792a5;
        C0792a c0792a6;
        Object obj5;
        wb.g kVar4;
        wb.g kVar5;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoLocation");
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_CREATE;
            s10.put(enumC5010e, new C5006a(enumC5010e, new X()));
            bVar.d("Expo.headingChanged", "Expo.locationChanged");
            wb.d a10 = bVar.a("requestPermissionsAsync");
            a10.c(new wb.o(a10.b(), new C0792a[0], new M(null, this)));
            wb.d a11 = bVar.a("getPermissionsAsync");
            a11.c(new wb.o(a11.b(), new C0792a[0], new N(null, this)));
            wb.d a12 = bVar.a("requestForegroundPermissionsAsync");
            a12.c(new wb.o(a12.b(), new C0792a[0], new O(null, this)));
            wb.d a13 = bVar.a("requestBackgroundPermissionsAsync");
            a13.c(new wb.o(a13.b(), new C0792a[0], new P(null, this)));
            wb.d a14 = bVar.a("getForegroundPermissionsAsync");
            a14.c(new wb.o(a14.b(), new C0792a[0], new Q(null, this)));
            wb.d a15 = bVar.a("getBackgroundPermissionsAsync");
            a15.c(new wb.o(a15.b(), new C0792a[0], new R(null, this)));
            wb.d a16 = bVar.a("getLastKnownPositionAsync");
            String b10 = a16.b();
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b11 = C5142C.b(LocationLastKnownOptions.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a7 = (C0792a) c0794c.a().get(new Pair(b11, bool));
            if (c0792a7 == null) {
                obj = Boolean.class;
                cls = ReverseGeocodeLocation.class;
                c0792a7 = new C0792a(new Db.M(C5142C.b(LocationLastKnownOptions.class), false, S.f6684a));
            } else {
                cls = ReverseGeocodeLocation.class;
                obj = Boolean.class;
            }
            a16.c(new wb.o(b10, new C0792a[]{c0792a7}, new T(null, this)));
            C0792a c0792a8 = (C0792a) c0794c.a().get(new Pair(C5142C.b(LocationOptions.class), bool));
            if (c0792a8 == null) {
                c0792a8 = new C0792a(new Db.M(C5142C.b(LocationOptions.class), false, D.f6656a));
            }
            bVar.k().put("getCurrentPositionAsync", new wb.f("getCurrentPositionAsync", new C0792a[]{c0792a8}, new E()));
            C0792a[] c0792aArr = new C0792a[0];
            C1018n c1018n = new C1018n();
            Class cls4 = Integer.TYPE;
            bVar.k().put("getProviderStatusAsync", Intrinsics.b(LocationProviderStatus.class, cls4) ? new wb.k("getProviderStatusAsync", c0792aArr, c1018n) : Intrinsics.b(LocationProviderStatus.class, Boolean.TYPE) ? new wb.h("getProviderStatusAsync", c0792aArr, c1018n) : Intrinsics.b(LocationProviderStatus.class, Double.TYPE) ? new wb.i("getProviderStatusAsync", c0792aArr, c1018n) : Intrinsics.b(LocationProviderStatus.class, Float.TYPE) ? new wb.j("getProviderStatusAsync", c0792aArr, c1018n) : Intrinsics.b(LocationProviderStatus.class, String.class) ? new wb.m("getProviderStatusAsync", c0792aArr, c1018n) : new wb.e("getProviderStatusAsync", c0792aArr, c1018n));
            if (Intrinsics.b(Integer.class, pb.m.class)) {
                kVar = new wb.f("watchDeviceHeading", new C0792a[0], new C1025v());
                obj2 = pb.m.class;
            } else {
                C0792a c0792a9 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Integer.class), bool));
                if (c0792a9 == null) {
                    obj2 = pb.m.class;
                    c0792a9 = new C0792a(new Db.M(C5142C.b(Integer.class), false, C1026w.f6736a));
                } else {
                    obj2 = pb.m.class;
                }
                C0792a[] c0792aArr2 = {c0792a9};
                C1027x c1027x = new C1027x();
                kVar = Intrinsics.b(Unit.class, cls4) ? new wb.k("watchDeviceHeading", c0792aArr2, c1027x) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("watchDeviceHeading", c0792aArr2, c1027x) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("watchDeviceHeading", c0792aArr2, c1027x) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("watchDeviceHeading", c0792aArr2, c1027x) : Intrinsics.b(Unit.class, String.class) ? new wb.m("watchDeviceHeading", c0792aArr2, c1027x) : new wb.e("watchDeviceHeading", c0792aArr2, c1027x);
            }
            bVar.k().put("watchDeviceHeading", kVar);
            C0792a c0792a10 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Integer.class), bool));
            if (c0792a10 == null) {
                cls2 = String.class;
                c0792a10 = new C0792a(new Db.M(C5142C.b(Integer.class), false, F.f6658a));
            } else {
                cls2 = String.class;
            }
            C0792a c0792a11 = (C0792a) c0794c.a().get(new Pair(C5142C.b(LocationOptions.class), bool));
            if (c0792a11 == null) {
                c0792a11 = new C0792a(new Db.M(C5142C.b(LocationOptions.class), false, G.f6659a));
            }
            bVar.k().put("watchPositionImplAsync", new wb.f("watchPositionImplAsync", new C0792a[]{c0792a10, c0792a11}, new H()));
            Object obj6 = obj2;
            if (Intrinsics.b(Integer.class, obj6)) {
                mVar = new wb.f("removeWatchAsync", new C0792a[0], new C1028y());
            } else {
                C0792a c0792a12 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Integer.class), bool));
                if (c0792a12 == null) {
                    c0792a12 = new C0792a(new Db.M(C5142C.b(Integer.class), false, C1029z.f6739a));
                }
                C0792a[] c0792aArr3 = {c0792a12};
                A a17 = new A();
                if (Intrinsics.b(Unit.class, cls4)) {
                    gVar = new wb.k("removeWatchAsync", c0792aArr3, a17);
                } else if (Intrinsics.b(Unit.class, Boolean.TYPE)) {
                    gVar = new wb.h("removeWatchAsync", c0792aArr3, a17);
                } else if (Intrinsics.b(Unit.class, Double.TYPE)) {
                    gVar = new wb.i("removeWatchAsync", c0792aArr3, a17);
                } else {
                    if (!Intrinsics.b(Unit.class, Float.TYPE)) {
                        cls3 = cls2;
                        mVar = Intrinsics.b(Unit.class, cls3) ? new wb.m("removeWatchAsync", c0792aArr3, a17) : new wb.e("removeWatchAsync", c0792aArr3, a17);
                        bVar.k().put("removeWatchAsync", mVar);
                        wb.d a18 = bVar.a("geocodeAsync");
                        String b12 = a18.b();
                        c0792a = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
                        if (c0792a != null) {
                            obj3 = obj6;
                            c0792a = new C0792a(new Db.M(C5142C.b(cls3), false, U.f6688a));
                        } else {
                            obj3 = obj6;
                        }
                        a18.c(new wb.o(b12, new C0792a[]{c0792a}, new I(null, this)));
                        wb.d a19 = bVar.a("reverseGeocodeAsync");
                        String b13 = a19.b();
                        c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls), bool));
                        if (c0792a2 == null) {
                            c0792a2 = new C0792a(new Db.M(C5142C.b(cls), false, J.f6664a));
                        }
                        a19.c(new wb.o(b13, new C0792a[]{c0792a2}, new K(null, this)));
                        wb.d a20 = bVar.a("enableNetworkProviderAsync");
                        a20.c(new wb.o(a20.b(), new C0792a[0], new L(null, this)));
                        C0792a[] c0792aArr4 = new C0792a[0];
                        B b14 = new B();
                        Object obj7 = obj;
                        bVar.k().put("hasServicesEnabledAsync", !Intrinsics.b(obj7, cls4) ? new wb.k("hasServicesEnabledAsync", c0792aArr4, b14) : Intrinsics.b(obj7, Boolean.TYPE) ? new wb.h("hasServicesEnabledAsync", c0792aArr4, b14) : Intrinsics.b(obj7, Double.TYPE) ? new wb.i("hasServicesEnabledAsync", c0792aArr4, b14) : Intrinsics.b(obj7, Float.TYPE) ? new wb.j("hasServicesEnabledAsync", c0792aArr4, b14) : Intrinsics.b(obj7, cls3) ? new wb.m("hasServicesEnabledAsync", c0792aArr4, b14) : new wb.e("hasServicesEnabledAsync", c0792aArr4, b14));
                        c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
                        if (c0792a3 == null) {
                            c0792a3 = new C0792a(new Db.M(C5142C.b(cls3), false, C.f6655a));
                        }
                        c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(LocationTaskOptions.class), bool));
                        if (c0792a4 == null) {
                            c0792a4 = new C0792a(new Db.M(C5142C.b(LocationTaskOptions.class), false, C1008d.f6705a));
                        }
                        C0792a[] c0792aArr5 = {c0792a3, c0792a4};
                        C1009e c1009e = new C1009e();
                        bVar.k().put("startLocationUpdatesAsync", !Intrinsics.b(Unit.class, cls4) ? new wb.k("startLocationUpdatesAsync", c0792aArr5, c1009e) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("startLocationUpdatesAsync", c0792aArr5, c1009e) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("startLocationUpdatesAsync", c0792aArr5, c1009e) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("startLocationUpdatesAsync", c0792aArr5, c1009e) : Intrinsics.b(Unit.class, cls3) ? new wb.m("startLocationUpdatesAsync", c0792aArr5, c1009e) : new wb.e("startLocationUpdatesAsync", c0792aArr5, c1009e));
                        obj4 = obj3;
                        if (Intrinsics.b(cls3, obj4)) {
                            C0792a c0792a13 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
                            if (c0792a13 == null) {
                                c0792a13 = new C0792a(new Db.M(C5142C.b(cls3), false, C1011g.f6716a));
                            }
                            C0792a[] c0792aArr6 = {c0792a13};
                            C1012h c1012h = new C1012h();
                            kVar2 = Intrinsics.b(Unit.class, cls4) ? new wb.k("stopLocationUpdatesAsync", c0792aArr6, c1012h) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("stopLocationUpdatesAsync", c0792aArr6, c1012h) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("stopLocationUpdatesAsync", c0792aArr6, c1012h) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("stopLocationUpdatesAsync", c0792aArr6, c1012h) : Intrinsics.b(Unit.class, cls3) ? new wb.m("stopLocationUpdatesAsync", c0792aArr6, c1012h) : new wb.e("stopLocationUpdatesAsync", c0792aArr6, c1012h);
                        } else {
                            kVar2 = new wb.f("stopLocationUpdatesAsync", new C0792a[0], new C1010f());
                        }
                        bVar.k().put("stopLocationUpdatesAsync", kVar2);
                        if (Intrinsics.b(cls3, obj4)) {
                            C0792a c0792a14 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
                            if (c0792a14 == null) {
                                c0792a14 = new C0792a(new Db.M(C5142C.b(cls3), false, C1014j.f6723a));
                            }
                            C0792a[] c0792aArr7 = {c0792a14};
                            C1015k c1015k = new C1015k();
                            kVar3 = Intrinsics.b(obj7, cls4) ? new wb.k("hasStartedLocationUpdatesAsync", c0792aArr7, c1015k) : Intrinsics.b(obj7, Boolean.TYPE) ? new wb.h("hasStartedLocationUpdatesAsync", c0792aArr7, c1015k) : Intrinsics.b(obj7, Double.TYPE) ? new wb.i("hasStartedLocationUpdatesAsync", c0792aArr7, c1015k) : Intrinsics.b(obj7, Float.TYPE) ? new wb.j("hasStartedLocationUpdatesAsync", c0792aArr7, c1015k) : Intrinsics.b(obj7, cls3) ? new wb.m("hasStartedLocationUpdatesAsync", c0792aArr7, c1015k) : new wb.e("hasStartedLocationUpdatesAsync", c0792aArr7, c1015k);
                        } else {
                            kVar3 = new wb.f("hasStartedLocationUpdatesAsync", new C0792a[0], new C1013i());
                        }
                        bVar.k().put("hasStartedLocationUpdatesAsync", kVar3);
                        c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
                        if (c0792a5 == null) {
                            c0792a5 = new C0792a(new Db.M(C5142C.b(cls3), false, C1016l.f6725a));
                        }
                        c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(GeofencingOptions.class), bool));
                        if (c0792a6 != null) {
                            obj5 = obj7;
                            c0792a6 = new C0792a(new Db.M(C5142C.b(GeofencingOptions.class), false, C1017m.f6726a));
                        } else {
                            obj5 = obj7;
                        }
                        C0792a[] c0792aArr8 = {c0792a5, c0792a6};
                        C1019o c1019o = new C1019o();
                        bVar.k().put("startGeofencingAsync", !Intrinsics.b(Unit.class, cls4) ? new wb.k("startGeofencingAsync", c0792aArr8, c1019o) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("startGeofencingAsync", c0792aArr8, c1019o) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("startGeofencingAsync", c0792aArr8, c1019o) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("startGeofencingAsync", c0792aArr8, c1019o) : Intrinsics.b(Unit.class, cls3) ? new wb.m("startGeofencingAsync", c0792aArr8, c1019o) : new wb.e("startGeofencingAsync", c0792aArr8, c1019o));
                        if (Intrinsics.b(cls3, obj4)) {
                            C0792a c0792a15 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
                            if (c0792a15 == null) {
                                c0792a15 = new C0792a(new Db.M(C5142C.b(cls3), false, C1020q.f6730a));
                            }
                            C0792a[] c0792aArr9 = {c0792a15};
                            C1021r c1021r = new C1021r();
                            Object obj8 = obj5;
                            kVar4 = Intrinsics.b(obj8, cls4) ? new wb.k("hasStartedGeofencingAsync", c0792aArr9, c1021r) : Intrinsics.b(obj8, Boolean.TYPE) ? new wb.h("hasStartedGeofencingAsync", c0792aArr9, c1021r) : Intrinsics.b(obj8, Double.TYPE) ? new wb.i("hasStartedGeofencingAsync", c0792aArr9, c1021r) : Intrinsics.b(obj8, Float.TYPE) ? new wb.j("hasStartedGeofencingAsync", c0792aArr9, c1021r) : Intrinsics.b(obj8, cls3) ? new wb.m("hasStartedGeofencingAsync", c0792aArr9, c1021r) : new wb.e("hasStartedGeofencingAsync", c0792aArr9, c1021r);
                        } else {
                            kVar4 = new wb.f("hasStartedGeofencingAsync", new C0792a[0], new C0132p());
                        }
                        bVar.k().put("hasStartedGeofencingAsync", kVar4);
                        if (Intrinsics.b(cls3, obj4)) {
                            C0792a c0792a16 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
                            if (c0792a16 == null) {
                                c0792a16 = new C0792a(new Db.M(C5142C.b(cls3), false, C1023t.f6733a));
                            }
                            C0792a[] c0792aArr10 = {c0792a16};
                            C1024u c1024u = new C1024u();
                            kVar5 = Intrinsics.b(Unit.class, cls4) ? new wb.k("stopGeofencingAsync", c0792aArr10, c1024u) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("stopGeofencingAsync", c0792aArr10, c1024u) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("stopGeofencingAsync", c0792aArr10, c1024u) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("stopGeofencingAsync", c0792aArr10, c1024u) : Intrinsics.b(Unit.class, cls3) ? new wb.m("stopGeofencingAsync", c0792aArr10, c1024u) : new wb.e("stopGeofencingAsync", c0792aArr10, c1024u);
                        } else {
                            kVar5 = new wb.f("stopGeofencingAsync", new C0792a[0], new C1022s());
                        }
                        bVar.k().put("stopGeofencingAsync", kVar5);
                        Map s11 = bVar.s();
                        EnumC5010e enumC5010e2 = EnumC5010e.ACTIVITY_ENTERS_FOREGROUND;
                        s11.put(enumC5010e2, new C5006a(enumC5010e2, new W()));
                        Map s12 = bVar.s();
                        EnumC5010e enumC5010e3 = EnumC5010e.ACTIVITY_ENTERS_BACKGROUND;
                        s12.put(enumC5010e3, new C5006a(enumC5010e3, new V()));
                        xb.c q10 = bVar.q();
                        AbstractC3901a.f();
                        return q10;
                    }
                    gVar = new wb.j("removeWatchAsync", c0792aArr3, a17);
                }
                mVar = gVar;
            }
            cls3 = cls2;
            bVar.k().put("removeWatchAsync", mVar);
            wb.d a182 = bVar.a("geocodeAsync");
            String b122 = a182.b();
            c0792a = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
            if (c0792a != null) {
            }
            a182.c(new wb.o(b122, new C0792a[]{c0792a}, new I(null, this)));
            wb.d a192 = bVar.a("reverseGeocodeAsync");
            String b132 = a192.b();
            c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls), bool));
            if (c0792a2 == null) {
            }
            a192.c(new wb.o(b132, new C0792a[]{c0792a2}, new K(null, this)));
            wb.d a202 = bVar.a("enableNetworkProviderAsync");
            a202.c(new wb.o(a202.b(), new C0792a[0], new L(null, this)));
            C0792a[] c0792aArr42 = new C0792a[0];
            B b142 = new B();
            Object obj72 = obj;
            bVar.k().put("hasServicesEnabledAsync", !Intrinsics.b(obj72, cls4) ? new wb.k("hasServicesEnabledAsync", c0792aArr42, b142) : Intrinsics.b(obj72, Boolean.TYPE) ? new wb.h("hasServicesEnabledAsync", c0792aArr42, b142) : Intrinsics.b(obj72, Double.TYPE) ? new wb.i("hasServicesEnabledAsync", c0792aArr42, b142) : Intrinsics.b(obj72, Float.TYPE) ? new wb.j("hasServicesEnabledAsync", c0792aArr42, b142) : Intrinsics.b(obj72, cls3) ? new wb.m("hasServicesEnabledAsync", c0792aArr42, b142) : new wb.e("hasServicesEnabledAsync", c0792aArr42, b142));
            c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
            if (c0792a3 == null) {
            }
            c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(LocationTaskOptions.class), bool));
            if (c0792a4 == null) {
            }
            C0792a[] c0792aArr52 = {c0792a3, c0792a4};
            C1009e c1009e2 = new C1009e();
            bVar.k().put("startLocationUpdatesAsync", !Intrinsics.b(Unit.class, cls4) ? new wb.k("startLocationUpdatesAsync", c0792aArr52, c1009e2) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("startLocationUpdatesAsync", c0792aArr52, c1009e2) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("startLocationUpdatesAsync", c0792aArr52, c1009e2) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("startLocationUpdatesAsync", c0792aArr52, c1009e2) : Intrinsics.b(Unit.class, cls3) ? new wb.m("startLocationUpdatesAsync", c0792aArr52, c1009e2) : new wb.e("startLocationUpdatesAsync", c0792aArr52, c1009e2));
            obj4 = obj3;
            if (Intrinsics.b(cls3, obj4)) {
            }
            bVar.k().put("stopLocationUpdatesAsync", kVar2);
            if (Intrinsics.b(cls3, obj4)) {
            }
            bVar.k().put("hasStartedLocationUpdatesAsync", kVar3);
            c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool));
            if (c0792a5 == null) {
            }
            c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(GeofencingOptions.class), bool));
            if (c0792a6 != null) {
            }
            C0792a[] c0792aArr82 = {c0792a5, c0792a6};
            C1019o c1019o2 = new C1019o();
            bVar.k().put("startGeofencingAsync", !Intrinsics.b(Unit.class, cls4) ? new wb.k("startGeofencingAsync", c0792aArr82, c1019o2) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("startGeofencingAsync", c0792aArr82, c1019o2) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("startGeofencingAsync", c0792aArr82, c1019o2) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("startGeofencingAsync", c0792aArr82, c1019o2) : Intrinsics.b(Unit.class, cls3) ? new wb.m("startGeofencingAsync", c0792aArr82, c1019o2) : new wb.e("startGeofencingAsync", c0792aArr82, c1019o2));
            if (Intrinsics.b(cls3, obj4)) {
            }
            bVar.k().put("hasStartedGeofencingAsync", kVar4);
            if (Intrinsics.b(cls3, obj4)) {
            }
            bVar.k().put("stopGeofencingAsync", kVar5);
            Map s112 = bVar.s();
            EnumC5010e enumC5010e22 = EnumC5010e.ACTIVITY_ENTERS_FOREGROUND;
            s112.put(enumC5010e22, new C5006a(enumC5010e22, new W()));
            Map s122 = bVar.s();
            EnumC5010e enumC5010e32 = EnumC5010e.ACTIVITY_ENTERS_BACKGROUND;
            s122.put(enumC5010e32, new C5006a(enumC5010e32, new V()));
            xb.c q102 = bVar.q();
            AbstractC3901a.f();
            return q102;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public final void d0(LocationRequest locationRequest, Integer requestId, q callbacks) {
        Intrinsics.checkNotNullParameter(locationRequest, "locationRequest");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        InterfaceC5121d interfaceC5121d = this.mLocationProvider;
        if (interfaceC5121d == null) {
            Intrinsics.v("mLocationProvider");
            interfaceC5121d = null;
        }
        g0 g0Var = new g0(callbacks);
        if (requestId != null) {
            this.mLocationCallbacks.put(requestId, g0Var);
            this.mLocationRequests.put(requestId, locationRequest);
        }
        try {
            interfaceC5121d.c(locationRequest, g0Var, Looper.getMainLooper());
            callbacks.b();
        } catch (SecurityException e10) {
            callbacks.a(new s(e10));
        }
    }

    public final void j0(int watchId, LocationResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Bundle a10 = androidx.core.os.c.a();
        a10.putBundle("location", (Bundle) response.toBundle$expo_location_release(Bundle.class));
        a10.putInt("watchId", watchId);
        f("Expo.locationChanged", a10);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        this.mAccuracy = accuracy;
    }

    @Override // Ea.a
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        if (requestCode != 42) {
            return;
        }
        O(resultCode);
        Fa.c cVar = this.mUIManager;
        if (cVar == null) {
            Intrinsics.v("mUIManager");
            cVar = null;
        }
        cVar.b(this);
    }

    @Override // Ea.f
    public void onHostDestroy() {
        q0();
        p0();
    }

    @Override // Ea.f
    public void onHostPause() {
        q0();
        p0();
    }

    @Override // Ea.f
    public void onHostResume() {
        o0();
        m0();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (event == null) {
            return;
        }
        if (event.sensor.getType() == 1) {
            float[] values = event.values;
            Intrinsics.checkNotNullExpressionValue(values, "values");
            this.mGravity = values;
        } else if (event.sensor.getType() == 2) {
            float[] values2 = event.values;
            Intrinsics.checkNotNullExpressionValue(values2, "values");
            this.mGeomagnetic = values2;
        }
        k0();
    }

    @Override // Ea.a
    public void onNewIntent(Intent intent) {
    }
}
