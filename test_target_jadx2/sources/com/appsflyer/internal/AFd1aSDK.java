package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFd1aSDK {
    public final long getMediationNetwork;

    public AFd1aSDK(long j10) {
        this.getMediationNetwork = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getMediationNetwork == ((AFd1aSDK) obj).getMediationNetwork;
    }

    public int hashCode() {
        long j10 = this.getMediationNetwork;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
