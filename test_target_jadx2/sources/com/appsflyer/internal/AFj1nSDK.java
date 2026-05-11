package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFj1nSDK implements SensorEventListener {
    private final String AFAdRevenueData;
    private final Executor component3;
    private long component4;
    private final String getCurrencyIso4217Code;
    private double getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private final float[][] component2 = new float[2][];
    private final long[] areAllFieldsValid = new long[2];

    AFj1nSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.getMonetizationNetwork = type;
        String name = sensor.getName();
        String str = BuildConfig.FLAVOR;
        name = name == null ? BuildConfig.FLAVOR : name;
        this.getCurrencyIso4217Code = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.AFAdRevenueData = str;
        this.getRevenue = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.component3 = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void G_(SensorEvent sensorEvent) {
        long j10 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component2;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.areAllFieldsValid[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.component2[1] = copyOf;
            this.areAllFieldsValid[1] = currentTimeMillis;
            this.getMediationNetwork = getCurrencyIso4217Code(fArr3, copyOf);
            return;
        }
        if (50000000 <= j10 - this.component4) {
            this.component4 = j10;
            if (Arrays.equals(fArr4, fArr)) {
                this.areAllFieldsValid[1] = currentTimeMillis;
                return;
            }
            double currencyIso4217Code = getCurrencyIso4217Code(fArr3, fArr);
            if (currencyIso4217Code > this.getMediationNetwork) {
                this.component2[1] = Arrays.copyOf(fArr, fArr.length);
                this.areAllFieldsValid[1] = currentTimeMillis;
                this.getMediationNetwork = currencyIso4217Code;
            }
        }
    }

    private static double getCurrencyIso4217Code(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < min; i10++) {
            d10 += StrictMath.pow(fArr[i10] - fArr2[i10], 2.0d);
        }
        return Math.sqrt(d10);
    }

    private static List<Float> getMediationNetwork(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    private Map<String, Object> getMonetizationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMonetizationNetwork));
        concurrentHashMap.put("sN", this.getCurrencyIso4217Code);
        concurrentHashMap.put("sV", this.AFAdRevenueData);
        float[] fArr = this.component2[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getMediationNetwork(fArr));
        }
        float[] fArr2 = this.component2[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getMediationNetwork(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean getRevenue(int i10, String str, String str2) {
        return this.getMonetizationNetwork == i10 && this.getCurrencyIso4217Code.equals(str) && this.AFAdRevenueData.equals(str2);
    }

    final void AFAdRevenueData(Map<AFj1nSDK, Map<String, Object>> map, boolean z10) {
        if (!AFAdRevenueData()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getMonetizationNetwork());
            return;
        }
        map.put(this, getMonetizationNetwork());
        if (z10) {
            int length = this.component2.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.component2[i10] = null;
            }
            int length2 = this.areAllFieldsValid.length;
            for (int i11 = 0; i11 < length2; i11++) {
                this.areAllFieldsValid[i11] = 0;
            }
            this.getMediationNetwork = 0.0d;
            this.component4 = 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1nSDK)) {
            return false;
        }
        AFj1nSDK aFj1nSDK = (AFj1nSDK) obj;
        return getRevenue(aFj1nSDK.getMonetizationNetwork, aFj1nSDK.getCurrencyIso4217Code, aFj1nSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        return this.getRevenue;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component3.execute(new Runnable() { // from class: com.appsflyer.internal.D
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1nSDK.this.G_(sensorEvent);
                }
            });
        } else {
            G_(sensorEvent);
        }
    }

    private boolean AFAdRevenueData() {
        return this.component2[0] != null;
    }
}
