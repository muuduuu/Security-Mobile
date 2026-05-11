package com.facebook.react.views.debuggingoverlay;

import K4.a;
import android.graphics.RectF;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.SimpleViewManager;
import j5.C3501b;
import j5.C3502c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@a(name = DebuggingOverlayManager.REACT_CLASS)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lj5/b;", "<init>", "()V", "view", BuildConfig.FLAVOR, "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", BuildConfig.FLAVOR, "receiveCommand", "(Lj5/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lj5/b;", "getName", "()Ljava/lang/String;", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebuggingOverlayManager extends SimpleViewManager<C3501b> {
    public static final String REACT_CLASS = "DebuggingOverlay";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C3501b createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C3501b(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018a, code lost:
    
        if (r11 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x018c, code lost:
    
        r21.setTraceUpdates(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f  */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void receiveCommand(C3501b view, String commandId, ReadableArray args) {
        String str;
        boolean z10;
        String str2;
        String str3;
        int i10;
        String str4;
        float f10;
        float f11;
        C3502c c3502c;
        ReadableArray readableArray;
        String str5;
        String str6;
        float f12;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        int hashCode = commandId.hashCode();
        String str7 = REACT_CLASS;
        if (hashCode != -1942063165) {
            String str8 = "width";
            String str9 = "y";
            String str10 = "x";
            if (hashCode == 1326903961) {
                String str11 = "x";
                if (commandId.equals("highlightTraceUpdates")) {
                    if (args == null) {
                        return;
                    }
                    boolean z11 = false;
                    ReadableArray array = args.getArray(0);
                    ArrayList arrayList = new ArrayList();
                    int size = array.size();
                    int i11 = 0;
                    boolean z12 = true;
                    while (true) {
                        if (i11 >= size) {
                            z10 = z12;
                            break;
                        }
                        ReadableMap map = array.getMap(i11);
                        ReadableMap map2 = map.getMap("rectangle");
                        if (map2 == null) {
                            ReactSoftExceptionLogger.logSoftException(str7, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field is null"));
                            z10 = z11;
                            break;
                        }
                        int i12 = map.getInt("id");
                        int i13 = map.getInt("color");
                        ArrayList arrayList2 = arrayList;
                        String str12 = str11;
                        try {
                            f10 = (float) map2.getDouble(str12);
                            str11 = str12;
                            try {
                                f11 = (float) map2.getDouble("y");
                                str2 = str7;
                            } catch (Exception e10) {
                                e = e10;
                                arrayList = arrayList2;
                                str2 = str7;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            arrayList = arrayList2;
                            str2 = str7;
                            str3 = str8;
                            i10 = size;
                            str11 = str12;
                        }
                        try {
                            float f13 = (float) (f10 + map2.getDouble(str8));
                            str3 = str8;
                            i10 = size;
                            try {
                                float f14 = (float) (f11 + map2.getDouble("height"));
                                C1944g0 c1944g0 = C1944g0.f22418a;
                                c3502c = new C3502c(i12, new RectF(c1944g0.b(f10), c1944g0.b(f11), c1944g0.b(f13), c1944g0.b(f14)), i13);
                                arrayList = arrayList2;
                            } catch (Exception e12) {
                                e = e12;
                                arrayList = arrayList2;
                            }
                            try {
                                arrayList.add(c3502c);
                                str4 = str2;
                            } catch (Exception e13) {
                                e = e13;
                                if (!(e instanceof NoSuchKeyException) ? true : e instanceof UnexpectedNativeTypeException) {
                                    throw e;
                                }
                                str4 = str2;
                                ReactSoftExceptionLogger.logSoftException(str4, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"));
                                z12 = false;
                                i11++;
                                str8 = str3;
                                size = i10;
                                str7 = str4;
                                z11 = false;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            arrayList = arrayList2;
                            str3 = str8;
                            i10 = size;
                            if (!(e instanceof NoSuchKeyException) ? true : e instanceof UnexpectedNativeTypeException) {
                            }
                        }
                        i11++;
                        str8 = str3;
                        size = i10;
                        str7 = str4;
                        z11 = false;
                    }
                }
            } else if (hashCode == 1385348555 && commandId.equals("highlightElements")) {
                if (args == null) {
                    return;
                }
                ReadableArray array2 = args.getArray(0);
                ArrayList arrayList3 = new ArrayList();
                int size2 = array2.size();
                int i14 = 0;
                boolean z13 = true;
                while (i14 < size2) {
                    ReadableMap map3 = array2.getMap(i14);
                    try {
                        float f15 = (float) map3.getDouble(str10);
                        float f16 = (float) map3.getDouble(str9);
                        str5 = str9;
                        str6 = str10;
                        try {
                            f12 = (float) (f15 + map3.getDouble("width"));
                            readableArray = array2;
                        } catch (Exception e15) {
                            e = e15;
                            readableArray = array2;
                        }
                        try {
                            float f17 = (float) (f16 + map3.getDouble("height"));
                            C1944g0 c1944g02 = C1944g0.f22418a;
                            arrayList3.add(new RectF(c1944g02.b(f15), c1944g02.b(f16), c1944g02.b(f12), c1944g02.b(f17)));
                        } catch (Exception e16) {
                            e = e16;
                            if (!(e instanceof NoSuchKeyException ? true : e instanceof UnexpectedNativeTypeException)) {
                                throw e;
                            }
                            ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                            z13 = false;
                            i14++;
                            array2 = readableArray;
                            str9 = str5;
                            str10 = str6;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        readableArray = array2;
                        str5 = str9;
                        str6 = str10;
                    }
                    i14++;
                    array2 = readableArray;
                    str9 = str5;
                    str10 = str6;
                }
                if (z13) {
                    view.setHighlightedElementsRectangles(arrayList3);
                    return;
                }
                return;
            }
            str = REACT_CLASS;
        } else {
            str = REACT_CLASS;
            if (commandId.equals("clearElementsHighlights")) {
                view.b();
                return;
            }
        }
        ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Received unexpected command in DebuggingOverlayManager"));
    }
}
