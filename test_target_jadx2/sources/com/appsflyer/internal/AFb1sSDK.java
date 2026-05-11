package com.appsflyer.internal;

import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", BuildConfig.FLAVOR, "Lcom/appsflyer/internal/AFh1mSDK;", Keys.EVENT, BuildConfig.FLAVOR, "rawData", "<init>", "(Lcom/appsflyer/internal/AFh1mSDK;[B)V", BuildConfig.FLAVOR, "afInfoLog", "()V", "AFAdRevenueData", "Lcom/appsflyer/internal/AFh1mSDK;", "getMonetizationNetwork", "getRevenue", "[B"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFb1sSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final AFh1mSDK getMonetizationNetwork;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private final byte[] AFAdRevenueData;

    public AFb1sSDK(AFh1mSDK aFh1mSDK, byte[] bArr) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        this.getMonetizationNetwork = aFh1mSDK;
        this.AFAdRevenueData = bArr;
    }

    public final void afInfoLog() {
        try {
            Map map = AFa1hSDK.f20116d;
            Object obj = map.get(-1994295490);
            if (obj == null) {
                obj = ((Class) AFa1hSDK.getRevenue((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 88, (char) (58271 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getDeclaredConstructor(null);
                map.put(-1994295490, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            Object[] objArr = {this.getMonetizationNetwork, this.AFAdRevenueData};
            Object obj2 = map.get(2113693083);
            if (obj2 == null) {
                obj2 = ((Class) AFa1hSDK.getRevenue(136 - AndroidCharacter.getMirror('0'), (char) (58271 - (ViewConfiguration.getPressedStateDuration() >> 16)), 37 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("getMonetizationNetwork", AFh1mSDK.class, byte[].class);
                map.put(2113693083, obj2);
            }
            ((Method) obj2).invoke(newInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
